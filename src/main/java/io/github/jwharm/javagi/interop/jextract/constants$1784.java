// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1784 {

    static final FunctionDescriptor gtk_app_chooser_widget_get_show_all$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_app_chooser_widget_get_show_all$MH = RuntimeHelper.downcallHandle(
        "gtk_app_chooser_widget_get_show_all",
        constants$1784.gtk_app_chooser_widget_get_show_all$FUNC
    );
    static final FunctionDescriptor gtk_app_chooser_widget_set_default_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_app_chooser_widget_set_default_text$MH = RuntimeHelper.downcallHandle(
        "gtk_app_chooser_widget_set_default_text",
        constants$1784.gtk_app_chooser_widget_set_default_text$FUNC
    );
    static final FunctionDescriptor gtk_app_chooser_widget_get_default_text$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_app_chooser_widget_get_default_text$MH = RuntimeHelper.downcallHandle(
        "gtk_app_chooser_widget_get_default_text",
        constants$1784.gtk_app_chooser_widget_get_default_text$FUNC
    );
    static final FunctionDescriptor gtk_app_chooser_button_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_app_chooser_button_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_app_chooser_button_get_type",
        constants$1784.gtk_app_chooser_button_get_type$FUNC
    );
    static final FunctionDescriptor gtk_app_chooser_button_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_app_chooser_button_new$MH = RuntimeHelper.downcallHandle(
        "gtk_app_chooser_button_new",
        constants$1784.gtk_app_chooser_button_new$FUNC
    );
    static final FunctionDescriptor gtk_app_chooser_button_append_separator$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_app_chooser_button_append_separator$MH = RuntimeHelper.downcallHandle(
        "gtk_app_chooser_button_append_separator",
        constants$1784.gtk_app_chooser_button_append_separator$FUNC
    );
}


