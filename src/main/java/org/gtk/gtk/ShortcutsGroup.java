package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkShortcutsGroup} represents a group of related keyboard shortcuts
 * or gestures.
 * <p>
 * The group has a title. It may optionally be associated with a view
 * of the application, which can be used to show only relevant shortcuts
 * depending on the application context.
 * <p>
 * This widget is only meant to be used with {@link ShortcutsWindow}.
 */
public class ShortcutsGroup extends Box implements Accessible, Buildable, ConstraintTarget, Orientable {

    public ShortcutsGroup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ShortcutsGroup */
    public static ShortcutsGroup castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutsGroup(gobject.refcounted());
    }
    
}
