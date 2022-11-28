package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Hook} struct represents a single hook function in a {@link HookList}.
 */
public class Hook extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GHook";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("data"),
        Interop.valueLayout.ADDRESS.withName("next"),
        Interop.valueLayout.ADDRESS.withName("prev"),
        Interop.valueLayout.C_INT.withName("ref_count"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.C_LONG.withName("hook_id"),
        Interop.valueLayout.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("func"),
        Interop.valueLayout.ADDRESS.withName("destroy")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Hook}
     * @return A new, uninitialized @{link Hook}
     */
    public static Hook allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Hook newInstance = new Hook(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress data$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void data$set(java.lang.foreign.MemoryAddress data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) data);
    }
    
    /**
     * Get the value of the field {@code next}
     * @return The value of the field {@code next}
     */
    public org.gtk.glib.Hook next$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Hook(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code next}
     * @param next The new value of the field {@code next}
     */
    public void next$set(org.gtk.glib.Hook next) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), next.handle());
    }
    
    /**
     * Get the value of the field {@code prev}
     * @return The value of the field {@code prev}
     */
    public org.gtk.glib.Hook prev$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prev"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Hook(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code prev}
     * @param prev The new value of the field {@code prev}
     */
    public void prev$set(org.gtk.glib.Hook prev) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prev"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), prev.handle());
    }
    
    /**
     * Get the value of the field {@code ref_count}
     * @return The value of the field {@code ref_count}
     */
    public int refCount$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code ref_count}
     * @param refCount The new value of the field {@code ref_count}
     */
    public void refCount$set(int refCount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), refCount);
    }
    
    /**
     * Get the value of the field {@code hook_id}
     * @return The value of the field {@code hook_id}
     */
    public long hookId$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hook_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code hook_id}
     * @param hookId The new value of the field {@code hook_id}
     */
    public void hookId$set(long hookId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hook_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), hookId);
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public int flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(int flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
    }
    
    /**
     * Get the value of the field {@code func}
     * @return The value of the field {@code func}
     */
    public java.lang.foreign.MemoryAddress func$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("func"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code func}
     * @param func The new value of the field {@code func}
     */
    public void func$set(java.lang.foreign.MemoryAddress func) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("func"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) func);
    }
    
    /**
     * Get the value of the field {@code destroy}
     * @return The value of the field {@code destroy}
     */
    public org.gtk.glib.DestroyNotify destroy$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("destroy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Create a Hook proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Hook(Addressable address, Ownership ownership) {
        super(address, ownership);
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
            RESULT = (int) DowncallHandles.g_hook_compare_ids.invokeExact(
                    handle(),
                    sibling.handle());
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
            RESULT = (MemoryAddress) DowncallHandles.g_hook_alloc.invokeExact(
                    hookList.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hook(RESULT, Ownership.UNKNOWN);
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
            RESULT = (int) DowncallHandles.g_hook_destroy.invokeExact(
                    hookList.handle(),
                    hookId);
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
            DowncallHandles.g_hook_destroy_link.invokeExact(
                    hookList.handle(),
                    hook.handle());
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
            RESULT = (MemoryAddress) DowncallHandles.g_hook_find.invokeExact(
                    hookList.handle(),
                    needValids ? 1 : 0,
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbHookFindFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hook(RESULT, Ownership.UNKNOWN);
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
            RESULT = (MemoryAddress) DowncallHandles.g_hook_find_data.invokeExact(
                    hookList.handle(),
                    needValids ? 1 : 0,
                    (Addressable) data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hook(RESULT, Ownership.UNKNOWN);
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
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_find_func.invokeExact(
                    hookList.handle(),
                    needValids ? 1 : 0,
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hook(RESULT, Ownership.UNKNOWN);
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
            RESULT = (MemoryAddress) DowncallHandles.g_hook_find_func_data.invokeExact(
                    hookList.handle(),
                    needValids ? 1 : 0,
                    (Addressable) func,
                    (Addressable) data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hook(RESULT, Ownership.UNKNOWN);
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
            RESULT = (MemoryAddress) DowncallHandles.g_hook_first_valid.invokeExact(
                    hookList.handle(),
                    mayBeInCall ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hook(RESULT, Ownership.UNKNOWN);
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
            DowncallHandles.g_hook_free.invokeExact(
                    hookList.handle(),
                    hook.handle());
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
            RESULT = (MemoryAddress) DowncallHandles.g_hook_get.invokeExact(
                    hookList.handle(),
                    hookId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hook(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Inserts a {@link Hook} into a {@link HookList}, before a given {@link Hook}.
     * @param hookList a {@link HookList}
     * @param sibling the {@link Hook} to insert the new {@link Hook} before
     * @param hook the {@link Hook} to insert
     */
    public static void insertBefore(@NotNull org.gtk.glib.HookList hookList, @Nullable org.gtk.glib.Hook sibling, @NotNull org.gtk.glib.Hook hook) {
        java.util.Objects.requireNonNull(hookList, "Parameter 'hookList' must not be null");
        java.util.Objects.requireNonNull(hook, "Parameter 'hook' must not be null");
        try {
            DowncallHandles.g_hook_insert_before.invokeExact(
                    hookList.handle(),
                    (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()),
                    hook.handle());
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
            RESULT = (MemoryAddress) DowncallHandles.g_hook_next_valid.invokeExact(
                    hookList.handle(),
                    hook.handle(),
                    mayBeInCall ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hook(RESULT, Ownership.UNKNOWN);
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
            DowncallHandles.g_hook_prepend.invokeExact(
                    hookList.handle(),
                    hook.handle());
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
            RESULT = (MemoryAddress) DowncallHandles.g_hook_ref.invokeExact(
                    hookList.handle(),
                    hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hook(RESULT, Ownership.UNKNOWN);
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
            DowncallHandles.g_hook_unref.invokeExact(
                    hookList.handle(),
                    hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_hook_compare_ids = Interop.downcallHandle(
            "g_hook_compare_ids",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hook_alloc = Interop.downcallHandle(
            "g_hook_alloc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hook_destroy = Interop.downcallHandle(
            "g_hook_destroy",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_hook_destroy_link = Interop.downcallHandle(
            "g_hook_destroy_link",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hook_find = Interop.downcallHandle(
            "g_hook_find",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hook_find_data = Interop.downcallHandle(
            "g_hook_find_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hook_find_func = Interop.downcallHandle(
            "g_hook_find_func",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hook_find_func_data = Interop.downcallHandle(
            "g_hook_find_func_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hook_first_valid = Interop.downcallHandle(
            "g_hook_first_valid",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_hook_free = Interop.downcallHandle(
            "g_hook_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hook_get = Interop.downcallHandle(
            "g_hook_get",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_hook_insert_before = Interop.downcallHandle(
            "g_hook_insert_before",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hook_insert_sorted = Interop.downcallHandle(
            "g_hook_insert_sorted",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hook_next_valid = Interop.downcallHandle(
            "g_hook_next_valid",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_hook_prepend = Interop.downcallHandle(
            "g_hook_prepend",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hook_ref = Interop.downcallHandle(
            "g_hook_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hook_unref = Interop.downcallHandle(
            "g_hook_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Hook struct;
        
         /**
         * A {@link Hook.Build} object constructs a {@link Hook} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Hook.allocate();
        }
        
         /**
         * Finish building the {@link Hook} struct.
         * @return A new instance of {@code Hook} with the fields 
         *         that were set in the Build object.
         */
        public Hook construct() {
            return struct;
        }
        
        /**
         * data which is passed to func when this hook is invoked
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setData(java.lang.foreign.MemoryAddress data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
            return this;
        }
        
        /**
         * pointer to the next hook in the list
         * @param next The value for the {@code next} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNext(org.gtk.glib.Hook next) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (next == null ? MemoryAddress.NULL : next.handle()));
            return this;
        }
        
        /**
         * pointer to the previous hook in the list
         * @param prev The value for the {@code prev} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPrev(org.gtk.glib.Hook prev) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prev"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prev == null ? MemoryAddress.NULL : prev.handle()));
            return this;
        }
        
        /**
         * the reference count of this hook
         * @param refCount The value for the {@code refCount} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRefCount(int refCount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), refCount);
            return this;
        }
        
        /**
         * the id of this hook, which is unique within its list
         * @param hookId The value for the {@code hookId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHookId(long hookId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hook_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), hookId);
            return this;
        }
        
        /**
         * flags which are set for this hook. See {@link HookFlagMask} for
         *     predefined flags
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlags(int flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
            return this;
        }
        
        /**
         * the function to call when this hook is invoked. The possible
         *     signatures for this function are {@link HookFunc} and {@link HookCheckFunc}
         * @param func The value for the {@code func} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFunc(java.lang.foreign.MemoryAddress func) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func));
            return this;
        }
        
        /**
         * the default {@code finalize_hook} function of a {@link HookList} calls
         *     this member of the hook that is being finalized
         * @param destroy The value for the {@code destroy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDestroy(java.lang.foreign.MemoryAddress destroy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("destroy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (destroy == null ? MemoryAddress.NULL : destroy));
            return this;
        }
    }
}
