// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$670 {

    static final FunctionDescriptor g_file_open_readwrite$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_open_readwrite$MH = RuntimeHelper.downcallHandle(
        "g_file_open_readwrite",
        constants$670.g_file_open_readwrite$FUNC
    );
    static final FunctionDescriptor g_file_open_readwrite_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_open_readwrite_async$MH = RuntimeHelper.downcallHandle(
        "g_file_open_readwrite_async",
        constants$670.g_file_open_readwrite_async$FUNC
    );
    static final FunctionDescriptor g_file_open_readwrite_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_open_readwrite_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_open_readwrite_finish",
        constants$670.g_file_open_readwrite_finish$FUNC
    );
    static final FunctionDescriptor g_file_create_readwrite$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_create_readwrite$MH = RuntimeHelper.downcallHandle(
        "g_file_create_readwrite",
        constants$670.g_file_create_readwrite$FUNC
    );
    static final FunctionDescriptor g_file_create_readwrite_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_create_readwrite_async$MH = RuntimeHelper.downcallHandle(
        "g_file_create_readwrite_async",
        constants$670.g_file_create_readwrite_async$FUNC
    );
    static final FunctionDescriptor g_file_create_readwrite_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_create_readwrite_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_create_readwrite_finish",
        constants$670.g_file_create_readwrite_finish$FUNC
    );
}


