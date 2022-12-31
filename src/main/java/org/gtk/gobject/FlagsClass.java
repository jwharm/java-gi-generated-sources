package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class of a flags type holds information about its
 * possible values.
 */
public class FlagsClass extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFlagsClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeClass.getMemoryLayout().withName("g_type_class"),
            Interop.valueLayout.C_INT.withName("mask"),
            Interop.valueLayout.C_INT.withName("n_values"),
            Interop.valueLayout.ADDRESS.withName("values")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FlagsClass}
     * @return A new, uninitialized @{link FlagsClass}
     */
    public static FlagsClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FlagsClass newInstance = new FlagsClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_type_class}
     * @return The value of the field {@code g_type_class}
     */
    public org.gtk.gobject.TypeClass getGTypeClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_type_class"));
        return org.gtk.gobject.TypeClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code g_type_class}
     * @param gTypeClass The new value of the field {@code g_type_class}
     */
    public void setGTypeClass(org.gtk.gobject.TypeClass gTypeClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("g_type_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gTypeClass == null ? MemoryAddress.NULL : gTypeClass.handle()));
    }
    
    /**
     * Get the value of the field {@code mask}
     * @return The value of the field {@code mask}
     */
    public int getMask() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mask"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code mask}
     * @param mask The new value of the field {@code mask}
     */
    public void setMask(int mask) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mask"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), mask);
    }
    
    /**
     * Get the value of the field {@code n_values}
     * @return The value of the field {@code n_values}
     */
    public int getNValues() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_values"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_values}
     * @param nValues The new value of the field {@code n_values}
     */
    public void setNValues(int nValues) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_values"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nValues);
    }
    
    /**
     * Get the value of the field {@code values}
     * @return The value of the field {@code values}
     */
    public org.gtk.gobject.FlagsValue getValues() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("values"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.gobject.FlagsValue.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code values}
     * @param values The new value of the field {@code values}
     */
    public void setValues(org.gtk.gobject.FlagsValue values) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("values"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (values == null ? MemoryAddress.NULL : values.handle()));
    }
    
    /**
     * Create a FlagsClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FlagsClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FlagsClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FlagsClass(input, ownership);
    
    /**
     * A {@link FlagsClass.Builder} object constructs a {@link FlagsClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link FlagsClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final FlagsClass struct;
        
        private Builder() {
            struct = FlagsClass.allocate();
        }
        
         /**
         * Finish building the {@link FlagsClass} struct.
         * @return A new instance of {@code FlagsClass} with the fields 
         *         that were set in the Builder object.
         */
        public FlagsClass build() {
            return struct;
        }
        
        /**
         * the parent class
         * @param gTypeClass The value for the {@code gTypeClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGTypeClass(org.gtk.gobject.TypeClass gTypeClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_type_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gTypeClass == null ? MemoryAddress.NULL : gTypeClass.handle()));
            return this;
        }
        
        /**
         * a mask covering all possible values.
         * @param mask The value for the {@code mask} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMask(int mask) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mask"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), mask);
            return this;
        }
        
        /**
         * the number of possible values.
         * @param nValues The value for the {@code nValues} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNValues(int nValues) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_values"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nValues);
            return this;
        }
        
        /**
         * an array of {@link FlagsValue} structs describing the
         *  individual values.
         * @param values The value for the {@code values} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValues(org.gtk.gobject.FlagsValue values) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("values"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (values == null ? MemoryAddress.NULL : values.handle()));
            return this;
        }
    }
}
