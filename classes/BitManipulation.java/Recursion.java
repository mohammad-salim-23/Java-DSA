public class Recursion {
    //n to 1 number print
    // public static void printdec(int n){
       
    //      if(n==0){
           
    //          return;
    //      }
         
    //      System.out.print(n+" ");
    //      printdec(n-1);
        

    // }
    //******factorial of number n */
    // public static int factorial(int n){
    //     if(n==0){
    //         return  1;
    //     }
    //  int mul=n*factorial(n-1);
    //  return mul;
      

    // }
    //********print sum n natural numbers */
  public static int sumnatural(int n){
    if(n==0){
        return 0;
    }
    int sum=n+sumnatural(n-1);
    return sum;
  }
  public static int fibo(int n){
    
    if(n==0 || n==1){
       
      return n;
    }
    
 
   int fn=fibo(n-1)+fibo(n-2);
   System.out.print(fn+" ");
    
    return fn;
   
  }
  //check arr is sorted or not
  public static boolean sortedarr(int arr[],int i){
    if(i==arr.length-1){
      return true;
    }
    if(arr[i]>arr[i+1]){
      return false;
    }
    return sortedarr(arr,i+1);
  }
  // find first occurence in array
  public static int findidx(int arr[],int key,int i){
    
    if(i==arr.length-1 ){
      return -1;
    }
    
    if(arr[i]==key){
       return i;
    }
    
    return findidx(arr,key,i+1);
    
  }
  //  find last occurance array
public static int lasto(int arr[],int key,int i){
  if(i<0){
    return -1;
  }
  if(arr[i]==key){
    return i;
  }
  return lasto(arr,key,i-1);
}
    public static void main(String args[]){
    //     int n=5;
    //   int ans=  sumnatural(n);
    //   System.out.println(ans);
        //printdec(n);
      //int ans=  factorial(n);
       //System.out.println(ans);
      //  int n=8;
      // System.out.print( fibo(n));
      // int arr[]={1,3,2,5};
      // boolean ans=sortedarr(arr,0);
      // System.out.print(ans);
      // int arr[]={8,3,6,9,5,10,2,5,3};
      // System.out.println(lasto(arr,5,arr.length-1));
      // int x=findidx(arr,5,0);
      // System.out.println(x);

      
    }
   }
