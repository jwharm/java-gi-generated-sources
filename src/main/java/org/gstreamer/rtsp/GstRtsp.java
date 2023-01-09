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
        LibLoad.loadLibrary("gstrtsp-1.0");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}
    
/**
 * The default RTSP port to connect to.
 */
public static final int RTSP_DEFAULT_PORT = 554;

/**
 * Free a {@code null}-terminated array of credentials returned from
 * gst_rtsp_message_parse_auth_credentials().
 * @param credentials a {@code null}-terminated array of {@link RTSPAuthCredential}
 */
public static void rtspAuthCredentialsFree(PointerProxy<org.gstreamer.rtsp.RTSPAuthCredential> credentials) {
    try {
        DowncallHandles.gst_rtsp_auth_credentials_free.invokeExact(credentials.handle());
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
public static org.gstreamer.rtsp.RTSPResult rtspConnectionAccept(org.gtk.gio.Socket socket, Out<org.gstreamer.rtsp.RTSPConnection> conn, @Nullable org.gtk.gio.Cancellable cancellable) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment connPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_accept.invokeExact(
                    socket.handle(),
                    (Addressable) connPOINTER.address(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                conn.set(org.gstreamer.rtsp.RTSPConnection.fromAddress.marshal(connPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
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
public static org.gstreamer.rtsp.RTSPResult rtspConnectionCreate(org.gstreamer.rtsp.RTSPUrl url, Out<org.gstreamer.rtsp.RTSPConnection> conn) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment connPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_create.invokeExact(
                    url.handle(),
                    (Addressable) connPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                conn.set(org.gstreamer.rtsp.RTSPConnection.fromAddress.marshal(connPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
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
public static org.gstreamer.rtsp.RTSPResult rtspConnectionCreateFromSocket(org.gtk.gio.Socket socket, java.lang.String ip, short port, java.lang.String initialBuffer, Out<org.gstreamer.rtsp.RTSPConnection> conn) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment connPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_create_from_socket.invokeExact(
                    socket.handle(),
                    Marshal.stringToAddress.marshal(ip, SCOPE),
                    port,
                    Marshal.stringToAddress.marshal(initialBuffer, SCOPE),
                    (Addressable) connPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                conn.set(org.gstreamer.rtsp.RTSPConnection.fromAddress.marshal(connPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
}

/**
 * Convert {@code header} to a {@link RTSPHeaderField}.
 * @param header a header string
 * @return a {@link RTSPHeaderField} for {@code header} or {@code GST_RTSP_HDR_INVALID} if the
 * header field is unknown.
 */
public static org.gstreamer.rtsp.RTSPHeaderField rtspFindHeaderField(java.lang.String header) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_find_header_field.invokeExact(Marshal.stringToAddress.marshal(header, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPHeaderField.of(RESULT);
    }
}

/**
 * Convert {@code method} to a {@link RTSPMethod}.
 * @param method a method
 * @return a {@link RTSPMethod} for {@code method} or {@code GST_RTSP_INVALID} if the
 * method is unknown.
 */
public static org.gstreamer.rtsp.RTSPMethod rtspFindMethod(java.lang.String method) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_find_method.invokeExact(Marshal.stringToAddress.marshal(method, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.rtsp.RTSPMethod(RESULT);
    }
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
public static java.lang.String rtspGenerateDigestAuthResponse(@Nullable java.lang.String algorithm, java.lang.String method, java.lang.String realm, java.lang.String username, java.lang.String password, java.lang.String uri, java.lang.String nonce) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_generate_digest_auth_response.invokeExact(
                    (Addressable) (algorithm == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(algorithm, SCOPE)),
                    Marshal.stringToAddress.marshal(method, SCOPE),
                    Marshal.stringToAddress.marshal(realm, SCOPE),
                    Marshal.stringToAddress.marshal(username, SCOPE),
                    Marshal.stringToAddress.marshal(password, SCOPE),
                    Marshal.stringToAddress.marshal(uri, SCOPE),
                    Marshal.stringToAddress.marshal(nonce, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
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
public static java.lang.String rtspGenerateDigestAuthResponseFromMd5(@Nullable java.lang.String algorithm, java.lang.String method, java.lang.String md5, java.lang.String uri, java.lang.String nonce) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_generate_digest_auth_response_from_md5.invokeExact(
                    (Addressable) (algorithm == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(algorithm, SCOPE)),
                    Marshal.stringToAddress.marshal(method, SCOPE),
                    Marshal.stringToAddress.marshal(md5, SCOPE),
                    Marshal.stringToAddress.marshal(uri, SCOPE),
                    Marshal.stringToAddress.marshal(nonce, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Check whether {@code field} may appear multiple times in a message.
 * @param field a {@link RTSPHeaderField}
 * @return {@code true} if multiple headers are allowed.
 */
public static boolean rtspHeaderAllowMultiple(org.gstreamer.rtsp.RTSPHeaderField field) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_rtsp_header_allow_multiple.invokeExact(field.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Convert {@code field} to a string.
 * @param field a {@link RTSPHeaderField}
 * @return a string representation of {@code field}.
 */
public static java.lang.String rtspHeaderAsText(org.gstreamer.rtsp.RTSPHeaderField field) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_header_as_text.invokeExact(field.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Create a new initialized {@link RTSPMessage}. Free with gst_rtsp_message_free().
 * @param msg a location for the new {@link RTSPMessage}
 * @return a {@link RTSPResult}.
 */
public static org.gstreamer.rtsp.RTSPResult rtspMessageNew(Out<org.gstreamer.rtsp.RTSPMessage> msg) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment msgPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_new.invokeExact((Addressable) msgPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                msg.set(org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(msgPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
}

/**
 * Create a new data {@link RTSPMessage} with {@code channel} and store the
 * result message in {@code msg}. Free with gst_rtsp_message_free().
 * @param msg a location for the new {@link RTSPMessage}
 * @param channel the channel
 * @return a {@link RTSPResult}.
 */
public static org.gstreamer.rtsp.RTSPResult rtspMessageNewData(Out<org.gstreamer.rtsp.RTSPMessage> msg, byte channel) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment msgPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_new_data.invokeExact(
                    (Addressable) msgPOINTER.address(),
                    channel);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                msg.set(org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(msgPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
}

/**
 * Create a new {@link RTSPMessage} with {@code method} and {@code uri} and store the result
 * request message in {@code msg}. Free with gst_rtsp_message_free().
 * @param msg a location for the new {@link RTSPMessage}
 * @param method the request method to use
 * @param uri the uri of the request
 * @return a {@link RTSPResult}.
 */
public static org.gstreamer.rtsp.RTSPResult rtspMessageNewRequest(Out<org.gstreamer.rtsp.RTSPMessage> msg, org.gstreamer.rtsp.RTSPMethod method, java.lang.String uri) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment msgPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_new_request.invokeExact(
                    (Addressable) msgPOINTER.address(),
                    method.getValue(),
                    Marshal.stringToAddress.marshal(uri, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                msg.set(org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(msgPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
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
public static org.gstreamer.rtsp.RTSPResult rtspMessageNewResponse(Out<org.gstreamer.rtsp.RTSPMessage> msg, org.gstreamer.rtsp.RTSPStatusCode code, @Nullable java.lang.String reason, @Nullable org.gstreamer.rtsp.RTSPMessage request) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment msgPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_message_new_response.invokeExact(
                    (Addressable) msgPOINTER.address(),
                    code.getValue(),
                    (Addressable) (reason == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(reason, SCOPE)),
                    (Addressable) (request == null ? MemoryAddress.NULL : request.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                msg.set(org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(msgPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
}

/**
 * Convert {@code method} to a string.
 * @param method a {@link RTSPMethod}
 * @return a string representation of {@code method}.
 */
public static java.lang.String rtspMethodAsText(org.gstreamer.rtsp.RTSPMethod method) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_method_as_text.invokeExact(method.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Convert {@code options} to a string.
 * @param options one or more {@link RTSPMethod}
 * @return a new string of {@code options}. g_free() after usage.
 */
public static java.lang.String rtspOptionsAsText(org.gstreamer.rtsp.RTSPMethod options) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_options_as_text.invokeExact(options.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Convert the comma separated list {@code options} to a {@link RTSPMethod} bitwise or
 * of methods. This functions is the reverse of gst_rtsp_options_as_text().
 * @param options a comma separated list of options
 * @return a {@link RTSPMethod}
 */
public static org.gstreamer.rtsp.RTSPMethod rtspOptionsFromText(java.lang.String options) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_options_from_text.invokeExact(Marshal.stringToAddress.marshal(options, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.rtsp.RTSPMethod(RESULT);
    }
}

/**
 * Converts the range in-place between different types of units.
 * Ranges containing the special value {@code GST_RTSP_TIME_NOW} can not be
 * converted as these are only valid for {@code GST_RTSP_RANGE_NPT}.
 * @param range a {@link RTSPTimeRange}
 * @param unit the unit to convert the range into
 * @return {@code true} if the range could be converted
 */
public static boolean rtspRangeConvertUnits(org.gstreamer.rtsp.RTSPTimeRange range, org.gstreamer.rtsp.RTSPRangeUnit unit) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_rtsp_range_convert_units.invokeExact(
                range.handle(),
                unit.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Free the memory allocated by {@code range}.
 * @param range a {@link RTSPTimeRange}
 */
public static void rtspRangeFree(org.gstreamer.rtsp.RTSPTimeRange range) {
    try {
        DowncallHandles.gst_rtsp_range_free.invokeExact(range.handle());
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
public static boolean rtspRangeGetTimes(org.gstreamer.rtsp.RTSPTimeRange range, org.gstreamer.gst.ClockTime min, org.gstreamer.gst.ClockTime max) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment minPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        MemorySegment maxPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_range_get_times.invokeExact(
                    range.handle(),
                    (Addressable) minPOINTER.address(),
                    (Addressable) maxPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                min.setValue(minPOINTER.get(Interop.valueLayout.C_LONG, 0));
                max.setValue(maxPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Parse {@code rangestr} to a {@link RTSPTimeRange}.
 * @param rangestr a range string to parse
 * @param range location to hold the {@link RTSPTimeRange} result
 * @return {@code GST_RTSP_OK} on success.
 */
public static org.gstreamer.rtsp.RTSPResult rtspRangeParse(java.lang.String rangestr, Out<org.gstreamer.rtsp.RTSPTimeRange> range) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment rangePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_range_parse.invokeExact(
                    Marshal.stringToAddress.marshal(rangestr, SCOPE),
                    (Addressable) rangePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                range.set(org.gstreamer.rtsp.RTSPTimeRange.fromAddress.marshal(rangePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
}

/**
 * Convert {@code range} into a string representation.
 * @param range a {@link RTSPTimeRange}
 * @return The string representation of {@code range}. g_free() after usage.
 */
public static java.lang.String rtspRangeToString(org.gstreamer.rtsp.RTSPTimeRange range) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_range_to_string.invokeExact(range.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Convert {@code code} to a string.
 * @param code a {@link RTSPStatusCode}
 * @return a string representation of {@code code}.
 */
public static java.lang.String rtspStatusAsText(org.gstreamer.rtsp.RTSPStatusCode code) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_status_as_text.invokeExact(code.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Convert {@code result} in a human readable string.
 * @param result a {@link RTSPResult}
 * @return a newly allocated string. g_free() after usage.
 */
public static java.lang.String rtspStrresult(org.gstreamer.rtsp.RTSPResult result) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_strresult.invokeExact(result.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
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
public static org.gstreamer.rtsp.RTSPResult rtspTransportGetManager(org.gstreamer.rtsp.RTSPTransMode trans, @Nullable Out<java.lang.String> manager, int option) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment managerPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_transport_get_manager.invokeExact(
                    trans.getValue(),
                    (Addressable) (manager == null ? MemoryAddress.NULL : (Addressable) managerPOINTER.address()),
                    option);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                if (manager != null) manager.set(Marshal.addressToString.marshal(managerPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
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
public static org.gstreamer.rtsp.RTSPResult rtspTransportGetMime(org.gstreamer.rtsp.RTSPTransMode trans, PointerString mime) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
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
}

/**
 * Allocate a new initialized {@link RTSPTransport}. Use gst_rtsp_transport_free()
 * after usage.
 * @param transport location to hold the new {@link RTSPTransport}
 * @return a {@link RTSPResult}.
 */
public static org.gstreamer.rtsp.RTSPResult rtspTransportNew(PointerProxy<org.gstreamer.rtsp.RTSPTransport> transport) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_rtsp_transport_new.invokeExact(transport.handle());
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
public static org.gstreamer.rtsp.RTSPResult rtspTransportParse(java.lang.String str, org.gstreamer.rtsp.RTSPTransport transport) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_transport_parse.invokeExact(
                    Marshal.stringToAddress.marshal(str, SCOPE),
                    transport.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
}

/**
 * Parse the RTSP {@code urlstr} into a newly allocated {@link RTSPUrl}. Free after usage
 * with gst_rtsp_url_free().
 * @param urlstr the url string to parse
 * @param url location to hold the result.
 * @return a {@link RTSPResult}.
 */
public static org.gstreamer.rtsp.RTSPResult rtspUrlParse(java.lang.String urlstr, Out<org.gstreamer.rtsp.RTSPUrl> url) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment urlPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_url_parse.invokeExact(
                    Marshal.stringToAddress.marshal(urlstr, SCOPE),
                    (Addressable) urlPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                url.set(org.gstreamer.rtsp.RTSPUrl.fromAddress.marshal(urlPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
}

/**
 * Convert {@code version} to a string.
 * @param version a {@link RTSPVersion}
 * @return a string representation of {@code version}.
 */
public static java.lang.String rtspVersionAsText(org.gstreamer.rtsp.RTSPVersion version) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_version_as_text.invokeExact(version.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
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
 * @param notify notify when {@code user_data} is not referenced anymore
 * @return a {@link RTSPWatch} that can be used for asynchronous RTSP
 * communication. Free with gst_rtsp_watch_unref () after usage.
 */
public static org.gstreamer.rtsp.RTSPWatch rtspWatchNew(org.gstreamer.rtsp.RTSPConnection conn, org.gstreamer.rtsp.RTSPWatchFuncs funcs, org.gtk.glib.DestroyNotify notify) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_watch_new.invokeExact(
                conn.handle(),
                funcs.handle(),
                (Addressable) MemoryAddress.NULL,
                (Addressable) notify.toCallback());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(RESULT, null);
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
    }
    
    private static void registerTypes() {
        if (RTSPExtension.isAvailable()) Interop.register(RTSPExtension.getType(), RTSPExtension.fromAddress);
    }
}
