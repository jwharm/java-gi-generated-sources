// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$544 {

    static final FunctionDescriptor g_async_result_legacy_propagate_error$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_result_legacy_propagate_error$MH = RuntimeHelper.downcallHandle(
        "g_async_result_legacy_propagate_error",
        constants$544.g_async_result_legacy_propagate_error$FUNC
    );
    static final FunctionDescriptor g_async_result_is_tagged$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_result_is_tagged$MH = RuntimeHelper.downcallHandle(
        "g_async_result_is_tagged",
        constants$544.g_async_result_is_tagged$FUNC
    );
    static final FunctionDescriptor g_input_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_input_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_get_type",
        constants$544.g_input_stream_get_type$FUNC
    );
    static final FunctionDescriptor g_input_stream_read$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_read$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_read",
        constants$544.g_input_stream_read$FUNC
    );
    static final FunctionDescriptor g_input_stream_read_all$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_read_all$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_read_all",
        constants$544.g_input_stream_read_all$FUNC
    );
    static final FunctionDescriptor g_input_stream_read_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_input_stream_read_bytes$MH = RuntimeHelper.downcallHandle(
        "g_input_stream_read_bytes",
        constants$544.g_input_stream_read_bytes$FUNC
    );
}


