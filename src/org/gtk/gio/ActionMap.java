package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
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
public interface ActionMap extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Adds an action to the @action_map.
     * 
     * If the action map already contains an action with the same name
     * as @action then the old action is dropped from the action map.
     * 
     * The action map takes its own reference on @action.
     */
    public default void addAction(Action action) {
        gtk_h.g_action_map_add_action(handle(), action.handle());
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
        gtk_h.g_action_map_add_action_entries(handle(), Interop.allocateNativeArray(entries).handle(), nEntries, userData);
    }
    
    /**
     * Looks up the action with the name @action_name in @action_map.
     * 
     * If no such action exists, returns %NULL.
     */
    public default Action lookupAction(java.lang.String actionName) {
        var RESULT = gtk_h.g_action_map_lookup_action(handle(), Interop.allocateNativeString(actionName).handle());
        return new Action.ActionImpl(References.get(RESULT, false));
    }
    
    /**
     * Removes the named action from the action map.
     * 
     * If no action of this name is in the map then nothing happens.
     */
    public default void removeAction(java.lang.String actionName) {
        gtk_h.g_action_map_remove_action(handle(), Interop.allocateNativeString(actionName).handle());
    }
    
    class ActionMapImpl extends org.gtk.gobject.Object implements ActionMap {
        public ActionMapImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
