// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$198 {

    static final FunctionDescriptor g_string_overwrite$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_overwrite$MH = RuntimeHelper.downcallHandle(
        "g_string_overwrite",
        constants$198.g_string_overwrite$FUNC
    );
    static final FunctionDescriptor g_string_overwrite_len$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_string_overwrite_len$MH = RuntimeHelper.downcallHandle(
        "g_string_overwrite_len",
        constants$198.g_string_overwrite_len$FUNC
    );
    static final FunctionDescriptor g_string_erase$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_string_erase$MH = RuntimeHelper.downcallHandle(
        "g_string_erase",
        constants$198.g_string_erase$FUNC
    );
    static final FunctionDescriptor g_string_replace$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_string_replace$MH = RuntimeHelper.downcallHandle(
        "g_string_replace",
        constants$198.g_string_replace$FUNC
    );
    static final FunctionDescriptor g_string_ascii_down$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_ascii_down$MH = RuntimeHelper.downcallHandle(
        "g_string_ascii_down",
        constants$198.g_string_ascii_down$FUNC
    );
    static final FunctionDescriptor g_string_ascii_up$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_ascii_up$MH = RuntimeHelper.downcallHandle(
        "g_string_ascii_up",
        constants$198.g_string_ascii_up$FUNC
    );
}


