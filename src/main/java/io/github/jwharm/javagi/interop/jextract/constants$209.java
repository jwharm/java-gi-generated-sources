// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$209 {

    static final FunctionDescriptor g_key_file_to_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_to_data$MH = RuntimeHelper.downcallHandle(
        "g_key_file_to_data",
        constants$209.g_key_file_to_data$FUNC
    );
    static final FunctionDescriptor g_key_file_save_to_file$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_save_to_file$MH = RuntimeHelper.downcallHandle(
        "g_key_file_save_to_file",
        constants$209.g_key_file_save_to_file$FUNC
    );
    static final FunctionDescriptor g_key_file_get_start_group$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_get_start_group$MH = RuntimeHelper.downcallHandle(
        "g_key_file_get_start_group",
        constants$209.g_key_file_get_start_group$FUNC
    );
    static final FunctionDescriptor g_key_file_get_groups$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_get_groups$MH = RuntimeHelper.downcallHandle(
        "g_key_file_get_groups",
        constants$209.g_key_file_get_groups$FUNC
    );
    static final FunctionDescriptor g_key_file_get_keys$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_get_keys$MH = RuntimeHelper.downcallHandle(
        "g_key_file_get_keys",
        constants$209.g_key_file_get_keys$FUNC
    );
    static final FunctionDescriptor g_key_file_has_group$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_has_group$MH = RuntimeHelper.downcallHandle(
        "g_key_file_has_group",
        constants$209.g_key_file_has_group$FUNC
    );
}


