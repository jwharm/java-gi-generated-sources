// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GParamSpecBoolean {

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
        Constants$root.C_INT$LAYOUT.withName("default_value"),
        MemoryLayout.paddingLayout(32)
    ).withName("_GParamSpecBoolean");
    public static MemoryLayout $LAYOUT() {
        return _GParamSpecBoolean.$struct$LAYOUT;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    static final VarHandle default_value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("default_value"));
    public static VarHandle default_value$VH() {
        return _GParamSpecBoolean.default_value$VH;
    }
    public static int default_value$get(MemorySegment seg) {
        return (int)_GParamSpecBoolean.default_value$VH.get(seg);
    }
    public static void default_value$set( MemorySegment seg, int x) {
        _GParamSpecBoolean.default_value$VH.set(seg, x);
    }
    public static int default_value$get(MemorySegment seg, long index) {
        return (int)_GParamSpecBoolean.default_value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void default_value$set(MemorySegment seg, long index, int x) {
        _GParamSpecBoolean.default_value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


