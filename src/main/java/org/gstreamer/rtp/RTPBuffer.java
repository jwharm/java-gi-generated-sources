package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GstRTPBuffer helper functions makes it easy to parse and create regular
 * {@link org.gstreamer.gst.Buffer} objects that contain RTP payloads. These buffers are typically of
 * 'application/x-rtp' {@link org.gstreamer.gst.Caps}.
 */
public class RTPBuffer extends Struct {
    
    static {
        GstRtp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPBuffer";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("buffer"),
            Interop.valueLayout.C_INT.withName("state"),
            MemoryLayout.paddingLayout(160),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("data"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_LONG).withName("size"),
            MemoryLayout.sequenceLayout(4, org.gstreamer.gst.MapInfo.getMemoryLayout()).withName("map")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RTPBuffer}
     * @return A new, uninitialized @{link RTPBuffer}
     */
    public static RTPBuffer allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTPBuffer newInstance = new RTPBuffer(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code buffer}
     * @return The value of the field {@code buffer}
     */
    public org.gstreamer.gst.Buffer getBuffer() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code buffer}
     * @param buffer The new value of the field {@code buffer}
     */
    public void setBuffer(org.gstreamer.gst.Buffer buffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
    }
    
    /**
     * Get the value of the field {@code state}
     * @return The value of the field {@code state}
     */
    public int getState() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("state"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code state}
     * @param state The new value of the field {@code state}
     */
    public void setState(int state) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("state"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), state);
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress[] getData() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getAddressArrayFrom(RESULT, 4);
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void setData(java.lang.foreign.MemoryAddress[] data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : Interop.allocateNativeArray(data, false)));
    }
    
    /**
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public long[] getSize() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 4, Interop.getScope()).toArray(Interop.valueLayout.C_LONG);
    }
    
    /**
     * Change the value of the field {@code size}
     * @param size The new value of the field {@code size}
     */
    public void setSize(long[] size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (size == null ? MemoryAddress.NULL : Interop.allocateNativeArray(size, false)));
    }
    
    /**
     * Get the value of the field {@code map}
     * @return The value of the field {@code map}
     */
    public org.gstreamer.gst.MapInfo[] getMap() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("map"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.gst.MapInfo>(RESULT, org.gstreamer.gst.MapInfo.fromAddress).toArray((int) 4, org.gstreamer.gst.MapInfo.class);
    }
    
    /**
     * Change the value of the field {@code map}
     * @param map The new value of the field {@code map}
     */
    public void setMap(org.gstreamer.gst.MapInfo[] map) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("map"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (map == null ? MemoryAddress.NULL : Interop.allocateNativeArray(map, org.gstreamer.gst.MapInfo.getMemoryLayout(), false)));
    }
    
    /**
     * Create a RTPBuffer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RTPBuffer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTPBuffer> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RTPBuffer(input, ownership);
    
    /**
     * Adds a RFC 5285 header extension with a one byte header to the end of the
     * RTP header. If there is already a RFC 5285 header extension with a one byte
     * header, the new extension will be appended.
     * It will not work if there is already a header extension that does not follow
     * the mechanism described in RFC 5285 or if there is a header extension with
     * a two bytes header as described in RFC 5285. In that case, use
     * gst_rtp_buffer_add_extension_twobytes_header()
     * @param id The ID of the header extension (between 1 and 14).
     * @param data location for data
     * @param size the size of the data in bytes
     * @return {@code true} if header extension could be added
     */
    public boolean addExtensionOnebyteHeader(byte id, byte[] data, int size) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_add_extension_onebyte_header.invokeExact(
                    handle(),
                    id,
                    Interop.allocateNativeArray(data, false),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Adds a RFC 5285 header extension with a two bytes header to the end of the
     * RTP header. If there is already a RFC 5285 header extension with a two bytes
     * header, the new extension will be appended.
     * It will not work if there is already a header extension that does not follow
     * the mechanism described in RFC 5285 or if there is a header extension with
     * a one byte header as described in RFC 5285. In that case, use
     * gst_rtp_buffer_add_extension_onebyte_header()
     * @param appbits Application specific bits
     * @param id The ID of the header extension
     * @param data location for data
     * @param size the size of the data in bytes
     * @return {@code true} if header extension could be added
     */
    public boolean addExtensionTwobytesHeader(byte appbits, byte id, byte[] data, int size) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_add_extension_twobytes_header.invokeExact(
                    handle(),
                    appbits,
                    id,
                    Interop.allocateNativeArray(data, false),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the CSRC at index {@code idx} in {@code buffer}.
     * @param idx the index of the CSRC to get
     * @return the CSRC at index {@code idx} in host order.
     */
    public int getCsrc(byte idx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_get_csrc.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the CSRC count of the RTP packet in {@code buffer}.
     * @return the CSRC count of {@code buffer}.
     */
    public byte getCsrcCount() {
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.gst_rtp_buffer_get_csrc_count.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Check if the extension bit is set on the RTP packet in {@code buffer}.
     * @return TRUE if {@code buffer} has the extension bit set.
     */
    public boolean getExtension() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_get_extension.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Similar to gst_rtp_buffer_get_extension_data, but more suitable for language
     * bindings usage. {@code bits} will contain the extension 16 bits of custom data and
     * the extension data (not including the extension header) is placed in a new
     * {@link org.gtk.glib.Bytes} structure.
     * <p>
     * If {@code rtp} did not contain an extension, this function will return {@code null}, with
     * {@code bits} unchanged. If there is an extension header but no extension data then
     * an empty {@link org.gtk.glib.Bytes} will be returned.
     * @param bits location for header bits
     * @return A new {@link org.gtk.glib.Bytes} if an extension header was present
     * and {@code null} otherwise.
     */
    public org.gtk.glib.Bytes getExtensionData(Out<Short> bits) {
        MemorySegment bitsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_buffer_get_extension_bytes.invokeExact(
                    handle(),
                    (Addressable) bitsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        bits.set(bitsPOINTER.get(Interop.valueLayout.C_SHORT, 0));
        return org.gtk.glib.Bytes.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Parses RFC 5285 style header extensions with a one byte header. It will
     * return the nth extension with the requested id.
     * @param id The ID of the header extension to be read (between 1 and 14).
     * @param nth Read the nth extension packet with the requested ID
     * @param data location for data
     * @param size the size of the data in bytes
     * @return TRUE if {@code buffer} had the requested header extension
     */
    public boolean getExtensionOnebyteHeader(byte id, int nth, Out<byte[]> data, Out<Integer> size) {
        MemorySegment dataPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_get_extension_onebyte_header.invokeExact(
                    handle(),
                    id,
                    nth,
                    (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) dataPOINTER.address()),
                    (Addressable) (size == null ? MemoryAddress.NULL : (Addressable) sizePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (size != null) size.set(sizePOINTER.get(Interop.valueLayout.C_INT, 0));
        data.set(MemorySegment.ofAddress(dataPOINTER.get(Interop.valueLayout.ADDRESS, 0), size.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Parses RFC 5285 style header extensions with a two bytes header. It will
     * return the nth extension with the requested id.
     * @param appbits Application specific bits
     * @param id The ID of the header extension to be read (between 1 and 14).
     * @param nth Read the nth extension packet with the requested ID
     * @param data location for data
     * @param size the size of the data in bytes
     * @return TRUE if {@code buffer} had the requested header extension
     */
    public boolean getExtensionTwobytesHeader(Out<Byte> appbits, byte id, int nth, Out<byte[]> data, Out<Integer> size) {
        MemorySegment appbitsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        MemorySegment dataPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_get_extension_twobytes_header.invokeExact(
                    handle(),
                    (Addressable) (appbits == null ? MemoryAddress.NULL : (Addressable) appbitsPOINTER.address()),
                    id,
                    nth,
                    (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) dataPOINTER.address()),
                    (Addressable) (size == null ? MemoryAddress.NULL : (Addressable) sizePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (appbits != null) appbits.set(appbitsPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        if (size != null) size.set(sizePOINTER.get(Interop.valueLayout.C_INT, 0));
        data.set(MemorySegment.ofAddress(dataPOINTER.get(Interop.valueLayout.ADDRESS, 0), size.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Return the total length of the header in {@code buffer}. This include the length of
     * the fixed header, the CSRC list and the extension header.
     * @return The total length of the header in {@code buffer}.
     */
    public int getHeaderLen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_get_header_len.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Check if the marker bit is set on the RTP packet in {@code buffer}.
     * @return TRUE if {@code buffer} has the marker bit set.
     */
    public boolean getMarker() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_get_marker.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Return the total length of the packet in {@code buffer}.
     * @return The total length of the packet in {@code buffer}.
     */
    public int getPacketLen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_get_packet_len.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Check if the padding bit is set on the RTP packet in {@code buffer}.
     * @return TRUE if {@code buffer} has the padding bit set.
     */
    public boolean getPadding() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_get_padding.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Create a buffer of the payload of the RTP packet in {@code buffer}. This function
     * will internally create a subbuffer of {@code buffer} so that a memcpy can be
     * avoided.
     * @return A new buffer with the data of the payload.
     */
    public org.gstreamer.gst.Buffer getPayloadBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_buffer_get_payload_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Similar to gst_rtp_buffer_get_payload, but more suitable for language
     * bindings usage. The return value is a pointer to a {@link org.gtk.glib.Bytes} structure
     * containing the payload data in {@code rtp}.
     * @return A new {@link org.gtk.glib.Bytes} containing the payload data in {@code rtp}.
     */
    public org.gtk.glib.Bytes getPayload() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_buffer_get_payload_bytes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Bytes.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the length of the payload of the RTP packet in {@code buffer}.
     * @return The length of the payload in {@code buffer}.
     */
    public int getPayloadLen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_get_payload_len.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a subbuffer of the payload of the RTP packet in {@code buffer}. {@code offset} bytes
     * are skipped in the payload and the subbuffer will be of size {@code len}.
     * If {@code len} is -1 the total payload starting from {@code offset} is subbuffered.
     * @param offset the offset in the payload
     * @param len the length in the payload
     * @return A new buffer with the specified data of the payload.
     */
    public org.gstreamer.gst.Buffer getPayloadSubbuffer(int offset, int len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_buffer_get_payload_subbuffer.invokeExact(
                    handle(),
                    offset,
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the payload type of the RTP packet in {@code buffer}.
     * @return The payload type.
     */
    public byte getPayloadType() {
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.gst_rtp_buffer_get_payload_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the sequence number of the RTP packet in {@code buffer}.
     * @return The sequence number in host order.
     */
    public short getSeq() {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.gst_rtp_buffer_get_seq.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the SSRC of the RTP packet in {@code buffer}.
     * @return the SSRC of {@code buffer} in host order.
     */
    public int getSsrc() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_get_ssrc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the timestamp of the RTP packet in {@code buffer}.
     * @return The timestamp in host order.
     */
    public int getTimestamp() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_get_timestamp.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the version number of the RTP packet in {@code buffer}.
     * @return The version of {@code buffer}.
     */
    public byte getVersion() {
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.gst_rtp_buffer_get_version.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Set the amount of padding in the RTP packet in {@code buffer} to
     * {@code len}. If {@code len} is 0, the padding is removed.
     * <p>
     * NOTE: This function does not work correctly.
     * @param len the new amount of padding
     */
    public void padTo(int len) {
        try {
            DowncallHandles.gst_rtp_buffer_pad_to.invokeExact(
                    handle(),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unsets the extension bit of the RTP buffer and removes the extension header
     * and data.
     * <p>
     * If the RTP buffer has no header extension data, the action has no effect.
     * The RTP buffer must be mapped READWRITE only once and the underlying
     * GstBuffer must be writable.
     */
    public void removeExtensionData() {
        try {
            DowncallHandles.gst_rtp_buffer_remove_extension_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Modify the CSRC at index {@code idx} in {@code buffer} to {@code csrc}.
     * @param idx the CSRC index to set
     * @param csrc the CSRC in host order to set at {@code idx}
     */
    public void setCsrc(byte idx, int csrc) {
        try {
            DowncallHandles.gst_rtp_buffer_set_csrc.invokeExact(
                    handle(),
                    idx,
                    csrc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the extension bit on the RTP packet in {@code buffer} to {@code extension}.
     * @param extension the new extension
     */
    public void setExtension(boolean extension) {
        try {
            DowncallHandles.gst_rtp_buffer_set_extension.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(extension, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the extension bit of the rtp buffer and fill in the {@code bits} and {@code length} of the
     * extension header. If the existing extension data is not large enough, it will
     * be made larger.
     * <p>
     * Will also shorten the extension data from 1.20.
     * @param bits the bits specific for the extension
     * @param length the length that counts the number of 32-bit words in
     * the extension, excluding the extension header ( therefore zero is a valid length)
     * @return True if done.
     */
    public boolean setExtensionData(short bits, short length) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_set_extension_data.invokeExact(
                    handle(),
                    bits,
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set the marker bit on the RTP packet in {@code buffer} to {@code marker}.
     * @param marker the new marker
     */
    public void setMarker(boolean marker) {
        try {
            DowncallHandles.gst_rtp_buffer_set_marker.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(marker, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the total {@code rtp} size to {@code len}. The data in the buffer will be made
     * larger if needed. Any padding will be removed from the packet.
     * @param len the new packet length
     */
    public void setPacketLen(int len) {
        try {
            DowncallHandles.gst_rtp_buffer_set_packet_len.invokeExact(
                    handle(),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the padding bit on the RTP packet in {@code buffer} to {@code padding}.
     * @param padding the new padding
     */
    public void setPadding(boolean padding) {
        try {
            DowncallHandles.gst_rtp_buffer_set_padding.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(padding, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the payload type of the RTP packet in {@code buffer} to {@code payload_type}.
     * @param payloadType the new type
     */
    public void setPayloadType(byte payloadType) {
        try {
            DowncallHandles.gst_rtp_buffer_set_payload_type.invokeExact(
                    handle(),
                    payloadType);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the sequence number of the RTP packet in {@code buffer} to {@code seq}.
     * @param seq the new sequence number
     */
    public void setSeq(short seq) {
        try {
            DowncallHandles.gst_rtp_buffer_set_seq.invokeExact(
                    handle(),
                    seq);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the SSRC on the RTP packet in {@code buffer} to {@code ssrc}.
     * @param ssrc the new SSRC
     */
    public void setSsrc(int ssrc) {
        try {
            DowncallHandles.gst_rtp_buffer_set_ssrc.invokeExact(
                    handle(),
                    ssrc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the timestamp of the RTP packet in {@code buffer} to {@code timestamp}.
     * @param timestamp the new timestamp
     */
    public void setTimestamp(int timestamp) {
        try {
            DowncallHandles.gst_rtp_buffer_set_timestamp.invokeExact(
                    handle(),
                    timestamp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the version of the RTP packet in {@code buffer} to {@code version}.
     * @param version the new version
     */
    public void setVersion(byte version) {
        try {
            DowncallHandles.gst_rtp_buffer_set_version.invokeExact(
                    handle(),
                    version);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unmap {@code rtp} previously mapped with gst_rtp_buffer_map().
     */
    public void unmap() {
        try {
            DowncallHandles.gst_rtp_buffer_unmap.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocate enough data in {@code buffer} to hold an RTP packet with {@code csrc_count} CSRCs,
     * a payload length of {@code payload_len} and padding of {@code pad_len}.
     * {@code buffer} must be writable and all previous memory in {@code buffer} will be freed.
     * If {@code pad_len} is &gt;0, the padding bit will be set. All other RTP header fields
     * will be set to 0/FALSE.
     * @param buffer a {@link org.gstreamer.gst.Buffer}
     * @param payloadLen the length of the payload
     * @param padLen the amount of padding
     * @param csrcCount the number of CSRC entries
     */
    public static void allocateData(org.gstreamer.gst.Buffer buffer, int payloadLen, byte padLen, byte csrcCount) {
        try {
            DowncallHandles.gst_rtp_buffer_allocate_data.invokeExact(
                    buffer.handle(),
                    payloadLen,
                    padLen,
                    csrcCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calculate the header length of an RTP packet with {@code csrc_count} CSRC entries.
     * An RTP packet can have at most 15 CSRC entries.
     * @param csrcCount the number of CSRC entries
     * @return The length of an RTP header with {@code csrc_count} CSRC entries.
     */
    public static int calcHeaderLen(byte csrcCount) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_calc_header_len.invokeExact(
                    csrcCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Calculate the total length of an RTP packet with a payload size of {@code payload_len},
     * a padding of {@code pad_len} and a {@code csrc_count} CSRC entries.
     * @param payloadLen the length of the payload
     * @param padLen the amount of padding
     * @param csrcCount the number of CSRC entries
     * @return The total length of an RTP header with given parameters.
     */
    public static int calcPacketLen(int payloadLen, byte padLen, byte csrcCount) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_calc_packet_len.invokeExact(
                    payloadLen,
                    padLen,
                    csrcCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Calculate the length of the payload of an RTP packet with size {@code packet_len},
     * a padding of {@code pad_len} and a {@code csrc_count} CSRC entries.
     * @param packetLen the length of the total RTP packet
     * @param padLen the amount of padding
     * @param csrcCount the number of CSRC entries
     * @return The length of the payload of an RTP packet  with given parameters.
     */
    public static int calcPayloadLen(int packetLen, byte padLen, byte csrcCount) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_calc_payload_len.invokeExact(
                    packetLen,
                    padLen,
                    csrcCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Compare two sequence numbers, taking care of wraparounds. This function
     * returns the difference between {@code seqnum1} and {@code seqnum2}.
     * @param seqnum1 a sequence number
     * @param seqnum2 a sequence number
     * @return a negative value if {@code seqnum1} is bigger than {@code seqnum2}, 0 if they
     * are equal or a positive value if {@code seqnum1} is smaller than {@code segnum2}.
     */
    public static int compareSeqnum(short seqnum1, short seqnum2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_compare_seqnum.invokeExact(
                    seqnum1,
                    seqnum2);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the default clock-rate for the static payload type {@code payload_type}.
     * @param payloadType the static payload type
     * @return the default clock rate or -1 if the payload type is not static or
     * the clock-rate is undefined.
     */
    public static int defaultClockRate(byte payloadType) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_default_clock_rate.invokeExact(
                    payloadType);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Update the {@code exttimestamp} field with the extended timestamp of {@code timestamp}
     * For the first call of the method, {@code exttimestamp} should point to a location
     * with a value of -1.
     * <p>
     * This function is able to handle both forward and backward timestamps taking
     * into account:
     * <ul>
     * <li>timestamp wraparound making sure that the returned value is properly increased.
     * <li>timestamp unwraparound making sure that the returned value is properly decreased.
     * </ul>
     * @param exttimestamp a previous extended timestamp
     * @param timestamp a new timestamp
     * @return The extended timestamp of {@code timestamp} or 0 if the result can't go anywhere backwards.
     */
    public static long extTimestamp(Out<Long> exttimestamp, int timestamp) {
        MemorySegment exttimestampPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_rtp_buffer_ext_timestamp.invokeExact(
                    (Addressable) exttimestampPOINTER.address(),
                    timestamp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        exttimestamp.set(exttimestampPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT;
    }
    
    /**
     * Similar to gst_rtp_buffer_get_extension_onebyte_header, but working
     * on the {@link org.gtk.glib.Bytes} you get from gst_rtp_buffer_get_extension_bytes.
     * Parses RFC 5285 style header extensions with a one byte header. It will
     * return the nth extension with the requested id.
     * @param bytes {@link org.gtk.glib.Bytes}
     * @param bitPattern The bit-pattern. Anything but 0xBEDE is rejected.
     * @param id The ID of the header extension to be read (between 1 and 14).
     * @param nth Read the nth extension packet with the requested ID
     * @param data location for data
     * @param size the size of the data in bytes
     * @return TRUE if {@code bytes} had the requested header extension
     */
    public static boolean getExtensionOnebyteHeaderFromBytes(org.gtk.glib.Bytes bytes, short bitPattern, byte id, int nth, Out<byte[]> data, Out<Integer> size) {
        MemorySegment dataPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_get_extension_onebyte_header_from_bytes.invokeExact(
                    bytes.handle(),
                    bitPattern,
                    id,
                    nth,
                    (Addressable) dataPOINTER.address(),
                    (Addressable) sizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        size.set(sizePOINTER.get(Interop.valueLayout.C_INT, 0));
        data.set(MemorySegment.ofAddress(dataPOINTER.get(Interop.valueLayout.ADDRESS, 0), size.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Map the contents of {@code buffer} into {@code rtp}.
     * @param buffer a {@link org.gstreamer.gst.Buffer}
     * @param flags {@link org.gstreamer.gst.MapFlags}
     * @param rtp a {@link RTPBuffer}
     * @return {@code true} if {@code buffer} could be mapped.
     */
    public static boolean map(org.gstreamer.gst.Buffer buffer, org.gstreamer.gst.MapFlags flags, org.gstreamer.rtp.RTPBuffer rtp) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_map.invokeExact(
                    buffer.handle(),
                    flags.getValue(),
                    rtp.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Allocate a new {@link org.gstreamer.gst.Buffer} with enough data to hold an RTP packet with
     * {@code csrc_count} CSRCs, a payload length of {@code payload_len} and padding of {@code pad_len}.
     * All other RTP header fields will be set to 0/FALSE.
     * @param payloadLen the length of the payload
     * @param padLen the amount of padding
     * @param csrcCount the number of CSRC entries
     * @return A newly allocated buffer that can hold an RTP packet with given
     * parameters.
     */
    public static org.gstreamer.gst.Buffer newAllocate(int payloadLen, byte padLen, byte csrcCount) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_buffer_new_allocate.invokeExact(
                    payloadLen,
                    padLen,
                    csrcCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new {@link org.gstreamer.gst.Buffer} that can hold an RTP packet that is exactly
     * {@code packet_len} long. The length of the payload depends on {@code pad_len} and
     * {@code csrc_count} and can be calculated with gst_rtp_buffer_calc_payload_len().
     * All RTP header fields will be set to 0/FALSE.
     * @param packetLen the total length of the packet
     * @param padLen the amount of padding
     * @param csrcCount the number of CSRC entries
     * @return A newly allocated buffer that can hold an RTP packet of {@code packet_len}.
     */
    public static org.gstreamer.gst.Buffer newAllocateLen(int packetLen, byte padLen, byte csrcCount) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_buffer_new_allocate_len.invokeExact(
                    packetLen,
                    padLen,
                    csrcCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new buffer and set the data to a copy of {@code len}
     * bytes of {@code data} and the size to {@code len}. The data will be freed when the buffer
     * is freed.
     * @param data data for the new
     *   buffer
     * @param len the length of data
     * @return A newly allocated buffer with a copy of {@code data} and of size {@code len}.
     */
    public static org.gstreamer.gst.Buffer newCopyData(byte[] data, long len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_buffer_new_copy_data.invokeExact(
                    Interop.allocateNativeArray(data, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new buffer and set the data and size of the buffer to {@code data} and {@code len}
     * respectively. {@code data} will be freed when the buffer is unreffed, so this
     * function transfers ownership of {@code data} to the new buffer.
     * @param data data for the new buffer
     * @param len the length of data
     * @return A newly allocated buffer with {@code data} and of size {@code len}.
     */
    public static org.gstreamer.gst.Buffer newTakeData(byte[] data, long len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_buffer_new_take_data.invokeExact(
                    Interop.allocateNativeArray(data, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtp_buffer_add_extension_onebyte_header = Interop.downcallHandle(
            "gst_rtp_buffer_add_extension_onebyte_header",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_add_extension_twobytes_header = Interop.downcallHandle(
            "gst_rtp_buffer_add_extension_twobytes_header",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_csrc = Interop.downcallHandle(
            "gst_rtp_buffer_get_csrc",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_csrc_count = Interop.downcallHandle(
            "gst_rtp_buffer_get_csrc_count",
            FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_extension = Interop.downcallHandle(
            "gst_rtp_buffer_get_extension",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_extension_bytes = Interop.downcallHandle(
            "gst_rtp_buffer_get_extension_bytes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_extension_onebyte_header = Interop.downcallHandle(
            "gst_rtp_buffer_get_extension_onebyte_header",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_extension_twobytes_header = Interop.downcallHandle(
            "gst_rtp_buffer_get_extension_twobytes_header",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_header_len = Interop.downcallHandle(
            "gst_rtp_buffer_get_header_len",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_marker = Interop.downcallHandle(
            "gst_rtp_buffer_get_marker",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_packet_len = Interop.downcallHandle(
            "gst_rtp_buffer_get_packet_len",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_padding = Interop.downcallHandle(
            "gst_rtp_buffer_get_padding",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_payload_buffer = Interop.downcallHandle(
            "gst_rtp_buffer_get_payload_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_payload_bytes = Interop.downcallHandle(
            "gst_rtp_buffer_get_payload_bytes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_payload_len = Interop.downcallHandle(
            "gst_rtp_buffer_get_payload_len",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_payload_subbuffer = Interop.downcallHandle(
            "gst_rtp_buffer_get_payload_subbuffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_payload_type = Interop.downcallHandle(
            "gst_rtp_buffer_get_payload_type",
            FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_seq = Interop.downcallHandle(
            "gst_rtp_buffer_get_seq",
            FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_ssrc = Interop.downcallHandle(
            "gst_rtp_buffer_get_ssrc",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_timestamp = Interop.downcallHandle(
            "gst_rtp_buffer_get_timestamp",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_version = Interop.downcallHandle(
            "gst_rtp_buffer_get_version",
            FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_pad_to = Interop.downcallHandle(
            "gst_rtp_buffer_pad_to",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_remove_extension_data = Interop.downcallHandle(
            "gst_rtp_buffer_remove_extension_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_set_csrc = Interop.downcallHandle(
            "gst_rtp_buffer_set_csrc",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_set_extension = Interop.downcallHandle(
            "gst_rtp_buffer_set_extension",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_set_extension_data = Interop.downcallHandle(
            "gst_rtp_buffer_set_extension_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_set_marker = Interop.downcallHandle(
            "gst_rtp_buffer_set_marker",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_set_packet_len = Interop.downcallHandle(
            "gst_rtp_buffer_set_packet_len",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_set_padding = Interop.downcallHandle(
            "gst_rtp_buffer_set_padding",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_set_payload_type = Interop.downcallHandle(
            "gst_rtp_buffer_set_payload_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_set_seq = Interop.downcallHandle(
            "gst_rtp_buffer_set_seq",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_set_ssrc = Interop.downcallHandle(
            "gst_rtp_buffer_set_ssrc",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_set_timestamp = Interop.downcallHandle(
            "gst_rtp_buffer_set_timestamp",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_set_version = Interop.downcallHandle(
            "gst_rtp_buffer_set_version",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_unmap = Interop.downcallHandle(
            "gst_rtp_buffer_unmap",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_allocate_data = Interop.downcallHandle(
            "gst_rtp_buffer_allocate_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_calc_header_len = Interop.downcallHandle(
            "gst_rtp_buffer_calc_header_len",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_calc_packet_len = Interop.downcallHandle(
            "gst_rtp_buffer_calc_packet_len",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_calc_payload_len = Interop.downcallHandle(
            "gst_rtp_buffer_calc_payload_len",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_compare_seqnum = Interop.downcallHandle(
            "gst_rtp_buffer_compare_seqnum",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_default_clock_rate = Interop.downcallHandle(
            "gst_rtp_buffer_default_clock_rate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_ext_timestamp = Interop.downcallHandle(
            "gst_rtp_buffer_ext_timestamp",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_get_extension_onebyte_header_from_bytes = Interop.downcallHandle(
            "gst_rtp_buffer_get_extension_onebyte_header_from_bytes",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_map = Interop.downcallHandle(
            "gst_rtp_buffer_map",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_new_allocate = Interop.downcallHandle(
            "gst_rtp_buffer_new_allocate",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_new_allocate_len = Interop.downcallHandle(
            "gst_rtp_buffer_new_allocate_len",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_new_copy_data = Interop.downcallHandle(
            "gst_rtp_buffer_new_copy_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_rtp_buffer_new_take_data = Interop.downcallHandle(
            "gst_rtp_buffer_new_take_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
    }
    
    /**
     * A {@link RTPBuffer.Builder} object constructs a {@link RTPBuffer} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RTPBuffer.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RTPBuffer struct;
        
        private Builder() {
            struct = RTPBuffer.allocate();
        }
        
         /**
         * Finish building the {@link RTPBuffer} struct.
         * @return A new instance of {@code RTPBuffer} with the fields 
         *         that were set in the Builder object.
         */
        public RTPBuffer build() {
            return struct;
        }
        
        /**
         * pointer to RTP buffer
         * @param buffer The value for the {@code buffer} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBuffer(org.gstreamer.gst.Buffer buffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
            return this;
        }
        
        /**
         * internal state
         * @param state The value for the {@code state} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setState(int state) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("state"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), state);
            return this;
        }
        
        /**
         * array of data
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setData(java.lang.foreign.MemoryAddress[] data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : Interop.allocateNativeArray(data, false)));
            return this;
        }
        
        /**
         * array of size
         * @param size The value for the {@code size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(long[] size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (size == null ? MemoryAddress.NULL : Interop.allocateNativeArray(size, false)));
            return this;
        }
        
        /**
         * array of {@link org.gstreamer.gst.MapInfo}
         * @param map The value for the {@code map} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMap(org.gstreamer.gst.MapInfo[] map) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (map == null ? MemoryAddress.NULL : Interop.allocateNativeArray(map, org.gstreamer.gst.MapInfo.getMemoryLayout(), false)));
            return this;
        }
    }
}
