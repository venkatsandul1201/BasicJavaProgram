import java.util.*;/**
 * InnerArrayOfObject
 */
class Student{
int sid;
String sname;

void Accept(int id,String name){
sid=id;
sname=name;
}
void Display(){
    System.out.println("id is"+sid);
    System.out.println("name is"+sname);
}
}

public class ArrayOfObject {
    public static void main(String[] args) {
        int i;
        Scanner scanner=new Scanner(System.in);
        Student[] s=new Student[3];
        for(i=0;i<3;i++){
            s[i]=new Student();
            System.out.println("enter id");
            int id=scanner.nextInt();
            scanner.nextLine();
            System.out.println("enter name");
            String name=scanner.nextLine();
            s[i].Accept(id, name);
        }
        for(i=0;i<3;i++){
            s[i].Display();
        }
        scanner.close();
    }

}
