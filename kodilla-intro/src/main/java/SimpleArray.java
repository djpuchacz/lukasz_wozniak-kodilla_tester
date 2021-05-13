public class SimpleArray {
    public static void main(String[] args) {
        String[] cars = new String[] {"Opel", "Ford", "Peugeot", "Audi", "BMW"};
        String myFavourite = cars[3];
        System.out.println(myFavourite);
        int numberOfElements = cars.length;
        System.out.println("Moja tablica zawiera " +numberOfElements+ " elementów");
    }

}
