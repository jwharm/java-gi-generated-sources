// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GTypeClassCacheFunc {

    int apply(java.lang.foreign.MemoryAddress cache_data, java.lang.foreign.MemoryAddress g_class);
    static MemorySegment allocate(GTypeClassCacheFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GTypeClassCacheFunc.class, fi, constants$426.GTypeClassCacheFunc$FUNC, session);
    }
    static GTypeClassCacheFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _cache_data, java.lang.foreign.MemoryAddress _g_class) -> {
            try {
                return (int)constants$426.GTypeClassCacheFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_cache_data, (java.lang.foreign.Addressable)_g_class);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


