// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1065 {

    static final FunctionDescriptor glib_slistautoptr_cleanup_GUnixSocketAddress$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_slistautoptr_cleanup_GUnixSocketAddress$MH = RuntimeHelper.downcallHandle(
        "glib_slistautoptr_cleanup_GUnixSocketAddress",
        constants$1065.glib_slistautoptr_cleanup_GUnixSocketAddress$FUNC
    );
    static final FunctionDescriptor glib_queueautoptr_cleanup_GUnixSocketAddress$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_queueautoptr_cleanup_GUnixSocketAddress$MH = RuntimeHelper.downcallHandle(
        "glib_queueautoptr_cleanup_GUnixSocketAddress",
        constants$1065.glib_queueautoptr_cleanup_GUnixSocketAddress$FUNC
    );
    static final FunctionDescriptor g_unix_socket_address_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_unix_socket_address_get_type$MH = RuntimeHelper.downcallHandle(
        "g_unix_socket_address_get_type",
        constants$1065.g_unix_socket_address_get_type$FUNC
    );
    static final FunctionDescriptor g_unix_socket_address_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_unix_socket_address_new$MH = RuntimeHelper.downcallHandle(
        "g_unix_socket_address_new",
        constants$1065.g_unix_socket_address_new$FUNC
    );
    static final FunctionDescriptor g_unix_socket_address_new_abstract$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_unix_socket_address_new_abstract$MH = RuntimeHelper.downcallHandle(
        "g_unix_socket_address_new_abstract",
        constants$1065.g_unix_socket_address_new_abstract$FUNC
    );
    static final FunctionDescriptor g_unix_socket_address_new_with_type$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_unix_socket_address_new_with_type$MH = RuntimeHelper.downcallHandle(
        "g_unix_socket_address_new_with_type",
        constants$1065.g_unix_socket_address_new_with_type$FUNC
    );
}


