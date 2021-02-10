import java.time.LocalDate;

public class Page {
    private int number;
    private LocalDate localDate;
    private String heading;
    private String activitiesOfTheDay;

    public Page() {
        this.number = NumberGenerator.getId();
    }

    public Page(String heading, String activitiesOfTheDay) {
        this.heading = heading;
        this.activitiesOfTheDay = activitiesOfTheDay;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getActivitiesOfTheDay() {
        return activitiesOfTheDay;
    }

    public void setActivitiesOfTheDay(String activitiesOfTheDay) {
        this.activitiesOfTheDay = activitiesOfTheDay;
    }

    public int getNumber() {
        return number;
    }
}
