package me.whiteship.designpatterns.review_20230518._04_builder._02_after;

import java.time.LocalDate;

public class DefaultTourPlanBuilder implements TourPlanBuilder {
    private String title;

    private int nights;

    private int days;

    private LocalDate startDate;

    private String whereToStay;

    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
        this.nights = nights;
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate localDate) {
        this.startDate = localDate;
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return new TourPlan(title, nights, days, startDate, whereToStay);
    }
}
