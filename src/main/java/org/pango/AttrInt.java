package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAttrInt} structure is used to represent attributes with
 * an integer or enumeration value.
 */
public class AttrInt extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoAttrInt";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.pango.Attribute.getMemoryLayout().withName("attr"),
            Interop.valueLayout.C_INT.withName("value")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AttrInt}
     * @return A new, uninitialized @{link AttrInt}
     */
    public static AttrInt allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AttrInt newInstance = new AttrInt(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code attr}
     * @return The value of the field {@code attr}
     */
    public org.pango.Attribute getAttr() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("attr"));
        return org.pango.Attribute.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code attr}
     * @param attr The new value of the field {@code attr}
     */
    public void setAttr(org.pango.Attribute attr) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("attr"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (attr == null ? MemoryAddress.NULL : attr.handle()));
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public int getValue() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void setValue(int value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), value);
    }
    
    /**
     * Create a AttrInt proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AttrInt(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AttrInt> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AttrInt(input, ownership);
    
    /**
     * A {@link AttrInt.Builder} object constructs a {@link AttrInt} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AttrInt.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AttrInt struct;
        
        private Builder() {
            struct = AttrInt.allocate();
        }
        
         /**
         * Finish building the {@link AttrInt} struct.
         * @return A new instance of {@code AttrInt} with the fields 
         *         that were set in the Builder object.
         */
        public AttrInt build() {
            return struct;
        }
        
        /**
         * the common portion of the attribute
         * @param attr The value for the {@code attr} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAttr(org.pango.Attribute attr) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("attr"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (attr == null ? MemoryAddress.NULL : attr.handle()));
            return this;
        }
        
        /**
         * the value of the attribute
         * @param value The value for the {@code value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValue(int value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), value);
            return this;
        }
    }
}
