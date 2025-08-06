class Solution {
public:
    int calPoints(vector<string>& operations) {
        stack<int> stack;
        int total = 0;

        for (string op : operations) {
            if (op == "C" || op == "D" || op == "+") {
                switch (op[0]) {
                    case 'C':
                        if (!stack.empty())
                            stack.pop();
                        break;

                    case 'D':
                        if (!stack.empty())
                            stack.push(2 * stack.top());
                        break;

                    case '+':
                        if (stack.size() >= 2) {
                            int val1 = stack.top(); stack.pop();
                            int val2 = stack.top();
                            stack.push(val1);
                            stack.push(val1 + val2);
                        }
                        break;
                }
            } else {
                stack.push(stoi(op));
            }
        }
        while (!stack.empty()) {
            total += stack.top();
            stack.pop();
        }

        return total;
    }
};
