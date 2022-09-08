package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Converter output stream implements #GOutputStream and allows
 * conversion of data of various types during reading.
 * 
 * As of GLib 2.34, #GConverterOutputStream implements
 * #GPollableOutputStream.
 */
public class ConverterOutputStream extends FilterOutputStream implements PollableOutputStream {

    public ConverterOutputStream(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ConverterOutputStream */
    public static ConverterOutputStream castFrom(org.gtk.gobject.Object gobject) {
        return new ConverterOutputStream(gobject.getReference());
    }
    
    /**
     * Creates a new converter output stream for the @base_stream.
     */
    public ConverterOutputStream(OutputStream baseStream, Converter converter) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_converter_output_stream_new(baseStream.HANDLE(), converter.HANDLE()), true));
    }
    
    /**
     * Gets the #GConverter that is used by @converter_stream.
     */
    public Converter getConverter() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_converter_output_stream_get_converter(HANDLE());
        return new Converter.ConverterImpl(References.get(RESULT, false));
    }
    
}
