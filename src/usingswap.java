import java.sql.SQLOutput;
import java.util.Scanner;
public class usingswap {
     public static void swap(int[] a,int i,int j){
         int temp=a[i];
         a[i]=a[j];
         a[j]=temp;

     }
    public static void sort012(int a[], int n) {
         int low=0,mid=0,high=n-1;
         while(mid<=high){
             if(a[mid]==0){
                 swap(a,low,mid);
             }
             else if(a[mid]==1){
                 mid++;
             }
             else{
                 swap(a,mid,high);
                 high--;
             }
         }
    }

    
}