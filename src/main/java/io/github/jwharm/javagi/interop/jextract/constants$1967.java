// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1967 {

    static final FunctionDescriptor gtk_tree_view_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_tree_view_new$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_new",
        constants$1967.gtk_tree_view_new$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_new_with_model$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_new_with_model$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_new_with_model",
        constants$1967.gtk_tree_view_new_with_model$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_get_model$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_model$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_model",
        constants$1967.gtk_tree_view_get_model$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_set_model$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_set_model$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_set_model",
        constants$1967.gtk_tree_view_set_model$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_get_selection$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_selection$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_selection",
        constants$1967.gtk_tree_view_get_selection$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_get_headers_visible$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_headers_visible$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_headers_visible",
        constants$1967.gtk_tree_view_get_headers_visible$FUNC
    );
}


