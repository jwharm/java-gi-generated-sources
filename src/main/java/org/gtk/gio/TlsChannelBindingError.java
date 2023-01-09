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
public enum TlsChannelBindingError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Either entire binding
     *    retrieval facility or specific binding type is not implemented in the
     *    TLS backend.
     */
    NOT_IMPLEMENTED(0),
    
    /**
     * The handshake is not yet
     *    complete on the connection which is a strong requirement for any existing
     *    binding type.
     */
    INVALID_STATE(1),
    
    /**
     * Handshake is complete but
     *    binding data is not available. That normally indicates the TLS
     *    implementation failed to provide the binding data. For example, some
     *    implementations do not provide a peer certificate for resumed connections.
     */
    NOT_AVAILABLE(2),
    
    /**
     * Binding type is not supported
     *    on the current connection. This error could be triggered when requesting
     *    {@code tls-server-end-point} binding data for a certificate which has no hash
     *    function or uses multiple hash functions.
     */
    NOT_SUPPORTED(3),
    
    /**
     * Any other backend error
     *    preventing binding data retrieval.
     */
    GENERAL_ERROR(4);
    
    private static final java.lang.String C_TYPE_NAME = "GTlsChannelBindingError";
    
    private final int value;
    
    /**
     * Create a new TlsChannelBindingError for the provided value
     * @param numeric value the enum value
     */
    TlsChannelBindingError(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new TlsChannelBindingError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TlsChannelBindingError of(int value) {
        return switch (value) {
            case 0 -> NOT_IMPLEMENTED;
            case 1 -> INVALID_STATE;
            case 2 -> NOT_AVAILABLE;
            case 3 -> NOT_SUPPORTED;
            case 4 -> GENERAL_ERROR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Gets the TLS channel binding error quark.
     * @return a {@link org.gtk.glib.Quark}.
     */
    public static org.gtk.glib.Quark quark() {
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
