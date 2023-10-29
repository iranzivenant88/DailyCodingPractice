class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>(); 
        map.put('I', 1);
        map.put('V', 5); 
        map.put('X', 10); 
        map.put('L', 50); 
        map.put('C', 100); 
        map.put('D', 500); 
        map.put('M', 1000); 
        int total = 0; 
        int N = s.length(); 
        int i = N - 1;
        while ( i >=0 ){
            int currentValue = map.get(s.charAt(i)); // 50
            int nextVal = 0;
            if(i > 0) {
                nextVal = map.get(s.charAt(i - 1)); // 
            }
            if(currentValue > nextVal) {
                total = total + (currentValue - nextVal);
                i -= 2;
            } else if(currentValue == nextVal) {
                total = total + currentValue + nextVal;
                i -= 2; 
            } else {
                total = total + currentValue;
                i--;
            }

        }
        return total;
    }
}

