// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2292 {

    static final FunctionDescriptor gtk_print_settings_to_gvariant$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_to_gvariant$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_to_gvariant",
        constants$2292.gtk_print_settings_to_gvariant$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_new_from_gvariant$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_new_from_gvariant$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_new_from_gvariant",
        constants$2292.gtk_print_settings_new_from_gvariant$FUNC
    );
    static final FunctionDescriptor gtk_print_operation_preview_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_print_operation_preview_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_preview_get_type",
        constants$2292.gtk_print_operation_preview_get_type$FUNC
    );
    static final FunctionDescriptor gtk_print_operation_preview_render_page$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_print_operation_preview_render_page$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_preview_render_page",
        constants$2292.gtk_print_operation_preview_render_page$FUNC
    );
    static final FunctionDescriptor gtk_print_operation_preview_end_preview$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_operation_preview_end_preview$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_preview_end_preview",
        constants$2292.gtk_print_operation_preview_end_preview$FUNC
    );
    static final FunctionDescriptor gtk_print_operation_preview_is_selected$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_print_operation_preview_is_selected$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_preview_is_selected",
        constants$2292.gtk_print_operation_preview_is_selected$FUNC
    );
}


