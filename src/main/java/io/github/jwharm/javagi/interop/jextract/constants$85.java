// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$85 {

    static final FunctionDescriptor g_date_time_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle g_date_time_new$MH = RuntimeHelper.downcallHandle(
        "g_date_time_new",
        constants$85.g_date_time_new$FUNC
    );
    static final FunctionDescriptor g_date_time_new_local$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle g_date_time_new_local$MH = RuntimeHelper.downcallHandle(
        "g_date_time_new_local",
        constants$85.g_date_time_new_local$FUNC
    );
    static final FunctionDescriptor g_date_time_new_utc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle g_date_time_new_utc$MH = RuntimeHelper.downcallHandle(
        "g_date_time_new_utc",
        constants$85.g_date_time_new_utc$FUNC
    );
    static final FunctionDescriptor g_date_time_add$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_date_time_add$MH = RuntimeHelper.downcallHandle(
        "g_date_time_add",
        constants$85.g_date_time_add$FUNC
    );
    static final FunctionDescriptor g_date_time_add_years$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_date_time_add_years$MH = RuntimeHelper.downcallHandle(
        "g_date_time_add_years",
        constants$85.g_date_time_add_years$FUNC
    );
    static final FunctionDescriptor g_date_time_add_months$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_date_time_add_months$MH = RuntimeHelper.downcallHandle(
        "g_date_time_add_months",
        constants$85.g_date_time_add_months$FUNC
    );
}


