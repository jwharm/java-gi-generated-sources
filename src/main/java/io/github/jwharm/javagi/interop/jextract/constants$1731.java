// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1731 {

    static final FunctionDescriptor gtk_widget_set_margin_top$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_set_margin_top$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_margin_top",
        constants$1731.gtk_widget_set_margin_top$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_margin_bottom$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_margin_bottom$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_margin_bottom",
        constants$1731.gtk_widget_get_margin_bottom$FUNC
    );
    static final FunctionDescriptor gtk_widget_set_margin_bottom$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_set_margin_bottom$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_margin_bottom",
        constants$1731.gtk_widget_set_margin_bottom$FUNC
    );
    static final FunctionDescriptor gtk_widget_is_ancestor$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_is_ancestor$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_is_ancestor",
        constants$1731.gtk_widget_is_ancestor$FUNC
    );
    static final FunctionDescriptor gtk_widget_translate_coordinates$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_translate_coordinates$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_translate_coordinates",
        constants$1731.gtk_widget_translate_coordinates$FUNC
    );
    static final FunctionDescriptor gtk_widget_contains$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_widget_contains$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_contains",
        constants$1731.gtk_widget_contains$FUNC
    );
}


