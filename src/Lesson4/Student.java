package Lesson4;

public class Student {
    int studNumb;
    String name;
    String surname;
    int yearOfStudy;
    double math;
    double econ;
    double foreignLanguage;

}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.studNumb = 1111;
        student1.name = "Nikita";
        student1.surname = "Kityukha";
        student1.yearOfStudy = 2014;
        student1.math = 3.5;
        student1.econ = 4.5;
        student1.foreignLanguage = 4;

        student2.studNumb = 2222;
        student2.name = "Alya";
        student2.surname = "Kopaeva";
        student2.yearOfStudy = 2016;
        student2.math = 3.2;
        student2.econ = 5;
        student2.foreignLanguage = 3.5;

        student3.studNumb = 33332;
        student3.name = "Anna";
        student3.surname = "Figase";
        student3.yearOfStudy = 2017;
        student3.math = 3;
        student3.econ = 2.7;
        student3.foreignLanguage = 4.4;

        double am1 = (student1.math + student1.econ + student1.foreignLanguage) / 3;
        double am2 = (student2.math + student2.econ + student2.foreignLanguage) / 3;
        double am3 = (student3.math + student3.econ + student3.foreignLanguage) / 3;

        System.out.println(am1);
        System.out.println(am2);
        System.out.println(am3);
    }
}
