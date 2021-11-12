import java.util.ArrayList;
import java.util.List;

public class Farm<T>{
    private T type;
    private List<Farm> farm = new ArrayList<>();
    private Van van = new Van();
    private int size = 0;


    public void putInFarm(T type) {
        farm.add(new Farm<T>());
        ++size;
    }

    public void putInVan(){
        van.add(farm.get(farm.size()));
        van.setSizeVan(van.getSizeVan() + 1);
        farm.remove(farm.get(farm.size()));
        size--;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}

