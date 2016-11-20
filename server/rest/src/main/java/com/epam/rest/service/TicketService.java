package com.epam.rest.service;

import com.epam.entity.Ticket;
import com.epam.utils.Const;
import com.epam.utils.StartCollection;
import com.epam.utils.TicketUtils;

import javax.ws.rs.core.Response;


/**
 * Created by Sergey_Stefoglo on 10/31/2016.
 */
public class TicketService {


//    protected static Map<Integer, Ticket> tickets = new HashMap<>();


    public Ticket getTicket(Integer id) {
        return StartCollection.getTickets().get(id);
    }


    public Response bookedTicket(Ticket innerTicket) {
        return Response.ok(TicketUtils.bookedTicket(innerTicket.getStartCity(),
                innerTicket.getFinishCity(),
                innerTicket.getDepartureDate(),
                innerTicket.getArrivaDate(),
                innerTicket.getHuman()).toString()).build();
    }

    public Response payTicket(Ticket innerTicket) {
        return Response.ok(TicketUtils.payTicket(innerTicket.getNumberTicket(), innerTicket.getCostTicket())).build();
    }


    public Response removeTicket(Integer numberTicket) {

        return Response.ok(TicketUtils.removeTicket(numberTicket)).build();
    }


}
