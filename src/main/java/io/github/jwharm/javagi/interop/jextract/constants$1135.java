// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1135 {

    static final FunctionDescriptor cairo_region_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_equal$MH = RuntimeHelper.downcallHandle(
        "cairo_region_equal",
        constants$1135.cairo_region_equal$FUNC
    );
    static final FunctionDescriptor cairo_region_status$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_status$MH = RuntimeHelper.downcallHandle(
        "cairo_region_status",
        constants$1135.cairo_region_status$FUNC
    );
    static final FunctionDescriptor cairo_region_get_extents$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_get_extents$MH = RuntimeHelper.downcallHandle(
        "cairo_region_get_extents",
        constants$1135.cairo_region_get_extents$FUNC
    );
    static final FunctionDescriptor cairo_region_num_rectangles$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_num_rectangles$MH = RuntimeHelper.downcallHandle(
        "cairo_region_num_rectangles",
        constants$1135.cairo_region_num_rectangles$FUNC
    );
    static final FunctionDescriptor cairo_region_get_rectangle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_get_rectangle$MH = RuntimeHelper.downcallHandle(
        "cairo_region_get_rectangle",
        constants$1135.cairo_region_get_rectangle$FUNC
    );
    static final FunctionDescriptor cairo_region_is_empty$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_is_empty$MH = RuntimeHelper.downcallHandle(
        "cairo_region_is_empty",
        constants$1135.cairo_region_is_empty$FUNC
    );
}


