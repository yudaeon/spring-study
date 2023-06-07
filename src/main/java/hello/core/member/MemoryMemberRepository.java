package hello.core.member;

import java.util.HashMap;
import java.util.Map;

// 아직 디비가 결정이 안됐다고 가정 -> 우선 memory로 구현
public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}