// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1978 {

    static final FunctionDescriptor gtk_tree_view_convert_bin_window_to_tree_coords$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_convert_bin_window_to_tree_coords$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_convert_bin_window_to_tree_coords",
        constants$1978.gtk_tree_view_convert_bin_window_to_tree_coords$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_set_fixed_height_mode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_set_fixed_height_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_set_fixed_height_mode",
        constants$1978.gtk_tree_view_set_fixed_height_mode$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_get_fixed_height_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_fixed_height_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_fixed_height_mode",
        constants$1978.gtk_tree_view_get_fixed_height_mode$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_set_hover_selection$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_set_hover_selection$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_set_hover_selection",
        constants$1978.gtk_tree_view_set_hover_selection$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_get_hover_selection$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_hover_selection$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_hover_selection",
        constants$1978.gtk_tree_view_get_hover_selection$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_set_hover_expand$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_set_hover_expand$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_set_hover_expand",
        constants$1978.gtk_tree_view_set_hover_expand$FUNC
    );
}


