// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1717 {

    static final FunctionDescriptor gtk_widget_class_add_shortcut$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_class_add_shortcut$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_class_add_shortcut",
        constants$1717.gtk_widget_class_add_shortcut$FUNC
    );
    static final FunctionDescriptor gtk_widget_class_set_activate_signal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_class_set_activate_signal$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_class_set_activate_signal",
        constants$1717.gtk_widget_class_set_activate_signal$FUNC
    );
    static final FunctionDescriptor gtk_widget_class_set_activate_signal_from_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_class_set_activate_signal_from_name$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_class_set_activate_signal_from_name",
        constants$1717.gtk_widget_class_set_activate_signal_from_name$FUNC
    );
    static final FunctionDescriptor gtk_widget_class_get_activate_signal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_class_get_activate_signal$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_class_get_activate_signal",
        constants$1717.gtk_widget_class_get_activate_signal$FUNC
    );
    static final FunctionDescriptor gtk_widget_mnemonic_activate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_mnemonic_activate$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_mnemonic_activate",
        constants$1717.gtk_widget_mnemonic_activate$FUNC
    );
    static final FunctionDescriptor gtk_widget_activate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_activate$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_activate",
        constants$1717.gtk_widget_activate$FUNC
    );
}


