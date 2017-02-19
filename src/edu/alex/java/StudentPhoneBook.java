package edu.alex.java;

/**
 * Created by Alex on 18-Feb-17.
 */
import java.util.ArrayList;

/**
 * Created by Android2017 on 17/02/2017.
 */
//Alphon:
public class StudentPhoneBook {
    //init the list:
    ArrayList<Student> studentList = new ArrayList<>();

    StudentPhoneBook(){}

    void addStudent(Student s){
        studentList.add(s);
    }

    void addStudent(){
        Student s = new Student();//IO!!!
        studentList.add(s);
    }

    void removeStudent(int index){
        //TODO: Test for bounds:
        studentList.remove(index);
    }

    void showStudent(int index){
        //TODO: Test for bounds:
        Student s = studentList.get(index);
        s.print();
    }

    void showAllStudents(){
        for (Student s : studentList) {
            s.print();
        }
    }

    int size()
    {
        return studentList.size();
    }
}