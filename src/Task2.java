public class Task2 {
    /*
    We have to calculate the average of marks obtained in three subjects by student A and in 4 subjects by student B.
    Create class 'Marks' with an abstract method 'getAverage' that will be returning the average of marks.
    Provide implementation of abstract method in classes 'A' and 'B'.
    The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects
    as its parameters for student B. Test your code.*/
    public static void main(String[] args) {
        A studentA = new A(80,95,97);
        System.out.println(studentA.getAverage());

        B studentB = new B(95,97,85,80);
        System.out.println(studentB.getAverage());
    }
}
abstract class Marks{
    abstract double getAverage();
}
class A extends Marks{
    double sub1;
    double sub2;
    double sub3;
    A(double sub1, double sub2, double sub3){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }
    @Override
    double getAverage() {
        return (sub1+sub2+sub3)/3;
    }
}
class B extends Marks{
    double sub1;
    double sub2;
    double sub3;
    double sub4;
    B(double sub1, double sub2, double sub3, double sub4){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
    }
    @Override
    double getAverage() {
        return (sub1+sub2+sub3+sub4)/4;
    }
}
