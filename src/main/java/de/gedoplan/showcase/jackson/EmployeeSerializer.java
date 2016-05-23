package de.gedoplan.showcase.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import de.gedoplan.showcase.models.Employee;
import java.io.IOException;

/**
 * Eigener Serializer der per Annotation an ein Feld/Typen registriert werden kann.
 * 
 * @see {@link Employee}
 * @author Dominik Mathmann
 */
public class EmployeeSerializer extends JsonSerializer<Employee> {

    @Override
    public void serialize(Employee t, JsonGenerator jg, SerializerProvider sp) throws IOException, JsonProcessingException {
       jg.writeStartObject();
       jg.writeStringField("generatedBy", this.getClass().getName());
       jg.writeNumberField("id", t.getEmployeeID());
       jg.writeStringField("toString", t.toString());
       jg.writeEndObject();
    }
}
