// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$202 {

    static final FunctionDescriptor g_io_add_watch_full$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_add_watch_full$MH = RuntimeHelper.downcallHandle(
        "g_io_add_watch_full",
        constants$202.g_io_add_watch_full$FUNC
    );
    static final FunctionDescriptor g_io_create_watch$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_io_create_watch$MH = RuntimeHelper.downcallHandle(
        "g_io_create_watch",
        constants$202.g_io_create_watch$FUNC
    );
    static final FunctionDescriptor g_io_add_watch$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_add_watch$MH = RuntimeHelper.downcallHandle(
        "g_io_add_watch",
        constants$202.g_io_add_watch$FUNC
    );
    static final FunctionDescriptor g_io_channel_set_buffer_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_io_channel_set_buffer_size$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_set_buffer_size",
        constants$202.g_io_channel_set_buffer_size$FUNC
    );
    static final FunctionDescriptor g_io_channel_get_buffer_size$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_get_buffer_size$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_get_buffer_size",
        constants$202.g_io_channel_get_buffer_size$FUNC
    );
    static final FunctionDescriptor g_io_channel_get_buffer_condition$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_get_buffer_condition$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_get_buffer_condition",
        constants$202.g_io_channel_get_buffer_condition$FUNC
    );
}


