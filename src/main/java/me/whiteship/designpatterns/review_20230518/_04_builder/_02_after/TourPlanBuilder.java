package me.whiteship.designpatterns.review_20230518._04_builder._02_after;


import java.time.LocalDate;

public interface TourPlanBuilder {
    TourPlanBuilder nightsAndDays(int nights, int days);
    TourPlanBuilder title(String title);
    TourPlanBuilder startDate(LocalDate localDate);
    TourPlanBuilder whereToStay(String whereToStay);
    TourPlan getPlan();
}
