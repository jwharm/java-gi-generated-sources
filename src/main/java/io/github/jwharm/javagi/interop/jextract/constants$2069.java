// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2069 {

    static final FunctionDescriptor gtk_file_filter_get_attributes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_filter_get_attributes$MH = RuntimeHelper.downcallHandle(
        "gtk_file_filter_get_attributes",
        constants$2069.gtk_file_filter_get_attributes$FUNC
    );
    static final FunctionDescriptor gtk_file_filter_to_gvariant$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_filter_to_gvariant$MH = RuntimeHelper.downcallHandle(
        "gtk_file_filter_to_gvariant",
        constants$2069.gtk_file_filter_to_gvariant$FUNC
    );
    static final FunctionDescriptor gtk_file_filter_new_from_gvariant$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_filter_new_from_gvariant$MH = RuntimeHelper.downcallHandle(
        "gtk_file_filter_new_from_gvariant",
        constants$2069.gtk_file_filter_new_from_gvariant$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_file_chooser_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_get_type",
        constants$2069.gtk_file_chooser_get_type$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gtk_file_chooser_error_quark$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_error_quark",
        constants$2069.gtk_file_chooser_error_quark$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_set_action$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_set_action$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_set_action",
        constants$2069.gtk_file_chooser_set_action$FUNC
    );
}


