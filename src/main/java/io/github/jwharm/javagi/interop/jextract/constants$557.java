// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$557 {

    static final FunctionDescriptor g_buffered_output_stream_set_buffer_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_buffered_output_stream_set_buffer_size$MH = RuntimeHelper.downcallHandle(
        "g_buffered_output_stream_set_buffer_size",
        constants$557.g_buffered_output_stream_set_buffer_size$FUNC
    );
    static final FunctionDescriptor g_buffered_output_stream_get_auto_grow$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_buffered_output_stream_get_auto_grow$MH = RuntimeHelper.downcallHandle(
        "g_buffered_output_stream_get_auto_grow",
        constants$557.g_buffered_output_stream_get_auto_grow$FUNC
    );
    static final FunctionDescriptor g_buffered_output_stream_set_auto_grow$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_buffered_output_stream_set_auto_grow$MH = RuntimeHelper.downcallHandle(
        "g_buffered_output_stream_set_auto_grow",
        constants$557.g_buffered_output_stream_set_auto_grow$FUNC
    );
    static final FunctionDescriptor g_bytes_icon_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_bytes_icon_get_type$MH = RuntimeHelper.downcallHandle(
        "g_bytes_icon_get_type",
        constants$557.g_bytes_icon_get_type$FUNC
    );
    static final FunctionDescriptor g_bytes_icon_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bytes_icon_new$MH = RuntimeHelper.downcallHandle(
        "g_bytes_icon_new",
        constants$557.g_bytes_icon_new$FUNC
    );
    static final FunctionDescriptor g_bytes_icon_get_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bytes_icon_get_bytes$MH = RuntimeHelper.downcallHandle(
        "g_bytes_icon_get_bytes",
        constants$557.g_bytes_icon_get_bytes$FUNC
    );
}


