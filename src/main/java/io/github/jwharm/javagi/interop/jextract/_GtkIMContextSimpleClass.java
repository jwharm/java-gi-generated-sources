// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkIMContextSimpleClass {

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
            Constants$root.C_POINTER$LAYOUT.withName("preedit_start"),
            Constants$root.C_POINTER$LAYOUT.withName("preedit_end"),
            Constants$root.C_POINTER$LAYOUT.withName("preedit_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("commit"),
            Constants$root.C_POINTER$LAYOUT.withName("retrieve_surrounding"),
            Constants$root.C_POINTER$LAYOUT.withName("delete_surrounding"),
            Constants$root.C_POINTER$LAYOUT.withName("set_client_widget"),
            Constants$root.C_POINTER$LAYOUT.withName("get_preedit_string"),
            Constants$root.C_POINTER$LAYOUT.withName("filter_keypress"),
            Constants$root.C_POINTER$LAYOUT.withName("focus_in"),
            Constants$root.C_POINTER$LAYOUT.withName("focus_out"),
            Constants$root.C_POINTER$LAYOUT.withName("reset"),
            Constants$root.C_POINTER$LAYOUT.withName("set_cursor_location"),
            Constants$root.C_POINTER$LAYOUT.withName("set_use_preedit"),
            Constants$root.C_POINTER$LAYOUT.withName("set_surrounding"),
            Constants$root.C_POINTER$LAYOUT.withName("get_surrounding"),
            Constants$root.C_POINTER$LAYOUT.withName("set_surrounding_with_selection"),
            Constants$root.C_POINTER$LAYOUT.withName("get_surrounding_with_selection"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved5")
        ).withName("parent_class")
    ).withName("_GtkIMContextSimpleClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkIMContextSimpleClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 320);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


