package Seminar_3;

public class Dog_Meal extends Meal{
    private String pet_type;
    
    public Dog_Meal(String tp, double pr, int vl) {
        super.meal_type = tp;
        super.price = pr;
        super.volume = vl;
        pet_type="Собака";
    }

    public String getPet_type() {
        return pet_type;
    }
    
}
