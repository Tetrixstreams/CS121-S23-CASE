
public class Pokemon {

    private String name, move;
    private int hp, power, speed;

    public Pokemon(String name, int hp, String move, int power, int speed) {
        this.name = name;
        this.hp = hp;
        this.move = move;
        this.power = power;
        this.speed = speed;

    }

    public String getname() {
        return this.name;
    }

    public int gethp() {
        return this.hp;
    }

    public String getmove() {
        return this.move;
    }

    public int getpower() {
        return this.power;
    }

    public int getspeed() {
        return this.speed;
    }

    public String setname() {
        return this.name;
    }

    public int sethp() {
        return this.hp;
    }

    public String setmove() {
        return this.move;
    }

    public int setpower() {
        return this.power;
    }

    public int setspeed() {
        return this.speed;
    }

    public String displayPokemonStats() {
        return String.format("Name: %s \nhealth Points: %d \nMoves: %s \nPower: %d \nSpeed: %d", name, hp, move, power, speed);
    }
}