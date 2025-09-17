package agh.ii.prinjava.lab01.lst01_09;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloTests {

    @Test
    void testHelloImmutableEquality() {
        HelloImmutable h1 = new HelloImmutable(1, "abc");
        HelloImmutable h2 = new HelloImmutable(1, "abc");

        assertEquals(h1, h2);
        assertEquals(h1.hashCode(), h2.hashCode());
    }

    @Test
    void testHelloImmutableGetters() {
        HelloImmutable h = new HelloImmutable(2, "xyz");
        assertEquals(2, h.getI1());
        assertEquals("xyz", h.getS1());
    }

    @Test
    void testHelloJavaRecordEquality() {
        HelloJavaRecord r1 = new HelloJavaRecord(1, "abc");
        HelloJavaRecord r2 = new HelloJavaRecord(1, "abc");

        assertEquals(r1, r2);
    }

    @Test
    void testHelloJavaRecordAccessors() {
        HelloJavaRecord r = new HelloJavaRecord(5, "hello");
        assertEquals(5, r.i1());
        assertEquals("hello", r.s1());
    }
}
