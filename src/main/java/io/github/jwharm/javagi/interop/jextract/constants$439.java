// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$439 {

    static final FunctionDescriptor g_value_set_param$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_set_param$MH = RuntimeHelper.downcallHandle(
        "g_value_set_param",
        constants$439.g_value_set_param$FUNC
    );
    static final FunctionDescriptor g_value_get_param$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_get_param$MH = RuntimeHelper.downcallHandle(
        "g_value_get_param",
        constants$439.g_value_get_param$FUNC
    );
    static final FunctionDescriptor g_value_dup_param$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_dup_param$MH = RuntimeHelper.downcallHandle(
        "g_value_dup_param",
        constants$439.g_value_dup_param$FUNC
    );
    static final FunctionDescriptor g_value_take_param$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_take_param$MH = RuntimeHelper.downcallHandle(
        "g_value_take_param",
        constants$439.g_value_take_param$FUNC
    );
    static final FunctionDescriptor g_value_set_param_take_ownership$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_set_param_take_ownership$MH = RuntimeHelper.downcallHandle(
        "g_value_set_param_take_ownership",
        constants$439.g_value_set_param_take_ownership$FUNC
    );
    static final FunctionDescriptor g_param_spec_get_default_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_param_spec_get_default_value$MH = RuntimeHelper.downcallHandle(
        "g_param_spec_get_default_value",
        constants$439.g_param_spec_get_default_value$FUNC
    );
}


