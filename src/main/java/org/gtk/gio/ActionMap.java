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
     * Cast object to ActionMap if its GType is a (or inherits from) "GActionMap".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ActionMap} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GActionMap", a ClassCastException will be thrown.
     */
    public static ActionMap castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GActionMap"))) {
            return new ActionMapImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GActionMap");
        }
    }
    
    /**
     * Adds an action to the {@code action_map}.
     * <p>
     * If the action map already contains an action with the same name
     * as {@code action} then the old action is dropped from the action map.
     * <p>
     * The action map takes its own reference on {@code action}.
     * @param action a {@link Action}
     */
    default void addAction(@NotNull org.gtk.gio.Action action) {
        java.util.Objects.requireNonNull(action, "Parameter 'action' must not be null");
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
     * @param userData the user data for signal connections
     */
    default void addActionEntries(@NotNull org.gtk.gio.ActionEntry[] entries, int nEntries, @Nullable java.lang.foreign.MemoryAddress userData) {
        java.util.Objects.requireNonNull(entries, "Parameter 'entries' must not be null");
        try {
            DowncallHandles.g_action_map_add_action_entries.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(entries, false),
                    nEntries,
                    userData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Looks up the action with the name {@code action_name} in {@code action_map}.
     * <p>
     * If no such action exists, returns {@code null}.
     * @param actionName the name of an action
     * @return a {@link Action}, or {@code null}
     */
    default @Nullable org.gtk.gio.Action lookupAction(@NotNull java.lang.String actionName) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_action_map_lookup_action.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Action.ActionImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Removes the named action from the action map.
     * <p>
     * If no action of this name is in the map then nothing happens.
     * @param actionName the name of the action
     */
    default void removeAction(@NotNull java.lang.String actionName) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        try {
            DowncallHandles.g_action_map_remove_action.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_action_map_add_action = Interop.downcallHandle(
            "g_action_map_add_action",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_map_add_action_entries = Interop.downcallHandle(
            "g_action_map_add_action_entries",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_map_lookup_action = Interop.downcallHandle(
            "g_action_map_lookup_action",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_map_remove_action = Interop.downcallHandle(
            "g_action_map_remove_action",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    class ActionMapImpl extends org.gtk.gobject.Object implements ActionMap {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public ActionMapImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
