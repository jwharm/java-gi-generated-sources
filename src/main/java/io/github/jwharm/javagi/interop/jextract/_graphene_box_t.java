// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _graphene_box_t {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("__graphene_private_value")
        ).withName("__graphene_private_min"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, Constants$root.C_FLOAT$LAYOUT).withName("__graphene_private_value")
        ).withName("__graphene_private_max")
    ).withName("_graphene_box_t");
    public static MemoryLayout $LAYOUT() {
        return _graphene_box_t.$struct$LAYOUT;
    }
    public static MemorySegment __graphene_private_min$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment __graphene_private_max$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


