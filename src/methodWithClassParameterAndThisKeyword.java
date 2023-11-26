import java.util.Scanner;

class student{
    String name;
    int[] marks = new int[3];
    student(String name,int[] marks){
        this.name = name;
        this.marks = marks;
    }
}
class methodWithClassParameterAndThisKeyword{
    public static void prcnt(student s){
        float avg  = s.marks[0]+s.marks[1]+s.marks[2];
        avg = avg/3;
        System.out.println("the total percentage is: "+(avg/20)*100);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nm = sc.next();
        int[] mrk = new int[3];
        mrk[0] = sc.nextInt();
        mrk[1] = sc.nextInt();
        mrk[2] = sc.nextInt();
        student stu = new student(nm,mrk);
        prcnt(stu);
    }

}