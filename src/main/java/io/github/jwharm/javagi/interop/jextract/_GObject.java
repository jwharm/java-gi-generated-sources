// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GObject {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("g_class")
        ).withName("g_type_instance"),
        Constants$root.C_INT$LAYOUT.withName("ref_count"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("qdata")
    ).withName("_GObject");
    public static MemoryLayout $LAYOUT() {
        return _GObject.$struct$LAYOUT;
    }
    public static MemorySegment g_type_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle ref_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ref_count"));
    public static VarHandle ref_count$VH() {
        return _GObject.ref_count$VH;
    }
    public static int ref_count$get(MemorySegment seg) {
        return (int)_GObject.ref_count$VH.get(seg);
    }
    public static void ref_count$set( MemorySegment seg, int x) {
        _GObject.ref_count$VH.set(seg, x);
    }
    public static int ref_count$get(MemorySegment seg, long index) {
        return (int)_GObject.ref_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_count$set(MemorySegment seg, long index, int x) {
        _GObject.ref_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle qdata$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("qdata"));
    public static VarHandle qdata$VH() {
        return _GObject.qdata$VH;
    }
    public static MemoryAddress qdata$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GObject.qdata$VH.get(seg);
    }
    public static void qdata$set( MemorySegment seg, MemoryAddress x) {
        _GObject.qdata$VH.set(seg, x);
    }
    public static MemoryAddress qdata$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GObject.qdata$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void qdata$set(MemorySegment seg, long index, MemoryAddress x) {
        _GObject.qdata$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


