public class WaterPokemon extends Pokemon {
    private String floodType;
    private String sound;

    public WaterPokemon(String name, int level, int hp, int power, int shield, String floodType, String sound) {

        super(name, level, hp, power, shield);
        super.setType("Liquid");
        this.floodType = floodType;
        this.sound = sound;
    }

    @Override
    public void eats() {
        System.out.println(super.getName() + " eats sea food.");
    }

    public void makeSound() {
        System.out.println(sound);
    }

    public void floodType() {
        System.out.println(super.getName() + " initiates a " + floodType + " with force!");
    }

    public String getFloodType() {
        return floodType;
    }

    public void setFloodType(String floodType) {
        this.floodType = floodType;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

}

