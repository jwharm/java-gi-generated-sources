// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GSocketControlMessageClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("get_size"),
        Constants$root.C_POINTER$LAYOUT.withName("get_level"),
        Constants$root.C_POINTER$LAYOUT.withName("get_type"),
        Constants$root.C_POINTER$LAYOUT.withName("serialize"),
        Constants$root.C_POINTER$LAYOUT.withName("deserialize"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved4"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved5")
    ).withName("_GSocketControlMessageClass");
    public static MemoryLayout $LAYOUT() {
        return _GSocketControlMessageClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor get_size$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_size$MH = RuntimeHelper.downcallHandle(
        _GSocketControlMessageClass.get_size$FUNC
    );
    public interface get_size {

        long apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_size fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_size.class, fi, _GSocketControlMessageClass.get_size$FUNC, session);
        }
        static get_size ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (long)_GSocketControlMessageClass.get_size$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_size"));
    public static VarHandle get_size$VH() {
        return _GSocketControlMessageClass.get_size$VH;
    }
    public static MemoryAddress get_size$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass.get_size$VH.get(seg);
    }
    public static void get_size$set( MemorySegment seg, MemoryAddress x) {
        _GSocketControlMessageClass.get_size$VH.set(seg, x);
    }
    public static MemoryAddress get_size$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass.get_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_size$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketControlMessageClass.get_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_size get_size (MemorySegment segment, MemorySession session) {
        return get_size.ofAddress(get_size$get(segment), session);
    }
    static final FunctionDescriptor get_level$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_level$MH = RuntimeHelper.downcallHandle(
        _GSocketControlMessageClass.get_level$FUNC
    );
    public interface get_level {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_level fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_level.class, fi, _GSocketControlMessageClass.get_level$FUNC, session);
        }
        static get_level ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_GSocketControlMessageClass.get_level$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_level$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_level"));
    public static VarHandle get_level$VH() {
        return _GSocketControlMessageClass.get_level$VH;
    }
    public static MemoryAddress get_level$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass.get_level$VH.get(seg);
    }
    public static void get_level$set( MemorySegment seg, MemoryAddress x) {
        _GSocketControlMessageClass.get_level$VH.set(seg, x);
    }
    public static MemoryAddress get_level$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass.get_level$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_level$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketControlMessageClass.get_level$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_level get_level (MemorySegment segment, MemorySession session) {
        return get_level.ofAddress(get_level$get(segment), session);
    }
    static final FunctionDescriptor get_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_type$MH = RuntimeHelper.downcallHandle(
        _GSocketControlMessageClass.get_type$FUNC
    );
    public interface get_type {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_type fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_type.class, fi, _GSocketControlMessageClass.get_type$FUNC, session);
        }
        static get_type ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_GSocketControlMessageClass.get_type$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_type"));
    public static VarHandle get_type$VH() {
        return _GSocketControlMessageClass.get_type$VH;
    }
    public static MemoryAddress get_type$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass.get_type$VH.get(seg);
    }
    public static void get_type$set( MemorySegment seg, MemoryAddress x) {
        _GSocketControlMessageClass.get_type$VH.set(seg, x);
    }
    public static MemoryAddress get_type$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass.get_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_type$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketControlMessageClass.get_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_type get_type (MemorySegment segment, MemorySession session) {
        return get_type.ofAddress(get_type$get(segment), session);
    }
    static final FunctionDescriptor serialize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle serialize$MH = RuntimeHelper.downcallHandle(
        _GSocketControlMessageClass.serialize$FUNC
    );
    public interface serialize {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(serialize fi, MemorySession session) {
            return RuntimeHelper.upcallStub(serialize.class, fi, _GSocketControlMessageClass.serialize$FUNC, session);
        }
        static serialize ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    _GSocketControlMessageClass.serialize$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle serialize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("serialize"));
    public static VarHandle serialize$VH() {
        return _GSocketControlMessageClass.serialize$VH;
    }
    public static MemoryAddress serialize$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass.serialize$VH.get(seg);
    }
    public static void serialize$set( MemorySegment seg, MemoryAddress x) {
        _GSocketControlMessageClass.serialize$VH.set(seg, x);
    }
    public static MemoryAddress serialize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass.serialize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serialize$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketControlMessageClass.serialize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static serialize serialize (MemorySegment segment, MemorySession session) {
        return serialize.ofAddress(serialize$get(segment), session);
    }
    static final FunctionDescriptor deserialize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle deserialize$MH = RuntimeHelper.downcallHandle(
        _GSocketControlMessageClass.deserialize$FUNC
    );
    public interface deserialize {

        java.lang.foreign.Addressable apply(int _x0, int _x1, long _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(deserialize fi, MemorySession session) {
            return RuntimeHelper.upcallStub(deserialize.class, fi, _GSocketControlMessageClass.deserialize$FUNC, session);
        }
        static deserialize ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (int __x0, int __x1, long __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GSocketControlMessageClass.deserialize$MH.invokeExact((Addressable)symbol, __x0, __x1, __x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle deserialize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("deserialize"));
    public static VarHandle deserialize$VH() {
        return _GSocketControlMessageClass.deserialize$VH;
    }
    public static MemoryAddress deserialize$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass.deserialize$VH.get(seg);
    }
    public static void deserialize$set( MemorySegment seg, MemoryAddress x) {
        _GSocketControlMessageClass.deserialize$VH.set(seg, x);
    }
    public static MemoryAddress deserialize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass.deserialize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void deserialize$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketControlMessageClass.deserialize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static deserialize deserialize (MemorySegment segment, MemorySession session) {
        return deserialize.ofAddress(deserialize$get(segment), session);
    }
    static final FunctionDescriptor _g_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved1$MH = RuntimeHelper.downcallHandle(
        _GSocketControlMessageClass._g_reserved1$FUNC
    );
    public interface _g_reserved1 {

        void apply();
        static MemorySegment allocate(_g_reserved1 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_g_reserved1.class, fi, _GSocketControlMessageClass._g_reserved1$FUNC, session);
        }
        static _g_reserved1 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GSocketControlMessageClass._g_reserved1$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"));
    public static VarHandle _g_reserved1$VH() {
        return _GSocketControlMessageClass._g_reserved1$VH;
    }
    public static MemoryAddress _g_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass._g_reserved1$VH.get(seg);
    }
    public static void _g_reserved1$set( MemorySegment seg, MemoryAddress x) {
        _GSocketControlMessageClass._g_reserved1$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass._g_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketControlMessageClass._g_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved1 _g_reserved1 (MemorySegment segment, MemorySession session) {
        return _g_reserved1.ofAddress(_g_reserved1$get(segment), session);
    }
    static final FunctionDescriptor _g_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved2$MH = RuntimeHelper.downcallHandle(
        _GSocketControlMessageClass._g_reserved2$FUNC
    );
    public interface _g_reserved2 {

        void apply();
        static MemorySegment allocate(_g_reserved2 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_g_reserved2.class, fi, _GSocketControlMessageClass._g_reserved2$FUNC, session);
        }
        static _g_reserved2 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GSocketControlMessageClass._g_reserved2$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"));
    public static VarHandle _g_reserved2$VH() {
        return _GSocketControlMessageClass._g_reserved2$VH;
    }
    public static MemoryAddress _g_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass._g_reserved2$VH.get(seg);
    }
    public static void _g_reserved2$set( MemorySegment seg, MemoryAddress x) {
        _GSocketControlMessageClass._g_reserved2$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass._g_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketControlMessageClass._g_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved2 _g_reserved2 (MemorySegment segment, MemorySession session) {
        return _g_reserved2.ofAddress(_g_reserved2$get(segment), session);
    }
    static final FunctionDescriptor _g_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved3$MH = RuntimeHelper.downcallHandle(
        _GSocketControlMessageClass._g_reserved3$FUNC
    );
    public interface _g_reserved3 {

        void apply();
        static MemorySegment allocate(_g_reserved3 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_g_reserved3.class, fi, _GSocketControlMessageClass._g_reserved3$FUNC, session);
        }
        static _g_reserved3 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GSocketControlMessageClass._g_reserved3$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"));
    public static VarHandle _g_reserved3$VH() {
        return _GSocketControlMessageClass._g_reserved3$VH;
    }
    public static MemoryAddress _g_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass._g_reserved3$VH.get(seg);
    }
    public static void _g_reserved3$set( MemorySegment seg, MemoryAddress x) {
        _GSocketControlMessageClass._g_reserved3$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass._g_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved3$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketControlMessageClass._g_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved3 _g_reserved3 (MemorySegment segment, MemorySession session) {
        return _g_reserved3.ofAddress(_g_reserved3$get(segment), session);
    }
    static final FunctionDescriptor _g_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved4$MH = RuntimeHelper.downcallHandle(
        _GSocketControlMessageClass._g_reserved4$FUNC
    );
    public interface _g_reserved4 {

        void apply();
        static MemorySegment allocate(_g_reserved4 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_g_reserved4.class, fi, _GSocketControlMessageClass._g_reserved4$FUNC, session);
        }
        static _g_reserved4 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GSocketControlMessageClass._g_reserved4$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"));
    public static VarHandle _g_reserved4$VH() {
        return _GSocketControlMessageClass._g_reserved4$VH;
    }
    public static MemoryAddress _g_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass._g_reserved4$VH.get(seg);
    }
    public static void _g_reserved4$set( MemorySegment seg, MemoryAddress x) {
        _GSocketControlMessageClass._g_reserved4$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass._g_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved4$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketControlMessageClass._g_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved4 _g_reserved4 (MemorySegment segment, MemorySession session) {
        return _g_reserved4.ofAddress(_g_reserved4$get(segment), session);
    }
    static final FunctionDescriptor _g_reserved5$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved5$MH = RuntimeHelper.downcallHandle(
        _GSocketControlMessageClass._g_reserved5$FUNC
    );
    public interface _g_reserved5 {

        void apply();
        static MemorySegment allocate(_g_reserved5 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_g_reserved5.class, fi, _GSocketControlMessageClass._g_reserved5$FUNC, session);
        }
        static _g_reserved5 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GSocketControlMessageClass._g_reserved5$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved5$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"));
    public static VarHandle _g_reserved5$VH() {
        return _GSocketControlMessageClass._g_reserved5$VH;
    }
    public static MemoryAddress _g_reserved5$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass._g_reserved5$VH.get(seg);
    }
    public static void _g_reserved5$set( MemorySegment seg, MemoryAddress x) {
        _GSocketControlMessageClass._g_reserved5$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSocketControlMessageClass._g_reserved5$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved5$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketControlMessageClass._g_reserved5$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved5 _g_reserved5 (MemorySegment segment, MemorySession session) {
        return _g_reserved5.ofAddress(_g_reserved5$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


