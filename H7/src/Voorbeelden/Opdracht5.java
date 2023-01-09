package Voorbeelden;

import java.time.LocalDateTime;

public class Opdracht5 {
    public static void main(String[] args) {
        // andere opgave als in powerpoint op blackboard
        // maak een datumtijd object aan 14/10/2018 om 22:32:27
        // 1 jaar, 2 maanden en 3 weken later maar 13u vroeger is het.
        // Dit is welke dag
        // afdruk in de vorm 14/10/2018 22:32:27 dag in het nederlands
        LocalDateTime moment1 = LocalDateTime.of(2018, 10, 14, 22, 32, 27);
        LocalDateTime moment2 = moment1.plusYears(1).plusMonths(2).plusWeeks(3).minusHours(13);
        System.out.println(moment1);
        System.out.print(moment2);
        System.out.printf(" It was on a %s%n", moment2.getDayOfWeek());
        // afgedrukt in juiste formaat
        System.out.printf("%1$td/%1$tm/%1$tY %1$tH:%1$tM:%1$tS%n", moment1);
        System.out.printf("%1$td/%1$tm/%1$tY %1$tH:%1$tM:%1$tS Dit was op een %1$tA%n", moment2);
    }
}
