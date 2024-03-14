package File_perpustakaan;

import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan("Judul Default", "Penulis Default", 0, "Sinopsis Default");
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.printf("=======[ Selamat Datang di Perpustakaan]=======\n"

                    + "Masukkan pilihan anda untuk melihat buku berdasarkan kategori\n"
                    + "1. Teknologi\n" + "2. Filsafat\n" + "3. Sejarah\n" + "4. Agama\n"
                    + "5. Psikologi\n" + "6. Politik\n" + "7. Fiksi\n"
                    + "8. Tampilkan total buku yang tersedia\n" + "9. Keluar dari program\n");
            System.out.println("Silahkan menginputkan kode yang diinginkan(1-9)");

            int code = scan.nextInt();
            if (code == 1) {
                Perpustakaan[] Teknologi = {
                        new Perpustakaan(
                                "The Age of Surveillance Capitalism: The Fight for a Human Future at the New Frontier of Power",
                                "Shoshana Zuboff", 704,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 464,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan(
                                "The Innovators: How a Group of Hackers, Geniuses, and Geeks Created the Digital Revolution",
                                "Walter Isaacson", 560,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan(
                                "Weapons of Math Destruction: How Big Data Increases Inequality and Threatens Democracy",
                                "Cathy O'Neil", 272,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("AI Superpowers: China, Silicon Valley, and the New World Order", "Kai-Fu Lee",
                                272,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?")
                };
                perpus.kategori(Teknologi);
            } else if (code == 2) {
                Perpustakaan[] Filsafat = {
                        new Perpustakaan("The Philosophy Book: Big Ideas Simply Explained", "DK", 352,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("Justice: What's the Right Thing to Do?", "Michael J. Sandel", 320,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("The Big Questions: A Short Introduction to Philosophy",
                                "Robert C. Solomon, Kathleen M. Higgins", 336,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("Thinking, Fast and Slow", "Daniel Kahneman", 512,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("The Consolations of Philosophy", "Alain de Botton", 272,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?")
                };
                perpus.kategori(Filsafat);
            } else if (code == 3) {
                Perpustakaan[] Sejarah = {
                        new Perpustakaan("A People's History of the United States", "Howard Zinn", 784,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("Guns, Germs, and Steel: The Fates of Human Societies", "Jared Diamond", 480,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 464,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("The Rise and Fall of the Third Reich: A History of Nazi Germany",
                                "William L. Shirer", 1280,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("The Silk Roads: A New History of the World", "Peter Frankopan", 672,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?")
                };
                perpus.kategori(Sejarah);
            } else if (code == 4) {
                Perpustakaan[] Agama = {
                        new Perpustakaan("The God Delusion", "Richard Dawkins", 464,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("Zealot: The Life and Times of Jesus of Nazareth", "Reza Aslan", 336,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan(
                                "The Case for Christ: A Journalist's Personal Investigation of the Evidence for Jesus",
                                "Lee Strobel", 336,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("Waking Up: A Guide to Spirituality Without Religion", "Sam Harris", 256,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("Why Religion?: A Personal Story", "Elaine Pagels", 256,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?")
                };
                perpus.kategori(Agama);
            } else if (code == 5) {
                Perpustakaan[] Psikologi = {
                        new Perpustakaan("Thinking, Fast and Slow", "Daniel Kahneman", 512,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("The Power of Habit: Why We Do What We Do in Life and Business",
                                "Charles Duhigg", 400,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("Quiet: The Power of Introverts in a World That Can't Stop Talking",
                                "Susan Cain", 352,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("Blink: The Power of Thinking Without Thinking", "Malcolm Gladwell", 296,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("Emotional Intelligence: Why It Can Matter More Than IQ", "Daniel Goleman",
                                384,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?")
                };
                perpus.kategori(Psikologi);
            } else if (code == 6) {
                Perpustakaan[] Politik = {
                        new Perpustakaan("The Righteous Mind: Why Good People are Divided by Politics and Religion",
                                "Jonathan Haidt", 512,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("The End of History and the Last Man", "Francis Fukuyama", 464,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("The New Jim Crow: Mass Incarceration in the Age of Colorblindness",
                                "Michelle Alexander", 352,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("How Democracies Die", "Steven Levitsky, Daniel Ziblatt", 320,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("On Tyranny: Twenty Lessons from the Twentieth Century", "Timothy Snyder", 128,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?")
                };
                perpus.kategori(Politik);
            } else if (code == 7) {
                Perpustakaan[] Fiksi = {
                        new Perpustakaan("The Night Circus", "Erin Morgenstern", 400,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("The Goldfinch", "Donna Tartt", 771,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("Circe", "Madeline Miller", 400,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("The Underground Railroad", "Colson Whitehead", 336,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?"),
                        new Perpustakaan("Normal People", "Sally Rooney", 288,
                                "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?")
                };
                perpus.kategori(Fiksi);
            } else if (code == 8) {
                break;
            } else {
                System.out.println("Mohon maaf, kode yang Anda masukkan tidak valid.");
            }
        }

        scan.close();
    }
}