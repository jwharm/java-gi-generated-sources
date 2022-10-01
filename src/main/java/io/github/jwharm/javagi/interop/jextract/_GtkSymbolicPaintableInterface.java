// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkSymbolicPaintableInterface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("snapshot_symbolic")
    ).withName("_GtkSymbolicPaintableInterface");
    public static MemoryLayout $LAYOUT() {
        return _GtkSymbolicPaintableInterface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor snapshot_symbolic$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle snapshot_symbolic$MH = RuntimeHelper.downcallHandle(
        _GtkSymbolicPaintableInterface.snapshot_symbolic$FUNC
    );
    public interface snapshot_symbolic {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, double _x2, double _x3, java.lang.foreign.MemoryAddress _x4, long _x5);
        static MemorySegment allocate(snapshot_symbolic fi, MemorySession session) {
            return RuntimeHelper.upcallStub(snapshot_symbolic.class, fi, _GtkSymbolicPaintableInterface.snapshot_symbolic$FUNC, session);
        }
        static snapshot_symbolic ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, double __x2, double __x3, java.lang.foreign.MemoryAddress __x4, long __x5) -> {
                try {
                    _GtkSymbolicPaintableInterface.snapshot_symbolic$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, __x3, (java.lang.foreign.Addressable)__x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle snapshot_symbolic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("snapshot_symbolic"));
    public static VarHandle snapshot_symbolic$VH() {
        return _GtkSymbolicPaintableInterface.snapshot_symbolic$VH;
    }
    public static MemoryAddress snapshot_symbolic$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkSymbolicPaintableInterface.snapshot_symbolic$VH.get(seg);
    }
    public static void snapshot_symbolic$set( MemorySegment seg, MemoryAddress x) {
        _GtkSymbolicPaintableInterface.snapshot_symbolic$VH.set(seg, x);
    }
    public static MemoryAddress snapshot_symbolic$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkSymbolicPaintableInterface.snapshot_symbolic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void snapshot_symbolic$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkSymbolicPaintableInterface.snapshot_symbolic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static snapshot_symbolic snapshot_symbolic (MemorySegment segment, MemorySession session) {
        return snapshot_symbolic.ofAddress(snapshot_symbolic$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


