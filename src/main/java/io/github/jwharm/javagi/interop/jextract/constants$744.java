// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$744 {

    static final FunctionDescriptor g_memory_input_stream_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_memory_input_stream_new$MH = RuntimeHelper.downcallHandle(
        "g_memory_input_stream_new",
        constants$744.g_memory_input_stream_new$FUNC
    );
    static final FunctionDescriptor g_memory_input_stream_new_from_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_memory_input_stream_new_from_data$MH = RuntimeHelper.downcallHandle(
        "g_memory_input_stream_new_from_data",
        constants$744.g_memory_input_stream_new_from_data$FUNC
    );
    static final FunctionDescriptor g_memory_input_stream_new_from_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_memory_input_stream_new_from_bytes$MH = RuntimeHelper.downcallHandle(
        "g_memory_input_stream_new_from_bytes",
        constants$744.g_memory_input_stream_new_from_bytes$FUNC
    );
    static final FunctionDescriptor g_memory_input_stream_add_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_memory_input_stream_add_data$MH = RuntimeHelper.downcallHandle(
        "g_memory_input_stream_add_data",
        constants$744.g_memory_input_stream_add_data$FUNC
    );
    static final FunctionDescriptor g_memory_input_stream_add_bytes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_memory_input_stream_add_bytes$MH = RuntimeHelper.downcallHandle(
        "g_memory_input_stream_add_bytes",
        constants$744.g_memory_input_stream_add_bytes$FUNC
    );
    static final FunctionDescriptor g_memory_monitor_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_memory_monitor_get_type$MH = RuntimeHelper.downcallHandle(
        "g_memory_monitor_get_type",
        constants$744.g_memory_monitor_get_type$FUNC
    );
}


