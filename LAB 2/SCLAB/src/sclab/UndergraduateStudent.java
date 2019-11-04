package sclab;

public class UndergraduateStudent extends Student{
    //Default Constructor
    UndergraduateStudent(){}
    
    //Explicit Constructor
    UndergraduateStudent(String name){
        super(name);
    }
    
    //#=========================- Class Methods -================================#//
    public String GetCourseGrade(){
        return this.courseGrade;
    }
    
     public String CalculateGrade(){
         int score = this.getTestScore();
        if(score >= 90){
            this.courseGrade = "A";
        }else if(score >= 80){
            this.courseGrade = "B";
        }else if(score >= 70){
            this.courseGrade = "C";
        }else if(score >= 60){
            this.courseGrade = "D";
        }else{
            this.courseGrade = "F";
        }
        return "";
    }
     
    public String toString(){
        return "===============================\n "
               +" Student Name: "+this.name
               +"\n Test Score: "+this.test
               +"\n Grade: "+this.GetCourseGrade();
    }
}
