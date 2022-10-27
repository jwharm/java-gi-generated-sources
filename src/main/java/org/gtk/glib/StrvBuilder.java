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
public class StrvBuilder extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public StrvBuilder(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
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
            DowncallHandles.g_strv_builder_add.invokeExact(handle(), Interop.allocateNativeString(value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Appends all the given strings to the builder.
     * <p>
     * Since 2.70
     */
    public void addMany() {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Appends all the strings in the given vector to the builder.
     * <p>
     * Since 2.70
     * @param value the vector of strings to add
     */
    public void addv(java.lang.String[] value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.g_strv_builder_addv.invokeExact(handle(), Interop.allocateNativeArray(value, false));
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
            RESULT = (MemoryAddress) DowncallHandles.g_strv_builder_end.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.g_strv_builder_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.StrvBuilder(Refcounted.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count on {@code builder}.
     * <p>
     * In the event that there are no more references, releases all memory
     * associated with the {@link StrvBuilder}.
     */
    public void unref() {
        try {
            DowncallHandles.g_strv_builder_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        return new org.gtk.glib.StrvBuilder(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_strv_builder_add = Interop.downcallHandle(
            "g_strv_builder_add",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_strv_builder_add_many = Interop.downcallHandle(
            "g_strv_builder_add_many",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_strv_builder_addv = Interop.downcallHandle(
            "g_strv_builder_addv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_strv_builder_end = Interop.downcallHandle(
            "g_strv_builder_end",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_strv_builder_ref = Interop.downcallHandle(
            "g_strv_builder_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_strv_builder_unref = Interop.downcallHandle(
            "g_strv_builder_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_strv_builder_new = Interop.downcallHandle(
            "g_strv_builder_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
}
