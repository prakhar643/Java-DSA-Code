public class Kadanesalgo {
    public static void kadanes(int number[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<number.length;i++){
            currSum = currSum + number[i];
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("Maximum Subarray sum is : " + maxSum);
    }
        public static void main(String[] args) {
            int number[] = {-2,-3,4,-1,-2,1,5,-3};
            kadanes(number);
        }
    
    }
    
