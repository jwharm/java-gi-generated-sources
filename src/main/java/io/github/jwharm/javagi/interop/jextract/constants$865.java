// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$865 {

    static final FunctionDescriptor g_tls_connection_emit_accept_certificate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_tls_connection_emit_accept_certificate$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_emit_accept_certificate",
        constants$865.g_tls_connection_emit_accept_certificate$FUNC
    );
    static final FunctionDescriptor g_tls_client_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_tls_client_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_tls_client_connection_get_type",
        constants$865.g_tls_client_connection_get_type$FUNC
    );
    static final FunctionDescriptor g_tls_client_connection_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_client_connection_new$MH = RuntimeHelper.downcallHandle(
        "g_tls_client_connection_new",
        constants$865.g_tls_client_connection_new$FUNC
    );
    static final FunctionDescriptor g_tls_client_connection_get_validation_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_client_connection_get_validation_flags$MH = RuntimeHelper.downcallHandle(
        "g_tls_client_connection_get_validation_flags",
        constants$865.g_tls_client_connection_get_validation_flags$FUNC
    );
    static final FunctionDescriptor g_tls_client_connection_set_validation_flags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_tls_client_connection_set_validation_flags$MH = RuntimeHelper.downcallHandle(
        "g_tls_client_connection_set_validation_flags",
        constants$865.g_tls_client_connection_set_validation_flags$FUNC
    );
    static final FunctionDescriptor g_tls_client_connection_get_server_identity$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_client_connection_get_server_identity$MH = RuntimeHelper.downcallHandle(
        "g_tls_client_connection_get_server_identity",
        constants$865.g_tls_client_connection_get_server_identity$FUNC
    );
}


