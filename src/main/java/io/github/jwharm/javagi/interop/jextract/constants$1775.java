// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1775 {

    static final FunctionDescriptor gtk_adjustment_clamp_page$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_adjustment_clamp_page$MH = RuntimeHelper.downcallHandle(
        "gtk_adjustment_clamp_page",
        constants$1775.gtk_adjustment_clamp_page$FUNC
    );
    static final FunctionDescriptor gtk_adjustment_get_value$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_adjustment_get_value$MH = RuntimeHelper.downcallHandle(
        "gtk_adjustment_get_value",
        constants$1775.gtk_adjustment_get_value$FUNC
    );
    static final FunctionDescriptor gtk_adjustment_set_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_adjustment_set_value$MH = RuntimeHelper.downcallHandle(
        "gtk_adjustment_set_value",
        constants$1775.gtk_adjustment_set_value$FUNC
    );
    static final FunctionDescriptor gtk_adjustment_get_lower$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_adjustment_get_lower$MH = RuntimeHelper.downcallHandle(
        "gtk_adjustment_get_lower",
        constants$1775.gtk_adjustment_get_lower$FUNC
    );
    static final FunctionDescriptor gtk_adjustment_set_lower$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_adjustment_set_lower$MH = RuntimeHelper.downcallHandle(
        "gtk_adjustment_set_lower",
        constants$1775.gtk_adjustment_set_lower$FUNC
    );
    static final FunctionDescriptor gtk_adjustment_get_upper$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_adjustment_get_upper$MH = RuntimeHelper.downcallHandle(
        "gtk_adjustment_get_upper",
        constants$1775.gtk_adjustment_get_upper$FUNC
    );
}


