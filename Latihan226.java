import java.util.Scanner;

public class Latihan226 {
    public static void main(String[] args) {
        
        Scanner input26 = new Scanner(System.in);

        double hargaKamus = 10000;
        double hargaNovel = 7000;
        double hargaBukuLain = 4000;

        System.out.print("Masukkan jenis buku (kamus/novel/lain): ");
        String jenisBuku = input26.nextLine().toLowerCase();

        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = input26.nextInt();

        double totalHarga = 0;
        double totalDiskon = 0;

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            double diskon = 0;
            if (jumlahBuku > 2) {
                diskon = 0.10 + 0.02;
            } else {
                diskon = 0.10; 
            }
            totalDiskon = hargaKamus * jumlahBuku * diskon;
            totalHarga = hargaKamus * jumlahBuku - totalDiskon;
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            double diskon = 0;
            if (jumlahBuku > 3) {
                diskon = 0.07 + 0.02; 
            } else {
                diskon = 0.07 + 0.01; 
            }
            totalDiskon = hargaNovel * jumlahBuku * diskon;
            totalHarga = hargaNovel * jumlahBuku - totalDiskon;
        } else {
            double diskon = 0;
            if (jumlahBuku > 3) {
                diskon = 0.05; 
            } else {
                diskon = 0; 
            }
            totalDiskon =  hargaBukuLain * jumlahBuku * diskon;
            totalHarga = hargaBukuLain * jumlahBuku - totalDiskon;
        }

        System.out.println("Total diskon yang diterima: " + (int) totalDiskon);
        System.out.println("Total harga untuk " + (int) jumlahBuku + " buku " + jenisBuku + ": " + (int) totalHarga);
        
    }
}
