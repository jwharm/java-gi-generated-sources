// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class FT_Data_ {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pointer"),
        Constants$root.C_INT$LAYOUT.withName("length"),
        MemoryLayout.paddingLayout(32)
    ).withName("FT_Data_");
    public static MemoryLayout $LAYOUT() {
        return FT_Data_.$struct$LAYOUT;
    }
    static final VarHandle pointer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pointer"));
    public static VarHandle pointer$VH() {
        return FT_Data_.pointer$VH;
    }
    public static MemoryAddress pointer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)FT_Data_.pointer$VH.get(seg);
    }
    public static void pointer$set( MemorySegment seg, MemoryAddress x) {
        FT_Data_.pointer$VH.set(seg, x);
    }
    public static MemoryAddress pointer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)FT_Data_.pointer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pointer$set(MemorySegment seg, long index, MemoryAddress x) {
        FT_Data_.pointer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("length"));
    public static VarHandle length$VH() {
        return FT_Data_.length$VH;
    }
    public static int length$get(MemorySegment seg) {
        return (int)FT_Data_.length$VH.get(seg);
    }
    public static void length$set( MemorySegment seg, int x) {
        FT_Data_.length$VH.set(seg, x);
    }
    public static int length$get(MemorySegment seg, long index) {
        return (int)FT_Data_.length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, int x) {
        FT_Data_.length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


