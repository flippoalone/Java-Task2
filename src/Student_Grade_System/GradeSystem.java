package Student_Grade_System;

class Result {
    int studentId;
    String studentName;
    int mark;


    Result(int studentId , String studentName , int mark ) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mark =  mark;

    }

    int calculateGrade(){

        int grade = this.mark;

        switch (grade){

            case 90 -> System.out.println("Grade A");
            case 75 -> System.out.println("Grade B");
            case 50 -> System.out.println("Grade c");

            default -> System.out.println("Fail");
        }
        return grade;
    }
}


public class GradeSystem {
    public static void main(String[] args){


        Result student1 = new Result(01 , "Mukesh" , 90);
        Result student2 = new Result(02 , "Dinesh" , 50);
        Result student3 = new Result(03 , "Zack"  , 75);

        student1.calculateGrade();
        student2.calculateGrade();


    }
}
