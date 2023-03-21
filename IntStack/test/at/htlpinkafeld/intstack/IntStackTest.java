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

    @Test
    void isEmpty() {
        assertTrue(minStack.isEmpty());
        minStack.push(19);
        assertFalse(minStack.isEmpty());
    }

    @Test
    void pop() {
        assertEquals(0, minStack.getEleCnt());
        minStack.push(10);
        assertEquals(1, minStack.getEleCnt());
        assertEquals(minStack.pop(), 10);
        assertEquals(0, minStack.getEleCnt());
    }

    @Test
    void peek() {
        tenStack.push(3);
        assertEquals(tenStack.peek(), 3);
        assertThrows(ArrayIndexOutOfBoundsException.class,()->minStack.peek(),"Peek exception");
    }

    @Test
    void resize() {
        assertEquals(minStack.getSize(), 1);
        assertTrue(minStack.resize(3));
        assertEquals(minStack.getSize(), 3);
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        assertThrows(IllegalArgumentException.class,()->minStack.resize(0));
        assertEquals(minStack.pop(),3);
        assertTrue(minStack.resize(2));
    }

    @Test
    void testToString() {
        assertEquals(tenStack.toString(), "[]");
        tenStack.push(1);
        tenStack.push(2);
        tenStack.push(3);
        tenStack.push(4);
        tenStack.push(5);
        assertEquals(tenStack.toString(), "[1, 2, 3, 4, 5]");
        tenStack.pop();
        tenStack.pop();
        assertEquals(tenStack.toString(), "[1, 2, 3]");
    }
}