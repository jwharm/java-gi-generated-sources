package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link org.gtk.glib.MappedFile} represents a file mapping created with
 * g_mapped_file_new(). It has only private members and should
 * not be accessed directly.
 */
public class MappedFile extends io.github.jwharm.javagi.ResourceBase {

    public MappedFile(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(java.lang.String filename, boolean writable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_mapped_file_new(Interop.allocateNativeString(filename).handle(), writable ? 1 : 0, GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Maps a file into memory. On UNIX, this is using the mmap() function.
     * 
     * If @writable is <code>true</code>  the mapped buffer may be modified, otherwise
     * it is an error to modify the mapped buffer. Modifications to the buffer
     * are not visible to other processes mapping the same file, and are not
     * written back to the file.
     * 
     * Note that modifications of the underlying file might affect the contents
     * of the {@link org.gtk.glib.MappedFile}  Therefore, mapping should only be used if the file
     * will not be modified, or if all modifications of the file are done
     * atomically (e.g. using g_file_set_contents()).
     * 
     * If @filename is the name of an empty, regular file, the function
     * will successfully return an empty {@link org.gtk.glib.MappedFile}  In other cases of
     * size 0 (e.g. device files such as /dev/null), @error will be set
     * to the {@link org.gtk.glib.FileError} value {@link org.gtk.glib.FileError<code>#INVAL</code>
     */
    public MappedFile(java.lang.String filename, boolean writable) throws GErrorException {
        super(constructNew(filename, writable));
    }
    
    private static Reference constructNewFromFd(int fd, boolean writable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_mapped_file_new_from_fd(fd, writable ? 1 : 0, GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Maps a file into memory. On UNIX, this is using the mmap() function.
     * 
     * If @writable is <code>true</code>  the mapped buffer may be modified, otherwise
     * it is an error to modify the mapped buffer. Modifications to the buffer
     * are not visible to other processes mapping the same file, and are not
     * written back to the file.
     * 
     * Note that modifications of the underlying file might affect the contents
     * of the {@link org.gtk.glib.MappedFile}  Therefore, mapping should only be used if the file
     * will not be modified, or if all modifications of the file are done
     * atomically (e.g. using g_file_set_contents()).
     */
    public static MappedFile newFromFd(int fd, boolean writable) throws GErrorException {
        return new MappedFile(constructNewFromFd(fd, writable));
    }
    
    /**
     * Creates a new {@link org.gtk.glib.Bytes} which references the data mapped from @file.
     * The mapped contents of the file must not be modified after creating this
     * bytes object, because a {@link org.gtk.glib.Bytes} should be immutable.
     */
    public Bytes getBytes() {
        var RESULT = gtk_h.g_mapped_file_get_bytes(handle());
        return new Bytes(References.get(RESULT, true));
    }
    
    /**
     * Returns the contents of a {@link org.gtk.glib.MappedFile} 
     * 
     * Note that the contents may not be zero-terminated,
     * even if the {@link org.gtk.glib.MappedFile} is backed by a text file.
     * 
     * If the file is empty then <code>null</code> is returned.
     */
    public java.lang.String getContents() {
        var RESULT = gtk_h.g_mapped_file_get_contents(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the length of the contents of a {@link org.gtk.glib.MappedFile}
     */
    public long getLength() {
        var RESULT = gtk_h.g_mapped_file_get_length(handle());
        return RESULT;
    }
    
    /**
     * Increments the reference count of @file by one.  It is safe to call
     * this function from any thread.
     */
    public MappedFile ref() {
        var RESULT = gtk_h.g_mapped_file_ref(handle());
        return new MappedFile(References.get(RESULT, true));
    }
    
    /**
     * Decrements the reference count of @file by one.  If the reference count
     * drops to 0, unmaps the buffer of @file and frees it.
     * 
     * It is safe to call this function from any thread.
     * 
     * Since 2.22
     */
    public void unref() {
        gtk_h.g_mapped_file_unref(handle());
    }
    
}
