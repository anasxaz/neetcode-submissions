class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]","");
        String result2 = result.toLowerCase();
        int low=0;
        int high=result.length()-1;
        while(low<high){
            if(result2.charAt(low) == result2.charAt(high)){
                low++;
                high--;
            }else{
                return false;
            }
        }
        return true;
    }
}
