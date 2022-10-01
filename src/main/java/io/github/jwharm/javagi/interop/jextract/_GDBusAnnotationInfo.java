// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GDBusAnnotationInfo {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("ref_count"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("key"),
        Constants$root.C_POINTER$LAYOUT.withName("value"),
        Constants$root.C_POINTER$LAYOUT.withName("annotations")
    ).withName("_GDBusAnnotationInfo");
    public static MemoryLayout $LAYOUT() {
        return _GDBusAnnotationInfo.$struct$LAYOUT;
    }
    static final VarHandle ref_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ref_count"));
    public static VarHandle ref_count$VH() {
        return _GDBusAnnotationInfo.ref_count$VH;
    }
    public static int ref_count$get(MemorySegment seg) {
        return (int)_GDBusAnnotationInfo.ref_count$VH.get(seg);
    }
    public static void ref_count$set( MemorySegment seg, int x) {
        _GDBusAnnotationInfo.ref_count$VH.set(seg, x);
    }
    public static int ref_count$get(MemorySegment seg, long index) {
        return (int)_GDBusAnnotationInfo.ref_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_count$set(MemorySegment seg, long index, int x) {
        _GDBusAnnotationInfo.ref_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle key$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("key"));
    public static VarHandle key$VH() {
        return _GDBusAnnotationInfo.key$VH;
    }
    public static MemoryAddress key$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusAnnotationInfo.key$VH.get(seg);
    }
    public static void key$set( MemorySegment seg, MemoryAddress x) {
        _GDBusAnnotationInfo.key$VH.set(seg, x);
    }
    public static MemoryAddress key$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusAnnotationInfo.key$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void key$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusAnnotationInfo.key$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value"));
    public static VarHandle value$VH() {
        return _GDBusAnnotationInfo.value$VH;
    }
    public static MemoryAddress value$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusAnnotationInfo.value$VH.get(seg);
    }
    public static void value$set( MemorySegment seg, MemoryAddress x) {
        _GDBusAnnotationInfo.value$VH.set(seg, x);
    }
    public static MemoryAddress value$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusAnnotationInfo.value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusAnnotationInfo.value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle annotations$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("annotations"));
    public static VarHandle annotations$VH() {
        return _GDBusAnnotationInfo.annotations$VH;
    }
    public static MemoryAddress annotations$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusAnnotationInfo.annotations$VH.get(seg);
    }
    public static void annotations$set( MemorySegment seg, MemoryAddress x) {
        _GDBusAnnotationInfo.annotations$VH.set(seg, x);
    }
    public static MemoryAddress annotations$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusAnnotationInfo.annotations$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void annotations$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusAnnotationInfo.annotations$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


