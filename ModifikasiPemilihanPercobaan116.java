import java.util.Scanner;

public class ModifikasiPemilihanPercobaan116 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input26.nextInt();
        String hasil;
        hasil = (angka % 2 == 0) ? "Bilangan genap" : "Bilangan ganjil";
        System.out.println("Angka " +angka+ " adalah " +hasil);
        
    }
}
