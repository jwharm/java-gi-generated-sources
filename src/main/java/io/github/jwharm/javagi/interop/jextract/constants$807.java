// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$807 {

    static final FunctionDescriptor g_simple_action_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_action_new$MH = RuntimeHelper.downcallHandle(
        "g_simple_action_new",
        constants$807.g_simple_action_new$FUNC
    );
    static final FunctionDescriptor g_simple_action_new_stateful$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_action_new_stateful$MH = RuntimeHelper.downcallHandle(
        "g_simple_action_new_stateful",
        constants$807.g_simple_action_new_stateful$FUNC
    );
    static final FunctionDescriptor g_simple_action_set_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_simple_action_set_enabled$MH = RuntimeHelper.downcallHandle(
        "g_simple_action_set_enabled",
        constants$807.g_simple_action_set_enabled$FUNC
    );
    static final FunctionDescriptor g_simple_action_set_state$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_action_set_state$MH = RuntimeHelper.downcallHandle(
        "g_simple_action_set_state",
        constants$807.g_simple_action_set_state$FUNC
    );
    static final FunctionDescriptor g_simple_action_set_state_hint$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_action_set_state_hint$MH = RuntimeHelper.downcallHandle(
        "g_simple_action_set_state_hint",
        constants$807.g_simple_action_set_state_hint$FUNC
    );
    static final FunctionDescriptor g_simple_action_group_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_simple_action_group_get_type$MH = RuntimeHelper.downcallHandle(
        "g_simple_action_group_get_type",
        constants$807.g_simple_action_group_get_type$FUNC
    );
}


