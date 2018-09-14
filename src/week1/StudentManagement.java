package week1;
import java.util.*;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    List<Student> students  = new ArrayList<Student>(100);

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return (s1.get_Gr() == s2.get_Gr());
    }

    void studentsByGroup() {
        // TODO:
        Map<String,List<Student>> student_by_group = new HashMap<String,List<Student>>();
        for (Student student : students){
            String key = student.get_Gr();
            if (student_by_group.containsKey(key)){
                List<Student> students_has_same_key = student_by_group.get(key);
                students_has_same_key.add(student);
            }
            else{
                List<Student> students_has_same_key = new ArrayList<Student>();
                students_has_same_key.add(student);
                student_by_group.put(key,students_has_same_key);
            }
        }
        Set<String> list_key = new HashSet<String>();
        list_key = student_by_group.keySet();
        for (String _key : list_key) {
            System.out.println(_key + ":");
            List<Student> list_student = new ArrayList<Student>();
            list_student = student_by_group.get(_key);
            for (Student st : list_student) {
                System.out.println(st.getInfo());

            }
        }


    }

    void removeStudent(String id) {
        // TODO:
        if (students.isEmpty()) return;
        for (Student st : students){
            if (st.get_Sid() == id) {
                students.remove(st);
                break;
            }
        }

    }

    public static void main(String[] args) {
        // TODO:
        Student s1 = new Student("Bui Thanh Tung","16021220","tung16021220@gmail.com");
        Student s2 = new Student("Nguyen Van A","16021221","nva16021221@gmail.com");
        Student s3 = new Student("Tran Van B","16021222","tvb16021222@gmail.com");
        Student s4 = new Student("Le Thi C","16021223","ltc16021223@gmail.com");
        s1.set_Gr("INT22041");
        s2.set_Gr("INT22041");
        s3.set_Gr("INT22041");
        s4.set_Gr("INT22042");
        StudentManagement sm = new StudentManagement();
        System.out.println("Test sameGroup :");
        System.out.println(sm.sameGroup(s1,s2));
        sm.students.add(s1);
        sm.students.add(s2);
        sm.students.add(s3);
        sm.students.add(s4);
        System.out.println("Test student by group :");
        sm.studentsByGroup();
        System.out.println("Test remove: ");
        sm.removeStudent("16021210");
        for (Student st : sm.students){
            System.out.println(st.getInfo());
        }
    }
}
