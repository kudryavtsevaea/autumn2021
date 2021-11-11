public class Farm<T> {
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
        System.out.println(getValue().toString() + " в количестве "
                + amount + " были положены в грузовик");
        this.amountVan = amount;
        if (amount > this.getAmount()){
            System.out.println("На ферме недостаточно фруктов");
        }
        else {
        setAmount(this.amount - amount);
        System.out.println("На ферме осталось " + getAmount());
        }
    }
}

class Apple{
    @Override
    public String toString(){
        return "яблоки";
    }

}
class Plum{
    @Override
    public String toString(){
        return "сливы";
    }
}
class Peach{
    @Override
    public String toString(){
        return "груши";
    }
}


