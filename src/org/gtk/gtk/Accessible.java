package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkAccessible</code> is an interface for describing UI elements for
 * Assistive Technologies.
 * <p>
 * Every accessible implementation has:
 * <p>
 *  - a &<code>#8220</code> role&<code>#8221</code> , represented by a value of the {@link [enum@Gtk.AccessibleRole] (ref=enum)} enumeration
 *  - an &<code>#8220</code> attribute&<code>#8221</code> , represented by a set of {@link [enum@Gtk.AccessibleState] (ref=enum)},
 *    {@link [enum@Gtk.AccessibleProperty] (ref=enum)} and {@link [enum@Gtk.AccessibleRelation] (ref=enum)} values
 * <p>
 * The role cannot be changed after instantiating a <code>GtkAccessible</code>
 * implementation.
 * <p>
 * The attributes are updated every time a UI element&<code>#39</code> s state changes in
 * a way that should be reflected by assistive technologies. For instance,
 * if a <code>GtkWidget</code> visibility changes, the {@link org.gtk.gtk.AccessibleState<code>#HIDDEN</code>  state will also change to reflect the {@link [property@Gtk.Widget:visible] (ref=property)} property.
 */
public interface Accessible extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Retrieves the <code>GtkAccessibleRole</code> for the given <code>GtkAccessible</code>.
     */
    public default AccessibleRole getAccessibleRole() {
        var RESULT = gtk_h.gtk_accessible_get_accessible_role(handle());
        return AccessibleRole.fromValue(RESULT);
    }
    
    /**
     * Resets the accessible @property to its default value.
     */
    public default void resetProperty(AccessibleProperty property) {
        gtk_h.gtk_accessible_reset_property(handle(), property.getValue());
    }
    
    /**
     * Resets the accessible @relation to its default value.
     */
    public default void resetRelation(AccessibleRelation relation) {
        gtk_h.gtk_accessible_reset_relation(handle(), relation.getValue());
    }
    
    /**
     * Resets the accessible @state to its default value.
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
