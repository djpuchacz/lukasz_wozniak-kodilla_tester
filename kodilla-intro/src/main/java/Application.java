public class Application {
        String name;
        double age;
        double height;

        public Application(String name, double age, double height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public void checkAge() {
            if (age > 30) {
                System.out.print("User is older than 30");
            }    else {
                    System.out.print("User is 30 (or younger)");
                }
        }
        public void checkHeight() {
             if (height > 160) {
                 System.out.print(" and higher than 160cm.");
             }    else {
                    System.out.print(" and is 160cm (or shorter).");
                 }
        }

        public static void main (String[] args){
            Application application = new Application("Adam", 20,159);
            System.out.println(application.name + " " + application.age + " " + application.height);
            application.checkAge();
            application.checkHeight();
        }
}