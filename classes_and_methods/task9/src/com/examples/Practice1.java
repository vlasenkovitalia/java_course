package com.examples;

public class Practice1 {
    public enum Day {
        MONDAY("Понедельник", false, 1),
        TUESDAY("Вторник", false, 2),
        WEDNESDAY("Среда", false, 3),
        THURSDAY("Четверг", false, 4),
        FRIDAY("Пятница", false, 5),
        SATURDAY("Суббота", true, 6),
        SUNDAY("Воскресенье", true, 7);

        private final String russianName;
        private final boolean isWeekend;
        private final int dayNumber;

        Day(String russianName, boolean isWeekend, int dayNumber) {
            this.russianName = russianName;
            this.isWeekend = isWeekend;
            this.dayNumber = dayNumber;
        }

        public String getRussianName() {
            return russianName;
        }

        public boolean isWeekend() {
            return isWeekend;
        }

        public int getDayNumber() {
            return dayNumber;
        }

        @Override
        public String toString() {
            return russianName;
        }
    }

    public static class Schedule {
        private Day day;

        public Schedule(Day day) {
            this.day = day;
        }

        public void printSchedule() {
            if (day.isWeekend()) {
                System.out.println(day + " — это выходной день.");
            } else {
                System.out.println(day + " — рабочий день.");
            }
        }
    }

    static void main(String[] args) {
        Schedule mondaySchedule = new Schedule(Day.MONDAY);
        mondaySchedule.printSchedule();

        Schedule sundaySchedule = new Schedule(Day.SUNDAY);
        sundaySchedule.printSchedule();

        System.out.println("\nВсе дни недели:");
        for (Day day : Day.values()) {
            System.out.printf("%s (%s) - %s, номер: %d%n",
                    day.getRussianName(),
                    day.name(),
                    day.isWeekend() ? "выходной" : "рабочий",
                    day.getDayNumber());
        }

        System.out.println("\nИспользование switch:");
        Day currentDay = Day.WEDNESDAY;

        switch(currentDay) {
            case MONDAY:
                System.out.println("Начало недели!");
                break;
            case FRIDAY:
                System.out.println("Ура, пятница!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Выходные!");
                break;
            default:
                System.out.println("Обычный рабочий день");
        }
    }
}