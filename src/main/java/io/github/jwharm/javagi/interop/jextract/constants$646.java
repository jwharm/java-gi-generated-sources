// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$646 {

    static final FunctionDescriptor g_IS_debug_controller$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_IS_debug_controller$MH = RuntimeHelper.downcallHandle(
        "g_IS_debug_controller",
        constants$646.g_IS_debug_controller$FUNC
    );
    static final FunctionDescriptor g_debug_controller_GET_IFACE$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_debug_controller_GET_IFACE$MH = RuntimeHelper.downcallHandle(
        "g_debug_controller_GET_IFACE",
        constants$646.g_debug_controller_GET_IFACE$FUNC
    );
    static final FunctionDescriptor g_debug_controller_get_debug_enabled$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_debug_controller_get_debug_enabled$MH = RuntimeHelper.downcallHandle(
        "g_debug_controller_get_debug_enabled",
        constants$646.g_debug_controller_get_debug_enabled$FUNC
    );
    static final FunctionDescriptor g_debug_controller_set_debug_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_debug_controller_set_debug_enabled$MH = RuntimeHelper.downcallHandle(
        "g_debug_controller_set_debug_enabled",
        constants$646.g_debug_controller_set_debug_enabled$FUNC
    );
    static final FunctionDescriptor g_debug_controller_dbus_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_debug_controller_dbus_get_type$MH = RuntimeHelper.downcallHandle(
        "g_debug_controller_dbus_get_type",
        constants$646.g_debug_controller_dbus_get_type$FUNC
    );
    static final FunctionDescriptor glib_autoptr_clear_GDebugControllerDBus$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_clear_GDebugControllerDBus$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_clear_GDebugControllerDBus",
        constants$646.glib_autoptr_clear_GDebugControllerDBus$FUNC
    );
}


