// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1772 {

    static final FunctionDescriptor gtk_actionable_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_actionable_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_actionable_get_type",
        constants$1772.gtk_actionable_get_type$FUNC
    );
    static final FunctionDescriptor gtk_actionable_get_action_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_actionable_get_action_name$MH = RuntimeHelper.downcallHandle(
        "gtk_actionable_get_action_name",
        constants$1772.gtk_actionable_get_action_name$FUNC
    );
    static final FunctionDescriptor gtk_actionable_set_action_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_actionable_set_action_name$MH = RuntimeHelper.downcallHandle(
        "gtk_actionable_set_action_name",
        constants$1772.gtk_actionable_set_action_name$FUNC
    );
    static final FunctionDescriptor gtk_actionable_get_action_target_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_actionable_get_action_target_value$MH = RuntimeHelper.downcallHandle(
        "gtk_actionable_get_action_target_value",
        constants$1772.gtk_actionable_get_action_target_value$FUNC
    );
    static final FunctionDescriptor gtk_actionable_set_action_target_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_actionable_set_action_target_value$MH = RuntimeHelper.downcallHandle(
        "gtk_actionable_set_action_target_value",
        constants$1772.gtk_actionable_set_action_target_value$FUNC
    );
    static final FunctionDescriptor gtk_actionable_set_action_target$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_actionable_set_action_target$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_actionable_set_action_target",
        constants$1772.gtk_actionable_set_action_target$FUNC
    );
}


