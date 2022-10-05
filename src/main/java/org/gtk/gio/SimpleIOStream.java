package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * GSimpleIOStream creates a {@link IOStream} from an arbitrary {@link InputStream} and
 * {@link OutputStream}. This allows any pair of input and output streams to be used
 * with {@link IOStream} methods.
 * <p>
 * This is useful when you obtained a {@link InputStream} and a {@link OutputStream}
 * by other means, for instance creating them with platform specific methods as
 * g_unix_input_stream_new() or g_win32_input_stream_new(), and you want
 * to take advantage of the methods provided by {@link IOStream}.
 */
public class SimpleIOStream extends IOStream {

    public SimpleIOStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SimpleIOStream */
    public static SimpleIOStream castFrom(org.gtk.gobject.Object gobject) {
        return new SimpleIOStream(gobject.refcounted());
    }
    
    static final MethodHandle g_simple_io_stream_new = Interop.downcallHandle(
        "g_simple_io_stream_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(InputStream inputStream, OutputStream outputStream) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_simple_io_stream_new.invokeExact(inputStream.handle(), outputStream.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link SimpleIOStream} wrapping {@code input_stream} and {@code output_stream}.
     * See also {@link IOStream}.
     */
    public SimpleIOStream(InputStream inputStream, OutputStream outputStream) {
        super(constructNew(inputStream, outputStream));
    }
    
}
