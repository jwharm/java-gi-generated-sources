// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$102 {

    static final FunctionDescriptor g_bytes_get_region$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_bytes_get_region$MH = RuntimeHelper.downcallHandle(
        "g_bytes_get_region",
        constants$102.g_bytes_get_region$FUNC
    );
    static final FunctionDescriptor g_get_charset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_get_charset$MH = RuntimeHelper.downcallHandle(
        "g_get_charset",
        constants$102.g_get_charset$FUNC
    );
    static final FunctionDescriptor g_get_codeset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_codeset$MH = RuntimeHelper.downcallHandle(
        "g_get_codeset",
        constants$102.g_get_codeset$FUNC
    );
    static final FunctionDescriptor g_get_console_charset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_get_console_charset$MH = RuntimeHelper.downcallHandle(
        "g_get_console_charset",
        constants$102.g_get_console_charset$FUNC
    );
    static final FunctionDescriptor g_get_language_names$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_language_names$MH = RuntimeHelper.downcallHandle(
        "g_get_language_names",
        constants$102.g_get_language_names$FUNC
    );
    static final FunctionDescriptor g_get_language_names_with_category$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_get_language_names_with_category$MH = RuntimeHelper.downcallHandle(
        "g_get_language_names_with_category",
        constants$102.g_get_language_names_with_category$FUNC
    );
}


