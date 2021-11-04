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

}
