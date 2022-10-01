// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class ns_tsig_key {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(1025, Constants$root.C_CHAR$LAYOUT).withName("name"),
        MemoryLayout.sequenceLayout(1025, Constants$root.C_CHAR$LAYOUT).withName("alg"),
        MemoryLayout.paddingLayout(48),
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_INT$LAYOUT.withName("len"),
        MemoryLayout.paddingLayout(32)
    ).withName("ns_tsig_key");
    public static MemoryLayout $LAYOUT() {
        return ns_tsig_key.$struct$LAYOUT;
    }
    public static MemorySegment name$slice(MemorySegment seg) {
        return seg.asSlice(0, 1025);
    }
    public static MemorySegment alg$slice(MemorySegment seg) {
        return seg.asSlice(1025, 1025);
    }
    static final VarHandle data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("data"));
    public static VarHandle data$VH() {
        return ns_tsig_key.data$VH;
    }
    public static MemoryAddress data$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)ns_tsig_key.data$VH.get(seg);
    }
    public static void data$set( MemorySegment seg, MemoryAddress x) {
        ns_tsig_key.data$VH.set(seg, x);
    }
    public static MemoryAddress data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)ns_tsig_key.data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, MemoryAddress x) {
        ns_tsig_key.data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle len$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("len"));
    public static VarHandle len$VH() {
        return ns_tsig_key.len$VH;
    }
    public static int len$get(MemorySegment seg) {
        return (int)ns_tsig_key.len$VH.get(seg);
    }
    public static void len$set( MemorySegment seg, int x) {
        ns_tsig_key.len$VH.set(seg, x);
    }
    public static int len$get(MemorySegment seg, long index) {
        return (int)ns_tsig_key.len$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void len$set(MemorySegment seg, long index, int x) {
        ns_tsig_key.len$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


