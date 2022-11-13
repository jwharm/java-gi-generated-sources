package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link StrvBuilder} is a method of easily building dynamically sized
 * NULL-terminated string arrays.
 * <p>
 * The following example shows how to build a two element array:
 * <pre>{@code <!-- language="C" -->
 *   g_autoptr(GStrvBuilder) builder = g_strv_builder_new ();
 *   g_strv_builder_add (builder, "hello");
 *   g_strv_builder_add (builder, "world");
 *   g_auto(GStrv) array = g_strv_builder_end (builder);
 * }</pre>
 * @version 2.68
 */
public class StrvBuilder extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GStrvBuilder";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static StrvBuilder allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        StrvBuilder newInstance = new StrvBuilder(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a StrvBuilder proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public StrvBuilder(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Add a string to the end of the array.
     * <p>
     * Since 2.68
     * @param value a string.
     */
    public void add(@NotNull java.lang.String value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.g_strv_builder_add.invokeExact(
                    handle(),
                    Interop.allocateNativeString(value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Appends all the given strings to the builder.
     * <p>
     * Since 2.70
     * @param varargs one or more strings followed by {@code null}
     */
    public void addMany(java.lang.Object... varargs) {
        try {
            DowncallHandles.g_strv_builder_add_many.invokeExact(
                    handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Appends all the strings in the given vector to the builder.
     * <p>
     * Since 2.70
     * @param value the vector of strings to add
     */
    public void addv(@NotNull java.lang.String[] value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.g_strv_builder_addv.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(value, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Ends the builder process and returns the constructed NULL-terminated string
     * array. The returned value should be freed with g_strfreev() when no longer
     * needed.
     * @return the constructed string array.
     * <p>
     * Since 2.68
     */
    public @NotNull PointerString end() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strv_builder_end.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Atomically increments the reference count of {@code builder} by one.
     * This function is thread-safe and may be called from any thread.
     * @return The passed in {@link StrvBuilder}
     */
    public @NotNull org.gtk.glib.StrvBuilder ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strv_builder_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.StrvBuilder(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the reference count on {@code builder}.
     * <p>
     * In the event that there are no more references, releases all memory
     * associated with the {@link StrvBuilder}.
     */
    public void unref() {
        try {
            DowncallHandles.g_strv_builder_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Creates a new {@link StrvBuilder} with a reference count of 1.
     * Use g_strv_builder_unref() on the returned value when no longer needed.
     * @return the new {@link StrvBuilder}
     */
    public static @NotNull org.gtk.glib.StrvBuilder new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strv_builder_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.StrvBuilder(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_strv_builder_add = Interop.downcallHandle(
            "g_strv_builder_add",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_strv_builder_add_many = Interop.downcallHandle(
            "g_strv_builder_add_many",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_strv_builder_addv = Interop.downcallHandle(
            "g_strv_builder_addv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_strv_builder_end = Interop.downcallHandle(
            "g_strv_builder_end",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_strv_builder_ref = Interop.downcallHandle(
            "g_strv_builder_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_strv_builder_unref = Interop.downcallHandle(
            "g_strv_builder_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_strv_builder_new = Interop.downcallHandle(
            "g_strv_builder_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
    }
}
