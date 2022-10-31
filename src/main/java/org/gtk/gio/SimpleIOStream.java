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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public SimpleIOStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to SimpleIOStream if its GType is a (or inherits from) "GSimpleIOStream".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "SimpleIOStream" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GSimpleIOStream", a ClassCastException will be thrown.
     */
    public static SimpleIOStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GSimpleIOStream"))) {
            return new SimpleIOStream(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GSimpleIOStream");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gio.InputStream inputStream, @NotNull org.gtk.gio.OutputStream outputStream) {
        java.util.Objects.requireNonNull(inputStream, "Parameter 'inputStream' must not be null");
        java.util.Objects.requireNonNull(outputStream, "Parameter 'outputStream' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_simple_io_stream_new.invokeExact(
                    inputStream.handle(),
                    outputStream.handle()), true);
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
        super(constructNew(inputStream, outputStream));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_simple_io_stream_new = Interop.downcallHandle(
            "g_simple_io_stream_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
