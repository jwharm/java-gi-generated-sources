package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing a HMAC operation.
 * To create a new GHmac, use g_hmac_new(). To free
 * a GHmac, use g_hmac_unref().
 */
public class Hmac extends io.github.jwharm.javagi.ResourceBase {

    public Hmac(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_hmac_copy = Interop.downcallHandle(
        "g_hmac_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies a {@link Hmac}. If {@code hmac} has been closed, by calling
     * g_hmac_get_string() or g_hmac_get_digest(), the copied
     * HMAC will be closed as well.
     */
    public Hmac copy() {
        try {
            var RESULT = (MemoryAddress) g_hmac_copy.invokeExact(handle());
            return new Hmac(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hmac_get_digest = Interop.downcallHandle(
        "g_hmac_get_digest",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the digest from {@code checksum} as a raw binary array and places it
     * into {@code buffer}. The size of the digest depends on the type of checksum.
     * <p>
     * Once this function has been called, the {@link Hmac} is closed and can
     * no longer be updated with g_checksum_update().
     */
    public void getDigest(byte[] buffer, PointerLong digestLen) {
        try {
            g_hmac_get_digest.invokeExact(handle(), Interop.allocateNativeArray(buffer).handle(), digestLen.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hmac_get_string = Interop.downcallHandle(
        "g_hmac_get_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the HMAC as a hexadecimal string.
     * <p>
     * Once this function has been called the {@link Hmac} can no longer be
     * updated with g_hmac_update().
     * <p>
     * The hexadecimal characters will be lower case.
     */
    public java.lang.String getString() {
        try {
            var RESULT = (MemoryAddress) g_hmac_get_string.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hmac_ref = Interop.downcallHandle(
        "g_hmac_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically increments the reference count of {@code hmac} by one.
     * <p>
     * This function is MT-safe and may be called from any thread.
     */
    public Hmac ref() {
        try {
            var RESULT = (MemoryAddress) g_hmac_ref.invokeExact(handle());
            return new Hmac(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hmac_unref = Interop.downcallHandle(
        "g_hmac_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Atomically decrements the reference count of {@code hmac} by one.
     * <p>
     * If the reference count drops to 0, all keys and values will be
     * destroyed, and all memory allocated by the hash table is released.
     * This function is MT-safe and may be called from any thread.
     * Frees the memory allocated for {@code hmac}.
     */
    public void unref() {
        try {
            g_hmac_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hmac_update = Interop.downcallHandle(
        "g_hmac_update",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Feeds {@code data} into an existing {@link Hmac}.
     * <p>
     * The HMAC must still be open, that is g_hmac_get_string() or
     * g_hmac_get_digest() must not have been called on {@code hmac}.
     */
    public void update(byte[] data, long length) {
        try {
            g_hmac_update.invokeExact(handle(), Interop.allocateNativeArray(data).handle(), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_hmac_new = Interop.downcallHandle(
        "g_hmac_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Creates a new {@link Hmac}, using the digest algorithm {@code digest_type}.
     * If the {@code digest_type} is not known, {@code null} is returned.
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
        try {
            var RESULT = (MemoryAddress) g_hmac_new.invokeExact(digestType.getValue(), Interop.allocateNativeArray(key).handle(), keyLen);
            return new Hmac(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}