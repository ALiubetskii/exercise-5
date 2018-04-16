public enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    private Week today; // сегодняшний день
    private Week day; // искомый день

    public void setToday(Week today) {
        this.today = today;
    }

    public Week dayAfterTomorrow(){
        switch (today) {
            case MONDAY:
                day = WEDNESDAY;
                break;
            case TUESDAY:
                day = TUESDAY;
                break;
            case WEDNESDAY:
                day = FRIDAY;
                break;
            case THURSDAY:
                day = SATURDAY;
                break;
            case FRIDAY:
                day = SUNDAY;
                break;
            case SATURDAY:
                day = MONDAY;
                break;
            case SUNDAY:
                day = TUESDAY;
                break;
        }
        return day;
    }

    public Week dayBeforeYesterday(){
        switch (today) {
            case MONDAY:
                day = SATURDAY;
                break;
            case TUESDAY:
                day = SUNDAY;
                break;
            case WEDNESDAY:
                day = MONDAY;
                break;
            case THURSDAY:
                day = TUESDAY;
                break;
            case FRIDAY:
                day = WEDNESDAY;
                break;
            case SATURDAY:
                day = THURSDAY;
                break;
            case SUNDAY:
                day = FRIDAY;
                break;
        }
        return day;
    }

}

