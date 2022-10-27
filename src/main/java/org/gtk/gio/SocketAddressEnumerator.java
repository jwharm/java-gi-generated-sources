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
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName("GSocketAddressEnumerator");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public SocketAddressEnumerator(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SocketAddressEnumerator */
    public static SocketAddressEnumerator castFrom(org.gtk.gobject.Object gobject) {
        return new SocketAddressEnumerator(gobject.refcounted());
    }
    
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
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a {@link SocketAddress} (owned by the caller), or {@code null} on
     *     error (in which case *{@code error} will be set) or if there are no
     *     more addresses.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.SocketAddress next(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_address_enumerator_next.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.SocketAddress(Refcounted.get(RESULT, true));
    }
    
    /**
     * Asynchronously retrieves the next {@link SocketAddress} from {@code enumerator}
     * and then calls {@code callback}, which must call
     * g_socket_address_enumerator_next_finish() to get the result.
     * <p>
     * It is an error to call this multiple times before the previous callback has finished.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback} to call when the request
     *     is satisfied
     */
    public void nextAsync(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(callback, MemoryAddress.NULL);
        try {
            DowncallHandles.g_socket_address_enumerator_next_async.invokeExact(handle(), cancellable.handle(), 
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
     * Retrieves the result of a completed call to
     * g_socket_address_enumerator_next_async(). See
     * g_socket_address_enumerator_next() for more information about
     * error handling.
     * @param result a {@link AsyncResult}
     * @return a {@link SocketAddress} (owned by the caller), or {@code null} on
     *     error (in which case *{@code error} will be set) or if there are no
     *     more addresses.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.SocketAddress nextFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_address_enumerator_next_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.SocketAddress(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_socket_address_enumerator_next = Interop.downcallHandle(
            "g_socket_address_enumerator_next",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_address_enumerator_next_async = Interop.downcallHandle(
            "g_socket_address_enumerator_next_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_address_enumerator_next_finish = Interop.downcallHandle(
            "g_socket_address_enumerator_next_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
