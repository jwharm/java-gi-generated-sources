package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data structure that points to a packet at {@code offset} in {@code buffer}.
 * The size of the structure is made public to allow stack allocations.
 */
public class RTCPPacket extends Struct {
    
    static {
        GstRtp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTCPPacket";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("rtcp"),
            Interop.valueLayout.C_INT.withName("offset"),
            Interop.valueLayout.C_INT.withName("padding"),
            Interop.valueLayout.C_BYTE.withName("count"),
            MemoryLayout.paddingLayout(24),
            Interop.valueLayout.C_INT.withName("type"),
            Interop.valueLayout.C_SHORT.withName("length"),
            MemoryLayout.paddingLayout(16),
            Interop.valueLayout.C_INT.withName("item_offset"),
            Interop.valueLayout.C_INT.withName("item_count"),
            Interop.valueLayout.C_INT.withName("entry_offset")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RTCPPacket}
     * @return A new, uninitialized @{link RTCPPacket}
     */
    public static RTCPPacket allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTCPPacket newInstance = new RTCPPacket(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code rtcp}
     * @return The value of the field {@code rtcp}
     */
    public org.gstreamer.rtp.RTCPBuffer getRtcp() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("rtcp"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.rtp.RTCPBuffer.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code rtcp}
     * @param rtcp The new value of the field {@code rtcp}
     */
    public void setRtcp(org.gstreamer.rtp.RTCPBuffer rtcp) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("rtcp"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rtcp == null ? MemoryAddress.NULL : rtcp.handle()));
    }
    
    /**
     * Get the value of the field {@code offset}
     * @return The value of the field {@code offset}
     */
    public int getOffset() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("offset"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code offset}
     * @param offset The new value of the field {@code offset}
     */
    public void setOffset(int offset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("offset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), offset);
    }
    
    /**
     * Create a RTCPPacket proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RTCPPacket(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTCPPacket> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RTCPPacket(input, ownership);
    
    /**
     * Add profile-specific extension {@code data} to {@code packet}. If {@code packet} already
     * contains profile-specific extension {@code data} will be appended to the existing
     * extension.
     * @param data profile-specific data
     * @param len length of the profile-specific data in bytes
     * @return {@code true} if the profile specific extension data was added.
     */
    public boolean addProfileSpecificExt(byte[] data, int len) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_add_profile_specific_ext.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(data, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Add a new report block to {@code packet} with the given values.
     * @param ssrc data source being reported
     * @param fractionlost fraction lost since last SR/RR
     * @param packetslost the cumululative number of packets lost
     * @param exthighestseq the extended last sequence number received
     * @param jitter the interarrival jitter
     * @param lsr the last SR packet from this source
     * @param dlsr the delay since last SR packet
     * @return {@code true} if the packet was created. This function can return {@code false} if
     * the max MTU is exceeded or the number of report blocks is greater than
     * {@code GST_RTCP_MAX_RB_COUNT}.
     */
    public boolean addRb(int ssrc, byte fractionlost, int packetslost, int exthighestseq, int jitter, int lsr, int dlsr) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_add_rb.invokeExact(
                    handle(),
                    ssrc,
                    fractionlost,
                    packetslost,
                    exthighestseq,
                    jitter,
                    lsr,
                    dlsr);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the application-dependent data attached to a RTPFB or PSFB {@code packet}.
     * @return A pointer to the data
     */
    public PointerByte appGetData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtcp_packet_app_get_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    /**
     * Get the length of the application-dependent data attached to an APP
     * {@code packet}.
     * @return The length of data in 32-bit words.
     */
    public short appGetDataLength() {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.gst_rtcp_packet_app_get_data_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the name field of the APP {@code packet}.
     * @return The 4-byte name field, not zero-terminated.
     */
    public java.lang.String appGetName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtcp_packet_app_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the SSRC/CSRC field of the APP {@code packet}.
     * @return The SSRC/CSRC.
     */
    public int appGetSsrc() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_app_get_ssrc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the subtype field of the APP {@code packet}.
     * @return The subtype.
     */
    public byte appGetSubtype() {
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.gst_rtcp_packet_app_get_subtype.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Set the length of the application-dependent data attached to an APP
     * {@code packet}.
     * @param wordlen Length of the data in 32-bit words
     * @return {@code true} if there was enough space in the packet to add this much
     * data.
     */
    public boolean appSetDataLength(short wordlen) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_app_set_data_length.invokeExact(
                    handle(),
                    wordlen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set the name field of the APP {@code packet}.
     * @param name 4-byte ASCII name
     */
    public void appSetName(java.lang.String name) {
        try {
            DowncallHandles.gst_rtcp_packet_app_set_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the SSRC/CSRC field of the APP {@code packet}.
     * @param ssrc SSRC/CSRC of the packet
     */
    public void appSetSsrc(int ssrc) {
        try {
            DowncallHandles.gst_rtcp_packet_app_set_ssrc.invokeExact(
                    handle(),
                    ssrc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the subtype field of the APP {@code packet}.
     * @param subtype subtype of the packet
     */
    public void appSetSubtype(byte subtype) {
        try {
            DowncallHandles.gst_rtcp_packet_app_set_subtype.invokeExact(
                    handle(),
                    subtype);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Add {@code ssrc} to the BYE {@code packet}.
     * @param ssrc an SSRC to add
     * @return {@code true} if the ssrc was added. This function can return {@code false} if
     * the max MTU is exceeded or the number of sources blocks is greater than
     * {@code GST_RTCP_MAX_BYE_SSRC_COUNT}.
     */
    public boolean byeAddSsrc(int ssrc) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_bye_add_ssrc.invokeExact(
                    handle(),
                    ssrc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Adds {@code len} SSRCs in {@code ssrc} to BYE {@code packet}.
     * @param ssrc an array of SSRCs to add
     * @param len number of elements in {@code ssrc}
     * @return {@code true} if the all the SSRCs were added. This function can return {@code false} if
     * the max MTU is exceeded or the number of sources blocks is greater than
     * {@code GST_RTCP_MAX_BYE_SSRC_COUNT}.
     */
    public boolean byeAddSsrcs(int[] ssrc, int len) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_bye_add_ssrcs.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(ssrc, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the {@code nth} SSRC of the BYE {@code packet}.
     * @param nth the nth SSRC to get
     * @return The {@code nth} SSRC of {@code packet}.
     */
    public int byeGetNthSsrc(int nth) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_bye_get_nth_ssrc.invokeExact(
                    handle(),
                    nth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the reason in {@code packet}.
     * @return The reason for the BYE {@code packet} or NULL if the packet did not contain
     * a reason string. The string must be freed with g_free() after usage.
     */
    public java.lang.String byeGetReason() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtcp_packet_bye_get_reason.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the length of the reason string.
     * @return The length of the reason string or 0 when there is no reason string
     * present.
     */
    public byte byeGetReasonLen() {
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.gst_rtcp_packet_bye_get_reason_len.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the number of SSRC fields in {@code packet}.
     * @return The number of SSRC fields in {@code packet}.
     */
    public int byeGetSsrcCount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_bye_get_ssrc_count.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Set the reason string to {@code reason} in {@code packet}.
     * @param reason a reason string
     * @return TRUE if the string could be set.
     */
    public boolean byeSetReason(java.lang.String reason) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_bye_set_reason.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(reason, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * The profile-specific extension data is copied into a new allocated
     * memory area {@code data}. This must be freed with g_free() after usage.
     * @param data result profile-specific data
     * @param len length of the profile-specific extension data
     * @return {@code true} if there was valid data.
     */
    public boolean copyProfileSpecificExt(Out<byte[]> data, Out<Integer> len) {
        MemorySegment dataPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment lenPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_copy_profile_specific_ext.invokeExact(
                    handle(),
                    (Addressable) dataPOINTER.address(),
                    (Addressable) lenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        len.set(lenPOINTER.get(Interop.valueLayout.C_INT, 0));
        data.set(MemorySegment.ofAddress(dataPOINTER.get(Interop.valueLayout.ADDRESS, 0), len.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the Feedback Control Information attached to a RTPFB or PSFB {@code packet}.
     * @return a pointer to the FCI
     */
    public PointerByte fbGetFci() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtcp_packet_fb_get_fci.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    /**
     * Get the length of the Feedback Control Information attached to a
     * RTPFB or PSFB {@code packet}.
     * @return The length of the FCI in 32-bit words.
     */
    public short fbGetFciLength() {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.gst_rtcp_packet_fb_get_fci_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the media SSRC field of the RTPFB or PSFB {@code packet}.
     * @return the media SSRC.
     */
    public int fbGetMediaSsrc() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_fb_get_media_ssrc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the sender SSRC field of the RTPFB or PSFB {@code packet}.
     * @return the sender SSRC.
     */
    public int fbGetSenderSsrc() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_fb_get_sender_ssrc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the feedback message type of the FB {@code packet}.
     * @return The feedback message type.
     */
    public org.gstreamer.rtp.RTCPFBType fbGetType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_fb_get_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtp.RTCPFBType.of(RESULT);
    }
    
    /**
     * Set the length of the Feedback Control Information attached to a
     * RTPFB or PSFB {@code packet}.
     * @param wordlen Length of the FCI in 32-bit words
     * @return {@code true} if there was enough space in the packet to add this much FCI
     */
    public boolean fbSetFciLength(short wordlen) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_fb_set_fci_length.invokeExact(
                    handle(),
                    wordlen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set the media SSRC field of the RTPFB or PSFB {@code packet}.
     * @param ssrc a media SSRC
     */
    public void fbSetMediaSsrc(int ssrc) {
        try {
            DowncallHandles.gst_rtcp_packet_fb_set_media_ssrc.invokeExact(
                    handle(),
                    ssrc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the sender SSRC field of the RTPFB or PSFB {@code packet}.
     * @param ssrc a sender SSRC
     */
    public void fbSetSenderSsrc(int ssrc) {
        try {
            DowncallHandles.gst_rtcp_packet_fb_set_sender_ssrc.invokeExact(
                    handle(),
                    ssrc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the feedback message type of the FB {@code packet}.
     * @param type the {@link RTCPFBType} to set
     */
    public void fbSetType(org.gstreamer.rtp.RTCPFBType type) {
        try {
            DowncallHandles.gst_rtcp_packet_fb_set_type.invokeExact(
                    handle(),
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the count field in {@code packet}.
     * @return The count field in {@code packet} or -1 if {@code packet} does not point to a
     * valid packet.
     */
    public byte getCount() {
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.gst_rtcp_packet_get_count.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the length field of {@code packet}. This is the length of the packet in
     * 32-bit words minus one.
     * @return The length field of {@code packet}.
     */
    public short getLength() {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.gst_rtcp_packet_get_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the packet padding of the packet pointed to by {@code packet}.
     * @return If the packet has the padding bit set.
     */
    public boolean getPadding() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_get_padding.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean getProfileSpecificExt(Out<byte[]> data, Out<Integer> len) {
        MemorySegment dataPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment lenPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_get_profile_specific_ext.invokeExact(
                    handle(),
                    (Addressable) dataPOINTER.address(),
                    (Addressable) lenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        len.set(lenPOINTER.get(Interop.valueLayout.C_INT, 0));
        data.set(MemorySegment.ofAddress(dataPOINTER.get(Interop.valueLayout.ADDRESS, 0), len.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public short getProfileSpecificExtLength() {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.gst_rtcp_packet_get_profile_specific_ext_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Parse the values of the {@code nth} report block in {@code packet} and store the result in
     * the values.
     * @param nth the nth report block in {@code packet}
     * @param ssrc result for data source being reported
     * @param fractionlost result for fraction lost since last SR/RR
     * @param packetslost result for the cumululative number of packets lost
     * @param exthighestseq result for the extended last sequence number received
     * @param jitter result for the interarrival jitter
     * @param lsr result for the last SR packet from this source
     * @param dlsr result for the delay since last SR packet
     */
    public void getRb(int nth, Out<Integer> ssrc, Out<Byte> fractionlost, Out<Integer> packetslost, Out<Integer> exthighestseq, Out<Integer> jitter, Out<Integer> lsr, Out<Integer> dlsr) {
        MemorySegment ssrcPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment fractionlostPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        MemorySegment packetslostPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment exthighestseqPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment jitterPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment lsrPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment dlsrPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_rtcp_packet_get_rb.invokeExact(
                    handle(),
                    nth,
                    (Addressable) ssrcPOINTER.address(),
                    (Addressable) fractionlostPOINTER.address(),
                    (Addressable) packetslostPOINTER.address(),
                    (Addressable) exthighestseqPOINTER.address(),
                    (Addressable) jitterPOINTER.address(),
                    (Addressable) lsrPOINTER.address(),
                    (Addressable) dlsrPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        ssrc.set(ssrcPOINTER.get(Interop.valueLayout.C_INT, 0));
        fractionlost.set(fractionlostPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        packetslost.set(packetslostPOINTER.get(Interop.valueLayout.C_INT, 0));
        exthighestseq.set(exthighestseqPOINTER.get(Interop.valueLayout.C_INT, 0));
        jitter.set(jitterPOINTER.get(Interop.valueLayout.C_INT, 0));
        lsr.set(lsrPOINTER.get(Interop.valueLayout.C_INT, 0));
        dlsr.set(dlsrPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Get the number of report blocks in {@code packet}.
     * @return The number of report blocks in {@code packet}.
     */
    public int getRbCount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_get_rb_count.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the packet type of the packet pointed to by {@code packet}.
     * @return The packet type or GST_RTCP_TYPE_INVALID when {@code packet} is not
     * pointing to a valid packet.
     */
    public org.gstreamer.rtp.RTCPType getType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_get_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtp.RTCPType.of(RESULT);
    }
    
    /**
     * Move the packet pointer {@code packet} to the next packet in the payload.
     * Use gst_rtcp_buffer_get_first_packet() to initialize {@code packet}.
     * @return TRUE if {@code packet} is pointing to a valid packet after calling this
     * function.
     */
    public boolean moveToNext() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_move_to_next.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Removes the packet pointed to by {@code packet} and moves pointer to the next one
     * @return TRUE if {@code packet} is pointing to a valid packet after calling this
     * function.
     */
    public boolean remove() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_remove.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the ssrc field of the RR {@code packet}.
     * @return the ssrc.
     */
    public int rrGetSsrc() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_rr_get_ssrc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Set the ssrc field of the RR {@code packet}.
     * @param ssrc the SSRC to set
     */
    public void rrSetSsrc(int ssrc) {
        try {
            DowncallHandles.gst_rtcp_packet_rr_set_ssrc.invokeExact(
                    handle(),
                    ssrc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Add a new SDES entry to the current item in {@code packet}.
     * @param type the {@link RTCPSDESType} of the SDES entry
     * @param len the data length
     * @param data the data
     * @return {@code true} if the item could be added, {@code false} if the MTU has been
     * reached.
     */
    public boolean sdesAddEntry(org.gstreamer.rtp.RTCPSDESType type, byte len, byte[] data) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_sdes_add_entry.invokeExact(
                    handle(),
                    type.getValue(),
                    len,
                    Interop.allocateNativeArray(data, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Add a new SDES item for {@code ssrc} to {@code packet}.
     * @param ssrc the SSRC of the new item to add
     * @return {@code true} if the item could be added, {@code false} if the maximum amount of
     * items has been exceeded for the SDES packet or the MTU has been reached.
     */
    public boolean sdesAddItem(int ssrc) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_sdes_add_item.invokeExact(
                    handle(),
                    ssrc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * This function is like gst_rtcp_packet_sdes_get_entry() but it returns a
     * null-terminated copy of the data instead. use g_free() after usage.
     * @param type result of the entry type
     * @param len result length of the entry data
     * @param data result entry data
     * @return {@code true} if there was valid data.
     */
    public boolean sdesCopyEntry(PointerEnumeration<org.gstreamer.rtp.RTCPSDESType> type, Out<Byte> len, Out<byte[]> data) {
        MemorySegment lenPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        MemorySegment dataPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_sdes_copy_entry.invokeExact(
                    handle(),
                    type.handle(),
                    (Addressable) lenPOINTER.address(),
                    (Addressable) dataPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        len.set(lenPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        data.set(MemorySegment.ofAddress(dataPOINTER.get(Interop.valueLayout.ADDRESS, 0), len.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Move to the first SDES entry in the current item.
     * @return {@code true} if there was a first entry.
     */
    public boolean sdesFirstEntry() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_sdes_first_entry.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Move to the first SDES item in {@code packet}.
     * @return TRUE if there was a first item.
     */
    public boolean sdesFirstItem() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_sdes_first_item.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the data of the current SDES item entry. {@code type} (when not NULL) will
     * contain the type of the entry. {@code data} (when not NULL) will point to {@code len}
     * bytes.
     * <p>
     * When {@code type} refers to a text item, {@code data} will point to a UTF8 string. Note
     * that this UTF8 string is NOT null-terminated. Use
     * gst_rtcp_packet_sdes_copy_entry() to get a null-terminated copy of the entry.
     * @param type result of the entry type
     * @param len result length of the entry data
     * @param data result entry data
     * @return {@code true} if there was valid data.
     */
    public boolean sdesGetEntry(PointerEnumeration<org.gstreamer.rtp.RTCPSDESType> type, Out<Byte> len, Out<byte[]> data) {
        MemorySegment lenPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        MemorySegment dataPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_sdes_get_entry.invokeExact(
                    handle(),
                    type.handle(),
                    (Addressable) lenPOINTER.address(),
                    (Addressable) dataPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        len.set(lenPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        data.set(MemorySegment.ofAddress(dataPOINTER.get(Interop.valueLayout.ADDRESS, 0), len.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the number of items in the SDES packet {@code packet}.
     * @return The number of items in {@code packet}.
     */
    public int sdesGetItemCount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_sdes_get_item_count.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the SSRC of the current SDES item.
     * @return the SSRC of the current item.
     */
    public int sdesGetSsrc() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_sdes_get_ssrc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Move to the next SDES entry in the current item.
     * @return {@code true} if there was a next entry.
     */
    public boolean sdesNextEntry() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_sdes_next_entry.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Move to the next SDES item in {@code packet}.
     * @return TRUE if there was a next item.
     */
    public boolean sdesNextItem() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_sdes_next_item.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set the {@code nth} new report block in {@code packet} with the given values.
     * <p>
     * Note: Not implemented.
     * @param nth the nth report block to set
     * @param ssrc data source being reported
     * @param fractionlost fraction lost since last SR/RR
     * @param packetslost the cumululative number of packets lost
     * @param exthighestseq the extended last sequence number received
     * @param jitter the interarrival jitter
     * @param lsr the last SR packet from this source
     * @param dlsr the delay since last SR packet
     */
    public void setRb(int nth, int ssrc, byte fractionlost, int packetslost, int exthighestseq, int jitter, int lsr, int dlsr) {
        try {
            DowncallHandles.gst_rtcp_packet_set_rb.invokeExact(
                    handle(),
                    nth,
                    ssrc,
                    fractionlost,
                    packetslost,
                    exthighestseq,
                    jitter,
                    lsr,
                    dlsr);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Parse the SR sender info and store the values.
     * @param ssrc result SSRC
     * @param ntptime result NTP time
     * @param rtptime result RTP time
     * @param packetCount result packet count
     * @param octetCount result octet count
     */
    public void srGetSenderInfo(Out<Integer> ssrc, Out<Long> ntptime, Out<Integer> rtptime, Out<Integer> packetCount, Out<Integer> octetCount) {
        MemorySegment ssrcPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment ntptimePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment rtptimePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment packetCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment octetCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_rtcp_packet_sr_get_sender_info.invokeExact(
                    handle(),
                    (Addressable) ssrcPOINTER.address(),
                    (Addressable) ntptimePOINTER.address(),
                    (Addressable) rtptimePOINTER.address(),
                    (Addressable) packetCountPOINTER.address(),
                    (Addressable) octetCountPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        ssrc.set(ssrcPOINTER.get(Interop.valueLayout.C_INT, 0));
        ntptime.set(ntptimePOINTER.get(Interop.valueLayout.C_LONG, 0));
        rtptime.set(rtptimePOINTER.get(Interop.valueLayout.C_INT, 0));
        packetCount.set(packetCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        octetCount.set(octetCountPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Set the given values in the SR packet {@code packet}.
     * @param ssrc the SSRC
     * @param ntptime the NTP time
     * @param rtptime the RTP time
     * @param packetCount the packet count
     * @param octetCount the octet count
     */
    public void srSetSenderInfo(int ssrc, long ntptime, int rtptime, int packetCount, int octetCount) {
        try {
            DowncallHandles.gst_rtcp_packet_sr_set_sender_info.invokeExact(
                    handle(),
                    ssrc,
                    ntptime,
                    rtptime,
                    packetCount,
                    octetCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Move to the first extended report block in XR {@code packet}.
     * @return TRUE if there was a first extended report block.
     */
    public boolean xrFirstRb() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_first_rb.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public short xrGetBlockLength() {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.gst_rtcp_packet_xr_get_block_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the extended report block type of the XR {@code packet}.
     * @return The extended report block type.
     */
    public org.gstreamer.rtp.RTCPXRType xrGetBlockType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_block_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtp.RTCPXRType.of(RESULT);
    }
    
    /**
     * Parse the extended report block for DLRR report block type.
     * @param nth the index of sub-block to retrieve.
     * @param ssrc the SSRC of the receiver.
     * @param lastRr the last receiver reference timestamp of {@code ssrc}.
     * @param delay the delay since {@code last_rr}.
     * @return {@code true} if the report block is correctly parsed.
     */
    public boolean xrGetDlrrBlock(int nth, PointerInteger ssrc, PointerInteger lastRr, PointerInteger delay) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_dlrr_block.invokeExact(
                    handle(),
                    nth,
                    ssrc.handle(),
                    lastRr.handle(),
                    delay.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieve the packet receipt time of {@code seq} which ranges in [begin_seq, end_seq).
     * @param seq the sequence to retrieve the time.
     * @param receiptTime the packet receipt time of {@code seq}.
     * @return {@code true} if the report block returns the receipt time correctly.
     */
    public boolean xrGetPrtBySeq(short seq, PointerInteger receiptTime) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_prt_by_seq.invokeExact(
                    handle(),
                    seq,
                    receiptTime.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Parse the Packet Recept Times Report Block from a XR {@code packet}
     * @param ssrc the SSRC of the RTP data packet source being reported upon by this report block.
     * @param thinning the amount of thinning performed on the sequence number space.
     * @param beginSeq the first sequence number that this block reports on.
     * @param endSeq the last sequence number that this block reports on plus one.
     * @return {@code true} if the report block is correctly parsed.
     */
    public boolean xrGetPrtInfo(PointerInteger ssrc, PointerByte thinning, PointerShort beginSeq, PointerShort endSeq) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_prt_info.invokeExact(
                    handle(),
                    ssrc.handle(),
                    thinning.handle(),
                    beginSeq.handle(),
                    endSeq.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Parse the extended report block for Loss RLE and Duplicated LRE block type.
     * @param ssrc the SSRC of the RTP data packet source being reported upon by this report block.
     * @param thinning the amount of thinning performed on the sequence number space.
     * @param beginSeq the first sequence number that this block reports on.
     * @param endSeq the last sequence number that this block reports on plus one.
     * @param chunkCount the number of chunks calculated by block length.
     * @return {@code true} if the report block is correctly parsed.
     */
    public boolean xrGetRleInfo(PointerInteger ssrc, PointerByte thinning, PointerShort beginSeq, PointerShort endSeq, PointerInteger chunkCount) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_rle_info.invokeExact(
                    handle(),
                    ssrc.handle(),
                    thinning.handle(),
                    beginSeq.handle(),
                    endSeq.handle(),
                    chunkCount.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieve actual chunk data.
     * @param nth the index of chunk to retrieve.
     * @param chunk the {@code nth} chunk.
     * @return {@code true} if the report block returns chunk correctly.
     */
    public boolean xrGetRleNthChunk(int nth, PointerShort chunk) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_rle_nth_chunk.invokeExact(
                    handle(),
                    nth,
                    chunk.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean xrGetRrt(PointerLong timestamp) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_rrt.invokeExact(
                    handle(),
                    timestamp.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the ssrc field of the XR {@code packet}.
     * @return the ssrc.
     */
    public int xrGetSsrc() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_ssrc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Extract a basic information from static summary report block of XR {@code packet}.
     * @param ssrc the SSRC of the source.
     * @param beginSeq the first sequence number that this block reports on.
     * @param endSeq the last sequence number that this block reports on plus one.
     * @return {@code true} if the report block is correctly parsed.
     */
    public boolean xrGetSummaryInfo(PointerInteger ssrc, PointerShort beginSeq, PointerShort endSeq) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_summary_info.invokeExact(
                    handle(),
                    ssrc.handle(),
                    beginSeq.handle(),
                    endSeq.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Extract jitter information from the statistics summary. If the jitter flag in
     * a block header is set as zero, all of jitters will be zero.
     * @param minJitter the minimum relative transit time between two sequences.
     * @param maxJitter the maximum relative transit time between two sequences.
     * @param meanJitter the mean relative transit time between two sequences.
     * @param devJitter the standard deviation of the relative transit time between two sequences.
     * @return {@code true} if the report block is correctly parsed.
     */
    public boolean xrGetSummaryJitter(PointerInteger minJitter, PointerInteger maxJitter, PointerInteger meanJitter, PointerInteger devJitter) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_summary_jitter.invokeExact(
                    handle(),
                    minJitter.handle(),
                    maxJitter.handle(),
                    meanJitter.handle(),
                    devJitter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the number of lost or duplicate packets. If the flag in a block header
     * is set as zero, {@code lost_packets} or {@code dup_packets} will be zero.
     * @param lostPackets the number of lost packets between begin_seq and end_seq.
     * @param dupPackets the number of duplicate packets between begin_seq and end_seq.
     * @return {@code true} if the report block is correctly parsed.
     */
    public boolean xrGetSummaryPkt(PointerInteger lostPackets, PointerInteger dupPackets) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_summary_pkt.invokeExact(
                    handle(),
                    lostPackets.handle(),
                    dupPackets.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Extract the value of ttl for ipv4, or hop limit for ipv6.
     * @param isIpv4 the flag to indicate that the return values are ipv4 ttl or ipv6 hop limits.
     * @param minTtl the minimum TTL or Hop Limit value of data packets between two sequences.
     * @param maxTtl the maximum TTL or Hop Limit value of data packets between two sequences.
     * @param meanTtl the mean TTL or Hop Limit value of data packets between two sequences.
     * @param devTtl the standard deviation of the TTL or Hop Limit value of data packets between two sequences.
     * @return {@code true} if the report block is correctly parsed.
     */
    public boolean xrGetSummaryTtl(PointerBoolean isIpv4, PointerByte minTtl, PointerByte maxTtl, PointerByte meanTtl, PointerByte devTtl) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_summary_ttl.invokeExact(
                    handle(),
                    isIpv4.handle(),
                    minTtl.handle(),
                    maxTtl.handle(),
                    meanTtl.handle(),
                    devTtl.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean xrGetVoipBurstMetrics(PointerByte burstDensity, PointerByte gapDensity, PointerShort burstDuration, PointerShort gapDuration) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_voip_burst_metrics.invokeExact(
                    handle(),
                    burstDensity.handle(),
                    gapDensity.handle(),
                    burstDuration.handle(),
                    gapDuration.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean xrGetVoipConfigurationParams(PointerByte gmin, PointerByte rxConfig) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_voip_configuration_params.invokeExact(
                    handle(),
                    gmin.handle(),
                    rxConfig.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean xrGetVoipDelayMetrics(PointerShort roundtripDelay, PointerShort endSystemDelay) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_voip_delay_metrics.invokeExact(
                    handle(),
                    roundtripDelay.handle(),
                    endSystemDelay.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean xrGetVoipJitterBufferParams(PointerShort jbNominal, PointerShort jbMaximum, PointerShort jbAbsMax) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_voip_jitter_buffer_params.invokeExact(
                    handle(),
                    jbNominal.handle(),
                    jbMaximum.handle(),
                    jbAbsMax.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean xrGetVoipMetricsSsrc(PointerInteger ssrc) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_voip_metrics_ssrc.invokeExact(
                    handle(),
                    ssrc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean xrGetVoipPacketMetrics(PointerByte lossRate, PointerByte discardRate) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_voip_packet_metrics.invokeExact(
                    handle(),
                    lossRate.handle(),
                    discardRate.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean xrGetVoipQualityMetrics(PointerByte rFactor, PointerByte extRFactor, PointerByte mosLq, PointerByte mosCq) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_voip_quality_metrics.invokeExact(
                    handle(),
                    rFactor.handle(),
                    extRFactor.handle(),
                    mosLq.handle(),
                    mosCq.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean xrGetVoipSignalMetrics(PointerByte signalLevel, PointerByte noiseLevel, PointerByte rerl, PointerByte gmin) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_get_voip_signal_metrics.invokeExact(
                    handle(),
                    signalLevel.handle(),
                    noiseLevel.handle(),
                    rerl.handle(),
                    gmin.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Move to the next extended report block in XR {@code packet}.
     * @return TRUE if there was a next extended report block.
     */
    public boolean xrNextRb() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_packet_xr_next_rb.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtcp_packet_add_profile_specific_ext = Interop.downcallHandle(
            "gst_rtcp_packet_add_profile_specific_ext",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_add_rb = Interop.downcallHandle(
            "gst_rtcp_packet_add_rb",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_app_get_data = Interop.downcallHandle(
            "gst_rtcp_packet_app_get_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_app_get_data_length = Interop.downcallHandle(
            "gst_rtcp_packet_app_get_data_length",
            FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_app_get_name = Interop.downcallHandle(
            "gst_rtcp_packet_app_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_app_get_ssrc = Interop.downcallHandle(
            "gst_rtcp_packet_app_get_ssrc",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_app_get_subtype = Interop.downcallHandle(
            "gst_rtcp_packet_app_get_subtype",
            FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_app_set_data_length = Interop.downcallHandle(
            "gst_rtcp_packet_app_set_data_length",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_app_set_name = Interop.downcallHandle(
            "gst_rtcp_packet_app_set_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_app_set_ssrc = Interop.downcallHandle(
            "gst_rtcp_packet_app_set_ssrc",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_app_set_subtype = Interop.downcallHandle(
            "gst_rtcp_packet_app_set_subtype",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_bye_add_ssrc = Interop.downcallHandle(
            "gst_rtcp_packet_bye_add_ssrc",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_bye_add_ssrcs = Interop.downcallHandle(
            "gst_rtcp_packet_bye_add_ssrcs",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_bye_get_nth_ssrc = Interop.downcallHandle(
            "gst_rtcp_packet_bye_get_nth_ssrc",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_bye_get_reason = Interop.downcallHandle(
            "gst_rtcp_packet_bye_get_reason",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_bye_get_reason_len = Interop.downcallHandle(
            "gst_rtcp_packet_bye_get_reason_len",
            FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_bye_get_ssrc_count = Interop.downcallHandle(
            "gst_rtcp_packet_bye_get_ssrc_count",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_bye_set_reason = Interop.downcallHandle(
            "gst_rtcp_packet_bye_set_reason",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_copy_profile_specific_ext = Interop.downcallHandle(
            "gst_rtcp_packet_copy_profile_specific_ext",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_fb_get_fci = Interop.downcallHandle(
            "gst_rtcp_packet_fb_get_fci",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_fb_get_fci_length = Interop.downcallHandle(
            "gst_rtcp_packet_fb_get_fci_length",
            FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_fb_get_media_ssrc = Interop.downcallHandle(
            "gst_rtcp_packet_fb_get_media_ssrc",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_fb_get_sender_ssrc = Interop.downcallHandle(
            "gst_rtcp_packet_fb_get_sender_ssrc",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_fb_get_type = Interop.downcallHandle(
            "gst_rtcp_packet_fb_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_fb_set_fci_length = Interop.downcallHandle(
            "gst_rtcp_packet_fb_set_fci_length",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_fb_set_media_ssrc = Interop.downcallHandle(
            "gst_rtcp_packet_fb_set_media_ssrc",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_fb_set_sender_ssrc = Interop.downcallHandle(
            "gst_rtcp_packet_fb_set_sender_ssrc",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_fb_set_type = Interop.downcallHandle(
            "gst_rtcp_packet_fb_set_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_get_count = Interop.downcallHandle(
            "gst_rtcp_packet_get_count",
            FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_get_length = Interop.downcallHandle(
            "gst_rtcp_packet_get_length",
            FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_get_padding = Interop.downcallHandle(
            "gst_rtcp_packet_get_padding",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_get_profile_specific_ext = Interop.downcallHandle(
            "gst_rtcp_packet_get_profile_specific_ext",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_get_profile_specific_ext_length = Interop.downcallHandle(
            "gst_rtcp_packet_get_profile_specific_ext_length",
            FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_get_rb = Interop.downcallHandle(
            "gst_rtcp_packet_get_rb",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_get_rb_count = Interop.downcallHandle(
            "gst_rtcp_packet_get_rb_count",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_get_type = Interop.downcallHandle(
            "gst_rtcp_packet_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_move_to_next = Interop.downcallHandle(
            "gst_rtcp_packet_move_to_next",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_remove = Interop.downcallHandle(
            "gst_rtcp_packet_remove",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_rr_get_ssrc = Interop.downcallHandle(
            "gst_rtcp_packet_rr_get_ssrc",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_rr_set_ssrc = Interop.downcallHandle(
            "gst_rtcp_packet_rr_set_ssrc",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_sdes_add_entry = Interop.downcallHandle(
            "gst_rtcp_packet_sdes_add_entry",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_sdes_add_item = Interop.downcallHandle(
            "gst_rtcp_packet_sdes_add_item",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_sdes_copy_entry = Interop.downcallHandle(
            "gst_rtcp_packet_sdes_copy_entry",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_sdes_first_entry = Interop.downcallHandle(
            "gst_rtcp_packet_sdes_first_entry",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_sdes_first_item = Interop.downcallHandle(
            "gst_rtcp_packet_sdes_first_item",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_sdes_get_entry = Interop.downcallHandle(
            "gst_rtcp_packet_sdes_get_entry",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_sdes_get_item_count = Interop.downcallHandle(
            "gst_rtcp_packet_sdes_get_item_count",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_sdes_get_ssrc = Interop.downcallHandle(
            "gst_rtcp_packet_sdes_get_ssrc",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_sdes_next_entry = Interop.downcallHandle(
            "gst_rtcp_packet_sdes_next_entry",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_sdes_next_item = Interop.downcallHandle(
            "gst_rtcp_packet_sdes_next_item",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_set_rb = Interop.downcallHandle(
            "gst_rtcp_packet_set_rb",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_sr_get_sender_info = Interop.downcallHandle(
            "gst_rtcp_packet_sr_get_sender_info",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_sr_set_sender_info = Interop.downcallHandle(
            "gst_rtcp_packet_sr_set_sender_info",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_first_rb = Interop.downcallHandle(
            "gst_rtcp_packet_xr_first_rb",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_block_length = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_block_length",
            FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_block_type = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_block_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_dlrr_block = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_dlrr_block",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_prt_by_seq = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_prt_by_seq",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_prt_info = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_prt_info",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_rle_info = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_rle_info",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_rle_nth_chunk = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_rle_nth_chunk",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_rrt = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_rrt",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_ssrc = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_ssrc",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_summary_info = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_summary_info",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_summary_jitter = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_summary_jitter",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_summary_pkt = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_summary_pkt",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_summary_ttl = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_summary_ttl",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_voip_burst_metrics = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_voip_burst_metrics",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_voip_configuration_params = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_voip_configuration_params",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_voip_delay_metrics = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_voip_delay_metrics",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_voip_jitter_buffer_params = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_voip_jitter_buffer_params",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_voip_metrics_ssrc = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_voip_metrics_ssrc",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_voip_packet_metrics = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_voip_packet_metrics",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_voip_quality_metrics = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_voip_quality_metrics",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_get_voip_signal_metrics = Interop.downcallHandle(
            "gst_rtcp_packet_xr_get_voip_signal_metrics",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtcp_packet_xr_next_rb = Interop.downcallHandle(
            "gst_rtcp_packet_xr_next_rb",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link RTCPPacket.Builder} object constructs a {@link RTCPPacket} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RTCPPacket.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RTCPPacket struct;
        
        private Builder() {
            struct = RTCPPacket.allocate();
        }
        
         /**
         * Finish building the {@link RTCPPacket} struct.
         * @return A new instance of {@code RTCPPacket} with the fields 
         *         that were set in the Builder object.
         */
        public RTCPPacket build() {
            return struct;
        }
        
        /**
         * pointer to RTCP buffer
         * @param rtcp The value for the {@code rtcp} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRtcp(org.gstreamer.rtp.RTCPBuffer rtcp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("rtcp"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rtcp == null ? MemoryAddress.NULL : rtcp.handle()));
            return this;
        }
        
        /**
         * offset of packet in buffer data
         * @param offset The value for the {@code offset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOffset(int offset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), offset);
            return this;
        }
        
        public Builder setPadding(boolean padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(padding, null).intValue());
            return this;
        }
        
        public Builder setCount(byte count) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("count"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), count);
            return this;
        }
        
        public Builder setType(org.gstreamer.rtp.RTCPType type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
            return this;
        }
        
        public Builder setLength(short length) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("length"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), length);
            return this;
        }
        
        public Builder setItemOffset(int itemOffset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("item_offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), itemOffset);
            return this;
        }
        
        public Builder setItemCount(int itemCount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("item_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), itemCount);
            return this;
        }
        
        public Builder setEntryOffset(int entryOffset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("entry_offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), entryOffset);
            return this;
        }
    }
}
