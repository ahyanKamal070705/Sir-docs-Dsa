public class stringCompression_3 {
      // reverse string using recursion
   static String reverseUsingRecursion(String s , int i){
         if(i==s.length()) {
         return "";
         }
          String smallAns = reverseUsingRecursion(s, i+1);
         return smallAns+=s.charAt(i);

   }

     static String CompressIt(String s){
            s=s.trim();
            int j=0;
            String ans="";
            
            for(int i=0;i<s.length();i=j){
                Integer count =0;
             char x = s.charAt(i);
             while(j<s.length()&&x==s.charAt(j)){
             count++;
             j++;
             } if(count>1){
                ans+=x+count.toString();
             }else{
                ans+=x;
             }
              
            }
            
            return ans;
     }
    public static void main(String[] args){
      //   System.out.println(CompressIt("aaabbbcccddde"));
        System.out.println(reverseUsingRecursion( "ahyan", 0));
    }
}
