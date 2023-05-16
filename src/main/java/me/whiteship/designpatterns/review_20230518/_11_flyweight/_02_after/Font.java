package me.whiteship.designpatterns.review_20230518._11_flyweight._02_after;

public final class Font {

    private final String fontFamily;

    private final int fontSize;

    public Font(String fontFamily, int fontSize) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }
}
