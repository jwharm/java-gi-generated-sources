// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1654 {

    static final FunctionDescriptor gsk_render_node_deserialize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gsk_render_node_deserialize$MH = RuntimeHelper.downcallHandle(
        "gsk_render_node_deserialize",
        constants$1654.gsk_render_node_deserialize$FUNC
    );
    static final FunctionDescriptor gsk_debug_node_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gsk_debug_node_get_type$MH = RuntimeHelper.downcallHandle(
        "gsk_debug_node_get_type",
        constants$1654.gsk_debug_node_get_type$FUNC
    );
    static final FunctionDescriptor gsk_debug_node_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gsk_debug_node_new$MH = RuntimeHelper.downcallHandle(
        "gsk_debug_node_new",
        constants$1654.gsk_debug_node_new$FUNC
    );
    static final FunctionDescriptor gsk_debug_node_get_child$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gsk_debug_node_get_child$MH = RuntimeHelper.downcallHandle(
        "gsk_debug_node_get_child",
        constants$1654.gsk_debug_node_get_child$FUNC
    );
    static final FunctionDescriptor gsk_debug_node_get_message$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gsk_debug_node_get_message$MH = RuntimeHelper.downcallHandle(
        "gsk_debug_node_get_message",
        constants$1654.gsk_debug_node_get_message$FUNC
    );
    static final FunctionDescriptor gsk_color_node_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gsk_color_node_get_type$MH = RuntimeHelper.downcallHandle(
        "gsk_color_node_get_type",
        constants$1654.gsk_color_node_get_type$FUNC
    );
}


