// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class GtkBoolFilterClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG_LONG$LAYOUT.withName("g_type")
                ).withName("g_type_class"),
                Constants$root.C_POINTER$LAYOUT.withName("construct_properties"),
                Constants$root.C_POINTER$LAYOUT.withName("constructor"),
                Constants$root.C_POINTER$LAYOUT.withName("set_property"),
                Constants$root.C_POINTER$LAYOUT.withName("get_property"),
                Constants$root.C_POINTER$LAYOUT.withName("dispose"),
                Constants$root.C_POINTER$LAYOUT.withName("finalize"),
                Constants$root.C_POINTER$LAYOUT.withName("dispatch_properties_changed"),
                Constants$root.C_POINTER$LAYOUT.withName("notify"),
                Constants$root.C_POINTER$LAYOUT.withName("constructed"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("flags"),
                MemoryLayout.sequenceLayout(6, Constants$root.C_POINTER$LAYOUT).withName("pdummy")
            ).withName("parent_class"),
            Constants$root.C_POINTER$LAYOUT.withName("match"),
            Constants$root.C_POINTER$LAYOUT.withName("get_strictness"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved5"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved6"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved7"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved8")
        ).withName("parent_class")
    );
    public static MemoryLayout $LAYOUT() {
        return GtkBoolFilterClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 216);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


