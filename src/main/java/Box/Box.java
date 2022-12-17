package Box;

import Sweetness.BaseSweetness;

public interface Box {
    Box addSweetness (BaseSweetness sweetness);
    boolean remove ();
    boolean remove(BaseSweetness baseSweetness);
    void smartOptimization(int mass, TypeSmartOptimisation smartOpt);
    public int getWeight();
    public int getPrice();
    public void about();
}
