package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstSdp namespace.
 */
public final class GstSdp {
    
    static {
        System.loadLibrary("gstsdp-1.0");
    }
    
    private static boolean javagi$initialized = false;
    
    @ApiStatus.Internal
    public static void javagi$ensureInitialized() {
        if (!javagi$initialized) {
            javagi$initialized = true;
            JavaGITypeRegister.register();
        }
    }
    
    /**
     * The supported MIKEY version 1.
     */
    public static final int MIKEY_VERSION = 1;
    
    /**
     * The Application-Specific Maximum bandwidth modifier.
     */
    public static final java.lang.String SDP_BWTYPE_AS = "AS";
    
    /**
     * The Conference Total bandwidth modifier.
     */
    public static final java.lang.String SDP_BWTYPE_CT = "CT";
    
    /**
     * The extension prefix bandwidth modifier.
     */
    public static final java.lang.String SDP_BWTYPE_EXT_PREFIX = "X-";
    
    /**
     * RTCP bandwidth allocated to data receivers (RFC 3556).
     */
    public static final java.lang.String SDP_BWTYPE_RR = "RR";
    
    /**
     * RTCP bandwidth allocated to active data senders (RFC 3556).
     */
    public static final java.lang.String SDP_BWTYPE_RS = "RS";
    
    /**
     * Transport Independent Application Specific Maximum bandwidth (RFC 3890).
     */
    public static final java.lang.String SDP_BWTYPE_TIAS = "TIAS";
    
    /**
     * Check if the given {@code addr} is a multicast address.
     * @param nettype a network type
     * @param addrtype an address type
     * @param addr an address
     * @return TRUE when {@code addr} is multicast.
     */
    public static boolean sdpAddressIsMulticast(java.lang.String nettype, java.lang.String addrtype, java.lang.String addr) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_address_is_multicast.invokeExact(
                    Marshal.stringToAddress.marshal(nettype, null),
                    Marshal.stringToAddress.marshal(addrtype, null),
                    Marshal.stringToAddress.marshal(addr, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Makes key management data
     * @param uri a {@code gchar} URI
     * @param base64 a {@code gchar} base64-encoded key data
     * @return a {@code gchar} key-mgmt data,
     */
    public static java.lang.String sdpMakeKeymgmt(java.lang.String uri, java.lang.String base64) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_make_keymgmt.invokeExact(
                    Marshal.stringToAddress.marshal(uri, null),
                    Marshal.stringToAddress.marshal(base64, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Allocate a new GstSDPMedia and store the result in {@code media}.
     * @param media pointer to new {@link SDPMedia}
     * @return a {@link SDPResult}.
     */
    public static org.gstreamer.sdp.SDPResult sdpMediaNew(Out<org.gstreamer.sdp.SDPMedia> media) {
        MemorySegment mediaPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_new.invokeExact(
                    (Addressable) mediaPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        media.set(org.gstreamer.sdp.SDPMedia.fromAddress.marshal(mediaPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Mapping of caps to SDP fields:
     * <p>
     * a=rtpmap:(payload) (encoding_name) or (clock_rate)[or (encoding_params)]
     * <p>
     * a=framesize:(payload) (width)-(height)
     * <p>
     * a=fmtp:(payload) (param)[=(value)];...
     * <p>
     * a=rtcp-fb:(payload) (param1) [param2]...
     * <p>
     * a=extmap:(id)[/direction] (extensionname) (extensionattributes)
     * @param caps a {@link org.gstreamer.gst.Caps}
     * @param media a {@link SDPMedia}
     * @return a {@link SDPResult}.
     */
    public static org.gstreamer.sdp.SDPResult sdpMediaSetMediaFromCaps(org.gstreamer.gst.Caps caps, org.gstreamer.sdp.SDPMedia media) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_set_media_from_caps.invokeExact(
                    caps.handle(),
                    media.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Creates a uri from {@code msg} with the given {@code scheme}. The uri has the format:
     * <p>
     *  \\{@code scheme}:///[{@code type}=value *[&amp;type=value]]
     * <p>
     *  Where each value is url encoded.
     * @param scheme the uri scheme
     * @param msg the {@link SDPMessage}
     * @return a uri for {@code msg}.
     */
    public static java.lang.String sdpMessageAsUri(java.lang.String scheme, org.gstreamer.sdp.SDPMessage msg) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_message_as_uri.invokeExact(
                    Marshal.stringToAddress.marshal(scheme, null),
                    msg.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Allocate a new GstSDPMessage and store the result in {@code msg}.
     * @param msg pointer to new {@link SDPMessage}
     * @return a {@link SDPResult}.
     */
    public static org.gstreamer.sdp.SDPResult sdpMessageNew(Out<org.gstreamer.sdp.SDPMessage> msg) {
        MemorySegment msgPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_new.invokeExact(
                    (Addressable) msgPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        msg.set(org.gstreamer.sdp.SDPMessage.fromAddress.marshal(msgPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Parse {@code text} and create a new SDPMessage from these.
     * @param text A dynamically allocated string representing the SDP description
     * @param msg pointer to new {@link SDPMessage}
     * @return a {@link SDPResult}.
     */
    public static org.gstreamer.sdp.SDPResult sdpMessageNewFromText(java.lang.String text, Out<org.gstreamer.sdp.SDPMessage> msg) {
        MemorySegment msgPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_new_from_text.invokeExact(
                    Marshal.stringToAddress.marshal(text, null),
                    (Addressable) msgPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        msg.set(org.gstreamer.sdp.SDPMessage.fromAddress.marshal(msgPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Parse the contents of {@code size} bytes pointed to by {@code data} and store the result in
     * {@code msg}.
     * @param data the start of the buffer
     * @param size the size of the buffer
     * @param msg the result {@link SDPMessage}
     * @return {@code GST_SDP_OK} on success.
     */
    public static org.gstreamer.sdp.SDPResult sdpMessageParseBuffer(byte[] data, int size, org.gstreamer.sdp.SDPMessage msg) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_parse_buffer.invokeExact(
                    Interop.allocateNativeArray(data, false),
                    size,
                    msg.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Parse the null-terminated {@code uri} and store the result in {@code msg}.
     * <p>
     * The uri should be of the form:
     * <p>
     *  scheme://[address[:ttl=ttl][:noa=noa]]/[sessionname]
     *               [{@code type}=value *[&amp;type=value]]
     * <p>
     *  where value is url encoded. This looslely resembles
     *  http://tools.ietf.org/html/draft-fujikawa-sdp-url-01
     * @param uri the start of the uri
     * @param msg the result {@link SDPMessage}
     * @return {@code GST_SDP_OK} on success.
     */
    public static org.gstreamer.sdp.SDPResult sdpMessageParseUri(java.lang.String uri, org.gstreamer.sdp.SDPMessage msg) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_parse_uri.invokeExact(
                    Marshal.stringToAddress.marshal(uri, null),
                    msg.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_sdp_address_is_multicast = Interop.downcallHandle(
            "gst_sdp_address_is_multicast",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_make_keymgmt = Interop.downcallHandle(
            "gst_sdp_make_keymgmt",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_media_new = Interop.downcallHandle(
            "gst_sdp_media_new",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_media_set_media_from_caps = Interop.downcallHandle(
            "gst_sdp_media_set_media_from_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_as_uri = Interop.downcallHandle(
            "gst_sdp_message_as_uri",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_new = Interop.downcallHandle(
            "gst_sdp_message_new",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_new_from_text = Interop.downcallHandle(
            "gst_sdp_message_new_from_text",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_parse_buffer = Interop.downcallHandle(
            "gst_sdp_message_parse_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_parse_uri = Interop.downcallHandle(
            "gst_sdp_message_parse_uri",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
