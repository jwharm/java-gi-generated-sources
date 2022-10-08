package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing an opened directory.
 */
public class Dir extends io.github.jwharm.javagi.ResourceBase {

    public Dir(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_dir_close = Interop.downcallHandle(
        "g_dir_close",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Closes the directory and deallocates all related resources.
     */
    public void close() {
        try {
            g_dir_close.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dir_read_name = Interop.downcallHandle(
        "g_dir_read_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the name of another entry in the directory, or {@code null}.
     * The order of entries returned from this function is not defined,
     * and may vary by file system or other operating-system dependent
     * factors.
     * <p>
     * {@code null} may also be returned in case of errors. On Unix, you can
     * check {@code errno} to find out if {@code null} was returned because of an error.
     * <p>
     * On Unix, the '.' and '..' entries are omitted, and the returned
     * name is in the on-disk encoding.
     * <p>
     * On Windows, as is true of all GLib functions which operate on
     * filenames, the returned name is in UTF-8.
     */
    public java.lang.String readName() {
        try {
            var RESULT = (MemoryAddress) g_dir_read_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dir_rewind = Interop.downcallHandle(
        "g_dir_rewind",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Resets the given directory. The next call to g_dir_read_name()
     * will return the first entry again.
     */
    public void rewind() {
        try {
            g_dir_rewind.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dir_make_tmp = Interop.downcallHandle(
        "g_dir_make_tmp",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a subdirectory in the preferred directory for temporary
     * files (as returned by g_get_tmp_dir()).
     * <p>
     * {@code tmpl} should be a string in the GLib file name encoding containing
     * a sequence of six 'X' characters, as the parameter to g_mkstemp().
     * However, unlike these functions, the template should only be a
     * basename, no directory components are allowed. If template is
     * {@code null}, a default template is used.
     * <p>
     * Note that in contrast to g_mkdtemp() (and mkdtemp()) {@code tmpl} is not
     * modified, and might thus be a read-only literal string.
     */
    public static java.lang.String makeTmp(java.lang.String tmpl) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_dir_make_tmp.invokeExact(Interop.allocateNativeString(tmpl).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dir_open = Interop.downcallHandle(
        "g_dir_open",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Opens a directory for reading. The names of the files in the
     * directory can then be retrieved using g_dir_read_name().  Note
     * that the ordering is not defined.
     */
    public static Dir open(java.lang.String path, int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_dir_open.invokeExact(Interop.allocateNativeString(path).handle(), flags, (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new Dir(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
