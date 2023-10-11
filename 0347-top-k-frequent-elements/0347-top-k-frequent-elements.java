class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
     PriorityQueue<Integer>pq = new PriorityQueue<>(k,(a,b)->map.get(a)-map.get(b));
        
        //max heap and min heap
        for(int y : map.keySet()){
            pq.offer(y);
            if(pq.size()>k){
                pq.poll();
            }
            // if(pq.peek()<y){
            //     pq.poll();
            //     pq.offer(y);
            // }
        }
                
        int [] arr = new int[k];
        for(int i = 0;i<k;i++){
            arr[i] = pq.poll();
        }
        return arr;
    }
}