import java.util.Scanner;

public class Pemilihan2Percobaan226Modifikasi {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.println("Masukkan Sudut 1");
        float sudut1 = input26.nextFloat();

        System.out.println("Masukkan Sudut 2");
        float sudut2 = input26.nextFloat();

        System.out.println("Masukkan Sudut 3");
        float sudut3 = input26.nextFloat();

        float totalSudut;
        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) 
                System.out.println("Segitia tersebut adalah segitiga siku-siku");
                if ((sudut1 == 60) || (sudut2 == 60) || (sudut3 == 60)) {
                    System.out.println("Segitiga tersebut adalah segitiga sama sisi");
                } if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3)) {
                    System.out.println("Segitiga tersebut adalah segitiga sama kaki");
                } else {
                    System.out.println("Segitiga tersebut adalah segitiga sembarang");
                }
        }  else
            System.out.println("Bukan Segitiga");
        }
    }
