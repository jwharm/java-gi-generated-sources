package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides helper functions to deal with RTSP transport strings.
 */
public class RTSPTransport extends Struct {
    
    static {
        GstRtsp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPTransport";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("trans"),
            Interop.valueLayout.C_INT.withName("profile"),
            Interop.valueLayout.C_INT.withName("lower_transport"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("destination"),
            Interop.valueLayout.ADDRESS.withName("source"),
            Interop.valueLayout.C_INT.withName("layers"),
            Interop.valueLayout.C_INT.withName("mode_play"),
            Interop.valueLayout.C_INT.withName("mode_record"),
            Interop.valueLayout.C_INT.withName("append"),
            org.gstreamer.rtsp.RTSPRange.getMemoryLayout().withName("interleaved"),
            Interop.valueLayout.C_INT.withName("ttl"),
            MemoryLayout.paddingLayout(32),
            org.gstreamer.rtsp.RTSPRange.getMemoryLayout().withName("port"),
            org.gstreamer.rtsp.RTSPRange.getMemoryLayout().withName("client_port"),
            org.gstreamer.rtsp.RTSPRange.getMemoryLayout().withName("server_port"),
            Interop.valueLayout.C_INT.withName("ssrc"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RTSPTransport}
     * @return A new, uninitialized @{link RTSPTransport}
     */
    public static RTSPTransport allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTSPTransport newInstance = new RTSPTransport(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code trans}
     * @return The value of the field {@code trans}
     */
    public org.gstreamer.rtsp.RTSPTransMode getTrans() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("trans"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.rtsp.RTSPTransMode(RESULT);
    }
    
    /**
     * Change the value of the field {@code trans}
     * @param trans The new value of the field {@code trans}
     */
    public void setTrans(org.gstreamer.rtsp.RTSPTransMode trans) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("trans"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (trans == null ? MemoryAddress.NULL : trans.getValue()));
    }
    
    /**
     * Get the value of the field {@code profile}
     * @return The value of the field {@code profile}
     */
    public org.gstreamer.rtsp.RTSPProfile getProfile() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("profile"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.rtsp.RTSPProfile(RESULT);
    }
    
    /**
     * Change the value of the field {@code profile}
     * @param profile The new value of the field {@code profile}
     */
    public void setProfile(org.gstreamer.rtsp.RTSPProfile profile) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("profile"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (profile == null ? MemoryAddress.NULL : profile.getValue()));
    }
    
    /**
     * Get the value of the field {@code lower_transport}
     * @return The value of the field {@code lower_transport}
     */
    public org.gstreamer.rtsp.RTSPLowerTrans getLowerTransport() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lower_transport"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.rtsp.RTSPLowerTrans(RESULT);
    }
    
    /**
     * Change the value of the field {@code lower_transport}
     * @param lowerTransport The new value of the field {@code lower_transport}
     */
    public void setLowerTransport(org.gstreamer.rtsp.RTSPLowerTrans lowerTransport) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lower_transport"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lowerTransport == null ? MemoryAddress.NULL : lowerTransport.getValue()));
    }
    
    /**
     * Get the value of the field {@code destination}
     * @return The value of the field {@code destination}
     */
    public java.lang.String getDestination() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("destination"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code destination}
     * @param destination The new value of the field {@code destination}
     */
    public void setDestination(java.lang.String destination) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("destination"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (destination == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(destination, null)));
    }
    
    /**
     * Get the value of the field {@code source}
     * @return The value of the field {@code source}
     */
    public java.lang.String getSource() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("source"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code source}
     * @param source The new value of the field {@code source}
     */
    public void setSource(java.lang.String source) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("source"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (source == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(source, null)));
    }
    
    /**
     * Get the value of the field {@code layers}
     * @return The value of the field {@code layers}
     */
    public int getLayers() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("layers"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code layers}
     * @param layers The new value of the field {@code layers}
     */
    public void setLayers(int layers) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("layers"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), layers);
    }
    
    /**
     * Get the value of the field {@code mode_play}
     * @return The value of the field {@code mode_play}
     */
    public boolean getModePlay() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mode_play"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code mode_play}
     * @param modePlay The new value of the field {@code mode_play}
     */
    public void setModePlay(boolean modePlay) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mode_play"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(modePlay, null).intValue());
    }
    
    /**
     * Get the value of the field {@code mode_record}
     * @return The value of the field {@code mode_record}
     */
    public boolean getModeRecord() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mode_record"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code mode_record}
     * @param modeRecord The new value of the field {@code mode_record}
     */
    public void setModeRecord(boolean modeRecord) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mode_record"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(modeRecord, null).intValue());
    }
    
    /**
     * Get the value of the field {@code append}
     * @return The value of the field {@code append}
     */
    public boolean getAppend() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("append"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code append}
     * @param append The new value of the field {@code append}
     */
    public void setAppend(boolean append) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("append"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(append, null).intValue());
    }
    
    /**
     * Get the value of the field {@code interleaved}
     * @return The value of the field {@code interleaved}
     */
    public org.gstreamer.rtsp.RTSPRange getInterleaved() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("interleaved"));
        return org.gstreamer.rtsp.RTSPRange.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code interleaved}
     * @param interleaved The new value of the field {@code interleaved}
     */
    public void setInterleaved(org.gstreamer.rtsp.RTSPRange interleaved) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("interleaved"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interleaved == null ? MemoryAddress.NULL : interleaved.handle()));
    }
    
    /**
     * Get the value of the field {@code ttl}
     * @return The value of the field {@code ttl}
     */
    public int getTtl() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ttl"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code ttl}
     * @param ttl The new value of the field {@code ttl}
     */
    public void setTtl(int ttl) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ttl"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), ttl);
    }
    
    /**
     * Get the value of the field {@code port}
     * @return The value of the field {@code port}
     */
    public org.gstreamer.rtsp.RTSPRange getPort() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("port"));
        return org.gstreamer.rtsp.RTSPRange.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code port}
     * @param port The new value of the field {@code port}
     */
    public void setPort(org.gstreamer.rtsp.RTSPRange port) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("port"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (port == null ? MemoryAddress.NULL : port.handle()));
    }
    
    /**
     * Get the value of the field {@code client_port}
     * @return The value of the field {@code client_port}
     */
    public org.gstreamer.rtsp.RTSPRange getClientPort() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("client_port"));
        return org.gstreamer.rtsp.RTSPRange.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code client_port}
     * @param clientPort The new value of the field {@code client_port}
     */
    public void setClientPort(org.gstreamer.rtsp.RTSPRange clientPort) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("client_port"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (clientPort == null ? MemoryAddress.NULL : clientPort.handle()));
    }
    
    /**
     * Get the value of the field {@code server_port}
     * @return The value of the field {@code server_port}
     */
    public org.gstreamer.rtsp.RTSPRange getServerPort() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("server_port"));
        return org.gstreamer.rtsp.RTSPRange.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code server_port}
     * @param serverPort The new value of the field {@code server_port}
     */
    public void setServerPort(org.gstreamer.rtsp.RTSPRange serverPort) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("server_port"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (serverPort == null ? MemoryAddress.NULL : serverPort.handle()));
    }
    
    /**
     * Get the value of the field {@code ssrc}
     * @return The value of the field {@code ssrc}
     */
    public int getSsrc() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ssrc"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code ssrc}
     * @param ssrc The new value of the field {@code ssrc}
     */
    public void setSsrc(int ssrc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ssrc"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), ssrc);
    }
    
    /**
     * Create a RTSPTransport proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RTSPTransport(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTSPTransport> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RTSPTransport(input, ownership);
    
    /**
     * Convert {@code transport} into a string that can be used to signal the transport in
     * an RTSP SETUP response.
     * @return a string describing the RTSP transport or {@code null} when the transport
     * is invalid.
     */
    public java.lang.String asText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_transport_as_text.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Free the memory used by {@code transport}.
     * @return {@code GST_RTSP_OK}.
     */
    public org.gstreamer.rtsp.RTSPResult free() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_transport_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Get the media type of {@code transport}. This media type is typically
     * used to generate {@link org.gstreamer.gst.Caps} events.
     * @param mediaType media type of {@code transport}
     * @return {@code GST_RTSP_OK}.
     */
    public org.gstreamer.rtsp.RTSPResult getMediaType(Out<java.lang.String> mediaType) {
        MemorySegment mediaTypePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_transport_get_media_type.invokeExact(
                    handle(),
                    (Addressable) mediaTypePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        mediaType.set(Marshal.addressToString.marshal(mediaTypePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Initialize {@code transport} so that it can be used.
     * @return {@code GST_RTSP_OK}.
     */
    public org.gstreamer.rtsp.RTSPResult init() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_transport_init.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Get the {@link org.gstreamer.gst.Element} that can handle the buffers transported over {@code trans}.
     * <p>
     * It is possible that there are several managers available, use {@code option} to
     * selected one.
     * <p>
     * {@code manager} will contain an element name or {@code null} when no manager is
     * needed/available for {@code trans}.
     * @param trans a {@link RTSPTransMode}
     * @param manager location to hold the result
     * @param option option index.
     * @return {@code GST_RTSP_OK}.
     */
    public static org.gstreamer.rtsp.RTSPResult getManager(org.gstreamer.rtsp.RTSPTransMode trans, @Nullable Out<java.lang.String> manager, int option) {
        MemorySegment managerPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_transport_get_manager.invokeExact(
                    trans.getValue(),
                    (Addressable) (manager == null ? MemoryAddress.NULL : (Addressable) managerPOINTER.address()),
                    option);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (manager != null) manager.set(Marshal.addressToString.marshal(managerPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Get the mime type of the transport mode {@code trans}. This mime type is typically
     * used to generate {@link org.gstreamer.gst.Caps} events.
     * @param trans a {@link RTSPTransMode}
     * @param mime location to hold the result
     * @return {@code GST_RTSP_OK}.
     * @deprecated This functions only deals with the GstRTSPTransMode and only
     *    returns the mime type for {@code GST_RTSP_PROFILE_AVP}. Use
     *    gst_rtsp_transport_get_media_type() instead.
     */
    @Deprecated
    public static org.gstreamer.rtsp.RTSPResult getMime(org.gstreamer.rtsp.RTSPTransMode trans, PointerString mime) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_transport_get_mime.invokeExact(
                    trans.getValue(),
                    mime.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Allocate a new initialized {@link RTSPTransport}. Use gst_rtsp_transport_free()
     * after usage.
     * @param transport location to hold the new {@link RTSPTransport}
     * @return a {@link RTSPResult}.
     */
    public static org.gstreamer.rtsp.RTSPResult new_(PointerProxy<org.gstreamer.rtsp.RTSPTransport> transport) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_transport_new.invokeExact(
                    transport.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Parse the RTSP transport string {@code str} into {@code transport}.
     * @param str a transport string
     * @param transport a {@link RTSPTransport}
     * @return a {@link RTSPResult}.
     */
    public static org.gstreamer.rtsp.RTSPResult parse(java.lang.String str, org.gstreamer.rtsp.RTSPTransport transport) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_transport_parse.invokeExact(
                    Marshal.stringToAddress.marshal(str, null),
                    transport.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtsp_transport_as_text = Interop.downcallHandle(
            "gst_rtsp_transport_as_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_transport_free = Interop.downcallHandle(
            "gst_rtsp_transport_free",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_transport_get_media_type = Interop.downcallHandle(
            "gst_rtsp_transport_get_media_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_transport_init = Interop.downcallHandle(
            "gst_rtsp_transport_init",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_transport_get_manager = Interop.downcallHandle(
            "gst_rtsp_transport_get_manager",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_transport_get_mime = Interop.downcallHandle(
            "gst_rtsp_transport_get_mime",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_transport_new = Interop.downcallHandle(
            "gst_rtsp_transport_new",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_transport_parse = Interop.downcallHandle(
            "gst_rtsp_transport_parse",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link RTSPTransport.Builder} object constructs a {@link RTSPTransport} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RTSPTransport.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RTSPTransport struct;
        
        private Builder() {
            struct = RTSPTransport.allocate();
        }
        
         /**
         * Finish building the {@link RTSPTransport} struct.
         * @return A new instance of {@code RTSPTransport} with the fields 
         *         that were set in the Builder object.
         */
        public RTSPTransport build() {
            return struct;
        }
        
        /**
         * the transport mode
         * @param trans The value for the {@code trans} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTrans(org.gstreamer.rtsp.RTSPTransMode trans) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("trans"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (trans == null ? MemoryAddress.NULL : trans.getValue()));
            return this;
        }
        
        /**
         * the tansport profile
         * @param profile The value for the {@code profile} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setProfile(org.gstreamer.rtsp.RTSPProfile profile) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("profile"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (profile == null ? MemoryAddress.NULL : profile.getValue()));
            return this;
        }
        
        /**
         * the lower transport
         * @param lowerTransport The value for the {@code lowerTransport} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLowerTransport(org.gstreamer.rtsp.RTSPLowerTrans lowerTransport) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lower_transport"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lowerTransport == null ? MemoryAddress.NULL : lowerTransport.getValue()));
            return this;
        }
        
        /**
         * the destination ip/hostname
         * @param destination The value for the {@code destination} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDestination(java.lang.String destination) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("destination"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (destination == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(destination, null)));
            return this;
        }
        
        /**
         * the source ip/hostname
         * @param source The value for the {@code source} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSource(java.lang.String source) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("source"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (source == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(source, null)));
            return this;
        }
        
        /**
         * the number of layers
         * @param layers The value for the {@code layers} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLayers(int layers) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("layers"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), layers);
            return this;
        }
        
        /**
         * if play mode was selected
         * @param modePlay The value for the {@code modePlay} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModePlay(boolean modePlay) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mode_play"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(modePlay, null).intValue());
            return this;
        }
        
        /**
         * if record mode was selected
         * @param modeRecord The value for the {@code modeRecord} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModeRecord(boolean modeRecord) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mode_record"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(modeRecord, null).intValue());
            return this;
        }
        
        /**
         * is append mode was selected
         * @param append The value for the {@code append} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAppend(boolean append) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("append"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(append, null).intValue());
            return this;
        }
        
        /**
         * the interleave range
         * @param interleaved The value for the {@code interleaved} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInterleaved(org.gstreamer.rtsp.RTSPRange interleaved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interleaved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interleaved == null ? MemoryAddress.NULL : interleaved.handle()));
            return this;
        }
        
        /**
         * the time to live for multicast UDP
         * @param ttl The value for the {@code ttl} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTtl(int ttl) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ttl"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), ttl);
            return this;
        }
        
        /**
         * the port pair for multicast sessions
         * @param port The value for the {@code port} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPort(org.gstreamer.rtsp.RTSPRange port) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("port"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (port == null ? MemoryAddress.NULL : port.handle()));
            return this;
        }
        
        /**
         * the client port pair for receiving data. For TCP
         *   based transports, applications can use this field to store the
         *   sender and receiver ports of the client.
         * @param clientPort The value for the {@code clientPort} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setClientPort(org.gstreamer.rtsp.RTSPRange clientPort) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("client_port"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (clientPort == null ? MemoryAddress.NULL : clientPort.handle()));
            return this;
        }
        
        /**
         * the server port pair for receiving data. For TCP
         *   based transports, applications can use this field to store the
         *   sender and receiver ports of the server.
         * @param serverPort The value for the {@code serverPort} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setServerPort(org.gstreamer.rtsp.RTSPRange serverPort) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("server_port"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (serverPort == null ? MemoryAddress.NULL : serverPort.handle()));
            return this;
        }
        
        /**
         * the ssrc that the sender/receiver will use
         * @param ssrc The value for the {@code ssrc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSsrc(int ssrc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ssrc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), ssrc);
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
