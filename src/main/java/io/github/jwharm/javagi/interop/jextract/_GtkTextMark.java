// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkTextMark {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("g_class")
            ).withName("g_type_instance"),
            Constants$root.C_INT$LAYOUT.withName("ref_count"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("qdata")
        ).withName("parent_instance"),
        Constants$root.C_POINTER$LAYOUT.withName("segment")
    ).withName("_GtkTextMark");
    public static MemoryLayout $LAYOUT() {
        return _GtkTextMark.$struct$LAYOUT;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    static final VarHandle segment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("segment"));
    public static VarHandle segment$VH() {
        return _GtkTextMark.segment$VH;
    }
    public static MemoryAddress segment$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkTextMark.segment$VH.get(seg);
    }
    public static void segment$set( MemorySegment seg, MemoryAddress x) {
        _GtkTextMark.segment$VH.set(seg, x);
    }
    public static MemoryAddress segment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkTextMark.segment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void segment$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkTextMark.segment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


