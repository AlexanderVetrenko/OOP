package Seminar_3;

import java.util.Random;

public class Person implements Interact{
   
    @Override
    public String callPet(Pets pet) {
        if(pet instanceof Cat) System.out.println("Кис-кис");
        return pet.ifWantPlay() ? pet.answer : (pet.name + " не отзывается");
    }

    @Override
    public String playPet(Pets pet) {
        String res="";
        if(!pet.ifWantPlay()) return pet.name + " не хочет играть";
        if(pet instanceof Cat) res = "Играем с мячом";
        if(pet instanceof Dog) res = "Играем с палкой";
        return res;
    }

    /* public String playPet(String s) {
        if(callPet(s)=="мяу-мяу") return "Играем с мячом";
        return "Котик не хочет играть";
    } */

    @Override
    public String feedPet(Pets pet, Meal ml, Volume vl) {
        String res="";
        if(!pet.ifWantEat()) return pet.name + " не хочет кушать";
        if(pet instanceof Cat && ml instanceof Cat_Meal) {
            res = ml.toString()+" "+vl.toString(); 
        }
        if(pet instanceof Dog) res = "Кормим кормом для собак";
        return res;
    }
    
    /* @Override
    public String callPet(String s) {
        return callPet();
    } */
}
