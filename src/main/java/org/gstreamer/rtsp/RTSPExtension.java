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
     * Cast object to RTSPExtension if its GType is a (or inherits from) "GstRTSPExtension".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code RTSPExtension} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstRTSPExtension", a ClassCastException will be thrown.
     */
    public static RTSPExtension castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), RTSPExtension.getType())) {
            return new RTSPExtensionImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstRTSPExtension");
        }
    }
    
    default @NotNull org.gstreamer.rtsp.RTSPResult afterSend(@NotNull org.gstreamer.rtsp.RTSPMessage req, @NotNull org.gstreamer.rtsp.RTSPMessage resp) {
        java.util.Objects.requireNonNull(req, "Parameter 'req' must not be null");
        java.util.Objects.requireNonNull(resp, "Parameter 'resp' must not be null");
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
    
    default @NotNull org.gstreamer.rtsp.RTSPResult beforeSend(@NotNull org.gstreamer.rtsp.RTSPMessage req) {
        java.util.Objects.requireNonNull(req, "Parameter 'req' must not be null");
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
    
    default boolean configureStream(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_extension_configure_stream.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    default boolean detectServer(@NotNull org.gstreamer.rtsp.RTSPMessage resp) {
        java.util.Objects.requireNonNull(resp, "Parameter 'resp' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_extension_detect_server.invokeExact(
                    handle(),
                    resp.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    default @NotNull org.gstreamer.rtsp.RTSPResult getTransports(@NotNull org.gstreamer.rtsp.RTSPLowerTrans protocols, @NotNull PointerString transport) {
        java.util.Objects.requireNonNull(protocols, "Parameter 'protocols' must not be null");
        java.util.Objects.requireNonNull(transport, "Parameter 'transport' must not be null");
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
    
    default @NotNull org.gstreamer.rtsp.RTSPResult parseSdp(@NotNull org.gstreamer.sdp.SDPMessage sdp, @NotNull org.gstreamer.gst.Structure s) {
        java.util.Objects.requireNonNull(sdp, "Parameter 'sdp' must not be null");
        java.util.Objects.requireNonNull(s, "Parameter 's' must not be null");
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
    
    default @NotNull org.gstreamer.rtsp.RTSPResult receiveRequest(@NotNull org.gstreamer.rtsp.RTSPMessage req) {
        java.util.Objects.requireNonNull(req, "Parameter 'req' must not be null");
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
    
    default @NotNull org.gstreamer.rtsp.RTSPResult send(@NotNull org.gstreamer.rtsp.RTSPMessage req, @NotNull org.gstreamer.rtsp.RTSPMessage resp) {
        java.util.Objects.requireNonNull(req, "Parameter 'req' must not be null");
        java.util.Objects.requireNonNull(resp, "Parameter 'resp' must not be null");
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
    
    default @NotNull org.gstreamer.rtsp.RTSPResult setupMedia(@NotNull org.gstreamer.sdp.SDPMedia media) {
        java.util.Objects.requireNonNull(media, "Parameter 'media' must not be null");
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
    
    default @NotNull org.gstreamer.rtsp.RTSPResult streamSelect(@NotNull org.gstreamer.rtsp.RTSPUrl url) {
        java.util.Objects.requireNonNull(url, "Parameter 'url' must not be null");
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_rtsp_extension_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Send {
        void signalReceived(RTSPExtension sourceRTSPExtension, @Nullable java.lang.foreign.MemoryAddress object, @Nullable java.lang.foreign.MemoryAddress p0);
    }
    
    public default Signal<RTSPExtension.Send> onSend(RTSPExtension.Send handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("send"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(RTSPExtension.Callbacks.class, "signalRTSPExtensionSend",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<RTSPExtension.Send>(handle(), RESULT);
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
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static void signalRTSPExtensionSend(MemoryAddress sourceRTSPExtension, MemoryAddress object, MemoryAddress p0, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (RTSPExtension.Send) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new RTSPExtension.RTSPExtensionImpl(sourceRTSPExtension, Ownership.NONE), object, p0);
        }
    }
    
    class RTSPExtensionImpl extends org.gtk.gobject.Object implements RTSPExtension {
        
        static {
            GstRtsp.javagi$ensureInitialized();
        }
        
        public RTSPExtensionImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
