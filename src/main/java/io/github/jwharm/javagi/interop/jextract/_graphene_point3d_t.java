// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _graphene_point3d_t {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y"),
        Constants$root.C_FLOAT$LAYOUT.withName("z")
    ).withName("_graphene_point3d_t");
    public static MemoryLayout $LAYOUT() {
        return _graphene_point3d_t.$struct$LAYOUT;
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return _graphene_point3d_t.x$VH;
    }
    public static float x$get(MemorySegment seg) {
        return (float)_graphene_point3d_t.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, float x) {
        _graphene_point3d_t.x$VH.set(seg, x);
    }
    public static float x$get(MemorySegment seg, long index) {
        return (float)_graphene_point3d_t.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, float x) {
        _graphene_point3d_t.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return _graphene_point3d_t.y$VH;
    }
    public static float y$get(MemorySegment seg) {
        return (float)_graphene_point3d_t.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, float x) {
        _graphene_point3d_t.y$VH.set(seg, x);
    }
    public static float y$get(MemorySegment seg, long index) {
        return (float)_graphene_point3d_t.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, float x) {
        _graphene_point3d_t.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle z$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("z"));
    public static VarHandle z$VH() {
        return _graphene_point3d_t.z$VH;
    }
    public static float z$get(MemorySegment seg) {
        return (float)_graphene_point3d_t.z$VH.get(seg);
    }
    public static void z$set( MemorySegment seg, float x) {
        _graphene_point3d_t.z$VH.set(seg, x);
    }
    public static float z$get(MemorySegment seg, long index) {
        return (float)_graphene_point3d_t.z$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void z$set(MemorySegment seg, long index, float x) {
        _graphene_point3d_t.z$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


