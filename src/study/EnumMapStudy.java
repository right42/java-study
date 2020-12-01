package study;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class EnumMapStudy {

    public static void main(String[] args) {
        Map<TestType, String> enumMap = new EnumMap<>(TestType.class);
        enumMap.put(TestType.FIRST, "1");
        enumMap.put(TestType.SECOND, "2");

        System.out.println(enumMap);

        EnumSet<TestType> enumSet = EnumSet.of(TestType.FIRST);
    }

    private enum TestType {
        FIRST, SECOND, THIRD
    }
}

