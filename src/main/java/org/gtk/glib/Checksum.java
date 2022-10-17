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
 */
public class Checksum extends io.github.jwharm.javagi.ResourceBase {

    public Checksum(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_checksum_new = Interop.downcallHandle(
        "g_checksum_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(@NotNull ChecksumType checksumType) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_checksum_new.invokeExact(checksumType.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    public Checksum(@NotNull ChecksumType checksumType) {
        super(constructNew(checksumType));
    }
    
    private static final MethodHandle g_checksum_copy = Interop.downcallHandle(
        "g_checksum_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies a {@link Checksum}. If {@code checksum} has been closed, by calling
     * g_checksum_get_string() or g_checksum_get_digest(), the copied
     * checksum will be closed as well.
     */
    public @NotNull Checksum copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_checksum_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Checksum(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_checksum_free = Interop.downcallHandle(
        "g_checksum_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the memory allocated for {@code checksum}.
     */
    public @NotNull void free() {
        try {
            g_checksum_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_checksum_get_digest = Interop.downcallHandle(
        "g_checksum_get_digest",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the digest from {@code checksum} as a raw binary vector and places it
     * into {@code buffer}. The size of the digest depends on the type of checksum.
     * <p>
     * Once this function has been called, the {@link Checksum} is closed and can
     * no longer be updated with g_checksum_update().
     */
    public @NotNull void getDigest(@NotNull byte[] buffer, @NotNull Out<Long> digestLen) {
        MemorySegment digestLenPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        try {
            g_checksum_get_digest.invokeExact(handle(), Interop.allocateNativeArray(buffer), (Addressable) digestLenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        digestLen.set(digestLenPOINTER.get(ValueLayout.JAVA_LONG, 0));
    }
    
    private static final MethodHandle g_checksum_get_string = Interop.downcallHandle(
        "g_checksum_get_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the digest as a hexadecimal string.
     * <p>
     * Once this function has been called the {@link Checksum} can no longer be
     * updated with g_checksum_update().
     * <p>
     * The hexadecimal characters will be lower case.
     */
    public @NotNull java.lang.String getString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_checksum_get_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_checksum_reset = Interop.downcallHandle(
        "g_checksum_reset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Resets the state of the {@code checksum} back to its initial state.
     */
    public @NotNull void reset() {
        try {
            g_checksum_reset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_checksum_update = Interop.downcallHandle(
        "g_checksum_update",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Feeds {@code data} into an existing {@link Checksum}. The checksum must still be
     * open, that is g_checksum_get_string() or g_checksum_get_digest() must
     * not have been called on {@code checksum}.
     */
    public @NotNull void update(@NotNull byte[] data, @NotNull long length) {
        try {
            g_checksum_update.invokeExact(handle(), Interop.allocateNativeArray(data), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_checksum_type_get_length = Interop.downcallHandle(
        "g_checksum_type_get_length",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the length in bytes of digests of type {@code checksum_type}
     */
    public static long typeGetLength(@NotNull ChecksumType checksumType) {
        long RESULT;
        try {
            RESULT = (long) g_checksum_type_get_length.invokeExact(checksumType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
}
