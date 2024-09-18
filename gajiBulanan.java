import java.util.Scanner;

public class gajiBulanan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float jmlJamKerja, bonus = 10/100f, pajak = 5/100f;
        int upahPerJam, gajiBersih, gajiBonus, gajiTotal;
        
        //input jmlJamKerja & upahPerJam
        System.out.print("Masukkan jumlah jam kerja karyawan: ");
        jmlJamKerja = input.nextFloat();
        System.out.print("Masukkan nilai upah per jam (dalam Rupiah): ");
        upahPerJam = input.nextInt();

        //hitung dan menampilkan gajiBersih
        gajiBersih = (int) (jmlJamKerja * upahPerJam);
        System.out.println("Total gaji bersih karyawan adalah sebesar: Rp. " + gajiBersih );

        //hitung gajiBonus
        gajiBonus = (int)(gajiBersih + (gajiBersih * bonus));

        //hitung dan tampilkan gajiTotal
        gajiTotal = (int) (gajiBonus - (gajiBonus * pajak));
        System.out.println("Total gaji karyawan setelah ditambah bonus 10% dan dipotong pajak 5% adalah sebesar: Rp.  "+ gajiTotal);
    }
} 