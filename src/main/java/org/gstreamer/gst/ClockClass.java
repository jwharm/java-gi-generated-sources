package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GStreamer clock class. Override the vmethods to implement the clock
 * functionality.
 */
public class ClockClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstClockClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("change_resolution"),
        Interop.valueLayout.ADDRESS.withName("get_resolution"),
        Interop.valueLayout.ADDRESS.withName("get_internal_time"),
        Interop.valueLayout.ADDRESS.withName("wait"),
        Interop.valueLayout.ADDRESS.withName("wait_async"),
        Interop.valueLayout.ADDRESS.withName("unschedule"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link ClockClass}
     * @return A new, uninitialized @{link ClockClass}
     */
    public static ClockClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ClockClass newInstance = new ClockClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.gst.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a ClockClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ClockClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ClockClass struct;
        
         /**
         * A {@link ClockClass.Build} object constructs a {@link ClockClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ClockClass.allocate();
        }
        
         /**
         * Finish building the {@link ClockClass} struct.
         * @return A new instance of {@code ClockClass} with the fields 
         *         that were set in the Build object.
         */
        public ClockClass construct() {
            return struct;
        }
        
        /**
         * the parent class structure
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setChangeResolution(java.lang.foreign.MemoryAddress changeResolution) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_resolution"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changeResolution == null ? MemoryAddress.NULL : changeResolution));
            return this;
        }
        
        public Build setGetResolution(java.lang.foreign.MemoryAddress getResolution) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_resolution"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getResolution == null ? MemoryAddress.NULL : getResolution));
            return this;
        }
        
        public Build setGetInternalTime(java.lang.foreign.MemoryAddress getInternalTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_internal_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getInternalTime == null ? MemoryAddress.NULL : getInternalTime));
            return this;
        }
        
        public Build setWait(java.lang.foreign.MemoryAddress wait_) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (wait_ == null ? MemoryAddress.NULL : wait_));
            return this;
        }
        
        public Build setWaitAsync(java.lang.foreign.MemoryAddress waitAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (waitAsync == null ? MemoryAddress.NULL : waitAsync));
            return this;
        }
        
        public Build setUnschedule(java.lang.foreign.MemoryAddress unschedule) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unschedule"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unschedule == null ? MemoryAddress.NULL : unschedule));
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
