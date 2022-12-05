package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A fundamental type that describes an unordered list of {@link org.gtk.gobject.Value}
 */
public class ValueList extends io.github.jwharm.javagi.ObjectBase {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "ValueList";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ValueList proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ValueList(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ValueList if its GType is a (or inherits from) "ValueList".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ValueList} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "ValueList", a ClassCastException will be thrown.
     */
    public static ValueList castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), ValueList.getType())) {
            return new ValueList(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of ValueList");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_value_list_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Appends {@code append_value} to the GstValueList in {@code value}.
     * @param value a {@link org.gtk.gobject.Value} of type {@code GST_TYPE_LIST}
     * @param appendValue the value to append
     */
    public static void appendAndTakeValue(@NotNull org.gtk.gobject.Value value, @NotNull org.gtk.gobject.Value appendValue) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        java.util.Objects.requireNonNull(appendValue, "Parameter 'appendValue' must not be null");
        try {
            DowncallHandles.gst_value_list_append_and_take_value.invokeExact(
                    value.handle(),
                    appendValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        appendValue.yieldOwnership();
    }
    
    /**
     * Appends {@code append_value} to the GstValueList in {@code value}.
     * @param value a {@link org.gtk.gobject.Value} of type {@code GST_TYPE_LIST}
     * @param appendValue the value to append
     */
    public static void appendValue(@NotNull org.gtk.gobject.Value value, @NotNull org.gtk.gobject.Value appendValue) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        java.util.Objects.requireNonNull(appendValue, "Parameter 'appendValue' must not be null");
        try {
            DowncallHandles.gst_value_list_append_value.invokeExact(
                    value.handle(),
                    appendValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Concatenates copies of {@code value1} and {@code value2} into a list.  Values that are not
     * of type {@code GST_TYPE_LIST} are treated as if they were lists of length 1.
     * {@code dest} will be initialized to the type {@code GST_TYPE_LIST}.
     * @param dest an uninitialized {@link org.gtk.gobject.Value} to take the result
     * @param value1 a {@link org.gtk.gobject.Value}
     * @param value2 a {@link org.gtk.gobject.Value}
     */
    public static void concat(@NotNull org.gtk.gobject.Value dest, @NotNull org.gtk.gobject.Value value1, @NotNull org.gtk.gobject.Value value2) {
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        java.util.Objects.requireNonNull(value1, "Parameter 'value1' must not be null");
        java.util.Objects.requireNonNull(value2, "Parameter 'value2' must not be null");
        try {
            DowncallHandles.gst_value_list_concat.invokeExact(
                    dest.handle(),
                    value1.handle(),
                    value2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the number of values contained in {@code value}.
     * @param value a {@link org.gtk.gobject.Value} of type {@code GST_TYPE_LIST}
     * @return the number of values
     */
    public static int getSize(@NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_value_list_get_size.invokeExact(
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value that is a member of the list contained in {@code value} and
     * has the index {@code index}.
     * @param value a {@link org.gtk.gobject.Value} of type {@code GST_TYPE_LIST}
     * @param index index of value to get from the list
     * @return the value at the given index
     */
    public static @NotNull org.gtk.gobject.Value getValue(@NotNull org.gtk.gobject.Value value, int index) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_value_list_get_value.invokeExact(
                    value.handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Value(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes and pre-allocates a {@link org.gtk.gobject.Value} of type {@code GST_TYPE_LIST}.
     * @param value A zero-filled (uninitialized) {@link org.gtk.gobject.Value} structure
     * @param prealloc The number of entries to pre-allocate in the list
     * @return The {@link org.gtk.gobject.Value} structure that has been passed in
     */
    public static @NotNull org.gtk.gobject.Value init(@NotNull org.gtk.gobject.Value value, int prealloc) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_value_list_init.invokeExact(
                    value.handle(),
                    prealloc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Value(RESULT, Ownership.NONE);
    }
    
    /**
     * Merges copies of {@code value1} and {@code value2}.  Values that are not
     * of type {@code GST_TYPE_LIST} are treated as if they were lists of length 1.
     * <p>
     * The result will be put into {@code dest} and will either be a list that will not
     * contain any duplicates, or a non-list type (if {@code value1} and {@code value2}
     * were equal).
     * @param dest an uninitialized {@link org.gtk.gobject.Value} to take the result
     * @param value1 a {@link org.gtk.gobject.Value}
     * @param value2 a {@link org.gtk.gobject.Value}
     */
    public static void merge(@NotNull org.gtk.gobject.Value dest, @NotNull org.gtk.gobject.Value value1, @NotNull org.gtk.gobject.Value value2) {
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        java.util.Objects.requireNonNull(value1, "Parameter 'value1' must not be null");
        java.util.Objects.requireNonNull(value2, "Parameter 'value2' must not be null");
        try {
            DowncallHandles.gst_value_list_merge.invokeExact(
                    dest.handle(),
                    value1.handle(),
                    value2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Prepends {@code prepend_value} to the GstValueList in {@code value}.
     * @param value a {@link org.gtk.gobject.Value} of type {@code GST_TYPE_LIST}
     * @param prependValue the value to prepend
     */
    public static void prependValue(@NotNull org.gtk.gobject.Value value, @NotNull org.gtk.gobject.Value prependValue) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        java.util.Objects.requireNonNull(prependValue, "Parameter 'prependValue' must not be null");
        try {
            DowncallHandles.gst_value_list_prepend_value.invokeExact(
                    value.handle(),
                    prependValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends io.github.jwharm.javagi.Build {
        
         /**
         * A {@link ValueList.Build} object constructs a {@link ValueList} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ValueList} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ValueList} using {@link ValueList#castFrom}.
         * @return A new instance of {@code ValueList} with the properties 
         *         that were set in the Build object.
         */
        public ValueList construct() {
            return ValueList.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ValueList.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_value_list_get_type = Interop.downcallHandle(
            "gst_value_list_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_value_list_append_and_take_value = Interop.downcallHandle(
            "gst_value_list_append_and_take_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_value_list_append_value = Interop.downcallHandle(
            "gst_value_list_append_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_value_list_concat = Interop.downcallHandle(
            "gst_value_list_concat",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_value_list_get_size = Interop.downcallHandle(
            "gst_value_list_get_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_value_list_get_value = Interop.downcallHandle(
            "gst_value_list_get_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_value_list_init = Interop.downcallHandle(
            "gst_value_list_init",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_value_list_merge = Interop.downcallHandle(
            "gst_value_list_merge",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_value_list_prepend_value = Interop.downcallHandle(
            "gst_value_list_prepend_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
