class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()) return false;
        // HashMap<Character,Integer> s1 =  new HashMap<>();
        // for(int i=0 ; i< s.length() ;i++){
        //     s1.put(s.charAt(i) , s1.getOrDefault(s.charAt(i),0)+1);
        // }
        // for(int i=0 ; i<t.length();i++){
        //     char c = t.charAt(i);
        //     if(!s1.containsKey(c)) return false;
        //     s1.put(c,s1.get(c)-1);
        //     if(s1.get(c)==0) s1.remove(c);
        // }
        // return s1.isEmpty();

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);
    }
}