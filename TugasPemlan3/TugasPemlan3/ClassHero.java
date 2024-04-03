package TugasPemlan3;

import java.util.Scanner;

public class ClassHero {
    private String name;
    private double hp;
    private double attack;
    private double defense;

    public ClassHero(String name, double hp, double attack, double defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public ClassHero() {
        this.name = "";
        this.hp = 0;
        this.attack = 0;
        this.defense = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }
}
