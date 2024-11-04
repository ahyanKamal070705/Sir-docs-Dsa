public class sd11 {
    public static void main(String[] args) {
        String searchWord ="abcz";
        String resultWord ="azdb";
        //INITIALLY SIZE OF BOTH THE STRINGS ARE EQUAL BEFORE APPENDING
       
        int n= searchWord.length();
        int m = resultWord.length();


        // Yes, if string resultWord is a subsequence of string searchWord, 
        // it is necessary that the length of resultword will always be less than or 
        // equal to the length of searchWord However, it is not strictly necessary
        //  for b to be smaller
        //  in size, as they could have the same length 
        
        int i=0;
        int j =0;
        
        while(i<n ){
          char x = resultWord.charAt(j);
          char y = searchWord.charAt(i);
          if(x==y){
            i++;
            j++;
          }else{
            i++;
          }

        }
       
        int count = m-j;
        System.out.println(count);
        //if i want to append and return the new SearchWord

        searchWord = searchWord + resultWord.substring(j);
        System.out.println(searchWord);

    }
}

