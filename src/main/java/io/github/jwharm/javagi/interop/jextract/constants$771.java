// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$771 {

    static final FunctionDescriptor g_network_service_get_scheme$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_service_get_scheme$MH = RuntimeHelper.downcallHandle(
        "g_network_service_get_scheme",
        constants$771.g_network_service_get_scheme$FUNC
    );
    static final FunctionDescriptor g_network_service_set_scheme$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_service_set_scheme$MH = RuntimeHelper.downcallHandle(
        "g_network_service_set_scheme",
        constants$771.g_network_service_set_scheme$FUNC
    );
    static final FunctionDescriptor g_notification_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_notification_get_type$MH = RuntimeHelper.downcallHandle(
        "g_notification_get_type",
        constants$771.g_notification_get_type$FUNC
    );
    static final FunctionDescriptor g_notification_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_notification_new$MH = RuntimeHelper.downcallHandle(
        "g_notification_new",
        constants$771.g_notification_new$FUNC
    );
    static final FunctionDescriptor g_notification_set_title$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_notification_set_title$MH = RuntimeHelper.downcallHandle(
        "g_notification_set_title",
        constants$771.g_notification_set_title$FUNC
    );
    static final FunctionDescriptor g_notification_set_body$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_notification_set_body$MH = RuntimeHelper.downcallHandle(
        "g_notification_set_body",
        constants$771.g_notification_set_body$FUNC
    );
}


