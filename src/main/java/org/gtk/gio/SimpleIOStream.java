package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GSimpleIOStream creates a {@link IOStream} from an arbitrary {@link InputStream} and
 * {@link OutputStream}. This allows any pair of input and output streams to be used
 * with {@link IOStream} methods.
 * <p>
 * This is useful when you obtained a {@link InputStream} and a {@link OutputStream}
 * by other means, for instance creating them with platform specific methods as
 * g_unix_input_stream_new() or g_win32_input_stream_new(), and you want
 * to take advantage of the methods provided by {@link IOStream}.
 * @version 2.44
 */
public class SimpleIOStream extends org.gtk.gio.IOStream {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSimpleIOStream";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a SimpleIOStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SimpleIOStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SimpleIOStream> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SimpleIOStream(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gio.InputStream inputStream, org.gtk.gio.OutputStream outputStream) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_simple_io_stream_new.invokeExact(
                    inputStream.handle(),
                    outputStream.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link SimpleIOStream} wrapping {@code input_stream} and {@code output_stream}.
     * See also {@link IOStream}.
     * @param inputStream a {@link InputStream}.
     * @param outputStream a {@link OutputStream}.
     */
    public SimpleIOStream(org.gtk.gio.InputStream inputStream, org.gtk.gio.OutputStream outputStream) {
        super(constructNew(inputStream, outputStream), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_simple_io_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link SimpleIOStream.Builder} object constructs a {@link SimpleIOStream} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SimpleIOStream.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.IOStream.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SimpleIOStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SimpleIOStream}.
         * @return A new instance of {@code SimpleIOStream} with the properties 
         *         that were set in the Builder object.
         */
        public SimpleIOStream build() {
            return (SimpleIOStream) org.gtk.gobject.GObject.newWithProperties(
                SimpleIOStream.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setInputStream(org.gtk.gio.InputStream inputStream) {
            names.add("input-stream");
            values.add(org.gtk.gobject.Value.create(inputStream));
            return this;
        }
        
        public Builder setOutputStream(org.gtk.gio.OutputStream outputStream) {
            names.add("output-stream");
            values.add(org.gtk.gobject.Value.create(outputStream));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_simple_io_stream_new = Interop.downcallHandle(
            "g_simple_io_stream_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_simple_io_stream_get_type = Interop.downcallHandle(
            "g_simple_io_stream_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
