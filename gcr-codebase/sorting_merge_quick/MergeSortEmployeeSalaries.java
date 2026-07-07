
import java.util.*;
public class MergeSortEmployeeSalaries {
    static void mergeSort(int[] a,int l,int r){
        if(l>=r) return;
        int m=(l+r)/2;
        mergeSort(a,l,m);
        mergeSort(a,m+1,r);
        merge(a,l,m,r);
    }
    static void merge(int[] a,int l,int m,int r){
        int[] t=new int[r-l+1];
        int i=l,j=m+1,k=0;
        while(i<=m && j<=r){
            if(a[i]<=a[j]) t[k++]=a[i++];
            else t[k++]=a[j++];
        }
        while(i<=m) t[k++]=a[i++];
        while(j<=r) t[k++]=a[j++];
        for(i=0;i<t.length;i++) a[l+i]=t[i];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        mergeSort(a,0,n-1);
        System.out.println(Arrays.toString(a));
    }
}
