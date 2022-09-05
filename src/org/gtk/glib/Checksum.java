package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing a checksumming operation.
 * 
 * To create a new GChecksum, use g_checksum_new(). To free
 * a GChecksum, use g_checksum_free().
 */
public class Checksum extends io.github.jwharm.javagi.interop.ResourceBase {

    public Checksum(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Creates a new #GChecksum, using the checksum algorithm @checksum_type.
     * If the @checksum_type is not known, %NULL is returned.
     * A #GChecksum can be used to compute the checksum, or digest, of an
     * arbitrary binary blob, using different hashing algorithms.
     * 
     * A #GChecksum works by feeding a binary blob through g_checksum_update()
     * until there is data to be checked; the digest can then be extracted
     * using g_checksum_get_string(), which will return the checksum as a
     * hexadecimal string; or g_checksum_get_digest(), which will return a
     * vector of raw bytes. Once either g_checksum_get_string() or
     * g_checksum_get_digest() have been called on a #GChecksum, the checksum
     * will be closed and it won't be possible to call g_checksum_update()
     * on it anymore.
     */
    public Checksum(ChecksumType checksumType) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_checksum_new(checksumType.getValue()), true));
    }
    
    /**
     * Copies a #GChecksum. If @checksum has been closed, by calling
     * g_checksum_get_string() or g_checksum_get_digest(), the copied
     * checksum will be closed as well.
     */
    public Checksum copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_checksum_copy(HANDLE());
        return new Checksum(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Frees the memory allocated for @checksum.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_checksum_free(HANDLE());
    }
    
    /**
     * Gets the digest as a hexadecimal string.
     * 
     * Once this function has been called the #GChecksum can no longer be
     * updated with g_checksum_update().
     * 
     * The hexadecimal characters will be lower case.
     */
    public java.lang.String getString() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_checksum_get_string(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Resets the state of the @checksum back to its initial state.
     */
    public void reset() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_checksum_reset(HANDLE());
    }
    
    /**
     * Feeds @data into an existing #GChecksum. The checksum must still be
     * open, that is g_checksum_get_string() or g_checksum_get_digest() must
     * not have been called on @checksum.
     */
    public void update(byte[] data, long length) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_checksum_update(HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data), length);
    }
    
}
