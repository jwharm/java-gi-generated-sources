package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The contents of the SDP "m=" field with all related fields.
 */
public class SDPMedia extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstSDPMedia";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("media"),
            Interop.valueLayout.C_INT.withName("port"),
            Interop.valueLayout.C_INT.withName("num_ports"),
            Interop.valueLayout.ADDRESS.withName("proto"),
            Interop.valueLayout.ADDRESS.withName("fmts"),
            Interop.valueLayout.ADDRESS.withName("information"),
            Interop.valueLayout.ADDRESS.withName("connections"),
            Interop.valueLayout.ADDRESS.withName("bandwidths"),
            org.gstreamer.sdp.SDPKey.getMemoryLayout().withName("key"),
            Interop.valueLayout.ADDRESS.withName("attributes")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SDPMedia}
     * @return A new, uninitialized @{link SDPMedia}
     */
    public static SDPMedia allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SDPMedia newInstance = new SDPMedia(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code media}
     * @return The value of the field {@code media}
     */
    public java.lang.String getMedia_() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("media"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code media}
     * @param media The new value of the field {@code media}
     */
    public void setMedia_(java.lang.String media) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("media"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (media == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(media, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code port}
     * @return The value of the field {@code port}
     */
    public int getPort_() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("port"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code port}
     * @param port The new value of the field {@code port}
     */
    public void setPort(int port) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("port"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), port);
        }
    }
    
    /**
     * Get the value of the field {@code num_ports}
     * @return The value of the field {@code num_ports}
     */
    public int getNumPorts_() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("num_ports"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code num_ports}
     * @param numPorts The new value of the field {@code num_ports}
     */
    public void setNumPorts(int numPorts) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("num_ports"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), numPorts);
        }
    }
    
    /**
     * Get the value of the field {@code proto}
     * @return The value of the field {@code proto}
     */
    public java.lang.String getProto_() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("proto"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code proto}
     * @param proto The new value of the field {@code proto}
     */
    public void setProto_(java.lang.String proto) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("proto"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (proto == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(proto, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code fmts}
     * @return The value of the field {@code fmts}
     */
    public PointerAddress getFmts() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fmts"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code fmts}
     * @param fmts The new value of the field {@code fmts}
     */
    public void setFmts(java.lang.foreign.MemoryAddress[] fmts) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fmts"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (fmts == null ? MemoryAddress.NULL : Interop.allocateNativeArray(fmts, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code information}
     * @return The value of the field {@code information}
     */
    public java.lang.String getInformation_() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("information"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code information}
     * @param information The new value of the field {@code information}
     */
    public void setInformation_(java.lang.String information) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("information"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (information == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(information, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code connections}
     * @return The value of the field {@code connections}
     */
    public PointerAddress getConnections() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("connections"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code connections}
     * @param connections The new value of the field {@code connections}
     */
    public void setConnections(java.lang.foreign.MemoryAddress[] connections) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("connections"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (connections == null ? MemoryAddress.NULL : Interop.allocateNativeArray(connections, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code bandwidths}
     * @return The value of the field {@code bandwidths}
     */
    public PointerAddress getBandwidths() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bandwidths"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code bandwidths}
     * @param bandwidths The new value of the field {@code bandwidths}
     */
    public void setBandwidths(java.lang.foreign.MemoryAddress[] bandwidths) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bandwidths"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (bandwidths == null ? MemoryAddress.NULL : Interop.allocateNativeArray(bandwidths, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code key}
     * @return The value of the field {@code key}
     */
    public org.gstreamer.sdp.SDPKey getKey_() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("key"));
        return org.gstreamer.sdp.SDPKey.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code key}
     * @param key The new value of the field {@code key}
     */
    public void setKey_(org.gstreamer.sdp.SDPKey key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("key"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (key == null ? MemoryAddress.NULL : key.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code attributes}
     * @return The value of the field {@code attributes}
     */
    public PointerAddress getAttributes() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("attributes"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code attributes}
     * @param attributes The new value of the field {@code attributes}
     */
    public void setAttributes(java.lang.foreign.MemoryAddress[] attributes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (attributes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(attributes, false, SCOPE)));
        }
    }
    
    /**
     * Create a SDPMedia proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SDPMedia(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SDPMedia> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SDPMedia(input);
    
    /**
     * Add the attribute with {@code key} and {@code value} to {@code media}.
     * @param key a key
     * @param value a value
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult addAttribute(java.lang.String key, @Nullable java.lang.String value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_sdp_media_add_attribute.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) (value == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(value, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.sdp.SDPResult.of(RESULT);
        }
    }
    
    /**
     * Add the bandwidth information with {@code bwtype} and {@code bandwidth} to {@code media}.
     * @param bwtype the bandwidth modifier type
     * @param bandwidth the bandwidth in kilobits per second
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult addBandwidth(java.lang.String bwtype, int bandwidth) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_sdp_media_add_bandwidth.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(bwtype, SCOPE),
                        bandwidth);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.sdp.SDPResult.of(RESULT);
        }
    }
    
    /**
     * Add the given connection parameters to {@code media}.
     * @param nettype the type of network. "IN" is defined to have the meaning
     * "Internet".
     * @param addrtype the type of address.
     * @param address the address
     * @param ttl the time to live of the address
     * @param addrNumber the number of layers
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult addConnection(java.lang.String nettype, java.lang.String addrtype, java.lang.String address, int ttl, int addrNumber) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_sdp_media_add_connection.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(nettype, SCOPE),
                        Marshal.stringToAddress.marshal(addrtype, SCOPE),
                        Marshal.stringToAddress.marshal(address, SCOPE),
                        ttl,
                        addrNumber);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.sdp.SDPResult.of(RESULT);
        }
    }
    
    /**
     * Add the format information to {@code media}.
     * @param format the format
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult addFormat(java.lang.String format) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_sdp_media_add_format.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(format, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.sdp.SDPResult.of(RESULT);
        }
    }
    
    /**
     * Convert the contents of {@code media} to a text string.
     * @return A dynamically allocated string representing the media.
     */
    public java.lang.String asText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_as_text.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the number of attribute fields in {@code media}.
     * @return the number of attributes in {@code media}.
     */
    public int attributesLen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_attributes_len.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Mapping of attributes of {@link SDPMedia} to {@link org.gstreamer.gst.Caps}
     * @param caps a {@link org.gstreamer.gst.Caps}
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult attributesToCaps(org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_attributes_to_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Get the number of bandwidth fields in {@code media}.
     * @return the number of bandwidths in {@code media}.
     */
    public int bandwidthsLen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_bandwidths_len.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the number of connection fields in {@code media}.
     * @return the number of connections in {@code media}.
     */
    public int connectionsLen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_connections_len.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocate a new copy of {@code media} and store the result in {@code copy}. The value in
     * {@code copy} should be release with gst_sdp_media_free function.
     * @param copy pointer to new {@link SDPMedia}
     * @return a {@link SDPResult}
     */
    public org.gstreamer.sdp.SDPResult copy(Out<org.gstreamer.sdp.SDPMedia> copy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment copyPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_sdp_media_copy.invokeExact(
                        handle(),
                        (Addressable) copyPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    copy.set(org.gstreamer.sdp.SDPMedia.fromAddress.marshal(copyPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return org.gstreamer.sdp.SDPResult.of(RESULT);
        }
    }
    
    /**
     * Get the number of formats in {@code media}.
     * @return the number of formats in {@code media}.
     */
    public int formatsLen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_formats_len.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Free all resources allocated by {@code media}. {@code media} should not be used anymore after
     * this function. This function should be used when {@code media} was dynamically
     * allocated with gst_sdp_media_new().
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult free() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Get the attribute at position {@code idx} in {@code media}.
     * @param idx an index
     * @return the {@link SDPAttribute} at position {@code idx}.
     */
    public org.gstreamer.sdp.SDPAttribute getAttribute(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_attribute.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPAttribute.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get the first attribute value for {@code key} in {@code media}.
     * @param key a key
     * @return the first attribute value for {@code key}.
     */
    public java.lang.String getAttributeVal(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_attribute_val.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Get the {@code nth} attribute value for {@code key} in {@code media}.
     * @param key a key
     * @param nth an index
     * @return the {@code nth} attribute value.
     */
    public java.lang.String getAttributeValN(java.lang.String key, int nth) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_attribute_val_n.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        nth);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Get the bandwidth at position {@code idx} in {@code media}.
     * @param idx an index
     * @return the {@link SDPBandwidth} at position {@code idx}.
     */
    public org.gstreamer.sdp.SDPBandwidth getBandwidth(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_bandwidth.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPBandwidth.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Mapping of caps from SDP fields:
     * <p>
     * a=rtpmap:(payload) (encoding_name)/(clock_rate)[/(encoding_params)]
     * <p>
     * a=framesize:(payload) (width)-(height)
     * <p>
     * a=fmtp:(payload) (param)[=(value)];...
     * <p>
     * Note that the extmap attribute is set only by gst_sdp_media_attributes_to_caps().
     * @param pt a payload type
     * @return a {@link org.gstreamer.gst.Caps}, or {@code null} if an error happened
     */
    public org.gstreamer.gst.Caps getCapsFromMedia(int pt) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_caps_from_media.invokeExact(
                    handle(),
                    pt);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the connection at position {@code idx} in {@code media}.
     * @param idx an index
     * @return the {@link SDPConnection} at position {@code idx}.
     */
    public org.gstreamer.sdp.SDPConnection getConnection(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_connection.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPConnection.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get the format information at position {@code idx} in {@code media}.
     * @param idx an index
     * @return the format at position {@code idx}.
     */
    public java.lang.String getFormat(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_format.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the information of {@code media}
     * @return the information of {@code media}.
     */
    public java.lang.String getInformation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_information.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the encryption information from {@code media}.
     * @return a {@link SDPKey}.
     */
    public org.gstreamer.sdp.SDPKey getKey() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_key.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPKey.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get the media description of {@code media}.
     * @return the media description.
     */
    public java.lang.String getMedia() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_media.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the number of ports for {@code media}.
     * @return the number of ports for {@code media}.
     */
    public int getNumPorts() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_get_num_ports.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the port number for {@code media}.
     * @return the port number of {@code media}.
     */
    public int getPort() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_get_port.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the transport protocol of {@code media}
     * @return the transport protocol of {@code media}.
     */
    public java.lang.String getProto() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_proto.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Initialize {@code media} so that its contents are as if it was freshly allocated
     * with gst_sdp_media_new(). This function is mostly used to initialize a media
     * allocated on the stack. gst_sdp_media_uninit() undoes this operation.
     * <p>
     * When this function is invoked on newly allocated data (with malloc or on the
     * stack), its contents should be set to 0 before calling this function.
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult init() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_init.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Insert the attribute to {@code media} at {@code idx}. When {@code idx} is -1,
     * the attribute is appended.
     * @param idx an index
     * @param attr a {@link SDPAttribute}
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult insertAttribute(int idx, org.gstreamer.sdp.SDPAttribute attr) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_insert_attribute.invokeExact(
                    handle(),
                    idx,
                    attr.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Insert the bandwidth information to {@code media} at {@code idx}. When {@code idx} is -1,
     * the bandwidth is appended.
     * @param idx an index
     * @param bw a {@link SDPBandwidth}
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult insertBandwidth(int idx, org.gstreamer.sdp.SDPBandwidth bw) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_insert_bandwidth.invokeExact(
                    handle(),
                    idx,
                    bw.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Insert the connection information to {@code media} at {@code idx}. When {@code idx} is -1,
     * the connection is appended.
     * @param idx an index
     * @param conn a {@link SDPConnection}
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult insertConnection(int idx, org.gstreamer.sdp.SDPConnection conn) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_insert_connection.invokeExact(
                    handle(),
                    idx,
                    conn.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Insert the format information to {@code media} at {@code idx}. When {@code idx} is -1,
     * the format is appended.
     * @param idx an index
     * @param format the format
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult insertFormat(int idx, java.lang.String format) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_sdp_media_insert_format.invokeExact(
                        handle(),
                        idx,
                        Marshal.stringToAddress.marshal(format, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.sdp.SDPResult.of(RESULT);
        }
    }
    
    /**
     * Creates a new {@link MIKEYMessage} after parsing the key-mgmt attribute
     * from a {@link SDPMedia}.
     * @param mikey pointer to new {@link MIKEYMessage}
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult parseKeymgmt(Out<org.gstreamer.sdp.MIKEYMessage> mikey) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment mikeyPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_sdp_media_parse_keymgmt.invokeExact(
                        handle(),
                        (Addressable) mikeyPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    mikey.set(org.gstreamer.sdp.MIKEYMessage.fromAddress.marshal(mikeyPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return org.gstreamer.sdp.SDPResult.of(RESULT);
        }
    }
    
    /**
     * Remove the attribute in {@code media} at {@code idx}.
     * @param idx an index
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult removeAttribute(int idx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_remove_attribute.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Remove the bandwidth information in {@code media} at {@code idx}.
     * @param idx an index
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult removeBandwidth(int idx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_remove_bandwidth.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Remove the connection information in {@code media} at {@code idx}.
     * @param idx an index
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult removeConnection(int idx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_remove_connection.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Remove the format information in {@code media} at {@code idx}.
     * @param idx an index
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult removeFormat(int idx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_remove_format.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Replace the attribute in {@code media} at {@code idx} with {@code attr}.
     * @param idx an index
     * @param attr a {@link SDPAttribute}
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult replaceAttribute(int idx, org.gstreamer.sdp.SDPAttribute attr) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_replace_attribute.invokeExact(
                    handle(),
                    idx,
                    attr.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Replace the bandwidth information in {@code media} at {@code idx} with {@code bw}.
     * @param idx an index
     * @param bw a {@link SDPBandwidth}
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult replaceBandwidth(int idx, org.gstreamer.sdp.SDPBandwidth bw) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_replace_bandwidth.invokeExact(
                    handle(),
                    idx,
                    bw.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Replace the connection information in {@code media} at {@code idx} with {@code conn}.
     * @param idx an index
     * @param conn a {@link SDPConnection}
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult replaceConnection(int idx, org.gstreamer.sdp.SDPConnection conn) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_replace_connection.invokeExact(
                    handle(),
                    idx,
                    conn.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Replace the format information in {@code media} at {@code idx} with {@code format}.
     * @param idx an index
     * @param format the format
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult replaceFormat(int idx, java.lang.String format) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_sdp_media_replace_format.invokeExact(
                        handle(),
                        idx,
                        Marshal.stringToAddress.marshal(format, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.sdp.SDPResult.of(RESULT);
        }
    }
    
    /**
     * Set the media information of {@code media} to {@code information}.
     * @param information the media information
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult setInformation(java.lang.String information) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_sdp_media_set_information.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(information, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.sdp.SDPResult.of(RESULT);
        }
    }
    
    /**
     * Adds the encryption information to {@code media}.
     * @param type the encryption type
     * @param data the encryption data
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult setKey(java.lang.String type, java.lang.String data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_sdp_media_set_key.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(type, SCOPE),
                        Marshal.stringToAddress.marshal(data, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.sdp.SDPResult.of(RESULT);
        }
    }
    
    /**
     * Set the media description of {@code media} to {@code med}.
     * @param med the media description
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult setMedia(java.lang.String med) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_sdp_media_set_media.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(med, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.sdp.SDPResult.of(RESULT);
        }
    }
    
    /**
     * Set the port information in {@code media}.
     * @param port the port number
     * @param numPorts the number of ports
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult setPortInfo(int port, int numPorts) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_set_port_info.invokeExact(
                    handle(),
                    port,
                    numPorts);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Set the media transport protocol of {@code media} to {@code proto}.
     * @param proto the media transport protocol
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult setProto(java.lang.String proto) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_sdp_media_set_proto.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(proto, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.sdp.SDPResult.of(RESULT);
        }
    }
    
    /**
     * Free all resources allocated in {@code media}. {@code media} should not be used anymore after
     * this function. This function should be used when {@code media} was allocated on the
     * stack and initialized with gst_sdp_media_init().
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult uninit() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_uninit.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Allocate a new GstSDPMedia and store the result in {@code media}.
     * @param media pointer to new {@link SDPMedia}
     * @return a {@link SDPResult}.
     */
    public static org.gstreamer.sdp.SDPResult new_(Out<org.gstreamer.sdp.SDPMedia> media) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment mediaPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_sdp_media_new.invokeExact((Addressable) mediaPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    media.set(org.gstreamer.sdp.SDPMedia.fromAddress.marshal(mediaPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return org.gstreamer.sdp.SDPResult.of(RESULT);
        }
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
    public static org.gstreamer.sdp.SDPResult setMediaFromCaps(org.gstreamer.gst.Caps caps, org.gstreamer.sdp.SDPMedia media) {
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
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_sdp_media_add_attribute = Interop.downcallHandle(
                "gst_sdp_media_add_attribute",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_add_bandwidth = Interop.downcallHandle(
                "gst_sdp_media_add_bandwidth",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_sdp_media_add_connection = Interop.downcallHandle(
                "gst_sdp_media_add_connection",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_sdp_media_add_format = Interop.downcallHandle(
                "gst_sdp_media_add_format",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_as_text = Interop.downcallHandle(
                "gst_sdp_media_as_text",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_attributes_len = Interop.downcallHandle(
                "gst_sdp_media_attributes_len",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_attributes_to_caps = Interop.downcallHandle(
                "gst_sdp_media_attributes_to_caps",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_bandwidths_len = Interop.downcallHandle(
                "gst_sdp_media_bandwidths_len",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_connections_len = Interop.downcallHandle(
                "gst_sdp_media_connections_len",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_copy = Interop.downcallHandle(
                "gst_sdp_media_copy",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_formats_len = Interop.downcallHandle(
                "gst_sdp_media_formats_len",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_free = Interop.downcallHandle(
                "gst_sdp_media_free",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_get_attribute = Interop.downcallHandle(
                "gst_sdp_media_get_attribute",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_sdp_media_get_attribute_val = Interop.downcallHandle(
                "gst_sdp_media_get_attribute_val",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_get_attribute_val_n = Interop.downcallHandle(
                "gst_sdp_media_get_attribute_val_n",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_sdp_media_get_bandwidth = Interop.downcallHandle(
                "gst_sdp_media_get_bandwidth",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_sdp_media_get_caps_from_media = Interop.downcallHandle(
                "gst_sdp_media_get_caps_from_media",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_sdp_media_get_connection = Interop.downcallHandle(
                "gst_sdp_media_get_connection",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_sdp_media_get_format = Interop.downcallHandle(
                "gst_sdp_media_get_format",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_sdp_media_get_information = Interop.downcallHandle(
                "gst_sdp_media_get_information",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_get_key = Interop.downcallHandle(
                "gst_sdp_media_get_key",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_get_media = Interop.downcallHandle(
                "gst_sdp_media_get_media",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_get_num_ports = Interop.downcallHandle(
                "gst_sdp_media_get_num_ports",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_get_port = Interop.downcallHandle(
                "gst_sdp_media_get_port",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_get_proto = Interop.downcallHandle(
                "gst_sdp_media_get_proto",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_init = Interop.downcallHandle(
                "gst_sdp_media_init",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_insert_attribute = Interop.downcallHandle(
                "gst_sdp_media_insert_attribute",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_insert_bandwidth = Interop.downcallHandle(
                "gst_sdp_media_insert_bandwidth",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_insert_connection = Interop.downcallHandle(
                "gst_sdp_media_insert_connection",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_insert_format = Interop.downcallHandle(
                "gst_sdp_media_insert_format",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_parse_keymgmt = Interop.downcallHandle(
                "gst_sdp_media_parse_keymgmt",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_remove_attribute = Interop.downcallHandle(
                "gst_sdp_media_remove_attribute",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_sdp_media_remove_bandwidth = Interop.downcallHandle(
                "gst_sdp_media_remove_bandwidth",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_sdp_media_remove_connection = Interop.downcallHandle(
                "gst_sdp_media_remove_connection",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_sdp_media_remove_format = Interop.downcallHandle(
                "gst_sdp_media_remove_format",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_sdp_media_replace_attribute = Interop.downcallHandle(
                "gst_sdp_media_replace_attribute",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_replace_bandwidth = Interop.downcallHandle(
                "gst_sdp_media_replace_bandwidth",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_replace_connection = Interop.downcallHandle(
                "gst_sdp_media_replace_connection",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_replace_format = Interop.downcallHandle(
                "gst_sdp_media_replace_format",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_set_information = Interop.downcallHandle(
                "gst_sdp_media_set_information",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_set_key = Interop.downcallHandle(
                "gst_sdp_media_set_key",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_set_media = Interop.downcallHandle(
                "gst_sdp_media_set_media",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_set_port_info = Interop.downcallHandle(
                "gst_sdp_media_set_port_info",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_sdp_media_set_proto = Interop.downcallHandle(
                "gst_sdp_media_set_proto",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_media_uninit = Interop.downcallHandle(
                "gst_sdp_media_uninit",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
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
    }
    
    /**
     * A {@link SDPMedia.Builder} object constructs a {@link SDPMedia} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SDPMedia.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SDPMedia struct;
        
        private Builder() {
            struct = SDPMedia.allocate();
        }
        
        /**
         * Finish building the {@link SDPMedia} struct.
         * @return A new instance of {@code SDPMedia} with the fields 
         *         that were set in the Builder object.
         */
        public SDPMedia build() {
            return struct;
        }
        
        /**
         * the media type
         * @param media The value for the {@code media} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMedia(java.lang.String media) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("media"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (media == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(media, SCOPE)));
                return this;
            }
        }
        
        /**
         * the transport port to which the media stream will be sent
         * @param port The value for the {@code port} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPort(int port) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("port"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), port);
                return this;
            }
        }
        
        /**
         * the number of ports or -1 if only one port was specified
         * @param numPorts The value for the {@code numPorts} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNumPorts(int numPorts) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("num_ports"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), numPorts);
                return this;
            }
        }
        
        /**
         * the transport protocol
         * @param proto The value for the {@code proto} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setProto(java.lang.String proto) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("proto"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (proto == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(proto, SCOPE)));
                return this;
            }
        }
        
        /**
         * an array of {@code gchar} formats
         * @param fmts The value for the {@code fmts} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFmts(java.lang.foreign.MemoryAddress[] fmts) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("fmts"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (fmts == null ? MemoryAddress.NULL : Interop.allocateNativeArray(fmts, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * the media title
         * @param information The value for the {@code information} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInformation(java.lang.String information) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("information"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (information == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(information, SCOPE)));
                return this;
            }
        }
        
        /**
         * array of {@link SDPConnection} with media connection information
         * @param connections The value for the {@code connections} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setConnections(java.lang.foreign.MemoryAddress[] connections) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("connections"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (connections == null ? MemoryAddress.NULL : Interop.allocateNativeArray(connections, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * array of {@link SDPBandwidth} with media bandwidth information
         * @param bandwidths The value for the {@code bandwidths} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBandwidths(java.lang.foreign.MemoryAddress[] bandwidths) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("bandwidths"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (bandwidths == null ? MemoryAddress.NULL : Interop.allocateNativeArray(bandwidths, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * the encryption key
         * @param key The value for the {@code key} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKey(org.gstreamer.sdp.SDPKey key) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("key"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (key == null ? MemoryAddress.NULL : key.handle()));
                return this;
            }
        }
        
        /**
         * array of {@link SDPAttribute} with the additional media attributes
         * @param attributes The value for the {@code attributes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAttributes(java.lang.foreign.MemoryAddress[] attributes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("attributes"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (attributes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(attributes, false, SCOPE)));
                return this;
            }
        }
    }
}
