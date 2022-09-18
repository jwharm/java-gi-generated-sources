package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link org.gtk.glib.Hook} struct represents a single hook function in a {@link org.gtk.glib.HookList}
 */
public class Hook extends io.github.jwharm.javagi.ResourceBase {

    public Hook(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Compares the ids of two {@link org.gtk.glib.Hook} elements, returning a negative value
     * if the second id is greater than the first.
     */
    public int compareIds(Hook sibling) {
        var RESULT = gtk_h.g_hook_compare_ids(handle(), sibling.handle());
        return RESULT;
    }
    
    /**
     * Allocates space for a {@link org.gtk.glib.Hook} and initializes it.
     */
    public static Hook alloc(HookList hookList) {
        var RESULT = gtk_h.g_hook_alloc(hookList.handle());
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Destroys a {@link org.gtk.glib.Hook}  given its ID.
     */
    public static boolean destroy(HookList hookList, long hookId) {
        var RESULT = gtk_h.g_hook_destroy(hookList.handle(), hookId);
        return (RESULT != 0);
    }
    
    /**
     * Removes one {@link org.gtk.glib.Hook} from a {@link org.gtk.glib.HookList}  marking it
     * inactive and calling g_hook_unref() on it.
     */
    public static void destroyLink(HookList hookList, Hook hook) {
        gtk_h.g_hook_destroy_link(hookList.handle(), hook.handle());
    }
    
    /**
     * Finds a {@link org.gtk.glib.Hook} in a {@link org.gtk.glib.HookList} using the given function to
     * test for a match.
     */
    public static Hook find(HookList hookList, boolean needValids, HookFindFunc func) {
        try {
            var RESULT = gtk_h.g_hook_find(hookList.handle(), needValids ? 1 : 0, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbHookFindFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
            return new Hook(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finds a {@link org.gtk.glib.Hook} in a {@link org.gtk.glib.HookList} with the given data.
     */
    public static Hook findData(HookList hookList, boolean needValids, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_hook_find_data(hookList.handle(), needValids ? 1 : 0, data);
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Finds a {@link org.gtk.glib.Hook} in a {@link org.gtk.glib.HookList} with the given function.
     */
    public static Hook findFunc(HookList hookList, boolean needValids, jdk.incubator.foreign.MemoryAddress func) {
        var RESULT = gtk_h.g_hook_find_func(hookList.handle(), needValids ? 1 : 0, func);
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Finds a {@link org.gtk.glib.Hook} in a {@link org.gtk.glib.HookList} with the given function and data.
     */
    public static Hook findFuncData(HookList hookList, boolean needValids, jdk.incubator.foreign.MemoryAddress func, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_hook_find_func_data(hookList.handle(), needValids ? 1 : 0, func, data);
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Returns the first {@link org.gtk.glib.Hook} in a {@link org.gtk.glib.HookList} which has not been destroyed.
     * The reference count for the {@link org.gtk.glib.Hook} is incremented, so you must call
     * g_hook_unref() to restore it when no longer needed. (Or call
     * g_hook_next_valid() if you are stepping through the {@link org.gtk.glib.HookList} )
     */
    public static Hook firstValid(HookList hookList, boolean mayBeInCall) {
        var RESULT = gtk_h.g_hook_first_valid(hookList.handle(), mayBeInCall ? 1 : 0);
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Calls the {@link org.gtk.glib.HookList} @finalize_hook function if it exists,
     * and frees the memory allocated for the {@link org.gtk.glib.Hook}
     */
    public static void free(HookList hookList, Hook hook) {
        gtk_h.g_hook_free(hookList.handle(), hook.handle());
    }
    
    /**
     * Returns the {@link org.gtk.glib.Hook} with the given id, or <code>null</code> if it is not found.
     */
    public static Hook get(HookList hookList, long hookId) {
        var RESULT = gtk_h.g_hook_get(hookList.handle(), hookId);
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Inserts a {@link org.gtk.glib.Hook} into a {@link org.gtk.glib.HookList}  before a given {@link org.gtk.glib.Hook}
     */
    public static void insertBefore(HookList hookList, Hook sibling, Hook hook) {
        gtk_h.g_hook_insert_before(hookList.handle(), sibling.handle(), hook.handle());
    }
    
    /**
     * Returns the next {@link org.gtk.glib.Hook} in a {@link org.gtk.glib.HookList} which has not been destroyed.
     * The reference count for the {@link org.gtk.glib.Hook} is incremented, so you must call
     * g_hook_unref() to restore it when no longer needed. (Or continue to call
     * g_hook_next_valid() until <code>null</code> is returned.)
     */
    public static Hook nextValid(HookList hookList, Hook hook, boolean mayBeInCall) {
        var RESULT = gtk_h.g_hook_next_valid(hookList.handle(), hook.handle(), mayBeInCall ? 1 : 0);
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Prepends a {@link org.gtk.glib.Hook} on the start of a {@link org.gtk.glib.HookList}
     */
    public static void prepend(HookList hookList, Hook hook) {
        gtk_h.g_hook_prepend(hookList.handle(), hook.handle());
    }
    
    /**
     * Increments the reference count for a {@link org.gtk.glib.Hook}
     */
    public static Hook ref(HookList hookList, Hook hook) {
        var RESULT = gtk_h.g_hook_ref(hookList.handle(), hook.handle());
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Decrements the reference count of a {@link org.gtk.glib.Hook} 
     * If the reference count falls to 0, the {@link org.gtk.glib.Hook} is removed
     * from the {@link org.gtk.glib.HookList} and g_hook_free() is called to free it.
     */
    public static void unref(HookList hookList, Hook hook) {
        gtk_h.g_hook_unref(hookList.handle(), hook.handle());
    }
    
}
