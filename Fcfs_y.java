import java.util.*;
public class Fcfs_y {

  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //System.out.println(" Enter The Number Of The Processes ");
       //int n = sc.nextInt();
       int [] pid = {1,2,3,4,};
       int [] at = {0,0,0,0};
       int [] bt = {2,3,4,2};
       int ct[]= new int[4];
       int tat[]= new int[4];
       int wt[]= new int[4];       
    
   for (int i=0;i<=3;i++)
   {
      if (i==0)
      {
         if (at[i]==0)
         ct[i]=bt[i];
         else
         ct[i]=bt[i]+at[i];
      }
      else 
      ct[i]=bt[i]+ct[i-1];
   }
   for (int i=0;i<=3;i++)
   {
    System.out.println(ct[i]);
   }
}
