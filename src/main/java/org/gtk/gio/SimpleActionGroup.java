package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link SimpleActionGroup} is a hash table filled with {@link Action} objects,
 * implementing the {@link ActionGroup} and {@link ActionMap} interfaces.
 * @version 2.28
 */
public class SimpleActionGroup extends org.gtk.gobject.GObject implements org.gtk.gio.ActionGroup, org.gtk.gio.ActionMap {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSimpleActionGroup";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a SimpleActionGroup proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SimpleActionGroup(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SimpleActionGroup> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SimpleActionGroup(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_simple_action_group_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new, empty, {@link SimpleActionGroup}.
     */
    public SimpleActionGroup() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * A convenience function for creating multiple {@link SimpleAction} instances
     * and adding them to the action group.
     * @param entries a pointer to the first item in
     *           an array of {@link ActionEntry} structs
     * @param nEntries the length of {@code entries}, or -1
     * @deprecated Use g_action_map_add_action_entries()
     */
    @Deprecated
    public void addEntries(org.gtk.gio.ActionEntry[] entries, int nEntries) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_simple_action_group_add_entries.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(entries, org.gtk.gio.ActionEntry.getMemoryLayout(), false, SCOPE),
                        nEntries,
                        (Addressable) MemoryAddress.NULL);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Adds an action to the action group.
     * <p>
     * If the action group already contains an action with the same name as
     * {@code action} then the old action is dropped from the group.
     * <p>
     * The action group takes its own reference on {@code action}.
     * @param action a {@link Action}
     * @deprecated Use g_action_map_add_action()
     */
    @Deprecated
    public void insert(org.gtk.gio.Action action) {
        try {
            DowncallHandles.g_simple_action_group_insert.invokeExact(
                    handle(),
                    action.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Looks up the action with the name {@code action_name} in the group.
     * <p>
     * If no such action exists, returns {@code null}.
     * @param actionName the name of an action
     * @return a {@link Action}, or {@code null}
     * @deprecated Use g_action_map_lookup_action()
     */
    @Deprecated
    public org.gtk.gio.Action lookup(java.lang.String actionName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_simple_action_group_lookup.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return (org.gtk.gio.Action) Interop.register(RESULT, org.gtk.gio.Action.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Removes the named action from the action group.
     * <p>
     * If no action of this name is in the group then nothing happens.
     * @param actionName the name of the action
     * @deprecated Use g_action_map_remove_action()
     */
    @Deprecated
    public void remove(java.lang.String actionName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_simple_action_group_remove.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE));
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
            RESULT = (long) DowncallHandles.g_simple_action_group_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link SimpleActionGroup.Builder} object constructs a {@link SimpleActionGroup} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SimpleActionGroup.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SimpleActionGroup} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SimpleActionGroup}.
         * @return A new instance of {@code SimpleActionGroup} with the properties 
         *         that were set in the Builder object.
         */
        public SimpleActionGroup build() {
            return (SimpleActionGroup) org.gtk.gobject.GObject.newWithProperties(
                SimpleActionGroup.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_simple_action_group_new = Interop.downcallHandle(
                "g_simple_action_group_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_simple_action_group_add_entries = Interop.downcallHandle(
                "g_simple_action_group_add_entries",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_simple_action_group_insert = Interop.downcallHandle(
                "g_simple_action_group_insert",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_simple_action_group_lookup = Interop.downcallHandle(
                "g_simple_action_group_lookup",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_simple_action_group_remove = Interop.downcallHandle(
                "g_simple_action_group_remove",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_simple_action_group_get_type = Interop.downcallHandle(
                "g_simple_action_group_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_simple_action_group_get_type != null;
    }
}
