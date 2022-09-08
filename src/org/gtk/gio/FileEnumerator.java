package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GFileEnumerator allows you to operate on a set of #GFiles,
 * returning a #GFileInfo structure for each file enumerated (e.g.
 * g_file_enumerate_children() will return a #GFileEnumerator for each
 * of the children within a directory).
 * 
 * To get the next file's information from a #GFileEnumerator, use
 * g_file_enumerator_next_file() or its asynchronous version,
 * g_file_enumerator_next_files_async(). Note that the asynchronous
 * version will return a list of #GFileInfos, whereas the
 * synchronous will only return the next file in the enumerator.
 * 
 * The ordering of returned files is unspecified for non-Unix
 * platforms; for more information, see g_dir_read_name().  On Unix,
 * when operating on local files, returned files will be sorted by
 * inode number.  Effectively you can assume that the ordering of
 * returned files will be stable between successive calls (and
 * applications) assuming the directory is unchanged.
 * 
 * If your application needs a specific ordering, such as by name or
 * modification time, you will have to implement that in your
 * application code.
 * 
 * To close a #GFileEnumerator, use g_file_enumerator_close(), or
 * its asynchronous version, g_file_enumerator_close_async(). Once
 * a #GFileEnumerator is closed, no further actions may be performed
 * on it, and it should be freed with g_object_unref().
 */
public class FileEnumerator extends org.gtk.gobject.Object {

    public FileEnumerator(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FileEnumerator */
    public static FileEnumerator castFrom(org.gtk.gobject.Object gobject) {
        return new FileEnumerator(gobject.getReference());
    }
    
    /**
     * Releases all resources used by this enumerator, making the
     * enumerator return %G_IO_ERROR_CLOSED on all calls.
     * 
     * This will be automatically called when the last reference
     * is dropped, but you might want to call this function to make
     * sure resources are released as early as possible.
     */
    public boolean close(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_file_enumerator_close(handle(), cancellable.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Finishes closing a file enumerator, started from g_file_enumerator_close_async().
     * 
     * If the file enumerator was already closed when g_file_enumerator_close_async()
     * was called, then this function will report %G_IO_ERROR_CLOSED in @error, and
     * return %FALSE. If the file enumerator had pending operation when the close
     * operation was started, then this function will report %G_IO_ERROR_PENDING, and
     * return %FALSE.  If @cancellable was not %NULL, then the operation may have been
     * cancelled by triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be set, and %FALSE will be
     * returned.
     */
    public boolean closeFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_file_enumerator_close_finish(handle(), result.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Return a new #GFile which refers to the file named by @info in the source
     * directory of @enumerator.  This function is primarily intended to be used
     * inside loops with g_file_enumerator_next_file().
     * 
     * To use this, %G_FILE_ATTRIBUTE_STANDARD_NAME must have been listed in the
     * attributes list used when creating the #GFileEnumerator.
     * 
     * This is a convenience method that's equivalent to:
     * |[<!-- language="C" -->
     *   gchar *name = g_file_info_get_name (info);
     *   GFile *child = g_file_get_child (g_file_enumerator_get_container (enumr),
     *                                    name);
     * ]|
     */
    public File getChild(FileInfo info) {
        var RESULT = gtk_h.g_file_enumerator_get_child(handle(), info.handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Get the #GFile container which is being enumerated.
     */
    public File getContainer() {
        var RESULT = gtk_h.g_file_enumerator_get_container(handle());
        return new File.FileImpl(References.get(RESULT, false));
    }
    
    /**
     * Checks if the file enumerator has pending operations.
     */
    public boolean hasPending() {
        var RESULT = gtk_h.g_file_enumerator_has_pending(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if the file enumerator has been closed.
     */
    public boolean isClosed() {
        var RESULT = gtk_h.g_file_enumerator_is_closed(handle());
        return (RESULT != 0);
    }
    
    /**
     * This is a version of g_file_enumerator_next_file() that's easier to
     * use correctly from C programs.  With g_file_enumerator_next_file(),
     * the gboolean return value signifies "end of iteration or error", which
     * requires allocation of a temporary #GError.
     * 
     * In contrast, with this function, a %FALSE return from
     * g_file_enumerator_iterate() *always* means
     * "error".  End of iteration is signaled by @out_info or @out_child being %NULL.
     * 
     * Another crucial difference is that the references for @out_info and
     * @out_child are owned by @direnum (they are cached as hidden
     * properties).  You must not unref them in your own code.  This makes
     * memory management significantly easier for C code in combination
     * with loops.
     * 
     * Finally, this function optionally allows retrieving a #GFile as
     * well.
     * 
     * You must specify at least one of @out_info or @out_child.
     * 
     * The code pattern for correctly using g_file_enumerator_iterate() from C
     * is:
     * 
     * |[
     * direnum = g_file_enumerate_children (file, ...);
     * while (TRUE)
     *   {
     *     GFileInfo *info;
     *     if (!g_file_enumerator_iterate (direnum, &info, NULL, cancellable, error))
     *       goto out;
     *     if (!info)
     *       break;
     *     ... do stuff with "info"; do not unref it! ...
     *   }
     * 
     * out:
     *   g_object_unref (direnum); // Note: frees the last @info
     * ]|
     */
    public boolean iterate(FileInfo[] outInfo, File[] outChild, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_file_enumerator_iterate(handle(), Interop.allocateNativeArray(outInfo), Interop.allocateNativeArray(outChild), cancellable.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Returns information for the next file in the enumerated object.
     * Will block until the information is available. The #GFileInfo
     * returned from this function will contain attributes that match the
     * attribute string that was passed when the #GFileEnumerator was created.
     * 
     * See the documentation of #GFileEnumerator for information about the
     * order of returned files.
     * 
     * On error, returns %NULL and sets @error to the error. If the
     * enumerator is at the end, %NULL will be returned and @error will
     * be unset.
     */
    public FileInfo nextFile(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_file_enumerator_next_file(handle(), cancellable.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new FileInfo(References.get(RESULT, true));
    }
    
    /**
     * Finishes the asynchronous operation started with g_file_enumerator_next_files_async().
     */
    public org.gtk.glib.List nextFilesFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_file_enumerator_next_files_finish(handle(), result.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Sets the file enumerator as having pending operations.
     */
    public void setPending(boolean pending) {
        gtk_h.g_file_enumerator_set_pending(handle(), pending ? 1 : 0);
    }
    
}
