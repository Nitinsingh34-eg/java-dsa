public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {5, 2, 4, 1, 3};
        int n = arr.length;

       
        for (int size = 1; size < n; size = size * 2) {

            for (int left = 0; left < n - size; left += 2 * size) {

                int mid = left + size - 1;
                int right = Math.min(left + 2 * size - 1, n - 1);

                int[] temp = new int[right - left + 1];

                int i = left, j = mid + 1, k = 0;

                while (i <= mid && j <= right) {
                    if (arr[i] <= arr[j])
                        temp[k++] = arr[i++];
                    else
                        temp[k++] = arr[j++];
                }

                while (i <= mid)
                    temp[k++] = arr[i++];

                while (j <= right)
                    temp[k++] = arr[j++];

                for (int x = 0; x < temp.length; x++)
                    arr[left + x] = temp[x];
            }
        }

        for (int num : arr)
            System.out.print(num + " ");
    }
}
