import java.util.ArrayList;
import java.util.List;

public class DeretGanjilMenurun {

    public static List<String> deretBilanganGanjilMenurun(int sampleInput) {
        List<String> list = new ArrayList<>();
        for(int x = sampleInput; x > 0; x--){
            if(x % 2 != 0){
                list.add(Integer.toString(x));
            }
        }

        for (int x = 1; x < list.size(); x+=2){
            list.set(x,"x");
        }

        return list;

    }

    public static void main(String[] args) {
        System.out.println(deretBilanganGanjilMenurun(11));
    }

}
