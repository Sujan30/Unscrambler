import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){

        String word = "ABC";
        String s = word.substring(0,1) + word.substring(2,3) + word.substring(1,2);
        
        System.out.println(s);
    }

    /* 
    public static List<<String>> UnScrambler (String word){
        List<String><String> combinations = new ArrayList<>();

        String[][] arr = new String[(word.length()-1)* (word.length()+1)][word.length()];

        int len = numOfCombinations(word);

        String temp = word;

        String swap = "";

        
        
        for(int i = 0; i<arr.length; i++)
            for(int j = word.length()-1; j > 1; j-- ){
                
                for(int k = 0; k<word.length() - j; k++){
                    swap = word.substring(j, j-1);
                    temp = 
                }
                

            }

            temp = "";

            String s = word.substring(0,1) + word.substring(2,3) + word.substring(1,2)


        }
                
            /*
             * the method to find amount of combinations
             * 
             * ((word.length-1) * (n.len%3 + 1)) * n.length
             * 
             */




/* 
        

        return combinations;

    }

    */
    
    public static int numOfCombinations(String word){

        return (word.length()-1) * (word.length()%3 + 1) * word.length();
    }
}