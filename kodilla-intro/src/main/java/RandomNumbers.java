// Importowanie biblioteki potrzebnej do losowania liczb
import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        Random r = new Random();
        int min = 30;
        int max = 0;
        int sum = 0;
        while(sum < 5000) {
            int a = r.nextInt(31); //losowanie liczby z przedziału 0-30
            if (a > max) max = a;
            if (a < min) min = a;
            sum = sum + a;
        }
            System.out.println(sum);
            System.out.println("Największa liczba to " + max + ",");
            System.out.println("Najmniejsza liczba to " + min + ".");

    }
}







