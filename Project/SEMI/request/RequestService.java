package Exp.Test_Basic.request;

import Exp.Test_Basic.member.Grade;
import Exp.Test_Basic.member.Student;

public interface RequestService {
    Student createStudent( String name, String sex, int age, Grade grade, Long studentId);
}
