import transport.Car;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car.Insurance ladaInsurance = new Car.Insurance(LocalDate.of(2022,12,30), 15000, "123456789");

        Car lada = new Car("Lada", "Granta", 1.7, "жёлтый", 2015, "Россия", "механика", "металл", 634563423, 4);
        Car audi = new Car("Audi", "A8 50L TDI quattro", 3.0, "Черный", 2020, "Германия", "механика", "металл", 626789673, 4);
        Car bmw = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия", "механика", "металл", 346246623, 4);
        Car kia = new Car("Kia", "Sportage 4", 2.4, "красный", 2018, "Южная Корея", "механика", "металл", 645684523, 4);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "механика", "металл", 621354623, 4);

        System.out.println(ladaInsurance);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }

}