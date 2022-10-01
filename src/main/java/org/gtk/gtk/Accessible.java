package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
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
public interface Accessible extends io.github.jwharm.javagi.Proxy {

    /**
     * Retrieves the {@code GtkAccessibleRole} for the given {@code GtkAccessible}.
     */
    public default AccessibleRole getAccessibleRole() {
        var RESULT = gtk_h.gtk_accessible_get_accessible_role(handle());
        return new AccessibleRole(RESULT);
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
    
    /**
     * Updates an array of accessible properties.
     * <p>
     * This function should be called by {@code GtkWidget} types whenever an accessible
     * property change must be communicated to assistive technologies.
     * <p>
     * This function is meant to be used by language bindings.
     */
    public default void updatePropertyValue(int nProperties, AccessibleProperty[] properties, org.gtk.gobject.Value[] values) {
        gtk_h.gtk_accessible_update_property_value(handle(), nProperties, Interop.allocateNativeArray(AccessibleProperty.getValues(properties)).handle(), Interop.allocateNativeArray(values).handle());
    }
    
    /**
     * Updates an array of accessible relations.
     * <p>
     * This function should be called by {@code GtkWidget} types whenever an accessible
     * relation change must be communicated to assistive technologies.
     * <p>
     * This function is meant to be used by language bindings.
     */
    public default void updateRelationValue(int nRelations, AccessibleRelation[] relations, org.gtk.gobject.Value[] values) {
        gtk_h.gtk_accessible_update_relation_value(handle(), nRelations, Interop.allocateNativeArray(AccessibleRelation.getValues(relations)).handle(), Interop.allocateNativeArray(values).handle());
    }
    
    /**
     * Updates an array of accessible states.
     * <p>
     * This function should be called by {@code GtkWidget} types whenever an accessible
     * state change must be communicated to assistive technologies.
     * <p>
     * This function is meant to be used by language bindings.
     */
    public default void updateStateValue(int nStates, AccessibleState[] states, org.gtk.gobject.Value[] values) {
        gtk_h.gtk_accessible_update_state_value(handle(), nStates, Interop.allocateNativeArray(AccessibleState.getValues(states)).handle(), Interop.allocateNativeArray(values).handle());
    }
    
    class AccessibleImpl extends org.gtk.gobject.Object implements Accessible {
        public AccessibleImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
