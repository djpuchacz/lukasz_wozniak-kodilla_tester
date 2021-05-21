import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Podaj swoje imie: ");
        name = scanner.next();
        System.out.println("Hello " + name);
        System.out.println("Lukasz");
        System.out.println(35);
        System.out.println('W');
    }
}
