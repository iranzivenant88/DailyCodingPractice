import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortPeople {

    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);//heights = [165,170,180]

        String[] result = new String[heights.length];
        int j = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            if (map.containsKey(heights[i])) {
                String name = map.get(heights[i]);
                result[j] = name;
                j++;
            }
        }

        return result;


    }
}

