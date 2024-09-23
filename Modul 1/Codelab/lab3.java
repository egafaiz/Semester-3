public class lab3 {

    public int perhitunganGaji(int jamKerja, int gajiPerJam) {
        return jamKerja * gajiPerJam;
    }

    public static void main(String[] args) {
        lab3 hitung = new lab3();

        int gajiTotal = hitung.perhitunganGaji(40, 250000);
        System.out.println("Gaji karyawan dengan 40 jam kerja = " + gajiTotal);
    }
}