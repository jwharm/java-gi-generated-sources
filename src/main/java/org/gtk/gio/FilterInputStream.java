package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base class for input stream implementations that perform some
 * kind of filtering operation on a base stream. Typical examples
 * of filtering operations are character set conversion, compression
 * and byte order flipping.
 */
public class FilterInputStream extends org.gtk.gio.InputStream {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFilterInputStream";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.InputStream.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("base_stream")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a FilterInputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FilterInputStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to FilterInputStream if its GType is a (or inherits from) "GFilterInputStream".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code FilterInputStream} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GFilterInputStream", a ClassCastException will be thrown.
     */
    public static FilterInputStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), FilterInputStream.getType())) {
            return new FilterInputStream(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GFilterInputStream");
        }
    }
    
    /**
     * Gets the base stream for the filter stream.
     * @return a {@link InputStream}.
     */
    public @NotNull org.gtk.gio.InputStream getBaseStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_filter_input_stream_get_base_stream.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.InputStream(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the base stream will be closed when {@code stream} is
     * closed.
     * @return {@code true} if the base stream will be closed.
     */
    public boolean getCloseBaseStream() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_filter_input_stream_get_close_base_stream.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets whether the base stream will be closed when {@code stream} is closed.
     * @param closeBase {@code true} to close the base stream.
     */
    public void setCloseBaseStream(boolean closeBase) {
        try {
            DowncallHandles.g_filter_input_stream_set_close_base_stream.invokeExact(
                    handle(),
                    closeBase ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_filter_input_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gio.InputStream.Build {
        
         /**
         * A {@link FilterInputStream.Build} object constructs a {@link FilterInputStream} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link FilterInputStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FilterInputStream} using {@link FilterInputStream#castFrom}.
         * @return A new instance of {@code FilterInputStream} with the properties 
         *         that were set in the Build object.
         */
        public FilterInputStream construct() {
            return FilterInputStream.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    FilterInputStream.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setBaseStream(org.gtk.gio.InputStream baseStream) {
            names.add("base-stream");
            values.add(org.gtk.gobject.Value.create(baseStream));
            return this;
        }
        
        public Build setCloseBaseStream(boolean closeBaseStream) {
            names.add("close-base-stream");
            values.add(org.gtk.gobject.Value.create(closeBaseStream));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_filter_input_stream_get_base_stream = Interop.downcallHandle(
            "g_filter_input_stream_get_base_stream",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_filter_input_stream_get_close_base_stream = Interop.downcallHandle(
            "g_filter_input_stream_get_close_base_stream",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_filter_input_stream_set_close_base_stream = Interop.downcallHandle(
            "g_filter_input_stream_set_close_base_stream",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_filter_input_stream_get_type = Interop.downcallHandle(
            "g_filter_input_stream_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
