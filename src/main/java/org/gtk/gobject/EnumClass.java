package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class of an enumeration type holds information about its
 * possible values.
 */
public class EnumClass extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GEnumClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeClass.getMemoryLayout().withName("g_type_class"),
            Interop.valueLayout.C_INT.withName("minimum"),
            Interop.valueLayout.C_INT.withName("maximum"),
            Interop.valueLayout.C_INT.withName("n_values"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("values")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link EnumClass}
     * @return A new, uninitialized @{link EnumClass}
     */
    public static EnumClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        EnumClass newInstance = new EnumClass(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code minimum}
     * @return The value of the field {@code minimum}
     */
    public int getMinimum() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("minimum"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code minimum}
     * @param minimum The new value of the field {@code minimum}
     */
    public void setMinimum(int minimum) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("minimum"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), minimum);
    }
    
    /**
     * Get the value of the field {@code maximum}
     * @return The value of the field {@code maximum}
     */
    public int getMaximum() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("maximum"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code maximum}
     * @param maximum The new value of the field {@code maximum}
     */
    public void setMaximum(int maximum) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("maximum"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), maximum);
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
    public org.gtk.gobject.EnumValue getValues() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("values"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gtk.gobject.EnumValue.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code values}
     * @param values The new value of the field {@code values}
     */
    public void setValues(org.gtk.gobject.EnumValue values) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("values"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (values == null ? MemoryAddress.NULL : values.handle()));
    }
    
    /**
     * Create a EnumClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected EnumClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, EnumClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new EnumClass(input, ownership);
    
    /**
     * A {@link EnumClass.Builder} object constructs a {@link EnumClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link EnumClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final EnumClass struct;
        
        private Builder() {
            struct = EnumClass.allocate();
        }
        
         /**
         * Finish building the {@link EnumClass} struct.
         * @return A new instance of {@code EnumClass} with the fields 
         *         that were set in the Builder object.
         */
        public EnumClass build() {
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
         * the smallest possible value.
         * @param minimum The value for the {@code minimum} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinimum(int minimum) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("minimum"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), minimum);
            return this;
        }
        
        /**
         * the largest possible value.
         * @param maximum The value for the {@code maximum} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaximum(int maximum) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("maximum"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), maximum);
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
         * an array of {@link EnumValue} structs describing the
         *  individual values.
         * @param values The value for the {@code values} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValues(org.gtk.gobject.EnumValue values) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("values"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (values == null ? MemoryAddress.NULL : values.handle()));
            return this;
        }
    }
}
