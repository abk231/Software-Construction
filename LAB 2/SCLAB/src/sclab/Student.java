package sclab;


public class Student {
    //#=========================- Class Variables -================================#//
    public int NUM_OF_TESTS;
    protected String name;
    protected int test;
    protected String courseGrade;
    
    //Default Constructor
    Student(){
        
    }
    //Explicit Constructor
    Student(String name){
        this.name = name;
    }
    
    //#=========================- Class Methods -================================#//
    public String GetCourseGrade(){
        return this.courseGrade;
    }
    
    public String CalculateGrade(int score){
        return "";
    }

    public String getName() {
        return name;
    }

    public int getTestScore() {
        return test;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTestScore(int test) {
        this.test = test;
    }
    
}
