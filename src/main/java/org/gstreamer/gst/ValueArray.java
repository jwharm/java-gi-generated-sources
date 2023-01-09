package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A fundamental type that describes an ordered list of {@link org.gtk.gobject.Value}
 */
public class ValueArray extends io.github.jwharm.javagi.ObjectBase {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstValueArray";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ValueArray proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ValueArray(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ValueArray> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ValueArray(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_value_array_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Appends {@code append_value} to the GstValueArray in {@code value}.
     * @param value a {@link org.gtk.gobject.Value} of type {@code GST_TYPE_ARRAY}
     * @param appendValue the value to append
     */
    public static void appendAndTakeValue(org.gtk.gobject.Value value, org.gtk.gobject.Value appendValue) {
        try {
            DowncallHandles.gst_value_array_append_and_take_value.invokeExact(
                    value.handle(),
                    appendValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        appendValue.yieldOwnership();
    }
    
    /**
     * Appends {@code append_value} to the GstValueArray in {@code value}.
     * @param value a {@link org.gtk.gobject.Value} of type {@code GST_TYPE_ARRAY}
     * @param appendValue the value to append
     */
    public static void appendValue(org.gtk.gobject.Value value, org.gtk.gobject.Value appendValue) {
        try {
            DowncallHandles.gst_value_array_append_value.invokeExact(
                    value.handle(),
                    appendValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the number of values contained in {@code value}.
     * @param value a {@link org.gtk.gobject.Value} of type {@code GST_TYPE_ARRAY}
     * @return the number of values
     */
    public static int getSize(org.gtk.gobject.Value value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_value_array_get_size.invokeExact(value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value that is a member of the array contained in {@code value} and
     * has the index {@code index}.
     * @param value a {@link org.gtk.gobject.Value} of type {@code GST_TYPE_ARRAY}
     * @param index index of value to get from the array
     * @return the value at the given index
     */
    public static org.gtk.gobject.Value getValue(org.gtk.gobject.Value value, int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_value_array_get_value.invokeExact(
                    value.handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gobject.Value.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes and pre-allocates a {@link org.gtk.gobject.Value} of type {@code GST_TYPE_ARRAY}.
     * @param value A zero-filled (uninitialized) {@link org.gtk.gobject.Value} structure
     * @param prealloc The number of entries to pre-allocate in the array
     * @return The {@link org.gtk.gobject.Value} structure that has been passed in
     */
    public static org.gtk.gobject.Value init(org.gtk.gobject.Value value, int prealloc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_value_array_init.invokeExact(
                    value.handle(),
                    prealloc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gobject.Value.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Prepends {@code prepend_value} to the GstValueArray in {@code value}.
     * @param value a {@link org.gtk.gobject.Value} of type {@code GST_TYPE_ARRAY}
     * @param prependValue the value to prepend
     */
    public static void prependValue(org.gtk.gobject.Value value, org.gtk.gobject.Value prependValue) {
        try {
            DowncallHandles.gst_value_array_prepend_value.invokeExact(
                    value.handle(),
                    prependValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_value_array_get_type = Interop.downcallHandle(
                "gst_value_array_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_value_array_append_and_take_value = Interop.downcallHandle(
                "gst_value_array_append_and_take_value",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_value_array_append_value = Interop.downcallHandle(
                "gst_value_array_append_value",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_value_array_get_size = Interop.downcallHandle(
                "gst_value_array_get_size",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_value_array_get_value = Interop.downcallHandle(
                "gst_value_array_get_value",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_value_array_init = Interop.downcallHandle(
                "gst_value_array_init",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_value_array_prepend_value = Interop.downcallHandle(
                "gst_value_array_prepend_value",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_value_array_get_type != null;
    }
}
