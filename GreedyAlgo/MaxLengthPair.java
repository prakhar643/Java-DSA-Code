import java.util.*;

public class MaxLengthPair {
    public static void main(String[] args) {
        int pairs [][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        
        // Sorting the pairs based on the second element of each pair
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        
        int chainLen = 1;
        int chainEnd = pairs[0][1];

        // Loop to find the maximum length chain
        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }

        // Output the result
        System.out.println(chainLen);
    }
}
