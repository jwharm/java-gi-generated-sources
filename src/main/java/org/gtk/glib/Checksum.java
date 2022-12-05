package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque structure representing a checksumming operation.
 * <p>
 * To create a new GChecksum, use g_checksum_new(). To free
 * a GChecksum, use g_checksum_free().
 * @version 2.16
 */
public class Checksum extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GChecksum";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Checksum}
     * @return A new, uninitialized @{link Checksum}
     */
    public static Checksum allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Checksum newInstance = new Checksum(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Checksum proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Checksum(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(@NotNull org.gtk.glib.ChecksumType checksumType) {
        java.util.Objects.requireNonNull(checksumType, "Parameter 'checksumType' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_checksum_new.invokeExact(
                    checksumType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param checksumType the desired type of checksum
     */
    public Checksum(@NotNull org.gtk.glib.ChecksumType checksumType) {
        super(constructNew(checksumType), Ownership.FULL);
    }
    
    /**
     * Copies a {@link Checksum}. If {@code checksum} has been closed, by calling
     * g_checksum_get_string() or g_checksum_get_digest(), the copied
     * checksum will be closed as well.
     * @return the copy of the passed {@link Checksum}. Use
     *   g_checksum_free() when finished using it.
     */
    public @NotNull org.gtk.glib.Checksum copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_checksum_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Checksum(RESULT, Ownership.FULL);
    }
    
    /**
     * Frees the memory allocated for {@code checksum}.
     */
    public void free() {
        try {
            DowncallHandles.g_checksum_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the digest from {@code checksum} as a raw binary vector and places it
     * into {@code buffer}. The size of the digest depends on the type of checksum.
     * <p>
     * Once this function has been called, the {@link Checksum} is closed and can
     * no longer be updated with g_checksum_update().
     * @param buffer output buffer
     * @param digestLen an inout parameter. The caller initializes it to the size of {@code buffer}.
     *   After the call it contains the length of the digest.
     */
    public void getDigest(@NotNull byte[] buffer, Out<Long> digestLen) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        java.util.Objects.requireNonNull(digestLen, "Parameter 'digestLen' must not be null");
        MemorySegment digestLenPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.g_checksum_get_digest.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(buffer, false),
                    (Addressable) digestLenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        digestLen.set(digestLenPOINTER.get(Interop.valueLayout.C_LONG, 0));
    }
    
    /**
     * Gets the digest as a hexadecimal string.
     * <p>
     * Once this function has been called the {@link Checksum} can no longer be
     * updated with g_checksum_update().
     * <p>
     * The hexadecimal characters will be lower case.
     * @return the hexadecimal representation of the checksum. The
     *   returned string is owned by the checksum and should not be modified
     *   or freed.
     */
    public @NotNull java.lang.String getString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_checksum_get_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Resets the state of the {@code checksum} back to its initial state.
     */
    public void reset() {
        try {
            DowncallHandles.g_checksum_reset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Feeds {@code data} into an existing {@link Checksum}. The checksum must still be
     * open, that is g_checksum_get_string() or g_checksum_get_digest() must
     * not have been called on {@code checksum}.
     * @param data buffer used to compute the checksum
     * @param length size of the buffer, or -1 if it is a null-terminated string.
     */
    public void update(@NotNull byte[] data, long length) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        try {
            DowncallHandles.g_checksum_update.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(data, false),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the length in bytes of digests of type {@code checksum_type}
     * @param checksumType a {@link ChecksumType}
     * @return the checksum length, or -1 if {@code checksum_type} is
     * not supported.
     */
    public static long typeGetLength(@NotNull org.gtk.glib.ChecksumType checksumType) {
        java.util.Objects.requireNonNull(checksumType, "Parameter 'checksumType' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_checksum_type_get_length.invokeExact(
                    checksumType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_checksum_new = Interop.downcallHandle(
            "g_checksum_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_checksum_copy = Interop.downcallHandle(
            "g_checksum_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_checksum_free = Interop.downcallHandle(
            "g_checksum_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_checksum_get_digest = Interop.downcallHandle(
            "g_checksum_get_digest",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_checksum_get_string = Interop.downcallHandle(
            "g_checksum_get_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_checksum_reset = Interop.downcallHandle(
            "g_checksum_reset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_checksum_update = Interop.downcallHandle(
            "g_checksum_update",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_checksum_type_get_length = Interop.downcallHandle(
            "g_checksum_type_get_length",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
    }
}
