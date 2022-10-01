// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GDBusObjectManagerIface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("parent_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("get_object_path"),
        Constants$root.C_POINTER$LAYOUT.withName("get_objects"),
        Constants$root.C_POINTER$LAYOUT.withName("get_object"),
        Constants$root.C_POINTER$LAYOUT.withName("get_interface"),
        Constants$root.C_POINTER$LAYOUT.withName("object_added"),
        Constants$root.C_POINTER$LAYOUT.withName("object_removed"),
        Constants$root.C_POINTER$LAYOUT.withName("interface_added"),
        Constants$root.C_POINTER$LAYOUT.withName("interface_removed")
    ).withName("_GDBusObjectManagerIface");
    public static MemoryLayout $LAYOUT() {
        return _GDBusObjectManagerIface.$struct$LAYOUT;
    }
    public static MemorySegment parent_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor get_object_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_object_path$MH = RuntimeHelper.downcallHandle(
        _GDBusObjectManagerIface.get_object_path$FUNC
    );
    public interface get_object_path {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_object_path fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_object_path.class, fi, _GDBusObjectManagerIface.get_object_path$FUNC, session);
        }
        static get_object_path ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.get_object_path$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_object_path$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_object_path"));
    public static VarHandle get_object_path$VH() {
        return _GDBusObjectManagerIface.get_object_path$VH;
    }
    public static MemoryAddress get_object_path$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.get_object_path$VH.get(seg);
    }
    public static void get_object_path$set( MemorySegment seg, MemoryAddress x) {
        _GDBusObjectManagerIface.get_object_path$VH.set(seg, x);
    }
    public static MemoryAddress get_object_path$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.get_object_path$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_object_path$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusObjectManagerIface.get_object_path$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_object_path get_object_path (MemorySegment segment, MemorySession session) {
        return get_object_path.ofAddress(get_object_path$get(segment), session);
    }
    static final FunctionDescriptor get_objects$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_objects$MH = RuntimeHelper.downcallHandle(
        _GDBusObjectManagerIface.get_objects$FUNC
    );
    public interface get_objects {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_objects fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_objects.class, fi, _GDBusObjectManagerIface.get_objects$FUNC, session);
        }
        static get_objects ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.get_objects$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_objects$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_objects"));
    public static VarHandle get_objects$VH() {
        return _GDBusObjectManagerIface.get_objects$VH;
    }
    public static MemoryAddress get_objects$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.get_objects$VH.get(seg);
    }
    public static void get_objects$set( MemorySegment seg, MemoryAddress x) {
        _GDBusObjectManagerIface.get_objects$VH.set(seg, x);
    }
    public static MemoryAddress get_objects$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.get_objects$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_objects$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusObjectManagerIface.get_objects$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_objects get_objects (MemorySegment segment, MemorySession session) {
        return get_objects.ofAddress(get_objects$get(segment), session);
    }
    static final FunctionDescriptor get_object$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_object$MH = RuntimeHelper.downcallHandle(
        _GDBusObjectManagerIface.get_object$FUNC
    );
    public interface get_object {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(get_object fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_object.class, fi, _GDBusObjectManagerIface.get_object$FUNC, session);
        }
        static get_object ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.get_object$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_object$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_object"));
    public static VarHandle get_object$VH() {
        return _GDBusObjectManagerIface.get_object$VH;
    }
    public static MemoryAddress get_object$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.get_object$VH.get(seg);
    }
    public static void get_object$set( MemorySegment seg, MemoryAddress x) {
        _GDBusObjectManagerIface.get_object$VH.set(seg, x);
    }
    public static MemoryAddress get_object$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.get_object$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_object$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusObjectManagerIface.get_object$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_object get_object (MemorySegment segment, MemorySession session) {
        return get_object.ofAddress(get_object$get(segment), session);
    }
    static final FunctionDescriptor get_interface$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_interface$MH = RuntimeHelper.downcallHandle(
        _GDBusObjectManagerIface.get_interface$FUNC
    );
    public interface get_interface {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(get_interface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_interface.class, fi, _GDBusObjectManagerIface.get_interface$FUNC, session);
        }
        static get_interface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.get_interface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_interface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_interface"));
    public static VarHandle get_interface$VH() {
        return _GDBusObjectManagerIface.get_interface$VH;
    }
    public static MemoryAddress get_interface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.get_interface$VH.get(seg);
    }
    public static void get_interface$set( MemorySegment seg, MemoryAddress x) {
        _GDBusObjectManagerIface.get_interface$VH.set(seg, x);
    }
    public static MemoryAddress get_interface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.get_interface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_interface$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusObjectManagerIface.get_interface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_interface get_interface (MemorySegment segment, MemorySession session) {
        return get_interface.ofAddress(get_interface$get(segment), session);
    }
    static final FunctionDescriptor object_added$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle object_added$MH = RuntimeHelper.downcallHandle(
        _GDBusObjectManagerIface.object_added$FUNC
    );
    public interface object_added {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(object_added fi, MemorySession session) {
            return RuntimeHelper.upcallStub(object_added.class, fi, _GDBusObjectManagerIface.object_added$FUNC, session);
        }
        static object_added ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    _GDBusObjectManagerIface.object_added$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle object_added$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("object_added"));
    public static VarHandle object_added$VH() {
        return _GDBusObjectManagerIface.object_added$VH;
    }
    public static MemoryAddress object_added$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.object_added$VH.get(seg);
    }
    public static void object_added$set( MemorySegment seg, MemoryAddress x) {
        _GDBusObjectManagerIface.object_added$VH.set(seg, x);
    }
    public static MemoryAddress object_added$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.object_added$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void object_added$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusObjectManagerIface.object_added$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static object_added object_added (MemorySegment segment, MemorySession session) {
        return object_added.ofAddress(object_added$get(segment), session);
    }
    static final FunctionDescriptor object_removed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle object_removed$MH = RuntimeHelper.downcallHandle(
        _GDBusObjectManagerIface.object_removed$FUNC
    );
    public interface object_removed {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(object_removed fi, MemorySession session) {
            return RuntimeHelper.upcallStub(object_removed.class, fi, _GDBusObjectManagerIface.object_removed$FUNC, session);
        }
        static object_removed ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    _GDBusObjectManagerIface.object_removed$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle object_removed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("object_removed"));
    public static VarHandle object_removed$VH() {
        return _GDBusObjectManagerIface.object_removed$VH;
    }
    public static MemoryAddress object_removed$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.object_removed$VH.get(seg);
    }
    public static void object_removed$set( MemorySegment seg, MemoryAddress x) {
        _GDBusObjectManagerIface.object_removed$VH.set(seg, x);
    }
    public static MemoryAddress object_removed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.object_removed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void object_removed$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusObjectManagerIface.object_removed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static object_removed object_removed (MemorySegment segment, MemorySession session) {
        return object_removed.ofAddress(object_removed$get(segment), session);
    }
    static final FunctionDescriptor interface_added$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle interface_added$MH = RuntimeHelper.downcallHandle(
        _GDBusObjectManagerIface.interface_added$FUNC
    );
    public interface interface_added {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(interface_added fi, MemorySession session) {
            return RuntimeHelper.upcallStub(interface_added.class, fi, _GDBusObjectManagerIface.interface_added$FUNC, session);
        }
        static interface_added ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    _GDBusObjectManagerIface.interface_added$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle interface_added$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("interface_added"));
    public static VarHandle interface_added$VH() {
        return _GDBusObjectManagerIface.interface_added$VH;
    }
    public static MemoryAddress interface_added$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.interface_added$VH.get(seg);
    }
    public static void interface_added$set( MemorySegment seg, MemoryAddress x) {
        _GDBusObjectManagerIface.interface_added$VH.set(seg, x);
    }
    public static MemoryAddress interface_added$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.interface_added$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void interface_added$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusObjectManagerIface.interface_added$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static interface_added interface_added (MemorySegment segment, MemorySession session) {
        return interface_added.ofAddress(interface_added$get(segment), session);
    }
    static final FunctionDescriptor interface_removed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle interface_removed$MH = RuntimeHelper.downcallHandle(
        _GDBusObjectManagerIface.interface_removed$FUNC
    );
    public interface interface_removed {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(interface_removed fi, MemorySession session) {
            return RuntimeHelper.upcallStub(interface_removed.class, fi, _GDBusObjectManagerIface.interface_removed$FUNC, session);
        }
        static interface_removed ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    _GDBusObjectManagerIface.interface_removed$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle interface_removed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("interface_removed"));
    public static VarHandle interface_removed$VH() {
        return _GDBusObjectManagerIface.interface_removed$VH;
    }
    public static MemoryAddress interface_removed$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.interface_removed$VH.get(seg);
    }
    public static void interface_removed$set( MemorySegment seg, MemoryAddress x) {
        _GDBusObjectManagerIface.interface_removed$VH.set(seg, x);
    }
    public static MemoryAddress interface_removed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusObjectManagerIface.interface_removed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void interface_removed$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusObjectManagerIface.interface_removed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static interface_removed interface_removed (MemorySegment segment, MemorySession session) {
        return interface_removed.ofAddress(interface_removed$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


