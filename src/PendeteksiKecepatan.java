import java.util.ArrayList;
import java.util.Random;
public class PendeteksiKecepatan {
    public static String main(String[] args) {

        ArrayList<Integer> Kecepatan = new ArrayList<>();

        for (int i = 0; i < 200; i++) {
            int kecepatan = Kecepatan.get(0);
            Kecepatan.add(kecepatan);
        }
        System.out.println("Kecepatan antara 80 dan 100km/jam");
        for (int kecepatan : Kecepatan) {
            if (kecepatan >= 80 && kecepatan <= 100) {
                System.out.println(kecepatan + "km/jam");
            }
        }
        System.out.println("Kecepatan dibawah 80km/jam:");
        for (int kecepatan : Kecepatan) {
            if (kecepatan < 80) {
                System.out.println(kecepatan + "km/jam");
            }
        }
    }
}
