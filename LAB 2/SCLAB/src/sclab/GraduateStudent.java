package sclab;


public class GraduateStudent extends Student{
    //Default Constructor
    GraduateStudent(){}
    
    //Explicit Constructor
    GraduateStudent(String name){
        super(name);
    }
    
    //#=========================- Class Methods -================================#//
    public String GetCourseGrade(){
        return this.courseGrade;
    }
    
    public String CalculateGrade(){
        int score = this.getTestScore();
        if(score >= 90){
            super.courseGrade = "A";
        }else if(score >= 80){
            super.courseGrade = "B";
        }else if(score >= 70){
            super.courseGrade = "C";
        }else if(score >= 60){
            super.courseGrade = "D";
        }else{
            super.courseGrade = "F";
        }
        return "";
    }
    
    public String toString(){
        return "===============================\n "
               +" Student Name: "+this.name
               +"\n Test Score: "+super.getTestScore()
               +"\n Grade: "+this.GetCourseGrade();
    }
}
