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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.OutputStream.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("base_stream")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a FilterOutputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FilterOutputStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FilterOutputStream> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FilterOutputStream(input, ownership);
    
    /**
     * Gets the base stream for the filter stream.
     * @return a {@link OutputStream}.
     */
    public org.gtk.gio.OutputStream getBaseStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_filter_output_stream_get_base_stream.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.OutputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.OutputStream.fromAddress).marshal(RESULT, Ownership.NONE);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets whether the base stream will be closed when {@code stream} is closed.
     * @param closeBase {@code true} to close the base stream.
     */
    public void setCloseBaseStream(boolean closeBase) {
        try {
            DowncallHandles.g_filter_output_stream_set_close_base_stream.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(closeBase, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_filter_output_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link FilterOutputStream.Builder} object constructs a {@link FilterOutputStream} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FilterOutputStream.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.OutputStream.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FilterOutputStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FilterOutputStream}.
         * @return A new instance of {@code FilterOutputStream} with the properties 
         *         that were set in the Builder object.
         */
        public FilterOutputStream build() {
            return (FilterOutputStream) org.gtk.gobject.GObject.newWithProperties(
                FilterOutputStream.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setBaseStream(org.gtk.gio.OutputStream baseStream) {
            names.add("base-stream");
            values.add(org.gtk.gobject.Value.create(baseStream));
            return this;
        }
        
        public Builder setCloseBaseStream(boolean closeBaseStream) {
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
