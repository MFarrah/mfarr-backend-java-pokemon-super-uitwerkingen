public class DragonPokemon extends Pokemon {
    private String lightColor;
    private String sound;

    private boolean hostile;

    public DragonPokemon(String name, int level, int hp, int power, int shield, String lightColor, String sound, boolean hostile) {

        super(name, level, hp, power, shield);
        super.setType("black");
        this.lightColor = lightColor;
        this.sound = sound;
        this.hostile = hostile;

    }

    @Override
    public void eats() {
        System.out.println(super.getName() + " nibbles on some spicy mountain stones");
    }

    public void makeSound() {
        System.out.println(sound);
    }

    public void setlightColor() {
        System.out.println(super.getName() + "a fiery array of "+ lightColor + " light-beams forces everyone to the ground!");
    }

    public String getlightColor() {
        return lightColor;
    }

    public void setlightColor(String floodType) {
        this.lightColor = lightColor;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

}

