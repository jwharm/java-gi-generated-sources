package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides methods for creating and parsing request, response and data messages.
 */
public class RTSPMessage extends Struct {
    
    static {
        GstRtsp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPMessage";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("hdr_fields"),
        Interop.valueLayout.ADDRESS.withName("body"),
        Interop.valueLayout.C_INT.withName("body_size"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("body_buffer"),
        MemoryLayout.sequenceLayout(3, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link RTSPMessage}
     * @return A new, uninitialized @{link RTSPMessage}
     */
    public static RTSPMessage allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTSPMessage newInstance = new RTSPMessage(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gstreamer.rtsp.RTSPMsgType type$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.rtsp.RTSPMsgType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void type$set(org.gstreamer.rtsp.RTSPMsgType type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), type.getValue());
    }
    
    /**
     * Create a RTSPMessage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RTSPMessage(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Add a header with key {@code field} and {@code value} to {@code msg}. This function takes a copy
     * of {@code value}.
     * @param field a {@link RTSPHeaderField}
     * @param value the value of the header
     * @return a {@link RTSPResult}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult addHeader(@NotNull org.gstreamer.rtsp.RTSPHeaderField field, @NotNull java.lang.String value) {
        java.util.Objects.requireNonNull(field, "Parameter 'field' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_add_header.invokeExact(
                    handle(),
                    field.getValue(),
                    Interop.allocateNativeString(value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Add a header with key {@code header} and {@code value} to {@code msg}. This function takes a copy
     * of {@code value}.
     * @param header header string
     * @param value the value of the header
     * @return a {@link RTSPResult}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult addHeaderByName(@NotNull java.lang.String header, @NotNull java.lang.String value) {
        java.util.Objects.requireNonNull(header, "Parameter 'header' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_add_header_by_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(header),
                    Interop.allocateNativeString(value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Append the currently configured headers in {@code msg} to the {@link org.gtk.glib.String} {@code str} suitable
     * for transmission.
     * @param str a string
     * @return {@code GST_RTSP_OK}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult appendHeaders(@NotNull org.gtk.glib.String str) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_append_headers.invokeExact(
                    handle(),
                    str.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Allocate a new copy of {@code msg} and store the result in {@code copy}. The value in
     * {@code copy} should be release with gst_rtsp_message_free function.
     * @param copy pointer to new {@link RTSPMessage}
     * @return a {@link RTSPResult}
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult copy(@NotNull Out<org.gstreamer.rtsp.RTSPMessage> copy) {
        java.util.Objects.requireNonNull(copy, "Parameter 'copy' must not be null");
        MemorySegment copyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_copy.invokeExact(
                    handle(),
                    (Addressable) copyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        copy.set(new org.gstreamer.rtsp.RTSPMessage(copyPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Dump the contents of {@code msg} to stdout.
     * @return {@code GST_RTSP_OK}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult dump() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_dump.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Free the memory used by {@code msg}.
     * @return a {@link RTSPResult}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult free() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Get the body of {@code msg}. {@code data} remains valid for as long as {@code msg} is valid and
     * unchanged.
     * <p>
     * If the message body was set as a {@link org.gstreamer.gst.Buffer} before this will cause the data
     * to be copied and stored in the message. The {@link org.gstreamer.gst.Buffer} will no longer be
     * kept in the message.
     * @param data location for the data
     * @param size location for the size of {@code data}
     * @return {@code GST_RTSP_OK}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult getBody(@NotNull Out<byte[]> data, Out<Integer> size) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemorySegment dataPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(size, "Parameter 'size' must not be null");
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_get_body.invokeExact(
                    handle(),
                    (Addressable) dataPOINTER.address(),
                    (Addressable) sizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        size.set(sizePOINTER.get(Interop.valueLayout.C_INT, 0));
        data.set(MemorySegment.ofAddress(dataPOINTER.get(Interop.valueLayout.ADDRESS, 0), size.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Get the body of {@code msg}. {@code buffer} remains valid for as long as {@code msg} is valid and
     * unchanged.
     * <p>
     * If body data was set from raw memory instead of a {@link org.gstreamer.gst.Buffer} this function
     * will always return {@code null}. The caller can check if there is a body buffer by
     * calling gst_rtsp_message_has_body_buffer().
     * @param buffer location for the buffer
     * @return {@code GST_RTSP_OK}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult getBodyBuffer(@NotNull Out<org.gstreamer.gst.Buffer> buffer) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        MemorySegment bufferPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_get_body_buffer.invokeExact(
                    handle(),
                    (Addressable) bufferPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.set(new org.gstreamer.gst.Buffer(bufferPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Get the {@code indx} header value with key {@code field} from {@code msg}. The result in {@code value}
     * stays valid as long as it remains present in {@code msg}.
     * @param field a {@link RTSPHeaderField}
     * @param value pointer to hold the result
     * @param indx the index of the header
     * @return {@code GST_RTSP_OK} when {@code field} was found, {@code GST_RTSP_ENOTIMPL} if the key
     * was not found.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult getHeader(@NotNull org.gstreamer.rtsp.RTSPHeaderField field, @NotNull Out<java.lang.String> value, int indx) {
        java.util.Objects.requireNonNull(field, "Parameter 'field' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_get_header.invokeExact(
                    handle(),
                    field.getValue(),
                    (Addressable) valuePOINTER.address(),
                    indx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(Interop.getStringFrom(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Get the {@code index} header value with key {@code header} from {@code msg}. The result in {@code value}
     * stays valid as long as it remains present in {@code msg}.
     * @param header a {@link RTSPHeaderField}
     * @param value pointer to hold the result
     * @param index the index of the header
     * @return {@code GST_RTSP_OK} when {@code field} was found, {@code GST_RTSP_ENOTIMPL} if the key
     * was not found.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult getHeaderByName(@NotNull java.lang.String header, @NotNull Out<java.lang.String> value, int index) {
        java.util.Objects.requireNonNull(header, "Parameter 'header' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_get_header_by_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(header),
                    (Addressable) valuePOINTER.address(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(Interop.getStringFrom(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Get the message type of {@code msg}.
     * @return the message type.
     */
    public @NotNull org.gstreamer.rtsp.RTSPMsgType getType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_get_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPMsgType.of(RESULT);
    }
    
    /**
     * Checks if {@code msg} has a body and the body is stored as {@link org.gstreamer.gst.Buffer}.
     * @return {@code true} if {@code msg} has a body and it's stored as {@link org.gstreamer.gst.Buffer}, {@code false}
     * otherwise.
     */
    public boolean hasBodyBuffer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_has_body_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Initialize {@code msg}. This function is mostly used when {@code msg} is allocated on the
     * stack. The reverse operation of this is gst_rtsp_message_unset().
     * @return a {@link RTSPResult}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult init() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_init.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Initialize a new data {@link RTSPMessage} for {@code channel}.
     * @param channel a channel
     * @return a {@link RTSPResult}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult initData(byte channel) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_init_data.invokeExact(
                    handle(),
                    channel);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Initialize {@code msg} as a request message with {@code method} and {@code uri}. To clear {@code msg}
     * again, use gst_rtsp_message_unset().
     * @param method the request method to use
     * @param uri the uri of the request
     * @return a {@link RTSPResult}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult initRequest(@NotNull org.gstreamer.rtsp.RTSPMethod method, @NotNull java.lang.String uri) {
        java.util.Objects.requireNonNull(method, "Parameter 'method' must not be null");
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_init_request.invokeExact(
                    handle(),
                    method.getValue(),
                    Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Initialize {@code msg} with {@code code} and {@code reason}.
     * <p>
     * When {@code reason} is {@code null}, the default reason for {@code code} will be used.
     * <p>
     * When {@code request} is not {@code null}, the relevant headers will be copied to the new
     * response message.
     * @param code the status code
     * @param reason the status reason or {@code null}
     * @param request the request that triggered the response or {@code null}
     * @return a {@link RTSPResult}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult initResponse(@NotNull org.gstreamer.rtsp.RTSPStatusCode code, @Nullable java.lang.String reason, @Nullable org.gstreamer.rtsp.RTSPMessage request) {
        java.util.Objects.requireNonNull(code, "Parameter 'code' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_init_response.invokeExact(
                    handle(),
                    code.getValue(),
                    (Addressable) (reason == null ? MemoryAddress.NULL : Interop.allocateNativeString(reason)),
                    (Addressable) (request == null ? MemoryAddress.NULL : request.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Parses the credentials given in a WWW-Authenticate or Authorization header.
     * @param field a {@link RTSPHeaderField}
     * @return {@code null}-terminated array of GstRTSPAuthCredential or {@code null}.
     */
    public @NotNull PointerProxy<org.gstreamer.rtsp.RTSPAuthCredential> parseAuthCredentials(@NotNull org.gstreamer.rtsp.RTSPHeaderField field) {
        java.util.Objects.requireNonNull(field, "Parameter 'field' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_message_parse_auth_credentials.invokeExact(
                    handle(),
                    field.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerProxy<org.gstreamer.rtsp.RTSPAuthCredential>(RESULT, org.gstreamer.rtsp.RTSPAuthCredential.class);
    }
    
    /**
     * Parse the data message {@code msg} and store the channel in {@code channel}.
     * @param channel location to hold the channel
     * @return a {@link RTSPResult}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult parseData(Out<Byte> channel) {
        java.util.Objects.requireNonNull(channel, "Parameter 'channel' must not be null");
        MemorySegment channelPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_parse_data.invokeExact(
                    handle(),
                    (Addressable) channelPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        channel.set(channelPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Parse the request message {@code msg} and store the values {@code method}, {@code uri} and
     * {@code version}. The result locations can be {@code null} if one is not interested in its
     * value.
     * <p>
     * {@code uri} remains valid for as long as {@code msg} is valid and unchanged.
     * @param method location to hold the method
     * @param uri location to hold the uri
     * @param version location to hold the version
     * @return a {@link RTSPResult}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult parseRequest(@NotNull Out<org.gstreamer.rtsp.RTSPMethod> method, @NotNull Out<java.lang.String> uri, @NotNull Out<org.gstreamer.rtsp.RTSPVersion> version) {
        java.util.Objects.requireNonNull(method, "Parameter 'method' must not be null");
        MemorySegment methodPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment uriPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(version, "Parameter 'version' must not be null");
        MemorySegment versionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_parse_request.invokeExact(
                    handle(),
                    (Addressable) methodPOINTER.address(),
                    (Addressable) uriPOINTER.address(),
                    (Addressable) versionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        method.set(new org.gstreamer.rtsp.RTSPMethod(methodPOINTER.get(Interop.valueLayout.C_INT, 0)));
        uri.set(Interop.getStringFrom(uriPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        version.set(org.gstreamer.rtsp.RTSPVersion.of(versionPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Parse the response message {@code msg} and store the values {@code code}, {@code reason} and
     * {@code version}. The result locations can be {@code null} if one is not interested in its
     * value.
     * <p>
     * {@code reason} remains valid for as long as {@code msg} is valid and unchanged.
     * @param code location to hold the status code
     * @param reason location to hold the status reason
     * @param version location to hold the version
     * @return a {@link RTSPResult}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult parseResponse(@NotNull Out<org.gstreamer.rtsp.RTSPStatusCode> code, @NotNull Out<java.lang.String> reason, @NotNull Out<org.gstreamer.rtsp.RTSPVersion> version) {
        java.util.Objects.requireNonNull(code, "Parameter 'code' must not be null");
        MemorySegment codePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(reason, "Parameter 'reason' must not be null");
        MemorySegment reasonPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(version, "Parameter 'version' must not be null");
        MemorySegment versionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_parse_response.invokeExact(
                    handle(),
                    (Addressable) codePOINTER.address(),
                    (Addressable) reasonPOINTER.address(),
                    (Addressable) versionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        code.set(org.gstreamer.rtsp.RTSPStatusCode.of(codePOINTER.get(Interop.valueLayout.C_INT, 0)));
        reason.set(Interop.getStringFrom(reasonPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        version.set(org.gstreamer.rtsp.RTSPVersion.of(versionPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Remove the {@code indx} header with key {@code field} from {@code msg}. If {@code indx} equals -1, all
     * headers will be removed.
     * @param field a {@link RTSPHeaderField}
     * @param indx the index of the header
     * @return a {@link RTSPResult}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult removeHeader(@NotNull org.gstreamer.rtsp.RTSPHeaderField field, int indx) {
        java.util.Objects.requireNonNull(field, "Parameter 'field' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_remove_header.invokeExact(
                    handle(),
                    field.getValue(),
                    indx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Remove the {@code index} header with key {@code header} from {@code msg}. If {@code index} equals -1,
     * all matching headers will be removed.
     * @param header the header string
     * @param index the index of the header
     * @return a {@link RTSPResult}
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult removeHeaderByName(@NotNull java.lang.String header, int index) {
        java.util.Objects.requireNonNull(header, "Parameter 'header' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_remove_header_by_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(header),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Set the body of {@code msg} to a copy of {@code data}. Any existing body or body buffer
     * will be replaced by the new body.
     * @param data the data
     * @param size the size of {@code data}
     * @return {@code GST_RTSP_OK}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult setBody(@NotNull byte[] data, int size) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_set_body.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(data, false),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Set the body of {@code msg} to {@code buffer}. Any existing body or body buffer
     * will be replaced by the new body.
     * @param buffer a {@link org.gstreamer.gst.Buffer}
     * @return {@code GST_RTSP_OK}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult setBodyBuffer(@NotNull org.gstreamer.gst.Buffer buffer) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_set_body_buffer.invokeExact(
                    handle(),
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Take the body of {@code msg} and store it in {@code data} and {@code size}. After this method,
     * the body and size of {@code msg} will be set to {@code null} and 0 respectively.
     * @param data location for the data
     * @param size location for the size of {@code data}
     * @return {@code GST_RTSP_OK}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult stealBody(@NotNull Out<byte[]> data, Out<Integer> size) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemorySegment dataPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(size, "Parameter 'size' must not be null");
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_steal_body.invokeExact(
                    handle(),
                    (Addressable) dataPOINTER.address(),
                    (Addressable) sizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        size.set(sizePOINTER.get(Interop.valueLayout.C_INT, 0));
        data.set(MemorySegment.ofAddress(dataPOINTER.get(Interop.valueLayout.ADDRESS, 0), size.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Take the body of {@code msg} and store it in {@code buffer}. After this method,
     * the body and size of {@code msg} will be set to {@code null} and 0 respectively.
     * <p>
     * If body data was set from raw memory instead of a {@link org.gstreamer.gst.Buffer} this function
     * will always return {@code null}. The caller can check if there is a body buffer by
     * calling gst_rtsp_message_has_body_buffer().
     * @param buffer location for the buffer
     * @return {@code GST_RTSP_OK}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult stealBodyBuffer(@NotNull Out<org.gstreamer.gst.Buffer> buffer) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        MemorySegment bufferPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_steal_body_buffer.invokeExact(
                    handle(),
                    (Addressable) bufferPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.set(new org.gstreamer.gst.Buffer(bufferPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Set the body of {@code msg} to {@code data} and {@code size}. This method takes ownership of
     * {@code data}. Any existing body or body buffer will be replaced by the new body.
     * @param data the data
     * @param size the size of {@code data}
     * @return {@code GST_RTSP_OK}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult takeBody(@NotNull byte[] data, int size) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_take_body.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(data, false),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Set the body of {@code msg} to {@code buffer}. This method takes ownership of {@code buffer}.
     * Any existing body or body buffer will be replaced by the new body.
     * @param buffer a {@link org.gstreamer.gst.Buffer}
     * @return {@code GST_RTSP_OK}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult takeBodyBuffer(@NotNull org.gstreamer.gst.Buffer buffer) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_take_body_buffer.invokeExact(
                    handle(),
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.yieldOwnership();
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Add a header with key {@code field} and {@code value} to {@code msg}. This function takes
     * ownership of {@code value}.
     * @param field a {@link RTSPHeaderField}
     * @param value the value of the header
     * @return a {@link RTSPResult}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult takeHeader(@NotNull org.gstreamer.rtsp.RTSPHeaderField field, @NotNull java.lang.String value) {
        java.util.Objects.requireNonNull(field, "Parameter 'field' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_take_header.invokeExact(
                    handle(),
                    field.getValue(),
                    Interop.allocateNativeString(value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Add a header with key {@code header} and {@code value} to {@code msg}. This function takes
     * ownership of {@code value}, but not of {@code header}.
     * @param header a header string
     * @param value the value of the header
     * @return a {@link RTSPResult}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult takeHeaderByName(@NotNull java.lang.String header, @NotNull java.lang.String value) {
        java.util.Objects.requireNonNull(header, "Parameter 'header' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_take_header_by_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(header),
                    Interop.allocateNativeString(value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Unset the contents of {@code msg} so that it becomes an uninitialized
     * {@link RTSPMessage} again. This function is mostly used in combination with
     * gst_rtsp_message_init_request(), gst_rtsp_message_init_response() and
     * gst_rtsp_message_init_data() on stack allocated {@link RTSPMessage} structures.
     * @return {@code GST_RTSP_OK}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult unset() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_unset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtsp_message_add_header = Interop.downcallHandle(
            "gst_rtsp_message_add_header",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_add_header_by_name = Interop.downcallHandle(
            "gst_rtsp_message_add_header_by_name",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_append_headers = Interop.downcallHandle(
            "gst_rtsp_message_append_headers",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_copy = Interop.downcallHandle(
            "gst_rtsp_message_copy",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_dump = Interop.downcallHandle(
            "gst_rtsp_message_dump",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_free = Interop.downcallHandle(
            "gst_rtsp_message_free",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_get_body = Interop.downcallHandle(
            "gst_rtsp_message_get_body",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_get_body_buffer = Interop.downcallHandle(
            "gst_rtsp_message_get_body_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_get_header = Interop.downcallHandle(
            "gst_rtsp_message_get_header",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_get_header_by_name = Interop.downcallHandle(
            "gst_rtsp_message_get_header_by_name",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_get_type = Interop.downcallHandle(
            "gst_rtsp_message_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_has_body_buffer = Interop.downcallHandle(
            "gst_rtsp_message_has_body_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_init = Interop.downcallHandle(
            "gst_rtsp_message_init",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_init_data = Interop.downcallHandle(
            "gst_rtsp_message_init_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_init_request = Interop.downcallHandle(
            "gst_rtsp_message_init_request",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_init_response = Interop.downcallHandle(
            "gst_rtsp_message_init_response",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_parse_auth_credentials = Interop.downcallHandle(
            "gst_rtsp_message_parse_auth_credentials",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_parse_data = Interop.downcallHandle(
            "gst_rtsp_message_parse_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_parse_request = Interop.downcallHandle(
            "gst_rtsp_message_parse_request",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_parse_response = Interop.downcallHandle(
            "gst_rtsp_message_parse_response",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_remove_header = Interop.downcallHandle(
            "gst_rtsp_message_remove_header",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_remove_header_by_name = Interop.downcallHandle(
            "gst_rtsp_message_remove_header_by_name",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_set_body = Interop.downcallHandle(
            "gst_rtsp_message_set_body",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_set_body_buffer = Interop.downcallHandle(
            "gst_rtsp_message_set_body_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_steal_body = Interop.downcallHandle(
            "gst_rtsp_message_steal_body",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_steal_body_buffer = Interop.downcallHandle(
            "gst_rtsp_message_steal_body_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_take_body = Interop.downcallHandle(
            "gst_rtsp_message_take_body",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_take_body_buffer = Interop.downcallHandle(
            "gst_rtsp_message_take_body_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_take_header = Interop.downcallHandle(
            "gst_rtsp_message_take_header",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_take_header_by_name = Interop.downcallHandle(
            "gst_rtsp_message_take_header_by_name",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_unset = Interop.downcallHandle(
            "gst_rtsp_message_unset",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private RTSPMessage struct;
        
         /**
         * A {@link RTSPMessage.Build} object constructs a {@link RTSPMessage} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = RTSPMessage.allocate();
        }
        
         /**
         * Finish building the {@link RTSPMessage} struct.
         * @return A new instance of {@code RTSPMessage} with the fields 
         *         that were set in the Build object.
         */
        public RTSPMessage construct() {
            return struct;
        }
        
        /**
         * the message type
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setType(org.gstreamer.rtsp.RTSPMsgType type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
            return this;
        }
        
        public Build setHdrFields(java.lang.foreign.MemoryAddress[] hdrFields) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hdr_fields"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hdrFields == null ? MemoryAddress.NULL : Interop.allocateNativeArray(hdrFields, false)));
            return this;
        }
        
        public Build setBody(PointerByte body) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("body"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (body == null ? MemoryAddress.NULL : body.handle()));
            return this;
        }
        
        public Build setBodySize(int bodySize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("body_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bodySize);
            return this;
        }
        
        public Build setBodyBuffer(org.gstreamer.gst.Buffer bodyBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("body_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (bodyBuffer == null ? MemoryAddress.NULL : bodyBuffer.handle()));
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
