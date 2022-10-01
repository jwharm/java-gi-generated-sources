// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ns_flagdata {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("mask"),
        Constants$root.C_INT$LAYOUT.withName("shift")
    ).withName("_ns_flagdata");
    public static MemoryLayout $LAYOUT() {
        return _ns_flagdata.$struct$LAYOUT;
    }
    static final VarHandle mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mask"));
    public static VarHandle mask$VH() {
        return _ns_flagdata.mask$VH;
    }
    public static int mask$get(MemorySegment seg) {
        return (int)_ns_flagdata.mask$VH.get(seg);
    }
    public static void mask$set( MemorySegment seg, int x) {
        _ns_flagdata.mask$VH.set(seg, x);
    }
    public static int mask$get(MemorySegment seg, long index) {
        return (int)_ns_flagdata.mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mask$set(MemorySegment seg, long index, int x) {
        _ns_flagdata.mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle shift$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("shift"));
    public static VarHandle shift$VH() {
        return _ns_flagdata.shift$VH;
    }
    public static int shift$get(MemorySegment seg) {
        return (int)_ns_flagdata.shift$VH.get(seg);
    }
    public static void shift$set( MemorySegment seg, int x) {
        _ns_flagdata.shift$VH.set(seg, x);
    }
    public static int shift$get(MemorySegment seg, long index) {
        return (int)_ns_flagdata.shift$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void shift$set(MemorySegment seg, long index, int x) {
        _ns_flagdata.shift$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


