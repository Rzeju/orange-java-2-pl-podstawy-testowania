import org.junit.jupiter.api.*;

public class TestLifeCycle {

    @BeforeAll
    static void setUpCaseTestCase() {
        System.out.println("BeforeAll -> Wykonuje się raz, przed wszystkimi testami");
    }

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach -> Wykonuje się przez każdym testem");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach -> Wykonuje się po każdym teście");
    }

    @AfterAll
    static void tearDownTestCase() {
        System.out.println("AfterAll -> Wykonuje się raz, po wszystkich testach");
    }

    @Test
    void firstTest() {
        System.out.println("Wykonuje się pierwszy test...");
    }

    @Test
    void secondTest() {
        System.out.println("Wykonuje się drugi test...");
    }

}
