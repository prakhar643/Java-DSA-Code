public class MaxSubarray1 {

    public static void maxsubarray(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += number[k];
                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                 }

            }

        }
        System.out.println("Maximun sum : " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        maxsubarray(number);
    }

}
