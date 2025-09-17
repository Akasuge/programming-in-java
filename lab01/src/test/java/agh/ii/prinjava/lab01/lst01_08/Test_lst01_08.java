package agh.ii.prinjava.lab01.lst01_08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void testEagerSingleton() {
        EagerSingleton s1 = EagerSingleton.getInstance();
        EagerSingleton s2 = EagerSingleton.getInstance();
        assertSame(s1, s2);
    }

    @Test
    void testLazySingleton() {
        LazySingleton s1 = LazySingleton.getInstance();
        LazySingleton s2 = LazySingleton.getInstance();
        assertSame(s1, s2);
    }

    @Test
    void testUnsafeSingleton() {
        UnsafeSingleton s1 = UnsafeSingleton.getInstance();
        UnsafeSingleton s2 = UnsafeSingleton.getInstance();
        assertSame(s1, s2);
    }
}
