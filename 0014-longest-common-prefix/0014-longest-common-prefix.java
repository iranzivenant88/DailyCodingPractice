class Solution {
    public String longestCommonPrefix(String[] strs) {
        int size = strs.length;
       // String result = "";
        if(size==0 || strs == null)
        {
        return "";
        }
     String commonPrefix = strs[0];
     for(int i = 1;i<size;i++){
         while(strs[i].indexOf(commonPrefix)!=0){
            commonPrefix = commonPrefix.substring(0,commonPrefix.length()-1);
         }
     }
     return commonPrefix;
        
    }
}



