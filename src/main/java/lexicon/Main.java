package lexicon;

import java.util.HashMap;

public class Main {

    void main() {

        HashMap<Integer, Cars> carBrand = new HashMap<>();

        Cars cars1 = new Cars();
        cars1.setId(1);
        cars1.setBrand("Toyota");
        cars1.setModel("Camry");

        Cars cars2 = new Cars();
        cars2.setId(2);
        cars2.setBrand("Honda");
        cars2.setModel("Civic");

        Cars cars3 = new Cars();
        cars3.setId(3);
        cars3.setBrand("BMW");
        cars3.setModel("345");

        carBrand.put(1, cars1);
        carBrand.put(2, cars2);
        carBrand.put(3, cars3);

        System.out.print("Car brands are: ");
        for (Cars car: carBrand.values()) {
            System.out.print(car.getBrand() + "  ");
        }
    }
}
