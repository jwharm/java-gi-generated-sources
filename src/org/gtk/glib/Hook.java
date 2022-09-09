package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GHook struct represents a single hook function in a #GHookList.
 */
public class Hook extends io.github.jwharm.javagi.interop.ResourceBase {

    public Hook(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Compares the ids of two #GHook elements, returning a negative value
     * if the second id is greater than the first.
     */
    public int compareIds(Hook sibling) {
        var RESULT = gtk_h.g_hook_compare_ids(handle(), sibling.handle());
        return RESULT;
    }
    
    /**
     * Allocates space for a #GHook and initializes it.
     */
    public static Hook alloc(HookList hookList) {
        var RESULT = gtk_h.g_hook_alloc(hookList.handle());
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Destroys a #GHook, given its ID.
     */
    public static boolean destroy(HookList hookList, long hookId) {
        var RESULT = gtk_h.g_hook_destroy(hookList.handle(), hookId);
        return (RESULT != 0);
    }
    
    /**
     * Removes one #GHook from a #GHookList, marking it
     * inactive and calling g_hook_unref() on it.
     */
    public static void destroyLink(HookList hookList, Hook hook) {
        gtk_h.g_hook_destroy_link(hookList.handle(), hook.handle());
    }
    
    /**
     * Finds a #GHook in a #GHookList with the given data.
     */
    public static Hook findData(HookList hookList, boolean needValids, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_hook_find_data(hookList.handle(), needValids ? 1 : 0, data);
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Finds a #GHook in a #GHookList with the given function.
     */
    public static Hook findFunc(HookList hookList, boolean needValids, jdk.incubator.foreign.MemoryAddress func) {
        var RESULT = gtk_h.g_hook_find_func(hookList.handle(), needValids ? 1 : 0, func);
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Finds a #GHook in a #GHookList with the given function and data.
     */
    public static Hook findFuncData(HookList hookList, boolean needValids, jdk.incubator.foreign.MemoryAddress func, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_hook_find_func_data(hookList.handle(), needValids ? 1 : 0, func, data);
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Returns the first #GHook in a #GHookList which has not been destroyed.
     * The reference count for the #GHook is incremented, so you must call
     * g_hook_unref() to restore it when no longer needed. (Or call
     * g_hook_next_valid() if you are stepping through the #GHookList.)
     */
    public static Hook firstValid(HookList hookList, boolean mayBeInCall) {
        var RESULT = gtk_h.g_hook_first_valid(hookList.handle(), mayBeInCall ? 1 : 0);
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Calls the #GHookList @finalize_hook function if it exists,
     * and frees the memory allocated for the #GHook.
     */
    public static void free(HookList hookList, Hook hook) {
        gtk_h.g_hook_free(hookList.handle(), hook.handle());
    }
    
    /**
     * Returns the #GHook with the given id, or %NULL if it is not found.
     */
    public static Hook get(HookList hookList, long hookId) {
        var RESULT = gtk_h.g_hook_get(hookList.handle(), hookId);
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Inserts a #GHook into a #GHookList, before a given #GHook.
     */
    public static void insertBefore(HookList hookList, Hook sibling, Hook hook) {
        gtk_h.g_hook_insert_before(hookList.handle(), sibling.handle(), hook.handle());
    }
    
    /**
     * Returns the next #GHook in a #GHookList which has not been destroyed.
     * The reference count for the #GHook is incremented, so you must call
     * g_hook_unref() to restore it when no longer needed. (Or continue to call
     * g_hook_next_valid() until %NULL is returned.)
     */
    public static Hook nextValid(HookList hookList, Hook hook, boolean mayBeInCall) {
        var RESULT = gtk_h.g_hook_next_valid(hookList.handle(), hook.handle(), mayBeInCall ? 1 : 0);
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Prepends a #GHook on the start of a #GHookList.
     */
    public static void prepend(HookList hookList, Hook hook) {
        gtk_h.g_hook_prepend(hookList.handle(), hook.handle());
    }
    
    /**
     * Increments the reference count for a #GHook.
     */
    public static Hook ref(HookList hookList, Hook hook) {
        var RESULT = gtk_h.g_hook_ref(hookList.handle(), hook.handle());
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Decrements the reference count of a #GHook.
     * If the reference count falls to 0, the #GHook is removed
     * from the #GHookList and g_hook_free() is called to free it.
     */
    public static void unref(HookList hookList, Hook hook) {
        gtk_h.g_hook_unref(hookList.handle(), hook.handle());
    }
    
}
