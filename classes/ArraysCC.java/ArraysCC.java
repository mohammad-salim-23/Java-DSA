import java.util.*;

public class ArraysCC {
    // public static void update(int marks[])
    // {
    //     for(int i=0;i<marks.length;i++){
    //         marks[i]=marks[i]+1;
    //     }
    // }
    // public static void main(String[] args) {
    //   int marks[]={97,98,99};
    //   update(marks);
    //   for(int i=0;i<marks.length;i++)
    //   {
    //       System.out.print(marks[i]+" ");
    //   }

    // }
    //*************Linear search**** */
   // public static int linearsearch(int numbers[],int key)
    // {
    //     for(int i=0;i<numbers.length;i++){
    //         if(numbers[i]==key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //  int numbers[]={2,4,5,8,10,12,14,16};
    //  int key=100;
    //  int index=linearsearch(numbers,key);
    //  if(index==-1){
    //      System.out.print("Not found");
    //  }
    //  else{
    //     System.out.print(index);
    //  }
   // }
   //***************Find largest number**** */
//    public static int getLargest(int numbers[]){
//     int largest=Integer.MIN_VALUE;//-infinity
//     for(int i=0;i<numbers.length;i++){
//         if(largest<numbers[i]){
//             largest=numbers[i];
//         }
//     }
//     return largest;
// }
// public static void main(String[] args) {
//   int numbers[]={1,2,6,3,5};
//   System.out.print(getLargest(numbers));
// }
   ////**********Binary Search***** */
// public static int binarySearch(int numbers[],int key){
//     int start=0,end=numbers.length-1;
//     while(start<=end){
//         int mid=(start+end)/2;
//         //comparisons
//         if(numbers[mid]==key){//found
//             return mid;
//         }
//         if(numbers[mid]<key){//right
//             start=mid+1;
//         }
//         else{//left
//             end=mid-1;
//         }
//     }
//     return -1;
// }
// public static void main(String[] args) {
//   int numbers[]={1,2,3,5,6};
//   int key=3;
//   System.out.print(binarySearch(numbers,key));
 
// }

///////////////***********Rverse array ***** */
// public static void reverse(int numbers[]){
//     int first=0,last=numbers.length-1;
//     while(first<last){
//         int tmp=numbers[first];
//         numbers[first]=numbers[last];
//         numbers[last]=tmp;
//         first++;
//         last--;
//     }
    
// }
// public static void main(String[] args) {
//   int numbers[]={1,2,3,5,6};
//   reverse(numbers);
//   for(int i=0;i<numbers.length;i++){
//       System.out.print(numbers[i]+" ");
//   }
//  System.out.println();
 
// }
//**************Print pair********** */
// public static void printPairs(int numbers[]){
//     int tp=0;
//     for(int i=0;i<numbers.length;i++){
//         int curr=numbers[i];
//         for(int j=i+1;j<numbers.length;j++){
//             System.out.print("("+curr+","+numbers[j]+")");
//         }
//         System.out.println();
//         tp++;
//     }
//     System.out.print(tp);
// }
// public static void main(String[] args) {
//     int numbers[]={2,4,6,8,10,12};
//     printPairs(numbers);
// }
//*********Subarrays******** */
// public static void printSubarrays(int numbers[]){
//     int ts=0;
//    for(int i=0;i<numbers.length;i++){
//        int start=i;
//        for(int j=i;j<numbers.length;j++){
//            int end=j;
//            for(int k=start;k<=end;k++){//print
//            System.out.print(numbers[k]+" ");//subarray
              
//            }
//             ts++;
//            System.out.println();
//        }
//        System.out.println();
//    }
//     System.out.println(ts);
// }
// public static void main(String[] args) {
//     int numbers[]={2,4,6,8,10};
//     printSubarrays(numbers);
// }
//*************Number pyramid***** */
// import java.util.*;
// class HelloWorld {
//     public static void main(String args []) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//            System.out.print(" ");
//            }
       
//        for(int j=1;j<=i;j++){
//         System.out.print(i);
//            if(j!=i)
//         System.out.print(" ");
//        }
//        System.out.println();
//     }
// }
// }
//************************Palindromic pattern with numbers pattern */
// public static void main(String args []) {
//    Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();
//    for(int i=1;i<=n;i++){
//        for(int j=1;j<=n*2-2*i;j++){
//        System.out.print(" ");
//        }
   
//    for(int j=i;j>=2;j--){
//     System.out.print(j);
      
//     System.out.print(" ");
//    }
//    for(int j=1;j<=i;j++){
//        System.out.print(j);
//        if(j!=i)
//        System.out.print(" ");
//    }
//    System.out.println();
// }
// }
   ///**************Max Subarray Sum ****** O(n^3)**** Not optimize */
//  public static void maxsubarraySum(int a[]){
//         int currsum=0;
//         int maxSum=Integer.MIN_VALUE;
//         int n=a.length;
//         for(int i=0;i<n;i++){
//             int start=i;
//             for(int j=i;j<n;j++){
//                 int end=j;
//                 currsum=0;
//                 for(int k=start;k<=end;k++){
//                     //subarraysum
//                     currsum+=a[k];
//                 }
//                 System.out.println(currsum);
//                 if(maxSum<currsum){
//                     maxSum=currsum;
//                 }
//             }
//         }
//         System.out.print("max sum = "+maxSum);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a[]=new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }
//         maxsubarraySum(a);
        
        
//     }
//*****************max subarray Sum with prefixsum araay technique***** O(n^2)**** */
// public static void maxsubarraySum(int a[]){
//    int currsum=0;
//    int maxSum=Integer.MIN_VALUE;
//    int n=a.length;
//    int prefix[]=new int[n];
//    prefix[0]=a[0];
//    //calculate prefix array
//    for(int i=1;i<n;i++){
//        prefix[i]=prefix[i-1]+a[i];
//    }
//    for(int i=0;i<n;i++){
//        int start=i;
//        for(int j=i;j<n;j++){
//            int end=j;
   
//    currsum=start==0 ? prefix[end] : prefix[end]-prefix[start-1];
           
//            if(maxSum<currsum){
//                maxSum=currsum;
//            }
//        }
//    }
//    System.out.print("max sum = "+maxSum);
// }
// public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();
//    int a[]=new int[n];
//    for(int i=0;i<n;i++){
//        a[i]=sc.nextInt();
//    }
//    maxsubarraySum(a);
   
   
// }
// ***************Kadan's technique use for find maxsubarray sum*************** O(n);
// it's not work when any array's all the value is negative
// public static void Kadans(int a[]){
//    int ms=Integer.MIN_VALUE;
//    int cs=0;
//    for(int i=0;i<a.length;i++){
//        cs+=a[i];
//        if(cs<0){
//            cs=0;
//        }
//        ms=Math.max(ms,cs);
//    }
//    System.out.print(ms);
      
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int a[]=new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
//        Kadans(a);
       
       
//    }
}
