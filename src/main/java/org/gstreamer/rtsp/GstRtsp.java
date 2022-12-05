package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstRtsp namespace.
 */
public final class GstRtsp {
    
    static {
        System.loadLibrary("gstrtsp-1.0");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
    /**
     * The default RTSP port to connect to.
     */
    public static final int RTSP_DEFAULT_PORT = 554;
    
    /**
     * Free a {@code null}-terminated array of credentials returned from
     * gst_rtsp_message_parse_auth_credentials().
     * @param credentials a {@code null}-terminated array of {@link RTSPAuthCredential}
     */
    public static void rtspAuthCredentialsFree(@NotNull PointerProxy<org.gstreamer.rtsp.RTSPAuthCredential> credentials) {
        java.util.Objects.requireNonNull(credentials, "Parameter 'credentials' must not be null");
        try {
            DowncallHandles.gst_rtsp_auth_credentials_free.invokeExact(
                    credentials.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Accept a new connection on {@code socket} and create a new {@link RTSPConnection} for
     * handling communication on new socket.
     * @param socket a socket
     * @param conn storage for a {@link RTSPConnection}
     * @param cancellable a {@link org.gtk.gio.Cancellable} to cancel the operation
     * @return {@code GST_RTSP_OK} when {@code conn} contains a valid connection.
     */
    public static @NotNull org.gstreamer.rtsp.RTSPResult rtspConnectionAccept(@NotNull org.gtk.gio.Socket socket, @NotNull Out<org.gstreamer.rtsp.RTSPConnection> conn, @Nullable org.gtk.gio.Cancellable cancellable) {
        java.util.Objects.requireNonNull(socket, "Parameter 'socket' must not be null");
        java.util.Objects.requireNonNull(conn, "Parameter 'conn' must not be null");
        MemorySegment connPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_accept.invokeExact(
                    socket.handle(),
                    (Addressable) connPOINTER.address(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        conn.set(new org.gstreamer.rtsp.RTSPConnection(connPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Create a newly allocated {@link RTSPConnection} from {@code url} and store it in {@code conn}.
     * The connection will not yet attempt to connect to {@code url}, use
     * gst_rtsp_connection_connect().
     * <p>
     * A copy of {@code url} will be made.
     * @param url a {@link RTSPUrl}
     * @param conn storage for a {@link RTSPConnection}
     * @return {@code GST_RTSP_OK} when {@code conn} contains a valid connection.
     */
    public static @NotNull org.gstreamer.rtsp.RTSPResult rtspConnectionCreate(@NotNull org.gstreamer.rtsp.RTSPUrl url, @NotNull Out<org.gstreamer.rtsp.RTSPConnection> conn) {
        java.util.Objects.requireNonNull(url, "Parameter 'url' must not be null");
        java.util.Objects.requireNonNull(conn, "Parameter 'conn' must not be null");
        MemorySegment connPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_create.invokeExact(
                    url.handle(),
                    (Addressable) connPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        conn.set(new org.gstreamer.rtsp.RTSPConnection(connPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Create a new {@link RTSPConnection} for handling communication on the existing
     * socket {@code socket}. The {@code initial_buffer} contains zero terminated data already
     * read from {@code socket} which should be used before starting to read new data.
     * @param socket a {@link org.gtk.gio.Socket}
     * @param ip the IP address of the other end
     * @param port the port used by the other end
     * @param initialBuffer data already read from {@code fd}
     * @param conn storage for a {@link RTSPConnection}
     * @return {@code GST_RTSP_OK} when {@code conn} contains a valid connection.
     */
    public static @NotNull org.gstreamer.rtsp.RTSPResult rtspConnectionCreateFromSocket(@NotNull org.gtk.gio.Socket socket, @NotNull java.lang.String ip, short port, @NotNull java.lang.String initialBuffer, @NotNull Out<org.gstreamer.rtsp.RTSPConnection> conn) {
        java.util.Objects.requireNonNull(socket, "Parameter 'socket' must not be null");
        java.util.Objects.requireNonNull(ip, "Parameter 'ip' must not be null");
        java.util.Objects.requireNonNull(initialBuffer, "Parameter 'initialBuffer' must not be null");
        java.util.Objects.requireNonNull(conn, "Parameter 'conn' must not be null");
        MemorySegment connPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_create_from_socket.invokeExact(
                    socket.handle(),
                    Interop.allocateNativeString(ip),
                    port,
                    Interop.allocateNativeString(initialBuffer),
                    (Addressable) connPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        conn.set(new org.gstreamer.rtsp.RTSPConnection(connPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Convert {@code header} to a {@link RTSPHeaderField}.
     * @param header a header string
     * @return a {@link RTSPHeaderField} for {@code header} or {@code GST_RTSP_HDR_INVALID} if the
     * header field is unknown.
     */
    public static @NotNull org.gstreamer.rtsp.RTSPHeaderField rtspFindHeaderField(@NotNull java.lang.String header) {
        java.util.Objects.requireNonNull(header, "Parameter 'header' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_find_header_field.invokeExact(
                    Interop.allocateNativeString(header));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPHeaderField.of(RESULT);
    }
    
    /**
     * Convert {@code method} to a {@link RTSPMethod}.
     * @param method a method
     * @return a {@link RTSPMethod} for {@code method} or {@code GST_RTSP_INVALID} if the
     * method is unknown.
     */
    public static @NotNull org.gstreamer.rtsp.RTSPMethod rtspFindMethod(@NotNull java.lang.String method) {
        java.util.Objects.requireNonNull(method, "Parameter 'method' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_find_method.invokeExact(
                    Interop.allocateNativeString(method));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.rtsp.RTSPMethod(RESULT);
    }
    
    /**
     * Calculates the digest auth response from the values given by the server and
     * the username and password. See RFC2069 for details.
     * <p>
     * Currently only supported algorithm "md5".
     * @param algorithm Hash algorithm to use, or {@code null} for MD5
     * @param method Request method, e.g. PLAY
     * @param realm Realm
     * @param username Username
     * @param password Password
     * @param uri Original request URI
     * @param nonce Nonce
     * @return Authentication response or {@code null} if unsupported
     */
    public static @NotNull java.lang.String rtspGenerateDigestAuthResponse(@Nullable java.lang.String algorithm, @NotNull java.lang.String method, @NotNull java.lang.String realm, @NotNull java.lang.String username, @NotNull java.lang.String password, @NotNull java.lang.String uri, @NotNull java.lang.String nonce) {
        java.util.Objects.requireNonNull(method, "Parameter 'method' must not be null");
        java.util.Objects.requireNonNull(realm, "Parameter 'realm' must not be null");
        java.util.Objects.requireNonNull(username, "Parameter 'username' must not be null");
        java.util.Objects.requireNonNull(password, "Parameter 'password' must not be null");
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(nonce, "Parameter 'nonce' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_generate_digest_auth_response.invokeExact(
                    (Addressable) (algorithm == null ? MemoryAddress.NULL : Interop.allocateNativeString(algorithm)),
                    Interop.allocateNativeString(method),
                    Interop.allocateNativeString(realm),
                    Interop.allocateNativeString(username),
                    Interop.allocateNativeString(password),
                    Interop.allocateNativeString(uri),
                    Interop.allocateNativeString(nonce));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Calculates the digest auth response from the values given by the server and
     * the md5sum. See RFC2069 for details.
     * <p>
     * This function is useful when the passwords are not stored in clear text,
     * but instead in the same format as the .htdigest file.
     * <p>
     * Currently only supported algorithm "md5".
     * @param algorithm Hash algorithm to use, or {@code null} for MD5
     * @param method Request method, e.g. PLAY
     * @param md5 The md5 sum of username:realm:password
     * @param uri Original request URI
     * @param nonce Nonce
     * @return Authentication response or {@code null} if unsupported
     */
    public static @NotNull java.lang.String rtspGenerateDigestAuthResponseFromMd5(@Nullable java.lang.String algorithm, @NotNull java.lang.String method, @NotNull java.lang.String md5, @NotNull java.lang.String uri, @NotNull java.lang.String nonce) {
        java.util.Objects.requireNonNull(method, "Parameter 'method' must not be null");
        java.util.Objects.requireNonNull(md5, "Parameter 'md5' must not be null");
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(nonce, "Parameter 'nonce' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_generate_digest_auth_response_from_md5.invokeExact(
                    (Addressable) (algorithm == null ? MemoryAddress.NULL : Interop.allocateNativeString(algorithm)),
                    Interop.allocateNativeString(method),
                    Interop.allocateNativeString(md5),
                    Interop.allocateNativeString(uri),
                    Interop.allocateNativeString(nonce));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Check whether {@code field} may appear multiple times in a message.
     * @param field a {@link RTSPHeaderField}
     * @return {@code true} if multiple headers are allowed.
     */
    public static boolean rtspHeaderAllowMultiple(@NotNull org.gstreamer.rtsp.RTSPHeaderField field) {
        java.util.Objects.requireNonNull(field, "Parameter 'field' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_header_allow_multiple.invokeExact(
                    field.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Convert {@code field} to a string.
     * @param field a {@link RTSPHeaderField}
     * @return a string representation of {@code field}.
     */
    public static @NotNull java.lang.String rtspHeaderAsText(@NotNull org.gstreamer.rtsp.RTSPHeaderField field) {
        java.util.Objects.requireNonNull(field, "Parameter 'field' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_header_as_text.invokeExact(
                    field.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Create a new initialized {@link RTSPMessage}. Free with gst_rtsp_message_free().
     * @param msg a location for the new {@link RTSPMessage}
     * @return a {@link RTSPResult}.
     */
    public static @NotNull org.gstreamer.rtsp.RTSPResult rtspMessageNew(@NotNull Out<org.gstreamer.rtsp.RTSPMessage> msg) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        MemorySegment msgPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_new.invokeExact(
                    (Addressable) msgPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        msg.set(new org.gstreamer.rtsp.RTSPMessage(msgPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Create a new data {@link RTSPMessage} with {@code channel} and store the
     * result message in {@code msg}. Free with gst_rtsp_message_free().
     * @param msg a location for the new {@link RTSPMessage}
     * @param channel the channel
     * @return a {@link RTSPResult}.
     */
    public static @NotNull org.gstreamer.rtsp.RTSPResult rtspMessageNewData(@NotNull Out<org.gstreamer.rtsp.RTSPMessage> msg, byte channel) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        MemorySegment msgPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_new_data.invokeExact(
                    (Addressable) msgPOINTER.address(),
                    channel);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        msg.set(new org.gstreamer.rtsp.RTSPMessage(msgPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Create a new {@link RTSPMessage} with {@code method} and {@code uri} and store the result
     * request message in {@code msg}. Free with gst_rtsp_message_free().
     * @param msg a location for the new {@link RTSPMessage}
     * @param method the request method to use
     * @param uri the uri of the request
     * @return a {@link RTSPResult}.
     */
    public static @NotNull org.gstreamer.rtsp.RTSPResult rtspMessageNewRequest(@NotNull Out<org.gstreamer.rtsp.RTSPMessage> msg, @NotNull org.gstreamer.rtsp.RTSPMethod method, @NotNull java.lang.String uri) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        MemorySegment msgPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(method, "Parameter 'method' must not be null");
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_new_request.invokeExact(
                    (Addressable) msgPOINTER.address(),
                    method.getValue(),
                    Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        msg.set(new org.gstreamer.rtsp.RTSPMessage(msgPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Create a new response {@link RTSPMessage} with {@code code} and {@code reason} and store the
     * result message in {@code msg}. Free with gst_rtsp_message_free().
     * <p>
     * When {@code reason} is {@code null}, the default reason for {@code code} will be used.
     * <p>
     * When {@code request} is not {@code null}, the relevant headers will be copied to the new
     * response message.
     * @param msg a location for the new {@link RTSPMessage}
     * @param code the status code
     * @param reason the status reason or {@code null}
     * @param request the request that triggered the response or {@code null}
     * @return a {@link RTSPResult}.
     */
    public static @NotNull org.gstreamer.rtsp.RTSPResult rtspMessageNewResponse(@NotNull Out<org.gstreamer.rtsp.RTSPMessage> msg, @NotNull org.gstreamer.rtsp.RTSPStatusCode code, @Nullable java.lang.String reason, @Nullable org.gstreamer.rtsp.RTSPMessage request) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        MemorySegment msgPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(code, "Parameter 'code' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_new_response.invokeExact(
                    (Addressable) msgPOINTER.address(),
                    code.getValue(),
                    (Addressable) (reason == null ? MemoryAddress.NULL : Interop.allocateNativeString(reason)),
                    (Addressable) (request == null ? MemoryAddress.NULL : request.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        msg.set(new org.gstreamer.rtsp.RTSPMessage(msgPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Convert {@code method} to a string.
     * @param method a {@link RTSPMethod}
     * @return a string representation of {@code method}.
     */
    public static @NotNull java.lang.String rtspMethodAsText(@NotNull org.gstreamer.rtsp.RTSPMethod method) {
        java.util.Objects.requireNonNull(method, "Parameter 'method' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_method_as_text.invokeExact(
                    method.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Convert {@code options} to a string.
     * @param options one or more {@link RTSPMethod}
     * @return a new string of {@code options}. g_free() after usage.
     */
    public static @NotNull java.lang.String rtspOptionsAsText(@NotNull org.gstreamer.rtsp.RTSPMethod options) {
        java.util.Objects.requireNonNull(options, "Parameter 'options' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_options_as_text.invokeExact(
                    options.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Convert the comma separated list {@code options} to a {@link RTSPMethod} bitwise or
     * of methods. This functions is the reverse of gst_rtsp_options_as_text().
     * @param options a comma separated list of options
     * @return a {@link RTSPMethod}
     */
    public static @NotNull org.gstreamer.rtsp.RTSPMethod rtspOptionsFromText(@NotNull java.lang.String options) {
        java.util.Objects.requireNonNull(options, "Parameter 'options' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_options_from_text.invokeExact(
                    Interop.allocateNativeString(options));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.rtsp.RTSPMethod(RESULT);
    }
    
    /**
     * Converts the range in-place between different types of units.
     * Ranges containing the special value {@code GST_RTSP_TIME_NOW} can not be
     * converted as these are only valid for {@code GST_RTSP_RANGE_NPT}.
     * @param range a {@link RTSPTimeRange}
     * @param unit the unit to convert the range into
     * @return {@code true} if the range could be converted
     */
    public static boolean rtspRangeConvertUnits(@NotNull org.gstreamer.rtsp.RTSPTimeRange range, @NotNull org.gstreamer.rtsp.RTSPRangeUnit unit) {
        java.util.Objects.requireNonNull(range, "Parameter 'range' must not be null");
        java.util.Objects.requireNonNull(unit, "Parameter 'unit' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_range_convert_units.invokeExact(
                    range.handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Free the memory allocated by {@code range}.
     * @param range a {@link RTSPTimeRange}
     */
    public static void rtspRangeFree(@NotNull org.gstreamer.rtsp.RTSPTimeRange range) {
        java.util.Objects.requireNonNull(range, "Parameter 'range' must not be null");
        try {
            DowncallHandles.gst_rtsp_range_free.invokeExact(
                    range.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieve the minimum and maximum values from {@code range} converted to
     * {@link org.gstreamer.gst.ClockTime} in {@code min} and {@code max}.
     * <p>
     * A value of {@code GST_CLOCK_TIME_NONE} will be used to signal {@code GST_RTSP_TIME_NOW}
     * and {@code GST_RTSP_TIME_END} for {@code min} and {@code max} respectively.
     * <p>
     * UTC times will be converted to nanoseconds since 1900.
     * @param range a {@link RTSPTimeRange}
     * @param min result minimum {@link org.gstreamer.gst.ClockTime}
     * @param max result maximum {@link org.gstreamer.gst.ClockTime}
     * @return {@code true} on success.
     */
    public static boolean rtspRangeGetTimes(@NotNull org.gstreamer.rtsp.RTSPTimeRange range, @NotNull Out<org.gstreamer.gst.ClockTime> min, @NotNull Out<org.gstreamer.gst.ClockTime> max) {
        java.util.Objects.requireNonNull(range, "Parameter 'range' must not be null");
        java.util.Objects.requireNonNull(min, "Parameter 'min' must not be null");
        MemorySegment minPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        java.util.Objects.requireNonNull(max, "Parameter 'max' must not be null");
        MemorySegment maxPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_range_get_times.invokeExact(
                    range.handle(),
                    (Addressable) minPOINTER.address(),
                    (Addressable) maxPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        min.set(new org.gstreamer.gst.ClockTime(minPOINTER.get(Interop.valueLayout.C_LONG, 0)));
        max.set(new org.gstreamer.gst.ClockTime(maxPOINTER.get(Interop.valueLayout.C_LONG, 0)));
        return RESULT != 0;
    }
    
    /**
     * Parse {@code rangestr} to a {@link RTSPTimeRange}.
     * @param rangestr a range string to parse
     * @param range location to hold the {@link RTSPTimeRange} result
     * @return {@code GST_RTSP_OK} on success.
     */
    public static @NotNull org.gstreamer.rtsp.RTSPResult rtspRangeParse(@NotNull java.lang.String rangestr, @NotNull Out<org.gstreamer.rtsp.RTSPTimeRange> range) {
        java.util.Objects.requireNonNull(rangestr, "Parameter 'rangestr' must not be null");
        java.util.Objects.requireNonNull(range, "Parameter 'range' must not be null");
        MemorySegment rangePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_range_parse.invokeExact(
                    Interop.allocateNativeString(rangestr),
                    (Addressable) rangePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        range.set(new org.gstreamer.rtsp.RTSPTimeRange(rangePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Convert {@code range} into a string representation.
     * @param range a {@link RTSPTimeRange}
     * @return The string representation of {@code range}. g_free() after usage.
     */
    public static @NotNull java.lang.String rtspRangeToString(@NotNull org.gstreamer.rtsp.RTSPTimeRange range) {
        java.util.Objects.requireNonNull(range, "Parameter 'range' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_range_to_string.invokeExact(
                    range.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Convert {@code code} to a string.
     * @param code a {@link RTSPStatusCode}
     * @return a string representation of {@code code}.
     */
    public static @NotNull java.lang.String rtspStatusAsText(@NotNull org.gstreamer.rtsp.RTSPStatusCode code) {
        java.util.Objects.requireNonNull(code, "Parameter 'code' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_status_as_text.invokeExact(
                    code.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Convert {@code result} in a human readable string.
     * @param result a {@link RTSPResult}
     * @return a newly allocated string. g_free() after usage.
     */
    public static @NotNull java.lang.String rtspStrresult(@NotNull org.gstreamer.rtsp.RTSPResult result) {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_strresult.invokeExact(
                    result.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the {@link org.gstreamer.gst.Element} that can handle the buffers transported over {@code trans}.
     * <p>
     * It is possible that there are several managers available, use {@code option} to
     * selected one.
     * <p>
     * {@code manager} will contain an element name or {@code null} when no manager is
     * needed/available for {@code trans}.
     * @param trans a {@link RTSPTransMode}
     * @param manager location to hold the result
     * @param option option index.
     * @return {@code GST_RTSP_OK}.
     */
    public static @NotNull org.gstreamer.rtsp.RTSPResult rtspTransportGetManager(@NotNull org.gstreamer.rtsp.RTSPTransMode trans, @Nullable Out<java.lang.String> manager, int option) {
        java.util.Objects.requireNonNull(trans, "Parameter 'trans' must not be null");
        MemorySegment managerPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_transport_get_manager.invokeExact(
                    trans.getValue(),
                    (Addressable) (manager == null ? MemoryAddress.NULL : (Addressable) managerPOINTER.address()),
                    option);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (manager != null) manager.set(Interop.getStringFrom(managerPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Get the mime type of the transport mode {@code trans}. This mime type is typically
     * used to generate {@link org.gstreamer.gst.Caps} events.
     * @param trans a {@link RTSPTransMode}
     * @param mime location to hold the result
     * @return {@code GST_RTSP_OK}.
     * @deprecated This functions only deals with the GstRTSPTransMode and only
     *    returns the mime type for {@code GST_RTSP_PROFILE_AVP}. Use
     *    gst_rtsp_transport_get_media_type() instead.
     */
    @Deprecated
    public static @NotNull org.gstreamer.rtsp.RTSPResult rtspTransportGetMime(@NotNull org.gstreamer.rtsp.RTSPTransMode trans, @NotNull PointerString mime) {
        java.util.Objects.requireNonNull(trans, "Parameter 'trans' must not be null");
        java.util.Objects.requireNonNull(mime, "Parameter 'mime' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_transport_get_mime.invokeExact(
                    trans.getValue(),
                    mime.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Allocate a new initialized {@link RTSPTransport}. Use gst_rtsp_transport_free()
     * after usage.
     * @param transport location to hold the new {@link RTSPTransport}
     * @return a {@link RTSPResult}.
     */
    public static @NotNull org.gstreamer.rtsp.RTSPResult rtspTransportNew(@NotNull PointerProxy<org.gstreamer.rtsp.RTSPTransport> transport) {
        java.util.Objects.requireNonNull(transport, "Parameter 'transport' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_transport_new.invokeExact(
                    transport.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Parse the RTSP transport string {@code str} into {@code transport}.
     * @param str a transport string
     * @param transport a {@link RTSPTransport}
     * @return a {@link RTSPResult}.
     */
    public static @NotNull org.gstreamer.rtsp.RTSPResult rtspTransportParse(@NotNull java.lang.String str, @NotNull org.gstreamer.rtsp.RTSPTransport transport) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        java.util.Objects.requireNonNull(transport, "Parameter 'transport' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_transport_parse.invokeExact(
                    Interop.allocateNativeString(str),
                    transport.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Parse the RTSP {@code urlstr} into a newly allocated {@link RTSPUrl}. Free after usage
     * with gst_rtsp_url_free().
     * @param urlstr the url string to parse
     * @param url location to hold the result.
     * @return a {@link RTSPResult}.
     */
    public static @NotNull org.gstreamer.rtsp.RTSPResult rtspUrlParse(@NotNull java.lang.String urlstr, @NotNull Out<org.gstreamer.rtsp.RTSPUrl> url) {
        java.util.Objects.requireNonNull(urlstr, "Parameter 'urlstr' must not be null");
        java.util.Objects.requireNonNull(url, "Parameter 'url' must not be null");
        MemorySegment urlPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_url_parse.invokeExact(
                    Interop.allocateNativeString(urlstr),
                    (Addressable) urlPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        url.set(new org.gstreamer.rtsp.RTSPUrl(urlPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Convert {@code version} to a string.
     * @param version a {@link RTSPVersion}
     * @return a string representation of {@code version}.
     */
    public static @NotNull java.lang.String rtspVersionAsText(@NotNull org.gstreamer.rtsp.RTSPVersion version) {
        java.util.Objects.requireNonNull(version, "Parameter 'version' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_version_as_text.invokeExact(
                    version.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Create a watch object for {@code conn}. The functions provided in {@code funcs} will be
     * called with {@code user_data} when activity happened on the watch.
     * <p>
     * The new watch is usually created so that it can be attached to a
     * maincontext with gst_rtsp_watch_attach().
     * <p>
     * {@code conn} must exist for the entire lifetime of the watch.
     * @param conn a {@link RTSPConnection}
     * @param funcs watch functions
     * @param userData user data to pass to {@code funcs}
     * @param notify notify when {@code user_data} is not referenced anymore
     * @return a {@link RTSPWatch} that can be used for asynchronous RTSP
     * communication. Free with gst_rtsp_watch_unref () after usage.
     */
    public static @NotNull org.gstreamer.rtsp.RTSPWatch rtspWatchNew(@NotNull org.gstreamer.rtsp.RTSPConnection conn, @NotNull org.gstreamer.rtsp.RTSPWatchFuncs funcs, @Nullable java.lang.foreign.MemoryAddress userData, @NotNull org.gtk.glib.DestroyNotify notify) {
        java.util.Objects.requireNonNull(conn, "Parameter 'conn' must not be null");
        java.util.Objects.requireNonNull(funcs, "Parameter 'funcs' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_watch_new.invokeExact(
                    conn.handle(),
                    funcs.handle(),
                    (Addressable) userData,
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.rtsp.RTSPWatch(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtsp_auth_credentials_free = Interop.downcallHandle(
            "gst_rtsp_auth_credentials_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_connection_accept = Interop.downcallHandle(
            "gst_rtsp_connection_accept",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_connection_create = Interop.downcallHandle(
            "gst_rtsp_connection_create",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_connection_create_from_socket = Interop.downcallHandle(
            "gst_rtsp_connection_create_from_socket",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_find_header_field = Interop.downcallHandle(
            "gst_rtsp_find_header_field",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_find_method = Interop.downcallHandle(
            "gst_rtsp_find_method",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_generate_digest_auth_response = Interop.downcallHandle(
            "gst_rtsp_generate_digest_auth_response",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_generate_digest_auth_response_from_md5 = Interop.downcallHandle(
            "gst_rtsp_generate_digest_auth_response_from_md5",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_header_allow_multiple = Interop.downcallHandle(
            "gst_rtsp_header_allow_multiple",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_header_as_text = Interop.downcallHandle(
            "gst_rtsp_header_as_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_new = Interop.downcallHandle(
            "gst_rtsp_message_new",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_new_data = Interop.downcallHandle(
            "gst_rtsp_message_new_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_new_request = Interop.downcallHandle(
            "gst_rtsp_message_new_request",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_message_new_response = Interop.downcallHandle(
            "gst_rtsp_message_new_response",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_method_as_text = Interop.downcallHandle(
            "gst_rtsp_method_as_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_options_as_text = Interop.downcallHandle(
            "gst_rtsp_options_as_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_options_from_text = Interop.downcallHandle(
            "gst_rtsp_options_from_text",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_range_convert_units = Interop.downcallHandle(
            "gst_rtsp_range_convert_units",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_range_free = Interop.downcallHandle(
            "gst_rtsp_range_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_range_get_times = Interop.downcallHandle(
            "gst_rtsp_range_get_times",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_range_parse = Interop.downcallHandle(
            "gst_rtsp_range_parse",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_range_to_string = Interop.downcallHandle(
            "gst_rtsp_range_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_status_as_text = Interop.downcallHandle(
            "gst_rtsp_status_as_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_strresult = Interop.downcallHandle(
            "gst_rtsp_strresult",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_transport_get_manager = Interop.downcallHandle(
            "gst_rtsp_transport_get_manager",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_transport_get_mime = Interop.downcallHandle(
            "gst_rtsp_transport_get_mime",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_transport_new = Interop.downcallHandle(
            "gst_rtsp_transport_new",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_transport_parse = Interop.downcallHandle(
            "gst_rtsp_transport_parse",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_url_parse = Interop.downcallHandle(
            "gst_rtsp_url_parse",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_version_as_text = Interop.downcallHandle(
            "gst_rtsp_version_as_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_watch_new = Interop.downcallHandle(
            "gst_rtsp_watch_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
        
        public static int cbRTSPConnectionAcceptCertificateFunc(MemoryAddress conn, MemoryAddress peerCert, int errors, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (RTSPConnectionAcceptCertificateFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onRTSPConnectionAcceptCertificateFunc(new org.gtk.gio.TlsConnection(conn, Ownership.NONE), new org.gtk.gio.TlsCertificate(peerCert, Ownership.NONE), new org.gtk.gio.TlsCertificateFlags(errors));
            return RESULT ? 1 : 0;
        }
    }
}
