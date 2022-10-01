// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GtkTreeViewColumnDropFunc {

    int apply(java.lang.foreign.MemoryAddress tree_view, java.lang.foreign.MemoryAddress column, java.lang.foreign.MemoryAddress prev_column, java.lang.foreign.MemoryAddress next_column, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(GtkTreeViewColumnDropFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GtkTreeViewColumnDropFunc.class, fi, constants$1965.GtkTreeViewColumnDropFunc$FUNC, session);
    }
    static GtkTreeViewColumnDropFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _tree_view, java.lang.foreign.MemoryAddress _column, java.lang.foreign.MemoryAddress _prev_column, java.lang.foreign.MemoryAddress _next_column, java.lang.foreign.MemoryAddress _data) -> {
            try {
                return (int)constants$1965.GtkTreeViewColumnDropFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_tree_view, (java.lang.foreign.Addressable)_column, (java.lang.foreign.Addressable)_prev_column, (java.lang.foreign.Addressable)_next_column, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


