package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolichy;
import hello.core.member.Member;
import hello.core.member.MemberServiceImpl;

public class OrderServiceImpl implements OrderService {

    private final MemberServiceImpl memberService = new MemberServiceImpl();

    //    private final DiscountPolicy discountPolicy = new FixDiscountPolichy();
    private DiscountPolicy discountPolicy;
    //dip 위반 구현체가 아닌 추상화한 객체만 의존해야한다.

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberService.findMember(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
