// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class in_addr {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("s_addr")
    ).withName("in_addr");
    public static MemoryLayout $LAYOUT() {
        return in_addr.$struct$LAYOUT;
    }
    static final VarHandle s_addr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("s_addr"));
    public static VarHandle s_addr$VH() {
        return in_addr.s_addr$VH;
    }
    public static int s_addr$get(MemorySegment seg) {
        return (int)in_addr.s_addr$VH.get(seg);
    }
    public static void s_addr$set( MemorySegment seg, int x) {
        in_addr.s_addr$VH.set(seg, x);
    }
    public static int s_addr$get(MemorySegment seg, long index) {
        return (int)in_addr.s_addr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void s_addr$set(MemorySegment seg, long index, int x) {
        in_addr.s_addr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


