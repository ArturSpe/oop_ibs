package Sweetness;

public interface BaseSweetness {

    public void setUniqueParam(Object param);

    public void setName(String name);

    public void setWeight(int weight);

    public void setPrice(int price);

    public Object getUniqueParam();

    public String getName();

    public int getWeight();

    public int getPrice();

    public Class getClassUniqueParam();

}
