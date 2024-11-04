import java.util.Scanner;

public class extractWords_2 {
     
    static boolean anagram(String S, String P){
        for(int i =0;i<S.length();i++){
             int count =0;
             int count2=0;
             char ch = S.charAt(i);
            for(int j =0;j<S.length();j++){
              if(S.charAt(j)==ch){
                count++;
              }
            }

            for(int k =P.indexOf(ch);k<P.length();k++){
                 if(k==-1){
                    return false;
                 }
                if(P.charAt(k)==ch){
                 count2++;
                }
            }
            if(count2!=count){
                return false;
            }
        }  return true;
    }
     
  static  String reverseWords(String S)
    {
        S=S.trim()+".";

        char x;
        String w ="";
        String f ="";
        for(int i =0;i<S.length();i++){
            x=S.charAt(i);
            if(x!='.'){
                w=w+x;
            } else{ 
                w+=".";
                f=w+f;
                w=""; 
            }
             
            
            
        }    f = f.substring(0, f.length() - 1);
          return f;
    }

     static int isPalindrome(String S) {
        S = S.trim();
        int i=0;
        int j=S.length()-1;
        while(i<=j){
            if(S.charAt(i)!= S.charAt(j))return 0;
                 
        } return 1;
        
    }


    static void wordExtractor(String str) {
       str=  str.trim();
        String ptr = "";
        str += " ";
        char x;
        for (int i = 0; i < str.length(); i++) {
            x = str.charAt(i);
            if (x != ' ') {
                ptr += x;
            } else {
                System.out.println(ptr);
                ptr = "";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the string for which you want to extract the word");
        // String str = sc.nextLine();
        // wordExtractor(str);
        // System.out.println(reverseWords(str));
        //   System.out.println(isPalindrome(str));
        System.out.println(anagram("b","d"));
    }
}
