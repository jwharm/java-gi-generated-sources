package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Base class for output stream implementations that perform some
 * kind of filtering operation on a base stream. Typical examples
 * of filtering operations are character set conversion, compression
 * and byte order flipping.
 */
public class FilterOutputStream extends OutputStream {

    public FilterOutputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FilterOutputStream */
    public static FilterOutputStream castFrom(org.gtk.gobject.Object gobject) {
        return new FilterOutputStream(gobject.refcounted());
    }
    
    static final MethodHandle g_filter_output_stream_get_base_stream = Interop.downcallHandle(
        "g_filter_output_stream_get_base_stream",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the base stream for the filter stream.
     */
    public OutputStream getBaseStream() {
        try {
            var RESULT = (MemoryAddress) g_filter_output_stream_get_base_stream.invokeExact(handle());
            return new OutputStream(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_filter_output_stream_get_close_base_stream = Interop.downcallHandle(
        "g_filter_output_stream_get_close_base_stream",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the base stream will be closed when {@code stream} is
     * closed.
     */
    public boolean getCloseBaseStream() {
        try {
            var RESULT = (int) g_filter_output_stream_get_close_base_stream.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_filter_output_stream_set_close_base_stream = Interop.downcallHandle(
        "g_filter_output_stream_set_close_base_stream",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the base stream will be closed when {@code stream} is closed.
     */
    public void setCloseBaseStream(boolean closeBase) {
        try {
            g_filter_output_stream_set_close_base_stream.invokeExact(handle(), closeBase ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
