
package com.epam.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for findTicketResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findTicketResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numberTicket" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="startCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="finishCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="arrivaDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="costTicket" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="statusTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element ref="{http://servise.soap.epam.com/}human" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findTicketResponse", propOrder = {
    "_return"
})
public class FindTicketResponse {

    @XmlElement(name = "return")
    protected FindTicketResponse.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link FindTicketResponse.Return }
     *     
     */
    public FindTicketResponse.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindTicketResponse.Return }
     *     
     */
    public void setReturn(FindTicketResponse.Return value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="numberTicket" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="startCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="finishCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="arrivaDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="costTicket" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="statusTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element ref="{http://servise.soap.epam.com/}human" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "numberTicket",
        "startCity",
        "finishCity",
        "departureDate",
        "arrivaDate",
        "costTicket",
        "statusTicket",
        "human"
    })
    public static class Return {

        protected Integer numberTicket;
        protected String startCity;
        protected String finishCity;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar departureDate;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar arrivaDate;
        protected Double costTicket;
        protected String statusTicket;
        @XmlElement
        protected Human human;

        /**
         * Gets the value of the numberTicket property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNumberTicket() {
            return numberTicket;
        }

        /**
         * Sets the value of the numberTicket property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNumberTicket(Integer value) {
            this.numberTicket = value;
        }

        /**
         * Gets the value of the startCity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartCity() {
            return startCity;
        }

        /**
         * Sets the value of the startCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartCity(String value) {
            this.startCity = value;
        }

        /**
         * Gets the value of the finishCity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinishCity() {
            return finishCity;
        }

        /**
         * Sets the value of the finishCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinishCity(String value) {
            this.finishCity = value;
        }

        /**
         * Gets the value of the departureDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDepartureDate() {
            return departureDate;
        }

        /**
         * Sets the value of the departureDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDepartureDate(XMLGregorianCalendar value) {
            this.departureDate = value;
        }

        /**
         * Gets the value of the arrivaDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getArrivaDate() {
            return arrivaDate;
        }

        /**
         * Sets the value of the arrivaDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setArrivaDate(XMLGregorianCalendar value) {
            this.arrivaDate = value;
        }

        /**
         * Gets the value of the costTicket property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getCostTicket() {
            return costTicket;
        }

        /**
         * Sets the value of the costTicket property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setCostTicket(Double value) {
            this.costTicket = value;
        }

        /**
         * Gets the value of the statusTicket property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusTicket() {
            return statusTicket;
        }

        /**
         * Sets the value of the statusTicket property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusTicket(String value) {
            this.statusTicket = value;
        }

        /**
         * Gets the value of the human property.
         * 
         * @return
         *     possible object is
         *     {@link Human }
         *     
         */
        public Human getHuman() {
            return human;
        }

        /**
         * Sets the value of the human property.
         * 
         * @param value
         *     allowed object is
         *     {@link Human }
         *     
         */
        public void setHuman(Human value) {
            this.human = value;
        }

        @Override
        public String toString() {
            return "Ticket{" +
                    "numberTicket=" + numberTicket +
                    ", startCity='" + startCity + '\'' +
                    ", finishCity='" + finishCity + '\'' +
                    ", departureDate=" + departureDate +
                    ", arrivaDate=" + arrivaDate +
                    ", costTicket=" + costTicket +
                    ", statusTicket='" + statusTicket + '\'' +
                    ", human=" + human +
                    '}';
        }
    }

}
