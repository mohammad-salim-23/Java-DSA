// Tabulation technique use here
// Time Complexity o(n*TargetSum)
public class TargetSumSubs{
    public static boolean targetSumSubset(int arr[],int sum){
        int n = arr.length;
         boolean dp[][] = new boolean[n+1][sum+1];

         for(int i=0;i<dp.length;i++){
            dp[i][0] = true;
         }
        //  i=items & j=targetSubsetSum
        for(int i=1 ;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                int v = arr[i-1];
                if(v<=j && dp[i-1][j-v]){//included case
                    dp[i][j]=true;
                }
                else if(dp[i-1][j]==true){//excluded case
                    dp[i][j]=true;
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int arr[] = {4,2,7,1,3};
        int sum = 30;
        System.out.println(targetSumSubset(arr, sum));
    }
    
}