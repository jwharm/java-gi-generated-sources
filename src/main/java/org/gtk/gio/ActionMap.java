package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GActionMap interface is implemented by {@link ActionGroup}
 * implementations that operate by containing a number of
 * named {@link Action} instances, such as {@link SimpleActionGroup}.
 * <p>
 * One useful application of this interface is to map the
 * names of actions from various action groups to unique,
 * prefixed names (e.g. by prepending "app." or "win.").
 * This is the motivation for the 'Map' part of the interface
 * name.
 * @version 2.32
 */
public interface ActionMap extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ActionMapImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ActionMapImpl(input);
    
    /**
     * Adds an action to the {@code action_map}.
     * <p>
     * If the action map already contains an action with the same name
     * as {@code action} then the old action is dropped from the action map.
     * <p>
     * The action map takes its own reference on {@code action}.
     * @param action a {@link Action}
     */
    default void addAction(org.gtk.gio.Action action) {
        try {
            DowncallHandles.g_action_map_add_action.invokeExact(
                    handle(),
                    action.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A convenience function for creating multiple {@link SimpleAction} instances
     * and adding them to a {@link ActionMap}.
     * <p>
     * Each action is constructed as per one {@link ActionEntry}.
     * <pre>{@code <!-- language="C" -->
     * static void
     * activate_quit (GSimpleAction *simple,
     *                GVariant      *parameter,
     *                gpointer       user_data)
     * {
     *   exit (0);
     * }
     * 
     * static void
     * activate_print_string (GSimpleAction *simple,
     *                        GVariant      *parameter,
     *                        gpointer       user_data)
     * {
     *   g_print ("%s\\n", g_variant_get_string (parameter, NULL));
     * }
     * 
     * static GActionGroup *
     * create_action_group (void)
     * {
     *   const GActionEntry entries[] = {
     *     { "quit",         activate_quit              },
     *     { "print-string", activate_print_string, "s" }
     *   };
     *   GSimpleActionGroup *group;
     * 
     *   group = g_simple_action_group_new ();
     *   g_action_map_add_action_entries (G_ACTION_MAP (group), entries, G_N_ELEMENTS (entries), NULL);
     * 
     *   return G_ACTION_GROUP (group);
     * }
     * }</pre>
     * @param entries a pointer to
     *           the first item in an array of {@link ActionEntry} structs
     * @param nEntries the length of {@code entries}, or -1 if {@code entries} is {@code null}-terminated
     */
    default void addActionEntries(org.gtk.gio.ActionEntry[] entries, int nEntries) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_action_map_add_action_entries.invokeExact(
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
     * Looks up the action with the name {@code action_name} in {@code action_map}.
     * <p>
     * If no such action exists, returns {@code null}.
     * @param actionName the name of an action
     * @return a {@link Action}, or {@code null}
     */
    default @Nullable org.gtk.gio.Action lookupAction(java.lang.String actionName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_action_map_lookup_action.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return (org.gtk.gio.Action) Interop.register(RESULT, org.gtk.gio.Action.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Removes the named action from the action map.
     * <p>
     * If no action of this name is in the map then nothing happens.
     * @param actionName the name of the action
     */
    default void removeAction(java.lang.String actionName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_action_map_remove_action.invokeExact(
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
            RESULT = (long) DowncallHandles.g_action_map_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_action_map_add_action = Interop.downcallHandle(
                "g_action_map_add_action",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_map_add_action_entries = Interop.downcallHandle(
                "g_action_map_add_action_entries",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_map_lookup_action = Interop.downcallHandle(
                "g_action_map_lookup_action",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_map_remove_action = Interop.downcallHandle(
                "g_action_map_remove_action",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_map_get_type = Interop.downcallHandle(
                "g_action_map_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The ActionMapImpl type represents a native instance of the ActionMap interface.
     */
    class ActionMapImpl extends org.gtk.gobject.GObject implements ActionMap {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of ActionMap for the provided memory address.
         * @param address the memory address of the instance
         */
        public ActionMapImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_action_map_get_type != null;
    }
}
