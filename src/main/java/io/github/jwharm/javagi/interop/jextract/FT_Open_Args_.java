// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class FT_Open_Args_ {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("memory_base"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("memory_size"),
        Constants$root.C_POINTER$LAYOUT.withName("pathname"),
        Constants$root.C_POINTER$LAYOUT.withName("stream"),
        Constants$root.C_POINTER$LAYOUT.withName("driver"),
        Constants$root.C_INT$LAYOUT.withName("num_params"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("params")
    ).withName("FT_Open_Args_");
    public static MemoryLayout $LAYOUT() {
        return FT_Open_Args_.$struct$LAYOUT;
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return FT_Open_Args_.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)FT_Open_Args_.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        FT_Open_Args_.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)FT_Open_Args_.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        FT_Open_Args_.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle memory_base$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("memory_base"));
    public static VarHandle memory_base$VH() {
        return FT_Open_Args_.memory_base$VH;
    }
    public static MemoryAddress memory_base$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)FT_Open_Args_.memory_base$VH.get(seg);
    }
    public static void memory_base$set( MemorySegment seg, MemoryAddress x) {
        FT_Open_Args_.memory_base$VH.set(seg, x);
    }
    public static MemoryAddress memory_base$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)FT_Open_Args_.memory_base$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void memory_base$set(MemorySegment seg, long index, MemoryAddress x) {
        FT_Open_Args_.memory_base$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle memory_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("memory_size"));
    public static VarHandle memory_size$VH() {
        return FT_Open_Args_.memory_size$VH;
    }
    public static long memory_size$get(MemorySegment seg) {
        return (long)FT_Open_Args_.memory_size$VH.get(seg);
    }
    public static void memory_size$set( MemorySegment seg, long x) {
        FT_Open_Args_.memory_size$VH.set(seg, x);
    }
    public static long memory_size$get(MemorySegment seg, long index) {
        return (long)FT_Open_Args_.memory_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void memory_size$set(MemorySegment seg, long index, long x) {
        FT_Open_Args_.memory_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pathname$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pathname"));
    public static VarHandle pathname$VH() {
        return FT_Open_Args_.pathname$VH;
    }
    public static MemoryAddress pathname$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)FT_Open_Args_.pathname$VH.get(seg);
    }
    public static void pathname$set( MemorySegment seg, MemoryAddress x) {
        FT_Open_Args_.pathname$VH.set(seg, x);
    }
    public static MemoryAddress pathname$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)FT_Open_Args_.pathname$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pathname$set(MemorySegment seg, long index, MemoryAddress x) {
        FT_Open_Args_.pathname$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle stream$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("stream"));
    public static VarHandle stream$VH() {
        return FT_Open_Args_.stream$VH;
    }
    public static MemoryAddress stream$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)FT_Open_Args_.stream$VH.get(seg);
    }
    public static void stream$set( MemorySegment seg, MemoryAddress x) {
        FT_Open_Args_.stream$VH.set(seg, x);
    }
    public static MemoryAddress stream$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)FT_Open_Args_.stream$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void stream$set(MemorySegment seg, long index, MemoryAddress x) {
        FT_Open_Args_.stream$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle driver$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("driver"));
    public static VarHandle driver$VH() {
        return FT_Open_Args_.driver$VH;
    }
    public static MemoryAddress driver$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)FT_Open_Args_.driver$VH.get(seg);
    }
    public static void driver$set( MemorySegment seg, MemoryAddress x) {
        FT_Open_Args_.driver$VH.set(seg, x);
    }
    public static MemoryAddress driver$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)FT_Open_Args_.driver$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void driver$set(MemorySegment seg, long index, MemoryAddress x) {
        FT_Open_Args_.driver$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle num_params$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("num_params"));
    public static VarHandle num_params$VH() {
        return FT_Open_Args_.num_params$VH;
    }
    public static int num_params$get(MemorySegment seg) {
        return (int)FT_Open_Args_.num_params$VH.get(seg);
    }
    public static void num_params$set( MemorySegment seg, int x) {
        FT_Open_Args_.num_params$VH.set(seg, x);
    }
    public static int num_params$get(MemorySegment seg, long index) {
        return (int)FT_Open_Args_.num_params$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void num_params$set(MemorySegment seg, long index, int x) {
        FT_Open_Args_.num_params$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle params$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("params"));
    public static VarHandle params$VH() {
        return FT_Open_Args_.params$VH;
    }
    public static MemoryAddress params$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)FT_Open_Args_.params$VH.get(seg);
    }
    public static void params$set( MemorySegment seg, MemoryAddress x) {
        FT_Open_Args_.params$VH.set(seg, x);
    }
    public static MemoryAddress params$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)FT_Open_Args_.params$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void params$set(MemorySegment seg, long index, MemoryAddress x) {
        FT_Open_Args_.params$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


