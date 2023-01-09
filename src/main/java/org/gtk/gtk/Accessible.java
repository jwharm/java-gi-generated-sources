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
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AccessibleImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AccessibleImpl(input);
    
    /**
     * Retrieves the {@code GtkAccessibleRole} for the given {@code GtkAccessible}.
     * @return a {@code GtkAccessibleRole}
     */
    default org.gtk.gtk.AccessibleRole getAccessibleRole() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_accessible_get_accessible_role.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.AccessibleRole.of(RESULT);
    }
    
    /**
     * Resets the accessible {@code property} to its default value.
     * @param property a {@code GtkAccessibleProperty}
     */
    default void resetProperty(org.gtk.gtk.AccessibleProperty property) {
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
    default void resetRelation(org.gtk.gtk.AccessibleRelation relation) {
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
    default void resetState(org.gtk.gtk.AccessibleState state) {
        try {
            DowncallHandles.gtk_accessible_reset_state.invokeExact(
                    handle(),
                    state.getValue());
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
    default void updateProperty(int nProperties, org.gtk.gtk.AccessibleProperty[] properties, org.gtk.gobject.Value[] values) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_accessible_update_property_value.invokeExact(
                        handle(),
                        nProperties,
                        Interop.allocateNativeArray(Enumeration.getValues(properties), false, SCOPE),
                        Interop.allocateNativeArray(values, org.gtk.gobject.Value.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    default void updateRelation(int nRelations, org.gtk.gtk.AccessibleRelation[] relations, org.gtk.gobject.Value[] values) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_accessible_update_relation_value.invokeExact(
                        handle(),
                        nRelations,
                        Interop.allocateNativeArray(Enumeration.getValues(relations), false, SCOPE),
                        Interop.allocateNativeArray(values, org.gtk.gobject.Value.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    default void updateState(int nStates, org.gtk.gtk.AccessibleState[] states, org.gtk.gobject.Value[] values) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_accessible_update_state_value.invokeExact(
                        handle(),
                        nStates,
                        Interop.allocateNativeArray(Enumeration.getValues(states), false, SCOPE),
                        Interop.allocateNativeArray(values, org.gtk.gobject.Value.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
        static final MethodHandle gtk_accessible_update_property_value = Interop.downcallHandle(
                "gtk_accessible_update_property_value",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_accessible_update_relation_value = Interop.downcallHandle(
                "gtk_accessible_update_relation_value",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
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
    
    /**
     * The AccessibleImpl type represents a native instance of the Accessible interface.
     */
    class AccessibleImpl extends org.gtk.gobject.GObject implements Accessible {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of Accessible for the provided memory address.
         * @param address the memory address of the instance
         */
        public AccessibleImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_accessible_get_type != null;
    }
}
