package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Converter input stream implements #GInputStream and allows
 * conversion of data of various types during reading.
 * 
 * As of GLib 2.34, #GConverterInputStream implements
 * #GPollableInputStream.
 */
public class ConverterInputStream extends FilterInputStream implements PollableInputStream {

    public ConverterInputStream(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ConverterInputStream */
    public static ConverterInputStream castFrom(org.gtk.gobject.Object gobject) {
        return new ConverterInputStream(gobject.getReference());
    }
    
    private static Reference constructNew(InputStream baseStream, Converter converter) {
        Reference RESULT = References.get(gtk_h.g_converter_input_stream_new(baseStream.handle(), converter.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new converter input stream for the @base_stream.
     */
    public ConverterInputStream(InputStream baseStream, Converter converter) {
        super(constructNew(baseStream, converter));
    }
    
    /**
     * Gets the #GConverter that is used by @converter_stream.
     */
    public Converter getConverter() {
        var RESULT = gtk_h.g_converter_input_stream_get_converter(handle());
        return new Converter.ConverterImpl(References.get(RESULT, false));
    }
    
}
