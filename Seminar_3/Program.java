package Seminar_3;

public class Program {
    
   public static void main(String[] args) {
        Pets cat1 = new Cat("Barsik");
        Person ps1 = new Person();

        //System.out.println(ps1.callPet(cat1));
       // System.out.println(ps1.playPet(cat1));
      Cat_Meal catml1 = new Cat_Meal("Сухой", 900, 100);
      Cat_Meal catml2 = new Cat_Meal("Влажный", 150, 50);
      Cat_Meal catml3 = new Cat_Meal("Минтай", 400, 200);
      Dog_Meal dogml1 = new Dog_Meal("Сухой",1100, 300);
      Dog_Meal dogml2 = new Dog_Meal("Влажный", 200, 150);
      Dog_Meal dogml3 = new Dog_Meal("Говядина", 600, 500);

      Meal_List<Cat_Meal> mlc1 = new Meal_List<>();
      mlc1.addFeeding(catml1);
      mlc1.addFeeding(catml2);
      mlc1.addFeeding(catml3);
      Meal_List<Dog_Meal> mld1 = new Meal_List<>();
      mld1.addFeeding(dogml1);
      mld1.addFeeding(dogml2);
      mld1.addFeeding(dogml3);
      String r = ps1.feedPet(cat1, mlc1.get(0), new Volume(VolumeType.PACKAGE,1));
      System.out.println(r);
      //System.out.println(mlc1);
      //System.out.println(mld1);
      /* for (int i = 0; i < mlc1.size(); i++) {
         System.out.println(mlc1.get(i));
      }
      for (int i = 0; i < mld1.size(); i++) {
         System.out.println(mld1.get(i));
      } */

   }
    

    
}
