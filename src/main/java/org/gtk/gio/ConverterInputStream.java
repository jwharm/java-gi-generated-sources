package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle g_converter_input_stream_new = Interop.downcallHandle(
        "g_converter_input_stream_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull InputStream baseStream, @NotNull Converter converter) {
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
    public ConverterInputStream(@NotNull InputStream baseStream, @NotNull Converter converter) {
        super(constructNew(baseStream, converter));
    }
    
    private static final MethodHandle g_converter_input_stream_get_converter = Interop.downcallHandle(
        "g_converter_input_stream_get_converter",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link Converter} that is used by {@code converter_stream}.
     */
    public @NotNull Converter getConverter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_converter_input_stream_get_converter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Converter.ConverterImpl(Refcounted.get(RESULT, false));
    }
    
}
