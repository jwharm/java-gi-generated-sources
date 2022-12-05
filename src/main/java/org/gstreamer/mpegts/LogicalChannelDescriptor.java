package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class LogicalChannelDescriptor extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsLogicalChannelDescriptor";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("nb_channels"),
        MemoryLayout.paddingLayout(4064),
        MemoryLayout.sequenceLayout(64, org.gstreamer.mpegts.LogicalChannel.getMemoryLayout()).withName("channels")
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
     * Allocate a new {@link LogicalChannelDescriptor}
     * @return A new, uninitialized @{link LogicalChannelDescriptor}
     */
    public static LogicalChannelDescriptor allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        LogicalChannelDescriptor newInstance = new LogicalChannelDescriptor(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code nb_channels}
     * @return The value of the field {@code nb_channels}
     */
    public int nbChannels$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("nb_channels"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code nb_channels}
     * @param nbChannels The new value of the field {@code nb_channels}
     */
    public void nbChannels$set(int nbChannels) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("nb_channels"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nbChannels);
    }
    
    /**
     * Create a LogicalChannelDescriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public LogicalChannelDescriptor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private LogicalChannelDescriptor struct;
        
         /**
         * A {@link LogicalChannelDescriptor.Build} object constructs a {@link LogicalChannelDescriptor} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = LogicalChannelDescriptor.allocate();
        }
        
         /**
         * Finish building the {@link LogicalChannelDescriptor} struct.
         * @return A new instance of {@code LogicalChannelDescriptor} with the fields 
         *         that were set in the Build object.
         */
        public LogicalChannelDescriptor construct() {
            return struct;
        }
        
        public Build setNbChannels(int nbChannels) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nb_channels"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nbChannels);
            return this;
        }
        
        public Build setChannels(org.gstreamer.mpegts.LogicalChannel[] channels) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("channels"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (channels == null ? MemoryAddress.NULL : Interop.allocateNativeArray(channels, org.gstreamer.mpegts.LogicalChannel.getMemoryLayout(), false)));
            return this;
        }
    }
}
