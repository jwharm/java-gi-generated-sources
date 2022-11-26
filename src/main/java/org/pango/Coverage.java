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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Coverage(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Coverage if its GType is a (or inherits from) "PangoCoverage".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Coverage} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "PangoCoverage", a ClassCastException will be thrown.
     */
    public static Coverage castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), Coverage.getType())) {
            return new Coverage(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of PangoCoverage");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.FULL);
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
            RESULT = (MemoryAddress) DowncallHandles.pango_coverage_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Coverage(RESULT, Ownership.FULL);
    }
    
    /**
     * Determine whether a particular index is covered by {@code coverage}.
     * @param index the index to check
     * @return the coverage level of {@code coverage} for character {@code index_}.
     */
    public @NotNull org.pango.CoverageLevel get(int index) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_coverage_get.invokeExact(
                    handle(),
                    index);
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
    public @NotNull org.pango.Coverage ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_coverage_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Coverage(RESULT, Ownership.FULL);
    }
    
    /**
     * Modify a particular index within {@code coverage}
     * @param index the index to modify
     * @param level the new level for {@code index_}
     */
    public void set(int index, @NotNull org.pango.CoverageLevel level) {
        java.util.Objects.requireNonNull(level, "Parameter 'level' must not be null");
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
    public void toBytes(@NotNull Out<byte[]> bytes, Out<Integer> nBytes) {
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        MemorySegment bytesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(nBytes, "Parameter 'nBytes' must not be null");
        MemorySegment nBytesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.pango_coverage_to_bytes.invokeExact(
                    handle(),
                    (Addressable) bytesPOINTER.address(),
                    (Addressable) nBytesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nBytes.set(nBytesPOINTER.get(Interop.valueLayout.C_INT, 0));
        bytes.set(MemorySegment.ofAddress(bytesPOINTER.get(Interop.valueLayout.ADDRESS, 0), nBytes.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
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
            DowncallHandles.pango_coverage_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
    public static @Nullable org.pango.Coverage fromBytes(@NotNull byte[] bytes, int nBytes) {
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_coverage_from_bytes.invokeExact(
                    Interop.allocateNativeArray(bytes, false),
                    nBytes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Coverage(RESULT, Ownership.FULL);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link Coverage.Build} object constructs a {@link Coverage} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Coverage} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Coverage} using {@link Coverage#castFrom}.
         * @return A new instance of {@code Coverage} with the properties 
         *         that were set in the Build object.
         */
        public Coverage construct() {
            return Coverage.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Coverage.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
