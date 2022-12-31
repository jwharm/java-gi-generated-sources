package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAttrFontFeatures} structure is used to represent OpenType
 * font features as an attribute.
 * @version 1.38
 */
public class AttrFontFeatures extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoAttrFontFeatures";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.pango.Attribute.getMemoryLayout().withName("attr"),
            Interop.valueLayout.ADDRESS.withName("features")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AttrFontFeatures}
     * @return A new, uninitialized @{link AttrFontFeatures}
     */
    public static AttrFontFeatures allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AttrFontFeatures newInstance = new AttrFontFeatures(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code features}
     * @return The value of the field {@code features}
     */
    public java.lang.String getFeatures() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("features"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code features}
     * @param features The new value of the field {@code features}
     */
    public void setFeatures(java.lang.String features) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("features"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (features == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(features, null)));
    }
    
    /**
     * Create a AttrFontFeatures proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AttrFontFeatures(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AttrFontFeatures> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AttrFontFeatures(input, ownership);
    
    /**
     * Create a new font features tag attribute.
     * <p>
     * You can use this attribute to select OpenType font features like small-caps,
     * alternative glyphs, ligatures, etc. for fonts that support them.
     * @param features a string with OpenType font features, with the syntax of the [CSS
     * font-feature-settings property](https://www.w3.org/TR/css-fonts-4/{@code font}-rend-desc)
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static org.pango.Attribute new_(java.lang.String features) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_font_features_new.invokeExact(
                    Marshal.stringToAddress.marshal(features, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Attribute.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_attr_font_features_new = Interop.downcallHandle(
            "pango_attr_font_features_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link AttrFontFeatures.Builder} object constructs a {@link AttrFontFeatures} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AttrFontFeatures.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AttrFontFeatures struct;
        
        private Builder() {
            struct = AttrFontFeatures.allocate();
        }
        
         /**
         * Finish building the {@link AttrFontFeatures} struct.
         * @return A new instance of {@code AttrFontFeatures} with the fields 
         *         that were set in the Builder object.
         */
        public AttrFontFeatures build() {
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
         * the features, as a string in CSS syntax
         * @param features The value for the {@code features} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFeatures(java.lang.String features) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("features"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (features == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(features, null)));
            return this;
        }
    }
}
