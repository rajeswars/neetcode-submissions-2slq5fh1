class Solution {
    public void sortColors(int[] arr) {
        
        int n = arr.length;

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while(mid <= high)
        {
            if(arr[mid] == 0)
            {
                swap(arr, low, mid);
                low++;
                mid++;
            }

            else if(arr[mid] == 1)
            {
                mid++;
            }

            else
            {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] arr, int left, int right)
    {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}