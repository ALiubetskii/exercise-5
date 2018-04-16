public class Test {

    public static void main(String[] args) {

        Week wk;
        Season sn;

        wk = Week.TUESDAY;
        wk.setToday(Week.TUESDAY);

//        System.out.println("=====Вывод с помощью values=====");
//        for (Week t : Week.values())
//        System.out.println(t);
//        System.out.println();

//        System.out.println("=====Вывод с помощью valuesOf=====");
//        wk = Week.valueOf("MONDAY");
//        System.out.println(wk);
//        System.out.println();
        
        System.out.println("Today is: " + wk);
        System.out.println("Day after tomorrow is: " + wk.dayAfterTomorrow());
        System.out.println("Day before yesterday is: " + wk.dayBeforeYesterday());
        System.out.println();
        System.out.println("=============================");

        sn = Season.SPRING;
        sn.setCurrent(Season.SPRING);
        System.out.println("Current season: " + sn);
        System.out.println("Next season: " + sn.nextSeason());
        System.out.println("Last season: " + sn.lastSeason());

    }
}
