// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GOnce {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("status"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("retval")
    ).withName("_GOnce");
    public static MemoryLayout $LAYOUT() {
        return _GOnce.$struct$LAYOUT;
    }
    static final VarHandle status$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("status"));
    public static VarHandle status$VH() {
        return _GOnce.status$VH;
    }
    public static int status$get(MemorySegment seg) {
        return (int)_GOnce.status$VH.get(seg);
    }
    public static void status$set( MemorySegment seg, int x) {
        _GOnce.status$VH.set(seg, x);
    }
    public static int status$get(MemorySegment seg, long index) {
        return (int)_GOnce.status$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void status$set(MemorySegment seg, long index, int x) {
        _GOnce.status$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle retval$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("retval"));
    public static VarHandle retval$VH() {
        return _GOnce.retval$VH;
    }
    public static MemoryAddress retval$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GOnce.retval$VH.get(seg);
    }
    public static void retval$set( MemorySegment seg, MemoryAddress x) {
        _GOnce.retval$VH.set(seg, x);
    }
    public static MemoryAddress retval$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GOnce.retval$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void retval$set(MemorySegment seg, long index, MemoryAddress x) {
        _GOnce.retval$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


