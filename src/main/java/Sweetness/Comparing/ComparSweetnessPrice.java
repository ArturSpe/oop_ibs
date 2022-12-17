package Sweetness.Comparing;

import Sweetness.BaseSweetness;

import java.util.Comparator;

public class ComparSweetnessPrice implements Comparator<BaseSweetness> {

    @Override
    public int compare(BaseSweetness o1, BaseSweetness o2) {
        Integer price = o1.getPrice();
        return price.compareTo(o2.getPrice());
    }
}
