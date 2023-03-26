package Exp.Test_Basic.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryMemberRepository implements MemberRepository{

    // static 영역에 하나 만든다고 생각하면 되겠다
    private static Map<Long, Student> map = new HashMap<>();

    @Override
    public void save(Student student) {
        map.put(student.getStudentId(), student);
    }

    @Override
    public Student findById(Long studentId) {
        return map.get(studentId);
    }

}
