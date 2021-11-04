<<<<<<< HEAD
public class Shop<T extends Farm>{
    private Farm<T> vans;

    public Shop(Farm<T> vans) {
        this.vans = vans;
    }

    public void getFromVan(int amount){
        if (amount > vans.getAmountVan()){
            System.out.println("Фруктов недостаточно");
        }
        else {
            System.out.println("Вы достали фруктов в количестве " + amount);
            vans.setAmountVan(vans.getAmountVan() - amount);
            System.out.println("В грузовике теперь находятся фрукты в количестве "
                    + vans.getAmountVan());
        }
    }

=======
public class Shop {
    А
>>>>>>> b908bb34e2118766dd3c5ab6291af4f0ada4b32a
}
