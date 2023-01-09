package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A time indication.
 */
public class RTSPTime extends Struct {
    
    static {
        GstRtsp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPTime";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("type"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.C_DOUBLE.withName("seconds")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RTSPTime}
     * @return A new, uninitialized @{link RTSPTime}
     */
    public static RTSPTime allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RTSPTime newInstance = new RTSPTime(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gstreamer.rtsp.RTSPTimeType getType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.rtsp.RTSPTimeType.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(org.gstreamer.rtsp.RTSPTimeType type) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code seconds}
     * @return The value of the field {@code seconds}
     */
    public double getSeconds() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (double) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seconds"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code seconds}
     * @param seconds The new value of the field {@code seconds}
     */
    public void setSeconds(double seconds) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seconds"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), seconds);
        }
    }
    
    /**
     * Create a RTSPTime proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RTSPTime(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTSPTime> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RTSPTime(input);
    
    /**
     * A {@link RTSPTime.Builder} object constructs a {@link RTSPTime} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RTSPTime.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RTSPTime struct;
        
        private Builder() {
            struct = RTSPTime.allocate();
        }
        
        /**
         * Finish building the {@link RTSPTime} struct.
         * @return A new instance of {@code RTSPTime} with the fields 
         *         that were set in the Builder object.
         */
        public RTSPTime build() {
            return struct;
        }
        
        /**
         * the time of the time
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(org.gstreamer.rtsp.RTSPTimeType type) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
                return this;
            }
        }
        
        /**
         * seconds when {@code type} is GST_RTSP_TIME_SECONDS,
         *           GST_RTSP_TIME_UTC and GST_RTSP_TIME_FRAMES
         * @param seconds The value for the {@code seconds} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSeconds(double seconds) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("seconds"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), seconds);
                return this;
            }
        }
    }
}
