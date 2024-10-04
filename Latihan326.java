import java.util.Scanner;

public class Latihan326 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.print("Masukkan merk (Converse, Skecher, Nike): ");
        String merk = input26.nextLine();

        String kategori;
        int ukuran;
        int harga = 0;

        if (merk.equalsIgnoreCase("Converse")) {
            System.out.print("Masukkan kategori (SlipOn, HighTop): ");
            kategori = input26.nextLine();
            
            if (kategori.equalsIgnoreCase("SlipOn")) {
                System.out.print("Masukkan ukuran Slip On 36 - 40: ");
                ukuran = input26.nextInt();
                
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 800_000;
                }
            } else if (kategori.equalsIgnoreCase("HighTop")) {
                System.out.print("Masukkan ukuran High Top 40 - 44: ");
                ukuran = input26.nextInt();
                
                if (ukuran >= 40 && ukuran <= 44) {
                    harga = 1_200_000;
                }
            }
        } else if (merk.equalsIgnoreCase("Skecher")) {
            System.out.print("Masukkan kategori (Woman, Man): ");
            kategori = input26.nextLine();
            
            if (kategori.equalsIgnoreCase("Woman")) {
                System.out.print("Masukkan ukuran Woman 36 - 41: ");
                ukuran = input26.nextInt();
                
                if (ukuran >= 36 && ukuran <= 41) {
                    harga = 1_000_000;
                }
            } else if (kategori.equalsIgnoreCase("Man")) {
                System.out.print("Masukkan ukuran Man 41 - 44: ");
                ukuran = input26.nextInt();
                
                if (ukuran >= 41 && ukuran <= 44) {
                    harga = 1_800_000;
                }
            }
        } else if (merk.equalsIgnoreCase("Nike")) {
            System.out.print("Masukkan kategori (Kids, Adult): ");
            kategori = input26.nextLine();
            
            if (kategori.equalsIgnoreCase("Kids")) {
                System.out.print("Masukkan ukuran Kids 36 - 40: ");
                ukuran = input26.nextInt();
                
                if (ukuran >= 36 && ukuran <= 40) {
                    harga = 750_000;
                }
            } else if (kategori.equalsIgnoreCase("Adult")) {
                System.out.print("Masukkan ukuran Adult 40 - 44: ");
                ukuran = input26.nextInt();
                
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

        input26.close();
    }
}
