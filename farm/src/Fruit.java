public class Fruit<T>  {
    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
}

class Apple extends Fruit{
    private String label = "������";

    @Override
    public String toString() {
        return label;
    }
}

class Peach extends Fruit{
    private String label = "�����";

    @Override
    public String toString() {
        return label;
    }
}

class Plum extends Fruit{
    private String label = "�����";

    @Override
    public String toString() {
        return label;
    }
}
