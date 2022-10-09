import java.util.Arrays;

public class StudentGroup {
    String groupSubject; // специалност на студентите в групата
    Student[] students;  //Студенти в групата(масив от обекти от клас Student)
    int freePlaces; //свободни места в групата

    /*- конструктор по подразбиране който създава места за 5 студента в групата
(инициализира полето students с нов масив от 5 елемента) и задава стойност
5 на полето freePlaces*/

    StudentGroup() {
        students = new Student[5];
        freePlaces = 5;
    }

    /*констуктор StudentGroup(String subject) които първо извиква конструктора
по подразбиране и задава стойност на полето groupSubject*/

    StudentGroup(String groupSubject) {
        this();
        this.groupSubject = groupSubject;
    }

    /*метод void addStudent(Student s) който добавя студент към групата(добавя
го към масива на следващата празна позиция) ако специалността на
студента съвпада с тази на групата, и разбира се, ако има свободни места.
След добавяне на студент към групата да се намалят свободните места в
групата.*/

    int count = 0;
    int fromIndex = 0;
    int toIndex = 0;

    void addStudent(Student s) {
        if ((s.subject.equals(this.groupSubject) && this.freePlaces > 0)) {

            if (this.students[0] == null) {
                this.count = 1;
            } else {
                this.count++;
            }
            this.fromIndex = this.students.length - this.freePlaces;
            this.toIndex = this.count;
            Arrays.fill(this.students, fromIndex, toIndex, s);
            this.freePlaces--;
        } else if (this.freePlaces <= 0) {
            System.out.println("There are no more free places in the group of " + this.groupSubject);
        } else {
            System.out.println("The subject of student " + s.name + " is " + s.subject +
                    " and doesn't match " +
                    this.groupSubject + " group's subject");
        }
    }

//    Another way to implement the method:

//    int count = 0;
//    void addStudent(Student s) {
//        if ((s.subject.equals(this.groupSubject) && this.freePlaces > 0)) {
//            this.students[count] = s;
//            this.count++;
//            freePlaces--;
//        } else if (this.freePlaces <= 0) {
//            System.out.println("There are no more free places in this group");
//        } else {
//            System.out.println("The subject of student " + s.name +" doesn't match this group's subject");
//        }
//    }

    /*- метод void emptyGroup() който освобождава всички места в групата (задава
нов празен масив за полето students) и задава стойност 5 за полето
freePlaces.
*/
    void emptyGroup() {
        Arrays.fill(this.students, null);
        freePlaces = this.students.length;
    }

    /*метод theBestStudent() - Връща името на студента с най-висок успех в
групата.*/

    String best = "";
    double bestGrade = 0;

    void theBestStudent() {
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i + 1] != null) {
                if (this.students[i].grade > this.students[i + 1].grade) {
                    this.best = this.students[i].name;
                    this.bestGrade = this.students[i].grade;
                } else {
                    this.best = this.students[i + 1].name;
                    this.bestGrade = this.students[i + 1].grade;
                }
            } else {
                this.best = this.students[i].name;
                this.bestGrade = this.students[i].grade;
                break;
            }
        }
        System.out.println("Student with the best grade in the group with " + this.groupSubject
                + " is " + this.best + " and his grade is " + this.bestGrade);
    }

    @Override
    public String toString() {
        return "Students in the group with subject " + this.groupSubject + ":\n"
                + Arrays.toString(this.students) + "\n"
                + "Free places in the group: " + this.freePlaces + "\n";
    }

    void printStudentsInGroup() {
        System.out.println("These are all students in group " + this.groupSubject + ":\n"
                + Arrays.toString(this.students));
    }
}
