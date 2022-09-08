package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkAccessible` is an interface for describing UI elements for
 * Assistive Technologies.
 * 
 * Every accessible implementation has:
 * 
 *  - a “role”, represented by a value of the [enum@Gtk.AccessibleRole] enumeration
 *  - an “attribute”, represented by a set of [enum@Gtk.AccessibleState],
 *    [enum@Gtk.AccessibleProperty] and [enum@Gtk.AccessibleRelation] values
 * 
 * The role cannot be changed after instantiating a `GtkAccessible`
 * implementation.
 * 
 * The attributes are updated every time a UI element's state changes in
 * a way that should be reflected by assistive technologies. For instance,
 * if a `GtkWidget` visibility changes, the %GTK_ACCESSIBLE_STATE_HIDDEN
 * state will also change to reflect the [property@Gtk.Widget:visible] property.
 */
public interface Accessible extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Retrieves the `GtkAccessibleRole` for the given `GtkAccessible`.
     */
    public default AccessibleRole getAccessibleRole() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_accessible_get_accessible_role(HANDLE());
        return AccessibleRole.fromValue(RESULT);
    }
    
    /**
     * Resets the accessible @property to its default value.
     */
    public default void resetProperty(AccessibleProperty property) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_accessible_reset_property(HANDLE(), property.getValue());
    }
    
    /**
     * Resets the accessible @relation to its default value.
     */
    public default void resetRelation(AccessibleRelation relation) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_accessible_reset_relation(HANDLE(), relation.getValue());
    }
    
    /**
     * Resets the accessible @state to its default value.
     */
    public default void resetState(AccessibleState state) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_accessible_reset_state(HANDLE(), state.getValue());
    }
    
    class AccessibleImpl extends org.gtk.gobject.Object implements Accessible {
        public AccessibleImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
