package com.epam.utils;

import com.epam.entity.Ticket;
import com.epam.entity.Human;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sergey_Stefoglo on 11/1/2016.
 */
public class StartCollection {
    public static int currentNumber = 100;
    private static Map<Integer, Ticket> tickets = new HashMap();
    static {
        getCollection(tickets);
    }
    public static final Map<Integer, Ticket>getCollection(Map<Integer, Ticket>tickets){
        Ticket ticket1 =new Ticket();
        ticket1.setStartCity("Almaty");
        ticket1.setFinishCity("Astana");
        ticket1.setDepartureDate(new Date());
        ticket1.setArrivaDate(new Date());
        ticket1.setCostTicket(3500d);
        ticket1.setNumberTicket(currentNumber++);
        ticket1.setStatusTicket(Const.BOOKED);
        Human human1=new Human();
        human1.setFirstName("Jonh");
        human1.setLastName("Smith");
        human1.setMidlleName("Ivanovich");
        human1.setBirthday(new Date(38,11,6));
        ticket1.setHuman(human1);
        tickets.put(ticket1.getNumberTicket(),ticket1);
        Ticket ticket2 =new Ticket();
        ticket2.setStartCity("Almaty");
        ticket2.setFinishCity("Moscow");
        ticket2.setDepartureDate(new Date());
        ticket2.setArrivaDate(new Date());
        ticket2.setCostTicket(7500d);
        ticket2.setNumberTicket(currentNumber++);
        ticket2.setStatusTicket(Const.BOOKED);
        Human human2=new Human();
        human2.setFirstName("Dasha");
        human2.setLastName("Smith");
        human2.setMidlleName("Ivanovna");
        human2.setBirthday(new Date(68,10,16));
        ticket2.setHuman(human2);
        tickets.put(ticket2.getNumberTicket(),ticket2);
        Ticket ticket3 =new Ticket();
        ticket3.setStartCity("Karaganda");
        ticket3.setFinishCity("Moscow");
        ticket3.setDepartureDate(new Date());
        ticket3.setArrivaDate(new Date());
        ticket3.setCostTicket(17500d);
        ticket3.setNumberTicket(currentNumber++);
        ticket3.setStatusTicket(Const.PAID);
        Human human3=new Human();
        human3.setFirstName("Dasha");
        human3.setLastName("Ivanova");
        human3.setMidlleName("Ivanovna");
        human3.setBirthday(new Date(29,6,16));
        ticket3.setHuman(human3);
        tickets.put(ticket3.getNumberTicket(),ticket3);
        return tickets;
    }

    public static Map<Integer, Ticket> getTickets() {
        return tickets;
    }

    public static void setTickets(Map<Integer, Ticket> tickets) {
        StartCollection.tickets = tickets;
    }
}