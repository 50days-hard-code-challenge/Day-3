// LARGEST NUMBER IN A STRING
class Solution {
    public String largestOddNumber(String num) {
        
        String ans="";
        int n=num.length();
        for(int i=n-1;i>=0;i--)
        {
            char ch=num.charAt(i);
             if(ch%2!=0)
             {
                ans=num.substring(0,i+1);
                return ans;
             }

        }
        return ans;

    }
}
