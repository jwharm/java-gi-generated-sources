package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The shadow parameters in a shadow node.
 */
public class Shadow extends Struct {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskShadow";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gdk.RGBA.getMemoryLayout().withName("color"),
            Interop.valueLayout.C_FLOAT.withName("dx"),
            Interop.valueLayout.C_FLOAT.withName("dy"),
            Interop.valueLayout.C_FLOAT.withName("radius")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Shadow}
     * @return A new, uninitialized @{link Shadow}
     */
    public static Shadow allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Shadow newInstance = new Shadow(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
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
     * Get the value of the field {@code dx}
     * @return The value of the field {@code dx}
     */
    public float getDx() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (float) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dx"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code dx}
     * @param dx The new value of the field {@code dx}
     */
    public void setDx(float dx) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dx"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), dx);
        }
    }
    
    /**
     * Get the value of the field {@code dy}
     * @return The value of the field {@code dy}
     */
    public float getDy() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (float) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dy"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code dy}
     * @param dy The new value of the field {@code dy}
     */
    public void setDy(float dy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dy"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), dy);
        }
    }
    
    /**
     * Get the value of the field {@code radius}
     * @return The value of the field {@code radius}
     */
    public float getRadius() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (float) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("radius"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code radius}
     * @param radius The new value of the field {@code radius}
     */
    public void setRadius(float radius) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("radius"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), radius);
        }
    }
    
    /**
     * Create a Shadow proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Shadow(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Shadow> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Shadow(input);
    
    /**
     * A {@link Shadow.Builder} object constructs a {@link Shadow} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Shadow.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Shadow struct;
        
        private Builder() {
            struct = Shadow.allocate();
        }
        
        /**
         * Finish building the {@link Shadow} struct.
         * @return A new instance of {@code Shadow} with the fields 
         *         that were set in the Builder object.
         */
        public Shadow build() {
            return struct;
        }
        
        /**
         * the color of the shadow
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
        
        /**
         * the horizontal offset of the shadow
         * @param dx The value for the {@code dx} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDx(float dx) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dx"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), dx);
                return this;
            }
        }
        
        /**
         * the vertical offset of the shadow
         * @param dy The value for the {@code dy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDy(float dy) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dy"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), dy);
                return this;
            }
        }
        
        /**
         * the radius of the shadow
         * @param radius The value for the {@code radius} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRadius(float radius) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("radius"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), radius);
                return this;
            }
        }
    }
}
