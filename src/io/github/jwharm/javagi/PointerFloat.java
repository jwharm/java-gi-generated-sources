package io.github.jwharm.javagi;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.ValueLayout;

/**
 * A pointer to a float value.
 * Use {@code new PointerFloat()} to create an instance, and
 * use {@link #get()} afterwards to retreive the results.
 */
public class PointerFloat extends Pointer {

    /**
     * Create the pointer. It does not point to a specific value.
     */
    public PointerFloat() {
        super(ValueLayout.JAVA_FLOAT);
    }

    /**
     * Create a pointer to an existing memory address.
     */
    public PointerFloat(MemoryAddress address) {
        super(address);
    }

    /**
     * Create the pointer and point it to the given initial value.
     */
    public PointerFloat(float initialValue) {
        this();
        address.set(ValueLayout.JAVA_FLOAT, 0, initialValue);
    }

    /**
     * Use this mehod to set the value that the pointer points to.
     */
    public void set(float value) {
        address.set(ValueLayout.JAVA_FLOAT, 0, value);
    }
    
    /**
     * Use this method to retreive the value of the parameter after the
     * function call that set the value, has been executed.
     */
    public float get() {
        return address.get(ValueLayout.JAVA_FLOAT, 0);
    }
    
}
