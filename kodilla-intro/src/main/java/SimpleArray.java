public class SimpleArray {
    public static void main(String[] args) {
        String[] cars = new String[] {"Opel", "Ford", "Peugeot", "Audi", "BMW"};
        String myFavourite = cars[3];
        System.out.println(myFavourite);
        int numberOfElements = cars.length;
        System.out.println("Moja tablica aut zawiera " +numberOfElements+ " elementów");

        String [] clubs = new String[3];
        clubs[0] = "Real Madrid";
        clubs[1] = "F.C. Liverpool";
        clubs[2] = "LKS";
        String myFavouriteClub = clubs[0];
        System.out.println(myFavouriteClub);

        int numberOfClubs = clubs.length;
        System.out.println("Moja tablica klubów zawiera " +numberOfClubs+ " elementów");
    }

}
