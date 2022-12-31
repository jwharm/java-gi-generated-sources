package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GstSDPMessage helper functions makes it easy to parse and create SDP
 * messages.
 */
public class SDPMessage extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstSDPMessage";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("version"),
            org.gstreamer.sdp.SDPOrigin.getMemoryLayout().withName("origin"),
            Interop.valueLayout.ADDRESS.withName("session_name"),
            Interop.valueLayout.ADDRESS.withName("information"),
            Interop.valueLayout.ADDRESS.withName("uri"),
            Interop.valueLayout.ADDRESS.withName("emails"),
            Interop.valueLayout.ADDRESS.withName("phones"),
            org.gstreamer.sdp.SDPConnection.getMemoryLayout().withName("connection"),
            Interop.valueLayout.ADDRESS.withName("bandwidths"),
            Interop.valueLayout.ADDRESS.withName("times"),
            Interop.valueLayout.ADDRESS.withName("zones"),
            org.gstreamer.sdp.SDPKey.getMemoryLayout().withName("key"),
            Interop.valueLayout.ADDRESS.withName("attributes"),
            Interop.valueLayout.ADDRESS.withName("medias")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SDPMessage}
     * @return A new, uninitialized @{link SDPMessage}
     */
    public static SDPMessage allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SDPMessage newInstance = new SDPMessage(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code version}
     * @return The value of the field {@code version}
     */
    public java.lang.String getVersion_() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("version"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code version}
     * @param version The new value of the field {@code version}
     */
    public void setVersion_(java.lang.String version) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("version"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (version == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(version, null)));
    }
    
    /**
     * Get the value of the field {@code origin}
     * @return The value of the field {@code origin}
     */
    public org.gstreamer.sdp.SDPOrigin getOrigin_() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("origin"));
        return org.gstreamer.sdp.SDPOrigin.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code origin}
     * @param origin The new value of the field {@code origin}
     */
    public void setOrigin_(org.gstreamer.sdp.SDPOrigin origin) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("origin"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (origin == null ? MemoryAddress.NULL : origin.handle()));
    }
    
    /**
     * Get the value of the field {@code session_name}
     * @return The value of the field {@code session_name}
     */
    public java.lang.String getSessionName_() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("session_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code session_name}
     * @param sessionName The new value of the field {@code session_name}
     */
    public void setSessionName_(java.lang.String sessionName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("session_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sessionName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(sessionName, null)));
    }
    
    /**
     * Get the value of the field {@code information}
     * @return The value of the field {@code information}
     */
    public java.lang.String getInformation_() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("information"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code information}
     * @param information The new value of the field {@code information}
     */
    public void setInformation_(java.lang.String information) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("information"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (information == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(information, null)));
    }
    
    /**
     * Get the value of the field {@code uri}
     * @return The value of the field {@code uri}
     */
    public java.lang.String getUri_() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("uri"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code uri}
     * @param uri The new value of the field {@code uri}
     */
    public void setUri_(java.lang.String uri) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("uri"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (uri == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(uri, null)));
    }
    
    /**
     * Get the value of the field {@code emails}
     * @return The value of the field {@code emails}
     */
    public PointerAddress getEmails() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("emails"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerAddress(RESULT);
    }
    
    /**
     * Change the value of the field {@code emails}
     * @param emails The new value of the field {@code emails}
     */
    public void setEmails(java.lang.foreign.MemoryAddress[] emails) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("emails"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (emails == null ? MemoryAddress.NULL : Interop.allocateNativeArray(emails, false)));
    }
    
    /**
     * Get the value of the field {@code phones}
     * @return The value of the field {@code phones}
     */
    public PointerAddress getPhones() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("phones"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerAddress(RESULT);
    }
    
    /**
     * Change the value of the field {@code phones}
     * @param phones The new value of the field {@code phones}
     */
    public void setPhones(java.lang.foreign.MemoryAddress[] phones) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("phones"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (phones == null ? MemoryAddress.NULL : Interop.allocateNativeArray(phones, false)));
    }
    
    /**
     * Get the value of the field {@code connection}
     * @return The value of the field {@code connection}
     */
    public org.gstreamer.sdp.SDPConnection getConnection_() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("connection"));
        return org.gstreamer.sdp.SDPConnection.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code connection}
     * @param connection The new value of the field {@code connection}
     */
    public void setConnection_(org.gstreamer.sdp.SDPConnection connection) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("connection"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (connection == null ? MemoryAddress.NULL : connection.handle()));
    }
    
    /**
     * Get the value of the field {@code bandwidths}
     * @return The value of the field {@code bandwidths}
     */
    public PointerAddress getBandwidths() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bandwidths"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerAddress(RESULT);
    }
    
    /**
     * Change the value of the field {@code bandwidths}
     * @param bandwidths The new value of the field {@code bandwidths}
     */
    public void setBandwidths(java.lang.foreign.MemoryAddress[] bandwidths) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bandwidths"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (bandwidths == null ? MemoryAddress.NULL : Interop.allocateNativeArray(bandwidths, false)));
    }
    
    /**
     * Get the value of the field {@code times}
     * @return The value of the field {@code times}
     */
    public PointerAddress getTimes() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("times"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerAddress(RESULT);
    }
    
    /**
     * Change the value of the field {@code times}
     * @param times The new value of the field {@code times}
     */
    public void setTimes(java.lang.foreign.MemoryAddress[] times) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("times"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (times == null ? MemoryAddress.NULL : Interop.allocateNativeArray(times, false)));
    }
    
    /**
     * Get the value of the field {@code zones}
     * @return The value of the field {@code zones}
     */
    public PointerAddress getZones() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("zones"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerAddress(RESULT);
    }
    
    /**
     * Change the value of the field {@code zones}
     * @param zones The new value of the field {@code zones}
     */
    public void setZones(java.lang.foreign.MemoryAddress[] zones) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("zones"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (zones == null ? MemoryAddress.NULL : Interop.allocateNativeArray(zones, false)));
    }
    
    /**
     * Get the value of the field {@code key}
     * @return The value of the field {@code key}
     */
    public org.gstreamer.sdp.SDPKey getKey_() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("key"));
        return org.gstreamer.sdp.SDPKey.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code key}
     * @param key The new value of the field {@code key}
     */
    public void setKey_(org.gstreamer.sdp.SDPKey key) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("key"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (key == null ? MemoryAddress.NULL : key.handle()));
    }
    
    /**
     * Get the value of the field {@code attributes}
     * @return The value of the field {@code attributes}
     */
    public PointerAddress getAttributes() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("attributes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerAddress(RESULT);
    }
    
    /**
     * Change the value of the field {@code attributes}
     * @param attributes The new value of the field {@code attributes}
     */
    public void setAttributes(java.lang.foreign.MemoryAddress[] attributes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("attributes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (attributes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(attributes, false)));
    }
    
    /**
     * Get the value of the field {@code medias}
     * @return The value of the field {@code medias}
     */
    public PointerAddress getMedias() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("medias"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerAddress(RESULT);
    }
    
    /**
     * Change the value of the field {@code medias}
     * @param medias The new value of the field {@code medias}
     */
    public void setMedias(java.lang.foreign.MemoryAddress[] medias) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("medias"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (medias == null ? MemoryAddress.NULL : Interop.allocateNativeArray(medias, false)));
    }
    
    /**
     * Create a SDPMessage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SDPMessage(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SDPMessage> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SDPMessage(input, ownership);
    
    /**
     * Add the attribute with {@code key} and {@code value} to {@code msg}.
     * @param key the key
     * @param value the value
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult addAttribute(java.lang.String key, @Nullable java.lang.String value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_add_attribute.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null),
                    (Addressable) (value == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(value, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Add the specified bandwidth information to {@code msg}.
     * @param bwtype the bandwidth modifier type
     * @param bandwidth the bandwidth in kilobits per second
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult addBandwidth(java.lang.String bwtype, int bandwidth) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_add_bandwidth.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(bwtype, null),
                    bandwidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Add {@code email} to the list of emails in {@code msg}.
     * @param email an email
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult addEmail(java.lang.String email) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_add_email.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(email, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Adds {@code media} to the array of medias in {@code msg}. This function takes ownership of
     * the contents of {@code media} so that {@code media} will have to be reinitialized with
     * gst_sdp_media_init() before it can be used again.
     * @param media a {@link SDPMedia} to add
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult addMedia(org.gstreamer.sdp.SDPMedia media) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_add_media.invokeExact(
                    handle(),
                    media.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Add {@code phone} to the list of phones in {@code msg}.
     * @param phone a phone
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult addPhone(java.lang.String phone) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_add_phone.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(phone, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Add time information {@code start} and {@code stop} to {@code msg}.
     * @param start the start time
     * @param stop the stop time
     * @param repeat the repeat times
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult addTime(java.lang.String start, java.lang.String stop, java.lang.String[] repeat) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_add_time.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(start, null),
                    Marshal.stringToAddress.marshal(stop, null),
                    Interop.allocateNativeArray(repeat, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Add time zone information to {@code msg}.
     * @param adjTime the NTP time that a time zone adjustment happens
     * @param typedTime the offset from the time when the session was first scheduled
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult addZone(java.lang.String adjTime, java.lang.String typedTime) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_add_zone.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(adjTime, null),
                    Marshal.stringToAddress.marshal(typedTime, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Convert the contents of {@code msg} to a text string.
     * @return A dynamically allocated string representing the SDP description.
     */
    public java.lang.String asText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_message_as_text.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the number of attributes in {@code msg}.
     * @return the number of attributes in {@code msg}.
     */
    public int attributesLen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_attributes_len.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Mapping of attributes of {@link SDPMessage} to {@link org.gstreamer.gst.Caps}
     * @param caps a {@link org.gstreamer.gst.Caps}
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult attributesToCaps(org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_attributes_to_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Get the number of bandwidth information in {@code msg}.
     * @return the number of bandwidth information in {@code msg}.
     */
    public int bandwidthsLen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_bandwidths_len.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocate a new copy of {@code msg} and store the result in {@code copy}. The value in
     * {@code copy} should be release with gst_sdp_message_free function.
     * @param copy pointer to new {@link SDPMessage}
     * @return a {@link SDPResult}
     */
    public org.gstreamer.sdp.SDPResult copy(Out<org.gstreamer.sdp.SDPMessage> copy) {
        MemorySegment copyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_copy.invokeExact(
                    handle(),
                    (Addressable) copyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        copy.set(org.gstreamer.sdp.SDPMessage.fromAddress.marshal(copyPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Dump the parsed contents of {@code msg} to stdout.
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult dump() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_dump.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Get the number of emails in {@code msg}.
     * @return the number of emails in {@code msg}.
     */
    public int emailsLen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_emails_len.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Free all resources allocated by {@code msg}. {@code msg} should not be used anymore after
     * this function. This function should be used when {@code msg} was dynamically
     * allocated with gst_sdp_message_new().
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult free() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Get the attribute at position {@code idx} in {@code msg}.
     * @param idx the index
     * @return the {@link SDPAttribute} at position {@code idx}.
     */
    public org.gstreamer.sdp.SDPAttribute getAttribute(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_message_get_attribute.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPAttribute.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the first attribute with key {@code key} in {@code msg}.
     * @param key the key
     * @return the attribute value of the first attribute with {@code key}.
     */
    public java.lang.String getAttributeVal(java.lang.String key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_message_get_attribute_val.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the {@code nth} attribute with key {@code key} in {@code msg}.
     * @param key the key
     * @param nth the index
     * @return the attribute value of the {@code nth} attribute with {@code key}.
     */
    public java.lang.String getAttributeValN(java.lang.String key, int nth) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_message_get_attribute_val_n.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null),
                    nth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the bandwidth at index {@code idx} from {@code msg}.
     * @param idx the bandwidth index
     * @return a {@link SDPBandwidth}.
     */
    public org.gstreamer.sdp.SDPBandwidth getBandwidth(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_message_get_bandwidth.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPBandwidth.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the connection of {@code msg}.
     * @return a {@link SDPConnection}. The result remains valid as long as {@code msg} is valid.
     */
    public org.gstreamer.sdp.SDPConnection getConnection() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_message_get_connection.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPConnection.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the email with number {@code idx} from {@code msg}.
     * @param idx an email index
     * @return the email at position {@code idx}.
     */
    public java.lang.String getEmail(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_message_get_email.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the information in {@code msg}.
     * @return a {@link SDPResult}.
     */
    public java.lang.String getInformation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_message_get_information.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the encryption information from {@code msg}.
     * @return a {@link SDPKey}.
     */
    public org.gstreamer.sdp.SDPKey getKey() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_message_get_key.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPKey.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the media description at index {@code idx} in {@code msg}.
     * @param idx the index
     * @return a {@link SDPMedia}.
     */
    public org.gstreamer.sdp.SDPMedia getMedia(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_message_get_media.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPMedia.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the origin of {@code msg}.
     * @return a {@link SDPOrigin}. The result remains valid as long as {@code msg} is valid.
     */
    public org.gstreamer.sdp.SDPOrigin getOrigin() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_message_get_origin.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPOrigin.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the phone with number {@code idx} from {@code msg}.
     * @param idx a phone index
     * @return the phone at position {@code idx}.
     */
    public java.lang.String getPhone(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_message_get_phone.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the session name in {@code msg}.
     * @return a {@link SDPResult}.
     */
    public java.lang.String getSessionName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_message_get_session_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get time information with index {@code idx} from {@code msg}.
     * @param idx the time index
     * @return a {@link SDPTime}.
     */
    public org.gstreamer.sdp.SDPTime getTime(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_message_get_time.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPTime.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the URI in {@code msg}.
     * @return a {@link SDPResult}.
     */
    public java.lang.String getUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_message_get_uri.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the version in {@code msg}.
     * @return a {@link SDPResult}.
     */
    public java.lang.String getVersion() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_message_get_version.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get time zone information with index {@code idx} from {@code msg}.
     * @param idx the zone index
     * @return a {@link SDPZone}.
     */
    public org.gstreamer.sdp.SDPZone getZone(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_sdp_message_get_zone.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPZone.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Initialize {@code msg} so that its contents are as if it was freshly allocated
     * with gst_sdp_message_new(). This function is mostly used to initialize a message
     * allocated on the stack. gst_sdp_message_uninit() undoes this operation.
     * <p>
     * When this function is invoked on newly allocated data (with malloc or on the
     * stack), its contents should be set to 0 before calling this function.
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult init() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_init.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Insert attribute into the array of attributes in {@code msg}
     * at index {@code idx}.
     * When -1 is given as {@code idx}, the attribute is inserted at the end.
     * @param idx an index
     * @param attr a {@link SDPAttribute}
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult insertAttribute(int idx, org.gstreamer.sdp.SDPAttribute attr) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_insert_attribute.invokeExact(
                    handle(),
                    idx,
                    attr.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Insert bandwidth parameters into the array of bandwidths in {@code msg}
     * at index {@code idx}.
     * When -1 is given as {@code idx}, the bandwidth is inserted at the end.
     * @param idx an index
     * @param bw the bandwidth
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult insertBandwidth(int idx, org.gstreamer.sdp.SDPBandwidth bw) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_insert_bandwidth.invokeExact(
                    handle(),
                    idx,
                    bw.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Insert {@code email} into the array of emails in {@code msg} at index {@code idx}.
     * When -1 is given as {@code idx}, the email is inserted at the end.
     * @param idx an index
     * @param email an email
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult insertEmail(int idx, java.lang.String email) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_insert_email.invokeExact(
                    handle(),
                    idx,
                    Marshal.stringToAddress.marshal(email, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Insert {@code phone} into the array of phone numbers in {@code msg} at index {@code idx}.
     * When -1 is given as {@code idx}, the phone is inserted at the end.
     * @param idx a phone index
     * @param phone a phone
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult insertPhone(int idx, java.lang.String phone) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_insert_phone.invokeExact(
                    handle(),
                    idx,
                    Marshal.stringToAddress.marshal(phone, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Insert time parameters into the array of times in {@code msg}
     * at index {@code idx}.
     * When -1 is given as {@code idx}, the times are inserted at the end.
     * @param idx an index
     * @param t a {@link SDPTime}
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult insertTime(int idx, org.gstreamer.sdp.SDPTime t) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_insert_time.invokeExact(
                    handle(),
                    idx,
                    t.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Insert zone parameters into the array of zones in {@code msg}
     * at index {@code idx}.
     * When -1 is given as {@code idx}, the zone is inserted at the end.
     * @param idx an index
     * @param zone a {@link SDPZone}
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult insertZone(int idx, org.gstreamer.sdp.SDPZone zone) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_insert_zone.invokeExact(
                    handle(),
                    idx,
                    zone.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Get the number of media descriptions in {@code msg}.
     * @return the number of media descriptions in {@code msg}.
     */
    public int mediasLen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_medias_len.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link MIKEYMessage} after parsing the key-mgmt attribute
     * from a {@link SDPMessage}.
     * @param mikey pointer to new {@link MIKEYMessage}
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult parseKeymgmt(Out<org.gstreamer.sdp.MIKEYMessage> mikey) {
        MemorySegment mikeyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_parse_keymgmt.invokeExact(
                    handle(),
                    (Addressable) mikeyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        mikey.set(org.gstreamer.sdp.MIKEYMessage.fromAddress.marshal(mikeyPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Get the number of phones in {@code msg}.
     * @return the number of phones in {@code msg}.
     */
    public int phonesLen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_phones_len.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Remove the attribute in {@code msg} at index {@code idx}.
     * @param idx the index
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult removeAttribute(int idx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_remove_attribute.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Remove the bandwidth information in {@code msg} at index {@code idx}.
     * @param idx the bandwidth index
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult removeBandwidth(int idx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_remove_bandwidth.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Remove the email in {@code msg} at index {@code idx}.
     * @param idx an email index
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult removeEmail(int idx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_remove_email.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Remove the phone number in {@code msg} at index {@code idx}.
     * @param idx a phone index
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult removePhone(int idx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_remove_phone.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Remove the time information in {@code msg} at index {@code idx}.
     * @param idx the index
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult removeTime(int idx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_remove_time.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Remove the zone information in {@code msg} at index {@code idx}.
     * @param idx the index
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult removeZone(int idx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_remove_zone.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Replace the attribute in {@code msg} at index {@code idx} with {@code attr}.
     * @param idx the index
     * @param attr a {@link SDPAttribute}
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult replaceAttribute(int idx, org.gstreamer.sdp.SDPAttribute attr) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_replace_attribute.invokeExact(
                    handle(),
                    idx,
                    attr.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Replace the bandwidth information in {@code msg} at index {@code idx} with {@code bw}.
     * @param idx the bandwidth index
     * @param bw the bandwidth
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult replaceBandwidth(int idx, org.gstreamer.sdp.SDPBandwidth bw) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_replace_bandwidth.invokeExact(
                    handle(),
                    idx,
                    bw.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Replace the email in {@code msg} at index {@code idx} with {@code email}.
     * @param idx an email index
     * @param email an email
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult replaceEmail(int idx, java.lang.String email) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_replace_email.invokeExact(
                    handle(),
                    idx,
                    Marshal.stringToAddress.marshal(email, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Replace the phone number in {@code msg} at index {@code idx} with {@code phone}.
     * @param idx a phone index
     * @param phone a phone
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult replacePhone(int idx, java.lang.String phone) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_replace_phone.invokeExact(
                    handle(),
                    idx,
                    Marshal.stringToAddress.marshal(phone, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Replace the time information in {@code msg} at index {@code idx} with {@code t}.
     * @param idx the index
     * @param t a {@link SDPTime}
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult replaceTime(int idx, org.gstreamer.sdp.SDPTime t) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_replace_time.invokeExact(
                    handle(),
                    idx,
                    t.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Replace the zone information in {@code msg} at index {@code idx} with {@code zone}.
     * @param idx the index
     * @param zone a {@link SDPZone}
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult replaceZone(int idx, org.gstreamer.sdp.SDPZone zone) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_replace_zone.invokeExact(
                    handle(),
                    idx,
                    zone.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Configure the SDP connection in {@code msg} with the given parameters.
     * @param nettype the type of network. "IN" is defined to have the meaning
     * "Internet".
     * @param addrtype the type of address.
     * @param address the address
     * @param ttl the time to live of the address
     * @param addrNumber the number of layers
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult setConnection(java.lang.String nettype, java.lang.String addrtype, java.lang.String address, int ttl, int addrNumber) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_set_connection.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(nettype, null),
                    Marshal.stringToAddress.marshal(addrtype, null),
                    Marshal.stringToAddress.marshal(address, null),
                    ttl,
                    addrNumber);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Set the information in {@code msg}.
     * @param information the information
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult setInformation(java.lang.String information) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_set_information.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(information, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Adds the encryption information to {@code msg}.
     * @param type the encryption type
     * @param data the encryption data
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult setKey(java.lang.String type, java.lang.String data) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_set_key.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(type, null),
                    Marshal.stringToAddress.marshal(data, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Configure the SDP origin in {@code msg} with the given parameters.
     * @param username the user name
     * @param sessId a session id
     * @param sessVersion a session version
     * @param nettype a network type
     * @param addrtype an address type
     * @param addr an address
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult setOrigin(java.lang.String username, java.lang.String sessId, java.lang.String sessVersion, java.lang.String nettype, java.lang.String addrtype, java.lang.String addr) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_set_origin.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(username, null),
                    Marshal.stringToAddress.marshal(sessId, null),
                    Marshal.stringToAddress.marshal(sessVersion, null),
                    Marshal.stringToAddress.marshal(nettype, null),
                    Marshal.stringToAddress.marshal(addrtype, null),
                    Marshal.stringToAddress.marshal(addr, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Set the session name in {@code msg}.
     * @param sessionName the session name
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult setSessionName(java.lang.String sessionName) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_set_session_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(sessionName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Set the URI in {@code msg}.
     * @param uri the URI
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult setUri(java.lang.String uri) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_set_uri.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(uri, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Set the version in {@code msg}.
     * @param version the version
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult setVersion(java.lang.String version) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_set_version.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(version, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Get the number of time information entries in {@code msg}.
     * @return the number of time information entries in {@code msg}.
     */
    public int timesLen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_times_len.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Free all resources allocated in {@code msg}. {@code msg} should not be used anymore after
     * this function. This function should be used when {@code msg} was allocated on the
     * stack and initialized with gst_sdp_message_init().
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult uninit() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_uninit.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Get the number of time zone information entries in {@code msg}.
     * @return the number of time zone information entries in {@code msg}.
     */
    public int zonesLen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_message_zones_len.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
    public static java.lang.String asUri(java.lang.String scheme, org.gstreamer.sdp.SDPMessage msg) {
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
    public static org.gstreamer.sdp.SDPResult new_(Out<org.gstreamer.sdp.SDPMessage> msg) {
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
    public static org.gstreamer.sdp.SDPResult newFromText(java.lang.String text, Out<org.gstreamer.sdp.SDPMessage> msg) {
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
    public static org.gstreamer.sdp.SDPResult parseBuffer(byte[] data, int size, org.gstreamer.sdp.SDPMessage msg) {
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
    public static org.gstreamer.sdp.SDPResult parseUri(java.lang.String uri, org.gstreamer.sdp.SDPMessage msg) {
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
        
        private static final MethodHandle gst_sdp_message_add_attribute = Interop.downcallHandle(
            "gst_sdp_message_add_attribute",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_add_bandwidth = Interop.downcallHandle(
            "gst_sdp_message_add_bandwidth",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_sdp_message_add_email = Interop.downcallHandle(
            "gst_sdp_message_add_email",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_add_media = Interop.downcallHandle(
            "gst_sdp_message_add_media",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_add_phone = Interop.downcallHandle(
            "gst_sdp_message_add_phone",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_add_time = Interop.downcallHandle(
            "gst_sdp_message_add_time",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_add_zone = Interop.downcallHandle(
            "gst_sdp_message_add_zone",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_as_text = Interop.downcallHandle(
            "gst_sdp_message_as_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_attributes_len = Interop.downcallHandle(
            "gst_sdp_message_attributes_len",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_attributes_to_caps = Interop.downcallHandle(
            "gst_sdp_message_attributes_to_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_bandwidths_len = Interop.downcallHandle(
            "gst_sdp_message_bandwidths_len",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_copy = Interop.downcallHandle(
            "gst_sdp_message_copy",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_dump = Interop.downcallHandle(
            "gst_sdp_message_dump",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_emails_len = Interop.downcallHandle(
            "gst_sdp_message_emails_len",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_free = Interop.downcallHandle(
            "gst_sdp_message_free",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_get_attribute = Interop.downcallHandle(
            "gst_sdp_message_get_attribute",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_sdp_message_get_attribute_val = Interop.downcallHandle(
            "gst_sdp_message_get_attribute_val",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_get_attribute_val_n = Interop.downcallHandle(
            "gst_sdp_message_get_attribute_val_n",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_sdp_message_get_bandwidth = Interop.downcallHandle(
            "gst_sdp_message_get_bandwidth",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_sdp_message_get_connection = Interop.downcallHandle(
            "gst_sdp_message_get_connection",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_get_email = Interop.downcallHandle(
            "gst_sdp_message_get_email",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_sdp_message_get_information = Interop.downcallHandle(
            "gst_sdp_message_get_information",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_get_key = Interop.downcallHandle(
            "gst_sdp_message_get_key",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_get_media = Interop.downcallHandle(
            "gst_sdp_message_get_media",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_sdp_message_get_origin = Interop.downcallHandle(
            "gst_sdp_message_get_origin",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_get_phone = Interop.downcallHandle(
            "gst_sdp_message_get_phone",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_sdp_message_get_session_name = Interop.downcallHandle(
            "gst_sdp_message_get_session_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_get_time = Interop.downcallHandle(
            "gst_sdp_message_get_time",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_sdp_message_get_uri = Interop.downcallHandle(
            "gst_sdp_message_get_uri",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_get_version = Interop.downcallHandle(
            "gst_sdp_message_get_version",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_get_zone = Interop.downcallHandle(
            "gst_sdp_message_get_zone",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_sdp_message_init = Interop.downcallHandle(
            "gst_sdp_message_init",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_insert_attribute = Interop.downcallHandle(
            "gst_sdp_message_insert_attribute",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_insert_bandwidth = Interop.downcallHandle(
            "gst_sdp_message_insert_bandwidth",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_insert_email = Interop.downcallHandle(
            "gst_sdp_message_insert_email",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_insert_phone = Interop.downcallHandle(
            "gst_sdp_message_insert_phone",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_insert_time = Interop.downcallHandle(
            "gst_sdp_message_insert_time",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_insert_zone = Interop.downcallHandle(
            "gst_sdp_message_insert_zone",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_medias_len = Interop.downcallHandle(
            "gst_sdp_message_medias_len",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_parse_keymgmt = Interop.downcallHandle(
            "gst_sdp_message_parse_keymgmt",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_phones_len = Interop.downcallHandle(
            "gst_sdp_message_phones_len",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_remove_attribute = Interop.downcallHandle(
            "gst_sdp_message_remove_attribute",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_sdp_message_remove_bandwidth = Interop.downcallHandle(
            "gst_sdp_message_remove_bandwidth",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_sdp_message_remove_email = Interop.downcallHandle(
            "gst_sdp_message_remove_email",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_sdp_message_remove_phone = Interop.downcallHandle(
            "gst_sdp_message_remove_phone",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_sdp_message_remove_time = Interop.downcallHandle(
            "gst_sdp_message_remove_time",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_sdp_message_remove_zone = Interop.downcallHandle(
            "gst_sdp_message_remove_zone",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_sdp_message_replace_attribute = Interop.downcallHandle(
            "gst_sdp_message_replace_attribute",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_replace_bandwidth = Interop.downcallHandle(
            "gst_sdp_message_replace_bandwidth",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_replace_email = Interop.downcallHandle(
            "gst_sdp_message_replace_email",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_replace_phone = Interop.downcallHandle(
            "gst_sdp_message_replace_phone",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_replace_time = Interop.downcallHandle(
            "gst_sdp_message_replace_time",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_replace_zone = Interop.downcallHandle(
            "gst_sdp_message_replace_zone",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_set_connection = Interop.downcallHandle(
            "gst_sdp_message_set_connection",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_sdp_message_set_information = Interop.downcallHandle(
            "gst_sdp_message_set_information",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_set_key = Interop.downcallHandle(
            "gst_sdp_message_set_key",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_set_origin = Interop.downcallHandle(
            "gst_sdp_message_set_origin",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_set_session_name = Interop.downcallHandle(
            "gst_sdp_message_set_session_name",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_set_uri = Interop.downcallHandle(
            "gst_sdp_message_set_uri",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_set_version = Interop.downcallHandle(
            "gst_sdp_message_set_version",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_times_len = Interop.downcallHandle(
            "gst_sdp_message_times_len",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_uninit = Interop.downcallHandle(
            "gst_sdp_message_uninit",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_message_zones_len = Interop.downcallHandle(
            "gst_sdp_message_zones_len",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
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
    
    /**
     * A {@link SDPMessage.Builder} object constructs a {@link SDPMessage} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SDPMessage.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SDPMessage struct;
        
        private Builder() {
            struct = SDPMessage.allocate();
        }
        
         /**
         * Finish building the {@link SDPMessage} struct.
         * @return A new instance of {@code SDPMessage} with the fields 
         *         that were set in the Builder object.
         */
        public SDPMessage build() {
            return struct;
        }
        
        /**
         * the protocol version
         * @param version The value for the {@code version} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVersion(java.lang.String version) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("version"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (version == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(version, null)));
            return this;
        }
        
        /**
         * owner/creator and session identifier
         * @param origin The value for the {@code origin} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOrigin(org.gstreamer.sdp.SDPOrigin origin) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("origin"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (origin == null ? MemoryAddress.NULL : origin.handle()));
            return this;
        }
        
        /**
         * session name
         * @param sessionName The value for the {@code sessionName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSessionName(java.lang.String sessionName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("session_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sessionName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(sessionName, null)));
            return this;
        }
        
        /**
         * session information
         * @param information The value for the {@code information} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInformation(java.lang.String information) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("information"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (information == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(information, null)));
            return this;
        }
        
        /**
         * URI of description
         * @param uri The value for the {@code uri} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUri(java.lang.String uri) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("uri"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (uri == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(uri, null)));
            return this;
        }
        
        /**
         * array of {@code gchar} with email addresses
         * @param emails The value for the {@code emails} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEmails(java.lang.foreign.MemoryAddress[] emails) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("emails"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (emails == null ? MemoryAddress.NULL : Interop.allocateNativeArray(emails, false)));
            return this;
        }
        
        /**
         * array of {@code gchar} with phone numbers
         * @param phones The value for the {@code phones} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPhones(java.lang.foreign.MemoryAddress[] phones) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("phones"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (phones == null ? MemoryAddress.NULL : Interop.allocateNativeArray(phones, false)));
            return this;
        }
        
        /**
         * connection information for the session
         * @param connection The value for the {@code connection} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setConnection(org.gstreamer.sdp.SDPConnection connection) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("connection"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (connection == null ? MemoryAddress.NULL : connection.handle()));
            return this;
        }
        
        /**
         * array of {@link SDPBandwidth} with bandwidth information
         * @param bandwidths The value for the {@code bandwidths} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBandwidths(java.lang.foreign.MemoryAddress[] bandwidths) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bandwidths"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (bandwidths == null ? MemoryAddress.NULL : Interop.allocateNativeArray(bandwidths, false)));
            return this;
        }
        
        /**
         * array of {@link SDPTime} with time descriptions
         * @param times The value for the {@code times} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTimes(java.lang.foreign.MemoryAddress[] times) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("times"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (times == null ? MemoryAddress.NULL : Interop.allocateNativeArray(times, false)));
            return this;
        }
        
        /**
         * array of {@link SDPZone} with time zone adjustments
         * @param zones The value for the {@code zones} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setZones(java.lang.foreign.MemoryAddress[] zones) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("zones"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (zones == null ? MemoryAddress.NULL : Interop.allocateNativeArray(zones, false)));
            return this;
        }
        
        /**
         * encryption key
         * @param key The value for the {@code key} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKey(org.gstreamer.sdp.SDPKey key) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("key"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (key == null ? MemoryAddress.NULL : key.handle()));
            return this;
        }
        
        /**
         * array of {@link SDPAttribute} with session attributes
         * @param attributes The value for the {@code attributes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAttributes(java.lang.foreign.MemoryAddress[] attributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (attributes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(attributes, false)));
            return this;
        }
        
        /**
         * array of {@link SDPMedia} with media descriptions
         * @param medias The value for the {@code medias} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMedias(java.lang.foreign.MemoryAddress[] medias) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("medias"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (medias == null ? MemoryAddress.NULL : Interop.allocateNativeArray(medias, false)));
            return this;
        }
    }
}
