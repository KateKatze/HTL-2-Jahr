package at.htlpinkafeld.intstack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntStackTest {
    private IntStack minStack;
    private IntStack tenStack;
    @BeforeEach
    void setUp() {
            minStack = new IntStack();
            tenStack = new IntStack(10);
    }

    @Test
    void testSize(){
            assertEquals(1, minStack.getSize(), "min size");
            assertEquals(10, tenStack.getSize(), "10 size");
            IntStack nullStack = new IntStack(0);
            assertEquals(1, nullStack.getSize(), "null stack");
    }

    @Test
    void testIsFull(){
            assertFalse(minStack.isFull());
            minStack.push(55);
            assertTrue(minStack.isFull());
    }
    @Test
    void testPushOverflow(){
            minStack.push(10);
           // minStack.push(11);
            assertThrows(ArrayIndexOutOfBoundsException.class, () -> minStack.push(11), "throw Exception"); // ()->funktion aufruf
    }

    @Test
    void testGetEleCnt(){
        minStack.push(1);
        assertEquals(1, minStack.getEleCnt());
    }
}