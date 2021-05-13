public class Notebook {
        int weight;
        int price;
        int year;

        public Notebook(int weight, int price, int year) {
                this.weight = weight;
                this.price = price;
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
                if (this.year <=2012 && this.price <= 600) {
                        System.out.println("This notebook is oldest & cheapest");
                }  else if (this.year <= 2016 && this.price <= 1000) {
                        System.out.println("This notebook is medium");
                }        else {
                        System.out.println("This notebook is expensive and quite new");
                }
        }
}