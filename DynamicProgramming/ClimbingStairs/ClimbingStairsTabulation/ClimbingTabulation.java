public class ClimbingTabulation{
    public static int countWaysTab(int n){//Time Complexity:O(n)
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i] = dp[i-1];
            }else{
                dp[i] = dp[i-1]+dp[i-2];
            }
        }
       return dp[n];
    }
    public static void main(String args[]){
        System.out.println(countWaysTab(5));
    }
}