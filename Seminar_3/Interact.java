package Seminar_3;

public interface Interact {
    public String callPet(Pets name);
    //String callPet(String s);
    String playPet(Pets name);
    String feedPet(Pets name, Meal ml, Volume vl);
}
