import java.util.*;
public class lecture11 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]= new int[rows][cols];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        sc.close();
        boolean flag=false;
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if (arr[i][j]!=x){
                    System.out.println("Not found at: ("+i+","+j+")");
                }
                else{
                    System.out.println("Found at: ("+i+","+j+")");
                    flag=true;
                    break;
                }

            }
            if (flag){
                break;
            }
        }
    }

}
