package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkAccessible} is an interface for describing UI elements for
 * Assistive Technologies.
 * <p>
 * Every accessible implementation has:
 * <ul>
 * <li>a “role”, represented by a value of the {@code Gtk.AccessibleRole} enumeration
 * <li>an “attribute”, represented by a set of {@code Gtk.AccessibleState},
 *    {@code Gtk.AccessibleProperty] and [enum@Gtk.AccessibleRelation} values
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
     * Cast object to Accessible if its GType is a (or inherits from) "GtkAccessible".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Accessible} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkAccessible", a ClassCastException will be thrown.
     */
    public static Accessible castFrom(org.gtk.gobject.Object gobject) {
            return new AccessibleImpl(gobject.handle(), gobject.yieldOwnership());
    }
    
    /**
     * Retrieves the {@code GtkAccessibleRole} for the given {@code GtkAccessible}.
     * @return a {@code GtkAccessibleRole}
     */
    default @NotNull org.gtk.gtk.AccessibleRole getAccessibleRole() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_accessible_get_accessible_role.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.AccessibleRole(RESULT);
    }
    
    /**
     * Resets the accessible {@code property} to its default value.
     * @param property a {@code GtkAccessibleProperty}
     */
    default void resetProperty(@NotNull org.gtk.gtk.AccessibleProperty property) {
        java.util.Objects.requireNonNull(property, "Parameter 'property' must not be null");
        try {
            DowncallHandles.gtk_accessible_reset_property.invokeExact(
                    handle(),
                    property.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Resets the accessible {@code relation} to its default value.
     * @param relation a {@code GtkAccessibleRelation}
     */
    default void resetRelation(@NotNull org.gtk.gtk.AccessibleRelation relation) {
        java.util.Objects.requireNonNull(relation, "Parameter 'relation' must not be null");
        try {
            DowncallHandles.gtk_accessible_reset_relation.invokeExact(
                    handle(),
                    relation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Resets the accessible {@code state} to its default value.
     * @param state a {@code GtkAccessibleState}
     */
    default void resetState(@NotNull org.gtk.gtk.AccessibleState state) {
        java.util.Objects.requireNonNull(state, "Parameter 'state' must not be null");
        try {
            DowncallHandles.gtk_accessible_reset_state.invokeExact(
                    handle(),
                    state.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Updates a list of accessible properties.
     * <p>
     * See the {@code Gtk.AccessibleProperty} documentation for the
     * value types of accessible properties.
     * <p>
     * This function should be called by {@code GtkWidget} types whenever
     * an accessible property change must be communicated to assistive
     * technologies.
     * <p>
     * Example:
     * <pre>{@code c
     * value = gtk_adjustment_get_value (adjustment);
     * gtk_accessible_update_property (GTK_ACCESSIBLE (spin_button),
     *                                    GTK_ACCESSIBLE_PROPERTY_VALUE_NOW, value,
     *                                    -1);
     * }</pre>
     * @param firstProperty the first {@code GtkAccessibleProperty}
     * @param varargs a list of property and value pairs, terminated by -1
     */
    default void updateProperty(@NotNull org.gtk.gtk.AccessibleProperty firstProperty, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(firstProperty, "Parameter 'firstProperty' must not be null");
        try {
            DowncallHandles.gtk_accessible_update_property.invokeExact(
                    handle(),
                    firstProperty.getValue(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Updates an array of accessible properties.
     * <p>
     * This function should be called by {@code GtkWidget} types whenever an accessible
     * property change must be communicated to assistive technologies.
     * <p>
     * This function is meant to be used by language bindings.
     * @param nProperties the number of accessible properties to set
     * @param properties an array of {@code GtkAccessibleProperty}
     * @param values an array of {@code GValues}, one for each property
     */
    default void updatePropertyValue(int nProperties, @NotNull org.gtk.gtk.AccessibleProperty[] properties, @NotNull org.gtk.gobject.Value[] values) {
        java.util.Objects.requireNonNull(properties, "Parameter 'properties' must not be null");
        java.util.Objects.requireNonNull(values, "Parameter 'values' must not be null");
        try {
            DowncallHandles.gtk_accessible_update_property_value.invokeExact(
                    handle(),
                    nProperties,
                    Interop.allocateNativeArray(org.gtk.gtk.AccessibleProperty.getValues(properties), false),
                    Interop.allocateNativeArray(values, org.gtk.gobject.Value.getMemoryLayout(), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Updates a list of accessible relations.
     * <p>
     * This function should be called by {@code GtkWidget} types whenever an accessible
     * relation change must be communicated to assistive technologies.
     * <p>
     * If the {@code Gtk.AccessibleRelation} requires a list of references,
     * you should pass each reference individually, followed by {@code null}, e.g.
     * <pre>{@code c
     * gtk_accessible_update_relation (accessible,
     *                                 GTK_ACCESSIBLE_RELATION_CONTROLS,
     *                                   ref1, NULL,
     *                                 GTK_ACCESSIBLE_RELATION_LABELLED_BY,
     *                                   ref1, ref2, ref3, NULL,
     *                                 -1);
     * }</pre>
     * @param firstRelation the first {@code GtkAccessibleRelation}
     * @param varargs a list of relation and value pairs, terminated by -1
     */
    default void updateRelation(@NotNull org.gtk.gtk.AccessibleRelation firstRelation, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(firstRelation, "Parameter 'firstRelation' must not be null");
        try {
            DowncallHandles.gtk_accessible_update_relation.invokeExact(
                    handle(),
                    firstRelation.getValue(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Updates an array of accessible relations.
     * <p>
     * This function should be called by {@code GtkWidget} types whenever an accessible
     * relation change must be communicated to assistive technologies.
     * <p>
     * This function is meant to be used by language bindings.
     * @param nRelations the number of accessible relations to set
     * @param relations an array of {@code GtkAccessibleRelation}
     * @param values an array of {@code GValues}, one for each relation
     */
    default void updateRelationValue(int nRelations, @NotNull org.gtk.gtk.AccessibleRelation[] relations, @NotNull org.gtk.gobject.Value[] values) {
        java.util.Objects.requireNonNull(relations, "Parameter 'relations' must not be null");
        java.util.Objects.requireNonNull(values, "Parameter 'values' must not be null");
        try {
            DowncallHandles.gtk_accessible_update_relation_value.invokeExact(
                    handle(),
                    nRelations,
                    Interop.allocateNativeArray(org.gtk.gtk.AccessibleRelation.getValues(relations), false),
                    Interop.allocateNativeArray(values, org.gtk.gobject.Value.getMemoryLayout(), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Updates a list of accessible states. See the {@code Gtk.AccessibleState}
     * documentation for the value types of accessible states.
     * <p>
     * This function should be called by {@code GtkWidget} types whenever an accessible
     * state change must be communicated to assistive technologies.
     * <p>
     * Example:
     * <pre>{@code c
     * value = GTK_ACCESSIBLE_TRISTATE_MIXED;
     * gtk_accessible_update_state (GTK_ACCESSIBLE (check_button),
     *                              GTK_ACCESSIBLE_STATE_CHECKED, value,
     *                              -1);
     * }</pre>
     * @param firstState the first {@code GtkAccessibleState}
     * @param varargs a list of state and value pairs, terminated by -1
     */
    default void updateState(@NotNull org.gtk.gtk.AccessibleState firstState, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(firstState, "Parameter 'firstState' must not be null");
        try {
            DowncallHandles.gtk_accessible_update_state.invokeExact(
                    handle(),
                    firstState.getValue(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Updates an array of accessible states.
     * <p>
     * This function should be called by {@code GtkWidget} types whenever an accessible
     * state change must be communicated to assistive technologies.
     * <p>
     * This function is meant to be used by language bindings.
     * @param nStates the number of accessible states to set
     * @param states an array of {@code GtkAccessibleState}
     * @param values an array of {@code GValues}, one for each state
     */
    default void updateStateValue(int nStates, @NotNull org.gtk.gtk.AccessibleState[] states, @NotNull org.gtk.gobject.Value[] values) {
        java.util.Objects.requireNonNull(states, "Parameter 'states' must not be null");
        java.util.Objects.requireNonNull(values, "Parameter 'values' must not be null");
        try {
            DowncallHandles.gtk_accessible_update_state_value.invokeExact(
                    handle(),
                    nStates,
                    Interop.allocateNativeArray(org.gtk.gtk.AccessibleState.getValues(states), false),
                    Interop.allocateNativeArray(values, org.gtk.gobject.Value.getMemoryLayout(), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_accessible_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_accessible_get_accessible_role = Interop.downcallHandle(
            "gtk_accessible_get_accessible_role",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_accessible_reset_property = Interop.downcallHandle(
            "gtk_accessible_reset_property",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_accessible_reset_relation = Interop.downcallHandle(
            "gtk_accessible_reset_relation",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_accessible_reset_state = Interop.downcallHandle(
            "gtk_accessible_reset_state",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_accessible_update_property = Interop.downcallHandle(
            "gtk_accessible_update_property",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            true
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_accessible_update_property_value = Interop.downcallHandle(
            "gtk_accessible_update_property_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_accessible_update_relation = Interop.downcallHandle(
            "gtk_accessible_update_relation",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            true
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_accessible_update_relation_value = Interop.downcallHandle(
            "gtk_accessible_update_relation_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_accessible_update_state = Interop.downcallHandle(
            "gtk_accessible_update_state",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            true
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_accessible_update_state_value = Interop.downcallHandle(
            "gtk_accessible_update_state_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_accessible_get_type = Interop.downcallHandle(
            "gtk_accessible_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class AccessibleImpl extends org.gtk.gobject.Object implements Accessible {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public AccessibleImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
