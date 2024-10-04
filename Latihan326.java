import java.util.Scanner;

public class Latihan326 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.print("Masukkan merk (Converse, Skecher, Nike): ");
        String merk = input26.nextLine();

        System.out.print("Masukkan kategori (SlipOn, HighTop, Woman, Man, Kids, Adult): ");
        String kategori = input26.nextLine();

        System.out.print("Masukkan ukuran: ");
        int ukuran = input26.nextInt();
        
        input26.nextLine();

        int harga = 0;

        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("SlipOn")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 800_000;
                }
            } else if (kategori.equalsIgnoreCase("HighTop")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1_200_000;
                }
            }
        } else if (merk.equalsIgnoreCase("Skecher")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuran >= 36 && ukuran <= 41) {
                    harga = 1_000_000;
                }
            } else if (kategori.equalsIgnoreCase("Man")) {
                if (ukuran >= 41 && ukuran <= 44) {
                    harga = 1_800_000;
                }
            }
        } else if (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 750_000;
                }
            } else if (kategori.equalsIgnoreCase("Adult")) {
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1_500_000;
                }
            }
        }

        if (harga > 0) {
            System.out.println("Harga sepatu: Rp " + harga);
        } else {
            System.out.println("Data yang Anda masukkan tidak valid atau tidak ada harga yang sesuai.");
        }
    }
}