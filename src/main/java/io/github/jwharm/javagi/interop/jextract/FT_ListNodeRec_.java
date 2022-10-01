// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class FT_ListNodeRec_ {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("prev"),
        Constants$root.C_POINTER$LAYOUT.withName("next"),
        Constants$root.C_POINTER$LAYOUT.withName("data")
    ).withName("FT_ListNodeRec_");
    public static MemoryLayout $LAYOUT() {
        return FT_ListNodeRec_.$struct$LAYOUT;
    }
    static final VarHandle prev$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("prev"));
    public static VarHandle prev$VH() {
        return FT_ListNodeRec_.prev$VH;
    }
    public static MemoryAddress prev$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)FT_ListNodeRec_.prev$VH.get(seg);
    }
    public static void prev$set( MemorySegment seg, MemoryAddress x) {
        FT_ListNodeRec_.prev$VH.set(seg, x);
    }
    public static MemoryAddress prev$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)FT_ListNodeRec_.prev$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void prev$set(MemorySegment seg, long index, MemoryAddress x) {
        FT_ListNodeRec_.prev$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next"));
    public static VarHandle next$VH() {
        return FT_ListNodeRec_.next$VH;
    }
    public static MemoryAddress next$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)FT_ListNodeRec_.next$VH.get(seg);
    }
    public static void next$set( MemorySegment seg, MemoryAddress x) {
        FT_ListNodeRec_.next$VH.set(seg, x);
    }
    public static MemoryAddress next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)FT_ListNodeRec_.next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemoryAddress x) {
        FT_ListNodeRec_.next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("data"));
    public static VarHandle data$VH() {
        return FT_ListNodeRec_.data$VH;
    }
    public static MemoryAddress data$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)FT_ListNodeRec_.data$VH.get(seg);
    }
    public static void data$set( MemorySegment seg, MemoryAddress x) {
        FT_ListNodeRec_.data$VH.set(seg, x);
    }
    public static MemoryAddress data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)FT_ListNodeRec_.data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, MemoryAddress x) {
        FT_ListNodeRec_.data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


