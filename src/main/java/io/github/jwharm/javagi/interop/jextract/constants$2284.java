// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2284 {

    static final FunctionDescriptor gtk_print_settings_set_orientation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_print_settings_set_orientation$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_set_orientation",
        constants$2284.gtk_print_settings_set_orientation$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_get_paper_size$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_get_paper_size$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_get_paper_size",
        constants$2284.gtk_print_settings_get_paper_size$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_set_paper_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_set_paper_size$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_set_paper_size",
        constants$2284.gtk_print_settings_set_paper_size$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_get_paper_width$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_print_settings_get_paper_width$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_get_paper_width",
        constants$2284.gtk_print_settings_get_paper_width$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_set_paper_width$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_print_settings_set_paper_width$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_set_paper_width",
        constants$2284.gtk_print_settings_set_paper_width$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_get_paper_height$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_print_settings_get_paper_height$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_get_paper_height",
        constants$2284.gtk_print_settings_get_paper_height$FUNC
    );
}


