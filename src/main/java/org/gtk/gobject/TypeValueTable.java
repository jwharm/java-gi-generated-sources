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
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTypeValueTable";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("value_init"),
            Interop.valueLayout.ADDRESS.withName("value_free"),
            Interop.valueLayout.ADDRESS.withName("value_copy"),
            Interop.valueLayout.ADDRESS.withName("value_peek_pointer"),
            Interop.valueLayout.ADDRESS.withName("collect_format"),
            Interop.valueLayout.ADDRESS.withName("collect_value"),
            Interop.valueLayout.ADDRESS.withName("lcopy_format"),
            Interop.valueLayout.ADDRESS.withName("lcopy_value")
        ).withName(C_TYPE_NAME);
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
    
    @FunctionalInterface
    public interface ValueInitCallback {
        void run(org.gtk.gobject.Value value);

        @ApiStatus.Internal default void upcall(MemoryAddress value) {
            run(org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ValueInitCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code value_init}
     * @param valueInit The new value of the field {@code value_init}
     */
    public void setValueInit(ValueInitCallback valueInit) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_init"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueInit == null ? MemoryAddress.NULL : valueInit.toCallback()));
    }
    
    @FunctionalInterface
    public interface ValueFreeCallback {
        void run(org.gtk.gobject.Value value);

        @ApiStatus.Internal default void upcall(MemoryAddress value) {
            run(org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ValueFreeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code value_free}
     * @param valueFree The new value of the field {@code value_free}
     */
    public void setValueFree(ValueFreeCallback valueFree) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_free"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueFree == null ? MemoryAddress.NULL : valueFree.toCallback()));
    }
    
    @FunctionalInterface
    public interface ValueCopyCallback {
        void run(org.gtk.gobject.Value srcValue, org.gtk.gobject.Value destValue);

        @ApiStatus.Internal default void upcall(MemoryAddress srcValue, MemoryAddress destValue) {
            run(org.gtk.gobject.Value.fromAddress.marshal(srcValue, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(destValue, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ValueCopyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code value_copy}
     * @param valueCopy The new value of the field {@code value_copy}
     */
    public void setValueCopy(ValueCopyCallback valueCopy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_copy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueCopy == null ? MemoryAddress.NULL : valueCopy.toCallback()));
    }
    
    @FunctionalInterface
    public interface ValuePeekPointerCallback {
        java.lang.foreign.MemoryAddress run(org.gtk.gobject.Value value);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress value) {
            var RESULT = run(org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ValuePeekPointerCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code value_peek_pointer}
     * @param valuePeekPointer The new value of the field {@code value_peek_pointer}
     */
    public void setValuePeekPointer(ValuePeekPointerCallback valuePeekPointer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_peek_pointer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valuePeekPointer == null ? MemoryAddress.NULL : valuePeekPointer.toCallback()));
    }
    
    /**
     * Get the value of the field {@code collect_format}
     * @return The value of the field {@code collect_format}
     */
    public java.lang.String getCollectFormat() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("collect_format"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code collect_format}
     * @param collectFormat The new value of the field {@code collect_format}
     */
    public void setCollectFormat(java.lang.String collectFormat) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("collect_format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (collectFormat == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(collectFormat, null)));
    }
    
    @FunctionalInterface
    public interface CollectValueCallback {
        java.lang.String run(org.gtk.gobject.Value value, int nCollectValues, org.gtk.gobject.TypeCValue collectValues, int collectFlags);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress value, int nCollectValues, MemoryAddress collectValues, int collectFlags) {
            var RESULT = run(org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE), nCollectValues, org.gtk.gobject.TypeCValue.fromAddress.marshal(collectValues, Ownership.NONE), collectFlags);
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CollectValueCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code collect_value}
     * @param collectValue The new value of the field {@code collect_value}
     */
    public void setCollectValue(CollectValueCallback collectValue) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("collect_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (collectValue == null ? MemoryAddress.NULL : collectValue.toCallback()));
    }
    
    /**
     * Get the value of the field {@code lcopy_format}
     * @return The value of the field {@code lcopy_format}
     */
    public java.lang.String getLcopyFormat() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lcopy_format"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code lcopy_format}
     * @param lcopyFormat The new value of the field {@code lcopy_format}
     */
    public void setLcopyFormat(java.lang.String lcopyFormat) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lcopy_format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lcopyFormat == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(lcopyFormat, null)));
    }
    
    @FunctionalInterface
    public interface LcopyValueCallback {
        java.lang.String run(org.gtk.gobject.Value value, int nCollectValues, org.gtk.gobject.TypeCValue collectValues, int collectFlags);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress value, int nCollectValues, MemoryAddress collectValues, int collectFlags) {
            var RESULT = run(org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE), nCollectValues, org.gtk.gobject.TypeCValue.fromAddress.marshal(collectValues, Ownership.NONE), collectFlags);
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LcopyValueCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lcopy_value}
     * @param lcopyValue The new value of the field {@code lcopy_value}
     */
    public void setLcopyValue(LcopyValueCallback lcopyValue) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lcopy_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lcopyValue == null ? MemoryAddress.NULL : lcopyValue.toCallback()));
    }
    
    /**
     * Create a TypeValueTable proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TypeValueTable(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TypeValueTable> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TypeValueTable(input, ownership);
    
    /**
     * Returns the location of the {@link TypeValueTable} associated with {@code type}.
     * <p>
     * Note that this function should only be used from source code
     * that implements or has internal knowledge of the implementation of
     * {@code type}.
     * @param type a {@link org.gtk.glib.Type}
     * @return location of the {@link TypeValueTable} associated with {@code type} or
     *     {@code null} if there is no {@link TypeValueTable} associated with {@code type}
     */
    public static org.gtk.gobject.TypeValueTable peek(org.gtk.glib.Type type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_value_table_peek.invokeExact(
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gobject.TypeValueTable.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_type_value_table_peek = Interop.downcallHandle(
            "g_type_value_table_peek",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
    }
    
    /**
     * A {@link TypeValueTable.Builder} object constructs a {@link TypeValueTable} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TypeValueTable.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TypeValueTable struct;
        
        private Builder() {
            struct = TypeValueTable.allocate();
        }
        
         /**
         * Finish building the {@link TypeValueTable} struct.
         * @return A new instance of {@code TypeValueTable} with the fields 
         *         that were set in the Builder object.
         */
        public TypeValueTable build() {
            return struct;
        }
        
        public Builder setValueInit(ValueInitCallback valueInit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_init"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueInit == null ? MemoryAddress.NULL : valueInit.toCallback()));
            return this;
        }
        
        public Builder setValueFree(ValueFreeCallback valueFree) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_free"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueFree == null ? MemoryAddress.NULL : valueFree.toCallback()));
            return this;
        }
        
        public Builder setValueCopy(ValueCopyCallback valueCopy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueCopy == null ? MemoryAddress.NULL : valueCopy.toCallback()));
            return this;
        }
        
        public Builder setValuePeekPointer(ValuePeekPointerCallback valuePeekPointer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_peek_pointer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valuePeekPointer == null ? MemoryAddress.NULL : valuePeekPointer.toCallback()));
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
         * @param collectFormat The value for the {@code collectFormat} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCollectFormat(java.lang.String collectFormat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("collect_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (collectFormat == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(collectFormat, null)));
            return this;
        }
        
        public Builder setCollectValue(CollectValueCallback collectValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("collect_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (collectValue == null ? MemoryAddress.NULL : collectValue.toCallback()));
            return this;
        }
        
        /**
         * Format description of the arguments to collect for {@code lcopy_value},
         *  analogous to {@code collect_format}. Usually, {@code lcopy_format} string consists
         *  only of 'p's to provide lcopy_value() with pointers to storage locations.
         * @param lcopyFormat The value for the {@code lcopyFormat} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLcopyFormat(java.lang.String lcopyFormat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lcopy_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lcopyFormat == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(lcopyFormat, null)));
            return this;
        }
        
        public Builder setLcopyValue(LcopyValueCallback lcopyValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lcopy_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lcopyValue == null ? MemoryAddress.NULL : lcopyValue.toCallback()));
            return this;
        }
    }
}
