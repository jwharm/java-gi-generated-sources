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
 */
public interface ActionMap extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle g_action_map_add_action = Interop.downcallHandle(
        "g_action_map_add_action",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds an action to the {@code action_map}.
     * <p>
     * If the action map already contains an action with the same name
     * as {@code action} then the old action is dropped from the action map.
     * <p>
     * The action map takes its own reference on {@code action}.
     */
    default @NotNull void addAction(@NotNull Action action) {
        try {
            g_action_map_add_action.invokeExact(handle(), action.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle g_action_map_add_action_entries = Interop.downcallHandle(
        "g_action_map_add_action_entries",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * A convenience function for creating multiple {@link SimpleAction} instances
     * and adding them to a {@link ActionMap}.
     * <p>
     * Each action is constructed as per one {@link ActionEntry}.
     * <p>
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
     */
    default @NotNull void addActionEntries(@NotNull ActionEntry[] entries, @NotNull int nEntries, @Nullable java.lang.foreign.MemoryAddress userData) {
        try {
            g_action_map_add_action_entries.invokeExact(handle(), Interop.allocateNativeArray(entries), nEntries, userData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle g_action_map_lookup_action = Interop.downcallHandle(
        "g_action_map_lookup_action",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up the action with the name {@code action_name} in {@code action_map}.
     * <p>
     * If no such action exists, returns {@code null}.
     */
    default @Nullable Action lookupAction(@NotNull java.lang.String actionName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_action_map_lookup_action.invokeExact(handle(), Interop.allocateNativeString(actionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Action.ActionImpl(Refcounted.get(RESULT, false));
    }
    
    @ApiStatus.Internal static final MethodHandle g_action_map_remove_action = Interop.downcallHandle(
        "g_action_map_remove_action",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the named action from the action map.
     * <p>
     * If no action of this name is in the map then nothing happens.
     */
    default @NotNull void removeAction(@NotNull java.lang.String actionName) {
        try {
            g_action_map_remove_action.invokeExact(handle(), Interop.allocateNativeString(actionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class ActionMapImpl extends org.gtk.gobject.Object implements ActionMap {
        public ActionMapImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
