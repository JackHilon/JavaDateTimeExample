
package javadatetimeexample;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import javafx.util.converter.LocalDateTimeStringConverter;


public class JavaDateTimeExample {

    
    public static void main(String[] args) {
        
        // Java -- Old API ----------------------------------------------
        System.out.println("--- Java -- Old API ----");
        
        Date now=new Date();
        System.out.println(now);
        
        GregorianCalendar gc =new GregorianCalendar(2009, 1, 28);
        Date d1=gc.getTime();
        System.out.println(d1);
        
        gc.add(GregorianCalendar.DATE, 1);
        Date d2=gc.getTime();
        System.out.println(d2);
        DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));
        
        
        System.out.println(" ");
        System.out.println(" ");
        
        // --- Java -- New API -------------------------------------------
     
        System.out.println("--- Java -- New API ----");
        
        LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt);
        
        LocalDate ld=LocalDate.of(2009, 1, 28);
        System.out.println(ld);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("D/M/YYYY");
        System.out.println(dtf.format(ld));
        
    }
    
}
