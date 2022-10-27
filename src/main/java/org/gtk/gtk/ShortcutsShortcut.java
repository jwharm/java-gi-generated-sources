package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutsShortcut} represents a single keyboard shortcut or gesture
 * with a short text.
 * <p>
 * This widget is only meant to be used with {@code GtkShortcutsWindow}.
 */
public class ShortcutsShortcut extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public ShortcutsShortcut(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ShortcutsShortcut */
    public static ShortcutsShortcut castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutsShortcut(gobject.refcounted());
    }
}
