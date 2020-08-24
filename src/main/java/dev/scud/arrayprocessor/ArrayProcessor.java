package dev.scud.arrayprocessor;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayProcessor {
    public static int[] process(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int current : arr)
            if (current % 2 == 0)
                al.add(current);
        Collections.sort(al);
        Collections.reverse(al);
        int[] newArray = new int[al.size()];
        for (int i = 0; i < al.size(); i++)
            newArray[i] = al.get(i);
        return newArray;
    }
}
