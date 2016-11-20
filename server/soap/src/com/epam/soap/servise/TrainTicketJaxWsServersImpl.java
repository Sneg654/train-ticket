package com.epam.soap.servise;

import com.epam.entity.Human;
import com.epam.entity.Ticket;
import com.epam.utils.StartCollection;
import com.epam.utils.TicketUtils;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;

/**
 * Created by Sergey_Stefoglo on 10/30/2016.
 */
@WebService(name = "TicketServer", endpointInterface = "com.epam.soap.servise.TrainTicketJaxWsServers")

@Stateless
public class TrainTicketJaxWsServersImpl implements TrainTicketJaxWsServers {


    @WebMethod
    public Integer bookedTicket(@WebParam(name = "startCity") String startCity,
                                @WebParam(name = "endCity") String endCity,
                                @WebParam(name = "startDate") Date startDate,
                                @WebParam(name = "endDate") Date endDate,
                                @WebParam(name = "human", targetNamespace = "http://servise.soap.epam.com/") Human human) {
        return TicketUtils.bookedTicket(startCity, endCity, startDate, endDate, human);
    }

    @WebMethod
    public Ticket findTicket(@WebParam(name = "numberTicket") Integer numberTicket) {
        return StartCollection.getTickets().get(numberTicket);
    }

    @WebMethod
    public String payTicket(@WebParam(name = "numberTicket") Integer numberTicket, @WebParam(name = "money") Double money) {
        return TicketUtils.payTicket(numberTicket, money);
    }


    @WebMethod
    public String removeTicket(@WebParam(name = "numberTicket") Integer numberTicket) {
        return TicketUtils.removeTicket(numberTicket);
    }


}

