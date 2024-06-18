public class Statickeyword {
    public static void main(String args[]){
        Student s1=new Student();
        s1.schoolname="PTJ";
        Student s2=new Student();
        
        s2.schoolname="MU";// eikane s2 change korco but s1 eu change hoye jabe karon schoolname static 
        System.out.println(s1.schoolname);
        System.out.println(s2.returnpercentage(40,50));
    }
}
class Student{
    static int returnpercentage(int math,int phy){
        return (math+phy)/2;
    }
    String name;
    int roll;
    static String schoolname;
    void setName(String name){
        this.name=name;
    }
     String getName(){
        return this.name;
     }
}
