package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
public class SrvTarget extends io.github.jwharm.javagi.ResourceBase {

    public SrvTarget(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_srv_target_new = Interop.downcallHandle(
        "g_srv_target_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)
    );
    
    private static Refcounted constructNew(java.lang.String hostname, short port, short priority, short weight) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_srv_target_new.invokeExact(Interop.allocateNativeString(hostname).handle(), port, priority, weight), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link SrvTarget} with the given parameters.
     * <p>
     * You should not need to use this; normally {@code GSrvTargets} are
     * created by {@link Resolver}.
     */
    public SrvTarget(java.lang.String hostname, short port, short priority, short weight) {
        super(constructNew(hostname, port, priority, weight));
    }
    
    static final MethodHandle g_srv_target_copy = Interop.downcallHandle(
        "g_srv_target_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies {@code target}
     */
    public SrvTarget copy() {
        try {
            var RESULT = (MemoryAddress) g_srv_target_copy.invokeExact(handle());
            return new SrvTarget(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_srv_target_free = Interop.downcallHandle(
        "g_srv_target_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees {@code target}
     */
    public void free() {
        try {
            g_srv_target_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_srv_target_get_hostname = Interop.downcallHandle(
        "g_srv_target_get_hostname",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code target}'s hostname (in ASCII form; if you are going to present
     * this to the user, you should use g_hostname_is_ascii_encoded() to
     * check if it contains encoded Unicode segments, and use
     * g_hostname_to_unicode() to convert it if it does.)
     */
    public java.lang.String getHostname() {
        try {
            var RESULT = (MemoryAddress) g_srv_target_get_hostname.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_srv_target_get_port = Interop.downcallHandle(
        "g_srv_target_get_port",
        FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code target}'s port
     */
    public short getPort() {
        try {
            var RESULT = (short) g_srv_target_get_port.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_srv_target_get_priority = Interop.downcallHandle(
        "g_srv_target_get_priority",
        FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code target}'s priority. You should not need to look at this;
     * {@link Resolver} already sorts the targets according to the algorithm in
     * RFC 2782.
     */
    public short getPriority() {
        try {
            var RESULT = (short) g_srv_target_get_priority.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_srv_target_get_weight = Interop.downcallHandle(
        "g_srv_target_get_weight",
        FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code target}'s weight. You should not need to look at this;
     * {@link Resolver} already sorts the targets according to the algorithm in
     * RFC 2782.
     */
    public short getWeight() {
        try {
            var RESULT = (short) g_srv_target_get_weight.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_srv_target_list_sort = Interop.downcallHandle(
        "g_srv_target_list_sort",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sorts {@code targets} in place according to the algorithm in RFC 2782.
     */
    public static org.gtk.glib.List listSort(org.gtk.glib.List targets) {
        try {
            var RESULT = (MemoryAddress) g_srv_target_list_sort.invokeExact(targets.handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
