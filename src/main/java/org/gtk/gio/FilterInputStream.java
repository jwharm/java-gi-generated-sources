package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Base class for input stream implementations that perform some
 * kind of filtering operation on a base stream. Typical examples
 * of filtering operations are character set conversion, compression
 * and byte order flipping.
 */
public class FilterInputStream extends InputStream {

    public FilterInputStream(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FilterInputStream */
    public static FilterInputStream castFrom(org.gtk.gobject.Object gobject) {
        return new FilterInputStream(gobject.getReference());
    }
    
    /**
     * Gets the base stream for the filter stream.
     */
    public InputStream getBaseStream() {
        var RESULT = gtk_h.g_filter_input_stream_get_base_stream(handle());
        return new InputStream(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the base stream will be closed when {@code stream} is
     * closed.
     */
    public boolean getCloseBaseStream() {
        var RESULT = gtk_h.g_filter_input_stream_get_close_base_stream(handle());
        return RESULT != 0;
    }
    
    /**
     * Sets whether the base stream will be closed when {@code stream} is closed.
     */
    public void setCloseBaseStream(boolean closeBase) {
        gtk_h.g_filter_input_stream_set_close_base_stream(handle(), closeBase ? 1 : 0);
    }
    
}
