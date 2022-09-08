package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The GActionMap interface is implemented by #GActionGroup
 * implementations that operate by containing a number of
 * named #GAction instances, such as #GSimpleActionGroup.
 * 
 * One useful application of this interface is to map the
 * names of actions from various action groups to unique,
 * prefixed names (e.g. by prepending "app." or "win.").
 * This is the motivation for the 'Map' part of the interface
 * name.
 */
public interface ActionMap extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Adds an action to the @action_map.
     * 
     * If the action map already contains an action with the same name
     * as @action then the old action is dropped from the action map.
     * 
     * The action map takes its own reference on @action.
     */
    public default void addAction(Action action) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_map_add_action(HANDLE(), action.HANDLE());
    }
    
    /**
     * A convenience function for creating multiple #GSimpleAction instances
     * and adding them to a #GActionMap.
     * 
     * Each action is constructed as per one #GActionEntry.
     * 
     * |[<!-- language="C" -->
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
     * ]|
     */
    public default void addActionEntries(ActionEntry[] entries, int nEntries, jdk.incubator.foreign.MemoryAddress userData) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_map_add_action_entries(HANDLE(), Interop.allocateNativeArray(entries), nEntries, userData);
    }
    
    /**
     * Looks up the action with the name @action_name in @action_map.
     * 
     * If no such action exists, returns %NULL.
     */
    public default Action lookupAction(java.lang.String actionName) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_map_lookup_action(HANDLE(), Interop.allocateNativeString(actionName).HANDLE());
        return new Action.ActionImpl(References.get(RESULT, false));
    }
    
    /**
     * Removes the named action from the action map.
     * 
     * If no action of this name is in the map then nothing happens.
     */
    public default void removeAction(java.lang.String actionName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_map_remove_action(HANDLE(), Interop.allocateNativeString(actionName).HANDLE());
    }
    
    class ActionMapImpl extends org.gtk.gobject.Object implements ActionMap {
        public ActionMapImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
