// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1664 {

    static final FunctionDescriptor gsk_cairo_node_get_draw_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gsk_cairo_node_get_draw_context$MH = RuntimeHelper.downcallHandle(
        "gsk_cairo_node_get_draw_context",
        constants$1664.gsk_cairo_node_get_draw_context$FUNC
    );
    static final FunctionDescriptor gsk_cairo_node_get_surface$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gsk_cairo_node_get_surface$MH = RuntimeHelper.downcallHandle(
        "gsk_cairo_node_get_surface",
        constants$1664.gsk_cairo_node_get_surface$FUNC
    );
    static final FunctionDescriptor gsk_container_node_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gsk_container_node_get_type$MH = RuntimeHelper.downcallHandle(
        "gsk_container_node_get_type",
        constants$1664.gsk_container_node_get_type$FUNC
    );
    static final FunctionDescriptor gsk_container_node_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gsk_container_node_new$MH = RuntimeHelper.downcallHandle(
        "gsk_container_node_new",
        constants$1664.gsk_container_node_new$FUNC
    );
    static final FunctionDescriptor gsk_container_node_get_n_children$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gsk_container_node_get_n_children$MH = RuntimeHelper.downcallHandle(
        "gsk_container_node_get_n_children",
        constants$1664.gsk_container_node_get_n_children$FUNC
    );
    static final FunctionDescriptor gsk_container_node_get_child$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gsk_container_node_get_child$MH = RuntimeHelper.downcallHandle(
        "gsk_container_node_get_child",
        constants$1664.gsk_container_node_get_child$FUNC
    );
}


