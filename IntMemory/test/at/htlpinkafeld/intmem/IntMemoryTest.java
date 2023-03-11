package at.htlpinkafeld.intmem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntMemoryTest {
    //variablen für fixture
    private IntMemory intMem0;
    private IntMemory intMem3;
    private IntMemory intMem7;

    @BeforeEach
    void setUp() {
        //Objekte erzeugen - FIXTURE
        intMem0 = new IntMemory();
        intMem3 = new IntMemory(3);
    }

    @Test
    void testConstructor(){
        int result = intMem0.getValue();
        assertEquals(0, result, "check default constructor");
        result = intMem3.getValue();
        assertEquals(3, result, "check int constructor");
    }

    @Test
    void testSetValue() {
        intMem0.setValue(5);
        int result = intMem0.getValue();
        assertEquals(5, result);
    }

    @Test
    void testAddValue(){
        intMem3.addValue(5);
        int result = intMem3.getValue();
        assertEquals(8, result, "Add 3 to 5");
    }

    @Test
    void testJoinValue(){
        IntMemory intMem7 = new IntMemory(7);
        IntMemory intMem;
        intMem = intMem3.join(intMem7);
        assertEquals(10, intMem.getValue(), "join: check sum");
        assertEquals(3, intMem3.getValue(), "join: check mem3");
        assertEquals(7, intMem7.getValue(), "join: check mem7");
    }
}