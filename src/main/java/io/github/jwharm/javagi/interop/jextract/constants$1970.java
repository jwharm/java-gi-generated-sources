// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1970 {

    static final FunctionDescriptor gtk_tree_view_get_column$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_column$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_column",
        constants$1970.gtk_tree_view_get_column$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_get_columns$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_columns$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_columns",
        constants$1970.gtk_tree_view_get_columns$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_move_column_after$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_move_column_after$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_move_column_after",
        constants$1970.gtk_tree_view_move_column_after$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_set_expander_column$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_set_expander_column$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_set_expander_column",
        constants$1970.gtk_tree_view_set_expander_column$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_get_expander_column$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_expander_column$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_expander_column",
        constants$1970.gtk_tree_view_get_expander_column$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_set_column_drag_function$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_set_column_drag_function$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_set_column_drag_function",
        constants$1970.gtk_tree_view_set_column_drag_function$FUNC
    );
}


