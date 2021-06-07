package hw.hw2;

public enum Week {
    MONDAY(7), TUESDAY(7), WEDNESDAY(7), THURSDAY(7), FRIDAY(6), SATURDAY(0), SUNDAY(0);

    private int hours;
    private int hoursLeft = 0;

    Week(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void goWork(Week week) {
        for (int i = week.ordinal(); i < 6; i++) {
            hoursLeft += week.getHours();
        }
        if (hoursLeft == 0) {
            System.out.println("Рабочая неделя окончена");
        } else {
            if (week.getHours() == 0) {
                System.out.println("Сегодня выходной. \nНа этой неделе работать осталось: " + hoursLeft + "ч.");
            } else {
                System.out.println("На этой неделе работать осталось: " + hoursLeft + "ч.");
            }
        }
    }

}
