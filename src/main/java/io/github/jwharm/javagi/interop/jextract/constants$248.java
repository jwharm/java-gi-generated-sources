// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$248 {

    static final FunctionDescriptor g_log_writer_supports_color$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_log_writer_supports_color$MH = RuntimeHelper.downcallHandle(
        "g_log_writer_supports_color",
        constants$248.g_log_writer_supports_color$FUNC
    );
    static final FunctionDescriptor g_log_writer_is_journald$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_log_writer_is_journald$MH = RuntimeHelper.downcallHandle(
        "g_log_writer_is_journald",
        constants$248.g_log_writer_is_journald$FUNC
    );
    static final FunctionDescriptor g_log_writer_format_fields$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_log_writer_format_fields$MH = RuntimeHelper.downcallHandle(
        "g_log_writer_format_fields",
        constants$248.g_log_writer_format_fields$FUNC
    );
    static final FunctionDescriptor g_log_writer_journald$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_log_writer_journald$MH = RuntimeHelper.downcallHandle(
        "g_log_writer_journald",
        constants$248.g_log_writer_journald$FUNC
    );
    static final FunctionDescriptor g_log_writer_standard_streams$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_log_writer_standard_streams$MH = RuntimeHelper.downcallHandle(
        "g_log_writer_standard_streams",
        constants$248.g_log_writer_standard_streams$FUNC
    );
    static final FunctionDescriptor g_log_writer_default$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_log_writer_default$MH = RuntimeHelper.downcallHandle(
        "g_log_writer_default",
        constants$248.g_log_writer_default$FUNC
    );
}


