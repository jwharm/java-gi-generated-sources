package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAttrColor} structure is used to represent attributes that
 * are colors.
 */
public class AttrColor extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoAttrColor";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.pango.Attribute.getMemoryLayout().withName("attr"),
            org.pango.Color.getMemoryLayout().withName("color")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AttrColor}
     * @return A new, uninitialized @{link AttrColor}
     */
    public static AttrColor allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AttrColor newInstance = new AttrColor(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code color}
     * @return The value of the field {@code color}
     */
    public org.pango.Color getColor() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("color"));
        return org.pango.Color.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code color}
     * @param color The new value of the field {@code color}
     */
    public void setColor(org.pango.Color color) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("color"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (color == null ? MemoryAddress.NULL : color.handle()));
    }
    
    /**
     * Create a AttrColor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AttrColor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AttrColor> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AttrColor(input, ownership);
    
    /**
     * A {@link AttrColor.Builder} object constructs a {@link AttrColor} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AttrColor.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AttrColor struct;
        
        private Builder() {
            struct = AttrColor.allocate();
        }
        
         /**
         * Finish building the {@link AttrColor} struct.
         * @return A new instance of {@code AttrColor} with the fields 
         *         that were set in the Builder object.
         */
        public AttrColor build() {
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
         * the {@code PangoColor} which is the value of the attribute
         * @param color The value for the {@code color} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setColor(org.pango.Color color) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("color"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (color == null ? MemoryAddress.NULL : color.handle()));
            return this;
        }
    }
}
