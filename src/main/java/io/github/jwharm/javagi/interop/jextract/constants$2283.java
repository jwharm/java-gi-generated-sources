// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2283 {

    static final FunctionDescriptor gtk_print_settings_get_int$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_get_int$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_get_int",
        constants$2283.gtk_print_settings_get_int$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_get_int_with_default$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_print_settings_get_int_with_default$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_get_int_with_default",
        constants$2283.gtk_print_settings_get_int_with_default$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_set_int$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_print_settings_set_int$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_set_int",
        constants$2283.gtk_print_settings_set_int$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_get_printer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_get_printer$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_get_printer",
        constants$2283.gtk_print_settings_get_printer$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_set_printer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_set_printer$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_set_printer",
        constants$2283.gtk_print_settings_set_printer$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_get_orientation$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_get_orientation$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_get_orientation",
        constants$2283.gtk_print_settings_get_orientation$FUNC
    );
}


