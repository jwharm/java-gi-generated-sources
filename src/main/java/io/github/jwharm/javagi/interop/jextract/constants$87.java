// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$87 {

    static final FunctionDescriptor g_date_time_compare$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_compare$MH = RuntimeHelper.downcallHandle(
        "g_date_time_compare",
        constants$87.g_date_time_compare$FUNC
    );
    static final FunctionDescriptor g_date_time_difference$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_difference$MH = RuntimeHelper.downcallHandle(
        "g_date_time_difference",
        constants$87.g_date_time_difference$FUNC
    );
    static final FunctionDescriptor g_date_time_hash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_hash$MH = RuntimeHelper.downcallHandle(
        "g_date_time_hash",
        constants$87.g_date_time_hash$FUNC
    );
    static final FunctionDescriptor g_date_time_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_equal$MH = RuntimeHelper.downcallHandle(
        "g_date_time_equal",
        constants$87.g_date_time_equal$FUNC
    );
    static final FunctionDescriptor g_date_time_get_ymd$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_get_ymd$MH = RuntimeHelper.downcallHandle(
        "g_date_time_get_ymd",
        constants$87.g_date_time_get_ymd$FUNC
    );
    static final FunctionDescriptor g_date_time_get_year$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_get_year$MH = RuntimeHelper.downcallHandle(
        "g_date_time_get_year",
        constants$87.g_date_time_get_year$FUNC
    );
}


