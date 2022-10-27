package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Hook} struct represents a single hook function in a {@link HookList}.
 */
public class Hook extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("data"),
        org.gtk.glib.Hook.getMemoryLayout().withName("next"),
        org.gtk.glib.Hook.getMemoryLayout().withName("prev"),
        ValueLayout.JAVA_INT.withName("ref_count"),
        ValueLayout.JAVA_LONG.withName("hook_id"),
        ValueLayout.JAVA_INT.withName("flags"),
        Interop.valueLayout.ADDRESS.withName("func"),
        Interop.valueLayout.ADDRESS.withName("destroy")
    ).withName("GHook");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public Hook(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Compares the ids of two {@link Hook} elements, returning a negative value
     * if the second id is greater than the first.
     * @param sibling a {@link Hook} to compare with {@code new_hook}
     * @return a value &lt;= 0 if the id of {@code sibling} is &gt;= the id of {@code new_hook}
     */
    public int compareIds(@NotNull org.gtk.glib.Hook sibling) {
        java.util.Objects.requireNonNull(sibling, "Parameter 'sibling' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hook_compare_ids.invokeExact(handle(), sibling.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates space for a {@link Hook} and initializes it.
     * @param hookList a {@link HookList}
     * @return a new {@link Hook}
     */
    public static @NotNull org.gtk.glib.Hook alloc(@NotNull org.gtk.glib.HookList hookList) {
        java.util.Objects.requireNonNull(hookList, "Parameter 'hookList' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_alloc.invokeExact(hookList.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hook(Refcounted.get(RESULT, false));
    }
    
    /**
     * Destroys a {@link Hook}, given its ID.
     * @param hookList a {@link HookList}
     * @param hookId a hook ID
     * @return {@code true} if the {@link Hook} was found in the {@link HookList} and destroyed
     */
    public static boolean destroy(@NotNull org.gtk.glib.HookList hookList, long hookId) {
        java.util.Objects.requireNonNull(hookList, "Parameter 'hookList' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hook_destroy.invokeExact(hookList.handle(), hookId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Removes one {@link Hook} from a {@link HookList}, marking it
     * inactive and calling g_hook_unref() on it.
     * @param hookList a {@link HookList}
     * @param hook the {@link Hook} to remove
     */
    public static void destroyLink(@NotNull org.gtk.glib.HookList hookList, @NotNull org.gtk.glib.Hook hook) {
        java.util.Objects.requireNonNull(hookList, "Parameter 'hookList' must not be null");
        java.util.Objects.requireNonNull(hook, "Parameter 'hook' must not be null");
        try {
            DowncallHandles.g_hook_destroy_link.invokeExact(hookList.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finds a {@link Hook} in a {@link HookList} using the given function to
     * test for a match.
     * @param hookList a {@link HookList}
     * @param needValids {@code true} if {@link Hook} elements which have been destroyed
     *     should be skipped
     * @param func the function to call for each {@link Hook}, which should return
     *     {@code true} when the {@link Hook} has been found
     * @return the found {@link Hook} or {@code null} if no matching {@link Hook} is found
     */
    public static @NotNull org.gtk.glib.Hook find(@NotNull org.gtk.glib.HookList hookList, boolean needValids, @NotNull org.gtk.glib.HookFindFunc func) {
        java.util.Objects.requireNonNull(hookList, "Parameter 'hookList' must not be null");
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_find.invokeExact(hookList.handle(), needValids ? 1 : 0, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbHookFindFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hook(Refcounted.get(RESULT, false));
    }
    
    /**
     * Finds a {@link Hook} in a {@link HookList} with the given data.
     * @param hookList a {@link HookList}
     * @param needValids {@code true} if {@link Hook} elements which have been destroyed
     *     should be skipped
     * @param data the data to find
     * @return the {@link Hook} with the given {@code data} or {@code null} if no matching
     *     {@link Hook} is found
     */
    public static @NotNull org.gtk.glib.Hook findData(@NotNull org.gtk.glib.HookList hookList, boolean needValids, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(hookList, "Parameter 'hookList' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_find_data.invokeExact(hookList.handle(), needValids ? 1 : 0, data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hook(Refcounted.get(RESULT, false));
    }
    
    /**
     * Finds a {@link Hook} in a {@link HookList} with the given function.
     * @param hookList a {@link HookList}
     * @param needValids {@code true} if {@link Hook} elements which have been destroyed
     *     should be skipped
     * @param func the function to find
     * @return the {@link Hook} with the given {@code func} or {@code null} if no matching
     *     {@link Hook} is found
     */
    public static @NotNull org.gtk.glib.Hook findFunc(@NotNull org.gtk.glib.HookList hookList, boolean needValids, @Nullable java.lang.foreign.MemoryAddress func) {
        java.util.Objects.requireNonNull(hookList, "Parameter 'hookList' must not be null");
        java.util.Objects.requireNonNullElse(func, MemoryAddress.NULL);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_find_func.invokeExact(hookList.handle(), needValids ? 1 : 0, func);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hook(Refcounted.get(RESULT, false));
    }
    
    /**
     * Finds a {@link Hook} in a {@link HookList} with the given function and data.
     * @param hookList a {@link HookList}
     * @param needValids {@code true} if {@link Hook} elements which have been destroyed
     *     should be skipped
     * @param func the function to find
     * @param data the data to find
     * @return the {@link Hook} with the given {@code func} and {@code data} or {@code null} if
     *     no matching {@link Hook} is found
     */
    public static @NotNull org.gtk.glib.Hook findFuncData(@NotNull org.gtk.glib.HookList hookList, boolean needValids, @NotNull java.lang.foreign.MemoryAddress func, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(hookList, "Parameter 'hookList' must not be null");
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_find_func_data.invokeExact(hookList.handle(), needValids ? 1 : 0, func, data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hook(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the first {@link Hook} in a {@link HookList} which has not been destroyed.
     * The reference count for the {@link Hook} is incremented, so you must call
     * g_hook_unref() to restore it when no longer needed. (Or call
     * g_hook_next_valid() if you are stepping through the {@link HookList}.)
     * @param hookList a {@link HookList}
     * @param mayBeInCall {@code true} if hooks which are currently running
     *     (e.g. in another thread) are considered valid. If set to {@code false},
     *     these are skipped
     * @return the first valid {@link Hook}, or {@code null} if none are valid
     */
    public static @NotNull org.gtk.glib.Hook firstValid(@NotNull org.gtk.glib.HookList hookList, boolean mayBeInCall) {
        java.util.Objects.requireNonNull(hookList, "Parameter 'hookList' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_first_valid.invokeExact(hookList.handle(), mayBeInCall ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hook(Refcounted.get(RESULT, false));
    }
    
    /**
     * Calls the {@link HookList} {@code finalize_hook} function if it exists,
     * and frees the memory allocated for the {@link Hook}.
     * @param hookList a {@link HookList}
     * @param hook the {@link Hook} to free
     */
    public static void free(@NotNull org.gtk.glib.HookList hookList, @NotNull org.gtk.glib.Hook hook) {
        java.util.Objects.requireNonNull(hookList, "Parameter 'hookList' must not be null");
        java.util.Objects.requireNonNull(hook, "Parameter 'hook' must not be null");
        try {
            DowncallHandles.g_hook_free.invokeExact(hookList.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the {@link Hook} with the given id, or {@code null} if it is not found.
     * @param hookList a {@link HookList}
     * @param hookId a hook id
     * @return the {@link Hook} with the given id, or {@code null} if it is not found
     */
    public static @NotNull org.gtk.glib.Hook get(@NotNull org.gtk.glib.HookList hookList, long hookId) {
        java.util.Objects.requireNonNull(hookList, "Parameter 'hookList' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_get.invokeExact(hookList.handle(), hookId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hook(Refcounted.get(RESULT, false));
    }
    
    /**
     * Inserts a {@link Hook} into a {@link HookList}, before a given {@link Hook}.
     * @param hookList a {@link HookList}
     * @param sibling the {@link Hook} to insert the new {@link Hook} before
     * @param hook the {@link Hook} to insert
     */
    public static void insertBefore(@NotNull org.gtk.glib.HookList hookList, @Nullable org.gtk.glib.Hook sibling, @NotNull org.gtk.glib.Hook hook) {
        java.util.Objects.requireNonNull(hookList, "Parameter 'hookList' must not be null");
        java.util.Objects.requireNonNullElse(sibling, MemoryAddress.NULL);
        java.util.Objects.requireNonNull(hook, "Parameter 'hook' must not be null");
        try {
            DowncallHandles.g_hook_insert_before.invokeExact(hookList.handle(), sibling.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts a {@link Hook} into a {@link HookList}, sorted by the given function.
     * @param hookList a {@link HookList}
     * @param hook the {@link Hook} to insert
     * @param func the comparison function used to sort the {@link Hook} elements
     */
    public static void insertSorted(@NotNull org.gtk.glib.HookList hookList, @NotNull org.gtk.glib.Hook hook, @NotNull org.gtk.glib.HookCompareFunc func) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Returns the next {@link Hook} in a {@link HookList} which has not been destroyed.
     * The reference count for the {@link Hook} is incremented, so you must call
     * g_hook_unref() to restore it when no longer needed. (Or continue to call
     * g_hook_next_valid() until {@code null} is returned.)
     * @param hookList a {@link HookList}
     * @param hook the current {@link Hook}
     * @param mayBeInCall {@code true} if hooks which are currently running
     *     (e.g. in another thread) are considered valid. If set to {@code false},
     *     these are skipped
     * @return the next valid {@link Hook}, or {@code null} if none are valid
     */
    public static @NotNull org.gtk.glib.Hook nextValid(@NotNull org.gtk.glib.HookList hookList, @NotNull org.gtk.glib.Hook hook, boolean mayBeInCall) {
        java.util.Objects.requireNonNull(hookList, "Parameter 'hookList' must not be null");
        java.util.Objects.requireNonNull(hook, "Parameter 'hook' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_next_valid.invokeExact(hookList.handle(), hook.handle(), mayBeInCall ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hook(Refcounted.get(RESULT, false));
    }
    
    /**
     * Prepends a {@link Hook} on the start of a {@link HookList}.
     * @param hookList a {@link HookList}
     * @param hook the {@link Hook} to add to the start of {@code hook_list}
     */
    public static void prepend(@NotNull org.gtk.glib.HookList hookList, @NotNull org.gtk.glib.Hook hook) {
        java.util.Objects.requireNonNull(hookList, "Parameter 'hookList' must not be null");
        java.util.Objects.requireNonNull(hook, "Parameter 'hook' must not be null");
        try {
            DowncallHandles.g_hook_prepend.invokeExact(hookList.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increments the reference count for a {@link Hook}.
     * @param hookList a {@link HookList}
     * @param hook the {@link Hook} to increment the reference count of
     * @return the {@code hook} that was passed in (since 2.6)
     */
    public static @NotNull org.gtk.glib.Hook ref(@NotNull org.gtk.glib.HookList hookList, @NotNull org.gtk.glib.Hook hook) {
        java.util.Objects.requireNonNull(hookList, "Parameter 'hookList' must not be null");
        java.util.Objects.requireNonNull(hook, "Parameter 'hook' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_ref.invokeExact(hookList.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hook(Refcounted.get(RESULT, false));
    }
    
    /**
     * Decrements the reference count of a {@link Hook}.
     * If the reference count falls to 0, the {@link Hook} is removed
     * from the {@link HookList} and g_hook_free() is called to free it.
     * @param hookList a {@link HookList}
     * @param hook the {@link Hook} to unref
     */
    public static void unref(@NotNull org.gtk.glib.HookList hookList, @NotNull org.gtk.glib.Hook hook) {
        java.util.Objects.requireNonNull(hookList, "Parameter 'hookList' must not be null");
        java.util.Objects.requireNonNull(hook, "Parameter 'hook' must not be null");
        try {
            DowncallHandles.g_hook_unref.invokeExact(hookList.handle(), hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_hook_compare_ids = Interop.downcallHandle(
            "g_hook_compare_ids",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hook_alloc = Interop.downcallHandle(
            "g_hook_alloc",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hook_destroy = Interop.downcallHandle(
            "g_hook_destroy",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_hook_destroy_link = Interop.downcallHandle(
            "g_hook_destroy_link",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hook_find = Interop.downcallHandle(
            "g_hook_find",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hook_find_data = Interop.downcallHandle(
            "g_hook_find_data",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hook_find_func = Interop.downcallHandle(
            "g_hook_find_func",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hook_find_func_data = Interop.downcallHandle(
            "g_hook_find_func_data",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hook_first_valid = Interop.downcallHandle(
            "g_hook_first_valid",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_hook_free = Interop.downcallHandle(
            "g_hook_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hook_get = Interop.downcallHandle(
            "g_hook_get",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_hook_insert_before = Interop.downcallHandle(
            "g_hook_insert_before",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hook_insert_sorted = Interop.downcallHandle(
            "g_hook_insert_sorted",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hook_next_valid = Interop.downcallHandle(
            "g_hook_next_valid",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_hook_prepend = Interop.downcallHandle(
            "g_hook_prepend",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hook_ref = Interop.downcallHandle(
            "g_hook_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_hook_unref = Interop.downcallHandle(
            "g_hook_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
