public class HurufVokal {

    public static String mencariHurufVokal(String sampleInput) {
        String result = "";

        for(int i=0;i<sampleInput.length();i++){
            char vocalFound = sampleInput.charAt(i);
            if((vocalFound == 'a' || vocalFound == 'A' || vocalFound == 'e' || vocalFound == 'E' || vocalFound == 'i' || vocalFound == 'I' || vocalFound == 'o' || vocalFound == 'O' || vocalFound == 'u' || vocalFound == 'U')){
                result+=vocalFound;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(mencariHurufVokal("Indonesia Raya"));

    }
}
