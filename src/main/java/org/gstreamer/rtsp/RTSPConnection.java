package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This object manages the RTSP connection to the server. It provides function
 * to receive and send bytes and messages.
 */
public class RTSPConnection extends Struct {
    
    static {
        GstRtsp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPConnection";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RTSPConnection}
     * @return A new, uninitialized @{link RTSPConnection}
     */
    public static RTSPConnection allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RTSPConnection newInstance = new RTSPConnection(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a RTSPConnection proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RTSPConnection(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTSPConnection> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RTSPConnection(input);
    
    /**
     * Clear the list of authentication directives stored in {@code conn}.
     */
    public void clearAuthParams() {
        try {
            DowncallHandles.gst_rtsp_connection_clear_auth_params.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Close the connected {@code conn}. After this call, the connection is in the same
     * state as when it was first created.
     * @return {@code GST_RTSP_OK} on success.
     */
    public org.gstreamer.rtsp.RTSPResult close() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_close.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Attempt to connect to the url of {@code conn} made with
     * gst_rtsp_connection_create(). If {@code timeout} is {@code null} this function can block
     * forever. If {@code timeout} contains a valid timeout, this function will return
     * {@code GST_RTSP_ETIMEOUT} after the timeout expired.
     * <p>
     * This function can be cancelled with gst_rtsp_connection_flush().
     * @param timeout a GTimeVal timeout
     * @return {@code GST_RTSP_OK} when a connection could be made.
     */
    @Deprecated
    public org.gstreamer.rtsp.RTSPResult connect(org.gtk.glib.TimeVal timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_connect.invokeExact(
                    handle(),
                    timeout.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Attempt to connect to the url of {@code conn} made with
     * gst_rtsp_connection_create(). If {@code timeout} is 0 this function can block
     * forever. If {@code timeout} contains a valid timeout, this function will return
     * {@code GST_RTSP_ETIMEOUT} after the timeout expired.
     * <p>
     * This function can be cancelled with gst_rtsp_connection_flush().
     * @param timeout a timeout in microseconds
     * @return {@code GST_RTSP_OK} when a connection could be made.
     */
    public org.gstreamer.rtsp.RTSPResult connectUsec(long timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_connect_usec.invokeExact(
                    handle(),
                    timeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Attempt to connect to the url of {@code conn} made with
     * gst_rtsp_connection_create(). If {@code timeout} is {@code null} this function can block
     * forever. If {@code timeout} contains a valid timeout, this function will return
     * {@code GST_RTSP_ETIMEOUT} after the timeout expired.  If {@code conn} is set to tunneled,
     * {@code response} will contain a response to the tunneling request messages.
     * <p>
     * This function can be cancelled with gst_rtsp_connection_flush().
     * @param timeout a GTimeVal timeout
     * @param response a {@link RTSPMessage}
     * @return {@code GST_RTSP_OK} when a connection could be made.
     */
    @Deprecated
    public org.gstreamer.rtsp.RTSPResult connectWithResponse(org.gtk.glib.TimeVal timeout, org.gstreamer.rtsp.RTSPMessage response) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_connect_with_response.invokeExact(
                    handle(),
                    timeout.handle(),
                    response.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Attempt to connect to the url of {@code conn} made with
     * gst_rtsp_connection_create(). If {@code timeout} is 0 this function can block
     * forever. If {@code timeout} contains a valid timeout, this function will return
     * {@code GST_RTSP_ETIMEOUT} after the timeout expired.  If {@code conn} is set to tunneled,
     * {@code response} will contain a response to the tunneling request messages.
     * <p>
     * This function can be cancelled with gst_rtsp_connection_flush().
     * @param timeout a timeout in microseconds
     * @param response a {@link RTSPMessage}
     * @return {@code GST_RTSP_OK} when a connection could be made.
     */
    public org.gstreamer.rtsp.RTSPResult connectWithResponseUsec(long timeout, org.gstreamer.rtsp.RTSPMessage response) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_connect_with_response_usec.invokeExact(
                    handle(),
                    timeout,
                    response.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * If {@code conn} received the first tunnel connection and {@code conn2} received
     * the second tunnel connection, link the two connections together so that
     * {@code conn} manages the tunneled connection.
     * <p>
     * After this call, {@code conn2} cannot be used anymore and must be freed with
     * gst_rtsp_connection_free().
     * <p>
     * If {@code conn2} is {@code null} then only the base64 decoding context will be setup for
     * {@code conn}.
     * @param conn2 a {@link RTSPConnection} or {@code null}
     * @return return GST_RTSP_OK on success.
     */
    public org.gstreamer.rtsp.RTSPResult doTunnel(org.gstreamer.rtsp.RTSPConnection conn2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_do_tunnel.invokeExact(
                    handle(),
                    conn2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Start or stop the flushing action on {@code conn}. When flushing, all current
     * and future actions on {@code conn} will return {@code GST_RTSP_EINTR} until the connection
     * is set to non-flushing mode again.
     * @param flush start or stop the flush
     * @return {@code GST_RTSP_OK}.
     */
    public org.gstreamer.rtsp.RTSPResult flush(boolean flush) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_flush.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(flush, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Close and free {@code conn}.
     * @return {@code GST_RTSP_OK} on success.
     */
    public org.gstreamer.rtsp.RTSPResult free() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Get the ignore_x_server_reply value.
     * @return returns {@code true} if the x-server-ip-address header reply will be
     *          ignored, else returns {@code false}
     */
    public boolean getIgnoreXServerReply() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_get_ignore_x_server_reply.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieve the IP address of the other end of {@code conn}.
     * @return The IP address as a string. this value remains valid until the
     * connection is closed.
     */
    public java.lang.String getIp() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_connection_get_ip.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the file descriptor for reading.
     * @return the file descriptor used for reading or {@code null} on
     * error. The file descriptor remains valid until the connection is closed.
     */
    public org.gtk.gio.Socket getReadSocket() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_connection_get_read_socket.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Socket) Interop.register(RESULT, org.gtk.gio.Socket.fromAddress).marshal(RESULT, null);
    }
    
    public boolean getRememberSessionId() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_get_remember_session_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the TLS connection of {@code conn}.
     * <p>
     * For client side this will return the {@link org.gtk.gio.TlsClientConnection} when connected
     * over TLS.
     * <p>
     * For server side connections, this function will create a GTlsServerConnection
     * when called the first time and will return that same connection on subsequent
     * calls. The server is then responsible for configuring the TLS connection.
     * @return the TLS connection for {@code conn}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.gio.TlsConnection getTls() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_connection_get_tls.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return (org.gtk.gio.TlsConnection) Interop.register(RESULT, org.gtk.gio.TlsConnection.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Gets the anchor certificate authorities database that will be used
     * after a server certificate can't be verified with the default
     * certificate database.
     * @return the anchor certificate authorities database, or NULL if no
     * database has been previously set. Use g_object_unref() to release the
     * certificate database.
     */
    public org.gtk.gio.TlsDatabase getTlsDatabase() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_connection_get_tls_database.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.TlsDatabase) Interop.register(RESULT, org.gtk.gio.TlsDatabase.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets a {@link org.gtk.gio.TlsInteraction} object to be used when the connection or certificate
     * database need to interact with the user. This will be used to prompt the
     * user for passwords where necessary.
     * @return a reference on the {@link org.gtk.gio.TlsInteraction}. Use
     * g_object_unref() to release.
     */
    public org.gtk.gio.TlsInteraction getTlsInteraction() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_connection_get_tls_interaction.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.TlsInteraction) Interop.register(RESULT, org.gtk.gio.TlsInteraction.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the TLS validation flags used to verify the peer certificate
     * when a TLS connection is established.
     * <p>
     * GLib guarantees that if certificate verification fails, at least one error
     * will be set, but it does not guarantee that all possible errors will be
     * set. Accordingly, you may not safely decide to ignore any particular type
     * of error.
     * <p>
     * For example, it would be incorrect to ignore {@link org.gtk.gio.TlsCertificateFlags#EXPIRED} if
     * you want to allow expired certificates, because this could potentially be
     * the only error flag set even if other problems exist with the certificate.
     * @return the validation flags.
     */
    public org.gtk.gio.TlsCertificateFlags getTlsValidationFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_get_tls_validation_flags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.TlsCertificateFlags(RESULT);
    }
    
    /**
     * Get the tunnel session id the connection.
     * @return returns a non-empty string if {@code conn} is being tunneled over HTTP.
     */
    public java.lang.String getTunnelid() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_connection_get_tunnelid.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Retrieve the URL of the other end of {@code conn}.
     * @return The URL. This value remains valid until the
     * connection is freed.
     */
    public org.gstreamer.rtsp.RTSPUrl getUrl() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_connection_get_url.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.rtsp.RTSPUrl.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the file descriptor for writing.
     * @return the file descriptor used for writing or NULL on
     * error. The file descriptor remains valid until the connection is closed.
     */
    public org.gtk.gio.Socket getWriteSocket() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_connection_get_write_socket.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Socket) Interop.register(RESULT, org.gtk.gio.Socket.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get the tunneling state of the connection.
     * @return if {@code conn} is using HTTP tunneling.
     */
    public boolean isTunneled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_is_tunneled.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Calculate the next timeout for {@code conn}, storing the result in {@code timeout}.
     * @param timeout a timeout
     * @return {@code GST_RTSP_OK}.
     */
    @Deprecated
    public org.gstreamer.rtsp.RTSPResult nextTimeout(org.gtk.glib.TimeVal timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_next_timeout.invokeExact(
                    handle(),
                    timeout.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Calculate the next timeout for {@code conn}
     * @return {@code the} next timeout in microseconds
     */
    public long nextTimeoutUsec() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_rtsp_connection_next_timeout_usec.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Wait up to the specified {@code timeout} for the connection to become available for
     * at least one of the operations specified in {@code events}. When the function returns
     * with {@code GST_RTSP_OK}, {@code revents} will contain a bitmask of available operations on
     * {@code conn}.
     * <p>
     * {@code timeout} can be {@code null}, in which case this function might block forever.
     * <p>
     * This function can be cancelled with gst_rtsp_connection_flush().
     * @param events a bitmask of {@link RTSPEvent} flags to check
     * @param revents location for result flags
     * @param timeout a timeout
     * @return {@code GST_RTSP_OK} on success.
     */
    @Deprecated
    public org.gstreamer.rtsp.RTSPResult poll(org.gstreamer.rtsp.RTSPEvent events, PointerBitfield<org.gstreamer.rtsp.RTSPEvent> revents, org.gtk.glib.TimeVal timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_poll.invokeExact(
                    handle(),
                    events.getValue(),
                    revents.handle(),
                    timeout.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Wait up to the specified {@code timeout} for the connection to become available for
     * at least one of the operations specified in {@code events}. When the function returns
     * with {@code GST_RTSP_OK}, {@code revents} will contain a bitmask of available operations on
     * {@code conn}.
     * <p>
     * {@code timeout} can be 0, in which case this function might block forever.
     * <p>
     * This function can be cancelled with gst_rtsp_connection_flush().
     * @param events a bitmask of {@link RTSPEvent} flags to check
     * @param revents location for result flags
     * @param timeout a timeout in microseconds
     * @return {@code GST_RTSP_OK} on success.
     */
    public org.gstreamer.rtsp.RTSPResult pollUsec(org.gstreamer.rtsp.RTSPEvent events, PointerBitfield<org.gstreamer.rtsp.RTSPEvent> revents, long timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_poll_usec.invokeExact(
                    handle(),
                    events.getValue(),
                    revents.handle(),
                    timeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Attempt to read {@code size} bytes into {@code data} from the connected {@code conn}, blocking up to
     * the specified {@code timeout}. {@code timeout} can be {@code null}, in which case this function
     * might block forever.
     * <p>
     * This function can be cancelled with gst_rtsp_connection_flush().
     * @param data the data to read
     * @param size the size of {@code data}
     * @param timeout a timeout value or {@code null}
     * @return {@code GST_RTSP_OK} on success.
     */
    @Deprecated
    public org.gstreamer.rtsp.RTSPResult read(PointerByte data, int size, org.gtk.glib.TimeVal timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_read.invokeExact(
                    handle(),
                    data.handle(),
                    size,
                    timeout.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Attempt to read {@code size} bytes into {@code data} from the connected {@code conn}, blocking up to
     * the specified {@code timeout}. {@code timeout} can be 0, in which case this function
     * might block forever.
     * <p>
     * This function can be cancelled with gst_rtsp_connection_flush().
     * @param data the data to read
     * @param size the size of {@code data}
     * @param timeout a timeout value in microseconds
     * @return {@code GST_RTSP_OK} on success.
     */
    public org.gstreamer.rtsp.RTSPResult readUsec(PointerByte data, int size, long timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_read_usec.invokeExact(
                    handle(),
                    data.handle(),
                    size,
                    timeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Attempt to read into {@code message} from the connected {@code conn}, blocking up to
     * the specified {@code timeout}. {@code timeout} can be {@code null}, in which case this function
     * might block forever.
     * <p>
     * This function can be cancelled with gst_rtsp_connection_flush().
     * @param message the message to read
     * @param timeout a timeout value or {@code null}
     * @return {@code GST_RTSP_OK} on success.
     */
    @Deprecated
    public org.gstreamer.rtsp.RTSPResult receive(org.gstreamer.rtsp.RTSPMessage message, org.gtk.glib.TimeVal timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_receive.invokeExact(
                    handle(),
                    message.handle(),
                    timeout.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Attempt to read into {@code message} from the connected {@code conn}, blocking up to
     * the specified {@code timeout}. {@code timeout} can be 0, in which case this function
     * might block forever.
     * <p>
     * This function can be cancelled with gst_rtsp_connection_flush().
     * @param message the message to read
     * @param timeout a timeout value or 0
     * @return {@code GST_RTSP_OK} on success.
     */
    public org.gstreamer.rtsp.RTSPResult receiveUsec(org.gstreamer.rtsp.RTSPMessage message, long timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_receive_usec.invokeExact(
                    handle(),
                    message.handle(),
                    timeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Reset the timeout of {@code conn}.
     * @return {@code GST_RTSP_OK}.
     */
    public org.gstreamer.rtsp.RTSPResult resetTimeout() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_reset_timeout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Attempt to send {@code message} to the connected {@code conn}, blocking up to
     * the specified {@code timeout}. {@code timeout} can be {@code null}, in which case this function
     * might block forever.
     * <p>
     * This function can be cancelled with gst_rtsp_connection_flush().
     * @param message the message to send
     * @param timeout a timeout value or {@code null}
     * @return {@code GST_RTSP_OK} on success.
     */
    @Deprecated
    public org.gstreamer.rtsp.RTSPResult send(org.gstreamer.rtsp.RTSPMessage message, org.gtk.glib.TimeVal timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_send.invokeExact(
                    handle(),
                    message.handle(),
                    timeout.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Attempt to send {@code messages} to the connected {@code conn}, blocking up to
     * the specified {@code timeout}. {@code timeout} can be {@code null}, in which case this function
     * might block forever.
     * <p>
     * This function can be cancelled with gst_rtsp_connection_flush().
     * @param messages the messages to send
     * @param nMessages the number of messages to send
     * @param timeout a timeout value or {@code null}
     * @return {@code GST_RTSP_OK} on success.
     */
    @Deprecated
    public org.gstreamer.rtsp.RTSPResult sendMessages(org.gstreamer.rtsp.RTSPMessage[] messages, int nMessages, org.gtk.glib.TimeVal timeout) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_rtsp_connection_send_messages.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(messages, org.gstreamer.rtsp.RTSPMessage.getMemoryLayout(), false, SCOPE),
                        nMessages,
                        timeout.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.rtsp.RTSPResult.of(RESULT);
        }
    }
    
    /**
     * Attempt to send {@code messages} to the connected {@code conn}, blocking up to
     * the specified {@code timeout}. {@code timeout} can be 0, in which case this function
     * might block forever.
     * <p>
     * This function can be cancelled with gst_rtsp_connection_flush().
     * @param messages the messages to send
     * @param nMessages the number of messages to send
     * @param timeout a timeout value in microseconds
     * @return {@code GST_RTSP_OK} on Since.
     */
    public org.gstreamer.rtsp.RTSPResult sendMessagesUsec(org.gstreamer.rtsp.RTSPMessage[] messages, int nMessages, long timeout) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_rtsp_connection_send_messages_usec.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(messages, org.gstreamer.rtsp.RTSPMessage.getMemoryLayout(), false, SCOPE),
                        nMessages,
                        timeout);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.rtsp.RTSPResult.of(RESULT);
        }
    }
    
    /**
     * Attempt to send {@code message} to the connected {@code conn}, blocking up to
     * the specified {@code timeout}. {@code timeout} can be 0, in which case this function
     * might block forever.
     * <p>
     * This function can be cancelled with gst_rtsp_connection_flush().
     * @param message the message to send
     * @param timeout a timeout value in microseconds
     * @return {@code GST_RTSP_OK} on success.
     */
    public org.gstreamer.rtsp.RTSPResult sendUsec(org.gstreamer.rtsp.RTSPMessage message, long timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_send_usec.invokeExact(
                    handle(),
                    message.handle(),
                    timeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Sets a custom accept-certificate function for checking certificates for
     * validity. This will directly map to {@link org.gtk.gio.TlsConnection} 's "accept-certificate"
     * signal and be performed after the default checks of {@link RTSPConnection}
     * (checking against the {@link org.gtk.gio.TlsDatabase} with the given {@link org.gtk.gio.TlsCertificateFlags})
     * have failed. If no {@link org.gtk.gio.TlsDatabase} is set on this connection, only {@code func} will
     * be called.
     * @param func a {@link RTSPConnectionAcceptCertificateFunc} to check certificates
     * @param destroyNotify {@link org.gtk.glib.DestroyNotify} for {@code user_data}
     */
    public void setAcceptCertificateFunc(org.gstreamer.rtsp.RTSPConnectionAcceptCertificateFunc func, org.gtk.glib.DestroyNotify destroyNotify) {
        try {
            DowncallHandles.gst_rtsp_connection_set_accept_certificate_func.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroyNotify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configure {@code conn} for authentication mode {@code method} with {@code user} and {@code pass} as the
     * user and password respectively.
     * @param method authentication method
     * @param user the user
     * @param pass the password
     * @return {@code GST_RTSP_OK}.
     */
    public org.gstreamer.rtsp.RTSPResult setAuth(org.gstreamer.rtsp.RTSPAuthMethod method, java.lang.String user, java.lang.String pass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_rtsp_connection_set_auth.invokeExact(
                        handle(),
                        method.getValue(),
                        Marshal.stringToAddress.marshal(user, SCOPE),
                        Marshal.stringToAddress.marshal(pass, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.rtsp.RTSPResult.of(RESULT);
        }
    }
    
    /**
     * Setup {@code conn} with authentication directives. This is not necessary for
     * methods {@code GST_RTSP_AUTH_NONE} and {@code GST_RTSP_AUTH_BASIC}. For
     * {@code GST_RTSP_AUTH_DIGEST}, directives should be taken from the digest challenge
     * in the WWW-Authenticate response header and can include realm, domain,
     * nonce, opaque, stale, algorithm, qop as per RFC2617.
     * @param param authentication directive
     * @param value value
     */
    public void setAuthParam(java.lang.String param, java.lang.String value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_rtsp_connection_set_auth_param.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(param, SCOPE),
                        Marshal.stringToAddress.marshal(value, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Configure {@code conn} to use the specified Content-Length limit.
     * Both requests and responses are validated. If content-length is
     * exceeded, ENOMEM error will be returned.
     * @param limit Content-Length limit
     */
    public void setContentLengthLimit(int limit) {
        try {
            DowncallHandles.gst_rtsp_connection_set_content_length_limit.invokeExact(
                    handle(),
                    limit);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * By setting the HTTP mode to {@code true} the message parsing will support HTTP
     * messages in addition to the RTSP messages. It will also disable the
     * automatic handling of setting up an HTTP tunnel.
     * @param enable {@code true} to enable manual HTTP mode
     */
    public void setHttpMode(boolean enable) {
        try {
            DowncallHandles.gst_rtsp_connection_set_http_mode.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enable, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set whether to ignore the x-server-ip-address header reply or not. If the
     * header is ignored, the original address will be used instead.
     * @param ignore {@code true} to ignore the x-server-ip-address header reply or {@code false} to
     *          comply with it ({@code false} is the default).
     */
    public void setIgnoreXServerReply(boolean ignore) {
        try {
            DowncallHandles.gst_rtsp_connection_set_ignore_x_server_reply.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(ignore, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the IP address of the server.
     * @param ip an ip address
     */
    public void setIp(java.lang.String ip) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_rtsp_connection_set_ip.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(ip, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Set the proxy host and port.
     * @param host the proxy host
     * @param port the proxy port
     * @return {@code GST_RTSP_OK}.
     */
    public org.gstreamer.rtsp.RTSPResult setProxy(java.lang.String host, int port) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_rtsp_connection_set_proxy.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(host, SCOPE),
                        port);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.rtsp.RTSPResult.of(RESULT);
        }
    }
    
    /**
     * Configure {@code conn} to use the specified DSCP value.
     * @param qosDscp DSCP value
     * @return {@code GST_RTSP_OK} on success.
     */
    public org.gstreamer.rtsp.RTSPResult setQosDscp(int qosDscp) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_set_qos_dscp.invokeExact(
                    handle(),
                    qosDscp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Sets if the {@link RTSPConnection} should remember the session id from the last
     * response received and force it onto any further requests.
     * <p>
     * The default value is {@code true}
     * @param remember {@code true} if the connection should remember the session id
     */
    public void setRememberSessionId(boolean remember) {
        try {
            DowncallHandles.gst_rtsp_connection_set_remember_session_id.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(remember, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the anchor certificate authorities database. This certificate
     * database will be used to verify the server's certificate in case it
     * can't be verified with the default certificate database first.
     * @param database a {@link org.gtk.gio.TlsDatabase}
     */
    public void setTlsDatabase(org.gtk.gio.TlsDatabase database) {
        try {
            DowncallHandles.gst_rtsp_connection_set_tls_database.invokeExact(
                    handle(),
                    database.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a {@link org.gtk.gio.TlsInteraction} object to be used when the connection or certificate
     * database need to interact with the user. This will be used to prompt the
     * user for passwords where necessary.
     * @param interaction a {@link org.gtk.gio.TlsInteraction}
     */
    public void setTlsInteraction(org.gtk.gio.TlsInteraction interaction) {
        try {
            DowncallHandles.gst_rtsp_connection_set_tls_interaction.invokeExact(
                    handle(),
                    interaction.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the TLS validation flags to be used to verify the peer
     * certificate when a TLS connection is established.
     * <p>
     * GLib guarantees that if certificate verification fails, at least one error
     * will be set, but it does not guarantee that all possible errors will be
     * set. Accordingly, you may not safely decide to ignore any particular type
     * of error.
     * <p>
     * For example, it would be incorrect to mask {@link org.gtk.gio.TlsCertificateFlags#EXPIRED} if
     * you want to allow expired certificates, because this could potentially be
     * the only error flag set even if other problems exist with the certificate.
     * @param flags the validation flags.
     * @return TRUE if the validation flags are set correctly, or FALSE if
     * {@code conn} is NULL or is not a TLS connection.
     */
    public boolean setTlsValidationFlags(org.gtk.gio.TlsCertificateFlags flags) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_set_tls_validation_flags.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set the HTTP tunneling state of the connection. This must be configured before
     * the {@code conn} is connected.
     * @param tunneled the new state
     */
    public void setTunneled(boolean tunneled) {
        try {
            DowncallHandles.gst_rtsp_connection_set_tunneled.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(tunneled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Attempt to write {@code size} bytes of {@code data} to the connected {@code conn}, blocking up to
     * the specified {@code timeout}. {@code timeout} can be {@code null}, in which case this function
     * might block forever.
     * <p>
     * This function can be cancelled with gst_rtsp_connection_flush().
     * @param data the data to write
     * @param size the size of {@code data}
     * @param timeout a timeout value or {@code null}
     * @return {@code GST_RTSP_OK} on success.
     */
    @Deprecated
    public org.gstreamer.rtsp.RTSPResult write(PointerByte data, int size, org.gtk.glib.TimeVal timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_write.invokeExact(
                    handle(),
                    data.handle(),
                    size,
                    timeout.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Attempt to write {@code size} bytes of {@code data} to the connected {@code conn}, blocking up to
     * the specified {@code timeout}. {@code timeout} can be 0, in which case this function
     * might block forever.
     * <p>
     * This function can be cancelled with gst_rtsp_connection_flush().
     * @param data the data to write
     * @param size the size of {@code data}
     * @param timeout a timeout value or 0
     * @return {@code GST_RTSP_OK} on success.
     */
    public org.gstreamer.rtsp.RTSPResult writeUsec(PointerByte data, int size, long timeout) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_connection_write_usec.invokeExact(
                    handle(),
                    data.handle(),
                    size,
                    timeout);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Accept a new connection on {@code socket} and create a new {@link RTSPConnection} for
     * handling communication on new socket.
     * @param socket a socket
     * @param conn storage for a {@link RTSPConnection}
     * @param cancellable a {@link org.gtk.gio.Cancellable} to cancel the operation
     * @return {@code GST_RTSP_OK} when {@code conn} contains a valid connection.
     */
    public static org.gstreamer.rtsp.RTSPResult accept(org.gtk.gio.Socket socket, Out<org.gstreamer.rtsp.RTSPConnection> conn, @Nullable org.gtk.gio.Cancellable cancellable) {
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
    public static org.gstreamer.rtsp.RTSPResult create(org.gstreamer.rtsp.RTSPUrl url, Out<org.gstreamer.rtsp.RTSPConnection> conn) {
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
    public static org.gstreamer.rtsp.RTSPResult createFromSocket(org.gtk.gio.Socket socket, java.lang.String ip, short port, java.lang.String initialBuffer, Out<org.gstreamer.rtsp.RTSPConnection> conn) {
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
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtsp_connection_clear_auth_params = Interop.downcallHandle(
                "gst_rtsp_connection_clear_auth_params",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_close = Interop.downcallHandle(
                "gst_rtsp_connection_close",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_connect = Interop.downcallHandle(
                "gst_rtsp_connection_connect",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_connect_usec = Interop.downcallHandle(
                "gst_rtsp_connection_connect_usec",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_connect_with_response = Interop.downcallHandle(
                "gst_rtsp_connection_connect_with_response",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_connect_with_response_usec = Interop.downcallHandle(
                "gst_rtsp_connection_connect_with_response_usec",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_do_tunnel = Interop.downcallHandle(
                "gst_rtsp_connection_do_tunnel",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_flush = Interop.downcallHandle(
                "gst_rtsp_connection_flush",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_free = Interop.downcallHandle(
                "gst_rtsp_connection_free",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_get_ignore_x_server_reply = Interop.downcallHandle(
                "gst_rtsp_connection_get_ignore_x_server_reply",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_get_ip = Interop.downcallHandle(
                "gst_rtsp_connection_get_ip",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_get_read_socket = Interop.downcallHandle(
                "gst_rtsp_connection_get_read_socket",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_get_remember_session_id = Interop.downcallHandle(
                "gst_rtsp_connection_get_remember_session_id",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_get_tls = Interop.downcallHandle(
                "gst_rtsp_connection_get_tls",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_get_tls_database = Interop.downcallHandle(
                "gst_rtsp_connection_get_tls_database",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_get_tls_interaction = Interop.downcallHandle(
                "gst_rtsp_connection_get_tls_interaction",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_get_tls_validation_flags = Interop.downcallHandle(
                "gst_rtsp_connection_get_tls_validation_flags",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_get_tunnelid = Interop.downcallHandle(
                "gst_rtsp_connection_get_tunnelid",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_get_url = Interop.downcallHandle(
                "gst_rtsp_connection_get_url",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_get_write_socket = Interop.downcallHandle(
                "gst_rtsp_connection_get_write_socket",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_is_tunneled = Interop.downcallHandle(
                "gst_rtsp_connection_is_tunneled",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_next_timeout = Interop.downcallHandle(
                "gst_rtsp_connection_next_timeout",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_next_timeout_usec = Interop.downcallHandle(
                "gst_rtsp_connection_next_timeout_usec",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_poll = Interop.downcallHandle(
                "gst_rtsp_connection_poll",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_poll_usec = Interop.downcallHandle(
                "gst_rtsp_connection_poll_usec",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_read = Interop.downcallHandle(
                "gst_rtsp_connection_read",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_read_usec = Interop.downcallHandle(
                "gst_rtsp_connection_read_usec",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_receive = Interop.downcallHandle(
                "gst_rtsp_connection_receive",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_receive_usec = Interop.downcallHandle(
                "gst_rtsp_connection_receive_usec",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_reset_timeout = Interop.downcallHandle(
                "gst_rtsp_connection_reset_timeout",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_send = Interop.downcallHandle(
                "gst_rtsp_connection_send",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_send_messages = Interop.downcallHandle(
                "gst_rtsp_connection_send_messages",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_send_messages_usec = Interop.downcallHandle(
                "gst_rtsp_connection_send_messages_usec",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_send_usec = Interop.downcallHandle(
                "gst_rtsp_connection_send_usec",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_set_accept_certificate_func = Interop.downcallHandle(
                "gst_rtsp_connection_set_accept_certificate_func",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_set_auth = Interop.downcallHandle(
                "gst_rtsp_connection_set_auth",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_set_auth_param = Interop.downcallHandle(
                "gst_rtsp_connection_set_auth_param",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_set_content_length_limit = Interop.downcallHandle(
                "gst_rtsp_connection_set_content_length_limit",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_set_http_mode = Interop.downcallHandle(
                "gst_rtsp_connection_set_http_mode",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_set_ignore_x_server_reply = Interop.downcallHandle(
                "gst_rtsp_connection_set_ignore_x_server_reply",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_set_ip = Interop.downcallHandle(
                "gst_rtsp_connection_set_ip",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_set_proxy = Interop.downcallHandle(
                "gst_rtsp_connection_set_proxy",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_set_qos_dscp = Interop.downcallHandle(
                "gst_rtsp_connection_set_qos_dscp",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_set_remember_session_id = Interop.downcallHandle(
                "gst_rtsp_connection_set_remember_session_id",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_set_tls_database = Interop.downcallHandle(
                "gst_rtsp_connection_set_tls_database",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_set_tls_interaction = Interop.downcallHandle(
                "gst_rtsp_connection_set_tls_interaction",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_set_tls_validation_flags = Interop.downcallHandle(
                "gst_rtsp_connection_set_tls_validation_flags",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_set_tunneled = Interop.downcallHandle(
                "gst_rtsp_connection_set_tunneled",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_write = Interop.downcallHandle(
                "gst_rtsp_connection_write",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtsp_connection_write_usec = Interop.downcallHandle(
                "gst_rtsp_connection_write_usec",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
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
    }
}
