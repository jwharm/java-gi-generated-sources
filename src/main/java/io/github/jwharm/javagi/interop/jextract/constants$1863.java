// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1863 {

    static final FunctionDescriptor gtk_tree_row_reference_new_proxy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_row_reference_new_proxy$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_row_reference_new_proxy",
        constants$1863.gtk_tree_row_reference_new_proxy$FUNC
    );
    static final FunctionDescriptor gtk_tree_row_reference_get_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_row_reference_get_path$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_row_reference_get_path",
        constants$1863.gtk_tree_row_reference_get_path$FUNC
    );
    static final FunctionDescriptor gtk_tree_row_reference_get_model$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_row_reference_get_model$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_row_reference_get_model",
        constants$1863.gtk_tree_row_reference_get_model$FUNC
    );
    static final FunctionDescriptor gtk_tree_row_reference_valid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_row_reference_valid$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_row_reference_valid",
        constants$1863.gtk_tree_row_reference_valid$FUNC
    );
    static final FunctionDescriptor gtk_tree_row_reference_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_row_reference_copy$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_row_reference_copy",
        constants$1863.gtk_tree_row_reference_copy$FUNC
    );
    static final FunctionDescriptor gtk_tree_row_reference_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_row_reference_free$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_row_reference_free",
        constants$1863.gtk_tree_row_reference_free$FUNC
    );
}


