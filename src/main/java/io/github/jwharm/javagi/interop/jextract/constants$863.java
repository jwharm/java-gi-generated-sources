// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$863 {

    static final FunctionDescriptor g_tls_connection_set_rehandshake_mode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_tls_connection_set_rehandshake_mode$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_set_rehandshake_mode",
        constants$863.g_tls_connection_set_rehandshake_mode$FUNC
    );
    static final FunctionDescriptor g_tls_connection_get_rehandshake_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_get_rehandshake_mode$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_get_rehandshake_mode",
        constants$863.g_tls_connection_get_rehandshake_mode$FUNC
    );
    static final FunctionDescriptor g_tls_connection_set_advertised_protocols$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_set_advertised_protocols$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_set_advertised_protocols",
        constants$863.g_tls_connection_set_advertised_protocols$FUNC
    );
    static final FunctionDescriptor g_tls_connection_get_negotiated_protocol$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_get_negotiated_protocol$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_get_negotiated_protocol",
        constants$863.g_tls_connection_get_negotiated_protocol$FUNC
    );
    static final FunctionDescriptor g_tls_connection_get_channel_binding_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_get_channel_binding_data$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_get_channel_binding_data",
        constants$863.g_tls_connection_get_channel_binding_data$FUNC
    );
    static final FunctionDescriptor g_tls_connection_handshake$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_handshake$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_handshake",
        constants$863.g_tls_connection_handshake$FUNC
    );
}


