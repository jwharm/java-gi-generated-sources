// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$81 {

    static final FunctionDescriptor g_pointer_bit_unlock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_pointer_bit_unlock$MH = RuntimeHelper.downcallHandle(
        "g_pointer_bit_unlock",
        constants$81.g_pointer_bit_unlock$FUNC
    );
    static final FunctionDescriptor g_time_zone_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_time_zone_new$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_new",
        constants$81.g_time_zone_new$FUNC
    );
    static final FunctionDescriptor g_time_zone_new_identifier$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_time_zone_new_identifier$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_new_identifier",
        constants$81.g_time_zone_new_identifier$FUNC
    );
    static final FunctionDescriptor g_time_zone_new_utc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_time_zone_new_utc$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_new_utc",
        constants$81.g_time_zone_new_utc$FUNC
    );
    static final FunctionDescriptor g_time_zone_new_local$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_time_zone_new_local$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_new_local",
        constants$81.g_time_zone_new_local$FUNC
    );
    static final FunctionDescriptor g_time_zone_new_offset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_time_zone_new_offset$MH = RuntimeHelper.downcallHandle(
        "g_time_zone_new_offset",
        constants$81.g_time_zone_new_offset$FUNC
    );
}


