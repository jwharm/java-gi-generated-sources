// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$815 {

    static final FunctionDescriptor g_socket_new_from_fd$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_new_from_fd$MH = RuntimeHelper.downcallHandle(
        "g_socket_new_from_fd",
        constants$815.g_socket_new_from_fd$FUNC
    );
    static final FunctionDescriptor g_socket_get_fd$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_fd$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_fd",
        constants$815.g_socket_get_fd$FUNC
    );
    static final FunctionDescriptor g_socket_get_family$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_family$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_family",
        constants$815.g_socket_get_family$FUNC
    );
    static final FunctionDescriptor g_socket_get_socket_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_socket_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_socket_type",
        constants$815.g_socket_get_socket_type$FUNC
    );
    static final FunctionDescriptor g_socket_get_protocol$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_protocol$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_protocol",
        constants$815.g_socket_get_protocol$FUNC
    );
    static final FunctionDescriptor g_socket_get_local_address$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_local_address$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_local_address",
        constants$815.g_socket_get_local_address$FUNC
    );
}


