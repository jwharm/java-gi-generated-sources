// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface hb_destroy_func_t {

    void apply(java.lang.foreign.MemoryAddress user_data);
    static MemorySegment allocate(hb_destroy_func_t fi, MemorySession session) {
        return RuntimeHelper.upcallStub(hb_destroy_func_t.class, fi, constants$1139.hb_destroy_func_t$FUNC, session);
    }
    static hb_destroy_func_t ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _user_data) -> {
            try {
                constants$1140.hb_destroy_func_t$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


