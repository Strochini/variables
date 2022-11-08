public class Main {
    public static void main(String[] args) {

        var Box = 5;
        System.out.println(Box);
        Box = Box + 2;
        System.out.println(Box);
        Box = Box - 3;
        System.out.println(Box);
        Box = Box * 3;
        System.out.println(Box);
        Box = Box / 4;
        System.out.println(Box);

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить " + capacityLeft + " кг вещей");

        var appleWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = appleWeight + orangesWeight;
        System.out.println("Общий вес фруктов " + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
        var productsWeight = vegetablesWeight + fruitWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов " + productsWeight + " кг!");

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Места осталось " + leftWeight + " кг!");
        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " + productsWeight);
        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Теперь места осталось " + leftWeight + " кг!");

        var overLoad = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("Прегруз на " + overLoad + " кг!");

        var productsInOneCar = productsWeight / 2;
        System.out.println("родуктов в одной машине теперь " + productsInOneCar);
    }
}