// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class hb_ot_math_kern_entry_t {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("max_correction_height"),
        Constants$root.C_INT$LAYOUT.withName("kern_value")
    );
    public static MemoryLayout $LAYOUT() {
        return hb_ot_math_kern_entry_t.$struct$LAYOUT;
    }
    static final VarHandle max_correction_height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_correction_height"));
    public static VarHandle max_correction_height$VH() {
        return hb_ot_math_kern_entry_t.max_correction_height$VH;
    }
    public static int max_correction_height$get(MemorySegment seg) {
        return (int)hb_ot_math_kern_entry_t.max_correction_height$VH.get(seg);
    }
    public static void max_correction_height$set( MemorySegment seg, int x) {
        hb_ot_math_kern_entry_t.max_correction_height$VH.set(seg, x);
    }
    public static int max_correction_height$get(MemorySegment seg, long index) {
        return (int)hb_ot_math_kern_entry_t.max_correction_height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_correction_height$set(MemorySegment seg, long index, int x) {
        hb_ot_math_kern_entry_t.max_correction_height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle kern_value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("kern_value"));
    public static VarHandle kern_value$VH() {
        return hb_ot_math_kern_entry_t.kern_value$VH;
    }
    public static int kern_value$get(MemorySegment seg) {
        return (int)hb_ot_math_kern_entry_t.kern_value$VH.get(seg);
    }
    public static void kern_value$set( MemorySegment seg, int x) {
        hb_ot_math_kern_entry_t.kern_value$VH.set(seg, x);
    }
    public static int kern_value$get(MemorySegment seg, long index) {
        return (int)hb_ot_math_kern_entry_t.kern_value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void kern_value$set(MemorySegment seg, long index, int x) {
        hb_ot_math_kern_entry_t.kern_value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


