package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Converter output stream implements {@link OutputStream} and allows
 * conversion of data of various types during reading.
 * <p>
 * As of GLib 2.34, {@link ConverterOutputStream} implements
 * {@link PollableOutputStream}.
 */
public class ConverterOutputStream extends FilterOutputStream implements PollableOutputStream {

    public ConverterOutputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ConverterOutputStream */
    public static ConverterOutputStream castFrom(org.gtk.gobject.Object gobject) {
        return new ConverterOutputStream(gobject.refcounted());
    }
    
    private static Refcounted constructNew(OutputStream baseStream, Converter converter) {
        Refcounted RESULT = Refcounted.get(gtk_h.g_converter_output_stream_new(baseStream.handle(), converter.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new converter output stream for the {@code base_stream}.
     */
    public ConverterOutputStream(OutputStream baseStream, Converter converter) {
        super(constructNew(baseStream, converter));
    }
    
    /**
     * Gets the {@link Converter} that is used by {@code converter_stream}.
     */
    public Converter getConverter() {
        var RESULT = gtk_h.g_converter_output_stream_get_converter(handle());
        return new Converter.ConverterImpl(Refcounted.get(RESULT, false));
    }
    
}
