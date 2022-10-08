package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 */
public class UnixConnection extends SocketConnection {

    public UnixConnection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to UnixConnection */
    public static UnixConnection castFrom(org.gtk.gobject.Object gobject) {
        return new UnixConnection(gobject.refcounted());
    }
    
    static final MethodHandle g_unix_connection_receive_credentials = Interop.downcallHandle(
        "g_unix_connection_receive_credentials",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * <p>
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
     */
    public Credentials receiveCredentials(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_unix_connection_receive_credentials.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new Credentials(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_connection_receive_credentials_async = Interop.downcallHandle(
        "g_unix_connection_receive_credentials_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously receive credentials.
     * <p>
     * For more details, see g_unix_connection_receive_credentials() which is
     * the synchronous version of this call.
     * <p>
     * When the operation is finished, {@code callback} will be called. You can then call
     * g_unix_connection_receive_credentials_finish() to get the result of the operation.
     */
    public void receiveCredentialsAsync(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_unix_connection_receive_credentials_async.invokeExact(handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_connection_receive_credentials_finish = Interop.downcallHandle(
        "g_unix_connection_receive_credentials_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous receive credentials operation started with
     * g_unix_connection_receive_credentials_async().
     */
    public Credentials receiveCredentialsFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_unix_connection_receive_credentials_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new Credentials(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_connection_receive_fd = Interop.downcallHandle(
        "g_unix_connection_receive_fd",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Receives a file descriptor from the sending end of the connection.
     * The sending end has to call g_unix_connection_send_fd() for this
     * to work.
     * <p>
     * As well as reading the fd this also reads a single byte from the
     * stream, as this is required for fd passing to work on some
     * implementations.
     */
    public int receiveFd(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_unix_connection_receive_fd.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_connection_send_credentials = Interop.downcallHandle(
        "g_unix_connection_send_credentials",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * <p>
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
     */
    public boolean sendCredentials(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_unix_connection_send_credentials.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_connection_send_credentials_async = Interop.downcallHandle(
        "g_unix_connection_send_credentials_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously send credentials.
     * <p>
     * For more details, see g_unix_connection_send_credentials() which is
     * the synchronous version of this call.
     * <p>
     * When the operation is finished, {@code callback} will be called. You can then call
     * g_unix_connection_send_credentials_finish() to get the result of the operation.
     */
    public void sendCredentialsAsync(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_unix_connection_send_credentials_async.invokeExact(handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_connection_send_credentials_finish = Interop.downcallHandle(
        "g_unix_connection_send_credentials_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous send credentials operation started with
     * g_unix_connection_send_credentials_async().
     */
    public boolean sendCredentialsFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_unix_connection_send_credentials_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_connection_send_fd = Interop.downcallHandle(
        "g_unix_connection_send_fd",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Passes a file descriptor to the receiving side of the
     * connection. The receiving end has to call g_unix_connection_receive_fd()
     * to accept the file descriptor.
     * <p>
     * As well as sending the fd this also writes a single byte to the
     * stream, as this is required for fd passing to work on some
     * implementations.
     */
    public boolean sendFd(int fd, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_unix_connection_send_fd.invokeExact(handle(), fd, cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
