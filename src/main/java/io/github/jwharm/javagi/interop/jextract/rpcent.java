// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class rpcent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("r_name"),
        Constants$root.C_POINTER$LAYOUT.withName("r_aliases"),
        Constants$root.C_INT$LAYOUT.withName("r_number"),
        MemoryLayout.paddingLayout(32)
    ).withName("rpcent");
    public static MemoryLayout $LAYOUT() {
        return rpcent.$struct$LAYOUT;
    }
    static final VarHandle r_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("r_name"));
    public static VarHandle r_name$VH() {
        return rpcent.r_name$VH;
    }
    public static MemoryAddress r_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)rpcent.r_name$VH.get(seg);
    }
    public static void r_name$set( MemorySegment seg, MemoryAddress x) {
        rpcent.r_name$VH.set(seg, x);
    }
    public static MemoryAddress r_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)rpcent.r_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void r_name$set(MemorySegment seg, long index, MemoryAddress x) {
        rpcent.r_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle r_aliases$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("r_aliases"));
    public static VarHandle r_aliases$VH() {
        return rpcent.r_aliases$VH;
    }
    public static MemoryAddress r_aliases$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)rpcent.r_aliases$VH.get(seg);
    }
    public static void r_aliases$set( MemorySegment seg, MemoryAddress x) {
        rpcent.r_aliases$VH.set(seg, x);
    }
    public static MemoryAddress r_aliases$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)rpcent.r_aliases$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void r_aliases$set(MemorySegment seg, long index, MemoryAddress x) {
        rpcent.r_aliases$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle r_number$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("r_number"));
    public static VarHandle r_number$VH() {
        return rpcent.r_number$VH;
    }
    public static int r_number$get(MemorySegment seg) {
        return (int)rpcent.r_number$VH.get(seg);
    }
    public static void r_number$set( MemorySegment seg, int x) {
        rpcent.r_number$VH.set(seg, x);
    }
    public static int r_number$get(MemorySegment seg, long index) {
        return (int)rpcent.r_number$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void r_number$set(MemorySegment seg, long index, int x) {
        rpcent.r_number$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


