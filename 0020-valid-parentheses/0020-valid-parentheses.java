class Solution {
    public boolean isValid(String s) {
        Map<Character , Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');
        
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                stack.push(c);
            }else {
                if(stack.empty()){
                    return false;
                }else{
                    if(c == map.get(stack.peek())){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return stack.empty();
        
    }
}