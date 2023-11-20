package hello.core.order;

public interface OrderService {
    /**
     *
     * @return 할인 대상 금액
     */
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
