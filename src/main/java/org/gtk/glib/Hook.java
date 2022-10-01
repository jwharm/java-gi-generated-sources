package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link Hook} struct represents a single hook function in a {@link HookList}.
 */
public class Hook extends io.github.jwharm.javagi.ResourceBase {

    public Hook(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public Hook() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GHook.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Compares the ids of two {@link Hook} elements, returning a negative value
     * if the second id is greater than the first.
     */
    public int compareIds(Hook sibling) {
        var RESULT = gtk_h.g_hook_compare_ids(handle(), sibling.handle());
        return RESULT;
    }
    
    /**
     * Allocates space for a {@link Hook} and initializes it.
     */
    public static Hook alloc(HookList hookList) {
        var RESULT = gtk_h.g_hook_alloc(hookList.handle());
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Destroys a {@link Hook}, given its ID.
     */
    public static boolean destroy(HookList hookList, long hookId) {
        var RESULT = gtk_h.g_hook_destroy(hookList.handle(), hookId);
        return RESULT != 0;
    }
    
    /**
     * Removes one {@link Hook} from a {@link HookList}, marking it
     * inactive and calling g_hook_unref() on it.
     */
    public static void destroyLink(HookList hookList, Hook hook) {
        gtk_h.g_hook_destroy_link(hookList.handle(), hook.handle());
    }
    
    /**
     * Finds a {@link Hook} in a {@link HookList} using the given function to
     * test for a match.
     */
    public static Hook find(HookList hookList, boolean needValids, HookFindFunc func) {
        try {
            var RESULT = gtk_h.g_hook_find(hookList.handle(), needValids ? 1 : 0, 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbHookFindFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
            return new Hook(References.get(RESULT, false));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finds a {@link Hook} in a {@link HookList} with the given data.
     */
    public static Hook findData(HookList hookList, boolean needValids, java.lang.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_hook_find_data(hookList.handle(), needValids ? 1 : 0, data);
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Finds a {@link Hook} in a {@link HookList} with the given function.
     */
    public static Hook findFunc(HookList hookList, boolean needValids, java.lang.foreign.MemoryAddress func) {
        var RESULT = gtk_h.g_hook_find_func(hookList.handle(), needValids ? 1 : 0, func);
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Finds a {@link Hook} in a {@link HookList} with the given function and data.
     */
    public static Hook findFuncData(HookList hookList, boolean needValids, java.lang.foreign.MemoryAddress func, java.lang.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_hook_find_func_data(hookList.handle(), needValids ? 1 : 0, func, data);
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Returns the first {@link Hook} in a {@link HookList} which has not been destroyed.
     * The reference count for the {@link Hook} is incremented, so you must call
     * g_hook_unref() to restore it when no longer needed. (Or call
     * g_hook_next_valid() if you are stepping through the {@link HookList}.)
     */
    public static Hook firstValid(HookList hookList, boolean mayBeInCall) {
        var RESULT = gtk_h.g_hook_first_valid(hookList.handle(), mayBeInCall ? 1 : 0);
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Calls the {@link HookList} {@code finalize_hook} function if it exists,
     * and frees the memory allocated for the {@link Hook}.
     */
    public static void free(HookList hookList, Hook hook) {
        gtk_h.g_hook_free(hookList.handle(), hook.handle());
    }
    
    /**
     * Returns the {@link Hook} with the given id, or {@code null} if it is not found.
     */
    public static Hook get(HookList hookList, long hookId) {
        var RESULT = gtk_h.g_hook_get(hookList.handle(), hookId);
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Inserts a {@link Hook} into a {@link HookList}, before a given {@link Hook}.
     */
    public static void insertBefore(HookList hookList, Hook sibling, Hook hook) {
        gtk_h.g_hook_insert_before(hookList.handle(), sibling.handle(), hook.handle());
    }
    
    /**
     * Returns the next {@link Hook} in a {@link HookList} which has not been destroyed.
     * The reference count for the {@link Hook} is incremented, so you must call
     * g_hook_unref() to restore it when no longer needed. (Or continue to call
     * g_hook_next_valid() until {@code null} is returned.)
     */
    public static Hook nextValid(HookList hookList, Hook hook, boolean mayBeInCall) {
        var RESULT = gtk_h.g_hook_next_valid(hookList.handle(), hook.handle(), mayBeInCall ? 1 : 0);
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Prepends a {@link Hook} on the start of a {@link HookList}.
     */
    public static void prepend(HookList hookList, Hook hook) {
        gtk_h.g_hook_prepend(hookList.handle(), hook.handle());
    }
    
    /**
     * Increments the reference count for a {@link Hook}.
     */
    public static Hook ref(HookList hookList, Hook hook) {
        var RESULT = gtk_h.g_hook_ref(hookList.handle(), hook.handle());
        return new Hook(References.get(RESULT, false));
    }
    
    /**
     * Decrements the reference count of a {@link Hook}.
     * If the reference count falls to 0, the {@link Hook} is removed
     * from the {@link HookList} and g_hook_free() is called to free it.
     */
    public static void unref(HookList hookList, Hook hook) {
        gtk_h.g_hook_unref(hookList.handle(), hook.handle());
    }
    
}
