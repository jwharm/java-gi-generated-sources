package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * SRV (service) records are used by some network protocols to provide
 * service-specific aliasing and load-balancing. For example, XMPP
 * (Jabber) uses SRV records to locate the XMPP server for a domain;
 * rather than connecting directly to "example.com" or assuming a
 * specific server hostname like "xmpp.example.com", an XMPP client
 * would look up the "xmpp-client" SRV record for "example.com", and
 * then connect to whatever host was pointed to by that record.
 * <p>
 * You can use g_resolver_lookup_service() or
 * g_resolver_lookup_service_async() to find the {@code GSrvTargets}
 * for a given service. However, if you are simply planning to connect
 * to the remote service, you can use {@link NetworkService}'s
 * {@link SocketConnectable} interface and not need to worry about
 * {@link SrvTarget} at all.
 */
public class SrvTarget extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSrvTarget";
    
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
     * Allocate a new {@link SrvTarget}
     * @return A new, uninitialized @{link SrvTarget}
     */
    public static SrvTarget allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SrvTarget newInstance = new SrvTarget(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SrvTarget proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SrvTarget(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SrvTarget> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SrvTarget(input);
    
    private static MemoryAddress constructNew(java.lang.String hostname, short port, short priority, short weight) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_srv_target_new.invokeExact(
                        Marshal.stringToAddress.marshal(hostname, SCOPE),
                        port,
                        priority,
                        weight);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@link SrvTarget} with the given parameters.
     * <p>
     * You should not need to use this; normally {@code GSrvTargets} are
     * created by {@link Resolver}.
     * @param hostname the host that the service is running on
     * @param port the port that the service is running on
     * @param priority the target's priority
     * @param weight the target's weight
     */
    public SrvTarget(java.lang.String hostname, short port, short priority, short weight) {
        super(constructNew(hostname, port, priority, weight));
        this.takeOwnership();
    }
    
    /**
     * Copies {@code target}
     * @return a copy of {@code target}
     */
    public org.gtk.gio.SrvTarget copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_srv_target_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gio.SrvTarget.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Frees {@code target}
     */
    public void free() {
        try {
            DowncallHandles.g_srv_target_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets {@code target}'s hostname (in ASCII form; if you are going to present
     * this to the user, you should use g_hostname_is_ascii_encoded() to
     * check if it contains encoded Unicode segments, and use
     * g_hostname_to_unicode() to convert it if it does.)
     * @return {@code target}'s hostname
     */
    public java.lang.String getHostname() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_srv_target_get_hostname.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets {@code target}'s port
     * @return {@code target}'s port
     */
    public short getPort() {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.g_srv_target_get_port.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets {@code target}'s priority. You should not need to look at this;
     * {@link Resolver} already sorts the targets according to the algorithm in
     * RFC 2782.
     * @return {@code target}'s priority
     */
    public short getPriority() {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.g_srv_target_get_priority.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets {@code target}'s weight. You should not need to look at this;
     * {@link Resolver} already sorts the targets according to the algorithm in
     * RFC 2782.
     * @return {@code target}'s weight
     */
    public short getWeight() {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.g_srv_target_get_weight.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sorts {@code targets} in place according to the algorithm in RFC 2782.
     * @param targets a {@link org.gtk.glib.List} of {@link SrvTarget}
     * @return the head of the sorted list.
     */
    public static org.gtk.glib.List listSort(org.gtk.glib.List targets) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_srv_target_list_sort.invokeExact(targets.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_srv_target_new = Interop.downcallHandle(
                "g_srv_target_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_SHORT),
                false
        );
        
        private static final MethodHandle g_srv_target_copy = Interop.downcallHandle(
                "g_srv_target_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_srv_target_free = Interop.downcallHandle(
                "g_srv_target_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_srv_target_get_hostname = Interop.downcallHandle(
                "g_srv_target_get_hostname",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_srv_target_get_port = Interop.downcallHandle(
                "g_srv_target_get_port",
                FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_srv_target_get_priority = Interop.downcallHandle(
                "g_srv_target_get_priority",
                FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_srv_target_get_weight = Interop.downcallHandle(
                "g_srv_target_get_weight",
                FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_srv_target_list_sort = Interop.downcallHandle(
                "g_srv_target_list_sort",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
}
