import java.util.ArrayList;

public class Faculty {
        private String facultyName;
private ArrayList<Student> studentList;
int nstudents;
public Faculty(String name, int nstudents){
facultyName=name;
this.nstudents=nstudents;
this.studentList = new ArrayList<Student>();
}
 public void setfacultyName(String facultyName) {
                this.facultyName = facultyName;
        }
public boolean addStudent(Student student) {
                if (student == null || studentList.contains(student)) {
                        return false;
                }
                studentList.add(student);
                return true;
        }
}


