// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$523 {

    static final FunctionDescriptor g_action_group_action_added$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_group_action_added$MH = RuntimeHelper.downcallHandle(
        "g_action_group_action_added",
        constants$523.g_action_group_action_added$FUNC
    );
    static final FunctionDescriptor g_action_group_action_removed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_group_action_removed$MH = RuntimeHelper.downcallHandle(
        "g_action_group_action_removed",
        constants$523.g_action_group_action_removed$FUNC
    );
    static final FunctionDescriptor g_action_group_action_enabled_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_action_group_action_enabled_changed$MH = RuntimeHelper.downcallHandle(
        "g_action_group_action_enabled_changed",
        constants$523.g_action_group_action_enabled_changed$FUNC
    );
    static final FunctionDescriptor g_action_group_action_state_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_group_action_state_changed$MH = RuntimeHelper.downcallHandle(
        "g_action_group_action_state_changed",
        constants$523.g_action_group_action_state_changed$FUNC
    );
    static final FunctionDescriptor g_action_group_query_action$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_group_query_action$MH = RuntimeHelper.downcallHandle(
        "g_action_group_query_action",
        constants$523.g_action_group_query_action$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_export_action_group$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_export_action_group$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_export_action_group",
        constants$523.g_dbus_connection_export_action_group$FUNC
    );
}


