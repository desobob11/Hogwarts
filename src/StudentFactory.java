import java.util.*;
import java.io.*;

public class StudentFactory {
    private ArrayList<Student> studentList = new ArrayList<Student>();

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public Student createStudent() {
        return new Student();
    }

    public void addStudent(int num) {
        for (int i = 1; i <= num; i++) {
            studentList.add(createStudent());
        }
    }

    public void genderStudents() {
        Random ran = new Random();
        for (Student student: studentList) {
            student.setGender(ran.nextInt(2));
        }
    }

    public void nameStudents() throws IOException {
        for (Student student: studentList) {
            student.createName();
        }
    }

    public ArrayList<String> listOfStudentNames() throws IOException {
        ArrayList<String> studentNames = new ArrayList<String>();
        for (Student student: studentList) {
            studentNames.add(student.getFullName());
        }
        return studentNames;
    }

    public void initiateStudents(int numOf) throws IOException {
        addStudent(numOf);
        genderStudents();
        nameStudents();
    }

    public NPC getRandomNPC() {
        Random ran = new Random();
        int index = ran.nextInt(getStudentList().size()-1);
        return getStudentList().get(index);
    }

}
