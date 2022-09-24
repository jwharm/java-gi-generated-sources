package io.github.jwharm.javagi;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.ValueLayout;

/**
 * A pointer to a boolean value.
 * Use {@code new PointerBoolean()} to create an instance, and
 * use {@link #get()} afterwards to retreive the results.
 */
public class PointerBoolean extends Pointer {

    /**
     * Create the pointer. It does not point to a specific value.
     */
    public PointerBoolean() {
        super(ValueLayout.JAVA_INT);
    }

    /**
     * Create a pointer to an existing memory address.
     */
    public PointerBoolean(MemoryAddress address) {
        super(address);
    }

    /**
     * Create the pointer and point it to the given initial value.
     */
    public PointerBoolean(boolean initialValue) {
        this();
        address.set(ValueLayout.JAVA_INT, 0, initialValue ? 1 : 0);
    }

    /**
     * Use this mehod to set the value that the pointer points to.
     */
    public void set(boolean value) {
        address.set(ValueLayout.JAVA_INT, 0, value ? 1 : 0);
    }
    
    /**
     * Use this method to retreive the value that the pointer points to.
     */
    public boolean get() {
        return address.get(ValueLayout.JAVA_INT, 0) != 0;
    }
    
}
