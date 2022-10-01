// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GInetAddressClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("to_string"),
        Constants$root.C_POINTER$LAYOUT.withName("to_bytes")
    ).withName("_GInetAddressClass");
    public static MemoryLayout $LAYOUT() {
        return _GInetAddressClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle to_string$MH = RuntimeHelper.downcallHandle(
        _GInetAddressClass.to_string$FUNC
    );
    public interface to_string {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(to_string fi, MemorySession session) {
            return RuntimeHelper.upcallStub(to_string.class, fi, _GInetAddressClass.to_string$FUNC, session);
        }
        static to_string ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GInetAddressClass.to_string$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle to_string$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("to_string"));
    public static VarHandle to_string$VH() {
        return _GInetAddressClass.to_string$VH;
    }
    public static MemoryAddress to_string$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GInetAddressClass.to_string$VH.get(seg);
    }
    public static void to_string$set( MemorySegment seg, MemoryAddress x) {
        _GInetAddressClass.to_string$VH.set(seg, x);
    }
    public static MemoryAddress to_string$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GInetAddressClass.to_string$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void to_string$set(MemorySegment seg, long index, MemoryAddress x) {
        _GInetAddressClass.to_string$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static to_string to_string (MemorySegment segment, MemorySession session) {
        return to_string.ofAddress(to_string$get(segment), session);
    }
    static final FunctionDescriptor to_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle to_bytes$MH = RuntimeHelper.downcallHandle(
        _GInetAddressClass.to_bytes$FUNC
    );
    public interface to_bytes {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(to_bytes fi, MemorySession session) {
            return RuntimeHelper.upcallStub(to_bytes.class, fi, _GInetAddressClass.to_bytes$FUNC, session);
        }
        static to_bytes ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GInetAddressClass.to_bytes$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle to_bytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("to_bytes"));
    public static VarHandle to_bytes$VH() {
        return _GInetAddressClass.to_bytes$VH;
    }
    public static MemoryAddress to_bytes$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GInetAddressClass.to_bytes$VH.get(seg);
    }
    public static void to_bytes$set( MemorySegment seg, MemoryAddress x) {
        _GInetAddressClass.to_bytes$VH.set(seg, x);
    }
    public static MemoryAddress to_bytes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GInetAddressClass.to_bytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void to_bytes$set(MemorySegment seg, long index, MemoryAddress x) {
        _GInetAddressClass.to_bytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static to_bytes to_bytes (MemorySegment segment, MemorySession session) {
        return to_bytes.ofAddress(to_bytes$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


