class Solution {
    public int lengthOfLongestSubstring(String s) {
        // // int max_sum = 0 , win_sum = 0 ;
        // // List<Character> arr = new ArrayList<>();
        // // for(char c : s.toCharArray()){
        // //     arr.add(c);
        // // }
        // <Character> stack = new Stack<>();
        // for(int i=0 ; i<s.length()-1;i++){
        //     if(s.charAt(i) != s.charAt(i+1)){
        //         stack.push(s.charAt(i));
        //     }
        // }
        // return stack.size()
        Set<Character>set = new HashSet<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
        char ch = s.charAt(right);
        while (set.contains(ch)) {
            set.remove(s.charAt(left));
            left++;
        }
        set.add(ch);
        maxLen = Math.max(maxLen, right - left + 1);
    }
    return maxLen;

        // Set<Character> set = new HashSet<>();
        // int max_len = 0 ; 
        // for(int i=0 ; i<s.length();i++){
        //     int win_sum=0;
        //     int j = i;
        //     while(j<s.length()){
        //     int var = set.size();
        //     set.add(s.charAt(j));
        //     if(var == set.size()) break;
        //     else win_sum++;
        //     j++;
        //     }
        //     set.clear();
        //     max_len = Math.max(max_len , win_sum);
        // }
        // return max_len;
    }
}