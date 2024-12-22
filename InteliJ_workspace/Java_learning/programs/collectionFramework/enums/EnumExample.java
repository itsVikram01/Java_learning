package collectionFramework.enums;

// Defining an enum for days of the week
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class EnumExample {
    public static void main(String[] args) {
        // Using the enum
        Day today = Day.MONDAY;

        // Switch case using enum
        switch (today) {
            case MONDAY:
                System.out.println("Start of the workweek!");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek day");
        }

        // Looping through enum values
        System.out.println("\nList of all days in the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
