package gvnavin.java8.datetime.zoneid;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneIdExample {
    
    public static void main(String[] args) {
    
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println("zoneId = " + zoneId);
        
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("allZoneIds = " + allZoneIds);
        
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        System.out.println("zonedDateTime = " + zonedDateTime);
    
        final ZonedDateTime parse = ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]");
        System.out.println("parse = " + parse);
    
        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offSetByTwo = OffsetDateTime.of(localDateTime, offset);
        
        System.out.println("offSetByTwo = " + offSetByTwo);
    }
}
