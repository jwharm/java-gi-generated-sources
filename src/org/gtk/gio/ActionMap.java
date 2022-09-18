package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The GActionMap interface is implemented by {@link org.gtk.gio.ActionGroup} implementations that operate by containing a number of
 * named {@link org.gtk.gio.Action} instances, such as {@link org.gtk.gio.SimpleActionGroup} 
 * 
 * One useful application of this interface is to map the
 * names of actions from various action groups to unique,
 * prefixed names (e.g. by prepending &<code>#34</code> app.&<code>#34</code>  or &<code>#34</code> win.&<code>#34</code> ).
 * This is the motivation for the &<code>#39</code> Map&<code>#39</code>  part of the interface
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
     * A convenience function for creating multiple {@link org.gtk.gio.SimpleAction} instances
     * and adding them to a {@link org.gtk.gio.ActionMap} 
     * 
     * Each action is constructed as per one {@link org.gtk.gio.ActionEntry} 
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
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
     *   g_print (&<code>#34</code> <code>s</code> n&<code>#34</code> , g_variant_get_string (parameter, NULL));
     * }
     * 
     * static GActionGroup *
     * create_action_group (void)
     * {
     *   const GActionEntry entries[]} = {
     *     { &<code>#34</code> quit&<code>#34</code> ,         activate_quit              },
     *     { &<code>#34</code> print-string&<code>#34</code> , activate_print_string, &<code>#34</code> s&<code>#34</code>  }
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
     * If no such action exists, returns <code>null</code>
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
