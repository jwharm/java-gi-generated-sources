// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$253 {

    static final FunctionDescriptor g_option_context_get_summary$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_get_summary$MH = RuntimeHelper.downcallHandle(
        "g_option_context_get_summary",
        constants$253.g_option_context_get_summary$FUNC
    );
    static final FunctionDescriptor g_option_context_set_description$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_set_description$MH = RuntimeHelper.downcallHandle(
        "g_option_context_set_description",
        constants$253.g_option_context_set_description$FUNC
    );
    static final FunctionDescriptor g_option_context_get_description$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_get_description$MH = RuntimeHelper.downcallHandle(
        "g_option_context_get_description",
        constants$253.g_option_context_get_description$FUNC
    );
    static final FunctionDescriptor g_option_context_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_free$MH = RuntimeHelper.downcallHandle(
        "g_option_context_free",
        constants$253.g_option_context_free$FUNC
    );
    static final FunctionDescriptor g_option_context_set_help_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_option_context_set_help_enabled$MH = RuntimeHelper.downcallHandle(
        "g_option_context_set_help_enabled",
        constants$253.g_option_context_set_help_enabled$FUNC
    );
    static final FunctionDescriptor g_option_context_get_help_enabled$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_get_help_enabled$MH = RuntimeHelper.downcallHandle(
        "g_option_context_get_help_enabled",
        constants$253.g_option_context_get_help_enabled$FUNC
    );
}


