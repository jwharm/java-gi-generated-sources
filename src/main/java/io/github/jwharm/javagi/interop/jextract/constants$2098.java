// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2098 {

    static final FunctionDescriptor gtk_flow_box_set_vadjustment$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_flow_box_set_vadjustment$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_set_vadjustment",
        constants$2098.gtk_flow_box_set_vadjustment$FUNC
    );
    static final FunctionDescriptor GtkFlowBoxFilterFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkFlowBoxFilterFunc$MH = RuntimeHelper.downcallHandle(
        constants$2098.GtkFlowBoxFilterFunc$FUNC
    );
    static final FunctionDescriptor gtk_flow_box_set_filter_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_flow_box_set_filter_func$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_set_filter_func",
        constants$2098.gtk_flow_box_set_filter_func$FUNC
    );
    static final FunctionDescriptor gtk_flow_box_invalidate_filter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_flow_box_invalidate_filter$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_invalidate_filter",
        constants$2098.gtk_flow_box_invalidate_filter$FUNC
    );
    static final FunctionDescriptor GtkFlowBoxSortFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


