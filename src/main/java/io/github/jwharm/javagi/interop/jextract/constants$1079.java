// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1079 {

    static final FunctionDescriptor cairo_read_func_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_read_func_t$MH = RuntimeHelper.downcallHandle(
        constants$1079.cairo_read_func_t$FUNC
    );
    static final FunctionDescriptor cairo_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_create$MH = RuntimeHelper.downcallHandle(
        "cairo_create",
        constants$1079.cairo_create$FUNC
    );
    static final FunctionDescriptor cairo_reference$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_reference$MH = RuntimeHelper.downcallHandle(
        "cairo_reference",
        constants$1079.cairo_reference$FUNC
    );
    static final FunctionDescriptor cairo_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_destroy$MH = RuntimeHelper.downcallHandle(
        "cairo_destroy",
        constants$1079.cairo_destroy$FUNC
    );
    static final FunctionDescriptor cairo_get_reference_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_get_reference_count$MH = RuntimeHelper.downcallHandle(
        "cairo_get_reference_count",
        constants$1079.cairo_get_reference_count$FUNC
    );
    static final FunctionDescriptor cairo_get_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_get_user_data$MH = RuntimeHelper.downcallHandle(
        "cairo_get_user_data",
        constants$1079.cairo_get_user_data$FUNC
    );
}


