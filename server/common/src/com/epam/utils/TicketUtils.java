package com.epam.utils;

import com.epam.entity.Human;
import com.epam.entity.Ticket;

import java.util.Date;

/**
 * Created by Sergey_Stefoglo on 11/20/2016.
 */
public class TicketUtils {
    public static final Double COST_TICKET = 5700d;

    public static String payTicket(Integer numberTicket, Double money) {
        Double summ = 0d;
        String returnMessage;
        Ticket ticket = StartCollection.getTickets().get(numberTicket);
        if (ticket != null) {
            if (ticket.getStatusTicket().equals(Const.BOOKED)) {
                summ = money - ticket.getCostTicket();
                if (summ >= 0) {
                    ticket.setStatusTicket(Const.PAID);
                    returnMessage = Const.TICKET + numberTicket + Const.DELIVERY + summ;
                } else {
                    returnMessage = Const.TICKET_INSUFICCIENT;
                }
            } else {
                returnMessage = Const.NOT_BOOKED;
            }
        } else {
            returnMessage = Const.TICKET_NOT_FOUND;
        }
        return returnMessage;
    }

    public static Integer bookedTicket(String startCity,
                                       String endCity,
                                       Date startDate,
                                       Date endDate,
                                       Human human) {
        Ticket ticket = new Ticket();
        ticket.setStartCity(startCity);
        ticket.setFinishCity(endCity);
        ticket.setCostTicket(COST_TICKET);
        ticket.setArrivaDate(endDate);
        ticket.setDepartureDate(startDate);
        ticket.setStatusTicket(Const.BOOKED);
        ticket.setHuman(human);
        ticket.setNumberTicket(StartCollection.currentNumber++);
        StartCollection.getTickets().put(ticket.getNumberTicket(), ticket);
        return ticket.getNumberTicket();
    }

    public static String removeTicket(Integer numberTicket) {
        String returnMessage;
        Ticket ticket = StartCollection.getTickets().remove(numberTicket);
        if (ticket != null) {
            returnMessage = Const.TICKET_REMOVED;
        } else {
            returnMessage = Const.TICKET_NOT_FOUND;
        }

        return returnMessage;
    }
}
