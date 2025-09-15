class Solution {
    public int findKthPositive(int[] arr, int k) {
        int len = arr.length;
        int i = 1;
        int j = 0;
        while(k > 0){
            if(j < len && i == arr[j]){
                i++;
                j++;
            }else{
                k--;
                i++;
            }
        }

        return --i;
    }

    public boolean exists(int[] arr, int num){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] == num) return true;
            else if(arr[mid] > num) high = mid-1;
            else low = mid+1;
        }

        return false;
    } 
}