package hello.core.order;

import hello.core.discount.FixDiscountPolichy;
import hello.core.member.Member;
import hello.core.member.MemberServiceImpl;

public class OrderServiceImpl implements OrderService {

    private final MemberServiceImpl memberService = new MemberServiceImpl();

    private final FixDiscountPolichy fixDiscountPolichy = new FixDiscountPolichy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberService.findMember(memberId);
        int discountPrice = fixDiscountPolichy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
