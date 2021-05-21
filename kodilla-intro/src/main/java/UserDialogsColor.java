import java.util.Scanner;
public class UserDialogsColor {
    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wpisz pierwszą literę koloru:");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "W":
                    return "White";
                case "R":
                    return "Red";
                case "O":
                    return "Orange";
                case "B":
                    return "Blue";
                default:
                    System.out.println("Wybierz inną literę");
            }
        }
    }
    public static void main(String[] args) {
        String result = UserDialogsColor.getUserSelection();
        System.out.println(result);
    }
}
