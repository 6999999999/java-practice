package stirngPrograms.datetimefix;

import java.time.Instant;
import java.util.Date;

public class DateVerify {
    public static void main(String[] args) {
        Instant nowInstant=Instant.now();
        Date now = Date.from(nowInstant);

        System.out.println(nowInstant);
        System.out.println(now);

        int expiration=300000;

        Instant expiryInstant = nowInstant.plusMillis(expiration);
        System.out.println("expiry instant"+expiryInstant);

        Date expiryDate = Date.from(expiryInstant);
        System.out.println(expiryDate);
    }
}
