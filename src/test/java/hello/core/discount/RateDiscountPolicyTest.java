package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("vip 등급은 10프로 할인되어야함.")
    void vip_o() {
        Member member = new Member(1L, "memberVip", Grade.VIP);
        int discountPercent = rateDiscountPolicy.discount(member, 10000);
        assertThat(discountPercent).isEqualTo(1000);
    }


    @Test
    @DisplayName("vip 등급이 아니면 할인이 안된다.")
    void vip_x() {
        Member member = new Member(1L, "memberBasic", Grade.BASIC);
        int discountPercent = rateDiscountPolicy.discount(member, 10000);
        assertThat(discountPercent).isEqualTo(0);
    }
}