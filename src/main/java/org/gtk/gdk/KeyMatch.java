package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes how well an event matches a given keyval and modifiers.
 * <p>
 * {@code GdkKeyMatch} values are returned by {@link KeyEvent#matches}.
 */
public class KeyMatch extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * The key event does not match
     */
    public static final KeyMatch NONE = new KeyMatch(0);
    
    /**
     * The key event matches if keyboard state
     *   (specifically, the currently active group) is ignored
     */
    public static final KeyMatch PARTIAL = new KeyMatch(1);
    
    /**
     * The key event matches
     */
    public static final KeyMatch EXACT = new KeyMatch(2);
    
    public KeyMatch(int value) {
        super(value);
    }
}
