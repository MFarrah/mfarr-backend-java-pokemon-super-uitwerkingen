public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private int power;
    private int shield;
    private String type;

    public Pokemon(String name, int level, int hp, int power, int shield) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.power = power;
        this.shield = shield;
    }

    public abstract void eats();

    public void tackle() {
        System.out.println(name + " performs tackle");
    }

    public void levelUp() {
        this.level++;
        System.out.println("Congratulations, " + name + " has now reached level " + level);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}

