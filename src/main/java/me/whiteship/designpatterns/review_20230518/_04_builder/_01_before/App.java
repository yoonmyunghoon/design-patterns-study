package me.whiteship.designpatterns.review_20230518._04_builder._01_before;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("당일 치기 여행");
        shortTrip.setStartDate(LocalDate.of(2023, 5, 18));
        System.out.println(shortTrip);

        TourPlan longTrip = new TourPlan();
        longTrip.setTitle("3박4일 오사카 여행");
        longTrip.setNights(3);
        longTrip.setDays(4);
        longTrip.setStartDate(LocalDate.of(2023, 5, 26));
        longTrip.setWhereToStay("5성급 호텔");
        System.out.println(longTrip);

    }
}
