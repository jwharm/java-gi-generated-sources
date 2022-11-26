package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base class for output stream implementations that perform some
 * kind of filtering operation on a base stream. Typical examples
 * of filtering operations are character set conversion, compression
 * and byte order flipping.
 */
public class FilterOutputStream extends org.gtk.gio.OutputStream {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFilterOutputStream";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.OutputStream.getMemoryLayout().withName("parent_instance"),
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
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gio.OutputStream parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.OutputStream(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code base_stream}
     * @return The value of the field {@code base_stream}
     */
    public org.gtk.gio.OutputStream base_stream$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("base_stream"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gio.OutputStream(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code base_stream}
     * @param base_stream The new value of the field {@code base_stream}
     */
    public void base_stream$set(org.gtk.gio.OutputStream base_stream) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("base_stream"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), base_stream.handle());
    }
    
    /**
     * Create a FilterOutputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FilterOutputStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to FilterOutputStream if its GType is a (or inherits from) "GFilterOutputStream".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code FilterOutputStream} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GFilterOutputStream", a ClassCastException will be thrown.
     */
    public static FilterOutputStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), FilterOutputStream.getType())) {
            return new FilterOutputStream(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GFilterOutputStream");
        }
    }
    
    /**
     * Gets the base stream for the filter stream.
     * @return a {@link OutputStream}.
     */
    public @NotNull org.gtk.gio.OutputStream getBaseStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_filter_output_stream_get_base_stream.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.OutputStream(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the base stream will be closed when {@code stream} is
     * closed.
     * @return {@code true} if the base stream will be closed.
     */
    public boolean getCloseBaseStream() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_filter_output_stream_get_close_base_stream.invokeExact(
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
            DowncallHandles.g_filter_output_stream_set_close_base_stream.invokeExact(
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
            RESULT = (long) DowncallHandles.g_filter_output_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gio.OutputStream.Build {
        
         /**
         * A {@link FilterOutputStream.Build} object constructs a {@link FilterOutputStream} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link FilterOutputStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FilterOutputStream} using {@link FilterOutputStream#castFrom}.
         * @return A new instance of {@code FilterOutputStream} with the properties 
         *         that were set in the Build object.
         */
        public FilterOutputStream construct() {
            return FilterOutputStream.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    FilterOutputStream.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setBaseStream(org.gtk.gio.OutputStream baseStream) {
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
        
        private static final MethodHandle g_filter_output_stream_get_base_stream = Interop.downcallHandle(
            "g_filter_output_stream_get_base_stream",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_filter_output_stream_get_close_base_stream = Interop.downcallHandle(
            "g_filter_output_stream_get_close_base_stream",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_filter_output_stream_set_close_base_stream = Interop.downcallHandle(
            "g_filter_output_stream_set_close_base_stream",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_filter_output_stream_get_type = Interop.downcallHandle(
            "g_filter_output_stream_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
