package TugasPemlan3;

import java.util.Scanner;

public class MainHero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Permainan Adu Hero");
        System.out.println("Player 1 : Silahkan masukkan Hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("============================");
        System.out.print("Nama Hero           : ");
        String name1 = scanner.nextLine();
        System.out.print("Health Point         : ");
        int healthPoint1 = scanner.nextInt();
        System.out.print("Attack                     : ");
        int attack1 = scanner.nextInt();
        System.out.print("Defense                 : ");
        int defense1 = scanner.nextInt();
        ClassHero player1 = new ClassHero(name1, healthPoint1, attack1, defense1);

        System.out.println("\nPermainan Adu Hero");
        System.out.println("Player 2 : Silahkan masukkan Hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("============================");
        System.out.print("Nama Hero           : ");
        scanner.nextLine();
        String name2 = scanner.nextLine();
        System.out.print("Health Point         : ");
        int healthPoint2 = scanner.nextInt();
        System.out.print("Attack                     : ");
        int attack2 = scanner.nextInt();
        System.out.print("Defense                 : ");
        int defense2 = scanner.nextInt();
        ClassHero player2 = new ClassHero(name2, healthPoint2, attack2, defense2);

        System.out.println("\n=================================================");
        System.out.println("=================================================");
        int round = 1;
        while (player1.getHealthPoint() > 0 && player2.getHealthPoint() > 0) {
            System.out.println("Ronde " + round);
            player1.attack(player2);
            player2.attack(player1);
            System.out.println("\n=================================================");
            System.out.println("=================================================");
            round++;
        }

        if (player1.getHealthPoint() <= 0) {
            System.out.println(player2.getName() + " memenangkan pertarungan!");
        } else {
            System.out.println(player1.getName() + " memenangkan pertarungan!");
        }
        scanner.close();
    }
}