// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2067 {

    static final FunctionDescriptor GTK_FIXED_LAYOUT_CHILD$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTK_FIXED_LAYOUT_CHILD$MH = RuntimeHelper.downcallHandle(
        "GTK_FIXED_LAYOUT_CHILD",
        constants$2067.GTK_FIXED_LAYOUT_CHILD$FUNC
    );
    static final FunctionDescriptor GTK_IS_FIXED_LAYOUT_CHILD$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTK_IS_FIXED_LAYOUT_CHILD$MH = RuntimeHelper.downcallHandle(
        "GTK_IS_FIXED_LAYOUT_CHILD",
        constants$2067.GTK_IS_FIXED_LAYOUT_CHILD$FUNC
    );
    static final FunctionDescriptor gtk_fixed_layout_child_set_transform$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_fixed_layout_child_set_transform$MH = RuntimeHelper.downcallHandle(
        "gtk_fixed_layout_child_set_transform",
        constants$2067.gtk_fixed_layout_child_set_transform$FUNC
    );
    static final FunctionDescriptor gtk_fixed_layout_child_get_transform$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_fixed_layout_child_get_transform$MH = RuntimeHelper.downcallHandle(
        "gtk_fixed_layout_child_get_transform",
        constants$2067.gtk_fixed_layout_child_get_transform$FUNC
    );
    static final FunctionDescriptor gtk_file_filter_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_file_filter_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_file_filter_get_type",
        constants$2067.gtk_file_filter_get_type$FUNC
    );
    static final FunctionDescriptor gtk_file_filter_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_file_filter_new$MH = RuntimeHelper.downcallHandle(
        "gtk_file_filter_new",
        constants$2067.gtk_file_filter_new$FUNC
    );
}


