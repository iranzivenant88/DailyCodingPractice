class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                stack.pop();
            } else if (operations[i].equals("D")) {
                int a = stack.peek()* 2 ;
                stack.push(a);
            } else if (operations[i].equals("+")) {
                int b = stack.pop();
                int c = stack.pop();
                int d = c+b;
                stack.push(c);
                stack.push(b);
                stack.push(d);
                
            } else {
                int k = Integer.valueOf(operations[i]);
                stack.push(k);
            }
        }

        int sum = 0;
        while (!stack.empty()) {
            sum += stack.pop();
        }

        return sum;
    }
}
