package net.unlucky.excursionticketapp.ticket;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PROTECTED, makeFinal = true)
public class Ticket {
    String type;
    int price;
}
