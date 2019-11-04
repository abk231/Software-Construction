package sclab;

import java.util.ArrayList;

public class SCLAB {

    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        
        for(int i=0; i<10; i++){
            if(i<5){
                GraduateStudent s = new GraduateStudent();
                s.setName("Student "+ Integer.toString(i));
                s.setTestScore((int) (Math.random()*100+10));
                s.CalculateGrade();
                s.GetCourseGrade();
                obj.add(s);
            }else{
                UndergraduateStudent s = new UndergraduateStudent();
                s.setName("Student "+ Integer.toString(i));
                s.setTestScore((int) (Math.random()*100+1));
                s.CalculateGrade();
                s.GetCourseGrade();
                obj.add(s);
            }
            
            System.out.println(obj.get(i));
        }
    }
    
}
