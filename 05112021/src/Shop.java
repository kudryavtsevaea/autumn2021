<<<<<<< HEAD
public class Shop<T extends Farm>{
    private Farm<T> vans;

    public Shop(Farm<T> vans) {
        this.vans = vans;
    }

    public void getFromVan(int amount){
        if (amount > vans.getAmountVan()){
            System.out.println("������� ������������");
        }
        else {
            System.out.println("�� ������� ������� � ���������� " + amount);
            vans.setAmountVan(vans.getAmountVan() - amount);
            System.out.println("� ��������� ������ ��������� ������ � ���������� "
                    + vans.getAmountVan());
        }
    }

=======
public class Shop {
    �
>>>>>>> b908bb34e2118766dd3c5ab6291af4f0ada4b32a
}
