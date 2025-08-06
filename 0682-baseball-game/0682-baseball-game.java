class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int total = 0;

        for (String op : operations) {
            if (op.equals("C") || op.equals("D") || op.equals("+")) {
                switch (op.charAt(0)) {
                    case 'C':
                        if (!stack.isEmpty())
                            stack.pop();
                        break;

                    case 'D':
                        if (!stack.isEmpty())
                            stack.push(2 * stack.peek());
                        break;

                    case '+':
                        if (stack.size()>= 2) {
                            int val1 = stack.peek(); stack.pop();
                            int val2 = stack.peek();
                            stack.push(val1);
                            stack.push(val1 + val2);
                        }
                        break;
                }
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        while (!stack.isEmpty()) {
            total += stack.peek();
            stack.pop();
        }

        return total;
    }
}