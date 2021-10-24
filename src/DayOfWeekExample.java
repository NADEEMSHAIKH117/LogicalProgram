import java.time.*;  
import java.time.DayOfWeek;  
    
public class DayOfWeekExample  
{  
    public static void main(String ar[])  
    {  
        LocalDate localDate = LocalDate.of(2021, Month.SEPTEMBER, 13);  
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);  
        System.out.println("Day of the Week on" + " 13th September 2021 - " + dayOfWeek.name());  
        int val = dayOfWeek.getValue();  
        System.out.println("Int Value of " + dayOfWeek.name() + " - " + val);  
    }  
} 