package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes where {@link Shortcut}s added to a
 * {@link ShortcutController} get handled.
 */
public class ShortcutScope extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Shortcuts are handled inside
     *   the widget the controller belongs to.
     */
    public static final ShortcutScope LOCAL = new ShortcutScope(0);
    
    /**
     * Shortcuts are handled by
     *   the first ancestor that is a {@code ShortcutManager}
     */
    public static final ShortcutScope MANAGED = new ShortcutScope(1);
    
    /**
     * Shortcuts are handled by
     *   the root widget.
     */
    public static final ShortcutScope GLOBAL = new ShortcutScope(2);
    
    public ShortcutScope(int value) {
        super(value);
    }
}
