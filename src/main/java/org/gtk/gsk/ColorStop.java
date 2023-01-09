package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A color stop in a gradient node.
 */
public class ColorStop extends Struct {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskColorStop";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_FLOAT.withName("offset"),
            MemoryLayout.paddingLayout(32),
            org.gtk.gdk.RGBA.getMemoryLayout().withName("color")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ColorStop}
     * @return A new, uninitialized @{link ColorStop}
     */
    public static ColorStop allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ColorStop newInstance = new ColorStop(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code offset}
     * @return The value of the field {@code offset}
     */
    public float getOffset() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (float) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code offset}
     * @param offset The new value of the field {@code offset}
     */
    public void setOffset(float offset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), offset);
        }
    }
    
    /**
     * Get the value of the field {@code color}
     * @return The value of the field {@code color}
     */
    public org.gtk.gdk.RGBA getColor() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("color"));
        return org.gtk.gdk.RGBA.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code color}
     * @param color The new value of the field {@code color}
     */
    public void setColor(org.gtk.gdk.RGBA color) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("color"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (color == null ? MemoryAddress.NULL : color.handle()));
        }
    }
    
    /**
     * Create a ColorStop proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ColorStop(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ColorStop> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ColorStop(input);
    
    /**
     * A {@link ColorStop.Builder} object constructs a {@link ColorStop} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ColorStop.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ColorStop struct;
        
        private Builder() {
            struct = ColorStop.allocate();
        }
        
        /**
         * Finish building the {@link ColorStop} struct.
         * @return A new instance of {@code ColorStop} with the fields 
         *         that were set in the Builder object.
         */
        public ColorStop build() {
            return struct;
        }
        
        /**
         * the offset of the color stop
         * @param offset The value for the {@code offset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOffset(float offset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), offset);
                return this;
            }
        }
        
        /**
         * the color at the given offset
         * @param color The value for the {@code color} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setColor(org.gtk.gdk.RGBA color) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("color"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (color == null ? MemoryAddress.NULL : color.handle()));
                return this;
            }
        }
    }
}
