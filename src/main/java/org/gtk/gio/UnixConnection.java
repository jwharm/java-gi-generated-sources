package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is the subclass of {@link SocketConnection} that is created
 * for UNIX domain sockets.
 * <p>
 * It contains functions to do some of the UNIX socket specific
 * functionality like passing file descriptors.
 * <p>
 * Since GLib 2.72, {@link UnixConnection} is available on all platforms. It requires
 * underlying system support (such as Windows 10 with {@code AF_UNIX}) at run time.
 * <p>
 * Before GLib 2.72, {@code <gio/gunixconnection.h>} belonged to the UNIX-specific GIO
 * interfaces, thus you had to use the {@code gio-unix-2.0.pc} pkg-config file when
 * using it. This is no longer necessary since GLib 2.72.
 * @version 2.22
 */
public class UnixConnection extends org.gtk.gio.SocketConnection {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.SocketConnection.getMemoryLayout().withName("parent_instance"),
        org.gtk.gio.UnixConnectionPrivate.getMemoryLayout().withName("priv")
    ).withName("GUnixConnection");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public UnixConnection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to UnixConnection */
    public static UnixConnection castFrom(org.gtk.gobject.Object gobject) {
        return new UnixConnection(gobject.refcounted());
    }
    
    /**
     * Receives credentials from the sending end of the connection.  The
     * sending end has to call g_unix_connection_send_credentials() (or
     * similar) for this to work.
     * <p>
     * As well as reading the credentials this also reads (and discards) a
     * single byte from the stream, as this is required for credentials
     * passing to work on some implementations.
     * <p>
     * This method can be expected to be available on the following platforms:
     * <ul>
     * <li>Linux since GLib 2.26
     * <li>FreeBSD since GLib 2.26
     * <li>GNU/kFreeBSD since GLib 2.36
     * <li>Solaris, Illumos and OpenSolaris since GLib 2.40
     * <li>GNU/Hurd since GLib 2.40
     * </ul>
     * <p>
     * Other ways to exchange credentials with a foreign peer includes the
     * {@link UnixCredentialsMessage} type and g_socket_get_credentials() function.
     * @param cancellable A {@link Cancellable} or {@code null}.
     * @return Received credentials on success (free with
     * g_object_unref()), {@code null} if {@code error} is set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.Credentials receiveCredentials(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_connection_receive_credentials.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.Credentials(Refcounted.get(RESULT, true));
    }
    
    /**
     * Asynchronously receive credentials.
     * <p>
     * For more details, see g_unix_connection_receive_credentials() which is
     * the synchronous version of this call.
     * <p>
     * When the operation is finished, {@code callback} will be called. You can then call
     * g_unix_connection_receive_credentials_finish() to get the result of the operation.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback} to call when the request is satisfied
     */
    public void receiveCredentialsAsync(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(callback, MemoryAddress.NULL);
        try {
            DowncallHandles.g_unix_connection_receive_credentials_async.invokeExact(handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous receive credentials operation started with
     * g_unix_connection_receive_credentials_async().
     * @param result a {@link AsyncResult}.
     * @return a {@link Credentials}, or {@code null} on error.
     *     Free the returned object with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.Credentials receiveCredentialsFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_connection_receive_credentials_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.Credentials(Refcounted.get(RESULT, true));
    }
    
    /**
     * Receives a file descriptor from the sending end of the connection.
     * The sending end has to call g_unix_connection_send_fd() for this
     * to work.
     * <p>
     * As well as reading the fd this also reads a single byte from the
     * stream, as this is required for fd passing to work on some
     * implementations.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @return a file descriptor on success, -1 on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public int receiveFd(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_connection_receive_fd.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Passes the credentials of the current user the receiving side
     * of the connection. The receiving end has to call
     * g_unix_connection_receive_credentials() (or similar) to accept the
     * credentials.
     * <p>
     * As well as sending the credentials this also writes a single NUL
     * byte to the stream, as this is required for credentials passing to
     * work on some implementations.
     * <p>
     * This method can be expected to be available on the following platforms:
     * <ul>
     * <li>Linux since GLib 2.26
     * <li>FreeBSD since GLib 2.26
     * <li>GNU/kFreeBSD since GLib 2.36
     * <li>Solaris, Illumos and OpenSolaris since GLib 2.40
     * <li>GNU/Hurd since GLib 2.40
     * </ul>
     * <p>
     * Other ways to exchange credentials with a foreign peer includes the
     * {@link UnixCredentialsMessage} type and g_socket_get_credentials() function.
     * @param cancellable A {@link Cancellable} or {@code null}.
     * @return {@code true} on success, {@code false} if {@code error} is set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean sendCredentials(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_connection_send_credentials.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Asynchronously send credentials.
     * <p>
     * For more details, see g_unix_connection_send_credentials() which is
     * the synchronous version of this call.
     * <p>
     * When the operation is finished, {@code callback} will be called. You can then call
     * g_unix_connection_send_credentials_finish() to get the result of the operation.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback} to call when the request is satisfied
     */
    public void sendCredentialsAsync(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(callback, MemoryAddress.NULL);
        try {
            DowncallHandles.g_unix_connection_send_credentials_async.invokeExact(handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous send credentials operation started with
     * g_unix_connection_send_credentials_async().
     * @param result a {@link AsyncResult}.
     * @return {@code true} if the operation was successful, otherwise {@code false}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean sendCredentialsFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_connection_send_credentials_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Passes a file descriptor to the receiving side of the
     * connection. The receiving end has to call g_unix_connection_receive_fd()
     * to accept the file descriptor.
     * <p>
     * As well as sending the fd this also writes a single byte to the
     * stream, as this is required for fd passing to work on some
     * implementations.
     * @param fd a file descriptor
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a {@code true} on success, {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean sendFd(int fd, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_connection_send_fd.invokeExact(handle(), fd, cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_unix_connection_receive_credentials = Interop.downcallHandle(
            "g_unix_connection_receive_credentials",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_connection_receive_credentials_async = Interop.downcallHandle(
            "g_unix_connection_receive_credentials_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_connection_receive_credentials_finish = Interop.downcallHandle(
            "g_unix_connection_receive_credentials_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_connection_receive_fd = Interop.downcallHandle(
            "g_unix_connection_receive_fd",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_connection_send_credentials = Interop.downcallHandle(
            "g_unix_connection_send_credentials",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_connection_send_credentials_async = Interop.downcallHandle(
            "g_unix_connection_send_credentials_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_connection_send_credentials_finish = Interop.downcallHandle(
            "g_unix_connection_send_credentials_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_connection_send_fd = Interop.downcallHandle(
            "g_unix_connection_send_fd",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
