package de.gedoplan.showcase.manuell;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.gedoplan.showcase.models.Customer;
import de.gedoplan.showcase.models.ModelFactory;
import java.io.IOException;

/**
 * Beispiel für manuelles Serialisieren.
 *
 * @author Dominik Mathmann
 */
public class Serialize {

    public static void main(String... args) throws IOException {
        Customer customer = ModelFactory.getCustomer();

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(System.out, customer);
    }
}
