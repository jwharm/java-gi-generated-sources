package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Opaque {@link ProxyControlBindingClass} struct
 */
public class ProxyControlBindingClass extends Struct {
    
    static {
        GstController.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstProxyControlBindingClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ControlBindingClass.getMemoryLayout().withName("parent_class"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ProxyControlBindingClass}
     * @return A new, uninitialized @{link ProxyControlBindingClass}
     */
    public static ProxyControlBindingClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ProxyControlBindingClass newInstance = new ProxyControlBindingClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ProxyControlBindingClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ProxyControlBindingClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ProxyControlBindingClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ProxyControlBindingClass(input, ownership);
    
    /**
     * A {@link ProxyControlBindingClass.Builder} object constructs a {@link ProxyControlBindingClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ProxyControlBindingClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ProxyControlBindingClass struct;
        
        private Builder() {
            struct = ProxyControlBindingClass.allocate();
        }
        
         /**
         * Finish building the {@link ProxyControlBindingClass} struct.
         * @return A new instance of {@code ProxyControlBindingClass} with the fields 
         *         that were set in the Builder object.
         */
        public ProxyControlBindingClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.gst.ControlBindingClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false)));
            return this;
        }
    }
}
