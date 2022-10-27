package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoCoverage} structure is a map from Unicode characters
 * to {@code Pango.CoverageLevel} values.
 * <p>
 * It is often necessary in Pango to determine if a particular
 * font can represent a particular character, and also how well
 * it can represent that character. The {@code PangoCoverage} is a data
 * structure that is used to represent that information. It is an
 * opaque structure with no public fields.
 */
public class Coverage extends org.gtk.gobject.Object {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public Coverage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Coverage */
    public static Coverage castFrom(org.gtk.gobject.Object gobject) {
        return new Coverage(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.pango_coverage_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@code PangoCoverage}
     */
    public Coverage() {
        super(constructNew());
    }
    
    /**
     * Copy an existing {@code PangoCoverage}.
     * @return the newly allocated {@code PangoCoverage},
     *   with a reference count of one, which should be freed with
     *   {@link Coverage#unref}.
     */
    public @NotNull org.pango.Coverage copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_coverage_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Coverage(Refcounted.get(RESULT, true));
    }
    
    /**
     * Determine whether a particular index is covered by {@code coverage}.
     * @param index the index to check
     * @return the coverage level of {@code coverage} for character {@code index_}.
     */
    public @NotNull org.pango.CoverageLevel get(int index) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_coverage_get.invokeExact(handle(), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.CoverageLevel(RESULT);
    }
    
    /**
     * Set the coverage for each index in {@code coverage} to be the max (better)
     * value of the current coverage for the index and the coverage for
     * the corresponding index in {@code other}.
     * @param other another {@code PangoCoverage}
     * @deprecated This function does nothing
     */
    @Deprecated
    public void max(@NotNull org.pango.Coverage other) {
        java.util.Objects.requireNonNull(other, "Parameter 'other' must not be null");
        try {
            DowncallHandles.pango_coverage_max.invokeExact(handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increase the reference count on the {@code PangoCoverage} by one.
     * @return {@code coverage}
     * @deprecated Use g_object_ref instead
     */
    @Deprecated
    public @NotNull org.pango.Coverage ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_coverage_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Coverage(Refcounted.get(RESULT, true));
    }
    
    /**
     * Modify a particular index within {@code coverage}
     * @param index the index to modify
     * @param level the new level for {@code index_}
     */
    public void set(int index, @NotNull org.pango.CoverageLevel level) {
        java.util.Objects.requireNonNull(level, "Parameter 'level' must not be null");
        try {
            DowncallHandles.pango_coverage_set.invokeExact(handle(), index, level.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convert a {@code PangoCoverage} structure into a flat binary format.
     * @param bytes location to store result (must be freed with g_free())
     * @param nBytes location to store size of result
     * @deprecated This returns {@code null}
     */
    @Deprecated
    public void toBytes(Out<byte[]> bytes, Out<Integer> nBytes) {
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        java.util.Objects.requireNonNull(nBytes, "Parameter 'nBytes' must not be null");
        MemorySegment bytesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment nBytesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.pango_coverage_to_bytes.invokeExact(handle(), (Addressable) bytesPOINTER.address(), (Addressable) nBytesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nBytes.set(nBytesPOINTER.get(ValueLayout.JAVA_INT, 0));
        bytes.set(MemorySegment.ofAddress(bytesPOINTER.get(ValueLayout.ADDRESS, 0), nBytes.get().intValue() * ValueLayout.JAVA_BYTE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_BYTE));
    }
    
    /**
     * Decrease the reference count on the {@code PangoCoverage} by one.
     * <p>
     * If the result is zero, free the coverage and all associated memory.
     * @deprecated Use g_object_unref instead
     */
    @Deprecated
    public void unref() {
        try {
            DowncallHandles.pango_coverage_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convert data generated from {@link Coverage#toBytes}
     * back to a {@code PangoCoverage}.
     * @param bytes binary data
     *   representing a {@code PangoCoverage}
     * @param nBytes the size of {@code bytes} in bytes
     * @return a newly allocated {@code PangoCoverage}
     * @deprecated This returns {@code null}
     */
    @Deprecated
    public static @Nullable org.pango.Coverage fromBytes(byte[] bytes, int nBytes) {
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_coverage_from_bytes.invokeExact(Interop.allocateNativeArray(bytes, false), nBytes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Coverage(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_coverage_new = Interop.downcallHandle(
            "pango_coverage_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_coverage_copy = Interop.downcallHandle(
            "pango_coverage_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_coverage_get = Interop.downcallHandle(
            "pango_coverage_get",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle pango_coverage_max = Interop.downcallHandle(
            "pango_coverage_max",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_coverage_ref = Interop.downcallHandle(
            "pango_coverage_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_coverage_set = Interop.downcallHandle(
            "pango_coverage_set",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle pango_coverage_to_bytes = Interop.downcallHandle(
            "pango_coverage_to_bytes",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_coverage_unref = Interop.downcallHandle(
            "pango_coverage_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_coverage_from_bytes = Interop.downcallHandle(
            "pango_coverage_from_bytes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
