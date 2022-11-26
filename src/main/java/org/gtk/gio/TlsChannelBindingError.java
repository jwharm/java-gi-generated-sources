package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An error code used with {@code G_TLS_CHANNEL_BINDING_ERROR} in a {@link org.gtk.glib.Error} to
 * indicate a TLS channel binding retrieval error.
 * @version 2.66
 */
public class TlsChannelBindingError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GTlsChannelBindingError";
    
    /**
     * Either entire binding
     *    retrieval facility or specific binding type is not implemented in the
     *    TLS backend.
     */
    public static final TlsChannelBindingError NOT_IMPLEMENTED = new TlsChannelBindingError(0);
    
    /**
     * The handshake is not yet
     *    complete on the connection which is a strong requirement for any existing
     *    binding type.
     */
    public static final TlsChannelBindingError INVALID_STATE = new TlsChannelBindingError(1);
    
    /**
     * Handshake is complete but
     *    binding data is not available. That normally indicates the TLS
     *    implementation failed to provide the binding data. For example, some
     *    implementations do not provide a peer certificate for resumed connections.
     */
    public static final TlsChannelBindingError NOT_AVAILABLE = new TlsChannelBindingError(2);
    
    /**
     * Binding type is not supported
     *    on the current connection. This error could be triggered when requesting
     *    {@code tls-server-end-point} binding data for a certificate which has no hash
     *    function or uses multiple hash functions.
     */
    public static final TlsChannelBindingError NOT_SUPPORTED = new TlsChannelBindingError(3);
    
    /**
     * Any other backend error
     *    preventing binding data retrieval.
     */
    public static final TlsChannelBindingError GENERAL_ERROR = new TlsChannelBindingError(4);
    
    public TlsChannelBindingError(int value) {
        super(value);
    }
    
    /**
     * Gets the TLS channel binding error quark.
     * @return a {@link org.gtk.glib.Quark}.
     */
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_channel_binding_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_tls_channel_binding_error_quark = Interop.downcallHandle(
            "g_tls_channel_binding_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
