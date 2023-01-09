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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AttrFontDesc newInstance = new AttrFontDesc(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code attr}
     * @return The value of the field {@code attr}
     */
    public org.pango.Attribute getAttr() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("attr"));
        return org.pango.Attribute.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code attr}
     * @param attr The new value of the field {@code attr}
     */
    public void setAttr(org.pango.Attribute attr) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("attr"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (attr == null ? MemoryAddress.NULL : attr.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code desc}
     * @return The value of the field {@code desc}
     */
    public org.pango.FontDescription getDesc() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("desc"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.pango.FontDescription.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code desc}
     * @param desc The new value of the field {@code desc}
     */
    public void setDesc(org.pango.FontDescription desc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("desc"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (desc == null ? MemoryAddress.NULL : desc.handle()));
        }
    }
    
    /**
     * Create a AttrFontDesc proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AttrFontDesc(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AttrFontDesc> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AttrFontDesc(input);
    
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
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_font_desc_new.invokeExact(desc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.pango.Attribute.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("attr"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (attr == null ? MemoryAddress.NULL : attr.handle()));
                return this;
            }
        }
        
        /**
         * the font description which is the value of this attribute
         * @param desc The value for the {@code desc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDesc(org.pango.FontDescription desc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("desc"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (desc == null ? MemoryAddress.NULL : desc.handle()));
                return this;
            }
        }
    }
}
