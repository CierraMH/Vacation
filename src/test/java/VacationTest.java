import org.junit.jupiter.api.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

class VacationTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }
    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }
    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("After all test methods");
    }

    @Test
    @DisplayName("vacation() method test")
    void vacation() {
        assertEquals("I'd like to visit \nTokyo \nJapan", Vacation.vacation("I'd like to visit \nTokyo \nJapan"));
    }
}