package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkShortcutsGroup` represents a group of related keyboard shortcuts
 * or gestures.
 * 
 * The group has a title. It may optionally be associated with a view
 * of the application, which can be used to show only relevant shortcuts
 * depending on the application context.
 * 
 * This widget is only meant to be used with [class@Gtk.ShortcutsWindow].
 */
public class ShortcutsGroup extends Box implements Accessible, Buildable, ConstraintTarget, Orientable {

    public ShortcutsGroup(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ShortcutsGroup */
    public static ShortcutsGroup castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutsGroup(gobject.getProxy());
    }
    
}
