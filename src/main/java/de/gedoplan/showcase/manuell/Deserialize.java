package de.gedoplan.showcase.manuell;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

/**
 * Beispiel für manuelles Deserialisieren.
 * 
 * @author Dominik Mathmann
 */
public class Deserialize {
    
    public static void main(String...args) throws IOException{
        String jsonString="            {\n" +
"                \"orderID\": 90023,\n" +
"                \"orderDate\": 1463751750716,\n" +
"                \"requiredDate\": null,\n" +
"                \"shippedDate\": null,\n" +
"                \"freight\": 23.3,\n" +
"                \"shipName\": \"U-203\",\n" +
"                \"shipAddress\": \"Stieghorster Strasse 60\",\n" +
"                \"shipCity\": \"Bielefeld\",\n" +
"                \"shipRegion\": \"NRW\",\n" +
"                \"shipPostalCode\": \"33605\",\n" +
"                \"shipCountry\": \"Deutschland\",\n" +
"                \"shipVia\": \"DHL\"\n" +
"            }";
        
        
        ObjectMapper mapper=new ObjectMapper();
        JsonNode tree = mapper.readTree(jsonString);
        System.out.println(tree.get("shipAddress").asText());
    }
}
