public class Student {

    String name;
    String subject;
    double grade;
    int yearInCollege;
    int age;
    boolean isDegree;
    double money;

    Student (){
        grade = 4.0;
        yearInCollege = 1;
        isDegree = false;
        money = 0;
    }

    Student (String name, String subject, int age) {
        this ();
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

/*-метод void upYear() който увеличава годината в колежа с единица, ако
студента не е завършил, в противен случай извежда подходящо
съобщение. Ако след увеличаването годината стане 4, задава true на
полето isDegree
*/
    void upYear() {
        if (!isDegree) {
            this.yearInCollege++;
            if (this.yearInCollege == 4) {
                isDegree = true;
                System.out.println(this.name + " has graduated already");
            }

        }
    }

    /*-метод double receiveScholarship(double min, double amount) – добавя сумата
amount кум парите на студента, само ако успеха му е по-висок или равен
на минималния успех подаден като параметър (min) и ако възрастта му е
под 30 години.*/

    double receiveScholarship(double min, double amount){
        if (this.grade >= min && this.age < 30) {
            this.money += amount;
        }
        return this.money;
    }

    /*сетъри за оценка*/
    void setGrade (double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "name: " + this.name + "\n"
                + "subject: " + this.subject + "\n"
                + "graduated: " + this.isDegree + "\n"
                + "year in college: " + this.yearInCollege + "\n"
                + "age: " + this.age + "\n"
                + "grade: " +this.grade + "\n"
                + "money: " + this.money +"\n";
    }
}
