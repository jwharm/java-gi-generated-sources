// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GTypeModuleClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("load"),
        Constants$root.C_POINTER$LAYOUT.withName("unload"),
        Constants$root.C_POINTER$LAYOUT.withName("reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("reserved4")
    ).withName("_GTypeModuleClass");
    public static MemoryLayout $LAYOUT() {
        return _GTypeModuleClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor load$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle load$MH = RuntimeHelper.downcallHandle(
        _GTypeModuleClass.load$FUNC
    );
    public interface load {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(load fi, MemorySession session) {
            return RuntimeHelper.upcallStub(load.class, fi, _GTypeModuleClass.load$FUNC, session);
        }
        static load ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_GTypeModuleClass.load$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle load$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("load"));
    public static VarHandle load$VH() {
        return _GTypeModuleClass.load$VH;
    }
    public static MemoryAddress load$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTypeModuleClass.load$VH.get(seg);
    }
    public static void load$set( MemorySegment seg, MemoryAddress x) {
        _GTypeModuleClass.load$VH.set(seg, x);
    }
    public static MemoryAddress load$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTypeModuleClass.load$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void load$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypeModuleClass.load$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static load load (MemorySegment segment, MemorySession session) {
        return load.ofAddress(load$get(segment), session);
    }
    static final FunctionDescriptor unload$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle unload$MH = RuntimeHelper.downcallHandle(
        _GTypeModuleClass.unload$FUNC
    );
    public interface unload {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(unload fi, MemorySession session) {
            return RuntimeHelper.upcallStub(unload.class, fi, _GTypeModuleClass.unload$FUNC, session);
        }
        static unload ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GTypeModuleClass.unload$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle unload$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("unload"));
    public static VarHandle unload$VH() {
        return _GTypeModuleClass.unload$VH;
    }
    public static MemoryAddress unload$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTypeModuleClass.unload$VH.get(seg);
    }
    public static void unload$set( MemorySegment seg, MemoryAddress x) {
        _GTypeModuleClass.unload$VH.set(seg, x);
    }
    public static MemoryAddress unload$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTypeModuleClass.unload$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void unload$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypeModuleClass.unload$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static unload unload (MemorySegment segment, MemorySession session) {
        return unload.ofAddress(unload$get(segment), session);
    }
    static final FunctionDescriptor reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle reserved1$MH = RuntimeHelper.downcallHandle(
        _GTypeModuleClass.reserved1$FUNC
    );
    public interface reserved1 {

        void apply();
        static MemorySegment allocate(reserved1 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(reserved1.class, fi, _GTypeModuleClass.reserved1$FUNC, session);
        }
        static reserved1 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GTypeModuleClass.reserved1$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved1"));
    public static VarHandle reserved1$VH() {
        return _GTypeModuleClass.reserved1$VH;
    }
    public static MemoryAddress reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTypeModuleClass.reserved1$VH.get(seg);
    }
    public static void reserved1$set( MemorySegment seg, MemoryAddress x) {
        _GTypeModuleClass.reserved1$VH.set(seg, x);
    }
    public static MemoryAddress reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTypeModuleClass.reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypeModuleClass.reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved1 reserved1 (MemorySegment segment, MemorySession session) {
        return reserved1.ofAddress(reserved1$get(segment), session);
    }
    static final FunctionDescriptor reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle reserved2$MH = RuntimeHelper.downcallHandle(
        _GTypeModuleClass.reserved2$FUNC
    );
    public interface reserved2 {

        void apply();
        static MemorySegment allocate(reserved2 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(reserved2.class, fi, _GTypeModuleClass.reserved2$FUNC, session);
        }
        static reserved2 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GTypeModuleClass.reserved2$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved2"));
    public static VarHandle reserved2$VH() {
        return _GTypeModuleClass.reserved2$VH;
    }
    public static MemoryAddress reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTypeModuleClass.reserved2$VH.get(seg);
    }
    public static void reserved2$set( MemorySegment seg, MemoryAddress x) {
        _GTypeModuleClass.reserved2$VH.set(seg, x);
    }
    public static MemoryAddress reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTypeModuleClass.reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypeModuleClass.reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved2 reserved2 (MemorySegment segment, MemorySession session) {
        return reserved2.ofAddress(reserved2$get(segment), session);
    }
    static final FunctionDescriptor reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle reserved3$MH = RuntimeHelper.downcallHandle(
        _GTypeModuleClass.reserved3$FUNC
    );
    public interface reserved3 {

        void apply();
        static MemorySegment allocate(reserved3 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(reserved3.class, fi, _GTypeModuleClass.reserved3$FUNC, session);
        }
        static reserved3 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GTypeModuleClass.reserved3$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved3"));
    public static VarHandle reserved3$VH() {
        return _GTypeModuleClass.reserved3$VH;
    }
    public static MemoryAddress reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTypeModuleClass.reserved3$VH.get(seg);
    }
    public static void reserved3$set( MemorySegment seg, MemoryAddress x) {
        _GTypeModuleClass.reserved3$VH.set(seg, x);
    }
    public static MemoryAddress reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTypeModuleClass.reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved3$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypeModuleClass.reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved3 reserved3 (MemorySegment segment, MemorySession session) {
        return reserved3.ofAddress(reserved3$get(segment), session);
    }
    static final FunctionDescriptor reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle reserved4$MH = RuntimeHelper.downcallHandle(
        _GTypeModuleClass.reserved4$FUNC
    );
    public interface reserved4 {

        void apply();
        static MemorySegment allocate(reserved4 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(reserved4.class, fi, _GTypeModuleClass.reserved4$FUNC, session);
        }
        static reserved4 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GTypeModuleClass.reserved4$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved4"));
    public static VarHandle reserved4$VH() {
        return _GTypeModuleClass.reserved4$VH;
    }
    public static MemoryAddress reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTypeModuleClass.reserved4$VH.get(seg);
    }
    public static void reserved4$set( MemorySegment seg, MemoryAddress x) {
        _GTypeModuleClass.reserved4$VH.set(seg, x);
    }
    public static MemoryAddress reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTypeModuleClass.reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved4$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypeModuleClass.reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved4 reserved4 (MemorySegment segment, MemorySession session) {
        return reserved4.ofAddress(reserved4$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


