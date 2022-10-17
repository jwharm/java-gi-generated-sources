package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link SocketAddressEnumerator} is an enumerator type for {@link SocketAddress}
 * instances. It is returned by enumeration functions such as
 * g_socket_connectable_enumerate(), which returns a {@link SocketAddressEnumerator}
 * to list each {@link SocketAddress} which could be used to connect to that
 * {@link SocketConnectable}.
 * <p>
 * Enumeration is typically a blocking operation, so the asynchronous methods
 * g_socket_address_enumerator_next_async() and
 * g_socket_address_enumerator_next_finish() should be used where possible.
 * <p>
 * Each {@link SocketAddressEnumerator} can only be enumerated once. Once
 * g_socket_address_enumerator_next() has returned {@code null}, further
 * enumeration with that {@link SocketAddressEnumerator} is not possible, and it can
 * be unreffed.
 */
public class SocketAddressEnumerator extends org.gtk.gobject.Object {

    public SocketAddressEnumerator(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SocketAddressEnumerator */
    public static SocketAddressEnumerator castFrom(org.gtk.gobject.Object gobject) {
        return new SocketAddressEnumerator(gobject.refcounted());
    }
    
    private static final MethodHandle g_socket_address_enumerator_next = Interop.downcallHandle(
        "g_socket_address_enumerator_next",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the next {@link SocketAddress} from {@code enumerator}. Note that this
     * may block for some amount of time. (Eg, a {@link NetworkAddress} may need
     * to do a DNS lookup before it can return an address.) Use
     * g_socket_address_enumerator_next_async() if you need to avoid
     * blocking.
     * <p>
     * If {@code enumerator} is expected to yield addresses, but for some reason
     * is unable to (eg, because of a DNS error), then the first call to
     * g_socket_address_enumerator_next() will return an appropriate error
     * in *{@code error}. However, if the first call to
     * g_socket_address_enumerator_next() succeeds, then any further
     * internal errors (other than {@code cancellable} being triggered) will be
     * ignored.
     */
    public @NotNull SocketAddress next(@Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_socket_address_enumerator_next.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketAddress(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_socket_address_enumerator_next_async = Interop.downcallHandle(
        "g_socket_address_enumerator_next_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously retrieves the next {@link SocketAddress} from {@code enumerator}
     * and then calls {@code callback}, which must call
     * g_socket_address_enumerator_next_finish() to get the result.
     * <p>
     * It is an error to call this multiple times before the previous callback has finished.
     */
    public @NotNull void nextAsync(@Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_socket_address_enumerator_next_async.invokeExact(handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_socket_address_enumerator_next_finish = Interop.downcallHandle(
        "g_socket_address_enumerator_next_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the result of a completed call to
     * g_socket_address_enumerator_next_async(). See
     * g_socket_address_enumerator_next() for more information about
     * error handling.
     */
    public @NotNull SocketAddress nextFinish(@NotNull AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_socket_address_enumerator_next_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketAddress(Refcounted.get(RESULT, true));
    }
    
}
