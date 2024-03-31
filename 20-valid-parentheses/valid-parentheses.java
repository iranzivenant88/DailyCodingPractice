class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>(); 
        map.put('(', ')'); 
        map.put('[', ']'); 
        map.put('{', '}');
        
        Stack <Character> stack = new Stack<>(); 
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); 
            if(map.containsKey(c)) {
                stack.push(c);
            } else {
                if(!stack.empty()) {
                     char x = stack.peek(); // looks at the top of the stack 
                     if(c == map.get(x)) {
                         stack.pop(); 
                     } else {
                         return false; 
                     }
                } else {
                    return false; 
                }   
            }

        }
        return stack.empty(); 
    }
}