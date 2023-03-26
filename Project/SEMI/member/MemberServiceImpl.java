package Exp.Test_Basic.member;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Student student) {
        memberRepository.save(student);
    }

    @Override
    public Student findStudent(Long studentId) {
        return memberRepository.findById(studentId);
    }
}
