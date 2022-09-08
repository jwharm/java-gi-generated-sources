package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkShortcutsShortcut` represents a single keyboard shortcut or gesture
 * with a short text.
 * 
 * This widget is only meant to be used with `GtkShortcutsWindow`.
 */
public class ShortcutsShortcut extends Widget implements Accessible, Buildable, ConstraintTarget {

    public ShortcutsShortcut(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ShortcutsShortcut */
    public static ShortcutsShortcut castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutsShortcut(gobject.getReference());
    }
    
}
