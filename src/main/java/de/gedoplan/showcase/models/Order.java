package de.gedoplan.showcase.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonView;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Bestellungen
 *
 * @author Dominik Mathmann
 */
/**
 * Reihenfolge der Serialisierung angeben. Default/Ohne Angabe: wie hier
 */
@JsonPropertyOrder({"shipName"})
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonUnwrapped
    private Map<String, String> additionalInfos = new HashMap<>();

    /**
     * JsonAnySetter wird für jedes Attribut aufgerufen welches im JSON
     * vorhanden ist aber nicht gemappt werden kann (weil keine Setter vorhanden
     * sind).
     *
     * @param key
     * @param value
     */
    @JsonAnySetter
    public void addAdditionalInfos(String key, String value) {
        this.additionalInfos.put(key, value);
    }

    /**
     * Unwrapper für Maps, fügt die Inhalte der Map dem JSON Objekt als
     * Attribute hinzu.
     *
     * @return
     */
    @JsonAnyGetter
    public Map<String, String> runtimeInfos() {
        return this.additionalInfos;
    }

    /**
     * Creator können verwendet werden um eine Factory Methode zu verwenden um
     * das Objekt zu erzeugen. Parameter müssen mit "JsonProperty" deklariert
     * werden. Ein "normales" Mapping findet im Anschluss statt.
     *
     * @param rawFreight
     * @param orderID
     */
    @JsonCreator()
    public Order(@JsonProperty("freight") Double rawFreight, @JsonProperty("orderID") Integer orderID) {
        this.freight = rawFreight * 1000;
        this.orderID = null;
    }

    /**
     * Liefert eine eigene Repräsentation dieses Objektes.
     *
     * @return
     */
    //@JsonValue
    public String orderToCustomeJSON() {
        return "RAWString";
    }

    
    List<OrderDetail> orderDetails;

    private Employee employee;

    public Order() {
        this.additionalInfos.put("info1", "0");
    }

    private Integer orderID;

    private Date orderDate;

    private Date requiredDate;

    private Date shippedDate;

    private Double freight;

    @JsonView(Date.class)
    private String shipName;

    public Order(Integer orderID) {
        this.orderID = orderID;
    }

    public Order(Integer orderID, Date orderDate, double freight, String shipName) {
        this();
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.freight = freight;
        this.shipName = shipName;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public double getFreight() {
        return freight;
    }

    public void setFreight(double freight) {
        this.freight = freight;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderID != null ? orderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Order)) {
            return false;
        }
        Order other = (Order) object;
        if ((this.orderID == null && other.orderID != null) || (this.orderID != null && !this.orderID.equals(other.orderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.gedoplan.angular.rw.model.Orders[ orderID=" + orderID + " ]";
    }

    public Map<String, String> getAdditionalInfos() {
        return additionalInfos;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

}
