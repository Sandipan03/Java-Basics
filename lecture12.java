import java.util.*;
public class lecture12 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String fullName= sc.nextLine();
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));

        }
        sc.close();
        int bp=0;
        for(int i=0;i<fullName.length();i++){
            if (fullName.charAt(i)==' '){
                bp=i;
                break;

            }
        }
        String firstName= fullName.substring(0, bp);
        String lastName = fullName.substring(bp+1);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(firstName.compareTo(lastName));
    }
}
