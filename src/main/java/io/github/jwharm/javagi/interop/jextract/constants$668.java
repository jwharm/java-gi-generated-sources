// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$668 {

    static final FunctionDescriptor g_file_read$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_read$MH = RuntimeHelper.downcallHandle(
        "g_file_read",
        constants$668.g_file_read$FUNC
    );
    static final FunctionDescriptor g_file_read_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_read_async$MH = RuntimeHelper.downcallHandle(
        "g_file_read_async",
        constants$668.g_file_read_async$FUNC
    );
    static final FunctionDescriptor g_file_read_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_read_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_read_finish",
        constants$668.g_file_read_finish$FUNC
    );
    static final FunctionDescriptor g_file_append_to$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_append_to$MH = RuntimeHelper.downcallHandle(
        "g_file_append_to",
        constants$668.g_file_append_to$FUNC
    );
    static final FunctionDescriptor g_file_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_create$MH = RuntimeHelper.downcallHandle(
        "g_file_create",
        constants$668.g_file_create$FUNC
    );
    static final FunctionDescriptor g_file_replace$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_replace$MH = RuntimeHelper.downcallHandle(
        "g_file_replace",
        constants$668.g_file_replace$FUNC
    );
}


