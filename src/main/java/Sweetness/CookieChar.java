package Sweetness;

public class CookieChar<T> extends BaseSweetnessImpl {

    private T uniqueParam;
    public CookieChar(T uniqueParam, String name, int weight, int price) {
        super(name, weight, price);
        this.uniqueParam = uniqueParam;
    }

    @Override
    public void setUniqueParam(Object param) {
        System.out.println("Печенькам присвоен уникальный параметр");
        uniqueParam = (T) param;
    }

    @Override
    public Object getUniqueParam() {
        return uniqueParam;
    }

    @Override
    public Class getClassUniqueParam() {
        System.out.println("Получен уникальный параметр печенек");
        return uniqueParam.getClass();
    }
}
