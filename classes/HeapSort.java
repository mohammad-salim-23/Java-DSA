public class HeapSort {
    public static void heapify(int arr[],int i,int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx=i;
        if(left<size && arr[maxIdx]<arr[left]){
            maxIdx=left;
        }
        if(right<size && arr[maxIdx]<arr[right]){
            maxIdx = right;
        }
        if(maxIdx!=i){
            int temp=arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;
            heapify(arr,maxIdx,size);

        }
    }
    public static void heapsort(int arr[]){
        //step 1-> build maxheap
        int n= arr.length;
        for(int i=n/2;i>=0;i--){//o(nlogn)
            heapify(arr,i,n);//o(n/2*logn)
            
        }
        //step 2-> push largest at end
        for(int i=n-1;i>=0;i--){
            //swap largest first at last
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,0,i);//o(nlogn)

        }

    }
    public static void main(String args[]){
        int arr[] = {1,2,4,5,3};
        heapsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
