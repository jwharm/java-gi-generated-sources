// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$306 {

    static final FunctionDescriptor g_string_chunk_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_string_chunk_new$MH = RuntimeHelper.downcallHandle(
        "g_string_chunk_new",
        constants$306.g_string_chunk_new$FUNC
    );
    static final FunctionDescriptor g_string_chunk_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_chunk_free$MH = RuntimeHelper.downcallHandle(
        "g_string_chunk_free",
        constants$306.g_string_chunk_free$FUNC
    );
    static final FunctionDescriptor g_string_chunk_clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_chunk_clear$MH = RuntimeHelper.downcallHandle(
        "g_string_chunk_clear",
        constants$306.g_string_chunk_clear$FUNC
    );
    static final FunctionDescriptor g_string_chunk_insert$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_chunk_insert$MH = RuntimeHelper.downcallHandle(
        "g_string_chunk_insert",
        constants$306.g_string_chunk_insert$FUNC
    );
    static final FunctionDescriptor g_string_chunk_insert_len$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_string_chunk_insert_len$MH = RuntimeHelper.downcallHandle(
        "g_string_chunk_insert_len",
        constants$306.g_string_chunk_insert_len$FUNC
    );
    static final FunctionDescriptor g_string_chunk_insert_const$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_chunk_insert_const$MH = RuntimeHelper.downcallHandle(
        "g_string_chunk_insert_const",
        constants$306.g_string_chunk_insert_const$FUNC
    );
}


