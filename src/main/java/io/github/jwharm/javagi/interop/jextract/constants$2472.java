// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2472 {

    static final FunctionDescriptor GTK_IS_TREE_EXPANDER$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTK_IS_TREE_EXPANDER$MH = RuntimeHelper.downcallHandle(
        "GTK_IS_TREE_EXPANDER",
        constants$2472.GTK_IS_TREE_EXPANDER$FUNC
    );
    static final FunctionDescriptor gtk_tree_expander_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_tree_expander_new$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_expander_new",
        constants$2472.gtk_tree_expander_new$FUNC
    );
    static final FunctionDescriptor gtk_tree_expander_get_child$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_expander_get_child$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_expander_get_child",
        constants$2472.gtk_tree_expander_get_child$FUNC
    );
    static final FunctionDescriptor gtk_tree_expander_set_child$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_expander_set_child$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_expander_set_child",
        constants$2472.gtk_tree_expander_set_child$FUNC
    );
    static final FunctionDescriptor gtk_tree_expander_get_item$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_expander_get_item$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_expander_get_item",
        constants$2472.gtk_tree_expander_get_item$FUNC
    );
    static final FunctionDescriptor gtk_tree_expander_get_list_row$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_expander_get_list_row$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_expander_get_list_row",
        constants$2472.gtk_tree_expander_get_list_row$FUNC
    );
}


