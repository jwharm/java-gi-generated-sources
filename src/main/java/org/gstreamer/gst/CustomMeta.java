package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Simple typing wrapper around {@link Meta}
 * @version 1.20
 */
public class CustomMeta extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstCustomMeta";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Meta.getMemoryLayout().withName("meta")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link CustomMeta}
     * @return A new, uninitialized @{link CustomMeta}
     */
    public static CustomMeta allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CustomMeta newInstance = new CustomMeta(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code meta}
     * @return The value of the field {@code meta}
     */
    public org.gstreamer.gst.Meta getMeta() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("meta"));
        return org.gstreamer.gst.Meta.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code meta}
     * @param meta The new value of the field {@code meta}
     */
    public void setMeta(org.gstreamer.gst.Meta meta) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("meta"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
    }
    
    /**
     * Create a CustomMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CustomMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CustomMeta> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CustomMeta(input, ownership);
    
    /**
     * Retrieve the {@link Structure} backing a custom meta, the structure's mutability
     * is conditioned to the writability of the {@link Buffer} {@code meta} is attached to.
     * @return the {@link Structure} backing {@code meta}
     */
    public org.gstreamer.gst.Structure getStructure() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_custom_meta_get_structure.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Checks whether the name of the custom meta is {@code name}
     * @return Whether {@code name} is the name of the custom meta
     */
    public boolean hasName(java.lang.String name) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_custom_meta_has_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_custom_meta_get_structure = Interop.downcallHandle(
            "gst_custom_meta_get_structure",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_custom_meta_has_name = Interop.downcallHandle(
            "gst_custom_meta_has_name",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link CustomMeta.Builder} object constructs a {@link CustomMeta} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link CustomMeta.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final CustomMeta struct;
        
        private Builder() {
            struct = CustomMeta.allocate();
        }
        
         /**
         * Finish building the {@link CustomMeta} struct.
         * @return A new instance of {@code CustomMeta} with the fields 
         *         that were set in the Builder object.
         */
        public CustomMeta build() {
            return struct;
        }
        
        public Builder setMeta(org.gstreamer.gst.Meta meta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
            return this;
        }
    }
}
