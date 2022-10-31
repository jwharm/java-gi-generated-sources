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
}
