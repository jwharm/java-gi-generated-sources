// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1897 {

    static final FunctionDescriptor gtk_toggle_button_toggled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_toggle_button_toggled$MH = RuntimeHelper.downcallHandle(
        "gtk_toggle_button_toggled",
        constants$1897.gtk_toggle_button_toggled$FUNC
    );
    static final FunctionDescriptor gtk_toggle_button_set_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_toggle_button_set_group$MH = RuntimeHelper.downcallHandle(
        "gtk_toggle_button_set_group",
        constants$1897.gtk_toggle_button_set_group$FUNC
    );
    static final FunctionDescriptor gtk_check_button_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_check_button_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_check_button_get_type",
        constants$1897.gtk_check_button_get_type$FUNC
    );
    static final FunctionDescriptor gtk_check_button_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_check_button_new$MH = RuntimeHelper.downcallHandle(
        "gtk_check_button_new",
        constants$1897.gtk_check_button_new$FUNC
    );
    static final FunctionDescriptor gtk_check_button_new_with_label$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_check_button_new_with_label$MH = RuntimeHelper.downcallHandle(
        "gtk_check_button_new_with_label",
        constants$1897.gtk_check_button_new_with_label$FUNC
    );
    static final FunctionDescriptor gtk_check_button_new_with_mnemonic$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_check_button_new_with_mnemonic$MH = RuntimeHelper.downcallHandle(
        "gtk_check_button_new_with_mnemonic",
        constants$1897.gtk_check_button_new_with_mnemonic$FUNC
    );
}


