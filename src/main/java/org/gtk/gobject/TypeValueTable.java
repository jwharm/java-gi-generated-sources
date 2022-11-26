package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link TypeValueTable} provides the functions required by the {@link Value}
 * implementation, to serve as a container for values of a type.
 */
public class TypeValueTable extends Struct {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTypeValueTable";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("value_init"),
        Interop.valueLayout.ADDRESS.withName("value_free"),
        Interop.valueLayout.ADDRESS.withName("value_copy"),
        Interop.valueLayout.ADDRESS.withName("value_peek_pointer"),
        Interop.valueLayout.ADDRESS.withName("collect_format"),
        Interop.valueLayout.ADDRESS.withName("collect_value"),
        Interop.valueLayout.ADDRESS.withName("lcopy_format"),
        Interop.valueLayout.ADDRESS.withName("lcopy_value")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TypeValueTable}
     * @return A new, uninitialized @{link TypeValueTable}
     */
    public static TypeValueTable allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TypeValueTable newInstance = new TypeValueTable(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code collect_format}
     * @return The value of the field {@code collect_format}
     */
    public java.lang.String collect_format$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("collect_format"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code collect_format}
     * @param collect_format The new value of the field {@code collect_format}
     */
    public void collect_format$set(java.lang.String collect_format) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("collect_format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(collect_format));
    }
    
    /**
     * Get the value of the field {@code lcopy_format}
     * @return The value of the field {@code lcopy_format}
     */
    public java.lang.String lcopy_format$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lcopy_format"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code lcopy_format}
     * @param lcopy_format The new value of the field {@code lcopy_format}
     */
    public void lcopy_format$set(java.lang.String lcopy_format) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lcopy_format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(lcopy_format));
    }
    
    /**
     * Create a TypeValueTable proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TypeValueTable(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Returns the location of the {@link TypeValueTable} associated with {@code type}.
     * <p>
     * Note that this function should only be used from source code
     * that implements or has internal knowledge of the implementation of
     * {@code type}.
     * @param type a {@link Type}
     * @return location of the {@link TypeValueTable} associated with {@code type} or
     *     {@code null} if there is no {@link TypeValueTable} associated with {@code type}
     */
    public static @NotNull org.gtk.gobject.TypeValueTable peek(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_value_table_peek.invokeExact(
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypeValueTable(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_type_value_table_peek = Interop.downcallHandle(
            "g_type_value_table_peek",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TypeValueTable struct;
        
         /**
         * A {@link TypeValueTable.Build} object constructs a {@link TypeValueTable} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TypeValueTable.allocate();
        }
        
         /**
         * Finish building the {@link TypeValueTable} struct.
         * @return A new instance of {@code TypeValueTable} with the fields 
         *         that were set in the Build object.
         */
        public TypeValueTable construct() {
            return struct;
        }
        
        public Build setValueInit(java.lang.foreign.MemoryAddress value_init) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_init"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value_init == null ? MemoryAddress.NULL : value_init));
            return this;
        }
        
        public Build setValueFree(java.lang.foreign.MemoryAddress value_free) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_free"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value_free == null ? MemoryAddress.NULL : value_free));
            return this;
        }
        
        public Build setValueCopy(java.lang.foreign.MemoryAddress value_copy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value_copy == null ? MemoryAddress.NULL : value_copy));
            return this;
        }
        
        public Build setValuePeekPointer(java.lang.foreign.MemoryAddress value_peek_pointer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_peek_pointer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value_peek_pointer == null ? MemoryAddress.NULL : value_peek_pointer));
            return this;
        }
        
        /**
         * A string format describing how to collect the contents of
         *  this value bit-by-bit. Each character in the format represents
         *  an argument to be collected, and the characters themselves indicate
         *  the type of the argument. Currently supported arguments are:
         * <ul>
         * <li>'i' - Integers. passed as collect_values[].v_int.
         * <li>'l' - Longs. passed as collect_values[].v_long.
         * <li>'d' - Doubles. passed as collect_values[].v_double.
         * <li>'p' - Pointers. passed as collect_values[].v_pointer.
         *  It should be noted that for variable argument list construction,
         *  ANSI C promotes every type smaller than an integer to an int, and
         *  floats to doubles. So for collection of short int or char, 'i'
         *  needs to be used, and for collection of floats 'd'.
         * </ul>
         * @param collect_format The value for the {@code collect_format} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCollectFormat(java.lang.String collect_format) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("collect_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (collect_format == null ? MemoryAddress.NULL : Interop.allocateNativeString(collect_format)));
            return this;
        }
        
        public Build setCollectValue(java.lang.foreign.MemoryAddress collect_value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("collect_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (collect_value == null ? MemoryAddress.NULL : collect_value));
            return this;
        }
        
        /**
         * Format description of the arguments to collect for {@code lcopy_value},
         *  analogous to {@code collect_format}. Usually, {@code lcopy_format} string consists
         *  only of 'p's to provide lcopy_value() with pointers to storage locations.
         * @param lcopy_format The value for the {@code lcopy_format} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLcopyFormat(java.lang.String lcopy_format) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lcopy_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lcopy_format == null ? MemoryAddress.NULL : Interop.allocateNativeString(lcopy_format)));
            return this;
        }
        
        public Build setLcopyValue(java.lang.foreign.MemoryAddress lcopy_value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lcopy_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lcopy_value == null ? MemoryAddress.NULL : lcopy_value));
            return this;
        }
    }
}
