package me.whiteship.designpatterns.review_20230518._04_builder._02_after;

public class App {
    public static void main(String[] args) {
        TourDirector tourDirector = new TourDirector(new DefaultTourPlanBuilder());
        TourPlan shortTrip = tourDirector.makeShortTrip();
        System.out.println(shortTrip);
        TourPlan longTrip = tourDirector.makeLongTrip();
        System.out.println(longTrip);

    }
}
