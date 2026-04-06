public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 5};
        int missing = findMissingNumber(arr);
        System.out.println("The missing number is: " + missing);
    }

    static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num; 
        }
        return totalSum - arrSum; 
    }
    
}
