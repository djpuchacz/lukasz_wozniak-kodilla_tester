public class LeapYear {
    public static void main(String[] args) {
        int rok = 2005;

        System.out.println(rok);


        if (rok % 4 == 0 && rok % 100 != 0 || rok % 400 == 0) {
            System.out.println("rok przestepny");
        } else {
            System.out.println("rok nie przestepny");
        }
    }
}
