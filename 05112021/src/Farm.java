public class Farm<T> {
<<<<<<< HEAD
    private T value;
    private int amount;
    private int amountVan;

    public T getValue() {
        T fruit = value;
        this.value = null;
        return fruit;
    }

    public void setAmountVan(int amountVan) {
        this.amountVan = amountVan;
    }

    public T setValue(T value, int amount) {
        T fruit = this.value;
        this.value = value;
        this.amount = amount;
        return fruit;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmountVan() {
        return amountVan;
    }

    public void putInVan(int amount){
        System.out.println(getValue().toString() + " � ���������� "
                + amount + " ���� �������� � ��������");
        this.amountVan = amount;
        if (amount > this.getAmount()){
            System.out.println("�� ����� ������������ �������");
        }
        else {
        setAmount(this.amount - amount);
        System.out.println("�� ����� �������� " + getAmount());
        }
    }
}

class Apple{
    @Override
    public String toString(){
        return "������";
    }

}
class Plum{
    @Override
    public String toString(){
        return "�����";
    }
}
class Peach{
    @Override
    public String toString(){
        return "�����";
    }
}

=======
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
>>>>>>> b908bb34e2118766dd3c5ab6291af4f0ada4b32a
