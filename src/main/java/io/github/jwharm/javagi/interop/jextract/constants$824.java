// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$824 {

    static final FunctionDescriptor g_socket_get_option$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_option$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_option",
        constants$824.g_socket_get_option$FUNC
    );
    static final FunctionDescriptor g_socket_set_option$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_set_option$MH = RuntimeHelper.downcallHandle(
        "g_socket_set_option",
        constants$824.g_socket_set_option$FUNC
    );
    static final FunctionDescriptor g_socket_client_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_socket_client_get_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_get_type",
        constants$824.g_socket_client_get_type$FUNC
    );
    static final FunctionDescriptor g_socket_client_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_socket_client_new$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_new",
        constants$824.g_socket_client_new$FUNC
    );
    static final FunctionDescriptor g_socket_client_get_family$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_get_family$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_get_family",
        constants$824.g_socket_client_get_family$FUNC
    );
    static final FunctionDescriptor g_socket_client_set_family$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_client_set_family$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_set_family",
        constants$824.g_socket_client_set_family$FUNC
    );
}


