package TugasPemlan3;

import java.util.Scanner;

public class MainHero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ClassHero hero1 = new ClassHero();
        System.out.println("Inisiasi Hero Pertama:");
        System.out.print("Nama: ");
        hero1.setName(scanner.nextLine());
        System.out.print("HP: ");
        hero1.setHp(Double.parseDouble(scanner.nextLine()));
        System.out.print("Attack: ");
        hero1.setAttack(Double.parseDouble(scanner.nextLine()));
        System.out.print("Defense: ");
        hero1.setDefense(Double.parseDouble(scanner.nextLine()));

        System.out.println("\nInisiasi Hero Kedua:");
        System.out.print("Nama: ");
        String name = scanner.nextLine();
        System.out.print("HP: ");
        double hp = Double.parseDouble(scanner.nextLine());
        System.out.print("Attack: ");
        double attack = Double.parseDouble(scanner.nextLine());
        System.out.print("Defense: ");
        double defense = Double.parseDouble(scanner.nextLine());
        ClassHero hero2 = new ClassHero(name, hp, attack, defense);

        int round = 1;
        while (hero1.getHp() > 0 && hero2.getHp() > 0) {
            System.out.println("\nRonde " + round + ":");
            System.out.println(hero1.getName() + " menyerang " + hero2.getName());
            double damageDealt = Math.max(0, hero1.getAttack() - hero2.getDefense());
            hero2.setHp(hero2.getHp() - damageDealt);
            System.out.println(hero2.getName() + " tersisa " + hero2.getHp() + " HP");

            if (hero2.getHp() <= 0) {
                break;
            }

            System.out.println(hero2.getName() + " menyerang " + hero1.getName());
            double damageReceived = Math.max(0, hero2.getAttack() - hero1.getDefense());
            hero1.setHp(hero1.getHp() - damageReceived);
            System.out.println(hero1.getName() + " tersisa " + hero1.getHp() + " HP");

            round++;
        }
    }
}