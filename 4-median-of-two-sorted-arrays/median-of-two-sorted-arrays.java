class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0; int j=0; int k=0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        double[] fin = new double[len1+len2];
        int t;
        double result=0; 

        while(i<len1 && j<len2){
            if(nums1[i] <= nums2[j]){
                fin[k] = nums1[i];
                i++;
                k++;
            }else{
                fin[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i<len1){
            fin[k] = nums1[i];
            i++;
            k++;
        }

        while(j<len2){
            fin[k] = nums2[j];
            j++;
            k++;
        }

        if ((len1 + len2) % 2 == 0) {
            t = ((len1 + len2)/2) - 1;
            result = (fin[t] + fin[t+1])/2; 
        }else {
            t = (len1 + len2)/2;
            result = fin[t];
        }

        return result;
    }
}