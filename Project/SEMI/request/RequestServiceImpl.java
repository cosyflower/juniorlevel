package Exp.Test_Basic.request;


import Exp.Test_Basic.future.UnivService;
import Exp.Test_Basic.member.Grade;
import Exp.Test_Basic.member.MemberRepository;
import Exp.Test_Basic.member.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static Exp.Test_Basic.member.Grade.SKY;

@Component
public class RequestServiceImpl implements RequestService{
    // Client와 가장 direct 한 Service 라고 생각할 수 있다
    // Repo 그리고 UnivService 에 의존한다
    // Component로 등록, 당연히 객체를 호출해야 하기 때문에 인터페이스 하는게 아니다
    private final MemberRepository memberRepository;
    private final UnivService univService;

    @Autowired
    public RequestServiceImpl(MemberRepository memberRepository, UnivService univService) {
        this.memberRepository = memberRepository;
        this.univService = univService;
    }


    @Override
    public Student createStudent(String name, String sex, int age, Grade grade, Long studentId) {
        Student student = memberRepository.findById(studentId);
        Grade final_grade = univService.getScore( student , Grade.SKY.ordinal());

        // 우리가 요청한 request 에 대한 Response 형태도 어떤 형태로 받을 것인가에 대한 클래스가 필요하다!!
        return new Student();
    }
}
