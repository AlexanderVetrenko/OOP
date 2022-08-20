package Seminar_3;

public enum VolumeType {
    PACKAGE("Пачка"), BOTTLE("Бутылка"), SPOON("Ложка");
    private String name;
    
    private VolumeType(String s) {
        name = s;
    }
    public String getName() {
        return name;
    }
   
}
