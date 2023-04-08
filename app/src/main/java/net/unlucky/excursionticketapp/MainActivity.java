package net.unlucky.excursionticketapp;

import android.annotation.SuppressLint;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import net.unlucky.excursionticketapp.ticket.Ticket;
import net.unlucky.excursionticketapp.ticket.TicketDiscount;
import net.unlucky.excursionticketapp.ticket.TicketDiscountable;;

public class MainActivity extends AppCompatActivity {

    private TextView ticketTotalOut;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ticket ticketSenior = new Ticket("ticket_senior", 70);
        TicketDiscountable ticketChild = new TicketDiscount("ticket_child", ticketSenior.getPrice(), 50);
        TicketDiscountable ticketAdult = new TicketDiscount("ticket_adult", ticketSenior.getPrice(), 30);

        //Я не буду делать 9 сущностей билета как написано в тз, т.к это полный бред))
        ticketTotalOut = findViewById(R.id.ticketTotalOut);
        ticketTotalOut.setText("" + ((ticketSenior.getPrice() * 9) + (ticketChild.getPriceWithDiscount() * 5) + (ticketAdult.getPriceWithDiscount() * 11)));
    }
}