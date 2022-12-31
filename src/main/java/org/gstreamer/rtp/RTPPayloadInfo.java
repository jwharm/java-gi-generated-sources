package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure holding default payload type information.
 */
public class RTPPayloadInfo extends Struct {
    
    static {
        GstRtp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPPayloadInfo";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_BYTE.withName("payload_type"),
            MemoryLayout.paddingLayout(56),
            Interop.valueLayout.ADDRESS.withName("media"),
            Interop.valueLayout.ADDRESS.withName("encoding_name"),
            Interop.valueLayout.C_INT.withName("clock_rate"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("encoding_parameters"),
            Interop.valueLayout.C_INT.withName("bitrate"),
            MemoryLayout.paddingLayout(160),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RTPPayloadInfo}
     * @return A new, uninitialized @{link RTPPayloadInfo}
     */
    public static RTPPayloadInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTPPayloadInfo newInstance = new RTPPayloadInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code payload_type}
     * @return The value of the field {@code payload_type}
     */
    public byte getPayloadType() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("payload_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code payload_type}
     * @param payloadType The new value of the field {@code payload_type}
     */
    public void setPayloadType(byte payloadType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("payload_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), payloadType);
    }
    
    /**
     * Get the value of the field {@code media}
     * @return The value of the field {@code media}
     */
    public java.lang.String getMedia() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("media"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code media}
     * @param media The new value of the field {@code media}
     */
    public void setMedia(java.lang.String media) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("media"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (media == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(media, null)));
    }
    
    /**
     * Get the value of the field {@code encoding_name}
     * @return The value of the field {@code encoding_name}
     */
    public java.lang.String getEncodingName() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("encoding_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code encoding_name}
     * @param encodingName The new value of the field {@code encoding_name}
     */
    public void setEncodingName(java.lang.String encodingName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("encoding_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (encodingName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(encodingName, null)));
    }
    
    /**
     * Get the value of the field {@code clock_rate}
     * @return The value of the field {@code clock_rate}
     */
    public int getClockRate() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("clock_rate"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code clock_rate}
     * @param clockRate The new value of the field {@code clock_rate}
     */
    public void setClockRate(int clockRate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("clock_rate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), clockRate);
    }
    
    /**
     * Get the value of the field {@code encoding_parameters}
     * @return The value of the field {@code encoding_parameters}
     */
    public java.lang.String getEncodingParameters() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("encoding_parameters"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code encoding_parameters}
     * @param encodingParameters The new value of the field {@code encoding_parameters}
     */
    public void setEncodingParameters(java.lang.String encodingParameters) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("encoding_parameters"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (encodingParameters == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(encodingParameters, null)));
    }
    
    /**
     * Get the value of the field {@code bitrate}
     * @return The value of the field {@code bitrate}
     */
    public int getBitrate() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bitrate"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bitrate}
     * @param bitrate The new value of the field {@code bitrate}
     */
    public void setBitrate(int bitrate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bitrate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bitrate);
    }
    
    /**
     * Create a RTPPayloadInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RTPPayloadInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTPPayloadInfo> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RTPPayloadInfo(input, ownership);
    
    /**
     * Get the {@link RTPPayloadInfo} for {@code media} and {@code encoding_name}. This function is
     * mostly used to get the default clock-rate and bandwidth for dynamic payload
     * types specified with {@code media} and {@code encoding} name.
     * <p>
     * The search for {@code encoding_name} will be performed in a case insensitive way.
     * @param media the media to find
     * @param encodingName the encoding name to find
     * @return a {@link RTPPayloadInfo} or NULL when no info could be found.
     */
    public static org.gstreamer.rtp.RTPPayloadInfo forName(java.lang.String media, java.lang.String encodingName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_payload_info_for_name.invokeExact(
                    Marshal.stringToAddress.marshal(media, null),
                    Marshal.stringToAddress.marshal(encodingName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtp.RTPPayloadInfo.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the {@link RTPPayloadInfo} for {@code payload_type}. This function is
     * mostly used to get the default clock-rate and bandwidth for static payload
     * types specified with {@code payload_type}.
     * @param payloadType the payload_type to find
     * @return a {@link RTPPayloadInfo} or NULL when no info could be found.
     */
    public static org.gstreamer.rtp.RTPPayloadInfo forPt(byte payloadType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_payload_info_for_pt.invokeExact(
                    payloadType);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtp.RTPPayloadInfo.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtp_payload_info_for_name = Interop.downcallHandle(
            "gst_rtp_payload_info_for_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_payload_info_for_pt = Interop.downcallHandle(
            "gst_rtp_payload_info_for_pt",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
            false
        );
    }
    
    /**
     * A {@link RTPPayloadInfo.Builder} object constructs a {@link RTPPayloadInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RTPPayloadInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RTPPayloadInfo struct;
        
        private Builder() {
            struct = RTPPayloadInfo.allocate();
        }
        
         /**
         * Finish building the {@link RTPPayloadInfo} struct.
         * @return A new instance of {@code RTPPayloadInfo} with the fields 
         *         that were set in the Builder object.
         */
        public RTPPayloadInfo build() {
            return struct;
        }
        
        /**
         * payload type, -1 means dynamic
         * @param payloadType The value for the {@code payloadType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPayloadType(byte payloadType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("payload_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), payloadType);
            return this;
        }
        
        /**
         * the media type(s), usually "audio", "video", "application", "text",
         * "message".
         * @param media The value for the {@code media} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMedia(java.lang.String media) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("media"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (media == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(media, null)));
            return this;
        }
        
        /**
         * the encoding name of {@code pt}
         * @param encodingName The value for the {@code encodingName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEncodingName(java.lang.String encodingName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("encoding_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (encodingName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(encodingName, null)));
            return this;
        }
        
        /**
         * default clock rate, 0 = unknown/variable
         * @param clockRate The value for the {@code clockRate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setClockRate(int clockRate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("clock_rate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), clockRate);
            return this;
        }
        
        /**
         * encoding parameters. For audio this is the number of
         * channels. NULL = not applicable.
         * @param encodingParameters The value for the {@code encodingParameters} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEncodingParameters(java.lang.String encodingParameters) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("encoding_parameters"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (encodingParameters == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(encodingParameters, null)));
            return this;
        }
        
        /**
         * the bitrate of the media. 0 = unknown/variable.
         * @param bitrate The value for the {@code bitrate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBitrate(int bitrate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bitrate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bitrate);
            return this;
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
