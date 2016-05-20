package de.gedoplan.showcase.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Id;

/**
 * Kann mit Attributen versehen werden die nicht verwendet werden sollen.
 * Alternativ dazu @JsonIgnore auf Feld-Ebene
 */
@JsonIgnoreProperties({"contactName", "fax"})

/**
 * JsonAutoDetect verändert die automatische Ermittlung der Attribute. Das
 * Beispiel hier würde die automatische Ermittlung von gettern/fields
 * deaktivieren und ausschließlich die Felder mit @JsonProperty verwenden.
 */
//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE)
/**
 * Markiert die Klasse "Customer" als nicht für JSON-Relevant. Referezen auf die
 * Klasse werden in JSON nicht aufgelöst.
 */
@JsonIgnoreType(true)

/**
 * Überspringt Attribute nach bestimmten Regeln ihres Inhaltes. Z.b. können
 * leere Felder übersprungen werden (default: ALWAYS). Kann auch auf
 * Attributsebene verwendet werden.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * JSON Property anderen Namen geben
     */
    @Id
    @JsonProperty("id")
    private String customerID;

    /**
     * JSON Property an bestimmte Stelle setzen
     */
    @JsonProperty(index = 0)
    private String companyName;

    /**
     * Default Wert wird von Jackson nicht verwendet. Ausschließlich für
     * Zusatzmodule
     */
    @JsonProperty(defaultValue = "XX")
    private String contactTitle;

    /**
     * Ignoriert Attribute vollständig
     */
    @JsonIgnore
    private Collection<Order> orders;

    /**
     * Format Vorgabe (in aller Regel für Datumsfelder)
     */
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date lastContact;

    /**
     * Attribute des referenzierten Objektes werden direkt mit in die
     * Root-Struktur geschrieben, anstatt sie als eigenes Objekt Strucktur zu
     * verwenden.
     * Statt: {..., user: {login,customerID}} <> {...,u_login,u_customerID}
     */
    @JsonUnwrapped(prefix = "u_")
    private User user;

    private Boolean commercialContact;

    private String contactName;

    private String address;

    private String city;

    private String region;

    private String postalCode;

    private String country;

    private String phone;

    private String fax;

    public Customer() {
    }

    public Customer(String customerID) {
        this.customerID = customerID;
    }

    public Customer(String customerID, String companyName, String contactName, String contactTitle, String address, String city, String region, String postalCode, String country, String phone, String fax, boolean commercialContact, Date lastContact, User user) {
        this.customerID = customerID;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
        this.commercialContact = commercialContact;
        this.lastContact = lastContact;
        this.user = user;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Collection<Order> getOrders() {
        return orders;
    }

    public void setOrders(Collection<Order> orders) {
        this.orders = orders;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerID != null ? customerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerID == null && other.customerID != null) || (this.customerID != null && !this.customerID.equals(other.customerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.gedoplan.angular.rw.model.Customers[ customerID=" + customerID + " ]";
    }

    public Boolean getCommercialContact() {
        return commercialContact;
    }

    public void setCommercialContact(Boolean commercialContact) {
        this.commercialContact = commercialContact;
    }

    public Date getLastContact() {
        return lastContact;
    }

    public void setLastContact(Date lastContact) {
        this.lastContact = lastContact;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
