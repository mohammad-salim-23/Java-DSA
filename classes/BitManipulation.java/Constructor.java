public class Constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Salim";
        s1.roll=291;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2=new Student(s1);
        s2.password="xyz";
        s1.marks[0]=56;
        System.out.println(s1.password);
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        // Student s2=new Student("Salim");
        // Student s3=new Student(123);
        // Student s4=new Student("Hadi",567);
       // System.out.println(s1.name);
        //deep copy constructor
         
      }
  }
  class Student{
      String name;
      int roll;
      String password;
      int marks[];
      //shallow copy constructor
    //   Student(Student s1){
    //       marks=new int[3];
    //       this.name=s1.name;
    //       this.roll=s1.roll;
    //       this.marks=s1.marks;

    //   }
    //deep copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
      Student(){
         marks=new int[3];
          System.out.println("Constructor is called");
          
      }
      Student(String name){
         marks=new int[3];
          this.name=name;
      }
      Student (int roll){
         marks=new int[3];
          this.roll=roll;
      }
      Student(String name,int roll){
         marks=new int[3];
          this.name=name;
          this.roll=roll;
      }
      
  }
     

