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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.pango.Attribute.getMemoryLayout().withName("attr"),
        Interop.valueLayout.ADDRESS.withName("features")
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
    public org.pango.Attribute attr$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("attr"));
        return new org.pango.Attribute(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code features}
     * @return The value of the field {@code features}
     */
    public java.lang.String features$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("features"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code features}
     * @param features The new value of the field {@code features}
     */
    public void features$set(java.lang.String features) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("features"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(features));
    }
    
    /**
     * Create a AttrFontFeatures proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AttrFontFeatures(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
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
    public static @NotNull org.pango.Attribute new_(@NotNull java.lang.String features) {
        java.util.Objects.requireNonNull(features, "Parameter 'features' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_font_features_new.invokeExact(
                    Interop.allocateNativeString(features));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_attr_font_features_new = Interop.downcallHandle(
            "pango_attr_font_features_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AttrFontFeatures struct;
        
         /**
         * A {@link AttrFontFeatures.Build} object constructs a {@link AttrFontFeatures} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AttrFontFeatures.allocate();
        }
        
         /**
         * Finish building the {@link AttrFontFeatures} struct.
         * @return A new instance of {@code AttrFontFeatures} with the fields 
         *         that were set in the Build object.
         */
        public AttrFontFeatures construct() {
            return struct;
        }
        
        /**
         * the common portion of the attribute
         * @param attr The value for the {@code attr} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAttr(org.pango.Attribute attr) {
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
        public Build setFeatures(java.lang.String features) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("features"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (features == null ? MemoryAddress.NULL : Interop.allocateNativeString(features)));
            return this;
        }
    }
}
