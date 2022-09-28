package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkShortcutsShortcut} represents a single keyboard shortcut or gesture
 * with a short text.
 * <p>
 * This widget is only meant to be used with {@code GtkShortcutsWindow}.
 */
public class ShortcutsShortcut extends Widget implements Accessible, Buildable, ConstraintTarget {

    public ShortcutsShortcut(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ShortcutsShortcut */
    public static ShortcutsShortcut castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutsShortcut(gobject.getReference());
    }
    
}
