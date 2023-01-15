package pl.sda.zad19;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static pl.sda.zad19.Poem.getSurnameForTheLongestPoem;

public class PoemAndAuthorTest {

    @Test
    void theLongestPoemTest() {

        //given
        Author author1 = new Author("Szymborska", "Polish");
        Author author2 = new Author("Saarikoski", "Finland");
        Author author3 = new Author("Kawafis", "Greece");

        Poem poem1 = new Poem(author1, 10);
        Poem poem2 = new Poem(author1, 20);
        Poem poem3 = new Poem(author1, 30);
        Poem poem4 = new Poem(author2, 90);
        Poem poem5 = new Poem(author2, 80);
        Poem poem6 = new Poem(author3, 50);

        Poem[] poems = new Poem[6];
        poems[0] = poem1;
        poems[1] = poem2;
        poems[2] = poem3;
        poems[3] = poem4;
        poems[4] = poem5;
        poems[5] = poem6;

        //when
        String result = getSurnameForTheLongestPoem(poems);

        //then
        assertThat(result)
                .isEqualTo("Saarikoski")
                .isEqualTo(author2.getSurname())
                .startsWith("Sa");
    }

    @Test
    void authorEqualsMethodTestWithFalseResult() {
        //given
        Author author1 = new Author("Kowalski", "Polish");
        Author author2 = new Author("Johnson", "USA");

        //when
        boolean result = author1.equals(author2);

        //then
        assertThat(result)
                .isFalse();
    }

    @Test
    void authorEqualsMethodTestWithTrueResult() {
        //given
        Author author1 = new Author("Blabla", "Nowhere");
        Author author2 = new Author("Blabla", "Nowhere");

        //when
        boolean result = author2.equals(author1);

        //then
        assertThat(result)
                .isTrue();
    }

    @Test
    void authorToStringMethodTest() {
        //given
        Author author1 = new Author("Kowalski", "Polish");

        //when
        String result = author1.toString();

        //then
        assertThat(result)
                .contains("Kowalski")
                .contains("Polish")
                .startsWith("Author{")
                .endsWith("}")
                .contains(author1.getSurname())
                .contains(author1.getNationality());

        System.out.println(result);
    }
}
