// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PangoAttrColor {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("klass"),
            Constants$root.C_INT$LAYOUT.withName("start_index"),
            Constants$root.C_INT$LAYOUT.withName("end_index")
        ).withName("attr"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("red"),
            Constants$root.C_SHORT$LAYOUT.withName("green"),
            Constants$root.C_SHORT$LAYOUT.withName("blue")
        ).withName("color"),
        MemoryLayout.paddingLayout(16)
    ).withName("_PangoAttrColor");
    public static MemoryLayout $LAYOUT() {
        return _PangoAttrColor.$struct$LAYOUT;
    }
    public static MemorySegment attr$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment color$slice(MemorySegment seg) {
        return seg.asSlice(16, 6);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


