// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1044 {

    static final FunctionDescriptor g_unix_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_unix_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_unix_connection_get_type",
        constants$1044.g_unix_connection_get_type$FUNC
    );
    static final FunctionDescriptor g_unix_connection_send_fd$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_unix_connection_send_fd$MH = RuntimeHelper.downcallHandle(
        "g_unix_connection_send_fd",
        constants$1044.g_unix_connection_send_fd$FUNC
    );
    static final FunctionDescriptor g_unix_connection_receive_fd$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_unix_connection_receive_fd$MH = RuntimeHelper.downcallHandle(
        "g_unix_connection_receive_fd",
        constants$1044.g_unix_connection_receive_fd$FUNC
    );
    static final FunctionDescriptor g_unix_connection_send_credentials$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_unix_connection_send_credentials$MH = RuntimeHelper.downcallHandle(
        "g_unix_connection_send_credentials",
        constants$1044.g_unix_connection_send_credentials$FUNC
    );
    static final FunctionDescriptor g_unix_connection_send_credentials_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_unix_connection_send_credentials_async$MH = RuntimeHelper.downcallHandle(
        "g_unix_connection_send_credentials_async",
        constants$1044.g_unix_connection_send_credentials_async$FUNC
    );
    static final FunctionDescriptor g_unix_connection_send_credentials_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_unix_connection_send_credentials_finish$MH = RuntimeHelper.downcallHandle(
        "g_unix_connection_send_credentials_finish",
        constants$1044.g_unix_connection_send_credentials_finish$FUNC
    );
}


