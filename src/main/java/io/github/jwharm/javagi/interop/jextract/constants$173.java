// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$173 {

    static final FunctionDescriptor g_source_set_dispose_function$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_set_dispose_function$MH = RuntimeHelper.downcallHandle(
        "g_source_set_dispose_function",
        constants$173.g_source_set_dispose_function$FUNC
    );
    static final FunctionDescriptor g_source_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_ref$MH = RuntimeHelper.downcallHandle(
        "g_source_ref",
        constants$173.g_source_ref$FUNC
    );
    static final FunctionDescriptor g_source_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_unref$MH = RuntimeHelper.downcallHandle(
        "g_source_unref",
        constants$173.g_source_unref$FUNC
    );
    static final FunctionDescriptor g_source_attach$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_attach$MH = RuntimeHelper.downcallHandle(
        "g_source_attach",
        constants$173.g_source_attach$FUNC
    );
    static final FunctionDescriptor g_source_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_destroy$MH = RuntimeHelper.downcallHandle(
        "g_source_destroy",
        constants$173.g_source_destroy$FUNC
    );
    static final FunctionDescriptor g_source_set_priority$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_source_set_priority$MH = RuntimeHelper.downcallHandle(
        "g_source_set_priority",
        constants$173.g_source_set_priority$FUNC
    );
}


