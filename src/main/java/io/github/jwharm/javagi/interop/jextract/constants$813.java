// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$813 {

    static final FunctionDescriptor g_simple_async_report_take_gerror_in_idle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_async_report_take_gerror_in_idle$MH = RuntimeHelper.downcallHandle(
        "g_simple_async_report_take_gerror_in_idle",
        constants$813.g_simple_async_report_take_gerror_in_idle$FUNC
    );
    static final FunctionDescriptor g_simple_io_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_simple_io_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_simple_io_stream_get_type",
        constants$813.g_simple_io_stream_get_type$FUNC
    );
    static final FunctionDescriptor g_simple_io_stream_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_io_stream_new$MH = RuntimeHelper.downcallHandle(
        "g_simple_io_stream_new",
        constants$813.g_simple_io_stream_new$FUNC
    );
    static final FunctionDescriptor g_simple_permission_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_simple_permission_get_type$MH = RuntimeHelper.downcallHandle(
        "g_simple_permission_get_type",
        constants$813.g_simple_permission_get_type$FUNC
    );
    static final FunctionDescriptor g_simple_permission_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_simple_permission_new$MH = RuntimeHelper.downcallHandle(
        "g_simple_permission_new",
        constants$813.g_simple_permission_new$FUNC
    );
    static final FunctionDescriptor g_simple_proxy_resolver_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_simple_proxy_resolver_get_type$MH = RuntimeHelper.downcallHandle(
        "g_simple_proxy_resolver_get_type",
        constants$813.g_simple_proxy_resolver_get_type$FUNC
    );
}


