// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1774 {

    static final FunctionDescriptor gtk_action_bar_pack_end$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_action_bar_pack_end$MH = RuntimeHelper.downcallHandle(
        "gtk_action_bar_pack_end",
        constants$1774.gtk_action_bar_pack_end$FUNC
    );
    static final FunctionDescriptor gtk_action_bar_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_action_bar_remove$MH = RuntimeHelper.downcallHandle(
        "gtk_action_bar_remove",
        constants$1774.gtk_action_bar_remove$FUNC
    );
    static final FunctionDescriptor gtk_action_bar_set_revealed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_action_bar_set_revealed$MH = RuntimeHelper.downcallHandle(
        "gtk_action_bar_set_revealed",
        constants$1774.gtk_action_bar_set_revealed$FUNC
    );
    static final FunctionDescriptor gtk_action_bar_get_revealed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_action_bar_get_revealed$MH = RuntimeHelper.downcallHandle(
        "gtk_action_bar_get_revealed",
        constants$1774.gtk_action_bar_get_revealed$FUNC
    );
    static final FunctionDescriptor gtk_adjustment_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_adjustment_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_adjustment_get_type",
        constants$1774.gtk_adjustment_get_type$FUNC
    );
    static final FunctionDescriptor gtk_adjustment_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_adjustment_new$MH = RuntimeHelper.downcallHandle(
        "gtk_adjustment_new",
        constants$1774.gtk_adjustment_new$FUNC
    );
}


