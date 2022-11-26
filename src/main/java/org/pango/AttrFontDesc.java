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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.pango.Attribute.getMemoryLayout().withName("attr"),
        Interop.valueLayout.ADDRESS.withName("desc")
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
    public org.pango.Attribute attr$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("attr"));
        return new org.pango.Attribute(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code desc}
     * @return The value of the field {@code desc}
     */
    public org.pango.FontDescription desc$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("desc"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.pango.FontDescription(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code desc}
     * @param desc The new value of the field {@code desc}
     */
    public void desc$set(org.pango.FontDescription desc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("desc"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), desc.handle());
    }
    
    /**
     * Create a AttrFontDesc proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AttrFontDesc(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
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
    public static @NotNull org.pango.Attribute new_(@NotNull org.pango.FontDescription desc) {
        java.util.Objects.requireNonNull(desc, "Parameter 'desc' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_font_desc_new.invokeExact(
                    desc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_attr_font_desc_new = Interop.downcallHandle(
            "pango_attr_font_desc_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AttrFontDesc struct;
        
         /**
         * A {@link AttrFontDesc.Build} object constructs a {@link AttrFontDesc} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AttrFontDesc.allocate();
        }
        
         /**
         * Finish building the {@link AttrFontDesc} struct.
         * @return A new instance of {@code AttrFontDesc} with the fields 
         *         that were set in the Build object.
         */
        public AttrFontDesc construct() {
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
         * the font description which is the value of this attribute
         * @param desc The value for the {@code desc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDesc(org.pango.FontDescription desc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("desc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (desc == null ? MemoryAddress.NULL : desc.handle()));
            return this;
        }
    }
}
