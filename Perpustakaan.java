package File_perpustakaan;

public class Perpustakaan {
        public String[][] Teknologi = {
                        { "Clean Architecture: A Craftsman's Guide to Software Structure and Design",
                                        "Robert C. Martin", "432", " Prentice Hall", "2017" },
                        { "The Pragmatic Programmer: Your Journey to Mastery", "Andrew Hunt, David Thomas", "352",
                                        " Addison-Wesley", "1999" },
                        { "The Innovators: How a Group of Hackers, Geniuses, and Geeks Created the Digital Revolution",
                                        "Walter Isaacson", "560", "Simon & Schuster", "2014" },
                        { "Artificial Intelligence: A Modern Approach", "Stuart Russell, Peter Norvig",
                                        "1152", "Pearson", "2009" },
                        { "AI Superpowers: China, Silicon Valley, and the New World Order", "Kai-Fu Lee", "272",
                                        "Houghton Mifflin Harcourt", "2018" }
        };

        public String[][] Filsafat = {
                        { "Meditations", "Marcus Aurelius", "Varied (tergantung edisi)", "Various", "2011" },
                        { "Sophie's World", "Jostein Gaarder", "513", "Farrar, Straus and Giroux",
                                        "1991" },
                        { "The Big Questions: A Short Introduction to Philosophy",
                                        "Robert C. Solomon, Kathleen M. Higgins", "336",
                                        "Cengage Learning", "2008" },
                        { "Being and Time", "Martin Heidegger", " Varied (tergantung edisi)", "Various", "1927" },
                        { "The Consolations of Philosophy", "Alain de Botton", "272", "Penguin Books", "2000" }
        };

        public String[][] Sejarah = {
                        { "A People's History of the United States", "Howard Zinn", "784",
                                        "Harper Perennial Modern Classics",
                                        "1980" },
                        { "SPQR: A History of Ancient Rome", "Mary Beard", "608 ",
                                        "Liveright", "2015" },
                        { "Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "464", "Harper", "2014" },
                        { "The Rise and Fall of the Third Reich: A History of Nazi Germany", "William L. Shirer",
                                        "1280 halaman",
                                        "Simon & Schuster", "1960" },
                        { "The Silk Roads: A New History of the World", "Peter Frankopan", "672",
                                        "Bloomsbury Publishing", "2015" }
        };

        public String[][] Agama = {
                        { "The God Delusion", "Richard Dawkins", "464", "Bantam Press", "2006" },
                        { "Zealot: The Life and Times of Jesus of Nazareth", "Reza Aslan", "336", "Random House",
                                        "2013" },
                        { "The Case for Christ: A Journalist's Personal Investigation of the Evidence for Jesus",
                                        "Lee Strobel",
                                        "336", "Zondervan", "1998" },
                        { "Waking Up: A Guide to Spirituality Without Religion", "Sam Harris", "256",
                                        "Simon & Schuster", "2014" },
                        { "Why Religion?: A Personal Story", "Elaine Pagels", "256", "Ecco", "2018" }
        };

        public String[][] Psikologi = {
                        { "Man's Search for Meaning", "Viktor E. Frankl", "165", " Beacon Press", "1959" },
                        { "The Power of Habit: Why We Do What We Do in Life and Business", "Charles Duhigg", "400",
                                        "Random House",
                                        "2012" },
                        { "Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", "352",
                                        "Crown Publishing Group", "2012" },
                        { "Blink: The Power of Thinking Without Thinking", "Malcolm Gladwell", "296",
                                        "Little, Brown and Company",
                                        "2005" },
                        { "Influence: The Psychology of Persuasion", " Robert B. Cialdini", " 336", "HarperCollins",
                                        "2006" }
        };

        public String[][] Politik = {
                        { "The Prince", "Niccolò Machiavelli", "Varied (tergantung edisi)",
                                        "Various", "1532" },
                        { "The Road to Serfdom", "Friedrich Hayek", "283", "University of Chicago Press", "1944" },
                        { "The New Jim Crow: Mass Incarceration in the Age of Colorblindness", "Michelle Alexander",
                                        "352",
                                        "The New Press", "2010" },
                        { "How Democracies Die", "Steven Levitsky, Daniel Ziblatt", "320", "Crown Publishing Group",
                                        "2018" },
                        { "On Tyranny: Twenty Lessons from the Twentieth Century", "Timothy Snyder", "128",
                                        "Tim Duggan Books",
                                        "2017" }
        };

        public String[][] Fiksi = {
                        { "The Kite Runner", " Khaled Hosseini", " 391", "Riverhead Books", "2003" },
                        { "The Hunger Games", "Suzanne Collins", "374", "Scholastic Press", "2008" },
                        { "The Girl with the Dragon Tattoo", "Stieg Larsson", "465", " Norstedts Förlag", "2005" },
                        { "The Road", "Cormac McCarthy", "287", "Alfred A. Knopf", "2006" },
                        { "The Alchemist", "Paulo Coelho", "197", "HarperCollins", "1988" }
        };

        public void showtype(String[][] type, String categoryType) {
                System.out.printf("Kategori %s\n\n", categoryType);
                for (int i = 0; i < type.length; i++) {
                        System.out.printf("Buku ke-%d\n"
                                        + "1. %-15s: %s\n" + "2. %-15s: %s\n" + "3. %-15s: %s halaman\n"
                                        + "4. %-15s: %s\n" + "5. %-15s: %s\n\n",
                                        i + 1, "Judul Buku", type[i][0], "Penulis", type[i][1], "Jumlah Halaman",
                                        type[i][2],
                                        "Penerbit", type[i][3], "Tahun Terbit", type[i][4]);
                }
        }
}
