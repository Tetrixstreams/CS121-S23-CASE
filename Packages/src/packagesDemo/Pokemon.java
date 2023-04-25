package packagesDemo;

public class Pokemon {
    String name, type;

    private int damage, health;



    public Pokemon(String name, String type, int damage, int health) {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.health = health;
    }

    public String name(){
        return this.name;
    }
    public String type() {
        return this.type;
    }
    int damage() {
        return this.damage;
    }
    int health() {
        return this.damage;
    }
}
