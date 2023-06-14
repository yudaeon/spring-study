package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){ //멤버 등급이 vip라면 10퍼센트 할인
        return price * discountPercent /100;
        } else {  //아니라면 0
            return 0;
        }
    }

}
