package Exp.Test_Basic.future;


import Exp.Test_Basic.member.Grade;
import Exp.Test_Basic.member.Student;

public class GradeScore implements UnivService{
    @Override
    public Grade getScore(Student student, int grade) {
        return Grade.LOW;
    }
}
