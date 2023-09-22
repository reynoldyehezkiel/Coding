public class BiayaParkir {

    public static int hitungBiayaParkir(int jamMasuk, int jamKeluar) {
        int lama = jamKeluar - jamMasuk;
        int biaya = 0;

        for (int i = 0; i < lama; i ++) {
            if (i < 2){
                biaya += 5000;
            }else{
                biaya += 4000;
            }
        }

        return biaya;
    }

    public static void main(String[] args) {
        System.out.println(hitungBiayaParkir(9, 11));
    }
}
