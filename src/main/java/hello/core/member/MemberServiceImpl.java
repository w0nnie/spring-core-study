package hello.core.member;

public class MemberServiceImpl implements MemberService {


    //DIP를 위반하고 있다
    //serviceImpl은 추상화, 구현체도 의존하고있다.
    MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
