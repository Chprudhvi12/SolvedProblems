import java.util.*;
public class Pranay {
   
   
   
    public static HashMap<String,ArrayList<String>> retrieveStudentInfo(ArrayList<Student> arr){
       
        HashMap<String ,ArrayList<String>> mm = new HashMap();
        Set<String> set = new HashSet();
        for(Student s: arr){
            set.add(s.getSchoolName());
        }
        System.out.println(set);
       
        for(String ss : set){
            ArrayList<String> arr1 = new ArrayList();
            for(Student sw : arr){
                if(sw.getSchoolName() == ss){
                    arr1.add(sw.getStudentName());
                }
            }
            mm.put(ss, arr1);
        }
       
        return mm;
    }
 
   
    public static void main(String args[]){
       
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        s1.setStudentId(1);
        s1.setStudentName("Prudhvi");
        s1.setSchoolName("Sri Chai");
       
        s2.setStudentId(2);
        s2.setStudentName("Prudhvi2");
        s2.setSchoolName("Sri Chai33");
       
        s3.setStudentId(3);
        s3.setStudentName("Prudhvi3");
        s3.setSchoolName("Sri Chai");
       
        s4.setStudentId(4);
        s4.setStudentName("Prudhvi4");
        s4.setSchoolName("Sri Chai33");
       
        s5.setStudentId(5);
        s5.setStudentName("Prudhvi5");
        s5.setSchoolName("Sri Chai");
        ArrayList<Student> arr = new ArrayList();
       arr.add(s1);
       arr.add(s2);
       arr.add(s3);
       arr.add(s4);
       arr.add(s5);
       for(Student s : arr){
           System.out.println(s.getStudentId());
           System.out.println(s.getStudentName());
           System.out.println(s.getSchoolName());
           System.out.println("_____________________");
       }
       
       
       /*Set<String> set = new HashSet();
        for(Student s: arr){
            set.add(s.getSchoolName());
        }
        System.out.println(set);*/
       System.out.println(retrieveStudentInfo(arr));
       
    }
   
   
 
   
}
class Student{
   
    private int studentId;
    private String studentName;
    private String schoolName;
   
    public int getStudentId(){
        return studentId;
    }
    public String  getStudentName(){
        return studentName;
    }
    public String getSchoolName(){
        return schoolName;
    }
   
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
}
