package Sweetness;

public class CandiesInt<T> extends BaseSweetnessImpl {

    private T uniqueParam;
    public CandiesInt(T uniqueParam, String name, int weight, int price) {
        super(name, weight, price);
        this.uniqueParam = uniqueParam;
    }

    @Override
    public void setUniqueParam(Object param) {
        System.out.println("Конфетам присвоен уникальный параметр");
        uniqueParam = (T) param;
    }

    @Override
    public Object getUniqueParam() {
        return uniqueParam;
    }

    @Override
    public Class getClassUniqueParam() {
        System.out.println("Получен уникальный параметр конфет");
        return uniqueParam.getClass();
    }
}
