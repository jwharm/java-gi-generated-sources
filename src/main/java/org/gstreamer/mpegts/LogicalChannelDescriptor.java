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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("nb_channels"),
            MemoryLayout.paddingLayout(4064),
            MemoryLayout.sequenceLayout(64, org.gstreamer.mpegts.LogicalChannel.getMemoryLayout()).withName("channels")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link LogicalChannelDescriptor}
     * @return A new, uninitialized @{link LogicalChannelDescriptor}
     */
    public static LogicalChannelDescriptor allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        LogicalChannelDescriptor newInstance = new LogicalChannelDescriptor(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code nb_channels}
     * @return The value of the field {@code nb_channels}
     */
    public int getNbChannels() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nb_channels"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code nb_channels}
     * @param nbChannels The new value of the field {@code nb_channels}
     */
    public void setNbChannels(int nbChannels) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nb_channels"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), nbChannels);
        }
    }
    
    /**
     * Get the value of the field {@code channels}
     * @return The value of the field {@code channels}
     */
    public org.gstreamer.mpegts.LogicalChannel[] getChannels() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("channels"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gstreamer.mpegts.LogicalChannel>(RESULT, org.gstreamer.mpegts.LogicalChannel.fromAddress).toArray((int) 64, org.gstreamer.mpegts.LogicalChannel.class);
        }
    }
    
    /**
     * Change the value of the field {@code channels}
     * @param channels The new value of the field {@code channels}
     */
    public void setChannels(org.gstreamer.mpegts.LogicalChannel[] channels) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("channels"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (channels == null ? MemoryAddress.NULL : Interop.allocateNativeArray(channels, org.gstreamer.mpegts.LogicalChannel.getMemoryLayout(), false, SCOPE)));
        }
    }
    
    /**
     * Create a LogicalChannelDescriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected LogicalChannelDescriptor(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, LogicalChannelDescriptor> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new LogicalChannelDescriptor(input);
    
    /**
     * A {@link LogicalChannelDescriptor.Builder} object constructs a {@link LogicalChannelDescriptor} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link LogicalChannelDescriptor.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final LogicalChannelDescriptor struct;
        
        private Builder() {
            struct = LogicalChannelDescriptor.allocate();
        }
        
        /**
         * Finish building the {@link LogicalChannelDescriptor} struct.
         * @return A new instance of {@code LogicalChannelDescriptor} with the fields 
         *         that were set in the Builder object.
         */
        public LogicalChannelDescriptor build() {
            return struct;
        }
        
        public Builder setNbChannels(int nbChannels) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("nb_channels"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), nbChannels);
                return this;
            }
        }
        
        public Builder setChannels(org.gstreamer.mpegts.LogicalChannel[] channels) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("channels"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (channels == null ? MemoryAddress.NULL : Interop.allocateNativeArray(channels, org.gstreamer.mpegts.LogicalChannel.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
    }
}
