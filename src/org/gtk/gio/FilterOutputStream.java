package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Base class for output stream implementations that perform some
 * kind of filtering operation on a base stream. Typical examples
 * of filtering operations are character set conversion, compression
 * and byte order flipping.
 */
public class FilterOutputStream extends OutputStream {

    public FilterOutputStream(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FilterOutputStream */
    public static FilterOutputStream castFrom(org.gtk.gobject.Object gobject) {
        return new FilterOutputStream(gobject.getReference());
    }
    
    /**
     * Gets the base stream for the filter stream.
     */
    public OutputStream getBaseStream() {
        var RESULT = gtk_h.g_filter_output_stream_get_base_stream(handle());
        return new OutputStream(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the base stream will be closed when {@code stream} is
     * closed.
     */
    public boolean getCloseBaseStream() {
        var RESULT = gtk_h.g_filter_output_stream_get_close_base_stream(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets whether the base stream will be closed when {@code stream} is closed.
     */
    public void setCloseBaseStream(boolean closeBase) {
        gtk_h.g_filter_output_stream_set_close_base_stream(handle(), closeBase ? 1 : 0);
    }
    
}
