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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    public java.lang.foreign.MemoryAddress getData() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void setData(java.lang.foreign.MemoryAddress data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
    }
    
    /**
     * Get the value of the field {@code next}
     * @return The value of the field {@code next}
     */
    public org.gtk.glib.Hook getNext() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.glib.Hook.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code next}
     * @param next The new value of the field {@code next}
     */
    public void setNext(org.gtk.glib.Hook next) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("next"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (next == null ? MemoryAddress.NULL : next.handle()));
    }
    
    /**
     * Get the value of the field {@code prev}
     * @return The value of the field {@code prev}
     */
    public org.gtk.glib.Hook getPrev() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prev"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.glib.Hook.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code prev}
     * @param prev The new value of the field {@code prev}
     */
    public void setPrev(org.gtk.glib.Hook prev) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prev"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prev == null ? MemoryAddress.NULL : prev.handle()));
    }
    
    /**
     * Get the value of the field {@code ref_count}
     * @return The value of the field {@code ref_count}
     */
    public int getRefCount() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code ref_count}
     * @param refCount The new value of the field {@code ref_count}
     */
    public void setRefCount(int refCount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), refCount);
    }
    
    /**
     * Get the value of the field {@code hook_id}
     * @return The value of the field {@code hook_id}
     */
    public long getHookId() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hook_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code hook_id}
     * @param hookId The new value of the field {@code hook_id}
     */
    public void setHookId(long hookId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hook_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), hookId);
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public int getFlags() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(int flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
    }
    
    /**
     * Get the value of the field {@code func}
     * @return The value of the field {@code func}
     */
    public java.lang.foreign.MemoryAddress getFunc() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("func"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code func}
     * @param func The new value of the field {@code func}
     */
    public void setFunc(java.lang.foreign.MemoryAddress func) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("func"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func));
    }
    
    /**
     * Get the value of the field {@code destroy}
     * @return The value of the field {@code destroy}
     */
    public org.gtk.glib.DestroyNotify getDestroy() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("destroy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code destroy}
     * @param destroy The new value of the field {@code destroy}
     */
    public void setDestroy(org.gtk.glib.DestroyNotify destroy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("destroy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
    }
    
    /**
     * Create a Hook proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Hook(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Hook> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Hook(input, ownership);
    
    /**
     * Compares the ids of two {@link Hook} elements, returning a negative value
     * if the second id is greater than the first.
     * @param sibling a {@link Hook} to compare with {@code new_hook}
     * @return a value &lt;= 0 if the id of {@code sibling} is &gt;= the id of {@code new_hook}
     */
    public int compareIds(org.gtk.glib.Hook sibling) {
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
    public static org.gtk.glib.Hook alloc(org.gtk.glib.HookList hookList) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_alloc.invokeExact(
                    hookList.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Hook.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Destroys a {@link Hook}, given its ID.
     * @param hookList a {@link HookList}
     * @param hookId a hook ID
     * @return {@code true} if the {@link Hook} was found in the {@link HookList} and destroyed
     */
    public static boolean destroy(org.gtk.glib.HookList hookList, long hookId) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_hook_destroy.invokeExact(
                    hookList.handle(),
                    hookId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Removes one {@link Hook} from a {@link HookList}, marking it
     * inactive and calling g_hook_unref() on it.
     * @param hookList a {@link HookList}
     * @param hook the {@link Hook} to remove
     */
    public static void destroyLink(org.gtk.glib.HookList hookList, org.gtk.glib.Hook hook) {
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
    public static org.gtk.glib.Hook find(org.gtk.glib.HookList hookList, boolean needValids, org.gtk.glib.HookFindFunc func) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_find.invokeExact(
                    hookList.handle(),
                    Marshal.booleanToInteger.marshal(needValids, null).intValue(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Hook.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Finds a {@link Hook} in a {@link HookList} with the given data.
     * @param hookList a {@link HookList}
     * @param needValids {@code true} if {@link Hook} elements which have been destroyed
     *     should be skipped
     * @return the {@link Hook} with the given {@code data} or {@code null} if no matching
     *     {@link Hook} is found
     */
    public static org.gtk.glib.Hook findData(org.gtk.glib.HookList hookList, boolean needValids) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_find_data.invokeExact(
                    hookList.handle(),
                    Marshal.booleanToInteger.marshal(needValids, null).intValue(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Hook.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
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
    public static org.gtk.glib.Hook findFunc(org.gtk.glib.HookList hookList, boolean needValids, @Nullable java.lang.foreign.MemoryAddress func) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_find_func.invokeExact(
                    hookList.handle(),
                    Marshal.booleanToInteger.marshal(needValids, null).intValue(),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Hook.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Finds a {@link Hook} in a {@link HookList} with the given function and data.
     * @param hookList a {@link HookList}
     * @param needValids {@code true} if {@link Hook} elements which have been destroyed
     *     should be skipped
     * @param func the function to find
     * @return the {@link Hook} with the given {@code func} and {@code data} or {@code null} if
     *     no matching {@link Hook} is found
     */
    public static org.gtk.glib.Hook findFuncData(org.gtk.glib.HookList hookList, boolean needValids, java.lang.foreign.MemoryAddress func) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_find_func_data.invokeExact(
                    hookList.handle(),
                    Marshal.booleanToInteger.marshal(needValids, null).intValue(),
                    (Addressable) func,
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Hook.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
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
    public static org.gtk.glib.Hook firstValid(org.gtk.glib.HookList hookList, boolean mayBeInCall) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_first_valid.invokeExact(
                    hookList.handle(),
                    Marshal.booleanToInteger.marshal(mayBeInCall, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Hook.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Calls the {@link HookList} {@code finalize_hook} function if it exists,
     * and frees the memory allocated for the {@link Hook}.
     * @param hookList a {@link HookList}
     * @param hook the {@link Hook} to free
     */
    public static void free(org.gtk.glib.HookList hookList, org.gtk.glib.Hook hook) {
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
    public static org.gtk.glib.Hook get(org.gtk.glib.HookList hookList, long hookId) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_get.invokeExact(
                    hookList.handle(),
                    hookId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Hook.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Inserts a {@link Hook} into a {@link HookList}, before a given {@link Hook}.
     * @param hookList a {@link HookList}
     * @param sibling the {@link Hook} to insert the new {@link Hook} before
     * @param hook the {@link Hook} to insert
     */
    public static void insertBefore(org.gtk.glib.HookList hookList, @Nullable org.gtk.glib.Hook sibling, org.gtk.glib.Hook hook) {
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
    public static void insertSorted(org.gtk.glib.HookList hookList, org.gtk.glib.Hook hook, org.gtk.glib.HookCompareFunc func) {
        try {
            DowncallHandles.g_hook_insert_sorted.invokeExact(
                    hookList.handle(),
                    hook.handle(),
                    (Addressable) func.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    public static org.gtk.glib.Hook nextValid(org.gtk.glib.HookList hookList, org.gtk.glib.Hook hook, boolean mayBeInCall) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_next_valid.invokeExact(
                    hookList.handle(),
                    hook.handle(),
                    Marshal.booleanToInteger.marshal(mayBeInCall, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Hook.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Prepends a {@link Hook} on the start of a {@link HookList}.
     * @param hookList a {@link HookList}
     * @param hook the {@link Hook} to add to the start of {@code hook_list}
     */
    public static void prepend(org.gtk.glib.HookList hookList, org.gtk.glib.Hook hook) {
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
    public static org.gtk.glib.Hook ref(org.gtk.glib.HookList hookList, org.gtk.glib.Hook hook) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hook_ref.invokeExact(
                    hookList.handle(),
                    hook.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Hook.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Decrements the reference count of a {@link Hook}.
     * If the reference count falls to 0, the {@link Hook} is removed
     * from the {@link HookList} and g_hook_free() is called to free it.
     * @param hookList a {@link HookList}
     * @param hook the {@link Hook} to unref
     */
    public static void unref(org.gtk.glib.HookList hookList, org.gtk.glib.Hook hook) {
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
     * A {@link Hook.Builder} object constructs a {@link Hook} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Hook.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Hook struct;
        
        private Builder() {
            struct = Hook.allocate();
        }
        
         /**
         * Finish building the {@link Hook} struct.
         * @return A new instance of {@code Hook} with the fields 
         *         that were set in the Builder object.
         */
        public Hook build() {
            return struct;
        }
        
        /**
         * data which is passed to func when this hook is invoked
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setData(java.lang.foreign.MemoryAddress data) {
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
        public Builder setNext(org.gtk.glib.Hook next) {
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
        public Builder setPrev(org.gtk.glib.Hook prev) {
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
        public Builder setRefCount(int refCount) {
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
        public Builder setHookId(long hookId) {
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
        public Builder setFlags(int flags) {
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
        public Builder setFunc(java.lang.foreign.MemoryAddress func) {
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
        public Builder setDestroy(org.gtk.glib.DestroyNotify destroy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("destroy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
            return this;
        }
    }
}
