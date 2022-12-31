package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAttrFontDesc} structure is used to store an attribute that
 * sets all aspects of the font description at once.
 */
public class AttrFontDesc extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoAttrFontDesc";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.pango.Attribute.getMemoryLayout().withName("attr"),
            Interop.valueLayout.ADDRESS.withName("desc")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AttrFontDesc}
     * @return A new, uninitialized @{link AttrFontDesc}
     */
    public static AttrFontDesc allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AttrFontDesc newInstance = new AttrFontDesc(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code desc}
     * @return The value of the field {@code desc}
     */
    public org.pango.FontDescription getDesc() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("desc"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.pango.FontDescription.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code desc}
     * @param desc The new value of the field {@code desc}
     */
    public void setDesc(org.pango.FontDescription desc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("desc"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (desc == null ? MemoryAddress.NULL : desc.handle()));
    }
    
    /**
     * Create a AttrFontDesc proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AttrFontDesc(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AttrFontDesc> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AttrFontDesc(input, ownership);
    
    /**
     * Create a new font description attribute.
     * <p>
     * This attribute allows setting family, style, weight, variant,
     * stretch, and size simultaneously.
     * @param desc the font description
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static org.pango.Attribute new_(org.pango.FontDescription desc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_font_desc_new.invokeExact(
                    desc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Attribute.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_attr_font_desc_new = Interop.downcallHandle(
            "pango_attr_font_desc_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link AttrFontDesc.Builder} object constructs a {@link AttrFontDesc} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AttrFontDesc.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AttrFontDesc struct;
        
        private Builder() {
            struct = AttrFontDesc.allocate();
        }
        
         /**
         * Finish building the {@link AttrFontDesc} struct.
         * @return A new instance of {@code AttrFontDesc} with the fields 
         *         that were set in the Builder object.
         */
        public AttrFontDesc build() {
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
         * the font description which is the value of this attribute
         * @param desc The value for the {@code desc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDesc(org.pango.FontDescription desc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("desc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (desc == null ? MemoryAddress.NULL : desc.handle()));
            return this;
        }
    }
}
