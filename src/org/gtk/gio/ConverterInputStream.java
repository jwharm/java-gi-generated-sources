package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
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

    public ConverterInputStream(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ConverterInputStream */
    public static ConverterInputStream castFrom(org.gtk.gobject.Object gobject) {
        return new ConverterInputStream(gobject.getReference());
    }
    
    /**
     * Creates a new converter input stream for the @base_stream.
     */
    public ConverterInputStream(InputStream baseStream, Converter converter) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_converter_input_stream_new(baseStream.HANDLE(), converter.HANDLE()), true));
    }
    
    /**
     * Gets the #GConverter that is used by @converter_stream.
     */
    public Converter getConverter() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_converter_input_stream_get_converter(HANDLE());
        return new Converter.ConverterImpl(References.get(RESULT, false));
    }
    
}
