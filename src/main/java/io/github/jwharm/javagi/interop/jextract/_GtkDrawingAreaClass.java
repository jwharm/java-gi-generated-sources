// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkDrawingAreaClass {

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
            Constants$root.C_POINTER$LAYOUT.withName("show"),
            Constants$root.C_POINTER$LAYOUT.withName("hide"),
            Constants$root.C_POINTER$LAYOUT.withName("map"),
            Constants$root.C_POINTER$LAYOUT.withName("unmap"),
            Constants$root.C_POINTER$LAYOUT.withName("realize"),
            Constants$root.C_POINTER$LAYOUT.withName("unrealize"),
            Constants$root.C_POINTER$LAYOUT.withName("root"),
            Constants$root.C_POINTER$LAYOUT.withName("unroot"),
            Constants$root.C_POINTER$LAYOUT.withName("size_allocate"),
            Constants$root.C_POINTER$LAYOUT.withName("state_flags_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("direction_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("get_request_mode"),
            Constants$root.C_POINTER$LAYOUT.withName("measure"),
            Constants$root.C_POINTER$LAYOUT.withName("mnemonic_activate"),
            Constants$root.C_POINTER$LAYOUT.withName("grab_focus"),
            Constants$root.C_POINTER$LAYOUT.withName("focus"),
            Constants$root.C_POINTER$LAYOUT.withName("set_focus_child"),
            Constants$root.C_POINTER$LAYOUT.withName("move_focus"),
            Constants$root.C_POINTER$LAYOUT.withName("keynav_failed"),
            Constants$root.C_POINTER$LAYOUT.withName("query_tooltip"),
            Constants$root.C_POINTER$LAYOUT.withName("compute_expand"),
            Constants$root.C_POINTER$LAYOUT.withName("css_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("system_setting_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("snapshot"),
            Constants$root.C_POINTER$LAYOUT.withName("contains"),
            Constants$root.C_POINTER$LAYOUT.withName("priv"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("padding")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("resize"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GtkDrawingAreaClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkDrawingAreaClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 408);
    }
    static final FunctionDescriptor resize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle resize$MH = RuntimeHelper.downcallHandle(
        _GtkDrawingAreaClass.resize$FUNC
    );
    public interface resize {

        void apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2);
        static MemorySegment allocate(resize fi, MemorySession session) {
            return RuntimeHelper.upcallStub(resize.class, fi, _GtkDrawingAreaClass.resize$FUNC, session);
        }
        static resize ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2) -> {
                try {
                    _GtkDrawingAreaClass.resize$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle resize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("resize"));
    public static VarHandle resize$VH() {
        return _GtkDrawingAreaClass.resize$VH;
    }
    public static MemoryAddress resize$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkDrawingAreaClass.resize$VH.get(seg);
    }
    public static void resize$set( MemorySegment seg, MemoryAddress x) {
        _GtkDrawingAreaClass.resize$VH.set(seg, x);
    }
    public static MemoryAddress resize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkDrawingAreaClass.resize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void resize$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkDrawingAreaClass.resize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static resize resize (MemorySegment segment, MemorySession session) {
        return resize.ofAddress(resize$get(segment), session);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(416, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


