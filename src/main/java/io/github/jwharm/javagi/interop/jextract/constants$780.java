// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$780 {

    static final FunctionDescriptor g_property_action_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_property_action_get_type$MH = RuntimeHelper.downcallHandle(
        "g_property_action_get_type",
        constants$780.g_property_action_get_type$FUNC
    );
    static final FunctionDescriptor g_property_action_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_property_action_new$MH = RuntimeHelper.downcallHandle(
        "g_property_action_new",
        constants$780.g_property_action_new$FUNC
    );
    static final FunctionDescriptor g_proxy_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_proxy_get_type$MH = RuntimeHelper.downcallHandle(
        "g_proxy_get_type",
        constants$780.g_proxy_get_type$FUNC
    );
    static final FunctionDescriptor g_proxy_get_default_for_protocol$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_proxy_get_default_for_protocol$MH = RuntimeHelper.downcallHandle(
        "g_proxy_get_default_for_protocol",
        constants$780.g_proxy_get_default_for_protocol$FUNC
    );
    static final FunctionDescriptor g_proxy_connect$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_proxy_connect$MH = RuntimeHelper.downcallHandle(
        "g_proxy_connect",
        constants$780.g_proxy_connect$FUNC
    );
    static final FunctionDescriptor g_proxy_connect_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_proxy_connect_async$MH = RuntimeHelper.downcallHandle(
        "g_proxy_connect_async",
        constants$780.g_proxy_connect_async$FUNC
    );
}


