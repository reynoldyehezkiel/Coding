public class GantiHurufVokalAngka {

    public static String menggantiHurufVokalAngka(String sampleInput) {
        return sampleInput
                .replace("a", "1")
                .replace("A", "1")
                .replace("i", "2")
                .replace("I", "2")
                .replace("u", "3")
                .replace("U", "3")
                .replace("e", "4")
                .replace("E", "4")
                .replace("o", "5")
                .replace("O", "5");
    }

    public static void main(String[] args) {
        System.out.println(menggantiHurufVokalAngka("Indonesia Raya"));
    }
}
