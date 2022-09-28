package org.gtk.gio;

/**
 * Flags to define future {@link TestDBus} behaviour.
 */
public class TestDBusFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags.
     */
    public static final TestDBusFlags NONE = new TestDBusFlags(0);
    
    public TestDBusFlags(int value) {
        super(value);
    }
    
}
