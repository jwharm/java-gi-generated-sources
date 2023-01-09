package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This interface is implemented e.g. by the Windows Media Streaming RTSP
 *  exentension (rtspwms) and the RealMedia RTSP extension (rtspreal).
 */
public interface RTSPExtension extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTSPExtensionImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RTSPExtensionImpl(input);
    
    default org.gstreamer.rtsp.RTSPResult afterSend(org.gstreamer.rtsp.RTSPMessage req, org.gstreamer.rtsp.RTSPMessage resp) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_extension_after_send.invokeExact(
                    handle(),
                    req.handle(),
                    resp.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    default org.gstreamer.rtsp.RTSPResult beforeSend(org.gstreamer.rtsp.RTSPMessage req) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_extension_before_send.invokeExact(
                    handle(),
                    req.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    default boolean configureStream(org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_extension_configure_stream.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    default boolean detectServer(org.gstreamer.rtsp.RTSPMessage resp) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_extension_detect_server.invokeExact(
                    handle(),
                    resp.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    default org.gstreamer.rtsp.RTSPResult getTransports(org.gstreamer.rtsp.RTSPLowerTrans protocols, PointerString transport) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_rtsp_extension_get_transports.invokeExact(
                        handle(),
                        protocols.getValue(),
                        transport.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.rtsp.RTSPResult.of(RESULT);
        }
    }
    
    default org.gstreamer.rtsp.RTSPResult parseSdp(org.gstreamer.sdp.SDPMessage sdp, org.gstreamer.gst.Structure s) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_extension_parse_sdp.invokeExact(
                    handle(),
                    sdp.handle(),
                    s.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    default org.gstreamer.rtsp.RTSPResult receiveRequest(org.gstreamer.rtsp.RTSPMessage req) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_extension_receive_request.invokeExact(
                    handle(),
                    req.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    default org.gstreamer.rtsp.RTSPResult send(org.gstreamer.rtsp.RTSPMessage req, org.gstreamer.rtsp.RTSPMessage resp) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_extension_send.invokeExact(
                    handle(),
                    req.handle(),
                    resp.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    default org.gstreamer.rtsp.RTSPResult setupMedia(org.gstreamer.sdp.SDPMedia media) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_extension_setup_media.invokeExact(
                    handle(),
                    media.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    default org.gstreamer.rtsp.RTSPResult streamSelect(org.gstreamer.rtsp.RTSPUrl url) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_extension_stream_select.invokeExact(
                    handle(),
                    url.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_rtsp_extension_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Send} callback.
     */
    @FunctionalInterface
    public interface Send {
    
        org.gstreamer.rtsp.RTSPResult run(@Nullable java.lang.foreign.MemoryAddress object, @Nullable java.lang.foreign.MemoryAddress p0);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceRTSPExtension, MemoryAddress object, MemoryAddress p0) {
            var RESULT = run(object, p0);
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Send.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    public default Signal<RTSPExtension.Send> onSend(RTSPExtension.Send handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("send", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gst_rtsp_extension_after_send = Interop.downcallHandle(
                "gst_rtsp_extension_after_send",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_rtsp_extension_before_send = Interop.downcallHandle(
                "gst_rtsp_extension_before_send",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_rtsp_extension_configure_stream = Interop.downcallHandle(
                "gst_rtsp_extension_configure_stream",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_rtsp_extension_detect_server = Interop.downcallHandle(
                "gst_rtsp_extension_detect_server",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_rtsp_extension_get_transports = Interop.downcallHandle(
                "gst_rtsp_extension_get_transports",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_rtsp_extension_parse_sdp = Interop.downcallHandle(
                "gst_rtsp_extension_parse_sdp",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_rtsp_extension_receive_request = Interop.downcallHandle(
                "gst_rtsp_extension_receive_request",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_rtsp_extension_send = Interop.downcallHandle(
                "gst_rtsp_extension_send",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_rtsp_extension_setup_media = Interop.downcallHandle(
                "gst_rtsp_extension_setup_media",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_rtsp_extension_stream_select = Interop.downcallHandle(
                "gst_rtsp_extension_stream_select",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_rtsp_extension_get_type = Interop.downcallHandle(
                "gst_rtsp_extension_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The RTSPExtensionImpl type represents a native instance of the RTSPExtension interface.
     */
    class RTSPExtensionImpl extends org.gtk.gobject.GObject implements RTSPExtension {
        
        static {
            GstRtsp.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of RTSPExtension for the provided memory address.
         * @param address the memory address of the instance
         */
        public RTSPExtensionImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_rtsp_extension_get_type != null;
    }
}
