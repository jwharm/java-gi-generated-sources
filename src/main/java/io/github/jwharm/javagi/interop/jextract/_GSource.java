// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GSource {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("callback_data"),
        Constants$root.C_POINTER$LAYOUT.withName("callback_funcs"),
        Constants$root.C_POINTER$LAYOUT.withName("source_funcs"),
        Constants$root.C_INT$LAYOUT.withName("ref_count"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("context"),
        Constants$root.C_INT$LAYOUT.withName("priority"),
        Constants$root.C_INT$LAYOUT.withName("flags"),
        Constants$root.C_INT$LAYOUT.withName("source_id"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("poll_fds"),
        Constants$root.C_POINTER$LAYOUT.withName("prev"),
        Constants$root.C_POINTER$LAYOUT.withName("next"),
        Constants$root.C_POINTER$LAYOUT.withName("name"),
        Constants$root.C_POINTER$LAYOUT.withName("priv")
    ).withName("_GSource");
    public static MemoryLayout $LAYOUT() {
        return _GSource.$struct$LAYOUT;
    }
    static final VarHandle callback_data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("callback_data"));
    public static VarHandle callback_data$VH() {
        return _GSource.callback_data$VH;
    }
    public static MemoryAddress callback_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSource.callback_data$VH.get(seg);
    }
    public static void callback_data$set( MemorySegment seg, MemoryAddress x) {
        _GSource.callback_data$VH.set(seg, x);
    }
    public static MemoryAddress callback_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSource.callback_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void callback_data$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSource.callback_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle callback_funcs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("callback_funcs"));
    public static VarHandle callback_funcs$VH() {
        return _GSource.callback_funcs$VH;
    }
    public static MemoryAddress callback_funcs$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSource.callback_funcs$VH.get(seg);
    }
    public static void callback_funcs$set( MemorySegment seg, MemoryAddress x) {
        _GSource.callback_funcs$VH.set(seg, x);
    }
    public static MemoryAddress callback_funcs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSource.callback_funcs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void callback_funcs$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSource.callback_funcs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle source_funcs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("source_funcs"));
    public static VarHandle source_funcs$VH() {
        return _GSource.source_funcs$VH;
    }
    public static MemoryAddress source_funcs$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSource.source_funcs$VH.get(seg);
    }
    public static void source_funcs$set( MemorySegment seg, MemoryAddress x) {
        _GSource.source_funcs$VH.set(seg, x);
    }
    public static MemoryAddress source_funcs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSource.source_funcs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void source_funcs$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSource.source_funcs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ref_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ref_count"));
    public static VarHandle ref_count$VH() {
        return _GSource.ref_count$VH;
    }
    public static int ref_count$get(MemorySegment seg) {
        return (int)_GSource.ref_count$VH.get(seg);
    }
    public static void ref_count$set( MemorySegment seg, int x) {
        _GSource.ref_count$VH.set(seg, x);
    }
    public static int ref_count$get(MemorySegment seg, long index) {
        return (int)_GSource.ref_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_count$set(MemorySegment seg, long index, int x) {
        _GSource.ref_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle context$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("context"));
    public static VarHandle context$VH() {
        return _GSource.context$VH;
    }
    public static MemoryAddress context$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSource.context$VH.get(seg);
    }
    public static void context$set( MemorySegment seg, MemoryAddress x) {
        _GSource.context$VH.set(seg, x);
    }
    public static MemoryAddress context$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSource.context$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void context$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSource.context$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle priority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("priority"));
    public static VarHandle priority$VH() {
        return _GSource.priority$VH;
    }
    public static int priority$get(MemorySegment seg) {
        return (int)_GSource.priority$VH.get(seg);
    }
    public static void priority$set( MemorySegment seg, int x) {
        _GSource.priority$VH.set(seg, x);
    }
    public static int priority$get(MemorySegment seg, long index) {
        return (int)_GSource.priority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void priority$set(MemorySegment seg, long index, int x) {
        _GSource.priority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return _GSource.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)_GSource.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        _GSource.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)_GSource.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        _GSource.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle source_id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("source_id"));
    public static VarHandle source_id$VH() {
        return _GSource.source_id$VH;
    }
    public static int source_id$get(MemorySegment seg) {
        return (int)_GSource.source_id$VH.get(seg);
    }
    public static void source_id$set( MemorySegment seg, int x) {
        _GSource.source_id$VH.set(seg, x);
    }
    public static int source_id$get(MemorySegment seg, long index) {
        return (int)_GSource.source_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void source_id$set(MemorySegment seg, long index, int x) {
        _GSource.source_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle poll_fds$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("poll_fds"));
    public static VarHandle poll_fds$VH() {
        return _GSource.poll_fds$VH;
    }
    public static MemoryAddress poll_fds$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSource.poll_fds$VH.get(seg);
    }
    public static void poll_fds$set( MemorySegment seg, MemoryAddress x) {
        _GSource.poll_fds$VH.set(seg, x);
    }
    public static MemoryAddress poll_fds$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSource.poll_fds$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void poll_fds$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSource.poll_fds$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle prev$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("prev"));
    public static VarHandle prev$VH() {
        return _GSource.prev$VH;
    }
    public static MemoryAddress prev$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSource.prev$VH.get(seg);
    }
    public static void prev$set( MemorySegment seg, MemoryAddress x) {
        _GSource.prev$VH.set(seg, x);
    }
    public static MemoryAddress prev$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSource.prev$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void prev$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSource.prev$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next"));
    public static VarHandle next$VH() {
        return _GSource.next$VH;
    }
    public static MemoryAddress next$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSource.next$VH.get(seg);
    }
    public static void next$set( MemorySegment seg, MemoryAddress x) {
        _GSource.next$VH.set(seg, x);
    }
    public static MemoryAddress next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSource.next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSource.next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("name"));
    public static VarHandle name$VH() {
        return _GSource.name$VH;
    }
    public static MemoryAddress name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSource.name$VH.get(seg);
    }
    public static void name$set( MemorySegment seg, MemoryAddress x) {
        _GSource.name$VH.set(seg, x);
    }
    public static MemoryAddress name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSource.name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSource.name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle priv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    public static VarHandle priv$VH() {
        return _GSource.priv$VH;
    }
    public static MemoryAddress priv$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSource.priv$VH.get(seg);
    }
    public static void priv$set( MemorySegment seg, MemoryAddress x) {
        _GSource.priv$VH.set(seg, x);
    }
    public static MemoryAddress priv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSource.priv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void priv$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSource.priv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


