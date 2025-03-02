class Solution {
    public int findPeakElement(int[] arr) {
         int start=0;
       int end=arr.length-1;
       while(start <end){
           int mid=start+(end-start)/2;
           if(arr[mid]>arr[mid+1]){
               //you are in dec part of the array
               //this may be ans,but look at left
               end=mid;

           }else {
               //you are in asc part of an array
               start=mid+1;//because we know that mid+1 element >mid element
           }
       }
         //in the end .start==end
        //start and end are always trying to find max element in the above 2 checks
        //hence ,when they are pointing to just one element ,that is the max one  because that is what the checks  say
        //more elaboration 
        return start;
    }
}