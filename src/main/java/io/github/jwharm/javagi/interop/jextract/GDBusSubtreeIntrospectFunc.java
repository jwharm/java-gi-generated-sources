// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GDBusSubtreeIntrospectFunc {

    java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress connection, java.lang.foreign.MemoryAddress sender, java.lang.foreign.MemoryAddress object_path, java.lang.foreign.MemoryAddress node, java.lang.foreign.MemoryAddress user_data);
    static MemorySegment allocate(GDBusSubtreeIntrospectFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GDBusSubtreeIntrospectFunc.class, fi, constants$603.GDBusSubtreeIntrospectFunc$FUNC, session);
    }
    static GDBusSubtreeIntrospectFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _connection, java.lang.foreign.MemoryAddress _sender, java.lang.foreign.MemoryAddress _object_path, java.lang.foreign.MemoryAddress _node, java.lang.foreign.MemoryAddress _user_data) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$603.GDBusSubtreeIntrospectFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_connection, (java.lang.foreign.Addressable)_sender, (java.lang.foreign.Addressable)_object_path, (java.lang.foreign.Addressable)_node, (java.lang.foreign.Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


