package io.github.jwharm.javagi;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.ValueLayout;

/**
 * A pointer to a char value.
 * Use {@code new PointerCharacter()} to create an instance, and
 * use {@link #get()} afterwards to retreive the results.
 */
public class PointerCharacter extends Pointer {

    /**
     * Create the pointer. It does not point to a specific value.
     */
    public PointerCharacter() {
        super(ValueLayout.JAVA_CHAR);
    }

    /**
     * Create a pointer to an existing memory address.
     */
    public PointerCharacter(MemoryAddress address) {
        super(address);
    }

    /**
     * Create the pointer and point it to the given initial value.
     */
    public PointerCharacter(char initialValue) {
        this();
        address.set(ValueLayout.JAVA_CHAR, 0, initialValue);
    }

    /**
     * Use this mehod to set the value that the pointer points to.
     */
    public void set(char value) {
        address.set(ValueLayout.JAVA_CHAR, 0, value);
    }
    
    /**
     * Use this method to retreive the value of the parameter after the
     * function call that set the value, has been executed.
     */
    public char get() {
        return address.get(ValueLayout.JAVA_CHAR, 0);
    }
    
}
