public class MembalikkanKata {
    public static String membalikkanKata(String sampleInput) {

        char ch[]=sampleInput.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;

    }

    public static void main(String[] args) {
        System.out.println(membalikkanKata("Indonesia Raya"));
    }
}
