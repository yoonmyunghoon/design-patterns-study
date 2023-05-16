package me.whiteship.designpatterns.review_20230518._11_flyweight._02_after;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {

    private final Map<String, Font> cashes = new HashMap<>();

    public Font getFont(String font) {
        if (cashes.containsKey(font)) {
            return cashes.get(font);
        } else {
            String[] split = font.split(":");
            Font fontObj = new Font(split[0], Integer.parseInt(split[1]));
            cashes.put(font, fontObj);
            return fontObj;
        }

    }

}
