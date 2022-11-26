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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gdk.RGBA.getMemoryLayout().withName("color"),
        Interop.valueLayout.C_FLOAT.withName("dx"),
        Interop.valueLayout.C_FLOAT.withName("dy"),
        Interop.valueLayout.C_FLOAT.withName("radius")
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
     * Allocate a new {@link Shadow}
     * @return A new, uninitialized @{link Shadow}
     */
    public static Shadow allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Shadow newInstance = new Shadow(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code color}
     * @return The value of the field {@code color}
     */
    public org.gtk.gdk.RGBA color$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("color"));
        return new org.gtk.gdk.RGBA(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code dx}
     * @return The value of the field {@code dx}
     */
    public float dx$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dx"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code dx}
     * @param dx The new value of the field {@code dx}
     */
    public void dx$set(float dx) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dx"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), dx);
    }
    
    /**
     * Get the value of the field {@code dy}
     * @return The value of the field {@code dy}
     */
    public float dy$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code dy}
     * @param dy The new value of the field {@code dy}
     */
    public void dy$set(float dy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), dy);
    }
    
    /**
     * Get the value of the field {@code radius}
     * @return The value of the field {@code radius}
     */
    public float radius$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("radius"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code radius}
     * @param radius The new value of the field {@code radius}
     */
    public void radius$set(float radius) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("radius"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), radius);
    }
    
    /**
     * Create a Shadow proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Shadow(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Shadow struct;
        
         /**
         * A {@link Shadow.Build} object constructs a {@link Shadow} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Shadow.allocate();
        }
        
         /**
         * Finish building the {@link Shadow} struct.
         * @return A new instance of {@code Shadow} with the fields 
         *         that were set in the Build object.
         */
        public Shadow construct() {
            return struct;
        }
        
        /**
         * the color of the shadow
         * @param color The value for the {@code color} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setColor(org.gtk.gdk.RGBA color) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("color"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (color == null ? MemoryAddress.NULL : color.handle()));
            return this;
        }
        
        /**
         * the horizontal offset of the shadow
         * @param dx The value for the {@code dx} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDx(float dx) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dx"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dx);
            return this;
        }
        
        /**
         * the vertical offset of the shadow
         * @param dy The value for the {@code dy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDy(float dy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dy);
            return this;
        }
        
        /**
         * the radius of the shadow
         * @param radius The value for the {@code radius} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRadius(float radius) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("radius"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), radius);
            return this;
        }
    }
}
