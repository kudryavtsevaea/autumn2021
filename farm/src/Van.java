import java.util.ArrayList;
import java.util.List;

class Van<T extends Farm> {
        private List<Van> van = new ArrayList<>();
        private int sizeVan = 0;
        private T value;

        public void add(Farm farm) {
            van.add((Van) farm.getType());
        }

        public void remove(Farm farm) {
            van.remove((Van) farm.getType());
        }

        public T getType() {
            return value;
        }

        public void setType(T type) {
            this.value = type;
        }

        public int getSizeVan() {
            return sizeVan;
        }

        public void setSizeVan(int sizeVan) {
            this.sizeVan = sizeVan;
        }
    }

