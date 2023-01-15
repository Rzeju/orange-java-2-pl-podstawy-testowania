package pl.sda.zad19;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Szymborska", "Polish");
        Author author2 = new Author("Saarikoski", "Finland");
        Author author3 = new Author("Kawafis", "Greece");

        Poem poem1 = new Poem(author1, 10);
        Poem poem2 = new Poem(author1, 20);
        Poem poem3 = new Poem(author1, 30);
        Poem poem4 = new Poem(author2, 90);
        Poem poem5 = new Poem(author2, 80);
        Poem poem6 = new Poem(author3, 50);
        Poem poem7 = new Poem(author3, 15);

        Poem[] poems = new Poem[7];
        poems[0] = poem1;
        poems[1] = poem2;
        poems[2] = poem3;
        poems[3] = poem4;
        poems[4] = poem5;
        poems[5] = poem6;
        poems[6] = poem7;

        Poem theLongestPoem = poems[0];
        for (int i = 1; i < poems.length; i++) {
            if (poems[i].getStropheNumber() > theLongestPoem.getStropheNumber()) {
                theLongestPoem = poems[i];
            }
        }

        System.out.println("Najdłuższy poem napisał -> " + theLongestPoem.getCreator().getSurname());


        System.out.println(author1);
        System.out.println(poem1);
    }
}

