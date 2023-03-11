package at.htlpinkafeld.intstack;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class IntStackTest {
    private IntStack minStack;
    private IntStack tenStack;
    @BeforeEach
    void setUp() {
        minStack = new IntStack();
        tenStack = new IntStack(10);
    }
}