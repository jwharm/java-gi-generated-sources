// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$457 {

    static final FunctionDescriptor g_signal_is_valid_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_is_valid_name$MH = RuntimeHelper.downcallHandle(
        "g_signal_is_valid_name",
        constants$457.g_signal_is_valid_name$FUNC
    );
    static final FunctionDescriptor g_signal_parse_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_parse_name$MH = RuntimeHelper.downcallHandle(
        "g_signal_parse_name",
        constants$457.g_signal_parse_name$FUNC
    );
    static final FunctionDescriptor g_signal_get_invocation_hint$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_get_invocation_hint$MH = RuntimeHelper.downcallHandle(
        "g_signal_get_invocation_hint",
        constants$457.g_signal_get_invocation_hint$FUNC
    );
    static final FunctionDescriptor g_signal_stop_emission$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_stop_emission$MH = RuntimeHelper.downcallHandle(
        "g_signal_stop_emission",
        constants$457.g_signal_stop_emission$FUNC
    );
    static final FunctionDescriptor g_signal_stop_emission_by_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_stop_emission_by_name$MH = RuntimeHelper.downcallHandle(
        "g_signal_stop_emission_by_name",
        constants$457.g_signal_stop_emission_by_name$FUNC
    );
    static final FunctionDescriptor g_signal_add_emission_hook$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_add_emission_hook$MH = RuntimeHelper.downcallHandle(
        "g_signal_add_emission_hook",
        constants$457.g_signal_add_emission_hook$FUNC
    );
}


