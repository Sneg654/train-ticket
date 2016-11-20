
package com.epam.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epam.entity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PayTicketResponse_QNAME = new QName("http://servise.soap.epam.com/", "payTicketResponse");
    private final static QName _BookedTicketResponse_QNAME = new QName("http://servise.soap.epam.com/", "bookedTicketResponse");
    private final static QName _FindTicket_QNAME = new QName("http://servise.soap.epam.com/", "findTicket");
    private final static QName _RemoveTicketResponse_QNAME = new QName("http://servise.soap.epam.com/", "removeTicketResponse");
    private final static QName _PayTicket_QNAME = new QName("http://servise.soap.epam.com/", "payTicket");
    private final static QName _BookedTicket_QNAME = new QName("http://servise.soap.epam.com/", "bookedTicket");
    private final static QName _RemoveTicket_QNAME = new QName("http://servise.soap.epam.com/", "removeTicket");
    private final static QName _FindTicketResponse_QNAME = new QName("http://servise.soap.epam.com/", "findTicketResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epam.entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindTicketResponse }
     * 
     */
    public FindTicketResponse createFindTicketResponse() {
        return new FindTicketResponse();
    }

    /**
     * Create an instance of {@link PayTicketResponse }
     * 
     */
    public PayTicketResponse createPayTicketResponse() {
        return new PayTicketResponse();
    }

    /**
     * Create an instance of {@link BookedTicket }
     * 
     */
    public BookedTicket createBookedTicket() {
        return new BookedTicket();
    }

    /**
     * Create an instance of {@link RemoveTicket }
     * 
     */
    public RemoveTicket createRemoveTicket() {
        return new RemoveTicket();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link Human }
     * 
     */
    public Human createHuman() {
        return new Human();
    }

    /**
     * Create an instance of {@link PayTicket }
     * 
     */
    public PayTicket createPayTicket() {
        return new PayTicket();
    }

    /**
     * Create an instance of {@link BookedTicketResponse }
     * 
     */
    public BookedTicketResponse createBookedTicketResponse() {
        return new BookedTicketResponse();
    }

    /**
     * Create an instance of {@link FindTicket }
     * 
     */
    public FindTicket createFindTicket() {
        return new FindTicket();
    }

    /**
     * Create an instance of {@link RemoveTicketResponse }
     * 
     */
    public RemoveTicketResponse createRemoveTicketResponse() {
        return new RemoveTicketResponse();
    }

    /**
     * Create an instance of {@link FindTicketResponse.Return }
     * 
     */
    public FindTicketResponse.Return createFindTicketResponseReturn() {
        return new FindTicketResponse.Return();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servise.soap.epam.com/", name = "payTicketResponse")
    public JAXBElement<PayTicketResponse> createPayTicketResponse(PayTicketResponse value) {
        return new JAXBElement<PayTicketResponse>(_PayTicketResponse_QNAME, PayTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookedTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servise.soap.epam.com/", name = "bookedTicketResponse")
    public JAXBElement<BookedTicketResponse> createBookedTicketResponse(BookedTicketResponse value) {
        return new JAXBElement<BookedTicketResponse>(_BookedTicketResponse_QNAME, BookedTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servise.soap.epam.com/", name = "findTicket")
    public JAXBElement<FindTicket> createFindTicket(FindTicket value) {
        return new JAXBElement<FindTicket>(_FindTicket_QNAME, FindTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servise.soap.epam.com/", name = "removeTicketResponse")
    public JAXBElement<RemoveTicketResponse> createRemoveTicketResponse(RemoveTicketResponse value) {
        return new JAXBElement<RemoveTicketResponse>(_RemoveTicketResponse_QNAME, RemoveTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servise.soap.epam.com/", name = "payTicket")
    public JAXBElement<PayTicket> createPayTicket(PayTicket value) {
        return new JAXBElement<PayTicket>(_PayTicket_QNAME, PayTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookedTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servise.soap.epam.com/", name = "bookedTicket")
    public JAXBElement<BookedTicket> createBookedTicket(BookedTicket value) {
        return new JAXBElement<BookedTicket>(_BookedTicket_QNAME, BookedTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servise.soap.epam.com/", name = "removeTicket")
    public JAXBElement<RemoveTicket> createRemoveTicket(RemoveTicket value) {
        return new JAXBElement<RemoveTicket>(_RemoveTicket_QNAME, RemoveTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servise.soap.epam.com/", name = "findTicketResponse")
    public JAXBElement<FindTicketResponse> createFindTicketResponse(FindTicketResponse value) {
        return new JAXBElement<FindTicketResponse>(_FindTicketResponse_QNAME, FindTicketResponse.class, null, value);
    }

}
