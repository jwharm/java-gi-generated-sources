package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAttrSize} structure is used to represent attributes which
 * set font size.
 */
public class AttrSize extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoAttrSize";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.pango.Attribute.getMemoryLayout().withName("attr"),
            Interop.valueLayout.C_INT.withName("size"),
            Interop.valueLayout.C_INT.withName("absolute")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AttrSize}
     * @return A new, uninitialized @{link AttrSize}
     */
    public static AttrSize allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AttrSize newInstance = new AttrSize(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public int getSize() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code size}
     * @param size The new value of the field {@code size}
     */
    public void setSize(int size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
    }
    
    /**
     * Get the value of the field {@code absolute}
     * @return The value of the field {@code absolute}
     */
    public int getAbsolute() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("absolute"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code absolute}
     * @param absolute The new value of the field {@code absolute}
     */
    public void setAbsolute(int absolute) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("absolute"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), absolute);
    }
    
    /**
     * Create a AttrSize proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AttrSize(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AttrSize> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AttrSize(input, ownership);
    
    /**
     * Create a new font-size attribute in fractional points.
     * @param size the font size, in {@code PANGO_SCALE}-ths of a point
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static org.pango.Attribute new_(int size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_size_new.invokeExact(
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Attribute.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new font-size attribute in device units.
     * @param size the font size, in {@code PANGO_SCALE}-ths of a device unit
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static org.pango.Attribute newAbsolute(int size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_size_new_absolute.invokeExact(
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Attribute.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_attr_size_new = Interop.downcallHandle(
            "pango_attr_size_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_size_new_absolute = Interop.downcallHandle(
            "pango_attr_size_new_absolute",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
    
    /**
     * A {@link AttrSize.Builder} object constructs a {@link AttrSize} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AttrSize.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AttrSize struct;
        
        private Builder() {
            struct = AttrSize.allocate();
        }
        
         /**
         * Finish building the {@link AttrSize} struct.
         * @return A new instance of {@code AttrSize} with the fields 
         *         that were set in the Builder object.
         */
        public AttrSize build() {
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
         * size of font, in units of 1/{@code PANGO_SCALE} of a point (for
         *   {@link AttrType#SIZE}) or of a device unit (for {@link AttrType#ABSOLUTE_SIZE})
         * @param size The value for the {@code size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(int size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
            return this;
        }
        
        /**
         * whether the font size is in device units or points.
         *   This field is only present for compatibility with Pango-1.8.0
         *   ({@link AttrType#ABSOLUTE_SIZE} was added in 1.8.1); and always will
         *   be {@code false} for {@link AttrType#SIZE} and {@code true} for {@link AttrType#ABSOLUTE_SIZE}.
         * @param absolute The value for the {@code absolute} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAbsolute(int absolute) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("absolute"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), absolute);
            return this;
        }
    }
}
