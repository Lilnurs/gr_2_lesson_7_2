public class Medic extends Hero{
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность HEAL HEROES");


    }
   public int healPoints = 100;
    public String increseExperiance(){
        double tenPerecent = (((10* healPoints) /100 )+ healPoints);
return "Heal Points" + healPoints + "Увеличелся на 10% стало" + tenPerecent;

    }
}
