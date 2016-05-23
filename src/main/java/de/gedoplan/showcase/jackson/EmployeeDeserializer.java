package de.gedoplan.showcase.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.IntNode;
import de.gedoplan.showcase.models.Employee;
import java.io.IOException;

/**
 * Eigener Deserializer der per Annotation an ein Feld/Typen registriert werden
 * kann.
 *
 * @see {@link Employee}
 * @author Dominik Mathmann
 */
public class EmployeeDeserializer extends JsonDeserializer<Employee> {

    @Override
    public Employee deserialize(JsonParser jp, DeserializationContext dc) throws IOException, JsonProcessingException {
        ObjectCodec oc = jp.getCodec();
        JsonNode tree = oc.readTree(jp);

        Integer emplyeeId = ((IntNode)tree.get("id")).intValue();
        // z.B. Employee aus Datenbank lesen
        Employee e = new Employee();
        e.setEmployeeID(emplyeeId);
        e.setFirstName("CustomeParsed");
        e.setLastName("CustomeParsed");
        //

        return e;
    }

}
