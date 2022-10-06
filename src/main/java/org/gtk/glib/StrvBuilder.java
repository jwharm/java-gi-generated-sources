package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link StrvBuilder} is a method of easily building dynamically sized
 * NULL-terminated string arrays.
 * <p>
 * The following example shows how to build a two element array:
 * <p>
 * <pre>{@code <!-- language="C" -->
 *   g_autoptr(GStrvBuilder) builder = g_strv_builder_new ();
 *   g_strv_builder_add (builder, "hello");
 *   g_strv_builder_add (builder, "world");
 *   g_auto(GStrv) array = g_strv_builder_end (builder);
 * }</pre>
 */
public class StrvBuilder extends io.github.jwharm.javagi.ResourceBase {

    public StrvBuilder(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_strv_builder_add = Interop.downcallHandle(
        "g_strv_builder_add",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Add a string to the end of the array.
     * <p>
     * Since 2.68
     */
    public void add(java.lang.String value) {
        try {
            g_strv_builder_add.invokeExact(handle(), Interop.allocateNativeString(value).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strv_builder_addv = Interop.downcallHandle(
        "g_strv_builder_addv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends all the strings in the given vector to the builder.
     * <p>
     * Since 2.70
     */
    public void addv(java.lang.String[] value) {
        try {
            g_strv_builder_addv.invokeExact(handle(), Interop.allocateNativeArray(value).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strv_builder_end = Interop.downcallHandle(
        "g_strv_builder_end",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Ends the builder process and returns the constructed NULL-terminated string
     * array. The returned value should be freed with g_strfreev() when no longer
     * needed.
     */
    public PointerString end() {
        try {
            var RESULT = (MemoryAddress) g_strv_builder_end.invokeExact(handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strv_builder_ref = Interop.downcallHandle(
        "g_strv_builder_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically increments the reference count of {@code builder} by one.
     * This function is thread-safe and may be called from any thread.
     */
    public StrvBuilder ref() {
        try {
            var RESULT = (MemoryAddress) g_strv_builder_ref.invokeExact(handle());
            return new StrvBuilder(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strv_builder_unref = Interop.downcallHandle(
        "g_strv_builder_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on {@code builder}.
     * <p>
     * In the event that there are no more references, releases all memory
     * associated with the {@link StrvBuilder}.
     */
    public void unref() {
        try {
            g_strv_builder_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strv_builder_new = Interop.downcallHandle(
        "g_strv_builder_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link StrvBuilder} with a reference count of 1.
     * Use g_strv_builder_unref() on the returned value when no longer needed.
     */
    public static StrvBuilder new_() {
        try {
            var RESULT = (MemoryAddress) g_strv_builder_new.invokeExact();
            return new StrvBuilder(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
