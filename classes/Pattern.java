import java.util.*;
public class Pattern {
    public static void main(String args[])
    {
         //Scanner sc=new Scanner(System.in);
         //**********inverted pattern */
        //  int n=sc.nextInt();
        //  for(int i=1;i<=n;i++)
        //  {
        //     for(int j=1;j<=n-i+1;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }
        //********** half pyramid*/
        //   int n=sc.nextInt();
        //  for(int i=1;i<=n;i++)
        //  {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        //  }
        //*************print character pattern *****/
        //   int n=sc.nextInt();
        //   char ch='A';
        //  for(int i=1;i<=n;i++)
        //  {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        //  }
        //********Hollow rectangle pattern***** */
        // Online Java Compiler
// Use this editor to write, compile and run your Java code online


    // public static void hollow_rectangle(int totalRows,int totalCols)
    // {
    //     for(int i=1;i<=totalRows;i++)
    //     {
    //         //inner_colums
    //         for(int j=1;j<=totalCols;j++)
    //         {
    //             //cell - (i,j)
    //             if(i==1 || i==totalRows || j==1 || j==totalCols)
    //             {
    //                 //boundary cells
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     hollow_rectangle(10,7);
    // }


        //*************Inverted & rotated half pyramid********** */
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int space=n-1;
    //     int k=1;
    //    for(int i=1;i<=n;i++)
    //    {
    //        for(int j=space;j>=1;j--){
    //            System.out.print(" ");
    //        }
    //        for(int j=1;j<=k;j++){
    //             System.out.print("*");
    //        }
    //        space--;
    //    k++;
    //     System.out.println( );
    //    }
    //***************inverted halg pyramid with numbers pattern***** */
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // for(int i=1;i<=n;i++)
    // {
    //     for(int j=1;j<=n-i+1;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }
    //***********Floyed triangles pattern***** */
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // int number=1;
    // for(int i=1;i<=n;i++)
    // {
    //     for(int j=1;j<=i;j++)
    //     {
    //         System.out.print(number);
    //         System.out.print(" ");
    //         number++;
    //     }
    //     System.out.println();
    // }

    //********0-1 triangle pattern */
    // Scanner sc=new Scanner(System.in);
    //    int n=sc.nextInt();
    //    for(int i=1;i<=n;i++)
    //    {
    //        for(int j=1;j<=i;j++)
    //        {
    //            if( (i+j)%2==0){
    //                System.out.print("1");
    //            }
    //            else{
    //                System.out.print("0");
    //            }
    //        }
    //        System.out.println();
    //    }
      
 /****************Butterfly pattern */

//     int n=4;
//     int spaces=2*n-2,stars=1;
//     for(int  i=1;i<=n;i++){
//         for(int j=1;j<=stars;j++){
//             System.out.print("*");
//         }
//         for(int j=1;j<=spaces;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=stars;j++){
//             System.out.print("*");
//         } 
//          System.out.println();
//     spaces-=2;
//     stars++;
//     }
//    spaces=0;
//    stars=n;
//     for(int  i=1;i<=n;i++){
//         for(int j=1;j<=stars;j++){
    //         System.out.print("*");
    //     }
    //     for(int j=1;j<=spaces;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=stars;j++){
    //         System.out.print("*");
    //     } 
    //      System.out.println();
    // spaces+=2;
    // stars--;
    // }
    //**********Rhombus*********** */
    // int n=5;
    // int spaces=n-1;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=spaces;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=n;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //     spaces--;
    // }
    //*************Hollow Rhombus********* */
    // int n=5;
    // int spaces=n-1;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=spaces;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=n;j++){
    //         if(i==1 || i==n || j==1 || j==n){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    //     spaces--;
    // }
    
    }
}
    
