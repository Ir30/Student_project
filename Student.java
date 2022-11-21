import java.util.Scanner;
import java.util.ArrayList;
class Student{

    String name;
    int adm_no;
    int roll_no;
    String college;

    Student(String name,int adm_no,int roll_no,String college){
        this.name=name;
        this.adm_no = adm_no;
        this.roll_no = roll_no;
        this.college = college;
    }

    void display(){
        System.out.println("name: "+name);
        System.out.println("admission no: "+adm_no);
        System.out.println("Roll No: "+roll_no);
        System.out.println("college: "+college);
        System.out.println();
        System.out.println("-------------");
    
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> emp_list = new ArrayList<Student>();

        while(true){
            System.out.println("Student");
            System.out.println("-------------");
            System.out.println();
            System.out.println("1:Add Student");
            System.out.println("2:View Student");
            System.out.println("3:Search Student");
            System.out.println("4:Delete Student");
            System.out.println("5:Exit");
            System.out.println();
            System.out.println("-------------");

    
            int choice=sc.nextInt();

            
        }
        
    }
}