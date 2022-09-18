package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing a checksumming operation.
 * 
 * To create a new GChecksum, use g_checksum_new(). To free
 * a GChecksum, use g_checksum_free().
 */
public class Checksum extends io.github.jwharm.javagi.ResourceBase {

    public Checksum(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(ChecksumType checksumType) {
        Reference RESULT = References.get(gtk_h.g_checksum_new(checksumType.getValue()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link org.gtk.glib.Checksum}  using the checksum algorithm @checksum_type.
     * If the @checksum_type is not known, <code>null</code> is returned.
     * A {@link org.gtk.glib.Checksum} can be used to compute the checksum, or digest, of an
     * arbitrary binary blob, using different hashing algorithms.
     * 
     * A {@link org.gtk.glib.Checksum} works by feeding a binary blob through g_checksum_update()
     * until there is data to be checked; the digest can then be extracted
     * using g_checksum_get_string(), which will return the checksum as a
     * hexadecimal string; or g_checksum_get_digest(), which will return a
     * vector of raw bytes. Once either g_checksum_get_string() or
     * g_checksum_get_digest() have been called on a {@link org.gtk.glib.Checksum}  the checksum
     * will be closed and it won&<code>#39</code> t be possible to call g_checksum_update()
     * on it anymore.
     */
    public Checksum(ChecksumType checksumType) {
        super(constructNew(checksumType));
    }
    
    /**
     * Copies a {@link org.gtk.glib.Checksum}  If @checksum has been closed, by calling
     * g_checksum_get_string() or g_checksum_get_digest(), the copied
     * checksum will be closed as well.
     */
    public Checksum copy() {
        var RESULT = gtk_h.g_checksum_copy(handle());
        return new Checksum(References.get(RESULT, true));
    }
    
    /**
     * Frees the memory allocated for @checksum.
     */
    public void free() {
        gtk_h.g_checksum_free(handle());
    }
    
    /**
     * Gets the digest as a hexadecimal string.
     * 
     * Once this function has been called the {@link org.gtk.glib.Checksum} can no longer be
     * updated with g_checksum_update().
     * 
     * The hexadecimal characters will be lower case.
     */
    public java.lang.String getString() {
        var RESULT = gtk_h.g_checksum_get_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Resets the state of the @checksum back to its initial state.
     */
    public void reset() {
        gtk_h.g_checksum_reset(handle());
    }
    
    /**
     * Feeds @data into an existing {@link org.gtk.glib.Checksum}  The checksum must still be
     * open, that is g_checksum_get_string() or g_checksum_get_digest() must
     * not have been called on @checksum.
     */
    public void update(byte[] data, long length) {
        gtk_h.g_checksum_update(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), length);
    }
    
    /**
     * Gets the length in bytes of digests of type @checksum_type
     */
    public static long typeGetLength(ChecksumType checksumType) {
        var RESULT = gtk_h.g_checksum_type_get_length(checksumType.getValue());
        return RESULT;
    }
    
}
