// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1115 {

    static final FunctionDescriptor cairo_device_observer_glyphs_elapsed$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_device_observer_glyphs_elapsed$MH = RuntimeHelper.downcallHandle(
        "cairo_device_observer_glyphs_elapsed",
        constants$1115.cairo_device_observer_glyphs_elapsed$FUNC
    );
    static final FunctionDescriptor cairo_surface_reference$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_surface_reference$MH = RuntimeHelper.downcallHandle(
        "cairo_surface_reference",
        constants$1115.cairo_surface_reference$FUNC
    );
    static final FunctionDescriptor cairo_surface_finish$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_surface_finish$MH = RuntimeHelper.downcallHandle(
        "cairo_surface_finish",
        constants$1115.cairo_surface_finish$FUNC
    );
    static final FunctionDescriptor cairo_surface_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_surface_destroy$MH = RuntimeHelper.downcallHandle(
        "cairo_surface_destroy",
        constants$1115.cairo_surface_destroy$FUNC
    );
    static final FunctionDescriptor cairo_surface_get_device$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_surface_get_device$MH = RuntimeHelper.downcallHandle(
        "cairo_surface_get_device",
        constants$1115.cairo_surface_get_device$FUNC
    );
    static final FunctionDescriptor cairo_surface_get_reference_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_surface_get_reference_count$MH = RuntimeHelper.downcallHandle(
        "cairo_surface_get_reference_count",
        constants$1115.cairo_surface_get_reference_count$FUNC
    );
}


