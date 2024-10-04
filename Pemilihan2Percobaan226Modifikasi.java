import java.util.Scanner;

public class Pemilihan2Percobaan226Modifikasi {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        double diskon;
        int harga;
        double total_bayar;

        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("-----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");

        int pilihan_menu = input26.nextInt();
        input26.nextLine();
        System.out.print("Apakah punya member (y/n)? = ");
        String member = input26.nextLine();
        System.out.print("Jenis Pembayaran (QRIS/Non QRIS)? = ");
        String jenis_pembayaran = input26.nextLine();
        System.out.println("-------------------------------------");

        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);
            
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga ice tea = " + harga);

        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga bundling = " + harga);

        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
            
        } else if (member.equalsIgnoreCase("n")) { 
            total_bayar = harga; 
            System.out.println("Total bayar = " + total_bayar); 
            
        } else { 
            System.out.println("Member tidak valid"); 
            return;
        }

        if (jenis_pembayaran.equalsIgnoreCase("QRIS")) { 
            total_bayar -= 1000;
            System.out.println("Mendapat Potongan 1000"); 
        }

        System.out.println("Total bayar akhir = " + total_bayar); 

        System.out.println("-------------------------------------");
        
    }
}