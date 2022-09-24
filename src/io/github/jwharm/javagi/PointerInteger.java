package io.github.jwharm.javagi;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.ValueLayout;

/**
 * A pointer to an int value.
 * Use {@code new PointerInteger()} to create an instance, and
 * use {@link #get()} afterwards to retreive the results.
 */
public class PointerInteger extends Pointer {

    /**
     * Create the pointer. It does not point to a specific value.
     */
    public PointerInteger() {
        super(ValueLayout.JAVA_INT);
    }
    
    /**
     * Create a pointer to an existing memory address.
     */
    public PointerInteger(MemoryAddress address) {
        super(address);
    }

    /**
     * Create the pointer and point it to the given initial value.
     */
    public PointerInteger(int initialValue) {
        this();
        address.set(ValueLayout.JAVA_INT, 0, initialValue);
    }

    /**
     * Use this mehod to set the value that the pointer points to.
     */
    public void set(int value) {
        address.set(ValueLayout.JAVA_INT, 0, value);
    }
    
    /**
     * Use this method to retreive the value of the parameter after the
     * function call that set the value, has been executed.
     */
    public int get() {
        return address.get(ValueLayout.JAVA_INT, 0);
    }
    
}
