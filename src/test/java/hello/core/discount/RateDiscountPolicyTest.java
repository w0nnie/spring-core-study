package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용")
    void vip_discount() {
        //given
        //member가 생성됨 join
        Member member = new Member(1L, "memberA", Grade.VIP);
        //when
        //주문이 발생
        int discount = discountPolicy.discount(member, 10000);

        //then
        //10% 할인되어야함
         assertThat(discount).isEqualTo(1000);
    }
}