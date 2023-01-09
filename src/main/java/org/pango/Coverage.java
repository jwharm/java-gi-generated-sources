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
public class Coverage extends org.gtk.gobject.GObject {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoCoverage";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Coverage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Coverage(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Coverage> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Coverage(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_coverage_new.invokeExact();
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
        this.takeOwnership();
    }
    
    /**
     * Copy an existing {@code PangoCoverage}.
     * @return the newly allocated {@code PangoCoverage},
     *   with a reference count of one, which should be freed with
     *   {@link Coverage#unref}.
     */
    public org.pango.Coverage copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_coverage_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.pango.Coverage) Interop.register(RESULT, org.pango.Coverage.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Determine whether a particular index is covered by {@code coverage}.
     * @param index the index to check
     * @return the coverage level of {@code coverage} for character {@code index_}.
     */
    public org.pango.CoverageLevel get(int index) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_coverage_get.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.CoverageLevel.of(RESULT);
    }
    
    /**
     * Set the coverage for each index in {@code coverage} to be the max (better)
     * value of the current coverage for the index and the coverage for
     * the corresponding index in {@code other}.
     * @param other another {@code PangoCoverage}
     * @deprecated This function does nothing
     */
    @Deprecated
    public void max(org.pango.Coverage other) {
        try {
            DowncallHandles.pango_coverage_max.invokeExact(
                    handle(),
                    other.handle());
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
    public org.pango.Coverage ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_coverage_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.pango.Coverage) Interop.register(RESULT, org.pango.Coverage.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Modify a particular index within {@code coverage}
     * @param index the index to modify
     * @param level the new level for {@code index_}
     */
    public void set(int index, org.pango.CoverageLevel level) {
        try {
            DowncallHandles.pango_coverage_set.invokeExact(
                    handle(),
                    index,
                    level.getValue());
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment bytesPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment nBytesPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.pango_coverage_to_bytes.invokeExact(
                        handle(),
                        (Addressable) bytesPOINTER.address(),
                        (Addressable) nBytesPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    nBytes.set(nBytesPOINTER.get(Interop.valueLayout.C_INT, 0));
            bytes.set(MemorySegment.ofAddress(bytesPOINTER.get(Interop.valueLayout.ADDRESS, 0), nBytes.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE));
        }
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
        this.yieldOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.pango_coverage_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.pango_coverage_from_bytes.invokeExact(
                        Interop.allocateNativeArray(bytes, false, SCOPE),
                        nBytes);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.pango.Coverage) Interop.register(RESULT, org.pango.Coverage.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * A {@link Coverage.Builder} object constructs a {@link Coverage} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Coverage.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Coverage} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Coverage}.
         * @return A new instance of {@code Coverage} with the properties 
         *         that were set in the Builder object.
         */
        public Coverage build() {
            return (Coverage) org.gtk.gobject.GObject.newWithProperties(
                Coverage.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_coverage_new = Interop.downcallHandle(
                "pango_coverage_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_coverage_copy = Interop.downcallHandle(
                "pango_coverage_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_coverage_get = Interop.downcallHandle(
                "pango_coverage_get",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_coverage_max = Interop.downcallHandle(
                "pango_coverage_max",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_coverage_ref = Interop.downcallHandle(
                "pango_coverage_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_coverage_set = Interop.downcallHandle(
                "pango_coverage_set",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_coverage_to_bytes = Interop.downcallHandle(
                "pango_coverage_to_bytes",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_coverage_unref = Interop.downcallHandle(
                "pango_coverage_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_coverage_get_type = Interop.downcallHandle(
                "pango_coverage_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle pango_coverage_from_bytes = Interop.downcallHandle(
                "pango_coverage_from_bytes",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.pango_coverage_get_type != null;
    }
}
