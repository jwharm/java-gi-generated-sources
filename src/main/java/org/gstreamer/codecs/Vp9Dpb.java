package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Vp9Dpb extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVp9Dpb";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("pic_list")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Vp9Dpb}
     * @return A new, uninitialized @{link Vp9Dpb}
     */
    public static Vp9Dpb allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Vp9Dpb newInstance = new Vp9Dpb(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code pic_list}
     * @return The value of the field {@code pic_list}
     */
    public org.gstreamer.codecs.Vp9Picture[] getPicList() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pic_list"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.codecs.Vp9Picture>(RESULT, org.gstreamer.codecs.Vp9Picture.fromAddress).toArray((int) 8, org.gstreamer.codecs.Vp9Picture.class);
    }
    
    /**
     * Change the value of the field {@code pic_list}
     * @param picList The new value of the field {@code pic_list}
     */
    public void setPicList(org.gstreamer.codecs.Vp9Picture[] picList) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pic_list"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (picList == null ? MemoryAddress.NULL : Interop.allocateNativeArray(picList, org.gstreamer.codecs.Vp9Picture.getMemoryLayout(), false)));
    }
    
    /**
     * Create a Vp9Dpb proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Vp9Dpb(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Vp9Dpb> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Vp9Dpb(input, ownership);
    
    /**
     * Store the {@code picture}
     * @param picture a {@link Vp9Picture}
     */
    public void add(org.gstreamer.codecs.Vp9Picture picture) {
        try {
            DowncallHandles.gst_vp9_dpb_add.invokeExact(
                    handle(),
                    picture.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        picture.yieldOwnership();
    }
    
    /**
     * Clear all stored {@link Vp9Picture}
     */
    public void clear() {
        try {
            DowncallHandles.gst_vp9_dpb_clear.invokeExact(
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
            DowncallHandles.gst_vp9_dpb_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create new {@link Vp9Dpb}
     * @return a new {@link Vp9Dpb}
     */
    public static org.gstreamer.codecs.Vp9Dpb new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vp9_dpb_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.codecs.Vp9Dpb.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vp9_dpb_add = Interop.downcallHandle(
            "gst_vp9_dpb_add",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vp9_dpb_clear = Interop.downcallHandle(
            "gst_vp9_dpb_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vp9_dpb_free = Interop.downcallHandle(
            "gst_vp9_dpb_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vp9_dpb_new = Interop.downcallHandle(
            "gst_vp9_dpb_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link Vp9Dpb.Builder} object constructs a {@link Vp9Dpb} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Vp9Dpb.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Vp9Dpb struct;
        
        private Builder() {
            struct = Vp9Dpb.allocate();
        }
        
         /**
         * Finish building the {@link Vp9Dpb} struct.
         * @return A new instance of {@code Vp9Dpb} with the fields 
         *         that were set in the Builder object.
         */
        public Vp9Dpb build() {
            return struct;
        }
        
        public Builder setPicList(org.gstreamer.codecs.Vp9Picture[] picList) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pic_list"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (picList == null ? MemoryAddress.NULL : Interop.allocateNativeArray(picList, org.gstreamer.codecs.Vp9Picture.getMemoryLayout(), false)));
            return this;
        }
    }
}
