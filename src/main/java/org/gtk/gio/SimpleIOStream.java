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
    @ApiStatus.Internal
    public SimpleIOStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to SimpleIOStream if its GType is a (or inherits from) "GSimpleIOStream".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SimpleIOStream} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GSimpleIOStream", a ClassCastException will be thrown.
     */
    public static SimpleIOStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), SimpleIOStream.getType())) {
            return new SimpleIOStream(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GSimpleIOStream");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gio.InputStream inputStream, @NotNull org.gtk.gio.OutputStream outputStream) {
        java.util.Objects.requireNonNull(inputStream, "Parameter 'inputStream' must not be null");
        java.util.Objects.requireNonNull(outputStream, "Parameter 'outputStream' must not be null");
        Addressable RESULT;
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
    public SimpleIOStream(@NotNull org.gtk.gio.InputStream inputStream, @NotNull org.gtk.gio.OutputStream outputStream) {
        super(constructNew(inputStream, outputStream), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_simple_io_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gio.IOStream.Build {
        
         /**
         * A {@link SimpleIOStream.Build} object constructs a {@link SimpleIOStream} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link SimpleIOStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SimpleIOStream} using {@link SimpleIOStream#castFrom}.
         * @return A new instance of {@code SimpleIOStream} with the properties 
         *         that were set in the Build object.
         */
        public SimpleIOStream construct() {
            return SimpleIOStream.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    SimpleIOStream.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setInputStream(org.gtk.gio.InputStream inputStream) {
            names.add("input-stream");
            values.add(org.gtk.gobject.Value.create(inputStream));
            return this;
        }
        
        public Build setOutputStream(org.gtk.gio.OutputStream outputStream) {
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
