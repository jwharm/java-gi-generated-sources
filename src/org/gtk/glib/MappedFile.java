package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GMappedFile represents a file mapping created with
 * g_mapped_file_new(). It has only private members and should
 * not be accessed directly.
 */
public class MappedFile extends io.github.jwharm.javagi.interop.ResourceBase {

    public MappedFile(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Creates a new #GBytes which references the data mapped from @file.
     * The mapped contents of the file must not be modified after creating this
     * bytes object, because a #GBytes should be immutable.
     */
    public Bytes getBytes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_mapped_file_get_bytes(HANDLE());
        return new Bytes(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Returns the contents of a #GMappedFile.
     * 
     * Note that the contents may not be zero-terminated,
     * even if the #GMappedFile is backed by a text file.
     * 
     * If the file is empty then %NULL is returned.
     */
    public java.lang.String getContents() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_mapped_file_get_contents(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the length of the contents of a #GMappedFile.
     */
    public long getLength() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_mapped_file_get_length(HANDLE());
        return RESULT;
    }
    
    /**
     * Increments the reference count of @file by one.  It is safe to call
     * this function from any thread.
     */
    public MappedFile ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_mapped_file_ref(HANDLE());
        return new MappedFile(ProxyFactory.get(RESULT, true));
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_mapped_file_unref(HANDLE());
    }
    
}
