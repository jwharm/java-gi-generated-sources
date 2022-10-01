// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkTreeDragDestIface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("drag_data_received"),
        Constants$root.C_POINTER$LAYOUT.withName("row_drop_possible")
    ).withName("_GtkTreeDragDestIface");
    public static MemoryLayout $LAYOUT() {
        return _GtkTreeDragDestIface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor drag_data_received$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle drag_data_received$MH = RuntimeHelper.downcallHandle(
        _GtkTreeDragDestIface.drag_data_received$FUNC
    );
    public interface drag_data_received {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(drag_data_received fi, MemorySession session) {
            return RuntimeHelper.upcallStub(drag_data_received.class, fi, _GtkTreeDragDestIface.drag_data_received$FUNC, session);
        }
        static drag_data_received ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)_GtkTreeDragDestIface.drag_data_received$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle drag_data_received$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("drag_data_received"));
    public static VarHandle drag_data_received$VH() {
        return _GtkTreeDragDestIface.drag_data_received$VH;
    }
    public static MemoryAddress drag_data_received$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkTreeDragDestIface.drag_data_received$VH.get(seg);
    }
    public static void drag_data_received$set( MemorySegment seg, MemoryAddress x) {
        _GtkTreeDragDestIface.drag_data_received$VH.set(seg, x);
    }
    public static MemoryAddress drag_data_received$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkTreeDragDestIface.drag_data_received$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void drag_data_received$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkTreeDragDestIface.drag_data_received$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static drag_data_received drag_data_received (MemorySegment segment, MemorySession session) {
        return drag_data_received.ofAddress(drag_data_received$get(segment), session);
    }
    static final FunctionDescriptor row_drop_possible$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle row_drop_possible$MH = RuntimeHelper.downcallHandle(
        _GtkTreeDragDestIface.row_drop_possible$FUNC
    );
    public interface row_drop_possible {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(row_drop_possible fi, MemorySession session) {
            return RuntimeHelper.upcallStub(row_drop_possible.class, fi, _GtkTreeDragDestIface.row_drop_possible$FUNC, session);
        }
        static row_drop_possible ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)_GtkTreeDragDestIface.row_drop_possible$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle row_drop_possible$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("row_drop_possible"));
    public static VarHandle row_drop_possible$VH() {
        return _GtkTreeDragDestIface.row_drop_possible$VH;
    }
    public static MemoryAddress row_drop_possible$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkTreeDragDestIface.row_drop_possible$VH.get(seg);
    }
    public static void row_drop_possible$set( MemorySegment seg, MemoryAddress x) {
        _GtkTreeDragDestIface.row_drop_possible$VH.set(seg, x);
    }
    public static MemoryAddress row_drop_possible$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkTreeDragDestIface.row_drop_possible$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void row_drop_possible$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkTreeDragDestIface.row_drop_possible$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static row_drop_possible row_drop_possible (MemorySegment segment, MemorySession session) {
        return row_drop_possible.ofAddress(row_drop_possible$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


