package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkAccessible} is an interface for describing UI elements for
 * Assistive Technologies.
 * <p>
 * Every accessible implementation has:
 * <p>
 * <ul>
 * <li>a “role”, represented by a value of the {@code Gtk.AccessibleRole} enumeration
 * <li>an “attribute”, represented by a set of {@code Gtk.AccessibleState},
 *    {@code Gtk.AccessibleRelation} values
 * </ul>
 * <p>
 * The role cannot be changed after instantiating a {@code GtkAccessible}
 * implementation.
 * <p>
 * The attributes are updated every time a UI element's state changes in
 * a way that should be reflected by assistive technologies. For instance,
 * if a {@code GtkWidget} visibility changes, the {@link AccessibleState#HIDDEN}
 * state will also change to reflect the {@code Gtk.Widget:visible} property.
 */
public interface Accessible extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Retrieves the {@code GtkAccessibleRole} for the given {@code GtkAccessible}.
     */
    public default AccessibleRole getAccessibleRole() {
        var RESULT = gtk_h.gtk_accessible_get_accessible_role(handle());
        return AccessibleRole.fromValue(RESULT);
    }
    
    /**
     * Resets the accessible {@code property} to its default value.
     */
    public default void resetProperty(AccessibleProperty property) {
        gtk_h.gtk_accessible_reset_property(handle(), property.getValue());
    }
    
    /**
     * Resets the accessible {@code relation} to its default value.
     */
    public default void resetRelation(AccessibleRelation relation) {
        gtk_h.gtk_accessible_reset_relation(handle(), relation.getValue());
    }
    
    /**
     * Resets the accessible {@code state} to its default value.
     */
    public default void resetState(AccessibleState state) {
        gtk_h.gtk_accessible_reset_state(handle(), state.getValue());
    }
    
    class AccessibleImpl extends org.gtk.gobject.Object implements Accessible {
        public AccessibleImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
