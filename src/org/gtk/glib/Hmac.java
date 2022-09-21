package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing a HMAC operation.
 * To create a new GHmac, use g_hmac_new(). To free
 * a GHmac, use g_hmac_unref().
 */
public class Hmac extends io.github.jwharm.javagi.ResourceBase {

    public Hmac(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Copies a {@link Hmac}. If {@code hmac} has been closed, by calling
     * g_hmac_get_string() or g_hmac_get_digest(), the copied
     * HMAC will be closed as well.
     */
    public Hmac copy() {
        var RESULT = gtk_h.g_hmac_copy(handle());
        return new Hmac(References.get(RESULT, false));
    }
    
    /**
     * Gets the HMAC as a hexadecimal string.
     * <p>
     * Once this function has been called the {@link Hmac} can no longer be
     * updated with g_hmac_update().
     * <p>
     * The hexadecimal characters will be lower case.
     */
    public java.lang.String getString() {
        var RESULT = gtk_h.g_hmac_get_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Atomically increments the reference count of {@code hmac} by one.
     * <p>
     * This function is MT-safe and may be called from any thread.
     */
    public Hmac ref() {
        var RESULT = gtk_h.g_hmac_ref(handle());
        return new Hmac(References.get(RESULT, false));
    }
    
    /**
     * Atomically decrements the reference count of {@code hmac} by one.
     * <p>
     * If the reference count drops to 0, all keys and values will be
     * destroyed, and all memory allocated by the hash table is released.
     * This function is MT-safe and may be called from any thread.
     * Frees the memory allocated for {@code hmac}.
     */
    public void unref() {
        gtk_h.g_hmac_unref(handle());
    }
    
    /**
     * Feeds {@code data} into an existing {@link Hmac}.
     * <p>
     * The HMAC must still be open, that is g_hmac_get_string() or
     * g_hmac_get_digest() must not have been called on {@code hmac}.
     */
    public void update(byte[] data, long length) {
        gtk_h.g_hmac_update(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), length);
    }
    
    /**
     * Creates a new {@link Hmac}, using the digest algorithm {@code digest_type}.
     * If the {@code digest_type} is not known, <code>null</code> is returned.
     * A {@link Hmac} can be used to compute the HMAC of a key and an
     * arbitrary binary blob, using different hashing algorithms.
     * <p>
     * A {@link Hmac} works by feeding a binary blob through g_hmac_update()
     * until the data is complete; the digest can then be extracted
     * using g_hmac_get_string(), which will return the checksum as a
     * hexadecimal string; or g_hmac_get_digest(), which will return a
     * array of raw bytes. Once either g_hmac_get_string() or
     * g_hmac_get_digest() have been called on a {@link Hmac}, the HMAC
     * will be closed and it won't be possible to call g_hmac_update()
     * on it anymore.
     * <p>
     * Support for digests of type {@link ChecksumType#SHA512} has been added in GLib 2.42.
     * Support for {@link ChecksumType#SHA384} was added in GLib 2.52.
     */
    public static Hmac new_(ChecksumType digestType, byte[] key, long keyLen) {
        var RESULT = gtk_h.g_hmac_new(digestType.getValue(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, key)).handle(), keyLen);
        return new Hmac(References.get(RESULT, false));
    }
    
}
