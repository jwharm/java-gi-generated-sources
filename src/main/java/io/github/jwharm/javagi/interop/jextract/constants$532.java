// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$532 {

    static final FunctionDescriptor g_app_launch_context_get_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_launch_context_get_display$MH = RuntimeHelper.downcallHandle(
        "g_app_launch_context_get_display",
        constants$532.g_app_launch_context_get_display$FUNC
    );
    static final FunctionDescriptor g_app_launch_context_get_startup_notify_id$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_launch_context_get_startup_notify_id$MH = RuntimeHelper.downcallHandle(
        "g_app_launch_context_get_startup_notify_id",
        constants$532.g_app_launch_context_get_startup_notify_id$FUNC
    );
    static final FunctionDescriptor g_app_launch_context_launch_failed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_launch_context_launch_failed$MH = RuntimeHelper.downcallHandle(
        "g_app_launch_context_launch_failed",
        constants$532.g_app_launch_context_launch_failed$FUNC
    );
    static final FunctionDescriptor g_app_info_monitor_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_app_info_monitor_get_type$MH = RuntimeHelper.downcallHandle(
        "g_app_info_monitor_get_type",
        constants$532.g_app_info_monitor_get_type$FUNC
    );
    static final FunctionDescriptor g_app_info_monitor_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_app_info_monitor_get$MH = RuntimeHelper.downcallHandle(
        "g_app_info_monitor_get",
        constants$532.g_app_info_monitor_get$FUNC
    );
    static final FunctionDescriptor g_application_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_application_get_type$MH = RuntimeHelper.downcallHandle(
        "g_application_get_type",
        constants$532.g_application_get_type$FUNC
    );
}


