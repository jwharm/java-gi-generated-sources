package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing a checksumming operation.
 * <p>
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
     * Creates a new {@link Checksum}, using the checksum algorithm {@code checksum_type}.
     * If the {@code checksum_type} is not known, {@code null} is returned.
     * A {@link Checksum} can be used to compute the checksum, or digest, of an
     * arbitrary binary blob, using different hashing algorithms.
     * <p>
     * A {@link Checksum} works by feeding a binary blob through g_checksum_update()
     * until there is data to be checked; the digest can then be extracted
     * using g_checksum_get_string(), which will return the checksum as a
     * hexadecimal string; or g_checksum_get_digest(), which will return a
     * vector of raw bytes. Once either g_checksum_get_string() or
     * g_checksum_get_digest() have been called on a {@link Checksum}, the checksum
     * will be closed and it won't be possible to call g_checksum_update()
     * on it anymore.
     */
    public Checksum(ChecksumType checksumType) {
        super(constructNew(checksumType));
    }
    
    /**
     * Copies a {@link Checksum}. If {@code checksum} has been closed, by calling
     * g_checksum_get_string() or g_checksum_get_digest(), the copied
     * checksum will be closed as well.
     */
    public Checksum copy() {
        var RESULT = gtk_h.g_checksum_copy(handle());
        return new Checksum(References.get(RESULT, true));
    }
    
    /**
     * Frees the memory allocated for {@code checksum}.
     */
    public void free() {
        gtk_h.g_checksum_free(handle());
    }
    
    /**
     * Gets the digest from {@code checksum} as a raw binary vector and places it
     * into {@code buffer}. The size of the digest depends on the type of checksum.
     * <p>
     * Once this function has been called, the {@link Checksum} is closed and can
     * no longer be updated with g_checksum_update().
     */
    public void getDigest(byte[] buffer, PointerLong digestLen) {
        gtk_h.g_checksum_get_digest(handle(), Interop.allocateNativeArray(buffer).handle(), digestLen.handle());
    }
    
    /**
     * Gets the digest as a hexadecimal string.
     * <p>
     * Once this function has been called the {@link Checksum} can no longer be
     * updated with g_checksum_update().
     * <p>
     * The hexadecimal characters will be lower case.
     */
    public java.lang.String getString() {
        var RESULT = gtk_h.g_checksum_get_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Resets the state of the {@code checksum} back to its initial state.
     */
    public void reset() {
        gtk_h.g_checksum_reset(handle());
    }
    
    /**
     * Feeds {@code data} into an existing {@link Checksum}. The checksum must still be
     * open, that is g_checksum_get_string() or g_checksum_get_digest() must
     * not have been called on {@code checksum}.
     */
    public void update(byte[] data, long length) {
        gtk_h.g_checksum_update(handle(), Interop.allocateNativeArray(data).handle(), length);
    }
    
    /**
     * Gets the length in bytes of digests of type {@code checksum_type}
     */
    public static long typeGetLength(ChecksumType checksumType) {
        var RESULT = gtk_h.g_checksum_type_get_length(checksumType.getValue());
        return RESULT;
    }
    
}
