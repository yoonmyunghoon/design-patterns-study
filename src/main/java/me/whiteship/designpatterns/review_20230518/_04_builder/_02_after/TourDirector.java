package me.whiteship.designpatterns.review_20230518._04_builder._02_after;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan makeShortTrip() {
        return tourPlanBuilder.title("당일치기 여행")
                .startDate(LocalDate.of(2023, 5, 18))
                .getPlan();
    }

    public TourPlan makeLongTrip() {
        return tourPlanBuilder.title("3박4일 오사카 여행")
                .startDate(LocalDate.of(2023, 5, 26))
                .nightsAndDays(3, 4)
                .whereToStay("5성급 호텔")
                .getPlan();
    }
}
