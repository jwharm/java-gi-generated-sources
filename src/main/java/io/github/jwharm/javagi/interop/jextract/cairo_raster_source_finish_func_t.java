// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface cairo_raster_source_finish_func_t {

    void apply(java.lang.foreign.MemoryAddress pattern, java.lang.foreign.MemoryAddress callback_data);
    static MemorySegment allocate(cairo_raster_source_finish_func_t fi, MemorySession session) {
        return RuntimeHelper.upcallStub(cairo_raster_source_finish_func_t.class, fi, constants$1123.cairo_raster_source_finish_func_t$FUNC, session);
    }
    static cairo_raster_source_finish_func_t ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pattern, java.lang.foreign.MemoryAddress _callback_data) -> {
            try {
                constants$1123.cairo_raster_source_finish_func_t$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pattern, (java.lang.foreign.Addressable)_callback_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


