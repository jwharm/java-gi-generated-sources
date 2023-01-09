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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MIKEYMessage}
     * @return A new, uninitialized @{link MIKEYMessage}
     */
    public static MIKEYMessage allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        MIKEYMessage newInstance = new MIKEYMessage(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code version}
     * @return The value of the field {@code version}
     */
    public byte getVersion() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("version"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code version}
     * @param version The new value of the field {@code version}
     */
    public void setVersion(byte version) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("version"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), version);
        }
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gstreamer.sdp.MIKEYType getType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.sdp.MIKEYType.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(org.gstreamer.sdp.MIKEYType type) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code V}
     * @return The value of the field {@code V}
     */
    public boolean getV() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("V"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code V}
     * @param V The new value of the field {@code V}
     */
    public void setV(boolean V) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("V"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(V, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code prf_func}
     * @return The value of the field {@code prf_func}
     */
    public org.gstreamer.sdp.MIKEYPRFFunc getPrfFunc() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prf_func"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.sdp.MIKEYPRFFunc.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code prf_func}
     * @param prfFunc The new value of the field {@code prf_func}
     */
    public void setPrfFunc(org.gstreamer.sdp.MIKEYPRFFunc prfFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prf_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prfFunc == null ? MemoryAddress.NULL : prfFunc.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code CSB_id}
     * @return The value of the field {@code CSB_id}
     */
    public int getCSBId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("CSB_id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code CSB_id}
     * @param CSBId The new value of the field {@code CSB_id}
     */
    public void setCSBId(int CSBId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("CSB_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), CSBId);
        }
    }
    
    /**
     * Get the value of the field {@code map_type}
     * @return The value of the field {@code map_type}
     */
    public org.gstreamer.sdp.MIKEYMapType getMapType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map_type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.sdp.MIKEYMapType.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code map_type}
     * @param mapType The new value of the field {@code map_type}
     */
    public void setMapType(org.gstreamer.sdp.MIKEYMapType mapType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mapType == null ? MemoryAddress.NULL : mapType.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code map_info}
     * @return The value of the field {@code map_info}
     */
    public PointerAddress getMapInfo() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map_info"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code map_info}
     * @param mapInfo The new value of the field {@code map_info}
     */
    public void setMapInfo(java.lang.foreign.MemoryAddress[] mapInfo) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mapInfo == null ? MemoryAddress.NULL : Interop.allocateNativeArray(mapInfo, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code payloads}
     * @return The value of the field {@code payloads}
     */
    public PointerAddress getPayloads() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("payloads"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code payloads}
     * @param payloads The new value of the field {@code payloads}
     */
    public void setPayloads(java.lang.foreign.MemoryAddress[] payloads) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("payloads"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (payloads == null ? MemoryAddress.NULL : Interop.allocateNativeArray(payloads, false, SCOPE)));
        }
    }
    
    /**
     * Create a MIKEYMessage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MIKEYMessage(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MIKEYMessage> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MIKEYMessage(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewFromBytes(org.gtk.glib.Bytes bytes, org.gstreamer.sdp.MIKEYDecryptInfo info) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
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
    }
        
    /**
     * Make a new {@link MIKEYMessage} from {@code bytes}.
     * @param bytes a {@link org.gtk.glib.Bytes}
     * @param info a {@link MIKEYDecryptInfo}
     * @return a new {@link MIKEYMessage}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static MIKEYMessage newFromBytes(org.gtk.glib.Bytes bytes, org.gstreamer.sdp.MIKEYDecryptInfo info) throws GErrorException {
        var RESULT = constructNewFromBytes(bytes, info);
        var OBJECT = org.gstreamer.sdp.MIKEYMessage.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromCaps(org.gstreamer.gst.Caps caps) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mikey_message_new_from_caps.invokeExact(caps.handle());
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
    public static MIKEYMessage newFromCaps(org.gstreamer.gst.Caps caps) {
        var RESULT = constructNewFromCaps(caps);
        var OBJECT = org.gstreamer.sdp.MIKEYMessage.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromData(byte[] data, long size, org.gstreamer.sdp.MIKEYDecryptInfo info) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_mikey_message_new_from_data.invokeExact(
                        Interop.allocateNativeArray(data, false, SCOPE),
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
    public static MIKEYMessage newFromData(byte[] data, long size, org.gstreamer.sdp.MIKEYDecryptInfo info) throws GErrorException {
        var RESULT = constructNewFromData(data, size, info);
        var OBJECT = org.gstreamer.sdp.MIKEYMessage.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Add a new payload to {@code msg}.
     * @param payload a {@link MIKEYPayload}
     * @return {@code true} on success
     */
    public boolean addPayload(org.gstreamer.sdp.MIKEYPayload payload) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_add_payload.invokeExact(
                    handle(),
                    payload.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        payload.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Add a new PKE payload to {@code msg} with the given parameters.
     * @param C envelope key cache indicator
     * @param dataLen the length of {@code data}
     * @param data the encrypted envelope key
     * @return {@code true} on success
     */
    public boolean addPke(org.gstreamer.sdp.MIKEYCacheType C, short dataLen, byte[] data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mikey_message_add_pke.invokeExact(
                        handle(),
                        C.getValue(),
                        dataLen,
                        Interop.allocateNativeArray(data, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Add a new RAND payload to {@code msg} with the given parameters.
     * @param len the length of {@code rand}
     * @param rand random data
     * @return {@code true} on success
     */
    public boolean addRand(byte len, byte[] rand) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mikey_message_add_rand.invokeExact(
                        handle(),
                        len,
                        Interop.allocateNativeArray(rand, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Add a new T payload to {@code msg} with the given parameters.
     * @param type specifies the timestamp type used
     * @param tsValue The timestamp value of the specified {@code type}
     * @return {@code true} on success
     */
    public boolean addT(org.gstreamer.sdp.MIKEYTSType type, byte[] tsValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_mikey_message_add_t.invokeExact(
                        handle(),
                        type.getValue(),
                        Interop.allocateNativeArray(tsValue, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Add a new T payload to {@code msg} that contains the current time
     * in NTP-UTC format.
     * @return {@code true} on success
     */
    public boolean addTNowNtpUtc() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_add_t_now_ntp_utc.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public java.lang.String base64Encode() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mikey_message_base64_encode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Find the {@code nth} occurrence of the payload with {@code type} in {@code msg}.
     * @param type a {@link MIKEYPayloadType}
     * @param nth payload to find
     * @return the {@code nth} {@link MIKEYPayload} of {@code type}.
     */
    public org.gstreamer.sdp.MIKEYPayload findPayload(org.gstreamer.sdp.MIKEYPayloadType type, int nth) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mikey_message_find_payload.invokeExact(
                    handle(),
                    type.getValue(),
                    nth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.MIKEYPayload.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get the policy information of {@code msg} at {@code idx}.
     * @param idx an index
     * @return a {@link MIKEYMapSRTP}
     */
    public org.gstreamer.sdp.MIKEYMapSRTP getCsSrtp(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mikey_message_get_cs_srtp.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.MIKEYMapSRTP.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get the number of crypto sessions in {@code msg}.
     * @return the number of crypto sessions
     */
    public int getNCs() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_get_n_cs.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gst_mikey_message_get_n_payloads.invokeExact(handle());
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
    public org.gstreamer.sdp.MIKEYPayload getPayload(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mikey_message_get_payload.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.MIKEYPayload.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Insert a Crypto Session map for SRTP in {@code msg} at {@code idx}
     * <p>
     * When {@code idx} is -1, the policy will be appended.
     * @param idx the index to insert at
     * @param map the map info
     * @return {@code true} on success
     */
    public boolean insertCsSrtp(int idx, org.gstreamer.sdp.MIKEYMapSRTP map) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_insert_cs_srtp.invokeExact(
                    handle(),
                    idx,
                    map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Insert the {@code payload} at index {@code idx} in {@code msg}. If {@code idx} is -1, the payload
     * will be appended to {@code msg}.
     * @param idx an index
     * @param payload a {@link MIKEYPayload}
     * @return {@code true} on success
     */
    public boolean insertPayload(int idx, org.gstreamer.sdp.MIKEYPayload payload) {
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Replace a Crypto Session map for SRTP in {@code msg} at {@code idx} with {@code map}.
     * @param idx the index to insert at
     * @param map the map info
     * @return {@code true} on success
     */
    public boolean replaceCsSrtp(int idx, org.gstreamer.sdp.MIKEYMapSRTP map) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_replace_cs_srtp.invokeExact(
                    handle(),
                    idx,
                    map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Replace the payload at {@code idx} in {@code msg} with {@code payload}.
     * @param idx an index
     * @param payload a {@link MIKEYPayload}
     * @return {@code true} on success
     */
    public boolean replacePayload(int idx, org.gstreamer.sdp.MIKEYPayload payload) {
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public boolean setInfo(byte version, org.gstreamer.sdp.MIKEYType type, boolean V, org.gstreamer.sdp.MIKEYPRFFunc prfFunc, int CSBId, org.gstreamer.sdp.MIKEYMapType mapType) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_set_info.invokeExact(
                    handle(),
                    version,
                    type.getValue(),
                    Marshal.booleanToInteger.marshal(V, null).intValue(),
                    prfFunc.getValue(),
                    CSBId,
                    mapType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Convert {@code msg} to a {@link org.gtk.glib.Bytes}.
     * @param info a {@link MIKEYEncryptInfo}
     * @return a new {@link org.gtk.glib.Bytes} for {@code msg}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.Bytes toBytes(org.gstreamer.sdp.MIKEYEncryptInfo info) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
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
            var OBJECT = org.gtk.glib.Bytes.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    public boolean toCaps(org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mikey_message_to_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * A {@link MIKEYMessage.Builder} object constructs a {@link MIKEYMessage} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MIKEYMessage.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MIKEYMessage struct;
        
        private Builder() {
            struct = MIKEYMessage.allocate();
        }
        
        /**
         * Finish building the {@link MIKEYMessage} struct.
         * @return A new instance of {@code MIKEYMessage} with the fields 
         *         that were set in the Builder object.
         */
        public MIKEYMessage build() {
            return struct;
        }
        
        public Builder setMiniObject(org.gstreamer.gst.MiniObject miniObject) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mini_object"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (miniObject == null ? MemoryAddress.NULL : miniObject.handle()));
                return this;
            }
        }
        
        /**
         * the version
         * @param version The value for the {@code version} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVersion(byte version) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("version"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), version);
                return this;
            }
        }
        
        /**
         * the {@link MIKEYType} message type
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(org.gstreamer.sdp.MIKEYType type) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
                return this;
            }
        }
        
        /**
         * verify flag
         * @param V The value for the {@code V} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setV(boolean V) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("V"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(V, null).intValue());
                return this;
            }
        }
        
        /**
         * a {@link MIKEYPRFFunc}
         * @param prfFunc The value for the {@code prfFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPrfFunc(org.gstreamer.sdp.MIKEYPRFFunc prfFunc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("prf_func"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prfFunc == null ? MemoryAddress.NULL : prfFunc.getValue()));
                return this;
            }
        }
        
        /**
         * Identifies the Crypto Session Bundle
         * @param CSBId The value for the {@code CSBId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCSBId(int CSBId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("CSB_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), CSBId);
                return this;
            }
        }
        
        /**
         * a {@link MIKEYMapType}
         * @param mapType The value for the {@code mapType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMapType(org.gstreamer.sdp.MIKEYMapType mapType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("map_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mapType == null ? MemoryAddress.NULL : mapType.getValue()));
                return this;
            }
        }
        
        /**
         * map info array of type depending on {@code map_type}
         * @param mapInfo The value for the {@code mapInfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMapInfo(java.lang.foreign.MemoryAddress[] mapInfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("map_info"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mapInfo == null ? MemoryAddress.NULL : Interop.allocateNativeArray(mapInfo, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * the payload array of {@link MIKEYPayload}
         * @param payloads The value for the {@code payloads} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPayloads(java.lang.foreign.MemoryAddress[] payloads) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("payloads"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (payloads == null ? MemoryAddress.NULL : Interop.allocateNativeArray(payloads, false, SCOPE)));
                return this;
            }
        }
    }
}
