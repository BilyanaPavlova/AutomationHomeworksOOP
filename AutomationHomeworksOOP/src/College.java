public class College {
    public static void main(String[] args) {

//        създава няколко студента

        Student st1 = new Student("Dragan", "Chemistry", 22);
        Student st2 = new Student("Cvetan", "Biology", 23);
        Student st3 = new Student("Milkan", "Mathematics", 24);
        Student st4 = new Student("Petkan", "Biology", 25);
        Student st5 = new Student("Hasan", "Chemistry", 31);
        Student st6 = new Student("Dushan", "Biology", 27);
        Student st7 = new Student("Fishan", "Mathematics", 35);
        Student st8 = new Student("Petko", "Biology", 29);
        Student st9 = new Student("Kircho", "Chemistry", 20);
        Student st10 = new Student("Kancho", "Biology", 34);


//    добавя стипендия на някои от тях

        st1.receiveScholarship(4, 2000);
        st2.receiveScholarship(5, 5000);
        st3.receiveScholarship(6, 6000);
        st4.receiveScholarship(3.90, 500);

//    прехвърля някои от тях в по-горна година

        st2.upYear();
        st3.upYear();
        st1.upYear();
        st6.upYear();
        st5.upYear();
        st8.upYear();
        st9.upYear();
        st10.upYear();

//    Създава няколко групи от студенти

        StudentGroup gr1 = new StudentGroup("Biology");
        StudentGroup gr2 = new StudentGroup("Chemistry");
        StudentGroup gr3 = new StudentGroup("Mathematics");

        gr1.addStudent(st1);
        gr1.addStudent(st2);
        gr1.addStudent(st3);
        gr1.addStudent(st4);
        gr1.addStudent(st5);

        gr2.addStudent(st3);
        gr2.addStudent(st4);
        gr2.addStudent(st5);
        gr2.addStudent(st6);
        gr2.addStudent(st7);

        gr3.addStudent(st5);
        gr3.addStudent(st6);
        gr3.addStudent(st7);
        gr3.addStudent(st8);
        gr3.addStudent(st9);
        gr3.addStudent(st10);
        System.out.println("-----------------------");

        st1.setGrade(3.78);
        st2.setGrade(4.50);
        st3.setGrade(4.70);
        st4.setGrade(4.80);
        st5.setGrade(4.90);
        st6.setGrade(5.20);
        st7.setGrade(5.40);
        st8.setGrade(5.50);
        st9.setGrade(5.80);
        st10.setGrade(6.00);

        gr1.theBestStudent();
        gr2.theBestStudent();
        gr3.theBestStudent();

        gr1.printStudentsInGroup();
        System.out.println("--------------");
        gr2.printStudentsInGroup();
        System.out.println("--------------");
        gr3.printStudentsInGroup();
        System.out.println("--------------");
        gr1.emptyGroup();
        gr1.printStudentsInGroup();

        //some change


    }
}
