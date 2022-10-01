// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GOptionEntry {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("long_name"),
        Constants$root.C_CHAR$LAYOUT.withName("short_name"),
        MemoryLayout.paddingLayout(24),
        Constants$root.C_INT$LAYOUT.withName("flags"),
        Constants$root.C_INT$LAYOUT.withName("arg"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("arg_data"),
        Constants$root.C_POINTER$LAYOUT.withName("description"),
        Constants$root.C_POINTER$LAYOUT.withName("arg_description")
    ).withName("_GOptionEntry");
    public static MemoryLayout $LAYOUT() {
        return _GOptionEntry.$struct$LAYOUT;
    }
    static final VarHandle long_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("long_name"));
    public static VarHandle long_name$VH() {
        return _GOptionEntry.long_name$VH;
    }
    public static MemoryAddress long_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GOptionEntry.long_name$VH.get(seg);
    }
    public static void long_name$set( MemorySegment seg, MemoryAddress x) {
        _GOptionEntry.long_name$VH.set(seg, x);
    }
    public static MemoryAddress long_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GOptionEntry.long_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void long_name$set(MemorySegment seg, long index, MemoryAddress x) {
        _GOptionEntry.long_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle short_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("short_name"));
    public static VarHandle short_name$VH() {
        return _GOptionEntry.short_name$VH;
    }
    public static byte short_name$get(MemorySegment seg) {
        return (byte)_GOptionEntry.short_name$VH.get(seg);
    }
    public static void short_name$set( MemorySegment seg, byte x) {
        _GOptionEntry.short_name$VH.set(seg, x);
    }
    public static byte short_name$get(MemorySegment seg, long index) {
        return (byte)_GOptionEntry.short_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void short_name$set(MemorySegment seg, long index, byte x) {
        _GOptionEntry.short_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return _GOptionEntry.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)_GOptionEntry.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        _GOptionEntry.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)_GOptionEntry.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        _GOptionEntry.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle arg$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("arg"));
    public static VarHandle arg$VH() {
        return _GOptionEntry.arg$VH;
    }
    public static int arg$get(MemorySegment seg) {
        return (int)_GOptionEntry.arg$VH.get(seg);
    }
    public static void arg$set( MemorySegment seg, int x) {
        _GOptionEntry.arg$VH.set(seg, x);
    }
    public static int arg$get(MemorySegment seg, long index) {
        return (int)_GOptionEntry.arg$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void arg$set(MemorySegment seg, long index, int x) {
        _GOptionEntry.arg$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle arg_data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("arg_data"));
    public static VarHandle arg_data$VH() {
        return _GOptionEntry.arg_data$VH;
    }
    public static MemoryAddress arg_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GOptionEntry.arg_data$VH.get(seg);
    }
    public static void arg_data$set( MemorySegment seg, MemoryAddress x) {
        _GOptionEntry.arg_data$VH.set(seg, x);
    }
    public static MemoryAddress arg_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GOptionEntry.arg_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void arg_data$set(MemorySegment seg, long index, MemoryAddress x) {
        _GOptionEntry.arg_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle description$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("description"));
    public static VarHandle description$VH() {
        return _GOptionEntry.description$VH;
    }
    public static MemoryAddress description$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GOptionEntry.description$VH.get(seg);
    }
    public static void description$set( MemorySegment seg, MemoryAddress x) {
        _GOptionEntry.description$VH.set(seg, x);
    }
    public static MemoryAddress description$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GOptionEntry.description$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void description$set(MemorySegment seg, long index, MemoryAddress x) {
        _GOptionEntry.description$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle arg_description$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("arg_description"));
    public static VarHandle arg_description$VH() {
        return _GOptionEntry.arg_description$VH;
    }
    public static MemoryAddress arg_description$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GOptionEntry.arg_description$VH.get(seg);
    }
    public static void arg_description$set( MemorySegment seg, MemoryAddress x) {
        _GOptionEntry.arg_description$VH.set(seg, x);
    }
    public static MemoryAddress arg_description$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GOptionEntry.arg_description$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void arg_description$set(MemorySegment seg, long index, MemoryAddress x) {
        _GOptionEntry.arg_description$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


