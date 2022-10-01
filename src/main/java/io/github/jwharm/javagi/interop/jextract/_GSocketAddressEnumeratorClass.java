// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GSocketAddressEnumeratorClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
        Constants$root.C_POINTER$LAYOUT.withName("next"),
        Constants$root.C_POINTER$LAYOUT.withName("next_async"),
        Constants$root.C_POINTER$LAYOUT.withName("next_finish")
    ).withName("_GSocketAddressEnumeratorClass");
    public static MemoryLayout $LAYOUT() {
        return _GSocketAddressEnumeratorClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor next$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle next$MH = RuntimeHelper.downcallHandle(
        _GSocketAddressEnumeratorClass.next$FUNC
    );
    public interface next {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(next fi, MemorySession session) {
            return RuntimeHelper.upcallStub(next.class, fi, _GSocketAddressEnumeratorClass.next$FUNC, session);
        }
        static next ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GSocketAddressEnumeratorClass.next$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next"));
    public static VarHandle next$VH() {
        return _GSocketAddressEnumeratorClass.next$VH;
    }
    public static MemoryAddress next$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSocketAddressEnumeratorClass.next$VH.get(seg);
    }
    public static void next$set( MemorySegment seg, MemoryAddress x) {
        _GSocketAddressEnumeratorClass.next$VH.set(seg, x);
    }
    public static MemoryAddress next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSocketAddressEnumeratorClass.next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketAddressEnumeratorClass.next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static next next (MemorySegment segment, MemorySession session) {
        return next.ofAddress(next$get(segment), session);
    }
    static final FunctionDescriptor next_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle next_async$MH = RuntimeHelper.downcallHandle(
        _GSocketAddressEnumeratorClass.next_async$FUNC
    );
    public interface next_async {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(next_async fi, MemorySession session) {
            return RuntimeHelper.upcallStub(next_async.class, fi, _GSocketAddressEnumeratorClass.next_async$FUNC, session);
        }
        static next_async ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    _GSocketAddressEnumeratorClass.next_async$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle next_async$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next_async"));
    public static VarHandle next_async$VH() {
        return _GSocketAddressEnumeratorClass.next_async$VH;
    }
    public static MemoryAddress next_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSocketAddressEnumeratorClass.next_async$VH.get(seg);
    }
    public static void next_async$set( MemorySegment seg, MemoryAddress x) {
        _GSocketAddressEnumeratorClass.next_async$VH.set(seg, x);
    }
    public static MemoryAddress next_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSocketAddressEnumeratorClass.next_async$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next_async$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketAddressEnumeratorClass.next_async$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static next_async next_async (MemorySegment segment, MemorySession session) {
        return next_async.ofAddress(next_async$get(segment), session);
    }
    static final FunctionDescriptor next_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle next_finish$MH = RuntimeHelper.downcallHandle(
        _GSocketAddressEnumeratorClass.next_finish$FUNC
    );
    public interface next_finish {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(next_finish fi, MemorySession session) {
            return RuntimeHelper.upcallStub(next_finish.class, fi, _GSocketAddressEnumeratorClass.next_finish$FUNC, session);
        }
        static next_finish ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GSocketAddressEnumeratorClass.next_finish$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle next_finish$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next_finish"));
    public static VarHandle next_finish$VH() {
        return _GSocketAddressEnumeratorClass.next_finish$VH;
    }
    public static MemoryAddress next_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSocketAddressEnumeratorClass.next_finish$VH.get(seg);
    }
    public static void next_finish$set( MemorySegment seg, MemoryAddress x) {
        _GSocketAddressEnumeratorClass.next_finish$VH.set(seg, x);
    }
    public static MemoryAddress next_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSocketAddressEnumeratorClass.next_finish$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next_finish$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketAddressEnumeratorClass.next_finish$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static next_finish next_finish (MemorySegment segment, MemorySession session) {
        return next_finish.ofAddress(next_finish$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


