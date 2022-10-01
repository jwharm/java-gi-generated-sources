// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GTokenValue {

    static final  GroupLayout $union$LAYOUT = MemoryLayout.unionLayout(
        Constants$root.C_POINTER$LAYOUT.withName("v_symbol"),
        Constants$root.C_POINTER$LAYOUT.withName("v_identifier"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("v_binary"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("v_octal"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("v_int"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("v_int64"),
        Constants$root.C_DOUBLE$LAYOUT.withName("v_float"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("v_hex"),
        Constants$root.C_POINTER$LAYOUT.withName("v_string"),
        Constants$root.C_POINTER$LAYOUT.withName("v_comment"),
        Constants$root.C_CHAR$LAYOUT.withName("v_char"),
        Constants$root.C_INT$LAYOUT.withName("v_error")
    ).withName("_GTokenValue");
    public static MemoryLayout $LAYOUT() {
        return _GTokenValue.$union$LAYOUT;
    }
    static final VarHandle v_symbol$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("v_symbol"));
    public static VarHandle v_symbol$VH() {
        return _GTokenValue.v_symbol$VH;
    }
    public static MemoryAddress v_symbol$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTokenValue.v_symbol$VH.get(seg);
    }
    public static void v_symbol$set( MemorySegment seg, MemoryAddress x) {
        _GTokenValue.v_symbol$VH.set(seg, x);
    }
    public static MemoryAddress v_symbol$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTokenValue.v_symbol$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void v_symbol$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTokenValue.v_symbol$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle v_identifier$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("v_identifier"));
    public static VarHandle v_identifier$VH() {
        return _GTokenValue.v_identifier$VH;
    }
    public static MemoryAddress v_identifier$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTokenValue.v_identifier$VH.get(seg);
    }
    public static void v_identifier$set( MemorySegment seg, MemoryAddress x) {
        _GTokenValue.v_identifier$VH.set(seg, x);
    }
    public static MemoryAddress v_identifier$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTokenValue.v_identifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void v_identifier$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTokenValue.v_identifier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle v_binary$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("v_binary"));
    public static VarHandle v_binary$VH() {
        return _GTokenValue.v_binary$VH;
    }
    public static long v_binary$get(MemorySegment seg) {
        return (long)_GTokenValue.v_binary$VH.get(seg);
    }
    public static void v_binary$set( MemorySegment seg, long x) {
        _GTokenValue.v_binary$VH.set(seg, x);
    }
    public static long v_binary$get(MemorySegment seg, long index) {
        return (long)_GTokenValue.v_binary$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void v_binary$set(MemorySegment seg, long index, long x) {
        _GTokenValue.v_binary$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle v_octal$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("v_octal"));
    public static VarHandle v_octal$VH() {
        return _GTokenValue.v_octal$VH;
    }
    public static long v_octal$get(MemorySegment seg) {
        return (long)_GTokenValue.v_octal$VH.get(seg);
    }
    public static void v_octal$set( MemorySegment seg, long x) {
        _GTokenValue.v_octal$VH.set(seg, x);
    }
    public static long v_octal$get(MemorySegment seg, long index) {
        return (long)_GTokenValue.v_octal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void v_octal$set(MemorySegment seg, long index, long x) {
        _GTokenValue.v_octal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle v_int$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("v_int"));
    public static VarHandle v_int$VH() {
        return _GTokenValue.v_int$VH;
    }
    public static long v_int$get(MemorySegment seg) {
        return (long)_GTokenValue.v_int$VH.get(seg);
    }
    public static void v_int$set( MemorySegment seg, long x) {
        _GTokenValue.v_int$VH.set(seg, x);
    }
    public static long v_int$get(MemorySegment seg, long index) {
        return (long)_GTokenValue.v_int$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void v_int$set(MemorySegment seg, long index, long x) {
        _GTokenValue.v_int$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle v_int64$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("v_int64"));
    public static VarHandle v_int64$VH() {
        return _GTokenValue.v_int64$VH;
    }
    public static long v_int64$get(MemorySegment seg) {
        return (long)_GTokenValue.v_int64$VH.get(seg);
    }
    public static void v_int64$set( MemorySegment seg, long x) {
        _GTokenValue.v_int64$VH.set(seg, x);
    }
    public static long v_int64$get(MemorySegment seg, long index) {
        return (long)_GTokenValue.v_int64$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void v_int64$set(MemorySegment seg, long index, long x) {
        _GTokenValue.v_int64$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle v_float$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("v_float"));
    public static VarHandle v_float$VH() {
        return _GTokenValue.v_float$VH;
    }
    public static double v_float$get(MemorySegment seg) {
        return (double)_GTokenValue.v_float$VH.get(seg);
    }
    public static void v_float$set( MemorySegment seg, double x) {
        _GTokenValue.v_float$VH.set(seg, x);
    }
    public static double v_float$get(MemorySegment seg, long index) {
        return (double)_GTokenValue.v_float$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void v_float$set(MemorySegment seg, long index, double x) {
        _GTokenValue.v_float$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle v_hex$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("v_hex"));
    public static VarHandle v_hex$VH() {
        return _GTokenValue.v_hex$VH;
    }
    public static long v_hex$get(MemorySegment seg) {
        return (long)_GTokenValue.v_hex$VH.get(seg);
    }
    public static void v_hex$set( MemorySegment seg, long x) {
        _GTokenValue.v_hex$VH.set(seg, x);
    }
    public static long v_hex$get(MemorySegment seg, long index) {
        return (long)_GTokenValue.v_hex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void v_hex$set(MemorySegment seg, long index, long x) {
        _GTokenValue.v_hex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle v_string$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("v_string"));
    public static VarHandle v_string$VH() {
        return _GTokenValue.v_string$VH;
    }
    public static MemoryAddress v_string$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTokenValue.v_string$VH.get(seg);
    }
    public static void v_string$set( MemorySegment seg, MemoryAddress x) {
        _GTokenValue.v_string$VH.set(seg, x);
    }
    public static MemoryAddress v_string$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTokenValue.v_string$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void v_string$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTokenValue.v_string$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle v_comment$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("v_comment"));
    public static VarHandle v_comment$VH() {
        return _GTokenValue.v_comment$VH;
    }
    public static MemoryAddress v_comment$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTokenValue.v_comment$VH.get(seg);
    }
    public static void v_comment$set( MemorySegment seg, MemoryAddress x) {
        _GTokenValue.v_comment$VH.set(seg, x);
    }
    public static MemoryAddress v_comment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTokenValue.v_comment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void v_comment$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTokenValue.v_comment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle v_char$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("v_char"));
    public static VarHandle v_char$VH() {
        return _GTokenValue.v_char$VH;
    }
    public static byte v_char$get(MemorySegment seg) {
        return (byte)_GTokenValue.v_char$VH.get(seg);
    }
    public static void v_char$set( MemorySegment seg, byte x) {
        _GTokenValue.v_char$VH.set(seg, x);
    }
    public static byte v_char$get(MemorySegment seg, long index) {
        return (byte)_GTokenValue.v_char$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void v_char$set(MemorySegment seg, long index, byte x) {
        _GTokenValue.v_char$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle v_error$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("v_error"));
    public static VarHandle v_error$VH() {
        return _GTokenValue.v_error$VH;
    }
    public static int v_error$get(MemorySegment seg) {
        return (int)_GTokenValue.v_error$VH.get(seg);
    }
    public static void v_error$set( MemorySegment seg, int x) {
        _GTokenValue.v_error$VH.set(seg, x);
    }
    public static int v_error$get(MemorySegment seg, long index) {
        return (int)_GTokenValue.v_error$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void v_error$set(MemorySegment seg, long index, int x) {
        _GTokenValue.v_error$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


