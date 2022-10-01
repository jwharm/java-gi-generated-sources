// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GDatagramBasedSourceFunc {

    int apply(java.lang.foreign.MemoryAddress datagram_based, int condition, java.lang.foreign.MemoryAddress user_data);
    static MemorySegment allocate(GDatagramBasedSourceFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GDatagramBasedSourceFunc.class, fi, constants$518.GDatagramBasedSourceFunc$FUNC, session);
    }
    static GDatagramBasedSourceFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _datagram_based, int _condition, java.lang.foreign.MemoryAddress _user_data) -> {
            try {
                return (int)constants$518.GDatagramBasedSourceFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_datagram_based, _condition, (java.lang.foreign.Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


