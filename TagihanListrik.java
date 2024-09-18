import java.util.Scanner;

public class TagihanListrik {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float jmlWatt;
        int tarifWatt = 1500, totalBayar;

        //input kWh pelanggan
        System.out.print("Masukkan jumlah kWh anda: ");
        jmlWatt = input.nextFloat();

        //hitung totalBayar
        totalBayar = (int) (jmlWatt * tarifWatt);
        //cast (int) digunakan untuk memaksa output menjadi integer

        //totalBayar
        System.out.println("Total tagihan listrik anda adalah sebesar: Rp. " + totalBayar);

        //pengecekan listrik
        if (jmlWatt>500) {
            System.out.println("Penggunaan listrik anda melebihi 500kWh.");
        }
    }
}