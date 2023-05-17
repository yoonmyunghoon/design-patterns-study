package me.whiteship.designpatterns.review_20230518_ex._02_after;

import java.util.List;

public interface ISortEngine {
    void setList(List<String> items); // 정렬할 리스트
    void sort(); // 정렬 알고리즘
    void reverseSort(); // 역순 정렬 알고리즘
    void printSortListPretty(); // 정렬된 리스트를 예쁘게 출력
}
