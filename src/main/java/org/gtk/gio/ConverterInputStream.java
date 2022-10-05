package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Converter input stream implements {@link InputStream} and allows
 * conversion of data of various types during reading.
 * <p>
 * As of GLib 2.34, {@link ConverterInputStream} implements
 * {@link PollableInputStream}.
 */
public class ConverterInputStream extends FilterInputStream implements PollableInputStream {

    public ConverterInputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ConverterInputStream */
    public static ConverterInputStream castFrom(org.gtk.gobject.Object gobject) {
        return new ConverterInputStream(gobject.refcounted());
    }
    
    static final MethodHandle g_converter_input_stream_new = Interop.downcallHandle(
        "g_converter_input_stream_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(InputStream baseStream, Converter converter) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_converter_input_stream_new.invokeExact(baseStream.handle(), converter.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new converter input stream for the {@code base_stream}.
     */
    public ConverterInputStream(InputStream baseStream, Converter converter) {
        super(constructNew(baseStream, converter));
    }
    
    static final MethodHandle g_converter_input_stream_get_converter = Interop.downcallHandle(
        "g_converter_input_stream_get_converter",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link Converter} that is used by {@code converter_stream}.
     */
    public Converter getConverter() {
        try {
            var RESULT = (MemoryAddress) g_converter_input_stream_get_converter.invokeExact(handle());
            return new Converter.ConverterImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
