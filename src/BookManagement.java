import java.util.*;

public abstract class BookManagement {
    private static Scanner sc = new Scanner(System.in);

    public abstract void add();
    public abstract void showAll();
    public abstract void update();
    public abstract void delete();
    public abstract void search();
    
    public String selectID() {
        System.out.print("Input ID of the Product: ");
        return sc.nextLine();
    }
    public String inputID() {
        System.out.print("Input ID: ");
        return sc.nextLine();
    }

    public String inputName() {
        System.out.print("Input name: ");
        return sc.nextLine();
    }

    public float inputPrice() {
        System.out.print("Input price: ");
        return Float.parseFloat(sc.nextLine());
    }

    public String inputAuthor() {       
        System.out.print("Input author: ");
        return sc.nextLine();
    }
}
