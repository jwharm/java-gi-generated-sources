package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GHookList struct represents a list of hook functions.
 */
public class HookList extends io.github.jwharm.javagi.interop.ResourceBase {

    public HookList(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Removes all the #GHook elements from a #GHookList.
     */
    public void clear() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_hook_list_clear(HANDLE());
    }
    
    /**
     * Initializes a #GHookList.
     * This must be called before the #GHookList is used.
     */
    public void init(int hookSize) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_hook_list_init(HANDLE(), hookSize);
    }
    
    /**
     * Calls all of the #GHook functions in a #GHookList.
     */
    public void invoke(boolean mayRecurse) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_hook_list_invoke(HANDLE(), mayRecurse ? 1 : 0);
    }
    
    /**
     * Calls all of the #GHook functions in a #GHookList.
     * Any function which returns %FALSE is removed from the #GHookList.
     */
    public void invokeCheck(boolean mayRecurse) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_hook_list_invoke_check(HANDLE(), mayRecurse ? 1 : 0);
    }
    
}
