package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAttrShape} structure is used to represent attributes which
 * impose shape restrictions.
 */
public class AttrShape extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoAttrShape";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.pango.Attribute.getMemoryLayout().withName("attr"),
            org.pango.Rectangle.getMemoryLayout().withName("ink_rect"),
            org.pango.Rectangle.getMemoryLayout().withName("logical_rect"),
            Interop.valueLayout.ADDRESS.withName("data"),
            Interop.valueLayout.ADDRESS.withName("copy_func"),
            Interop.valueLayout.ADDRESS.withName("destroy_func")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AttrShape}
     * @return A new, uninitialized @{link AttrShape}
     */
    public static AttrShape allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AttrShape newInstance = new AttrShape(segment.address());
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
     * Get the value of the field {@code ink_rect}
     * @return The value of the field {@code ink_rect}
     */
    public org.pango.Rectangle getInkRect() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("ink_rect"));
        return org.pango.Rectangle.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code ink_rect}
     * @param inkRect The new value of the field {@code ink_rect}
     */
    public void setInkRect(org.pango.Rectangle inkRect) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ink_rect"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (inkRect == null ? MemoryAddress.NULL : inkRect.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code logical_rect}
     * @return The value of the field {@code logical_rect}
     */
    public org.pango.Rectangle getLogicalRect() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("logical_rect"));
        return org.pango.Rectangle.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code logical_rect}
     * @param logicalRect The new value of the field {@code logical_rect}
     */
    public void setLogicalRect(org.pango.Rectangle logicalRect) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("logical_rect"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (logicalRect == null ? MemoryAddress.NULL : logicalRect.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress getData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void setData(java.lang.foreign.MemoryAddress data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
        }
    }
    
    /**
     * Get the value of the field {@code copy_func}
     * @return The value of the field {@code copy_func}
     */
    public org.pango.AttrDataCopyFunc getCopyFunc() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_func"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code copy_func}
     * @param copyFunc The new value of the field {@code copy_func}
     */
    public void setCopyFunc(org.pango.AttrDataCopyFunc copyFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copyFunc == null ? MemoryAddress.NULL : (Addressable) copyFunc.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code destroy_func}
     * @return The value of the field {@code destroy_func}
     */
    public org.gtk.glib.DestroyNotify getDestroyFunc() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("destroy_func"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code destroy_func}
     * @param destroyFunc The new value of the field {@code destroy_func}
     */
    public void setDestroyFunc(org.gtk.glib.DestroyNotify destroyFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("destroy_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (destroyFunc == null ? MemoryAddress.NULL : (Addressable) destroyFunc.toCallback()));
        }
    }
    
    /**
     * Create a AttrShape proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AttrShape(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AttrShape> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AttrShape(input);
    
    /**
     * Create a new shape attribute.
     * <p>
     * A shape is used to impose a particular ink and logical
     * rectangle on the result of shaping a particular glyph.
     * This might be used, for instance, for embedding a picture
     * or a widget inside a {@code PangoLayout}.
     * @param inkRect ink rectangle to assign to each character
     * @param logicalRect logical rectangle to assign to each character
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static org.pango.Attribute new_(org.pango.Rectangle inkRect, org.pango.Rectangle logicalRect) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_shape_new.invokeExact(
                    inkRect.handle(),
                    logicalRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.pango.Attribute.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Creates a new shape attribute.
     * <p>
     * Like {@link AttrShape#new_}, but a user data pointer
     * is also provided; this pointer can be accessed when later
     * rendering the glyph.
     * @param inkRect ink rectangle to assign to each character
     * @param logicalRect logical rectangle to assign to each character
     * @param copyFunc function to copy {@code data} when the
     *   attribute is copied. If {@code null}, {@code data} is simply copied
     *   as a pointer
     * @param destroyFunc function to free {@code data} when the
     *   attribute is freed
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static org.pango.Attribute newWithData(org.pango.Rectangle inkRect, org.pango.Rectangle logicalRect, @Nullable org.pango.AttrDataCopyFunc copyFunc, @Nullable org.gtk.glib.DestroyNotify destroyFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_shape_new_with_data.invokeExact(
                    inkRect.handle(),
                    logicalRect.handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (copyFunc == null ? MemoryAddress.NULL : (Addressable) copyFunc.toCallback()),
                    (Addressable) (destroyFunc == null ? MemoryAddress.NULL : (Addressable) destroyFunc.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.pango.Attribute.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_attr_shape_new = Interop.downcallHandle(
                "pango_attr_shape_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_attr_shape_new_with_data = Interop.downcallHandle(
                "pango_attr_shape_new_with_data",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link AttrShape.Builder} object constructs a {@link AttrShape} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AttrShape.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AttrShape struct;
        
        private Builder() {
            struct = AttrShape.allocate();
        }
        
        /**
         * Finish building the {@link AttrShape} struct.
         * @return A new instance of {@code AttrShape} with the fields 
         *         that were set in the Builder object.
         */
        public AttrShape build() {
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
         * the ink rectangle to restrict to
         * @param inkRect The value for the {@code inkRect} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInkRect(org.pango.Rectangle inkRect) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("ink_rect"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (inkRect == null ? MemoryAddress.NULL : inkRect.handle()));
                return this;
            }
        }
        
        /**
         * the logical rectangle to restrict to
         * @param logicalRect The value for the {@code logicalRect} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLogicalRect(org.pango.Rectangle logicalRect) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("logical_rect"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (logicalRect == null ? MemoryAddress.NULL : logicalRect.handle()));
                return this;
            }
        }
        
        /**
         * user data set (see {@link AttrShape#newWithData})
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setData(java.lang.foreign.MemoryAddress data) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
                return this;
            }
        }
        
        /**
         * copy function for the user data
         * @param copyFunc The value for the {@code copyFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCopyFunc(org.pango.AttrDataCopyFunc copyFunc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("copy_func"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copyFunc == null ? MemoryAddress.NULL : (Addressable) copyFunc.toCallback()));
                return this;
            }
        }
        
        /**
         * destroy function for the user data
         * @param destroyFunc The value for the {@code destroyFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDestroyFunc(org.gtk.glib.DestroyNotify destroyFunc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("destroy_func"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (destroyFunc == null ? MemoryAddress.NULL : (Addressable) destroyFunc.toCallback()));
                return this;
            }
        }
    }
}
