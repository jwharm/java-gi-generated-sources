// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1871 {

    static final FunctionDescriptor gtk_cell_area_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_foreach$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_foreach",
        constants$1871.gtk_cell_area_foreach$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_foreach_alloc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_foreach_alloc$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_foreach_alloc",
        constants$1871.gtk_cell_area_foreach_alloc$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_event$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_cell_area_event$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_event",
        constants$1871.gtk_cell_area_event$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_snapshot$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_cell_area_snapshot$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_snapshot",
        constants$1871.gtk_cell_area_snapshot$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_get_cell_allocation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_get_cell_allocation$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_get_cell_allocation",
        constants$1871.gtk_cell_area_get_cell_allocation$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_get_cell_at_position$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_get_cell_at_position$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_get_cell_at_position",
        constants$1871.gtk_cell_area_get_cell_at_position$FUNC
    );
}


