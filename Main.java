import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student.studName();
        Student.phoneNum();
        

        //Student - Muhammad Asyraf Arsyad
        Student sInfo = new Student();
        sInfo.name();
        sInfo.age();
        sInfo.gender();
        sInfo.academic();
        sInfo.address();
        sInfo.contact();

        //Students - Wan Adib
        Students students = new Students();
        students.addstudent();
        students.removestudent();
        students.printstudent();
        students.findstudent();

        //Tutors test

    }
}

