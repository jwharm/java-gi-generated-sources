// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GUnixFDMessageClass {

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
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_g_reserved2")
    ).withName("_GUnixFDMessageClass");
    public static MemoryLayout $LAYOUT() {
        return _GUnixFDMessageClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 216);
    }
    static final FunctionDescriptor _g_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved1$MH = RuntimeHelper.downcallHandle(
        _GUnixFDMessageClass._g_reserved1$FUNC
    );
    public interface _g_reserved1 {

        void apply();
        static MemorySegment allocate(_g_reserved1 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_g_reserved1.class, fi, _GUnixFDMessageClass._g_reserved1$FUNC, session);
        }
        static _g_reserved1 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GUnixFDMessageClass._g_reserved1$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"));
    public static VarHandle _g_reserved1$VH() {
        return _GUnixFDMessageClass._g_reserved1$VH;
    }
    public static MemoryAddress _g_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GUnixFDMessageClass._g_reserved1$VH.get(seg);
    }
    public static void _g_reserved1$set( MemorySegment seg, MemoryAddress x) {
        _GUnixFDMessageClass._g_reserved1$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GUnixFDMessageClass._g_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _GUnixFDMessageClass._g_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved1 _g_reserved1 (MemorySegment segment, MemorySession session) {
        return _g_reserved1.ofAddress(_g_reserved1$get(segment), session);
    }
    static final FunctionDescriptor _g_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _g_reserved2$MH = RuntimeHelper.downcallHandle(
        _GUnixFDMessageClass._g_reserved2$FUNC
    );
    public interface _g_reserved2 {

        void apply();
        static MemorySegment allocate(_g_reserved2 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_g_reserved2.class, fi, _GUnixFDMessageClass._g_reserved2$FUNC, session);
        }
        static _g_reserved2 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GUnixFDMessageClass._g_reserved2$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _g_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"));
    public static VarHandle _g_reserved2$VH() {
        return _GUnixFDMessageClass._g_reserved2$VH;
    }
    public static MemoryAddress _g_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GUnixFDMessageClass._g_reserved2$VH.get(seg);
    }
    public static void _g_reserved2$set( MemorySegment seg, MemoryAddress x) {
        _GUnixFDMessageClass._g_reserved2$VH.set(seg, x);
    }
    public static MemoryAddress _g_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GUnixFDMessageClass._g_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GUnixFDMessageClass._g_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved2 _g_reserved2 (MemorySegment segment, MemorySession session) {
        return _g_reserved2.ofAddress(_g_reserved2$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


