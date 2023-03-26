package Exp.Test_Basic.future;

import Exp.Test_Basic.member.Grade;
import Exp.Test_Basic.member.Student;
import org.springframework.stereotype.Component;

@Component
public class SatScore implements UnivService{

    @Override
    public Grade getScore(Student student, int grade) {
        if( student.getGrade() == Grade.SKY ){
            System.out.println("You can go to sky universities");
            return Grade.SKY;
        }else{
            System.out.println("You can't go to sky univiersities");
            return Grade.MAJOR;
        }
    }
}
