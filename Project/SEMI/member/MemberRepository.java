package Exp.Test_Basic.member;

public interface MemberRepository {
    void save(Student student);
    Student findById(Long studentId);
}
