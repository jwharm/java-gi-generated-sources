// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1122 {

    static final FunctionDescriptor cairo_raster_source_acquire_func_t$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_raster_source_acquire_func_t$MH = RuntimeHelper.downcallHandle(
        constants$1122.cairo_raster_source_acquire_func_t$FUNC
    );
    static final FunctionDescriptor cairo_raster_source_release_func_t$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_raster_source_release_func_t$MH = RuntimeHelper.downcallHandle(
        constants$1122.cairo_raster_source_release_func_t$FUNC
    );
    static final FunctionDescriptor cairo_raster_source_snapshot_func_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_raster_source_snapshot_func_t$MH = RuntimeHelper.downcallHandle(
        constants$1122.cairo_raster_source_snapshot_func_t$FUNC
    );
}


