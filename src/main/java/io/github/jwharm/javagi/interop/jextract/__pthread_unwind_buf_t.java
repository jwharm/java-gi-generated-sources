// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class __pthread_unwind_buf_t {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(8, Constants$root.C_LONG_LONG$LAYOUT).withName("__cancel_jmp_buf"),
            Constants$root.C_INT$LAYOUT.withName("__mask_was_saved"),
            MemoryLayout.paddingLayout(32)
        ).withName("__cancel_jmp_buf_tag")).withName("__cancel_jmp_buf"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_POINTER$LAYOUT).withName("__pad")
    );
    public static MemoryLayout $LAYOUT() {
        return __pthread_unwind_buf_t.$struct$LAYOUT;
    }
    public static MemorySegment __cancel_jmp_buf$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    public static MemorySegment __pad$slice(MemorySegment seg) {
        return seg.asSlice(72, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


