class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer>map=new HashMap<>();
        List<Integer>list = new ArrayList<>();
        for(int i = 0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        //int k = 0;
        for(int j=0;j<nums2.length;j++ ){
            if(map.containsKey(nums2[j])&&map.get(nums2[j])>0){
                // nums1[k]=nums2[j];
                // k++;
                list.add(nums2[j]);
                map.put(nums2[j],map.getOrDefault(nums2[j],0)-1);  
            }
        }
        int arr [] = new int[list.size()];
        int l =0;
        for(int x : list){
            arr[l] = x;
            l++;
        }
        //return Arrays.copyOfRange(nums1,0,k);
        
        return arr;
    }
}