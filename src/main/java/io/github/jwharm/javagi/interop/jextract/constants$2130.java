// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2130 {

    static final FunctionDescriptor GTK_IS_GRID_LAYOUT_CHILD$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTK_IS_GRID_LAYOUT_CHILD$MH = RuntimeHelper.downcallHandle(
        "GTK_IS_GRID_LAYOUT_CHILD",
        constants$2130.GTK_IS_GRID_LAYOUT_CHILD$FUNC
    );
    static final FunctionDescriptor gtk_grid_layout_child_set_row$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_layout_child_set_row$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_layout_child_set_row",
        constants$2130.gtk_grid_layout_child_set_row$FUNC
    );
    static final FunctionDescriptor gtk_grid_layout_child_get_row$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_grid_layout_child_get_row$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_layout_child_get_row",
        constants$2130.gtk_grid_layout_child_get_row$FUNC
    );
    static final FunctionDescriptor gtk_grid_layout_child_set_column$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_layout_child_set_column$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_layout_child_set_column",
        constants$2130.gtk_grid_layout_child_set_column$FUNC
    );
    static final FunctionDescriptor gtk_grid_layout_child_get_column$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_grid_layout_child_get_column$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_layout_child_get_column",
        constants$2130.gtk_grid_layout_child_get_column$FUNC
    );
    static final FunctionDescriptor gtk_grid_layout_child_set_column_span$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_layout_child_set_column_span$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_layout_child_set_column_span",
        constants$2130.gtk_grid_layout_child_set_column_span$FUNC
    );
}


