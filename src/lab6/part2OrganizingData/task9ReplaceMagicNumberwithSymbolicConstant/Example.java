package lab6.part2OrganizingData.task9ReplaceMagicNumberwithSymbolicConstant;

import java.util.ArrayList;
import java.util.List;

public class Example {
    private static final int MaxItems = 100;

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();

        // Додавання елементів у список
        for (int i = 0; i < MaxItems; i++) {
            items.add("Item " + i);
        }
    }
}
