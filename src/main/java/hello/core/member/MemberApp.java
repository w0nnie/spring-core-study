package hello.core.member;

import hello.core.AppConfig;

public class MemberApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "MemberA", Grade.VIP);
        memberService.join(member);

        System.out.println("member.getName() = " + member.getName());
        System.out.println("findById member" + memberService.findById(1L).getName());
        
    }
}
