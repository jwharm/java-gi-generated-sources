// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkCheckButtonClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("toggled"),
        Constants$root.C_POINTER$LAYOUT.withName("activate"),
        MemoryLayout.sequenceLayout(7, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GtkCheckButtonClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkCheckButtonClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 408);
    }
    static final FunctionDescriptor toggled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle toggled$MH = RuntimeHelper.downcallHandle(
        _GtkCheckButtonClass.toggled$FUNC
    );
    public interface toggled {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(toggled fi, MemorySession session) {
            return RuntimeHelper.upcallStub(toggled.class, fi, _GtkCheckButtonClass.toggled$FUNC, session);
        }
        static toggled ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GtkCheckButtonClass.toggled$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle toggled$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("toggled"));
    public static VarHandle toggled$VH() {
        return _GtkCheckButtonClass.toggled$VH;
    }
    public static MemoryAddress toggled$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCheckButtonClass.toggled$VH.get(seg);
    }
    public static void toggled$set( MemorySegment seg, MemoryAddress x) {
        _GtkCheckButtonClass.toggled$VH.set(seg, x);
    }
    public static MemoryAddress toggled$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCheckButtonClass.toggled$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void toggled$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCheckButtonClass.toggled$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static toggled toggled (MemorySegment segment, MemorySession session) {
        return toggled.ofAddress(toggled$get(segment), session);
    }
    static final FunctionDescriptor activate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle activate$MH = RuntimeHelper.downcallHandle(
        _GtkCheckButtonClass.activate$FUNC
    );
    public interface activate {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(activate fi, MemorySession session) {
            return RuntimeHelper.upcallStub(activate.class, fi, _GtkCheckButtonClass.activate$FUNC, session);
        }
        static activate ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GtkCheckButtonClass.activate$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle activate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("activate"));
    public static VarHandle activate$VH() {
        return _GtkCheckButtonClass.activate$VH;
    }
    public static MemoryAddress activate$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCheckButtonClass.activate$VH.get(seg);
    }
    public static void activate$set( MemorySegment seg, MemoryAddress x) {
        _GtkCheckButtonClass.activate$VH.set(seg, x);
    }
    public static MemoryAddress activate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCheckButtonClass.activate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void activate$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCheckButtonClass.activate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static activate activate (MemorySegment segment, MemorySession session) {
        return activate.ofAddress(activate$get(segment), session);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(424, 56);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


