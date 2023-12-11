public class FirePokemon extends Pokemon {
    private String fireColor;
    private String sound;

    public FirePokemon(String name, int level, int hp, int power, int shield, String fireColor, String sound) {

        super(name, level, hp, power, shield);
        super.setType("Fire");
        this.fireColor = fireColor;
        this.sound = sound;

    }

    @Override
    public void eats() {
        System.out.println(super.getName() + " eats a lava cake.");
    }

    public void makeSound() {
        System.out.println(sound);
    }

    public void setFireColor() {
        System.out.println(super.getName() + " trows a right high-kick and " + fireColor + " fire is blazing!");
    }

    public String getFireColor() {
        return fireColor;
    }

    public void setFireColor(String fireColor) {
        this.fireColor = fireColor;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

}
