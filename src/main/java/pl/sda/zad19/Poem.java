package pl.sda.zad19;

public class Poem {

    private Author creator;
    private int stropheNumber;

    public Poem(Author creator, int stropheNumber) {
        this.creator = creator;
        this.stropheNumber = stropheNumber;
    }

    public Author getCreator() {
        return creator;
    }

    public int getStropheNumber() {
        return stropheNumber;
    }

    public void setStropheNumber(int stropheNumber) {
        this.stropheNumber = stropheNumber;
    }

    public static String getSurnameForTheLongestPoem(Poem[] poems) {
        Poem theLongestPoem = poems[0];
        for (int i = 1; i < poems.length; i++) {
            if (poems[i].getStropheNumber() > theLongestPoem.getStropheNumber()) {
                theLongestPoem = poems[i];
            }
        }

        return theLongestPoem.getCreator().getSurname();
    }

    @Override
    public String toString() {
        return "Poem{" +
                "creator=" + creator +
                ", stropheNumber=" + stropheNumber +
                '}';
    }
}
