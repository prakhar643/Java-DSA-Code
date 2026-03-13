public class TrappingRainWater {
    public static int trappedrain(int height[]) {
        // claculate left max boundary
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);

        }
        // calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedrain(height));
    }
}

// ANOTHER SOLUTION
//     public int trap(int[] height) { 
//         int n = height.length;
//     int leftMax = 0, rightMax = 0;
//     int left = 0, right = n - 1;
//     int totalWater = 0;

//     while (left <= right) {
//         if (height[left] < height[right]) {
//             if (height[left] > leftMax) {
//                 leftMax = height[left];
//             } else {
//                 totalWater += leftMax - height[left];
//             }
//             left++;
//         } else {
//             if (height[right] > rightMax) {
//                 rightMax = height[right];
//             } else {
//                 totalWater += rightMax - height[right];
//             }
//             right--;
//         }
//     }
//     return totalWater;
// }
//}
