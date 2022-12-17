package Sweetness;

public abstract class BaseSweetnessImpl implements BaseSweetness {
    //Для реализации общих методов, работа с уникальным параметром для каждого класса будет своя
    private String name;
    private int weight;
    private int price;

    public BaseSweetnessImpl (String name, int weight, int price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Уникальный параметр: " +
                this.getUniqueParam() +
                " Название: "+ this.getName() +
                " Цена: " + this.getPrice() +
                " Вес: " + this.getWeight();
    }
}
