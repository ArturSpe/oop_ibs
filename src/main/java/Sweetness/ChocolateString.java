package Sweetness;

public class ChocolateString<T> extends BaseSweetnessImpl {

    private T uniqueParam;

    public ChocolateString(T uniqueParam, String name, int weight, int price) {
        super(name, weight, price);
        this.uniqueParam = uniqueParam;
    }

    @Override
    public void setUniqueParam(Object param) {
        System.out.println("Школодке присвоен уникальный параметр");
        uniqueParam = (T) param;
    }

    @Override
    public Object getUniqueParam() {
        return uniqueParam;
    }

    @Override
    public Class getClassUniqueParam() {
        System.out.println("Получен уникальный параметр шоколадки");
        return uniqueParam.getClass();
    }

}

