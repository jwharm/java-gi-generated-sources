// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GParamSpecValueArray {

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
        Constants$root.C_POINTER$LAYOUT.withName("element_spec"),
        Constants$root.C_INT$LAYOUT.withName("fixed_n_elements"),
        MemoryLayout.paddingLayout(32)
    ).withName("_GParamSpecValueArray");
    public static MemoryLayout $LAYOUT() {
        return _GParamSpecValueArray.$struct$LAYOUT;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    static final VarHandle element_spec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("element_spec"));
    public static VarHandle element_spec$VH() {
        return _GParamSpecValueArray.element_spec$VH;
    }
    public static MemoryAddress element_spec$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GParamSpecValueArray.element_spec$VH.get(seg);
    }
    public static void element_spec$set( MemorySegment seg, MemoryAddress x) {
        _GParamSpecValueArray.element_spec$VH.set(seg, x);
    }
    public static MemoryAddress element_spec$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GParamSpecValueArray.element_spec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void element_spec$set(MemorySegment seg, long index, MemoryAddress x) {
        _GParamSpecValueArray.element_spec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fixed_n_elements$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fixed_n_elements"));
    public static VarHandle fixed_n_elements$VH() {
        return _GParamSpecValueArray.fixed_n_elements$VH;
    }
    public static int fixed_n_elements$get(MemorySegment seg) {
        return (int)_GParamSpecValueArray.fixed_n_elements$VH.get(seg);
    }
    public static void fixed_n_elements$set( MemorySegment seg, int x) {
        _GParamSpecValueArray.fixed_n_elements$VH.set(seg, x);
    }
    public static int fixed_n_elements$get(MemorySegment seg, long index) {
        return (int)_GParamSpecValueArray.fixed_n_elements$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fixed_n_elements$set(MemorySegment seg, long index, int x) {
        _GParamSpecValueArray.fixed_n_elements$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


