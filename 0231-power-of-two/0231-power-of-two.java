class Solution {
    public boolean powertwo(int n , int i){
        if(Math.pow(2,i) == n){
            return true;
        }
        else if(Math.pow(2,i) > n){
            return false;
        }
        return powertwo(n , i+1);
    }
    public boolean isPowerOfTwo(int n) {
        if(n < 0) return false;
        return(powertwo(n,0));
    }
}