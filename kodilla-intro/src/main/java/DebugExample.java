public class DebugExample {
    public static void main(String[] args) {
        int firstNumber = 22;
        int secondNumber = 12;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        if (firstNumber > secondNumber) {
            subtractAndDisplay(firstNumber, secondNumber);
        }
        else {
                sumAndDisplay(firstNumber, secondNumber);
            }
    }

    public static void sumAndDisplay (int a, int b){
        int result = a + b;
        System.out.println(result);
    }
    public static void subtractAndDisplay (int a, int b){
        int result = a - b;
        System.out.println(result);
    }
}
