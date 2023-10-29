import java.util.Scanner;

public class ProgramNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang Di Program Nilai");
        System.out.println("Silahkan lengkapi data yang dibutuhkan di bawah ini.");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Nim: ");
        String nim = input.nextLine();

        System.out.println("\nSilahkan masukkan nilai yang tertera di bawah ini.");
        System.out.print("Nilai Tugas Besar: ");
        float nilaiTubes = input.nextFloat();
        System.out.print("Nilai Quiz: ");
        float nilaiQuiz = input.nextFloat();
        System.out.print("Nilai Tugas: ");
        float nilaiTugas = input.nextFloat();
        System.out.print("Nilai UTS: ");
        float nilaiUTS = input.nextFloat();
        System.out.print("Nilai UAS: ");
        float nilaiUAS = input.nextFloat();

        Rumus rumus = new Rumus();
        double totalNilai = rumus.Totalnilai(nilaiTubes, nilaiQuiz, nilaiTugas, nilaiUTS, nilaiUAS);


        System.out.println();
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Nilai Matakuliah Pemrograman Berorientasi Objek: " + totalNilai);

        input.close();
    }

    public static class Rumus {
        public double Totalnilai(double nilaitubes, double nilaiquiz, double nilaitugas, double nilaiuts, double nilaiuas) {
            return (0.30 * nilaitubes) + (0.10 * nilaiquiz) + (0.10 * nilaitugas) + (0.25 * nilaiuts) + (0.25 * nilaiuas);
        }
    }
}
