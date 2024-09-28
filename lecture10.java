import java.util.*;
public class lecture10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int arr[]=new int[n];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int x=sc.nextInt();
        // sc.close();
        // for (int i=0;i<n;i++){
        //     if (arr[i]!=x){
        //         System.out.println("Not found at: "+i);
        //     }
        //     else{
        //         System.out.println("Found at: "+ i);
        //         break;
        //     }
        // }
        String str[]=new String[n];
        for (int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        sc.close();
        for (int i=0;i<n;i++){
            System.out.println(str[i]);
        }
    }
}
