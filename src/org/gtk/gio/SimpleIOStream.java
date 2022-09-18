package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * GSimpleIOStream creates a {@link org.gtk.gio.IOStream} from an arbitrary {@link org.gtk.gio.InputStream} and
 * {@link org.gtk.gio.OutputStream}  This allows any pair of input and output streams to be used
 * with {@link org.gtk.gio.IOStream} methods.
 * 
 * This is useful when you obtained a {@link org.gtk.gio.InputStream} and a {@link org.gtk.gio.OutputStream} by other means, for instance creating them with platform specific methods as
 * g_unix_input_stream_new() or g_win32_input_stream_new(), and you want
 * to take advantage of the methods provided by {@link org.gtk.gio.IOStream}
 */
public class SimpleIOStream extends IOStream {

    public SimpleIOStream(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SimpleIOStream */
    public static SimpleIOStream castFrom(org.gtk.gobject.Object gobject) {
        return new SimpleIOStream(gobject.getReference());
    }
    
    private static Reference constructNew(InputStream inputStream, OutputStream outputStream) {
        Reference RESULT = References.get(gtk_h.g_simple_io_stream_new(inputStream.handle(), outputStream.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link org.gtk.gio.SimpleIOStream} wrapping @input_stream and @output_stream.
     * See also {@link org.gtk.gio.IOStream}
     */
    public SimpleIOStream(InputStream inputStream, OutputStream outputStream) {
        super(constructNew(inputStream, outputStream));
    }
    
}
