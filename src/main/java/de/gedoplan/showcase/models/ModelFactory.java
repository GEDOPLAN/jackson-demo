package de.gedoplan.showcase.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Helfer-Klasse zur Erzeugung von Objekten
 *
 * Mathmann
 */
public class ModelFactory {

    public static Order getOrder() {
        Order order = new Order(90023, new Date(), 23.3, "U-203");
        List<OrderDetail> detailList=new ArrayList<OrderDetail>();
        OrderDetail orderDetail = getOrderDetail(order);
        detailList.add(orderDetail);
        order.setOrderDetails(detailList);
        return order;
    }

    
    public static OrderDetail getOrderDetail(Order order) {
        OrderDetail orderDetails = new OrderDetail(255, 4.5, (short) 2, 0);
        orderDetails.setOrder(order);
        return orderDetails;
    }

    public static Employee getEmployee() {
        return new Employee(2003, "Richard", "Nox", null, null, new Date(), new Date(), "Am Bahnhof 23", "Bielefeld", null, "33613", "Deutschland", null, null, null);
    }

    public static Shipper getShipper() {
        return new Shipper(99050, "Schmitz Lieferservice", "0178/4455660");
    }

    public static Product getProduct() {
        Product product=new Product(55667, "Rasierer E500", "1", 55.4, (short)120, (short)1, (short)0);
        return product;
    }

    private ModelFactory() {
    }

    public static User getUser() {
        return new User("User1001", "ALFAA");
    }

    public static Customer getCustomer() {
        return new Customer("ALFAA",
                "Alfons GmbH",
                "Alred Alfons",
                null,
                "StieghorsterStrasse 66",
                "Bielefeld",
                null,
                "33605",
                "Deutschland",
                "0521 208890",
                "0521 208890",
                true,
                new Date(),
                ModelFactory.getUser()
        );
    }
}
