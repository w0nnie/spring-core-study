package hello.core.member;

public class MemberApp {

    public static void main(String[] args) {
        MemberServiceImpl memberService = new MemberServiceImpl();
        Member member = new Member(1L, "MemberA", Grade.VIP);
        memberService.join(member);

        System.out.println("member.getName() = " + member.getName());
        System.out.println("findById member" + memberService.findById(1L).getName());
        
    }
}
