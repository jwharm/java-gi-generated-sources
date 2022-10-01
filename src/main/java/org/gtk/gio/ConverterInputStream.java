package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
    
    private static Refcounted constructNew(InputStream baseStream, Converter converter) {
        Refcounted RESULT = Refcounted.get(gtk_h.g_converter_input_stream_new(baseStream.handle(), converter.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new converter input stream for the {@code base_stream}.
     */
    public ConverterInputStream(InputStream baseStream, Converter converter) {
        super(constructNew(baseStream, converter));
    }
    
    /**
     * Gets the {@link Converter} that is used by {@code converter_stream}.
     */
    public Converter getConverter() {
        var RESULT = gtk_h.g_converter_input_stream_get_converter(handle());
        return new Converter.ConverterImpl(Refcounted.get(RESULT, false));
    }
    
}
