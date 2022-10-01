// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GSeekableIface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("tell"),
        Constants$root.C_POINTER$LAYOUT.withName("can_seek"),
        Constants$root.C_POINTER$LAYOUT.withName("seek"),
        Constants$root.C_POINTER$LAYOUT.withName("can_truncate"),
        Constants$root.C_POINTER$LAYOUT.withName("truncate_fn")
    ).withName("_GSeekableIface");
    public static MemoryLayout $LAYOUT() {
        return _GSeekableIface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor tell$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle tell$MH = RuntimeHelper.downcallHandle(
        _GSeekableIface.tell$FUNC
    );
    public interface tell {

        long apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(tell fi, MemorySession session) {
            return RuntimeHelper.upcallStub(tell.class, fi, _GSeekableIface.tell$FUNC, session);
        }
        static tell ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (long)_GSeekableIface.tell$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle tell$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tell"));
    public static VarHandle tell$VH() {
        return _GSeekableIface.tell$VH;
    }
    public static MemoryAddress tell$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSeekableIface.tell$VH.get(seg);
    }
    public static void tell$set( MemorySegment seg, MemoryAddress x) {
        _GSeekableIface.tell$VH.set(seg, x);
    }
    public static MemoryAddress tell$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSeekableIface.tell$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tell$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSeekableIface.tell$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static tell tell (MemorySegment segment, MemorySession session) {
        return tell.ofAddress(tell$get(segment), session);
    }
    static final FunctionDescriptor can_seek$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle can_seek$MH = RuntimeHelper.downcallHandle(
        _GSeekableIface.can_seek$FUNC
    );
    public interface can_seek {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(can_seek fi, MemorySession session) {
            return RuntimeHelper.upcallStub(can_seek.class, fi, _GSeekableIface.can_seek$FUNC, session);
        }
        static can_seek ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_GSeekableIface.can_seek$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle can_seek$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("can_seek"));
    public static VarHandle can_seek$VH() {
        return _GSeekableIface.can_seek$VH;
    }
    public static MemoryAddress can_seek$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSeekableIface.can_seek$VH.get(seg);
    }
    public static void can_seek$set( MemorySegment seg, MemoryAddress x) {
        _GSeekableIface.can_seek$VH.set(seg, x);
    }
    public static MemoryAddress can_seek$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSeekableIface.can_seek$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void can_seek$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSeekableIface.can_seek$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static can_seek can_seek (MemorySegment segment, MemorySession session) {
        return can_seek.ofAddress(can_seek$get(segment), session);
    }
    static final FunctionDescriptor seek$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle seek$MH = RuntimeHelper.downcallHandle(
        _GSeekableIface.seek$FUNC
    );
    public interface seek {

        int apply(java.lang.foreign.MemoryAddress _x0, long _x1, int _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(seek fi, MemorySession session) {
            return RuntimeHelper.upcallStub(seek.class, fi, _GSeekableIface.seek$FUNC, session);
        }
        static seek ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, long __x1, int __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    return (int)_GSeekableIface.seek$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle seek$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("seek"));
    public static VarHandle seek$VH() {
        return _GSeekableIface.seek$VH;
    }
    public static MemoryAddress seek$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSeekableIface.seek$VH.get(seg);
    }
    public static void seek$set( MemorySegment seg, MemoryAddress x) {
        _GSeekableIface.seek$VH.set(seg, x);
    }
    public static MemoryAddress seek$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSeekableIface.seek$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void seek$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSeekableIface.seek$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static seek seek (MemorySegment segment, MemorySession session) {
        return seek.ofAddress(seek$get(segment), session);
    }
    static final FunctionDescriptor can_truncate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle can_truncate$MH = RuntimeHelper.downcallHandle(
        _GSeekableIface.can_truncate$FUNC
    );
    public interface can_truncate {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(can_truncate fi, MemorySession session) {
            return RuntimeHelper.upcallStub(can_truncate.class, fi, _GSeekableIface.can_truncate$FUNC, session);
        }
        static can_truncate ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_GSeekableIface.can_truncate$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle can_truncate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("can_truncate"));
    public static VarHandle can_truncate$VH() {
        return _GSeekableIface.can_truncate$VH;
    }
    public static MemoryAddress can_truncate$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSeekableIface.can_truncate$VH.get(seg);
    }
    public static void can_truncate$set( MemorySegment seg, MemoryAddress x) {
        _GSeekableIface.can_truncate$VH.set(seg, x);
    }
    public static MemoryAddress can_truncate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSeekableIface.can_truncate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void can_truncate$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSeekableIface.can_truncate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static can_truncate can_truncate (MemorySegment segment, MemorySession session) {
        return can_truncate.ofAddress(can_truncate$get(segment), session);
    }
    static final FunctionDescriptor truncate_fn$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle truncate_fn$MH = RuntimeHelper.downcallHandle(
        _GSeekableIface.truncate_fn$FUNC
    );
    public interface truncate_fn {

        int apply(java.lang.foreign.MemoryAddress _x0, long _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(truncate_fn fi, MemorySession session) {
            return RuntimeHelper.upcallStub(truncate_fn.class, fi, _GSeekableIface.truncate_fn$FUNC, session);
        }
        static truncate_fn ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, long __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (int)_GSeekableIface.truncate_fn$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle truncate_fn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("truncate_fn"));
    public static VarHandle truncate_fn$VH() {
        return _GSeekableIface.truncate_fn$VH;
    }
    public static MemoryAddress truncate_fn$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSeekableIface.truncate_fn$VH.get(seg);
    }
    public static void truncate_fn$set( MemorySegment seg, MemoryAddress x) {
        _GSeekableIface.truncate_fn$VH.set(seg, x);
    }
    public static MemoryAddress truncate_fn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSeekableIface.truncate_fn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void truncate_fn$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSeekableIface.truncate_fn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static truncate_fn truncate_fn (MemorySegment segment, MemorySession session) {
        return truncate_fn.ofAddress(truncate_fn$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


