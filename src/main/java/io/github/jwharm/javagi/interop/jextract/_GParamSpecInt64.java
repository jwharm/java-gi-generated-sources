// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GParamSpecInt64 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("g_class")
            ).withName("g_type_instance"),
            Constants$root.C_POINTER$LAYOUT.withName("name"),
            Constants$root.C_INT$LAYOUT.withName("flags"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_LONG_LONG$LAYOUT.withName("value_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("owner_type"),
            Constants$root.C_POINTER$LAYOUT.withName("_nick"),
            Constants$root.C_POINTER$LAYOUT.withName("_blurb"),
            Constants$root.C_POINTER$LAYOUT.withName("qdata"),
            Constants$root.C_INT$LAYOUT.withName("ref_count"),
            Constants$root.C_INT$LAYOUT.withName("param_id")
        ).withName("parent_instance"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("minimum"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("maximum"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("default_value")
    ).withName("_GParamSpecInt64");
    public static MemoryLayout $LAYOUT() {
        return _GParamSpecInt64.$struct$LAYOUT;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    static final VarHandle minimum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("minimum"));
    public static VarHandle minimum$VH() {
        return _GParamSpecInt64.minimum$VH;
    }
    public static long minimum$get(MemorySegment seg) {
        return (long)_GParamSpecInt64.minimum$VH.get(seg);
    }
    public static void minimum$set( MemorySegment seg, long x) {
        _GParamSpecInt64.minimum$VH.set(seg, x);
    }
    public static long minimum$get(MemorySegment seg, long index) {
        return (long)_GParamSpecInt64.minimum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void minimum$set(MemorySegment seg, long index, long x) {
        _GParamSpecInt64.minimum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle maximum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("maximum"));
    public static VarHandle maximum$VH() {
        return _GParamSpecInt64.maximum$VH;
    }
    public static long maximum$get(MemorySegment seg) {
        return (long)_GParamSpecInt64.maximum$VH.get(seg);
    }
    public static void maximum$set( MemorySegment seg, long x) {
        _GParamSpecInt64.maximum$VH.set(seg, x);
    }
    public static long maximum$get(MemorySegment seg, long index) {
        return (long)_GParamSpecInt64.maximum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void maximum$set(MemorySegment seg, long index, long x) {
        _GParamSpecInt64.maximum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle default_value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("default_value"));
    public static VarHandle default_value$VH() {
        return _GParamSpecInt64.default_value$VH;
    }
    public static long default_value$get(MemorySegment seg) {
        return (long)_GParamSpecInt64.default_value$VH.get(seg);
    }
    public static void default_value$set( MemorySegment seg, long x) {
        _GParamSpecInt64.default_value$VH.set(seg, x);
    }
    public static long default_value$get(MemorySegment seg, long index) {
        return (long)_GParamSpecInt64.default_value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void default_value$set(MemorySegment seg, long index, long x) {
        _GParamSpecInt64.default_value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


