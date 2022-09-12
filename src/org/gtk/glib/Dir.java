package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing an opened directory.
 */
public class Dir extends io.github.jwharm.javagi.ResourceBase {

    public Dir(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Closes the directory and deallocates all related resources.
     */
    public void close() {
        gtk_h.g_dir_close(handle());
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
        var RESULT = gtk_h.g_dir_read_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Resets the given directory. The next call to g_dir_read_name()
     * will return the first entry again.
     */
    public void rewind() {
        gtk_h.g_dir_rewind(handle());
    }
    
    /**
     * Creates a subdirectory in the preferred directory for temporary
     * files (as returned by g_get_tmp_dir()).
     * 
     * @tmpl should be a string in the GLib file name encoding containing
     * a sequence of six 'X' characters, as the parameter to g_mkstemp().
     * However, unlike these functions, the template should only be a
     * basename, no directory components are allowed. If template is
     * %NULL, a default template is used.
     * 
     * Note that in contrast to g_mkdtemp() (and mkdtemp()) @tmpl is not
     * modified, and might thus be a read-only literal string.
     */
    public static java.lang.String makeTmp(java.lang.String tmpl) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dir_make_tmp(Interop.allocateNativeString(tmpl).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Opens a directory for reading. The names of the files in the
     * directory can then be retrieved using g_dir_read_name().  Note
     * that the ordering is not defined.
     */
    public static Dir open(java.lang.String path, int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dir_open(Interop.allocateNativeString(path).handle(), flags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Dir(References.get(RESULT, false));
    }
    
}
