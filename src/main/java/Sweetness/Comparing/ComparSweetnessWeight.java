package Sweetness.Comparing;

import Sweetness.BaseSweetness;

import java.util.Comparator;

public class ComparSweetnessWeight implements Comparator<BaseSweetness> {
    @Override
    public int compare(BaseSweetness o1, BaseSweetness o2) {
        Integer price = o1.getWeight();
        return price.compareTo(o2.getWeight());
    }
}
