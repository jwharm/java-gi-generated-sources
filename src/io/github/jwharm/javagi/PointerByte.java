package io.github.jwharm.javagi;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.ValueLayout;

/**
 * A pointer to a byte value.
 * Use {@code new PointerByte()} to create an instance, and
 * use {@link #get()} afterwards to retreive the results.
 */
public class PointerByte extends Pointer {

    /**
     * Create the pointer. It does not point to a specific value.
     */
    public PointerByte() {
        super(ValueLayout.JAVA_BYTE);
    }

    /**
     * Create a pointer to an existing memory address.
     */
    public PointerByte(MemoryAddress address) {
        super(address);
    }

    /**
     * Create the pointer and point it to the given initial value.
     */
    public PointerByte(byte initialValue) {
        this();
        address.set(ValueLayout.JAVA_BYTE, 0, initialValue);
    }

    /**
     * Use this mehod to set the value that the pointer points to.
     */
    public void set(byte value) {
        address.set(ValueLayout.JAVA_BYTE, 0, value);
    }
    
    /**
     * Use this method to retreive the value of the parameter after the
     * function call that set the value, has been executed.
     */
    public int get() {
        return address.get(ValueLayout.JAVA_BYTE, 0);
    }
    
}
