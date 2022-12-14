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
public class StrvBuilder extends Struct {
    
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
    
    /**
     * Allocate a new {@link StrvBuilder}
     * @return A new, uninitialized @{link StrvBuilder}
     */
    public static StrvBuilder allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        StrvBuilder newInstance = new StrvBuilder(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a StrvBuilder proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected StrvBuilder(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, StrvBuilder> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new StrvBuilder(input);
    
    /**
     * Add a string to the end of the array.
     * <p>
     * Since 2.68
     * @param value a string.
     */
    public void add(java.lang.String value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_strv_builder_add.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(value, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public void addv(java.lang.String[] value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_strv_builder_addv.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(value, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public PointerString end() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_strv_builder_end.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Atomically increments the reference count of {@code builder} by one.
     * This function is thread-safe and may be called from any thread.
     * @return The passed in {@link StrvBuilder}
     */
    public org.gtk.glib.StrvBuilder ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strv_builder_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.StrvBuilder.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
        this.yieldOwnership();
    }
    
    /**
     * Creates a new {@link StrvBuilder} with a reference count of 1.
     * Use g_strv_builder_unref() on the returned value when no longer needed.
     * @return the new {@link StrvBuilder}
     */
    public static org.gtk.glib.StrvBuilder new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strv_builder_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.StrvBuilder.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_strv_builder_add = Interop.downcallHandle(
                "g_strv_builder_add",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_strv_builder_add_many = Interop.downcallHandle(
                "g_strv_builder_add_many",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle g_strv_builder_addv = Interop.downcallHandle(
                "g_strv_builder_addv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_strv_builder_end = Interop.downcallHandle(
                "g_strv_builder_end",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_strv_builder_ref = Interop.downcallHandle(
                "g_strv_builder_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_strv_builder_unref = Interop.downcallHandle(
                "g_strv_builder_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_strv_builder_new = Interop.downcallHandle(
                "g_strv_builder_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
}
