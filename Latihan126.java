public class Latihan126 {
     public static void main(String[] args) {

        int bil1 = 28;
        int bil2 = 54;
        int bil3 = 15;
        int terbesar;

        if (bil1 > bil2) {
            if (bil1 > bil2) {
                terbesar = bil1;
            System.out.println(bil1 + " adalah bilangan terbesar.");
            }
        } else if (bil2 > bil1) {
            if (bil2 > bil3) {
                terbesar = bil2;
                System.out.println(bil2 + " adalah bilangan terbesar.");
            }
        } else {
            terbesar = bil3;
            System.out.println(bil3 + " adalah bilangan terbesar.");
        }
    }
}
