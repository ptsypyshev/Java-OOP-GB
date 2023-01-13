// На языке Java реализовать следующий набор классов, при этом должна быть выделена их иерархия:
// 	2.1.Транспортное средство
// 	2.2.Автомобиль
// 	2.3.Мотоцикл
// 	2.4.Грузовик
// 	2.5.Велосипед
// Во всех классах должны быть написаны: цвет, модель, количество колёс, вес и скорость а так же метод ехать.
// В классе Program реализовать метод который будет работать с любым наследником класса ровно так же как и с родителем,
// то есть показать значение всех его публичных свойств и вызвать метод ехать.
package sm01.Task01;

public class Task01 {
    private static void showTransport(Transport[] all) {
        for (Transport transport : all) {
            System.out.println(transport);
            transport.drive();
            System.out.println("----");
        }
    }

    public static void main(String[] args) {
        Transport baseTransport1 = new Transport("Black", "Transport", 4, 1000, 100);
        Transport car1 = new Car("White", "BMW X5", 4, 3000, 200);
        Transport truck1 = new Truck("Yellow", "Scania Truck", 10, 10000, 120);
        Transport motorBike1 = new Motorbike("Red", "Urals", 2, 500, 150);
        Transport bike1 = new Bicycle("gray", "Stells", 2, 30, 20);

        Transport[] all = new Transport[] {baseTransport1, car1, truck1, motorBike1, bike1};
        showTransport(all);        
    }
}
