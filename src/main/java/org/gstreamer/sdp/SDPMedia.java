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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
     * Allocate a new {@link SDPMedia}
     * @return A new, uninitialized @{link SDPMedia}
     */
    public static SDPMedia allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SDPMedia newInstance = new SDPMedia(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code media}
     * @return The value of the field {@code media}
     */
    public java.lang.String media$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("media"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code media}
     * @param media The new value of the field {@code media}
     */
    public void media$set(java.lang.String media) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("media"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(media));
    }
    
    /**
     * Get the value of the field {@code port}
     * @return The value of the field {@code port}
     */
    public int port$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("port"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code port}
     * @param port The new value of the field {@code port}
     */
    public void port$set(int port) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("port"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), port);
    }
    
    /**
     * Get the value of the field {@code num_ports}
     * @return The value of the field {@code num_ports}
     */
    public int numPorts$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("num_ports"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code num_ports}
     * @param numPorts The new value of the field {@code num_ports}
     */
    public void numPorts$set(int numPorts) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("num_ports"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), numPorts);
    }
    
    /**
     * Get the value of the field {@code proto}
     * @return The value of the field {@code proto}
     */
    public java.lang.String proto$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("proto"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code proto}
     * @param proto The new value of the field {@code proto}
     */
    public void proto$set(java.lang.String proto) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("proto"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(proto));
    }
    
    /**
     * Get the value of the field {@code information}
     * @return The value of the field {@code information}
     */
    public java.lang.String information$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("information"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code information}
     * @param information The new value of the field {@code information}
     */
    public void information$set(java.lang.String information) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("information"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(information));
    }
    
    /**
     * Get the value of the field {@code key}
     * @return The value of the field {@code key}
     */
    public org.gstreamer.sdp.SDPKey key$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("key"));
        return new org.gstreamer.sdp.SDPKey(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a SDPMedia proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SDPMedia(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Add the attribute with {@code key} and {@code value} to {@code media}.
     * @param key a key
     * @param value a value
     * @return {@code GST_SDP_OK}.
     */
    public @NotNull org.gstreamer.sdp.SDPResult addAttribute(@NotNull java.lang.String key, @Nullable java.lang.String value) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_add_attribute.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    (Addressable) (value == null ? MemoryAddress.NULL : Interop.allocateNativeString(value)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Add the bandwidth information with {@code bwtype} and {@code bandwidth} to {@code media}.
     * @param bwtype the bandwidth modifier type
     * @param bandwidth the bandwidth in kilobits per second
     * @return {@code GST_SDP_OK}.
     */
    public @NotNull org.gstreamer.sdp.SDPResult addBandwidth(@NotNull java.lang.String bwtype, int bandwidth) {
        java.util.Objects.requireNonNull(bwtype, "Parameter 'bwtype' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_add_bandwidth.invokeExact(
                    handle(),
                    Interop.allocateNativeString(bwtype),
                    bandwidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
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
    public @NotNull org.gstreamer.sdp.SDPResult addConnection(@NotNull java.lang.String nettype, @NotNull java.lang.String addrtype, @NotNull java.lang.String address, int ttl, int addrNumber) {
        java.util.Objects.requireNonNull(nettype, "Parameter 'nettype' must not be null");
        java.util.Objects.requireNonNull(addrtype, "Parameter 'addrtype' must not be null");
        java.util.Objects.requireNonNull(address, "Parameter 'address' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_add_connection.invokeExact(
                    handle(),
                    Interop.allocateNativeString(nettype),
                    Interop.allocateNativeString(addrtype),
                    Interop.allocateNativeString(address),
                    ttl,
                    addrNumber);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Add the format information to {@code media}.
     * @param format the format
     * @return {@code GST_SDP_OK}.
     */
    public @NotNull org.gstreamer.sdp.SDPResult addFormat(@NotNull java.lang.String format) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_add_format.invokeExact(
                    handle(),
                    Interop.allocateNativeString(format));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Convert the contents of {@code media} to a text string.
     * @return A dynamically allocated string representing the media.
     */
    public @NotNull java.lang.String asText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_as_text.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the number of attribute fields in {@code media}.
     * @return the number of attributes in {@code media}.
     */
    public int attributesLen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_attributes_len.invokeExact(
                    handle());
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
    public @NotNull org.gstreamer.sdp.SDPResult attributesToCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
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
            RESULT = (int) DowncallHandles.gst_sdp_media_bandwidths_len.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gst_sdp_media_connections_len.invokeExact(
                    handle());
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
    public @NotNull org.gstreamer.sdp.SDPResult copy(@NotNull Out<org.gstreamer.sdp.SDPMedia> copy) {
        java.util.Objects.requireNonNull(copy, "Parameter 'copy' must not be null");
        MemorySegment copyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_copy.invokeExact(
                    handle(),
                    (Addressable) copyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        copy.set(new org.gstreamer.sdp.SDPMedia(copyPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Get the number of formats in {@code media}.
     * @return the number of formats in {@code media}.
     */
    public int formatsLen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_formats_len.invokeExact(
                    handle());
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
    public @NotNull org.gstreamer.sdp.SDPResult free() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_free.invokeExact(
                    handle());
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
    public @NotNull org.gstreamer.sdp.SDPAttribute getAttribute(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_attribute.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.sdp.SDPAttribute(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the first attribute value for {@code key} in {@code media}.
     * @param key a key
     * @return the first attribute value for {@code key}.
     */
    public @NotNull java.lang.String getAttributeVal(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_attribute_val.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the {@code nth} attribute value for {@code key} in {@code media}.
     * @param key a key
     * @param nth an index
     * @return the {@code nth} attribute value.
     */
    public @NotNull java.lang.String getAttributeValN(@NotNull java.lang.String key, int nth) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_attribute_val_n.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    nth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the bandwidth at position {@code idx} in {@code media}.
     * @param idx an index
     * @return the {@link SDPBandwidth} at position {@code idx}.
     */
    public @NotNull org.gstreamer.sdp.SDPBandwidth getBandwidth(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_bandwidth.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.sdp.SDPBandwidth(RESULT, Ownership.NONE);
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
    public @NotNull org.gstreamer.gst.Caps getCapsFromMedia(int pt) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_caps_from_media.invokeExact(
                    handle(),
                    pt);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the connection at position {@code idx} in {@code media}.
     * @param idx an index
     * @return the {@link SDPConnection} at position {@code idx}.
     */
    public @NotNull org.gstreamer.sdp.SDPConnection getConnection(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_connection.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.sdp.SDPConnection(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the format information at position {@code idx} in {@code media}.
     * @param idx an index
     * @return the format at position {@code idx}.
     */
    public @NotNull java.lang.String getFormat(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_format.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the information of {@code media}
     * @return the information of {@code media}.
     */
    public @NotNull java.lang.String getInformation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_information.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the encryption information from {@code media}.
     * @return a {@link SDPKey}.
     */
    public @NotNull org.gstreamer.sdp.SDPKey getKey() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_key.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.sdp.SDPKey(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the media description of {@code media}.
     * @return the media description.
     */
    public @NotNull java.lang.String getMedia() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_media.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the number of ports for {@code media}.
     * @return the number of ports for {@code media}.
     */
    public int getNumPorts() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_get_num_ports.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gst_sdp_media_get_port.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the transport protocol of {@code media}
     * @return the transport protocol of {@code media}.
     */
    public @NotNull java.lang.String getProto() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_media_get_proto.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
    public @NotNull org.gstreamer.sdp.SDPResult init() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_init.invokeExact(
                    handle());
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
    public @NotNull org.gstreamer.sdp.SDPResult insertAttribute(int idx, @NotNull org.gstreamer.sdp.SDPAttribute attr) {
        java.util.Objects.requireNonNull(attr, "Parameter 'attr' must not be null");
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
    public @NotNull org.gstreamer.sdp.SDPResult insertBandwidth(int idx, @NotNull org.gstreamer.sdp.SDPBandwidth bw) {
        java.util.Objects.requireNonNull(bw, "Parameter 'bw' must not be null");
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
    public @NotNull org.gstreamer.sdp.SDPResult insertConnection(int idx, @NotNull org.gstreamer.sdp.SDPConnection conn) {
        java.util.Objects.requireNonNull(conn, "Parameter 'conn' must not be null");
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
    public @NotNull org.gstreamer.sdp.SDPResult insertFormat(int idx, @NotNull java.lang.String format) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_insert_format.invokeExact(
                    handle(),
                    idx,
                    Interop.allocateNativeString(format));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Creates a new {@link MIKEYMessage} after parsing the key-mgmt attribute
     * from a {@link SDPMedia}.
     * @param mikey pointer to new {@link MIKEYMessage}
     * @return a {@link SDPResult}.
     */
    public @NotNull org.gstreamer.sdp.SDPResult parseKeymgmt(@NotNull Out<org.gstreamer.sdp.MIKEYMessage> mikey) {
        java.util.Objects.requireNonNull(mikey, "Parameter 'mikey' must not be null");
        MemorySegment mikeyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_parse_keymgmt.invokeExact(
                    handle(),
                    (Addressable) mikeyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        mikey.set(new org.gstreamer.sdp.MIKEYMessage(mikeyPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Remove the attribute in {@code media} at {@code idx}.
     * @param idx an index
     * @return {@code GST_SDP_OK}.
     */
    public @NotNull org.gstreamer.sdp.SDPResult removeAttribute(int idx) {
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
    public @NotNull org.gstreamer.sdp.SDPResult removeBandwidth(int idx) {
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
    public @NotNull org.gstreamer.sdp.SDPResult removeConnection(int idx) {
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
    public @NotNull org.gstreamer.sdp.SDPResult removeFormat(int idx) {
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
    public @NotNull org.gstreamer.sdp.SDPResult replaceAttribute(int idx, @NotNull org.gstreamer.sdp.SDPAttribute attr) {
        java.util.Objects.requireNonNull(attr, "Parameter 'attr' must not be null");
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
    public @NotNull org.gstreamer.sdp.SDPResult replaceBandwidth(int idx, @NotNull org.gstreamer.sdp.SDPBandwidth bw) {
        java.util.Objects.requireNonNull(bw, "Parameter 'bw' must not be null");
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
    public @NotNull org.gstreamer.sdp.SDPResult replaceConnection(int idx, @NotNull org.gstreamer.sdp.SDPConnection conn) {
        java.util.Objects.requireNonNull(conn, "Parameter 'conn' must not be null");
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
    public @NotNull org.gstreamer.sdp.SDPResult replaceFormat(int idx, @NotNull java.lang.String format) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_replace_format.invokeExact(
                    handle(),
                    idx,
                    Interop.allocateNativeString(format));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Set the media information of {@code media} to {@code information}.
     * @param information the media information
     * @return {@code GST_SDP_OK}.
     */
    public @NotNull org.gstreamer.sdp.SDPResult setInformation(@NotNull java.lang.String information) {
        java.util.Objects.requireNonNull(information, "Parameter 'information' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_set_information.invokeExact(
                    handle(),
                    Interop.allocateNativeString(information));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Adds the encryption information to {@code media}.
     * @param type the encryption type
     * @param data the encryption data
     * @return a {@link SDPResult}.
     */
    public @NotNull org.gstreamer.sdp.SDPResult setKey(@NotNull java.lang.String type, @NotNull java.lang.String data) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_set_key.invokeExact(
                    handle(),
                    Interop.allocateNativeString(type),
                    Interop.allocateNativeString(data));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Set the media description of {@code media} to {@code med}.
     * @param med the media description
     * @return {@code GST_SDP_OK}.
     */
    public @NotNull org.gstreamer.sdp.SDPResult setMedia(@NotNull java.lang.String med) {
        java.util.Objects.requireNonNull(med, "Parameter 'med' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_set_media.invokeExact(
                    handle(),
                    Interop.allocateNativeString(med));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Set the port information in {@code media}.
     * @param port the port number
     * @param numPorts the number of ports
     * @return {@code GST_SDP_OK}.
     */
    public @NotNull org.gstreamer.sdp.SDPResult setPortInfo(int port, int numPorts) {
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
    public @NotNull org.gstreamer.sdp.SDPResult setProto(@NotNull java.lang.String proto) {
        java.util.Objects.requireNonNull(proto, "Parameter 'proto' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_set_proto.invokeExact(
                    handle(),
                    Interop.allocateNativeString(proto));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Free all resources allocated in {@code media}. {@code media} should not be used anymore after
     * this function. This function should be used when {@code media} was allocated on the
     * stack and initialized with gst_sdp_media_init().
     * @return a {@link SDPResult}.
     */
    public @NotNull org.gstreamer.sdp.SDPResult uninit() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_uninit.invokeExact(
                    handle());
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
    public static @NotNull org.gstreamer.sdp.SDPResult new_(@NotNull Out<org.gstreamer.sdp.SDPMedia> media) {
        java.util.Objects.requireNonNull(media, "Parameter 'media' must not be null");
        MemorySegment mediaPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_media_new.invokeExact(
                    (Addressable) mediaPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        media.set(new org.gstreamer.sdp.SDPMedia(mediaPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
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
    public static @NotNull org.gstreamer.sdp.SDPResult setMediaFromCaps(@NotNull org.gstreamer.gst.Caps caps, @NotNull org.gstreamer.sdp.SDPMedia media) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        java.util.Objects.requireNonNull(media, "Parameter 'media' must not be null");
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SDPMedia struct;
        
         /**
         * A {@link SDPMedia.Build} object constructs a {@link SDPMedia} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SDPMedia.allocate();
        }
        
         /**
         * Finish building the {@link SDPMedia} struct.
         * @return A new instance of {@code SDPMedia} with the fields 
         *         that were set in the Build object.
         */
        public SDPMedia construct() {
            return struct;
        }
        
        /**
         * the media type
         * @param media The value for the {@code media} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMedia(java.lang.String media) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("media"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (media == null ? MemoryAddress.NULL : Interop.allocateNativeString(media)));
            return this;
        }
        
        /**
         * the transport port to which the media stream will be sent
         * @param port The value for the {@code port} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPort(int port) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("port"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), port);
            return this;
        }
        
        /**
         * the number of ports or -1 if only one port was specified
         * @param numPorts The value for the {@code numPorts} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNumPorts(int numPorts) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("num_ports"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), numPorts);
            return this;
        }
        
        /**
         * the transport protocol
         * @param proto The value for the {@code proto} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setProto(java.lang.String proto) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("proto"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (proto == null ? MemoryAddress.NULL : Interop.allocateNativeString(proto)));
            return this;
        }
        
        /**
         * an array of {@code gchar} formats
         * @param fmts The value for the {@code fmts} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFmts(java.lang.foreign.MemoryAddress[] fmts) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fmts"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fmts == null ? MemoryAddress.NULL : Interop.allocateNativeArray(fmts, false)));
            return this;
        }
        
        /**
         * the media title
         * @param information The value for the {@code information} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInformation(java.lang.String information) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("information"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (information == null ? MemoryAddress.NULL : Interop.allocateNativeString(information)));
            return this;
        }
        
        /**
         * array of {@link SDPConnection} with media connection information
         * @param connections The value for the {@code connections} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setConnections(java.lang.foreign.MemoryAddress[] connections) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("connections"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (connections == null ? MemoryAddress.NULL : Interop.allocateNativeArray(connections, false)));
            return this;
        }
        
        /**
         * array of {@link SDPBandwidth} with media bandwidth information
         * @param bandwidths The value for the {@code bandwidths} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBandwidths(java.lang.foreign.MemoryAddress[] bandwidths) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bandwidths"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (bandwidths == null ? MemoryAddress.NULL : Interop.allocateNativeArray(bandwidths, false)));
            return this;
        }
        
        /**
         * the encryption key
         * @param key The value for the {@code key} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setKey(org.gstreamer.sdp.SDPKey key) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("key"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (key == null ? MemoryAddress.NULL : key.handle()));
            return this;
        }
        
        /**
         * array of {@link SDPAttribute} with the additional media attributes
         * @param attributes The value for the {@code attributes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAttributes(java.lang.foreign.MemoryAddress[] attributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (attributes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(attributes, false)));
            return this;
        }
    }
}
