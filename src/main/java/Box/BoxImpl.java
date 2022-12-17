package Box;

import Sweetness.*;
import Sweetness.Comparing.*;
import java.util.ArrayList;
import java.util.List;


public class BoxImpl implements Box{
    private final List<BaseSweetness> sweetnessList = new ArrayList<>();

    @Override
    public Box addSweetness(BaseSweetness sweetness) {
        sweetnessList.add(sweetness);
        return this;
    }

    @Override
    public boolean remove() {
        try {
            sweetnessList.remove(0);
            return true;
        }catch (IndexOutOfBoundsException e){
            return false;
        }
    }

    public boolean remove(BaseSweetness sweetness){
        try {
            sweetnessList.remove(sweetness);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public void smartOptimization(int mass, TypeSmartOptimisation smartOpt) {
        switch (smartOpt) {
            case PRICE -> {
                sweetnessList.sort(new ComparSweetnessPrice());
                while (this.getWeight() > mass) {
                    this.removeSort();
                }
            }
            case MASS -> {
                sweetnessList.sort(new ComparSweetnessWeight());
                while (this.getWeight() > mass) {
                    this.removeSort();
                }
            }
        }
    }

    @Override
    public void about() {

        System.out.println("Oбщая цена: " + getPrice() + " Общий вес: " + getWeight() + "\n   Содержимое:");
        sweetnessList.forEach(System.out::println);
        System.out.println("======================");
    }

    @Override
    public int getWeight(){
        return sweetnessList.stream().mapToInt(BaseSweetness::getWeight).sum();
    }
    @Override
    public int getPrice(){
        return sweetnessList.stream().mapToInt(BaseSweetness::getPrice).sum();
    }

    private void removeSort(){
        try {
            sweetnessList.remove(0);
        }catch (IndexOutOfBoundsException ignored){
    }
}
}