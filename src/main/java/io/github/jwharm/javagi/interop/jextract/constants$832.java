// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$832 {

    static final FunctionDescriptor g_socket_connection_factory_lookup_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_connection_factory_lookup_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_factory_lookup_type",
        constants$832.g_socket_connection_factory_lookup_type$FUNC
    );
    static final FunctionDescriptor g_socket_connection_factory_create_connection$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_connection_factory_create_connection$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_factory_create_connection",
        constants$832.g_socket_connection_factory_create_connection$FUNC
    );
    static final FunctionDescriptor g_socket_control_message_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_socket_control_message_get_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_control_message_get_type",
        constants$832.g_socket_control_message_get_type$FUNC
    );
    static final FunctionDescriptor g_socket_control_message_get_size$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_control_message_get_size$MH = RuntimeHelper.downcallHandle(
        "g_socket_control_message_get_size",
        constants$832.g_socket_control_message_get_size$FUNC
    );
    static final FunctionDescriptor g_socket_control_message_get_level$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_control_message_get_level$MH = RuntimeHelper.downcallHandle(
        "g_socket_control_message_get_level",
        constants$832.g_socket_control_message_get_level$FUNC
    );
    static final FunctionDescriptor g_socket_control_message_get_msg_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_control_message_get_msg_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_control_message_get_msg_type",
        constants$832.g_socket_control_message_get_msg_type$FUNC
    );
}


