class employee{
    String name;
    int id;
    employee(String name, int id){
        this.name=name;
        this.id=id;
    }
    employee(employee e1){
        this.name=e1.name;
        this.id=e1.id;
    }
    employee(){

    }
    public void display(String name){
        System.out.println(name);
    }
    public void display(int id){
        this.display("xyz");
        System.out.println(id);
    }
    public void display(String name, int id){
        System.out.println(name+" "+id);
    }
}
class hr extends employee{
    String dept;
    hr( String dept){
        this.dept=dept;

    }
    // public void display(int id){
    //     System.out.println("hr class: "+id);
    // }
}
public class oops {
    public static void main (String args[]){
        employee e1= new employee("Sandy", 1);
        // System.out.println(e1.name+" "+e1.id);
        employee e2= new employee(e1);
        // System.out.println(e2.name+" "+e2.id);
        // e1.display("Sand");
        e1.display(2);
        // e2.display("sandy", 3);
        hr h1=new hr("marketing");
        // h1.display("sandipan", 4);
        // System.out.println(h1.dept);
        // h1.name="sand";
        // h1.id=5;
        // System.out.println(h1.name+" "+h1.id);
        h1.display(7);
    }
}
