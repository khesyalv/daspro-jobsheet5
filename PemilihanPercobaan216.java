import java.util.Scanner;
public class PemilihanPercobaan216 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);
        System.out.println("Nilai uas    :");
        float uas = input16.nextFloat();
        System.out.println("Nilai uts    :");
        float uts = input16.nextFloat();
        System.out.println("Nilai kuis    :");
        float kuis = input16.nextFloat();
        System.out.println("Nilai tugas   :");
        float tugas = input16.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String massage = total < 65 ? "Remidi" : "Tidak Pemidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + massage);
    }
}