import java.util.Scanner;

public class Pemilihan2Percobaan126 {

    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.println("Masukkan Tahun");
        int tahun = input26.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
                System.out.println("Tahun Kabisat");
            } else
                System.out.println("Bukan Tahun Kabisat");
        }
    }