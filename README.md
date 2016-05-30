# jackson-demo
Demo Projekt zur Verwendung von Jackson Annotationen zur Manipulation von JSON-Mappings 

Blog Eintrag: https://javaeeblog.wordpress.com/?p=1952

für z.B. Wildfly JAX-RS Webservices - Mappings. 

Die vorhadenen Model-Klassen sind um entsprechende Jackson Annotationen erweitert und werden in entsprechenden JAX-RS Webservices verwendet

**Annotationen**
 - de.gedoplan.showcase.models.Customer
     - Basis Annotationen
     
- de.gedoplan.showcase.models.Order
      - Deserialisierung
      
- de.gedoplan.showcase.models.Employee
      - Custome Serialisierung/Deserialisierung
      
- de.gedoplan.showcase.models.Shipper
      - JSONViews

**eigene Serialisierung / Deserialisierung**
 - de.gedoplan.showcase.jackson

**manuelles Serialisierung/Deserialisierung**
 - de.gedoplan.showcase.manuell



