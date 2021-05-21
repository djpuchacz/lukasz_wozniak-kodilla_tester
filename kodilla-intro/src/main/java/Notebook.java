public class Notebook {
        int weight;//atrybuty klasy
        int price;
        int year;

        public Notebook(int weight, int price, int year) {
                this.weight = weight; //przypisał wartości argumentów, które zostały mu przekazane, do atrybutów klasy.
                this.price = price; //this wskazuje, że w ramach konstruktora chcemy odwołać się do atrybutów klasy.
                this.year = year;
        }

        public void checkPrice() {
                if (this.price < 600) {
                        System.out.println("This notebook is very cheap.");
                } else if (this.price >= 600 && this.price <= 1000) {
                        System.out.println("The price is good.");
                } else {
                        System.out.println("This notebook is expensive");
                }
        }

        public void checkWeight() {
                if (this.weight < 600) {
                        System.out.println("This notebook is light");
                } else if (this.weight >= 600 && this.weight <= 1600) {
                        System.out.println("The notebook is not so heavy");
                } else {
                        System.out.println("This notebook is to heavy");
                }
        }

        public void checkProfitability() {
                if (this.year <= 2012 && this.price <= 600) {
                        System.out.println("This notebook is oldest & cheapest");
                } else if (this.year <= 2016 && this.price <= 1000) {
                        System.out.println("This notebook is medium");
                } else {
                        System.out.println("This notebook is expensive and quite new");
                }
        }
}
        /*public static void main(String[] args) {
                Notebook notebook = new Notebook(600, 1000, 2016);
                System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
                notebook.checkPrice();
                notebook.checkWeight();
                notebook.checkProfitability();

                Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
                System.out.println(heavyNotebook.weight + " " + heavyNotebook.price +" " + heavyNotebook.year);
                heavyNotebook.checkPrice();
                heavyNotebook.checkWeight();
                heavyNotebook.checkProfitability();

                Notebook oldNotebook = new Notebook(1600, 500, 2012);
                System.out.println(oldNotebook.weight + " " + oldNotebook.price+ " "+ oldNotebook.year);
                oldNotebook.checkPrice();
                oldNotebook.checkWeight();
                oldNotebook.checkProfitability();

        } */