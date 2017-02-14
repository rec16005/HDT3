//Clase extraída de: https://en.wikibooks.org/wiki/Algorithm_Implementation/Sorting/Quicksort#Java

import java.util.ArrayList;
import java.util.Random;

public class QuickSort {

    public QuickSort() {
    }

    public static ArrayList<Integer> quicksort(ArrayList<Integer> numbers) {
        if (numbers.size() <= 1)
            return numbers;
        int pivot = numbers.size() / 2;
        ArrayList<Integer> lesser = new ArrayList<Integer>();
        ArrayList<Integer> greater = new ArrayList<Integer>();
        int sameAsPivot = 0;
        for (int number : numbers) {
            if (number > numbers.get(pivot))
                greater.add(number);
            else if (number < numbers.get(pivot))
                lesser.add(number);
            else
                sameAsPivot++;
        }
        lesser = quicksort(lesser);
        for (int i = 0; i < sameAsPivot; i++)
            lesser.add(numbers.get(pivot));
        greater = quicksort(greater);
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        for (int number : lesser)
            sorted.add(number);
        for (int number: greater)
            sorted.add(number);
        return sorted;
    }
}
