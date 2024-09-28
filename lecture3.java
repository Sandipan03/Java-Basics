import java.util.*;
public class lecture3 {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        int n1= s.nextInt();
        int n2= s.nextInt();
        s.close();
        int diff=n1-n2;
        switch(diff){
            case 1:
            System.out.println(n1+" is greater");
            break;
            case -1:
            System.out.println(n2+" is greater");
            break;
            case 0:
            System.out.println("Both are equal");
            break;
            default:
            System.out.println("Invalid input");
        }
    }
}
