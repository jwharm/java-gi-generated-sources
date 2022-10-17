package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Hook} struct represents a single hook function in a {@link HookList}.
 */
public class Hook extends io.github.jwharm.javagi.ResourceBase {

    public Hook(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_hook_compare_ids = Interop.downcallHandle(
        "g_hook_compare_ids",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares the ids of two {@link Hook} elements, returning a negative value
     * if the second id is greater than the first.
     */
    public int compareIds(@NotNull Hook sibling) {
        int RESULT;
        try {
            RESULT = (int) g_hook_compare_ids.invokeExact(handle(), sibling.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_hook_alloc = Interop.downcallHandle(
        "g_hook_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Allocates space for a {@link Hook} and initializes it.
     */
    public static @NotNull Hook alloc(@NotNull HookList hookList) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_hook_alloc.invokeExact(hookList.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Hook(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_hook_destroy = Interop.downcallHandle(
        "g_hook_destroy",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Destroys a {@link Hook}, given its ID.
     */
    public static boolean destroy(@NotNull HookList hookList, @NotNull long hookId) {
        int RESULT;
        try {
            RESULT = (int) g_hook_destroy.invokeExact(hookList.handle(), hookId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_hook_destroy_link = Interop.downcallHandle(
        "g_hook_destroy_link",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes one {@link Hook} from a {@link HookList}, marking it
     * inactive and calling g_hook_unref() on it.
     */
    public static @NotNull void destroyLink(@NotNull HookList hookList, @NotNull Hook hook) {
        try {
            g_hook_destroy_link.invokeExact(hookList.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_hook_find = Interop.downcallHandle(
        "g_hook_find",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds a {@link Hook} in a {@link HookList} using the given function to
     * test for a match.
     */
    public static @NotNull Hook find(@NotNull HookList hookList, @NotNull boolean needValids, @NotNull HookFindFunc func) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_hook_find.invokeExact(hookList.handle(), needValids ? 1 : 0, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbHookFindFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Hook(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_hook_find_data = Interop.downcallHandle(
        "g_hook_find_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds a {@link Hook} in a {@link HookList} with the given data.
     */
    public static @NotNull Hook findData(@NotNull HookList hookList, @NotNull boolean needValids, @Nullable java.lang.foreign.MemoryAddress data) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_hook_find_data.invokeExact(hookList.handle(), needValids ? 1 : 0, data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Hook(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_hook_find_func = Interop.downcallHandle(
        "g_hook_find_func",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds a {@link Hook} in a {@link HookList} with the given function.
     */
    public static @NotNull Hook findFunc(@NotNull HookList hookList, @NotNull boolean needValids, @Nullable java.lang.foreign.MemoryAddress func) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_hook_find_func.invokeExact(hookList.handle(), needValids ? 1 : 0, func);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Hook(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_hook_find_func_data = Interop.downcallHandle(
        "g_hook_find_func_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds a {@link Hook} in a {@link HookList} with the given function and data.
     */
    public static @NotNull Hook findFuncData(@NotNull HookList hookList, @NotNull boolean needValids, @NotNull java.lang.foreign.MemoryAddress func, @Nullable java.lang.foreign.MemoryAddress data) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_hook_find_func_data.invokeExact(hookList.handle(), needValids ? 1 : 0, func, data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Hook(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_hook_first_valid = Interop.downcallHandle(
        "g_hook_first_valid",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the first {@link Hook} in a {@link HookList} which has not been destroyed.
     * The reference count for the {@link Hook} is incremented, so you must call
     * g_hook_unref() to restore it when no longer needed. (Or call
     * g_hook_next_valid() if you are stepping through the {@link HookList}.)
     */
    public static @NotNull Hook firstValid(@NotNull HookList hookList, @NotNull boolean mayBeInCall) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_hook_first_valid.invokeExact(hookList.handle(), mayBeInCall ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Hook(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_hook_free = Interop.downcallHandle(
        "g_hook_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls the {@link HookList} {@code finalize_hook} function if it exists,
     * and frees the memory allocated for the {@link Hook}.
     */
    public static @NotNull void free(@NotNull HookList hookList, @NotNull Hook hook) {
        try {
            g_hook_free.invokeExact(hookList.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_hook_get = Interop.downcallHandle(
        "g_hook_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the {@link Hook} with the given id, or {@code null} if it is not found.
     */
    public static @NotNull Hook get(@NotNull HookList hookList, @NotNull long hookId) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_hook_get.invokeExact(hookList.handle(), hookId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Hook(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_hook_insert_before = Interop.downcallHandle(
        "g_hook_insert_before",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a {@link Hook} into a {@link HookList}, before a given {@link Hook}.
     */
    public static @NotNull void insertBefore(@NotNull HookList hookList, @Nullable Hook sibling, @NotNull Hook hook) {
        try {
            g_hook_insert_before.invokeExact(hookList.handle(), sibling.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_hook_next_valid = Interop.downcallHandle(
        "g_hook_next_valid",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the next {@link Hook} in a {@link HookList} which has not been destroyed.
     * The reference count for the {@link Hook} is incremented, so you must call
     * g_hook_unref() to restore it when no longer needed. (Or continue to call
     * g_hook_next_valid() until {@code null} is returned.)
     */
    public static @NotNull Hook nextValid(@NotNull HookList hookList, @NotNull Hook hook, @NotNull boolean mayBeInCall) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_hook_next_valid.invokeExact(hookList.handle(), hook.handle(), mayBeInCall ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Hook(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_hook_prepend = Interop.downcallHandle(
        "g_hook_prepend",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prepends a {@link Hook} on the start of a {@link HookList}.
     */
    public static @NotNull void prepend(@NotNull HookList hookList, @NotNull Hook hook) {
        try {
            g_hook_prepend.invokeExact(hookList.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_hook_ref = Interop.downcallHandle(
        "g_hook_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increments the reference count for a {@link Hook}.
     */
    public static @NotNull Hook ref(@NotNull HookList hookList, @NotNull Hook hook) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_hook_ref.invokeExact(hookList.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Hook(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_hook_unref = Interop.downcallHandle(
        "g_hook_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Decrements the reference count of a {@link Hook}.
     * If the reference count falls to 0, the {@link Hook} is removed
     * from the {@link HookList} and g_hook_free() is called to free it.
     */
    public static @NotNull void unref(@NotNull HookList hookList, @NotNull Hook hook) {
        try {
            g_hook_unref.invokeExact(hookList.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
