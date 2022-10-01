// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GSourceCallbackFuncs {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ref"),
        Constants$root.C_POINTER$LAYOUT.withName("unref"),
        Constants$root.C_POINTER$LAYOUT.withName("get")
    ).withName("_GSourceCallbackFuncs");
    public static MemoryLayout $LAYOUT() {
        return _GSourceCallbackFuncs.$struct$LAYOUT;
    }
    static final FunctionDescriptor ref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ref$MH = RuntimeHelper.downcallHandle(
        _GSourceCallbackFuncs.ref$FUNC
    );
    public interface ref {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(ref fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ref.class, fi, _GSourceCallbackFuncs.ref$FUNC, session);
        }
        static ref ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GSourceCallbackFuncs.ref$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ref$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ref"));
    public static VarHandle ref$VH() {
        return _GSourceCallbackFuncs.ref$VH;
    }
    public static MemoryAddress ref$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSourceCallbackFuncs.ref$VH.get(seg);
    }
    public static void ref$set( MemorySegment seg, MemoryAddress x) {
        _GSourceCallbackFuncs.ref$VH.set(seg, x);
    }
    public static MemoryAddress ref$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSourceCallbackFuncs.ref$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ref$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSourceCallbackFuncs.ref$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ref ref (MemorySegment segment, MemorySession session) {
        return ref.ofAddress(ref$get(segment), session);
    }
    static final FunctionDescriptor unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle unref$MH = RuntimeHelper.downcallHandle(
        _GSourceCallbackFuncs.unref$FUNC
    );
    public interface unref {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(unref fi, MemorySession session) {
            return RuntimeHelper.upcallStub(unref.class, fi, _GSourceCallbackFuncs.unref$FUNC, session);
        }
        static unref ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GSourceCallbackFuncs.unref$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle unref$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("unref"));
    public static VarHandle unref$VH() {
        return _GSourceCallbackFuncs.unref$VH;
    }
    public static MemoryAddress unref$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSourceCallbackFuncs.unref$VH.get(seg);
    }
    public static void unref$set( MemorySegment seg, MemoryAddress x) {
        _GSourceCallbackFuncs.unref$VH.set(seg, x);
    }
    public static MemoryAddress unref$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSourceCallbackFuncs.unref$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void unref$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSourceCallbackFuncs.unref$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static unref unref (MemorySegment segment, MemorySession session) {
        return unref.ofAddress(unref$get(segment), session);
    }
    static final FunctionDescriptor get$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get$MH = RuntimeHelper.downcallHandle(
        _GSourceCallbackFuncs.get$FUNC
    );
    public interface get {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(get fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get.class, fi, _GSourceCallbackFuncs.get$FUNC, session);
        }
        static get ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    _GSourceCallbackFuncs.get$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get"));
    public static VarHandle get$VH() {
        return _GSourceCallbackFuncs.get$VH;
    }
    public static MemoryAddress get$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSourceCallbackFuncs.get$VH.get(seg);
    }
    public static void get$set( MemorySegment seg, MemoryAddress x) {
        _GSourceCallbackFuncs.get$VH.set(seg, x);
    }
    public static MemoryAddress get$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSourceCallbackFuncs.get$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSourceCallbackFuncs.get$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get get (MemorySegment segment, MemorySession session) {
        return get.ofAddress(get$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


