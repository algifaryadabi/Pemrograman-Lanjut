package TugasPemlan3;

public class ClassHero {
    private String name;
    private int healthPoint;
    private int attack;
    private int defense;

    public ClassHero(String name, int healthPoint, int attack, int defense) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public void attack(ClassHero enemy) {
        int damageDealt = Math.max(0, this.attack - enemy.getDefense());
        enemy.healthPoint -= damageDealt;
        System.out.println(this.name + " menyerang " + enemy.getName());
        System.out.println(this.name + " menyerang sebesar " + this.attack);
        System.out.println(enemy.getName() + " memiliki pertahanan sebesar " + enemy.getDefense());
        System.out.println("Health " + enemy.getName() + " saat ini " + enemy.getHealthPoint());
    }
}