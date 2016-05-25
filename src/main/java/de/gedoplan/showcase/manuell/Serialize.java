package de.gedoplan.showcase.manuell;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.gedoplan.showcase.models.ModelFactory;
import de.gedoplan.showcase.models.Product;
import java.io.IOException;

/**
 * Beispiel für manuelles Serialisieren.
 *
 * @author Dominik Mathmann
 */
public class Serialize {

    public static void main(String... args) throws IOException {
        Product product = ModelFactory.getProduct();

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(System.out, product);
    }
}
