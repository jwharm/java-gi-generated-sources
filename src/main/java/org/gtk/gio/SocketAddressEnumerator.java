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
public class SocketAddressEnumerator extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSocketAddressEnumerator";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a SocketAddressEnumerator proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SocketAddressEnumerator(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SocketAddressEnumerator> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SocketAddressEnumerator(input);
    
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
    public @Nullable org.gtk.gio.SocketAddress next(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_socket_address_enumerator_next.invokeExact(
                        handle(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gtk.gio.SocketAddress) Interop.register(RESULT, org.gtk.gio.SocketAddress.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
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
        try {
            DowncallHandles.g_socket_address_enumerator_next_async.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
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
    public @Nullable org.gtk.gio.SocketAddress nextFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_socket_address_enumerator_next_finish.invokeExact(
                        handle(),
                        result.handle(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gtk.gio.SocketAddress) Interop.register(RESULT, org.gtk.gio.SocketAddress.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_socket_address_enumerator_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link SocketAddressEnumerator.Builder} object constructs a {@link SocketAddressEnumerator} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SocketAddressEnumerator.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SocketAddressEnumerator} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SocketAddressEnumerator}.
         * @return A new instance of {@code SocketAddressEnumerator} with the properties 
         *         that were set in the Builder object.
         */
        public SocketAddressEnumerator build() {
            return (SocketAddressEnumerator) org.gtk.gobject.GObject.newWithProperties(
                SocketAddressEnumerator.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_socket_address_enumerator_next = Interop.downcallHandle(
                "g_socket_address_enumerator_next",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_address_enumerator_next_async = Interop.downcallHandle(
                "g_socket_address_enumerator_next_async",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_address_enumerator_next_finish = Interop.downcallHandle(
                "g_socket_address_enumerator_next_finish",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_socket_address_enumerator_get_type = Interop.downcallHandle(
                "g_socket_address_enumerator_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_socket_address_enumerator_get_type != null;
    }
}
