// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$624 {

    static final FunctionDescriptor g_dbus_message_to_blob$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_to_blob$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_to_blob",
        constants$624.g_dbus_message_to_blob$FUNC
    );
    static final FunctionDescriptor g_dbus_message_to_gerror$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_to_gerror$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_to_gerror",
        constants$624.g_dbus_message_to_gerror$FUNC
    );
    static final FunctionDescriptor g_dbus_method_invocation_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_dbus_method_invocation_get_type$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_get_type",
        constants$624.g_dbus_method_invocation_get_type$FUNC
    );
    static final FunctionDescriptor g_dbus_method_invocation_get_sender$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_get_sender$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_get_sender",
        constants$624.g_dbus_method_invocation_get_sender$FUNC
    );
    static final FunctionDescriptor g_dbus_method_invocation_get_object_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_get_object_path$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_get_object_path",
        constants$624.g_dbus_method_invocation_get_object_path$FUNC
    );
    static final FunctionDescriptor g_dbus_method_invocation_get_interface_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_method_invocation_get_interface_name$MH = RuntimeHelper.downcallHandle(
        "g_dbus_method_invocation_get_interface_name",
        constants$624.g_dbus_method_invocation_get_interface_name$FUNC
    );
}


