package de.gedoplan.showcase.models;

import java.util.Date;

/**
 * Helfer-Klasse zur Erzeugung von Objekten
 *
 *  Mathmann
 */
public class ModelFactory {

    public static Order getOrder() {
        return new Order(90023, new Date(), 23.3, "U-203");
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
