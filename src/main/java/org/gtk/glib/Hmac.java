package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque structure representing a HMAC operation.
 * To create a new GHmac, use g_hmac_new(). To free
 * a GHmac, use g_hmac_unref().
 * @version 2.30
 */
public class Hmac extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GHmac";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Hmac allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Hmac newInstance = new Hmac(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Hmac proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Hmac(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Copies a {@link Hmac}. If {@code hmac} has been closed, by calling
     * g_hmac_get_string() or g_hmac_get_digest(), the copied
     * HMAC will be closed as well.
     * @return the copy of the passed {@link Hmac}. Use g_hmac_unref()
     *   when finished using it.
     */
    public @NotNull org.gtk.glib.Hmac copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hmac_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hmac(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Gets the digest from {@code checksum} as a raw binary array and places it
     * into {@code buffer}. The size of the digest depends on the type of checksum.
     * <p>
     * Once this function has been called, the {@link Hmac} is closed and can
     * no longer be updated with g_checksum_update().
     * @param buffer output buffer
     * @param digestLen an inout parameter. The caller initializes it to the
     *   size of {@code buffer}. After the call it contains the length of the digest
     */
    public void getDigest(@NotNull byte[] buffer, Out<Long> digestLen) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        java.util.Objects.requireNonNull(digestLen, "Parameter 'digestLen' must not be null");
        MemorySegment digestLenPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        try {
            DowncallHandles.g_hmac_get_digest.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(buffer, false),
                    (Addressable) digestLenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        digestLen.set(digestLenPOINTER.get(ValueLayout.JAVA_LONG, 0));
    }
    
    /**
     * Gets the HMAC as a hexadecimal string.
     * <p>
     * Once this function has been called the {@link Hmac} can no longer be
     * updated with g_hmac_update().
     * <p>
     * The hexadecimal characters will be lower case.
     * @return the hexadecimal representation of the HMAC. The
     *   returned string is owned by the HMAC and should not be modified
     *   or freed.
     */
    public @NotNull java.lang.String getString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hmac_get_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Atomically increments the reference count of {@code hmac} by one.
     * <p>
     * This function is MT-safe and may be called from any thread.
     * @return the passed in {@link Hmac}.
     */
    public @NotNull org.gtk.glib.Hmac ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hmac_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hmac(RESULT, Ownership.UNKNOWN);
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
        try {
            DowncallHandles.g_hmac_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Feeds {@code data} into an existing {@link Hmac}.
     * <p>
     * The HMAC must still be open, that is g_hmac_get_string() or
     * g_hmac_get_digest() must not have been called on {@code hmac}.
     * @param data buffer used to compute the checksum
     * @param length size of the buffer, or -1 if it is a nul-terminated string
     */
    public void update(@NotNull byte[] data, long length) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        try {
            DowncallHandles.g_hmac_update.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(data, false),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param digestType the desired type of digest
     * @param key the key for the HMAC
     * @param keyLen the length of the keys
     * @return the newly created {@link Hmac}, or {@code null}.
     *   Use g_hmac_unref() to free the memory allocated by it.
     */
    public static @NotNull org.gtk.glib.Hmac new_(@NotNull org.gtk.glib.ChecksumType digestType, @NotNull byte[] key, long keyLen) {
        java.util.Objects.requireNonNull(digestType, "Parameter 'digestType' must not be null");
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_hmac_new.invokeExact(
                    digestType.getValue(),
                    Interop.allocateNativeArray(key, false),
                    keyLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Hmac(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_hmac_copy = Interop.downcallHandle(
            "g_hmac_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hmac_get_digest = Interop.downcallHandle(
            "g_hmac_get_digest",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hmac_get_string = Interop.downcallHandle(
            "g_hmac_get_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hmac_ref = Interop.downcallHandle(
            "g_hmac_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hmac_unref = Interop.downcallHandle(
            "g_hmac_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_hmac_update = Interop.downcallHandle(
            "g_hmac_update",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
        
        private static final MethodHandle g_hmac_new = Interop.downcallHandle(
            "g_hmac_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
    }
}
