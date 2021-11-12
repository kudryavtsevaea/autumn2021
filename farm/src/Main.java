public class Main {
    public static void main(String[] args) {
          Farm<Fruit> farm = new Farm<>();
          farm.putInFarm(new Apple());
          farm.putInFarm(new Peach());
          farm.putInFarm(new Plum());

        System.out.println(farm.getClass());

    }
}
