package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link Hook} struct represents a single hook function in a {@link HookList}.
 */
public class Hook extends io.github.jwharm.javagi.ResourceBase {

    public Hook(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_hook_compare_ids = Interop.downcallHandle(
        "g_hook_compare_ids",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares the ids of two {@link Hook} elements, returning a negative value
     * if the second id is greater than the first.
     */
    public int compareIds(Hook sibling) {
        try {
            var RESULT = (int) g_hook_compare_ids.invokeExact(handle(), sibling.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_alloc = Interop.downcallHandle(
        "g_hook_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Allocates space for a {@link Hook} and initializes it.
     */
    public static Hook alloc(HookList hookList) {
        try {
            var RESULT = (MemoryAddress) g_hook_alloc.invokeExact(hookList.handle());
            return new Hook(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_destroy = Interop.downcallHandle(
        "g_hook_destroy",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Destroys a {@link Hook}, given its ID.
     */
    public static boolean destroy(HookList hookList, long hookId) {
        try {
            var RESULT = (int) g_hook_destroy.invokeExact(hookList.handle(), hookId);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_destroy_link = Interop.downcallHandle(
        "g_hook_destroy_link",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes one {@link Hook} from a {@link HookList}, marking it
     * inactive and calling g_hook_unref() on it.
     */
    public static void destroyLink(HookList hookList, Hook hook) {
        try {
            g_hook_destroy_link.invokeExact(hookList.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_find = Interop.downcallHandle(
        "g_hook_find",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds a {@link Hook} in a {@link HookList} using the given function to
     * test for a match.
     */
    public static Hook find(HookList hookList, boolean needValids, HookFindFunc func) {
        try {
            var RESULT = (MemoryAddress) g_hook_find.invokeExact(hookList.handle(), needValids ? 1 : 0, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbHookFindFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
            return new Hook(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_find_data = Interop.downcallHandle(
        "g_hook_find_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds a {@link Hook} in a {@link HookList} with the given data.
     */
    public static Hook findData(HookList hookList, boolean needValids, java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (MemoryAddress) g_hook_find_data.invokeExact(hookList.handle(), needValids ? 1 : 0, data);
            return new Hook(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_find_func = Interop.downcallHandle(
        "g_hook_find_func",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds a {@link Hook} in a {@link HookList} with the given function.
     */
    public static Hook findFunc(HookList hookList, boolean needValids, java.lang.foreign.MemoryAddress func) {
        try {
            var RESULT = (MemoryAddress) g_hook_find_func.invokeExact(hookList.handle(), needValids ? 1 : 0, func);
            return new Hook(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_find_func_data = Interop.downcallHandle(
        "g_hook_find_func_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds a {@link Hook} in a {@link HookList} with the given function and data.
     */
    public static Hook findFuncData(HookList hookList, boolean needValids, java.lang.foreign.MemoryAddress func, java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (MemoryAddress) g_hook_find_func_data.invokeExact(hookList.handle(), needValids ? 1 : 0, func, data);
            return new Hook(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_first_valid = Interop.downcallHandle(
        "g_hook_first_valid",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the first {@link Hook} in a {@link HookList} which has not been destroyed.
     * The reference count for the {@link Hook} is incremented, so you must call
     * g_hook_unref() to restore it when no longer needed. (Or call
     * g_hook_next_valid() if you are stepping through the {@link HookList}.)
     */
    public static Hook firstValid(HookList hookList, boolean mayBeInCall) {
        try {
            var RESULT = (MemoryAddress) g_hook_first_valid.invokeExact(hookList.handle(), mayBeInCall ? 1 : 0);
            return new Hook(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_free = Interop.downcallHandle(
        "g_hook_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls the {@link HookList} {@code finalize_hook} function if it exists,
     * and frees the memory allocated for the {@link Hook}.
     */
    public static void free(HookList hookList, Hook hook) {
        try {
            g_hook_free.invokeExact(hookList.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_get = Interop.downcallHandle(
        "g_hook_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the {@link Hook} with the given id, or {@code null} if it is not found.
     */
    public static Hook get(HookList hookList, long hookId) {
        try {
            var RESULT = (MemoryAddress) g_hook_get.invokeExact(hookList.handle(), hookId);
            return new Hook(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_insert_before = Interop.downcallHandle(
        "g_hook_insert_before",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a {@link Hook} into a {@link HookList}, before a given {@link Hook}.
     */
    public static void insertBefore(HookList hookList, Hook sibling, Hook hook) {
        try {
            g_hook_insert_before.invokeExact(hookList.handle(), sibling.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_next_valid = Interop.downcallHandle(
        "g_hook_next_valid",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the next {@link Hook} in a {@link HookList} which has not been destroyed.
     * The reference count for the {@link Hook} is incremented, so you must call
     * g_hook_unref() to restore it when no longer needed. (Or continue to call
     * g_hook_next_valid() until {@code null} is returned.)
     */
    public static Hook nextValid(HookList hookList, Hook hook, boolean mayBeInCall) {
        try {
            var RESULT = (MemoryAddress) g_hook_next_valid.invokeExact(hookList.handle(), hook.handle(), mayBeInCall ? 1 : 0);
            return new Hook(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_prepend = Interop.downcallHandle(
        "g_hook_prepend",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prepends a {@link Hook} on the start of a {@link HookList}.
     */
    public static void prepend(HookList hookList, Hook hook) {
        try {
            g_hook_prepend.invokeExact(hookList.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_ref = Interop.downcallHandle(
        "g_hook_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increments the reference count for a {@link Hook}.
     */
    public static Hook ref(HookList hookList, Hook hook) {
        try {
            var RESULT = (MemoryAddress) g_hook_ref.invokeExact(hookList.handle(), hook.handle());
            return new Hook(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hook_unref = Interop.downcallHandle(
        "g_hook_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Decrements the reference count of a {@link Hook}.
     * If the reference count falls to 0, the {@link Hook} is removed
     * from the {@link HookList} and g_hook_free() is called to free it.
     */
    public static void unref(HookList hookList, Hook hook) {
        try {
            g_hook_unref.invokeExact(hookList.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
