public class Shop <T extends Farm>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void getFromVan(Farm<T> farm, Van  van){
        van.remove(farm);
        van.setSizeVan(van.getSizeVan() + 1);
    }
}
