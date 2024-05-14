package lab6.part1MovingFeaturesBetweenObjects.task8IntroduceLocalExtension;

import java.time.LocalDate;

public class DateHelper {
    public static LocalDate addDays(LocalDate date, int days) {
        return date.plusDays(days);
    }

}
