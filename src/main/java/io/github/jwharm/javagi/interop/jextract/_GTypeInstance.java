// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GTypeInstance {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("g_class")
    ).withName("_GTypeInstance");
    public static MemoryLayout $LAYOUT() {
        return _GTypeInstance.$struct$LAYOUT;
    }
    static final VarHandle g_class$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("g_class"));
    public static VarHandle g_class$VH() {
        return _GTypeInstance.g_class$VH;
    }
    public static MemoryAddress g_class$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTypeInstance.g_class$VH.get(seg);
    }
    public static void g_class$set( MemorySegment seg, MemoryAddress x) {
        _GTypeInstance.g_class$VH.set(seg, x);
    }
    public static MemoryAddress g_class$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTypeInstance.g_class$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void g_class$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypeInstance.g_class$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


