// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface hb_unicode_compose_func_t {

    int apply(java.lang.foreign.MemoryAddress ufuncs, int a, int b, java.lang.foreign.MemoryAddress ab, java.lang.foreign.MemoryAddress user_data);
    static MemorySegment allocate(hb_unicode_compose_func_t fi, MemorySession session) {
        return RuntimeHelper.upcallStub(hb_unicode_compose_func_t.class, fi, constants$1147.hb_unicode_compose_func_t$FUNC, session);
    }
    static hb_unicode_compose_func_t ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _ufuncs, int _a, int _b, java.lang.foreign.MemoryAddress _ab, java.lang.foreign.MemoryAddress _user_data) -> {
            try {
                return (int)constants$1147.hb_unicode_compose_func_t$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_ufuncs, _a, _b, (java.lang.foreign.Addressable)_ab, (java.lang.foreign.Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


