class Solution {
    public int totalFruit(int[] fruits) {
        int currAns = 0;
        int ans = 0;
        int l = 0;
        HashMap<Integer, Integer> counter = new HashMap<>();
        
        for (int fr = 0; fr < fruits.length; fr++) {
            counter.put(fruits[fr], counter.getOrDefault(fruits[fr], 0) + 1);
            currAns++;
            while (counter.size() > 2) {
                counter.put(fruits[l], counter.get(fruits[l]) - 1);
                if (counter.get(fruits[l]) == 0) {
                    counter.remove(fruits[l]);
                }
                l++;
                currAns--;
            }
            ans = Math.max(ans, currAns);
        }
        
        return ans;
    }
}