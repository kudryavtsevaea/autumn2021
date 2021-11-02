public class Farm<T> {
    private T type;
    private int amount;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public Farm<T> setVan(T type, int amount){
        Farm<T> Van = new Farm<T>();
        Van.amount = amount;
        return Van;
    }




}
