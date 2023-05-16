package me.whiteship.designpatterns.review_20230518._03_abstract_factory._02_after;

public class MacButton extends WindowCheckbox implements Button {
    @Override
    public void print() {
        System.out.println("MacButton");
    }
}
