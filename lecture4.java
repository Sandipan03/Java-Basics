import java.util.*;
public class lecture4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n1=sc.nextInt();
        sc.close();
        int ans=1;
        // for(int i=1;i<=n1;i++){
        //     ans=ans*i;
            
        // }
        int i=1;
        // while (i<=n1){
        //     ans=ans*i;
        //     i++;
        // }
        do{
            ans=ans*i;
            i++;
        }while(i<=n1);
        System.out.println(ans);
    }
  
}
