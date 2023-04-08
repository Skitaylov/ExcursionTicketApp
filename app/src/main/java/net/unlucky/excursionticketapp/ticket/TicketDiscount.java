package net.unlucky.excursionticketapp.ticket;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.unlucky.excursionticketapp.DiscountUtil;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TicketDiscount extends Ticket implements TicketDiscountable {
    int discount;

    public TicketDiscount(String type, int price, int discount) {
        super(type, price);
        this.discount = discount;
    }

    @Override
    public int getPriceWithDiscount() {
        return DiscountUtil.calculateDiscount(price, discount);
    }
}
