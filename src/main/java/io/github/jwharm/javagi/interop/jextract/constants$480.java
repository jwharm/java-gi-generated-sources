// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$480 {

    static final FunctionDescriptor g_cclosure_new_object_swap$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cclosure_new_object_swap$MH = RuntimeHelper.downcallHandle(
        "g_cclosure_new_object_swap",
        constants$480.g_cclosure_new_object_swap$FUNC
    );
    static final FunctionDescriptor g_closure_new_object$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_new_object$MH = RuntimeHelper.downcallHandle(
        "g_closure_new_object",
        constants$480.g_closure_new_object$FUNC
    );
    static final FunctionDescriptor g_value_set_object$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_set_object$MH = RuntimeHelper.downcallHandle(
        "g_value_set_object",
        constants$480.g_value_set_object$FUNC
    );
    static final FunctionDescriptor g_value_get_object$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_get_object$MH = RuntimeHelper.downcallHandle(
        "g_value_get_object",
        constants$480.g_value_get_object$FUNC
    );
    static final FunctionDescriptor g_value_dup_object$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_dup_object$MH = RuntimeHelper.downcallHandle(
        "g_value_dup_object",
        constants$480.g_value_dup_object$FUNC
    );
    static final FunctionDescriptor g_signal_connect_object$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_connect_object$MH = RuntimeHelper.downcallHandle(
        "g_signal_connect_object",
        constants$480.g_signal_connect_object$FUNC
    );
}


