// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$769 {

    static final FunctionDescriptor g_network_monitor_get_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_network_monitor_get_default$MH = RuntimeHelper.downcallHandle(
        "g_network_monitor_get_default",
        constants$769.g_network_monitor_get_default$FUNC
    );
    static final FunctionDescriptor g_network_monitor_get_network_available$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_monitor_get_network_available$MH = RuntimeHelper.downcallHandle(
        "g_network_monitor_get_network_available",
        constants$769.g_network_monitor_get_network_available$FUNC
    );
    static final FunctionDescriptor g_network_monitor_get_network_metered$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_monitor_get_network_metered$MH = RuntimeHelper.downcallHandle(
        "g_network_monitor_get_network_metered",
        constants$769.g_network_monitor_get_network_metered$FUNC
    );
    static final FunctionDescriptor g_network_monitor_get_connectivity$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_monitor_get_connectivity$MH = RuntimeHelper.downcallHandle(
        "g_network_monitor_get_connectivity",
        constants$769.g_network_monitor_get_connectivity$FUNC
    );
    static final FunctionDescriptor g_network_monitor_can_reach$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_monitor_can_reach$MH = RuntimeHelper.downcallHandle(
        "g_network_monitor_can_reach",
        constants$769.g_network_monitor_can_reach$FUNC
    );
    static final FunctionDescriptor g_network_monitor_can_reach_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_network_monitor_can_reach_async$MH = RuntimeHelper.downcallHandle(
        "g_network_monitor_can_reach_async",
        constants$769.g_network_monitor_can_reach_async$FUNC
    );
}


