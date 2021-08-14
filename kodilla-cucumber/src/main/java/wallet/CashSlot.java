package wallet;

public class CashSlot {
    private int contents;

    public int getContents() {  //zwracana jest zawartość slotu z pieniędzmi,
        return contents;
    }

    public void dispense(int amount) { //uzupełniany jest slot z pieniędzmi określona kwotą
        this.contents = amount;
    }
}
