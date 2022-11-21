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
        
    }
}