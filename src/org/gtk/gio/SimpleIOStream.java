package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * GSimpleIOStream creates a #GIOStream from an arbitrary #GInputStream and
 * #GOutputStream. This allows any pair of input and output streams to be used
 * with #GIOStream methods.
 * 
 * This is useful when you obtained a #GInputStream and a #GOutputStream
 * by other means, for instance creating them with platform specific methods as
 * g_unix_input_stream_new() or g_win32_input_stream_new(), and you want
 * to take advantage of the methods provided by #GIOStream.
 */
public class SimpleIOStream extends IOStream {

    public SimpleIOStream(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to SimpleIOStream */
    public static SimpleIOStream castFrom(org.gtk.gobject.Object gobject) {
        return new SimpleIOStream(gobject.getProxy());
    }
    
    /**
     * Creates a new #GSimpleIOStream wrapping @input_stream and @output_stream.
     * See also #GIOStream.
     */
    public SimpleIOStream(InputStream inputStream, OutputStream outputStream) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_simple_io_stream_new(inputStream.HANDLE(), outputStream.HANDLE()), true));
    }
    
}
