public class Main {
    public static void main(String[] args) {
        System.out.println("-----------APPLES-----------");
        Farm<Apple> appleFarm = new Farm<>();
        appleFarm.setValue(new Apple(), 60);
        appleFarm.putInVan(40);

        Shop shop1 = new Shop(appleFarm);
        shop1.getFromVan(10);

        System.out.println("-----------PLUMS-----------");
        Farm<Plum> plumFarm = new Farm<>();
        plumFarm.setValue(new Plum(), 2);
        plumFarm.putInVan(2);

        Shop shop2 = new Shop(plumFarm);
        shop2.getFromVan(5);

        System.out.println("-----------PEACHES----------");
        Farm<Peach> peachFarm = new Farm<>();
        peachFarm.setValue(new Peach(), 100);
        peachFarm.putInVan(76);

        Shop shop3 = new Shop(peachFarm);
        shop3.getFromVan(50);

    }
}
