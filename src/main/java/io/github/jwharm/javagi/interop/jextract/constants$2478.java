// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2478 {

    static final FunctionDescriptor GtkTreeSelectionFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTreeSelectionFunc$MH = RuntimeHelper.downcallHandle(
        constants$2478.GtkTreeSelectionFunc$FUNC
    );
    static final FunctionDescriptor GtkTreeSelectionForeachFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTreeSelectionForeachFunc$MH = RuntimeHelper.downcallHandle(
        constants$2478.GtkTreeSelectionForeachFunc$FUNC
    );
    static final FunctionDescriptor gtk_tree_selection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_tree_selection_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_get_type",
        constants$2478.gtk_tree_selection_get_type$FUNC
    );
    static final FunctionDescriptor gtk_tree_selection_set_mode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_set_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_set_mode",
        constants$2478.gtk_tree_selection_set_mode$FUNC
    );
    static final FunctionDescriptor gtk_tree_selection_get_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_get_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_get_mode",
        constants$2478.gtk_tree_selection_get_mode$FUNC
    );
}


