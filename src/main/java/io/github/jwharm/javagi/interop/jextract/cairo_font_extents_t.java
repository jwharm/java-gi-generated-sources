// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class cairo_font_extents_t {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("ascent"),
        Constants$root.C_DOUBLE$LAYOUT.withName("descent"),
        Constants$root.C_DOUBLE$LAYOUT.withName("height"),
        Constants$root.C_DOUBLE$LAYOUT.withName("max_x_advance"),
        Constants$root.C_DOUBLE$LAYOUT.withName("max_y_advance")
    );
    public static MemoryLayout $LAYOUT() {
        return cairo_font_extents_t.$struct$LAYOUT;
    }
    static final VarHandle ascent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ascent"));
    public static VarHandle ascent$VH() {
        return cairo_font_extents_t.ascent$VH;
    }
    public static double ascent$get(MemorySegment seg) {
        return (double)cairo_font_extents_t.ascent$VH.get(seg);
    }
    public static void ascent$set( MemorySegment seg, double x) {
        cairo_font_extents_t.ascent$VH.set(seg, x);
    }
    public static double ascent$get(MemorySegment seg, long index) {
        return (double)cairo_font_extents_t.ascent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ascent$set(MemorySegment seg, long index, double x) {
        cairo_font_extents_t.ascent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle descent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("descent"));
    public static VarHandle descent$VH() {
        return cairo_font_extents_t.descent$VH;
    }
    public static double descent$get(MemorySegment seg) {
        return (double)cairo_font_extents_t.descent$VH.get(seg);
    }
    public static void descent$set( MemorySegment seg, double x) {
        cairo_font_extents_t.descent$VH.set(seg, x);
    }
    public static double descent$get(MemorySegment seg, long index) {
        return (double)cairo_font_extents_t.descent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void descent$set(MemorySegment seg, long index, double x) {
        cairo_font_extents_t.descent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return cairo_font_extents_t.height$VH;
    }
    public static double height$get(MemorySegment seg) {
        return (double)cairo_font_extents_t.height$VH.get(seg);
    }
    public static void height$set( MemorySegment seg, double x) {
        cairo_font_extents_t.height$VH.set(seg, x);
    }
    public static double height$get(MemorySegment seg, long index) {
        return (double)cairo_font_extents_t.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, double x) {
        cairo_font_extents_t.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_x_advance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_x_advance"));
    public static VarHandle max_x_advance$VH() {
        return cairo_font_extents_t.max_x_advance$VH;
    }
    public static double max_x_advance$get(MemorySegment seg) {
        return (double)cairo_font_extents_t.max_x_advance$VH.get(seg);
    }
    public static void max_x_advance$set( MemorySegment seg, double x) {
        cairo_font_extents_t.max_x_advance$VH.set(seg, x);
    }
    public static double max_x_advance$get(MemorySegment seg, long index) {
        return (double)cairo_font_extents_t.max_x_advance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_x_advance$set(MemorySegment seg, long index, double x) {
        cairo_font_extents_t.max_x_advance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle max_y_advance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("max_y_advance"));
    public static VarHandle max_y_advance$VH() {
        return cairo_font_extents_t.max_y_advance$VH;
    }
    public static double max_y_advance$get(MemorySegment seg) {
        return (double)cairo_font_extents_t.max_y_advance$VH.get(seg);
    }
    public static void max_y_advance$set( MemorySegment seg, double x) {
        cairo_font_extents_t.max_y_advance$VH.set(seg, x);
    }
    public static double max_y_advance$get(MemorySegment seg, long index) {
        return (double)cairo_font_extents_t.max_y_advance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void max_y_advance$set(MemorySegment seg, long index, double x) {
        cairo_font_extents_t.max_y_advance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


