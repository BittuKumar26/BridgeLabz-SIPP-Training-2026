public class Scenario3HeapSort{
    void heapSort(int[] arr){
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--) siftDownMax(arr,i,n);
        for(int end=n-1;end>0;end--){
            int t=arr[0];arr[0]=arr[end];arr[end]=t;
            siftDownMax(arr,0,end);
        }
    }
    void siftDownMax(int[] arr,int i,int size){
        int largest=i,left=2*i+1,right=2*i+2;
        if(left<size&&arr[left]>arr[largest])largest=left;
        if(right<size&&arr[right]>arr[largest])largest=right;
        if(largest!=i){
            int t=arr[i];arr[i]=arr[largest];arr[largest]=t;
            siftDownMax(arr,largest,size);
        }
    }
}
