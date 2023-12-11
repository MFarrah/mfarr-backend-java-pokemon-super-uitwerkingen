public class GroundPokemon extends Pokemon {
    private String rocky;
    private String sound;

    public GroundPokemon(String name, int level, int hp, int power, int shield, String rocky, String sound) {

        super(name, level, hp, power, shield);
        super.setType("Fire");
        this.rocky = rocky;
        this.sound = sound;

    }

    @Override
    public void eats() {
        System.out.println(super.getName() + " nibbles on some spicy mountain stones");
    }

    public void makeSound() {
        System.out.println(sound);
    }

    public void setrocky() {
        System.out.println(super.getName() + "Burst's into the earth while " + rocky + " spikes are darting out!");
    }

    public String getrocky() {
        return rocky;
    }

    public void setrocky(String floodType) {
        this.rocky = rocky;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

}

