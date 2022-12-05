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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    public org.gstreamer.rtsp.RTSPTransMode trans$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("trans"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.rtsp.RTSPTransMode(RESULT);
    }
    
    /**
     * Change the value of the field {@code trans}
     * @param trans The new value of the field {@code trans}
     */
    public void trans$set(org.gstreamer.rtsp.RTSPTransMode trans) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("trans"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), trans.getValue());
    }
    
    /**
     * Get the value of the field {@code profile}
     * @return The value of the field {@code profile}
     */
    public org.gstreamer.rtsp.RTSPProfile profile$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("profile"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.rtsp.RTSPProfile(RESULT);
    }
    
    /**
     * Change the value of the field {@code profile}
     * @param profile The new value of the field {@code profile}
     */
    public void profile$set(org.gstreamer.rtsp.RTSPProfile profile) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("profile"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), profile.getValue());
    }
    
    /**
     * Get the value of the field {@code lower_transport}
     * @return The value of the field {@code lower_transport}
     */
    public org.gstreamer.rtsp.RTSPLowerTrans lowerTransport$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lower_transport"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.rtsp.RTSPLowerTrans(RESULT);
    }
    
    /**
     * Change the value of the field {@code lower_transport}
     * @param lowerTransport The new value of the field {@code lower_transport}
     */
    public void lowerTransport$set(org.gstreamer.rtsp.RTSPLowerTrans lowerTransport) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lower_transport"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), lowerTransport.getValue());
    }
    
    /**
     * Get the value of the field {@code destination}
     * @return The value of the field {@code destination}
     */
    public java.lang.String destination$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("destination"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code destination}
     * @param destination The new value of the field {@code destination}
     */
    public void destination$set(java.lang.String destination) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("destination"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(destination));
    }
    
    /**
     * Get the value of the field {@code source}
     * @return The value of the field {@code source}
     */
    public java.lang.String source$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("source"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code source}
     * @param source The new value of the field {@code source}
     */
    public void source$set(java.lang.String source) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("source"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(source));
    }
    
    /**
     * Get the value of the field {@code layers}
     * @return The value of the field {@code layers}
     */
    public int layers$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("layers"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code layers}
     * @param layers The new value of the field {@code layers}
     */
    public void layers$set(int layers) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("layers"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), layers);
    }
    
    /**
     * Get the value of the field {@code mode_play}
     * @return The value of the field {@code mode_play}
     */
    public boolean modePlay$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mode_play"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code mode_play}
     * @param modePlay The new value of the field {@code mode_play}
     */
    public void modePlay$set(boolean modePlay) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mode_play"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), modePlay ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code mode_record}
     * @return The value of the field {@code mode_record}
     */
    public boolean modeRecord$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mode_record"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code mode_record}
     * @param modeRecord The new value of the field {@code mode_record}
     */
    public void modeRecord$set(boolean modeRecord) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mode_record"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), modeRecord ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code append}
     * @return The value of the field {@code append}
     */
    public boolean append$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("append"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code append}
     * @param append The new value of the field {@code append}
     */
    public void append$set(boolean append) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("append"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), append ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code interleaved}
     * @return The value of the field {@code interleaved}
     */
    public org.gstreamer.rtsp.RTSPRange interleaved$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("interleaved"));
        return new org.gstreamer.rtsp.RTSPRange(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code ttl}
     * @return The value of the field {@code ttl}
     */
    public int ttl$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ttl"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code ttl}
     * @param ttl The new value of the field {@code ttl}
     */
    public void ttl$set(int ttl) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ttl"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), ttl);
    }
    
    /**
     * Get the value of the field {@code port}
     * @return The value of the field {@code port}
     */
    public org.gstreamer.rtsp.RTSPRange port$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("port"));
        return new org.gstreamer.rtsp.RTSPRange(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code client_port}
     * @return The value of the field {@code client_port}
     */
    public org.gstreamer.rtsp.RTSPRange clientPort$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("client_port"));
        return new org.gstreamer.rtsp.RTSPRange(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code server_port}
     * @return The value of the field {@code server_port}
     */
    public org.gstreamer.rtsp.RTSPRange serverPort$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("server_port"));
        return new org.gstreamer.rtsp.RTSPRange(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code ssrc}
     * @return The value of the field {@code ssrc}
     */
    public int ssrc$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ssrc"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code ssrc}
     * @param ssrc The new value of the field {@code ssrc}
     */
    public void ssrc$set(int ssrc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ssrc"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), ssrc);
    }
    
    /**
     * Create a RTSPTransport proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RTSPTransport(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Convert {@code transport} into a string that can be used to signal the transport in
     * an RTSP SETUP response.
     * @return a string describing the RTSP transport or {@code null} when the transport
     * is invalid.
     */
    public @NotNull java.lang.String asText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_transport_as_text.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Free the memory used by {@code transport}.
     * @return {@code GST_RTSP_OK}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult free() {
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
    public @NotNull org.gstreamer.rtsp.RTSPResult getMediaType(@NotNull Out<java.lang.String> mediaType) {
        java.util.Objects.requireNonNull(mediaType, "Parameter 'mediaType' must not be null");
        MemorySegment mediaTypePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_transport_get_media_type.invokeExact(
                    handle(),
                    (Addressable) mediaTypePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        mediaType.set(Interop.getStringFrom(mediaTypePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Initialize {@code transport} so that it can be used.
     * @return {@code GST_RTSP_OK}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult init() {
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
    public static @NotNull org.gstreamer.rtsp.RTSPResult getManager(@NotNull org.gstreamer.rtsp.RTSPTransMode trans, @Nullable Out<java.lang.String> manager, int option) {
        java.util.Objects.requireNonNull(trans, "Parameter 'trans' must not be null");
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
        if (manager != null) manager.set(Interop.getStringFrom(managerPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
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
    public static @NotNull org.gstreamer.rtsp.RTSPResult getMime(@NotNull org.gstreamer.rtsp.RTSPTransMode trans, @NotNull PointerString mime) {
        java.util.Objects.requireNonNull(trans, "Parameter 'trans' must not be null");
        java.util.Objects.requireNonNull(mime, "Parameter 'mime' must not be null");
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
    public static @NotNull org.gstreamer.rtsp.RTSPResult new_(@NotNull PointerProxy<org.gstreamer.rtsp.RTSPTransport> transport) {
        java.util.Objects.requireNonNull(transport, "Parameter 'transport' must not be null");
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
    public static @NotNull org.gstreamer.rtsp.RTSPResult parse(@NotNull java.lang.String str, @NotNull org.gstreamer.rtsp.RTSPTransport transport) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        java.util.Objects.requireNonNull(transport, "Parameter 'transport' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_transport_parse.invokeExact(
                    Interop.allocateNativeString(str),
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private RTSPTransport struct;
        
         /**
         * A {@link RTSPTransport.Build} object constructs a {@link RTSPTransport} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = RTSPTransport.allocate();
        }
        
         /**
         * Finish building the {@link RTSPTransport} struct.
         * @return A new instance of {@code RTSPTransport} with the fields 
         *         that were set in the Build object.
         */
        public RTSPTransport construct() {
            return struct;
        }
        
        /**
         * the transport mode
         * @param trans The value for the {@code trans} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTrans(org.gstreamer.rtsp.RTSPTransMode trans) {
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
        public Build setProfile(org.gstreamer.rtsp.RTSPProfile profile) {
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
        public Build setLowerTransport(org.gstreamer.rtsp.RTSPLowerTrans lowerTransport) {
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
        public Build setDestination(java.lang.String destination) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("destination"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (destination == null ? MemoryAddress.NULL : Interop.allocateNativeString(destination)));
            return this;
        }
        
        /**
         * the source ip/hostname
         * @param source The value for the {@code source} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSource(java.lang.String source) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("source"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (source == null ? MemoryAddress.NULL : Interop.allocateNativeString(source)));
            return this;
        }
        
        /**
         * the number of layers
         * @param layers The value for the {@code layers} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLayers(int layers) {
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
        public Build setModePlay(boolean modePlay) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mode_play"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), modePlay ? 1 : 0);
            return this;
        }
        
        /**
         * if record mode was selected
         * @param modeRecord The value for the {@code modeRecord} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setModeRecord(boolean modeRecord) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mode_record"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), modeRecord ? 1 : 0);
            return this;
        }
        
        /**
         * is append mode was selected
         * @param append The value for the {@code append} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAppend(boolean append) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("append"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), append ? 1 : 0);
            return this;
        }
        
        /**
         * the interleave range
         * @param interleaved The value for the {@code interleaved} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInterleaved(org.gstreamer.rtsp.RTSPRange interleaved) {
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
        public Build setTtl(int ttl) {
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
        public Build setPort(org.gstreamer.rtsp.RTSPRange port) {
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
        public Build setClientPort(org.gstreamer.rtsp.RTSPRange clientPort) {
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
        public Build setServerPort(org.gstreamer.rtsp.RTSPRange serverPort) {
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
        public Build setSsrc(int ssrc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ssrc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), ssrc);
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
