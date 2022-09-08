package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing an opened directory.
 */
public class Dir extends io.github.jwharm.javagi.interop.ResourceBase {

    public Dir(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Closes the directory and deallocates all related resources.
     */
    public void close() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dir_close(HANDLE());
    }
    
    /**
     * Retrieves the name of another entry in the directory, or %NULL.
     * The order of entries returned from this function is not defined,
     * and may vary by file system or other operating-system dependent
     * factors.
     * 
     * %NULL may also be returned in case of errors. On Unix, you can
     * check `errno` to find out if %NULL was returned because of an error.
     * 
     * On Unix, the '.' and '..' entries are omitted, and the returned
     * name is in the on-disk encoding.
     * 
     * On Windows, as is true of all GLib functions which operate on
     * filenames, the returned name is in UTF-8.
     */
    public java.lang.String readName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dir_read_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Resets the given directory. The next call to g_dir_read_name()
     * will return the first entry again.
     */
    public void rewind() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dir_rewind(HANDLE());
    }
    
}
