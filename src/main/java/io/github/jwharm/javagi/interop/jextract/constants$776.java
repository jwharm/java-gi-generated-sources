// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$776 {

    static final FunctionDescriptor g_pollable_input_stream_create_source$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pollable_input_stream_create_source$MH = RuntimeHelper.downcallHandle(
        "g_pollable_input_stream_create_source",
        constants$776.g_pollable_input_stream_create_source$FUNC
    );
    static final FunctionDescriptor g_pollable_input_stream_read_nonblocking$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pollable_input_stream_read_nonblocking$MH = RuntimeHelper.downcallHandle(
        "g_pollable_input_stream_read_nonblocking",
        constants$776.g_pollable_input_stream_read_nonblocking$FUNC
    );
    static final FunctionDescriptor g_pollable_output_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_pollable_output_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_pollable_output_stream_get_type",
        constants$776.g_pollable_output_stream_get_type$FUNC
    );
    static final FunctionDescriptor g_pollable_output_stream_can_poll$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pollable_output_stream_can_poll$MH = RuntimeHelper.downcallHandle(
        "g_pollable_output_stream_can_poll",
        constants$776.g_pollable_output_stream_can_poll$FUNC
    );
    static final FunctionDescriptor g_pollable_output_stream_is_writable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pollable_output_stream_is_writable$MH = RuntimeHelper.downcallHandle(
        "g_pollable_output_stream_is_writable",
        constants$776.g_pollable_output_stream_is_writable$FUNC
    );
    static final FunctionDescriptor g_pollable_output_stream_create_source$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pollable_output_stream_create_source$MH = RuntimeHelper.downcallHandle(
        "g_pollable_output_stream_create_source",
        constants$776.g_pollable_output_stream_create_source$FUNC
    );
}


