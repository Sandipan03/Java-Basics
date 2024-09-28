import java.util.*;
public class lecture13 {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        StringBuilder sb= new StringBuilder(str);
        StringBuilder sb2=new StringBuilder(str);
        for (int i=0;i<sb.length()/2;i++){
            int start=i;
            int end=sb.length()-i-1;
            char frontChar=sb.charAt(start);
            char backChar=sb.charAt(end);
            sb.setCharAt(start,backChar);
            sb.setCharAt(end,frontChar);
        }
        if(sb.compareTo(sb2)==0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        sb.insert(2,'X');
        sb.delete(0,1);
        System.out.println(sb);
    }
}
