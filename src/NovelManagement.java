import java.util.*;

public class NovelManagement extends BookManagement {
    private static Scanner sc = new Scanner(System.in);
    private ArrayList<Novel> novelList = new ArrayList<Novel>();

    @Override
    public void add() {
        try {
            System.out.println("Add Product Information");
            String id = inputID();
            for (int i = 0; i < novelList.size(); i++) {
                if (novelList.get(i).getId().equals(id)) {
                    System.out.println("Product already exist!");
                    System.out.println("-----------------------------------------------");
                    return;
                }
            }
            try {
                String name = inputName();
                float price = inputPrice();
                String author = inputAuthor();
                String genre = inputGenre();
                Novel novel = new Novel(id, name, price, author, genre);
                novelList.add(novel);
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
        System.out.println("------------------Novel List------------------");
        for (Novel novel : novelList) {
            System.out.println("ID             :      "   +   novel.getId());
            System.out.println("Product name   :      "   +   novel.getName());
            System.out.println("Product price  :      "   +   novel.getPrice());
            System.out.println("Product author :      "   +   novel.getAuthor());
            System.out.println("Product genre  :      "   +   novel.getGenre());
            System.out.println("-----------------------------------------------");
            System.out.println("");
        }
    }

    @Override
    public void update() {
        String n = selectID();
        for (int i = 0; i < novelList.size(); i++) {
            if (novelList.get(i).getId().equalsIgnoreCase(n)) {
                System.out.println("Update Product Information");
                try {
                    novelList.get(i).setName(inputName());
                    novelList.get(i).setPrice(inputPrice());
                    novelList.get(i).setAuthor(inputAuthor());
                    novelList.get(i).setGenre(inputGenre());
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
        for (int i = 0; i < novelList.size(); i++) {
            if (novelList.get(i).getId().equalsIgnoreCase(n)) {
                Novel novel = novelList.get(i);
                novelList.remove(novel);
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
        for (int i = 0; i < novelList.size(); i++) {
            if (novelList.get(i).getId().equalsIgnoreCase(n)) {
                System.out.println("ID             :      "   +   novelList.get(i).getId());
                System.out.println("Product name   :      "   +   novelList.get(i).getName());
                System.out.println("Product price  :      "   +   novelList.get(i).getPrice());
                System.out.println("Product author :      "   +   novelList.get(i).getAuthor());
                System.out.println("Product subject:      "   +   novelList.get(i).getGenre());
                return;
            }
        }
        System.out.println("Product does not exist!!!");
        System.out.println("-----------------------------------------------");
    }
    
    public void novelMenu() {
        System.out.println("Novel Management System");
        System.out.println("--------------------------");
        System.out.println("1. Show list of Novel");
        System.out.println("2. Add new Novel");
        System.out.println("3. Update the Novel");
        System.out.println("4. Delete the Novel");
        System.out.println("5. Search for the Novel");
        System.out.println("6. Back to Main Menu");
        System.out.println("");
    }
    
    public String inputGenre() {
        System.out.print("Input genre: ");
        return sc.nextLine();
    }
}
