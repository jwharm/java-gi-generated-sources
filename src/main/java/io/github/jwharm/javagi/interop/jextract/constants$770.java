// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$770 {

    static final FunctionDescriptor g_network_monitor_can_reach_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_monitor_can_reach_finish$MH = RuntimeHelper.downcallHandle(
        "g_network_monitor_can_reach_finish",
        constants$770.g_network_monitor_can_reach_finish$FUNC
    );
    static final FunctionDescriptor g_network_service_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_network_service_get_type$MH = RuntimeHelper.downcallHandle(
        "g_network_service_get_type",
        constants$770.g_network_service_get_type$FUNC
    );
    static final FunctionDescriptor g_network_service_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_service_new$MH = RuntimeHelper.downcallHandle(
        "g_network_service_new",
        constants$770.g_network_service_new$FUNC
    );
    static final FunctionDescriptor g_network_service_get_service$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_service_get_service$MH = RuntimeHelper.downcallHandle(
        "g_network_service_get_service",
        constants$770.g_network_service_get_service$FUNC
    );
    static final FunctionDescriptor g_network_service_get_protocol$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_service_get_protocol$MH = RuntimeHelper.downcallHandle(
        "g_network_service_get_protocol",
        constants$770.g_network_service_get_protocol$FUNC
    );
    static final FunctionDescriptor g_network_service_get_domain$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_service_get_domain$MH = RuntimeHelper.downcallHandle(
        "g_network_service_get_domain",
        constants$770.g_network_service_get_domain$FUNC
    );
}


