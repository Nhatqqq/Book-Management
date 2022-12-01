import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TextBookManagement textbookFunction = new TextBookManagement();
        NovelManagement novelFunction = new NovelManagement();
        int mainchoice = 0;
        Mainmenu: do {
            mainmenu();
            mainchoice = SelectChoice();
            System.out.println("");
            switch (mainchoice) {
                case 1:
                    textbookFunction.textbookMenu();
                    int textbookChoice = SelectChoice();
                    System.out.println("");
                    switch (textbookChoice) {
                        case 1:
                            textbookFunction.showAll();
                            System.out.println("");
                            break;
                        case 2:
                            textbookFunction.add();
                            System.out.println("");
                            break;
                        case 3:
                            textbookFunction.update();
                            System.out.println("");
                            break;
                        case 4:
                            textbookFunction.delete();
                            System.out.println("");
                            break;
                        case 5:
                            textbookFunction.search();
                            System.out.println("");
                            break;
                        case 6:
                            System.out.println("");
                            continue Mainmenu;
                        default:
                            message();
                            break;
                    }
                    break;
                case 2:
                    novelFunction.novelMenu();
                    int novelChoice = SelectChoice();
                    System.out.println("");
                    switch (novelChoice) {
                        case 1:
                            novelFunction.showAll();
                            System.out.println("");
                            break;
                        case 2:
                            novelFunction.add();
                            System.out.println("");
                            break;
                        case 3:
                            novelFunction.update();
                            System.out.println("");
                            break;
                        case 4:
                            novelFunction.delete();
                            System.out.println("");
                            break;
                        case 5:
                            novelFunction.search();
                            System.out.println("");
                            break;
                        case 6:
                            System.out.println("");
                            continue Mainmenu;
                        default:
                            message();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the system!");
                    return;
                default:
                    message();
                    break;
            }
        } while (mainchoice != 3);
    }

    public static void mainmenu() {
        System.out.println("Product Management System");
        System.out.println("--------------------------");
        System.out.println("1. Text Book Management");
        System.out.println("2. Novel Management");
        System.out.println("3. Exit");
        System.out.println("");
    }

    public static int SelectChoice() {
        boolean check = true;
        int choice = 0;
        do {
            System.out.print("Enter your choice: ");
            try {
                choice = sc.nextInt();
                check = false;
            } catch (InputMismatchException e) {
                System.out.println("please enter the number of the function!");
                sc.nextLine();
            }
        } while (check);
        return choice;
    }

    public static void message() {
        System.out.println("Please enter the number of the function!");
        System.out.println("-----------------------------------------------");
        System.out.println("");
    }
}
