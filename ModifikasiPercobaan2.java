import java.util.Scanner;
    public class ModifikasiPercobaan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai,jml;
        int i = 0;

        System.out.print("masukkan Jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) { 
            System.out.print("Masukkan nilai maghasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();
            
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;    
            }
            
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
                System.out.println("Bsgud, pertahankan nilainya!");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalaha B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalaha c+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalaha c");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalaha D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalaha E");
            }
            
            i++;
        }
    }
}
