package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags to define future {@link TestDBus} behaviour.
 * @version 2.34
 */
public class TestDBusFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GTestDBusFlags";
    
    /**
     * No flags.
     */
    public static final TestDBusFlags NONE = new TestDBusFlags(0);
    
    public TestDBusFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public TestDBusFlags or(TestDBusFlags... masks) {
        int value = this.getValue();
        for (TestDBusFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TestDBusFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static TestDBusFlags combined(TestDBusFlags mask, TestDBusFlags... masks) {
        int value = mask.getValue();
        for (TestDBusFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TestDBusFlags(value);
    }
}
