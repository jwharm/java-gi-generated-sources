package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GSocketAddressEnumerator is an enumerator type for #GSocketAddress
 * instances. It is returned by enumeration functions such as
 * g_socket_connectable_enumerate(), which returns a #GSocketAddressEnumerator
 * to list each #GSocketAddress which could be used to connect to that
 * #GSocketConnectable.
 * 
 * Enumeration is typically a blocking operation, so the asynchronous methods
 * g_socket_address_enumerator_next_async() and
 * g_socket_address_enumerator_next_finish() should be used where possible.
 * 
 * Each #GSocketAddressEnumerator can only be enumerated once. Once
 * g_socket_address_enumerator_next() has returned <code>NULL,</code> further
 * enumeration with that #GSocketAddressEnumerator is not possible, and it can
 * be unreffed.
 */
public class SocketAddressEnumerator extends org.gtk.gobject.Object {

    public SocketAddressEnumerator(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SocketAddressEnumerator */
    public static SocketAddressEnumerator castFrom(org.gtk.gobject.Object gobject) {
        return new SocketAddressEnumerator(gobject.getReference());
    }
    
    /**
     * Retrieves the next #GSocketAddress from @enumerator. Note that this
     * may block for some amount of time. (Eg, a #GNetworkAddress may need
     * to do a DNS lookup before it can return an address.) Use
     * g_socket_address_enumerator_next_async() if you need to avoid
     * blocking.
     * 
     * If @enumerator is expected to yield addresses, but for some reason
     * is unable to (eg, because of a DNS error), then the first call to
     * g_socket_address_enumerator_next() will return an appropriate error
     * in *@error. However, if the first call to
     * g_socket_address_enumerator_next() succeeds, then any further
     * internal errors (other than @cancellable being triggered) will be
     * ignored.
     */
    public SocketAddress next(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_address_enumerator_next(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketAddress(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously retrieves the next #GSocketAddress from @enumerator
     * and then calls @callback, which must call
     * g_socket_address_enumerator_next_finish() to get the result.
     * 
     * It is an error to call this multiple times before the previous callback has finished.
     */
    public void nextAsync(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_socket_address_enumerator_next_async(handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Retrieves the result of a completed call to
     * g_socket_address_enumerator_next_async(). See
     * g_socket_address_enumerator_next() for more information about
     * error handling.
     */
    public SocketAddress nextFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_socket_address_enumerator_next_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new SocketAddress(References.get(RESULT, true));
    }
    
}
