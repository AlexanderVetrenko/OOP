package Seminar_3;

public abstract class Meal {
    String meal_type;
    double price;
    int volume;

    @Override
    public String toString() {
        
        return String.format("Тип корма %s, цена корма %f, объем %d\n", meal_type,price,volume);
    }

}
