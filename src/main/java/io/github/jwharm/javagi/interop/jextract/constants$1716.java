// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1716 {

    static final FunctionDescriptor gtk_widget_get_layout_manager$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_layout_manager$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_layout_manager",
        constants$1716.gtk_widget_get_layout_manager$FUNC
    );
    static final FunctionDescriptor gtk_widget_class_set_layout_manager_type$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gtk_widget_class_set_layout_manager_type$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_class_set_layout_manager_type",
        constants$1716.gtk_widget_class_set_layout_manager_type$FUNC
    );
    static final FunctionDescriptor gtk_widget_class_get_layout_manager_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_class_get_layout_manager_type$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_class_get_layout_manager_type",
        constants$1716.gtk_widget_class_get_layout_manager_type$FUNC
    );
    static final FunctionDescriptor gtk_widget_class_add_binding$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_class_add_binding$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_widget_class_add_binding",
        constants$1716.gtk_widget_class_add_binding$FUNC
    );
    static final FunctionDescriptor gtk_widget_class_add_binding_signal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_class_add_binding_signal$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_widget_class_add_binding_signal",
        constants$1716.gtk_widget_class_add_binding_signal$FUNC
    );
    static final FunctionDescriptor gtk_widget_class_add_binding_action$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_class_add_binding_action$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_widget_class_add_binding_action",
        constants$1716.gtk_widget_class_add_binding_action$FUNC
    );
}


