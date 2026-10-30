
public class Entornos2 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 5; i++) {
           //HUECO 1
            if (i % 2 == 0) {
                total += i * 2;
            } else {
                //HUECO 2
            }

            System.out.println("i = " + i + " - total = " + total);
        }

        System.out.println("Total final: " + total);
    }
}
