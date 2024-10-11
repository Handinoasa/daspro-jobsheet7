import java.util.Scanner;
    public class KafeDoWhile12 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int kopi, teh, roti;
            String namapelanggan;
            double totalharga, hargakopi, hargateh, hargaroti;
            hargakopi = 12000;
            hargateh = 7000;
            hargaroti = 20000;
            do{
                System.out.print("(masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
                namapelanggan = sc.nextLine();
                if (namapelanggan.equalsIgnoreCase("batal")) {
                    System.out.println("Transaksi dibatalkan");
                    break;
                }
                System.out.print("jumlah kopi: ");
                kopi = sc.nextInt();
                System.out.print("jumlah teh: ");
                teh = sc.nextInt();
                System.out.print("jumlah roti: ");
                roti = sc.nextInt();
                totalharga =(kopi * hargakopi) + (teh * hargateh) + (roti * hargaroti);
                System.out.println("total yang harus dibayar: Rp " + totalharga);
                sc.nextLine();
            } while (true);

            System.out.println("semua trasaksi selesai.");
        }
    
}
