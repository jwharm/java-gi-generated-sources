package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure holding the information of the MIKEY message
 */
public class MIKEYMessage extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYMessage";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.MiniObject.getMemoryLayout().withName("mini_object"),
        Interop.valueLayout.C_BYTE.withName("version"),
        MemoryLayout.paddingLayout(24),
        Interop.valueLayout.C_INT.withName("type"),
        Interop.valueLayout.C_INT.withName("V"),
        Interop.valueLayout.C_INT.withName("prf_func"),
        Interop.valueLayout.C_INT.withName("CSB_id"),
        Interop.valueLayout.C_INT.withName("map_type"),
        Interop.valueLayout.ADDRESS.withName("map_info"),
        Interop.valueLayout.ADDRESS.withName("payloads")
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
     * Allocate a new {@link MIKEYMessage}
     * @return A new, uninitialized @{link MIKEYMessage}
     */
    public static MIKEYMessage allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MIKEYMessage newInstance = new MIKEYMessage(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code version}
     * @return The value of the field {@code version}
     */
    public byte version$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("version"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code version}
     * @param version The new value of the field {@code version}
     */
    public void version$set(byte version) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("version"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), version);
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gstreamer.sdp.MIKEYType type$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.sdp.MIKEYType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void type$set(org.gstreamer.sdp.MIKEYType type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), type.getValue());
    }
    
    /**
     * Get the value of the field {@code V}
     * @return The value of the field {@code V}
     */
    public boolean V$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("V"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code V}
     * @param V The new value of the field {@code V}
     */
    public void V$set(boolean V) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("V"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), V ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code prf_func}
     * @return The value of the field {@code prf_func}
     */
    public org.gstreamer.sdp.MIKEYPRFFunc prfFunc$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prf_func"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.sdp.MIKEYPRFFunc.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code prf_func}
     * @param prfFunc The new value of the field {@code prf_func}
     */
    public void prfFunc$set(org.gstreamer.sdp.MIKEYPRFFunc prfFunc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prf_func"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), prfFunc.getValue());
    }
    
    /**
     * Get the value of the field {@code CSB_id}
     * @return The value of the field {@code CSB_id}
     */
    public int CSBId$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("CSB_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code CSB_id}
     * @param CSBId The new value of the field {@code CSB_id}
     */
    public void CSBId$set(int CSBId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("CSB_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), CSBId);
    }
    
    /**
     * Get the value of the field {@code map_type}
     * @return The value of the field {@code map_type}
     */
    public org.gstreamer.sdp.MIKEYMapType mapType$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("map_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.sdp.MIKEYMapType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code map_type}
     * @param mapType The new value of the field {@code map_type}
     */
    public void mapType$set(org.gstreamer.sdp.MIKEYMapType mapType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("map_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), mapType.getValue());
    }
    
    /**
     * Create a MIKEYMessage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MIKEYMessage(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mikey_message_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Make a new MIKEY message.
     */
    public MIKEYMessage() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static Addressable constructNewFromBytes(@NotNull org.gtk.glib.Bytes bytes, @NotNull org.gstreamer.sdp.MIKEYDecryptInfo info) throws GErrorException {
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mikey_message_new_from_bytes.invokeExact(
                    bytes.handle(),
                    info.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Make a new {@link MIKEYMessage} from {@code bytes}.
     * @param bytes a {@link org.gtk.glib.Bytes}
     * @param info a {@link MIKEYDecryptInfo}
     * @return a new {@link MIKEYMessage}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static MIKEYMessage newFromBytes(@NotNull org.gtk.glib.Bytes bytes, @NotNull org.gstreamer.sdp.MIKEYDecryptInfo info) throws GErrorException {
        return new MIKEYMessage(constructNewFromBytes(bytes, info), Ownership.FULL);
    }
    
    private static Addressable constructNewFromCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mikey_message_new_from_caps.invokeExact(
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Makes mikey message including:
     * <ul>
     * <li>Security Policy Payload
     * <li>Key Data Transport Payload
     * <li>Key Data Sub-Payload
     * </ul>
     * @param caps a {@link org.gstreamer.gst.Caps}, including SRTP parameters (srtp/srtcp cipher, authorization, key data)
     * @return a {@link MIKEYMessage},
     * or {@code null} if there is no srtp information in the caps.
     */
    public static MIKEYMessage newFromCaps(@NotNull org.gstreamer.gst.Caps caps) {
        return new MIKEYMessage(constructNewFromCaps(caps), Ownership.FULL);
    }
    
    private static Addressable constructNewFromData(@NotNull byte[] data, long size, @NotNull org.gstreamer.sdp.MIKEYDecryptInfo info) throws GErrorException {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mikey_message_new_from_data.invokeExact(
                    Interop.allocateNativeArray(data, false),
                    size,
                    info.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Parse {@code size} bytes from {@code data} into a {@link MIKEYMessage}. {@code info} contains the
     * parameters to decrypt and verify the data.
     * @param data bytes to read
     * @param size length of {@code data}
     * @param info {@link MIKEYDecryptInfo}
     * @return a {@link MIKEYMessage} on success or {@code null} when parsing failed and
     * {@code error} will be set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static MIKEYMessage newFromData(@NotNull byte[] data, long size, @NotNull org.gstreamer.sdp.MIKEYDecryptInfo info) throws GErrorException {
        return new MIKEYMessage(constructNewFromData(data, size, info), Ownership.FULL);
    }
    
    /**
     * Add a Crypto policy for SRTP to {@code msg}.
     * @param policy The security policy applied for the stream with {@code ssrc}
     * @param ssrc the SSRC that must be used for the stream
     * @param roc current rollover counter
     * @return {@code true} on success
     */
    public boolean addCsSrtp(byte policy, int ssrc, int roc) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_add_cs_srtp.invokeExact(
                    handle(),
                    policy,
                    ssrc,
                    roc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Add a new payload to {@code msg}.
     * @param payload a {@link MIKEYPayload}
     * @return {@code true} on success
     */
    public boolean addPayload(@NotNull org.gstreamer.sdp.MIKEYPayload payload) {
        java.util.Objects.requireNonNull(payload, "Parameter 'payload' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_add_payload.invokeExact(
                    handle(),
                    payload.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        payload.yieldOwnership();
        return RESULT != 0;
    }
    
    /**
     * Add a new PKE payload to {@code msg} with the given parameters.
     * @param C envelope key cache indicator
     * @param dataLen the length of {@code data}
     * @param data the encrypted envelope key
     * @return {@code true} on success
     */
    public boolean addPke(@NotNull org.gstreamer.sdp.MIKEYCacheType C, short dataLen, @NotNull byte[] data) {
        java.util.Objects.requireNonNull(C, "Parameter 'C' must not be null");
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_add_pke.invokeExact(
                    handle(),
                    C.getValue(),
                    dataLen,
                    Interop.allocateNativeArray(data, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Add a new RAND payload to {@code msg} with the given parameters.
     * @param len the length of {@code rand}
     * @param rand random data
     * @return {@code true} on success
     */
    public boolean addRand(byte len, @NotNull byte[] rand) {
        java.util.Objects.requireNonNull(rand, "Parameter 'rand' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_add_rand.invokeExact(
                    handle(),
                    len,
                    Interop.allocateNativeArray(rand, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Add a new RAND payload to {@code msg} with {@code len} random bytes.
     * @param len length
     * @return {@code true} on success
     */
    public boolean addRandLen(byte len) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_add_rand_len.invokeExact(
                    handle(),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Add a new T payload to {@code msg} with the given parameters.
     * @param type specifies the timestamp type used
     * @param tsValue The timestamp value of the specified {@code type}
     * @return {@code true} on success
     */
    public boolean addT(@NotNull org.gstreamer.sdp.MIKEYTSType type, @NotNull byte[] tsValue) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(tsValue, "Parameter 'tsValue' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_add_t.invokeExact(
                    handle(),
                    type.getValue(),
                    Interop.allocateNativeArray(tsValue, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Add a new T payload to {@code msg} that contains the current time
     * in NTP-UTC format.
     * @return {@code true} on success
     */
    public boolean addTNowNtpUtc() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_add_t_now_ntp_utc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public @NotNull java.lang.String base64Encode() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mikey_message_base64_encode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Find the {@code nth} occurrence of the payload with {@code type} in {@code msg}.
     * @param type a {@link MIKEYPayloadType}
     * @param nth payload to find
     * @return the {@code nth} {@link MIKEYPayload} of {@code type}.
     */
    public @NotNull org.gstreamer.sdp.MIKEYPayload findPayload(@NotNull org.gstreamer.sdp.MIKEYPayloadType type, int nth) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mikey_message_find_payload.invokeExact(
                    handle(),
                    type.getValue(),
                    nth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.sdp.MIKEYPayload(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the policy information of {@code msg} at {@code idx}.
     * @param idx an index
     * @return a {@link MIKEYMapSRTP}
     */
    public @NotNull org.gstreamer.sdp.MIKEYMapSRTP getCsSrtp(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mikey_message_get_cs_srtp.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.sdp.MIKEYMapSRTP(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the number of crypto sessions in {@code msg}.
     * @return the number of crypto sessions
     */
    public int getNCs() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_get_n_cs.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the number of payloads in {@code msg}.
     * @return the number of payloads in {@code msg}
     */
    public int getNPayloads() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_get_n_payloads.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the {@link MIKEYPayload} at {@code idx} in {@code msg}
     * @param idx an index
     * @return the {@link MIKEYPayload} at {@code idx}. The payload
     * remains valid for as long as it is part of {@code msg}.
     */
    public @NotNull org.gstreamer.sdp.MIKEYPayload getPayload(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mikey_message_get_payload.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.sdp.MIKEYPayload(RESULT, Ownership.NONE);
    }
    
    /**
     * Insert a Crypto Session map for SRTP in {@code msg} at {@code idx}
     * <p>
     * When {@code idx} is -1, the policy will be appended.
     * @param idx the index to insert at
     * @param map the map info
     * @return {@code true} on success
     */
    public boolean insertCsSrtp(int idx, @NotNull org.gstreamer.sdp.MIKEYMapSRTP map) {
        java.util.Objects.requireNonNull(map, "Parameter 'map' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_insert_cs_srtp.invokeExact(
                    handle(),
                    idx,
                    map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Insert the {@code payload} at index {@code idx} in {@code msg}. If {@code idx} is -1, the payload
     * will be appended to {@code msg}.
     * @param idx an index
     * @param payload a {@link MIKEYPayload}
     * @return {@code true} on success
     */
    public boolean insertPayload(int idx, @NotNull org.gstreamer.sdp.MIKEYPayload payload) {
        java.util.Objects.requireNonNull(payload, "Parameter 'payload' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_insert_payload.invokeExact(
                    handle(),
                    idx,
                    payload.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        payload.yieldOwnership();
        return RESULT != 0;
    }
    
    /**
     * Remove the SRTP policy at {@code idx}.
     * @param idx the index to remove
     * @return {@code true} on success
     */
    public boolean removeCsSrtp(int idx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_remove_cs_srtp.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Remove the payload in {@code msg} at {@code idx}
     * @param idx an index
     * @return {@code true} on success
     */
    public boolean removePayload(int idx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_remove_payload.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Replace a Crypto Session map for SRTP in {@code msg} at {@code idx} with {@code map}.
     * @param idx the index to insert at
     * @param map the map info
     * @return {@code true} on success
     */
    public boolean replaceCsSrtp(int idx, @NotNull org.gstreamer.sdp.MIKEYMapSRTP map) {
        java.util.Objects.requireNonNull(map, "Parameter 'map' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_replace_cs_srtp.invokeExact(
                    handle(),
                    idx,
                    map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Replace the payload at {@code idx} in {@code msg} with {@code payload}.
     * @param idx an index
     * @param payload a {@link MIKEYPayload}
     * @return {@code true} on success
     */
    public boolean replacePayload(int idx, @NotNull org.gstreamer.sdp.MIKEYPayload payload) {
        java.util.Objects.requireNonNull(payload, "Parameter 'payload' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_replace_payload.invokeExact(
                    handle(),
                    idx,
                    payload.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        payload.yieldOwnership();
        return RESULT != 0;
    }
    
    /**
     * Set the information in {@code msg}.
     * @param version a version
     * @param type a {@link MIKEYType}
     * @param V verify flag
     * @param prfFunc the {@link MIKEYPRFFunc} function to use
     * @param CSBId the Crypto Session Bundle id
     * @param mapType the {@link MIKEYMapType}
     * @return {@code true} on success
     */
    public boolean setInfo(byte version, @NotNull org.gstreamer.sdp.MIKEYType type, boolean V, @NotNull org.gstreamer.sdp.MIKEYPRFFunc prfFunc, int CSBId, @NotNull org.gstreamer.sdp.MIKEYMapType mapType) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(prfFunc, "Parameter 'prfFunc' must not be null");
        java.util.Objects.requireNonNull(mapType, "Parameter 'mapType' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_set_info.invokeExact(
                    handle(),
                    version,
                    type.getValue(),
                    V ? 1 : 0,
                    prfFunc.getValue(),
                    CSBId,
                    mapType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Convert {@code msg} to a {@link org.gtk.glib.Bytes}.
     * @param info a {@link MIKEYEncryptInfo}
     * @return a new {@link org.gtk.glib.Bytes} for {@code msg}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.glib.Bytes toBytes(@NotNull org.gstreamer.sdp.MIKEYEncryptInfo info) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mikey_message_to_bytes.invokeExact(
                    handle(),
                    info.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.Bytes(RESULT, Ownership.FULL);
    }
    
    public boolean toCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_to_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mikey_message_new = Interop.downcallHandle(
            "gst_mikey_message_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_message_new_from_bytes = Interop.downcallHandle(
            "gst_mikey_message_new_from_bytes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_message_new_from_caps = Interop.downcallHandle(
            "gst_mikey_message_new_from_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_message_new_from_data = Interop.downcallHandle(
            "gst_mikey_message_new_from_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_message_add_cs_srtp = Interop.downcallHandle(
            "gst_mikey_message_add_cs_srtp",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_mikey_message_add_payload = Interop.downcallHandle(
            "gst_mikey_message_add_payload",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_message_add_pke = Interop.downcallHandle(
            "gst_mikey_message_add_pke",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_message_add_rand = Interop.downcallHandle(
            "gst_mikey_message_add_rand",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_message_add_rand_len = Interop.downcallHandle(
            "gst_mikey_message_add_rand_len",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_mikey_message_add_t = Interop.downcallHandle(
            "gst_mikey_message_add_t",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_message_add_t_now_ntp_utc = Interop.downcallHandle(
            "gst_mikey_message_add_t_now_ntp_utc",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_message_base64_encode = Interop.downcallHandle(
            "gst_mikey_message_base64_encode",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_message_find_payload = Interop.downcallHandle(
            "gst_mikey_message_find_payload",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_mikey_message_get_cs_srtp = Interop.downcallHandle(
            "gst_mikey_message_get_cs_srtp",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_mikey_message_get_n_cs = Interop.downcallHandle(
            "gst_mikey_message_get_n_cs",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_message_get_n_payloads = Interop.downcallHandle(
            "gst_mikey_message_get_n_payloads",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_message_get_payload = Interop.downcallHandle(
            "gst_mikey_message_get_payload",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_mikey_message_insert_cs_srtp = Interop.downcallHandle(
            "gst_mikey_message_insert_cs_srtp",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_message_insert_payload = Interop.downcallHandle(
            "gst_mikey_message_insert_payload",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_message_remove_cs_srtp = Interop.downcallHandle(
            "gst_mikey_message_remove_cs_srtp",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_mikey_message_remove_payload = Interop.downcallHandle(
            "gst_mikey_message_remove_payload",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_mikey_message_replace_cs_srtp = Interop.downcallHandle(
            "gst_mikey_message_replace_cs_srtp",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_message_replace_payload = Interop.downcallHandle(
            "gst_mikey_message_replace_payload",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_message_set_info = Interop.downcallHandle(
            "gst_mikey_message_set_info",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_mikey_message_to_bytes = Interop.downcallHandle(
            "gst_mikey_message_to_bytes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mikey_message_to_caps = Interop.downcallHandle(
            "gst_mikey_message_to_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private MIKEYMessage struct;
        
         /**
         * A {@link MIKEYMessage.Build} object constructs a {@link MIKEYMessage} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = MIKEYMessage.allocate();
        }
        
         /**
         * Finish building the {@link MIKEYMessage} struct.
         * @return A new instance of {@code MIKEYMessage} with the fields 
         *         that were set in the Build object.
         */
        public MIKEYMessage construct() {
            return struct;
        }
        
        public Build setMiniObject(org.gstreamer.gst.MiniObject miniObject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mini_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (miniObject == null ? MemoryAddress.NULL : miniObject.handle()));
            return this;
        }
        
        /**
         * the version
         * @param version The value for the {@code version} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setVersion(byte version) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("version"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), version);
            return this;
        }
        
        /**
         * the {@link MIKEYType} message type
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setType(org.gstreamer.sdp.MIKEYType type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
            return this;
        }
        
        /**
         * verify flag
         * @param V The value for the {@code V} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setV(boolean V) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("V"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), V ? 1 : 0);
            return this;
        }
        
        /**
         * a {@link MIKEYPRFFunc}
         * @param prfFunc The value for the {@code prfFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPrfFunc(org.gstreamer.sdp.MIKEYPRFFunc prfFunc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prf_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prfFunc == null ? MemoryAddress.NULL : prfFunc.getValue()));
            return this;
        }
        
        /**
         * Identifies the Crypto Session Bundle
         * @param CSBId The value for the {@code CSBId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCSBId(int CSBId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("CSB_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), CSBId);
            return this;
        }
        
        /**
         * a {@link MIKEYMapType}
         * @param mapType The value for the {@code mapType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMapType(org.gstreamer.sdp.MIKEYMapType mapType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mapType == null ? MemoryAddress.NULL : mapType.getValue()));
            return this;
        }
        
        /**
         * map info array of type depending on {@code map_type}
         * @param mapInfo The value for the {@code mapInfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMapInfo(java.lang.foreign.MemoryAddress[] mapInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mapInfo == null ? MemoryAddress.NULL : Interop.allocateNativeArray(mapInfo, false)));
            return this;
        }
        
        /**
         * the payload array of {@link MIKEYPayload}
         * @param payloads The value for the {@code payloads} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPayloads(java.lang.foreign.MemoryAddress[] payloads) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("payloads"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (payloads == null ? MemoryAddress.NULL : Interop.allocateNativeArray(payloads, false)));
            return this;
        }
    }
}
