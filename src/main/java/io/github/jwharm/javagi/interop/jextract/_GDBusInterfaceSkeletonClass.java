// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GDBusInterfaceSkeletonClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("get_info"),
        Constants$root.C_POINTER$LAYOUT.withName("get_vtable"),
        Constants$root.C_POINTER$LAYOUT.withName("get_properties"),
        Constants$root.C_POINTER$LAYOUT.withName("flush"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("vfunc_padding"),
        Constants$root.C_POINTER$LAYOUT.withName("g_authorize_method"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("signal_padding")
    ).withName("_GDBusInterfaceSkeletonClass");
    public static MemoryLayout $LAYOUT() {
        return _GDBusInterfaceSkeletonClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor get_info$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_info$MH = RuntimeHelper.downcallHandle(
        _GDBusInterfaceSkeletonClass.get_info$FUNC
    );
    public interface get_info {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_info fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_info.class, fi, _GDBusInterfaceSkeletonClass.get_info$FUNC, session);
        }
        static get_info ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GDBusInterfaceSkeletonClass.get_info$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_info$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_info"));
    public static VarHandle get_info$VH() {
        return _GDBusInterfaceSkeletonClass.get_info$VH;
    }
    public static MemoryAddress get_info$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusInterfaceSkeletonClass.get_info$VH.get(seg);
    }
    public static void get_info$set( MemorySegment seg, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.get_info$VH.set(seg, x);
    }
    public static MemoryAddress get_info$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusInterfaceSkeletonClass.get_info$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_info$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.get_info$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_info get_info (MemorySegment segment, MemorySession session) {
        return get_info.ofAddress(get_info$get(segment), session);
    }
    static final FunctionDescriptor get_vtable$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_vtable$MH = RuntimeHelper.downcallHandle(
        _GDBusInterfaceSkeletonClass.get_vtable$FUNC
    );
    public interface get_vtable {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_vtable fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_vtable.class, fi, _GDBusInterfaceSkeletonClass.get_vtable$FUNC, session);
        }
        static get_vtable ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GDBusInterfaceSkeletonClass.get_vtable$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_vtable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_vtable"));
    public static VarHandle get_vtable$VH() {
        return _GDBusInterfaceSkeletonClass.get_vtable$VH;
    }
    public static MemoryAddress get_vtable$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusInterfaceSkeletonClass.get_vtable$VH.get(seg);
    }
    public static void get_vtable$set( MemorySegment seg, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.get_vtable$VH.set(seg, x);
    }
    public static MemoryAddress get_vtable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusInterfaceSkeletonClass.get_vtable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_vtable$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.get_vtable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_vtable get_vtable (MemorySegment segment, MemorySession session) {
        return get_vtable.ofAddress(get_vtable$get(segment), session);
    }
    static final FunctionDescriptor get_properties$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_properties$MH = RuntimeHelper.downcallHandle(
        _GDBusInterfaceSkeletonClass.get_properties$FUNC
    );
    public interface get_properties {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_properties fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_properties.class, fi, _GDBusInterfaceSkeletonClass.get_properties$FUNC, session);
        }
        static get_properties ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GDBusInterfaceSkeletonClass.get_properties$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_properties$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_properties"));
    public static VarHandle get_properties$VH() {
        return _GDBusInterfaceSkeletonClass.get_properties$VH;
    }
    public static MemoryAddress get_properties$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusInterfaceSkeletonClass.get_properties$VH.get(seg);
    }
    public static void get_properties$set( MemorySegment seg, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.get_properties$VH.set(seg, x);
    }
    public static MemoryAddress get_properties$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusInterfaceSkeletonClass.get_properties$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_properties$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.get_properties$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_properties get_properties (MemorySegment segment, MemorySession session) {
        return get_properties.ofAddress(get_properties$get(segment), session);
    }
    static final FunctionDescriptor flush$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle flush$MH = RuntimeHelper.downcallHandle(
        _GDBusInterfaceSkeletonClass.flush$FUNC
    );
    public interface flush {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(flush fi, MemorySession session) {
            return RuntimeHelper.upcallStub(flush.class, fi, _GDBusInterfaceSkeletonClass.flush$FUNC, session);
        }
        static flush ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GDBusInterfaceSkeletonClass.flush$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle flush$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flush"));
    public static VarHandle flush$VH() {
        return _GDBusInterfaceSkeletonClass.flush$VH;
    }
    public static MemoryAddress flush$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusInterfaceSkeletonClass.flush$VH.get(seg);
    }
    public static void flush$set( MemorySegment seg, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.flush$VH.set(seg, x);
    }
    public static MemoryAddress flush$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusInterfaceSkeletonClass.flush$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flush$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.flush$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static flush flush (MemorySegment segment, MemorySession session) {
        return flush.ofAddress(flush$get(segment), session);
    }
    public static MemorySegment vfunc_padding$slice(MemorySegment seg) {
        return seg.asSlice(168, 64);
    }
    static final FunctionDescriptor g_authorize_method$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_authorize_method$MH = RuntimeHelper.downcallHandle(
        _GDBusInterfaceSkeletonClass.g_authorize_method$FUNC
    );
    public interface g_authorize_method {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(g_authorize_method fi, MemorySession session) {
            return RuntimeHelper.upcallStub(g_authorize_method.class, fi, _GDBusInterfaceSkeletonClass.g_authorize_method$FUNC, session);
        }
        static g_authorize_method ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)_GDBusInterfaceSkeletonClass.g_authorize_method$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle g_authorize_method$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("g_authorize_method"));
    public static VarHandle g_authorize_method$VH() {
        return _GDBusInterfaceSkeletonClass.g_authorize_method$VH;
    }
    public static MemoryAddress g_authorize_method$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusInterfaceSkeletonClass.g_authorize_method$VH.get(seg);
    }
    public static void g_authorize_method$set( MemorySegment seg, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.g_authorize_method$VH.set(seg, x);
    }
    public static MemoryAddress g_authorize_method$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusInterfaceSkeletonClass.g_authorize_method$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void g_authorize_method$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusInterfaceSkeletonClass.g_authorize_method$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static g_authorize_method g_authorize_method (MemorySegment segment, MemorySession session) {
        return g_authorize_method.ofAddress(g_authorize_method$get(segment), session);
    }
    public static MemorySegment signal_padding$slice(MemorySegment seg) {
        return seg.asSlice(240, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


