// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GDesktopAppInfoLookupIface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("get_default_for_uri_scheme")
    ).withName("_GDesktopAppInfoLookupIface");
    public static MemoryLayout $LAYOUT() {
        return _GDesktopAppInfoLookupIface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor get_default_for_uri_scheme$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_default_for_uri_scheme$MH = RuntimeHelper.downcallHandle(
        _GDesktopAppInfoLookupIface.get_default_for_uri_scheme$FUNC
    );
    public interface get_default_for_uri_scheme {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(get_default_for_uri_scheme fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_default_for_uri_scheme.class, fi, _GDesktopAppInfoLookupIface.get_default_for_uri_scheme$FUNC, session);
        }
        static get_default_for_uri_scheme ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GDesktopAppInfoLookupIface.get_default_for_uri_scheme$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_default_for_uri_scheme$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_default_for_uri_scheme"));
    public static VarHandle get_default_for_uri_scheme$VH() {
        return _GDesktopAppInfoLookupIface.get_default_for_uri_scheme$VH;
    }
    public static MemoryAddress get_default_for_uri_scheme$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDesktopAppInfoLookupIface.get_default_for_uri_scheme$VH.get(seg);
    }
    public static void get_default_for_uri_scheme$set( MemorySegment seg, MemoryAddress x) {
        _GDesktopAppInfoLookupIface.get_default_for_uri_scheme$VH.set(seg, x);
    }
    public static MemoryAddress get_default_for_uri_scheme$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDesktopAppInfoLookupIface.get_default_for_uri_scheme$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_default_for_uri_scheme$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDesktopAppInfoLookupIface.get_default_for_uri_scheme$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_default_for_uri_scheme get_default_for_uri_scheme (MemorySegment segment, MemorySession session) {
        return get_default_for_uri_scheme.ofAddress(get_default_for_uri_scheme$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


