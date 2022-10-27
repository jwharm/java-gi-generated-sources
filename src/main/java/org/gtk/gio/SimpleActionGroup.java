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
public class SimpleActionGroup extends org.gtk.gobject.Object implements org.gtk.gio.ActionGroup, org.gtk.gio.ActionMap {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        org.gtk.gio.SimpleActionGroupPrivate.getMemoryLayout().withName("priv")
    ).withName("GSimpleActionGroup");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public SimpleActionGroup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SimpleActionGroup */
    public static SimpleActionGroup castFrom(org.gtk.gobject.Object gobject) {
        return new SimpleActionGroup(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_simple_action_group_new.invokeExact(), true);
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
    }
    
    /**
     * A convenience function for creating multiple {@link SimpleAction} instances
     * and adding them to the action group.
     * @param entries a pointer to the first item in
     *           an array of {@link ActionEntry} structs
     * @param nEntries the length of {@code entries}, or -1
     * @param userData the user data for signal connections
     * @deprecated Use g_action_map_add_action_entries()
     */
    @Deprecated
    public void addEntries(org.gtk.gio.ActionEntry[] entries, int nEntries, @Nullable java.lang.foreign.MemoryAddress userData) {
        java.util.Objects.requireNonNull(entries, "Parameter 'entries' must not be null");
        try {
            DowncallHandles.g_simple_action_group_add_entries.invokeExact(handle(), Interop.allocateNativeArray(entries, false), nEntries, userData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public void insert(@NotNull org.gtk.gio.Action action) {
        java.util.Objects.requireNonNull(action, "Parameter 'action' must not be null");
        try {
            DowncallHandles.g_simple_action_group_insert.invokeExact(handle(), action.handle());
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
    public @NotNull org.gtk.gio.Action lookup(@NotNull java.lang.String actionName) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_simple_action_group_lookup.invokeExact(handle(), Interop.allocateNativeString(actionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Action.ActionImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Removes the named action from the action group.
     * <p>
     * If no action of this name is in the group then nothing happens.
     * @param actionName the name of the action
     * @deprecated Use g_action_map_remove_action()
     */
    @Deprecated
    public void remove(@NotNull java.lang.String actionName) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        try {
            DowncallHandles.g_simple_action_group_remove.invokeExact(handle(), Interop.allocateNativeString(actionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_simple_action_group_new = Interop.downcallHandle(
            "g_simple_action_group_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_simple_action_group_add_entries = Interop.downcallHandle(
            "g_simple_action_group_add_entries",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_simple_action_group_insert = Interop.downcallHandle(
            "g_simple_action_group_insert",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_simple_action_group_lookup = Interop.downcallHandle(
            "g_simple_action_group_lookup",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_simple_action_group_remove = Interop.downcallHandle(
            "g_simple_action_group_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
