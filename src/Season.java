public enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;

    private Season current;
    private Season next;
    private Season last;

    public void setCurrent(Season current) {
        this.current = current;
    }

    public Season nextSeason(){
        switch (current) {
            case WINTER:
                next = SPRING;
                break;
            case SPRING:
                next = SUMMER;
                break;
            case SUMMER:
                next = AUTUMN;
                break;
            case AUTUMN:
                next = WINTER;
                break;
        }
        return next;
    }

    public Season lastSeason(){
        switch (current) {
            case WINTER:
                last = AUTUMN;
                break;
            case SPRING:
                last = WINTER;
                break;
            case SUMMER:
                last = SPRING;
                break;
            case AUTUMN:
                last = SUMMER;
                break;
        }
        return last;
    }
}
