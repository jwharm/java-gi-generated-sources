package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AV1Dpb extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAV1Dpb";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("pic_list")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AV1Dpb}
     * @return A new, uninitialized @{link AV1Dpb}
     */
    public static AV1Dpb allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AV1Dpb newInstance = new AV1Dpb(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code pic_list}
     * @return The value of the field {@code pic_list}
     */
    public PointerProxy<org.gstreamer.codecs.AV1Picture> getPicList() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pic_list"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.codecs.AV1Picture>(RESULT, org.gstreamer.codecs.AV1Picture.fromAddress);
    }
    
    /**
     * Change the value of the field {@code pic_list}
     * @param picList The new value of the field {@code pic_list}
     */
    public void setPicList(org.gstreamer.codecs.AV1Picture[] picList) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pic_list"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (picList == null ? MemoryAddress.NULL : Interop.allocateNativeArray(picList, org.gstreamer.codecs.AV1Picture.getMemoryLayout(), false)));
    }
    
    /**
     * Create a AV1Dpb proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AV1Dpb(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AV1Dpb> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AV1Dpb(input, ownership);
    
    /**
     * Store the {@code picture}
     * @param picture a {@link AV1Picture}
     */
    public void add(org.gstreamer.codecs.AV1Picture picture) {
        try {
            DowncallHandles.gst_av1_dpb_add.invokeExact(
                    handle(),
                    picture.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        picture.yieldOwnership();
    }
    
    /**
     * Clear all stored {@link AV1Picture}
     */
    public void clear() {
        try {
            DowncallHandles.gst_av1_dpb_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Free the {@code dpb}
     */
    public void free() {
        try {
            DowncallHandles.gst_av1_dpb_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create new {@link AV1Dpb}
     * @return a new {@link AV1Dpb}
     */
    public static org.gstreamer.codecs.AV1Dpb new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_av1_dpb_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.codecs.AV1Dpb.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_av1_dpb_add = Interop.downcallHandle(
            "gst_av1_dpb_add",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_av1_dpb_clear = Interop.downcallHandle(
            "gst_av1_dpb_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_av1_dpb_free = Interop.downcallHandle(
            "gst_av1_dpb_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_av1_dpb_new = Interop.downcallHandle(
            "gst_av1_dpb_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link AV1Dpb.Builder} object constructs a {@link AV1Dpb} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AV1Dpb.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AV1Dpb struct;
        
        private Builder() {
            struct = AV1Dpb.allocate();
        }
        
         /**
         * Finish building the {@link AV1Dpb} struct.
         * @return A new instance of {@code AV1Dpb} with the fields 
         *         that were set in the Builder object.
         */
        public AV1Dpb build() {
            return struct;
        }
        
        public Builder setPicList(org.gstreamer.codecs.AV1Picture[] picList) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pic_list"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (picList == null ? MemoryAddress.NULL : Interop.allocateNativeArray(picList, org.gstreamer.codecs.AV1Picture.getMemoryLayout(), false)));
            return this;
        }
    }
}
