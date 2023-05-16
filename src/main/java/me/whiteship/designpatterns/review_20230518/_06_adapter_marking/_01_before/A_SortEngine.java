package me.whiteship.designpatterns.review_20230518._06_adapter_marking._01_before;

import java.util.Collections;
import java.util.List;

public class A_SortEngine implements ISortEngine {
    private List<String> items;

    @Override
    public void setList(List<String> items) {
        System.out.println("리스트 세팅 중 ... ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.items = items;
        System.out.println("리스트 세팅 완료!");
    }

    @Override
    public void sort() {
        System.out.println("리스트 sorting 중 ... ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Collections.sort(this.items);
        System.out.println("리스트 sorting 완료!");
    }

    @Override
    public void reverseSort() {
        System.out.println("리스트 reverse sorting 중 ... ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Collections.reverse(this.items);
        System.out.println("리스트 reverse sorting 완료!");
    }

    @Override
    public void printSortListPretty() {
        System.out.println("리스트 print 준비 중 ... ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.items);
    }
}
