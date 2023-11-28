package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class OrderApp {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);
        Order orderA = orderService.createOrder(memberA.getId(), "아이스크림", 20000);

        System.out.println("orderA = " + orderA);
    }
}
