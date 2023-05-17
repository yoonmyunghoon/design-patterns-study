package me.whiteship.designpatterns.review_20230518_ex._01_before;

import java.util.Collections;
import java.util.List;

public class NewSortEngine {
    private List<String> items;

    public void setList(List<String> items) {
        this.items = items;
        System.out.println("리스트 세팅 완료!");
    }
    public void sorting(boolean isReverse) {
        if (isReverse) {
            Collections.reverse(this.items);
            System.out.println("리스트 reverse sorting 완료!");
        } else {
            Collections.sort(this.items);
            System.out.println("리스트 sorting 완료!");
        }
    }
    public void printPretty() {
        System.out.println(this.items);
    }
}
