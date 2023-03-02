import java.util.HashMap;
import java.util.Map;

public class Roman2Integer {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        int total = 0;
        int length = s.length();
        int i = length-1;
        while (i>=0){
            int curremtValue = map.get(s.charAt(i));
            int nextValue = 0 ;
            if(i>0){
                nextValue = map.get(s.charAt(i-1));

                if (curremtValue>nextValue){
                    total +=(curremtValue-nextValue);
                    i-=2;
                }else if (curremtValue==nextValue){
                    total+=curremtValue+nextValue;
                    i-=2;
                }

            }else{
                total+=curremtValue;
                i--;

            }
        }
        return total;


    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MDM"));
    }
}

