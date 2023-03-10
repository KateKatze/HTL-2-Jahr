package at.htlpinkafeld.intmem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntMemoryTest {
    //variablen für fixture
    private IntMemory intMem0;
    private IntMemory intMem3;

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
}