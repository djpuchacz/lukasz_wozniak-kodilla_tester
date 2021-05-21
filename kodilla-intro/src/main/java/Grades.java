public class Grades {
    private int[] grades;
    private int size;

    public Grades() { //konstruktor
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int last() {
        return this.grades[size-1];
    }

    public double sum() {
        double result = 0;
        for (int i = 0;i < size; i++ ){
            result = result + grades[i];
        }
        result = result / size;
        return result;

    }
    public static void main(String[] args) {
        Grades feattwo = new Grades();
        feattwo.add(5);
        feattwo.add(4);
        feattwo.add(3);
        feattwo.add(2);
        int result = feattwo.last();
        System.out.println(result);
        double summary = feattwo.sum();
        System.out.println(summary);
    }
}

