public class Main {
    public static void main(String[] args) {
        HavingSuperAbility[] allHeroes = {new Magic(), new Warrior(), new Medic()};

        for (int i = 0; i < allHeroes.length; i++) {
            allHeroes[i].applySuperAbility();

        }
    }

}