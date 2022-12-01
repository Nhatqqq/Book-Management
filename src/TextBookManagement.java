import java.util.*;

public class TextBookManagement extends BookManagement {
    private static Scanner sc = new Scanner(System.in);
    private ArrayList<TextBook> textbookList = new ArrayList<TextBook>();

    @Override
    public void add() {
        try {
            System.out.println("Add Product Information");
            String id = inputID();
            for (int i = 0; i < textbookList.size(); i++) {
                if (textbookList.get(i).getId().equalsIgnoreCase(id)) {
                    System.out.println("ID already exist!");
                    System.out.println("-----------------------------------------------");
                    return;
                }
            }
            try {
                String name = inputName();
                float price = inputPrice();
                String author = inputAuthor();
                String subject = inputSubject();
                TextBook textBook = new TextBook(id, name, price, author, subject);
                textbookList.add(textBook);
                System.out.println("");
                System.out.println("Add new Product Successfully!");
            } catch(NumberFormatException e) {
                System.out.println("please enter correct input!");
            }
        } catch(Exception e) {
            System.out.println("Please enter the field!");
        }
    }

    @Override
    public void showAll() {
        System.out.println("----------------Text Book List-----------------");
        for (TextBook textBook : textbookList) {
            System.out.println("ID             :      "   +   textBook.getId());
            System.out.println("Product name   :      "   +   textBook.getName());
            System.out.println("Product price  :      "   +   textBook.getPrice());
            System.out.println("Product author :      "   +   textBook.getAuthor());
            System.out.println("Product subject:      "   +   textBook.getSubject());
            System.out.println("-----------------------------------------------");
            System.out.println("");
        }
    }

    @Override
    public void update() {
        String n = selectID();
        for (int i = 0; i < textbookList.size(); i++) {
            if(textbookList.get(i).getId().equalsIgnoreCase(n)) {
                System.out.println("Update Product Information");
                try {
                    textbookList.get(i).setName(inputName());
                    textbookList.get(i).setPrice(inputPrice());
                    textbookList.get(i).setAuthor(inputAuthor());
                    textbookList.get(i).setSubject(inputSubject());
                } catch(NumberFormatException e) {
                    System.out.println("please enter correct input!");
                    return;
                }
                System.out.println("Update Successfully!!!");
                System.out.println("-----------------------------------------------");
                return;
            }
        }
        System.out.println("Product does not exist!!!");
        System.out.println("-----------------------------------------------");
    }

    @Override
    public void delete() {
        String n = selectID();
        for (int i = 0; i < textbookList.size(); i++) {
            if (textbookList.get(i).getId().equalsIgnoreCase(n)) {
                TextBook textbook = textbookList.get(i);
                textbookList.remove(textbook);
                System.out.println("Delete Successfully!!!");
                System.out.println("-----------------------------------------------");
                return;
            }
        }
        System.out.println("Product does not exist!!!");
        System.out.println("-----------------------------------------------");
    }

    @Override
    public void search() {
        String n = selectID();
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < textbookList.size(); i++) {
            if (textbookList.get(i).getId().equalsIgnoreCase(n)) {
                System.out.println("ID             :      "   +   textbookList.get(i).getId());
                System.out.println("Product name   :      "   +   textbookList.get(i).getName());
                System.out.println("Product price  :      "   +   textbookList.get(i).getPrice());
                System.out.println("Product author :      "   +   textbookList.get(i).getAuthor());
                System.out.println("Product subject:      "   +   textbookList.get(i).getSubject());
                return;
            }
        }
        System.out.println("Product does not exist!!!");
        System.out.println("-----------------------------------------------");
    }
    
    public void textbookMenu() {
        System.out.println("Text Book Management System");
        System.out.println("--------------------------");
        System.out.println("1. Show list of Text Book");
        System.out.println("2. Add new Text Book");
        System.out.println("3. Update the Text Book");
        System.out.println("4. Delete the Text Book");
        System.out.println("5. Search for the Text Book");
        System.out.println("6. Back to Main Menu");
        System.out.println("");
    }
    
    public String inputSubject() {
        System.out.print("Input subject: ");
        return sc.nextLine();
    }
}
