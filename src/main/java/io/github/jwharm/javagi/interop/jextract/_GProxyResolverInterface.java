// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GProxyResolverInterface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("is_supported"),
        Constants$root.C_POINTER$LAYOUT.withName("lookup"),
        Constants$root.C_POINTER$LAYOUT.withName("lookup_async"),
        Constants$root.C_POINTER$LAYOUT.withName("lookup_finish")
    ).withName("_GProxyResolverInterface");
    public static MemoryLayout $LAYOUT() {
        return _GProxyResolverInterface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor is_supported$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle is_supported$MH = RuntimeHelper.downcallHandle(
        _GProxyResolverInterface.is_supported$FUNC
    );
    public interface is_supported {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(is_supported fi, MemorySession session) {
            return RuntimeHelper.upcallStub(is_supported.class, fi, _GProxyResolverInterface.is_supported$FUNC, session);
        }
        static is_supported ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_GProxyResolverInterface.is_supported$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle is_supported$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("is_supported"));
    public static VarHandle is_supported$VH() {
        return _GProxyResolverInterface.is_supported$VH;
    }
    public static MemoryAddress is_supported$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GProxyResolverInterface.is_supported$VH.get(seg);
    }
    public static void is_supported$set( MemorySegment seg, MemoryAddress x) {
        _GProxyResolverInterface.is_supported$VH.set(seg, x);
    }
    public static MemoryAddress is_supported$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GProxyResolverInterface.is_supported$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void is_supported$set(MemorySegment seg, long index, MemoryAddress x) {
        _GProxyResolverInterface.is_supported$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static is_supported is_supported (MemorySegment segment, MemorySession session) {
        return is_supported.ofAddress(is_supported$get(segment), session);
    }
    static final FunctionDescriptor lookup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lookup$MH = RuntimeHelper.downcallHandle(
        _GProxyResolverInterface.lookup$FUNC
    );
    public interface lookup {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(lookup fi, MemorySession session) {
            return RuntimeHelper.upcallStub(lookup.class, fi, _GProxyResolverInterface.lookup$FUNC, session);
        }
        static lookup ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GProxyResolverInterface.lookup$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle lookup$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lookup"));
    public static VarHandle lookup$VH() {
        return _GProxyResolverInterface.lookup$VH;
    }
    public static MemoryAddress lookup$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GProxyResolverInterface.lookup$VH.get(seg);
    }
    public static void lookup$set( MemorySegment seg, MemoryAddress x) {
        _GProxyResolverInterface.lookup$VH.set(seg, x);
    }
    public static MemoryAddress lookup$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GProxyResolverInterface.lookup$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lookup$set(MemorySegment seg, long index, MemoryAddress x) {
        _GProxyResolverInterface.lookup$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static lookup lookup (MemorySegment segment, MemorySession session) {
        return lookup.ofAddress(lookup$get(segment), session);
    }
    static final FunctionDescriptor lookup_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lookup_async$MH = RuntimeHelper.downcallHandle(
        _GProxyResolverInterface.lookup_async$FUNC
    );
    public interface lookup_async {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(lookup_async fi, MemorySession session) {
            return RuntimeHelper.upcallStub(lookup_async.class, fi, _GProxyResolverInterface.lookup_async$FUNC, session);
        }
        static lookup_async ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    _GProxyResolverInterface.lookup_async$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle lookup_async$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lookup_async"));
    public static VarHandle lookup_async$VH() {
        return _GProxyResolverInterface.lookup_async$VH;
    }
    public static MemoryAddress lookup_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GProxyResolverInterface.lookup_async$VH.get(seg);
    }
    public static void lookup_async$set( MemorySegment seg, MemoryAddress x) {
        _GProxyResolverInterface.lookup_async$VH.set(seg, x);
    }
    public static MemoryAddress lookup_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GProxyResolverInterface.lookup_async$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lookup_async$set(MemorySegment seg, long index, MemoryAddress x) {
        _GProxyResolverInterface.lookup_async$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static lookup_async lookup_async (MemorySegment segment, MemorySession session) {
        return lookup_async.ofAddress(lookup_async$get(segment), session);
    }
    static final FunctionDescriptor lookup_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lookup_finish$MH = RuntimeHelper.downcallHandle(
        _GProxyResolverInterface.lookup_finish$FUNC
    );
    public interface lookup_finish {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(lookup_finish fi, MemorySession session) {
            return RuntimeHelper.upcallStub(lookup_finish.class, fi, _GProxyResolverInterface.lookup_finish$FUNC, session);
        }
        static lookup_finish ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GProxyResolverInterface.lookup_finish$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle lookup_finish$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lookup_finish"));
    public static VarHandle lookup_finish$VH() {
        return _GProxyResolverInterface.lookup_finish$VH;
    }
    public static MemoryAddress lookup_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GProxyResolverInterface.lookup_finish$VH.get(seg);
    }
    public static void lookup_finish$set( MemorySegment seg, MemoryAddress x) {
        _GProxyResolverInterface.lookup_finish$VH.set(seg, x);
    }
    public static MemoryAddress lookup_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GProxyResolverInterface.lookup_finish$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lookup_finish$set(MemorySegment seg, long index, MemoryAddress x) {
        _GProxyResolverInterface.lookup_finish$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static lookup_finish lookup_finish (MemorySegment segment, MemorySession session) {
        return lookup_finish.ofAddress(lookup_finish$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


