// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GTrashStack {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("next")
    ).withName("_GTrashStack");
    public static MemoryLayout $LAYOUT() {
        return _GTrashStack.$struct$LAYOUT;
    }
    static final VarHandle next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next"));
    public static VarHandle next$VH() {
        return _GTrashStack.next$VH;
    }
    public static MemoryAddress next$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTrashStack.next$VH.get(seg);
    }
    public static void next$set( MemorySegment seg, MemoryAddress x) {
        _GTrashStack.next$VH.set(seg, x);
    }
    public static MemoryAddress next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTrashStack.next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTrashStack.next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


