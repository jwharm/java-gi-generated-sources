// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$237 {

    static final FunctionDescriptor g_variant_get_normal_form$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_normal_form$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_normal_form",
        constants$237.g_variant_get_normal_form$FUNC
    );
    static final FunctionDescriptor g_variant_is_normal_form$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_is_normal_form$MH = RuntimeHelper.downcallHandle(
        "g_variant_is_normal_form",
        constants$237.g_variant_is_normal_form$FUNC
    );
    static final FunctionDescriptor g_variant_byteswap$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_byteswap$MH = RuntimeHelper.downcallHandle(
        "g_variant_byteswap",
        constants$237.g_variant_byteswap$FUNC
    );
    static final FunctionDescriptor g_variant_new_from_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_variant_new_from_bytes$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_from_bytes",
        constants$237.g_variant_new_from_bytes$FUNC
    );
    static final FunctionDescriptor g_variant_new_from_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new_from_data$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_from_data",
        constants$237.g_variant_new_from_data$FUNC
    );
    static final FunctionDescriptor g_variant_iter_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_iter_new$MH = RuntimeHelper.downcallHandle(
        "g_variant_iter_new",
        constants$237.g_variant_iter_new$FUNC
    );
}


