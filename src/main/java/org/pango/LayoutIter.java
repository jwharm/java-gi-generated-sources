package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoLayoutIter} can be used to iterate over the visual
 * extents of a {@code PangoLayout}.
 * <p>
 * To obtain a {@code PangoLayoutIter}, use {@link Layout#getIter}.
 * <p>
 * The {@code PangoLayoutIter} structure is opaque, and has no user-visible fields.
 */
public class LayoutIter extends io.github.jwharm.javagi.ResourceBase {

    public LayoutIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle pango_layout_iter_at_last_line = Interop.downcallHandle(
        "pango_layout_iter_at_last_line",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines whether {@code iter} is on the last line of the layout.
     */
    public boolean atLastLine() {
        int RESULT;
        try {
            RESULT = (int) pango_layout_iter_at_last_line.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle pango_layout_iter_copy = Interop.downcallHandle(
        "pango_layout_iter_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies a {@code PangoLayoutIter}.
     */
    public @Nullable LayoutIter copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_layout_iter_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new LayoutIter(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_layout_iter_free = Interop.downcallHandle(
        "pango_layout_iter_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees an iterator that's no longer in use.
     */
    public @NotNull void free() {
        try {
            pango_layout_iter_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_layout_iter_get_baseline = Interop.downcallHandle(
        "pango_layout_iter_get_baseline",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the Y position of the current line's baseline, in layout
     * coordinates.
     * <p>
     * Layout coordinates have the origin at the top left of the entire layout.
     */
    public int getBaseline() {
        int RESULT;
        try {
            RESULT = (int) pango_layout_iter_get_baseline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle pango_layout_iter_get_char_extents = Interop.downcallHandle(
        "pango_layout_iter_get_char_extents",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the extents of the current character, in layout coordinates.
     * <p>
     * Layout coordinates have the origin at the top left of the entire layout.
     * <p>
     * Only logical extents can sensibly be obtained for characters;
     * ink extents make sense only down to the level of clusters.
     */
    public @NotNull void getCharExtents(@NotNull Out<Rectangle> logicalRect) {
        MemorySegment logicalRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            pango_layout_iter_get_char_extents.invokeExact(handle(), (Addressable) logicalRectPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        logicalRect.set(new Rectangle(Refcounted.get(logicalRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle pango_layout_iter_get_cluster_extents = Interop.downcallHandle(
        "pango_layout_iter_get_cluster_extents",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the extents of the current cluster, in layout coordinates.
     * <p>
     * Layout coordinates have the origin at the top left of the entire layout.
     */
    public @NotNull void getClusterExtents(@NotNull Out<Rectangle> inkRect, @NotNull Out<Rectangle> logicalRect) {
        MemorySegment inkRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment logicalRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            pango_layout_iter_get_cluster_extents.invokeExact(handle(), (Addressable) inkRectPOINTER.address(), (Addressable) logicalRectPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        inkRect.set(new Rectangle(Refcounted.get(inkRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        logicalRect.set(new Rectangle(Refcounted.get(logicalRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle pango_layout_iter_get_index = Interop.downcallHandle(
        "pango_layout_iter_get_index",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current byte index.
     * <p>
     * Note that iterating forward by char moves in visual order,
     * not logical order, so indexes may not be sequential. Also,
     * the index may be equal to the length of the text in the
     * layout, if on the {@code null} run (see {@link LayoutIter#getRun}).
     */
    public int getIndex() {
        int RESULT;
        try {
            RESULT = (int) pango_layout_iter_get_index.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle pango_layout_iter_get_layout = Interop.downcallHandle(
        "pango_layout_iter_get_layout",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the layout associated with a {@code PangoLayoutIter}.
     */
    public @NotNull Layout getLayout() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_layout_iter_get_layout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Layout(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle pango_layout_iter_get_layout_extents = Interop.downcallHandle(
        "pango_layout_iter_get_layout_extents",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the extents of the {@code PangoLayout} being iterated over.
     */
    public @NotNull void getLayoutExtents(@NotNull Out<Rectangle> inkRect, @NotNull Out<Rectangle> logicalRect) {
        MemorySegment inkRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment logicalRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            pango_layout_iter_get_layout_extents.invokeExact(handle(), (Addressable) inkRectPOINTER.address(), (Addressable) logicalRectPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        inkRect.set(new Rectangle(Refcounted.get(inkRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        logicalRect.set(new Rectangle(Refcounted.get(logicalRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle pango_layout_iter_get_line = Interop.downcallHandle(
        "pango_layout_iter_get_line",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current line.
     * <p>
     * Use the faster {@link LayoutIter#getLineReadonly} if
     * you do not plan to modify the contents of the line (glyphs,
     * glyph widths, etc.).
     */
    public @NotNull LayoutLine getLine() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_layout_iter_get_line.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new LayoutLine(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle pango_layout_iter_get_line_extents = Interop.downcallHandle(
        "pango_layout_iter_get_line_extents",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the extents of the current line.
     * <p>
     * Extents are in layout coordinates (origin is the top-left corner
     * of the entire {@code PangoLayout}). Thus the extents returned by this
     * function will be the same width/height but not at the same x/y
     * as the extents returned from {@link LayoutLine#getExtents}.
     */
    public @NotNull void getLineExtents(@NotNull Out<Rectangle> inkRect, @NotNull Out<Rectangle> logicalRect) {
        MemorySegment inkRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment logicalRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            pango_layout_iter_get_line_extents.invokeExact(handle(), (Addressable) inkRectPOINTER.address(), (Addressable) logicalRectPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        inkRect.set(new Rectangle(Refcounted.get(inkRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        logicalRect.set(new Rectangle(Refcounted.get(logicalRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle pango_layout_iter_get_line_readonly = Interop.downcallHandle(
        "pango_layout_iter_get_line_readonly",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current line for read-only access.
     * <p>
     * This is a faster alternative to {@link LayoutIter#getLine},
     * but the user is not expected to modify the contents of the line
     * (glyphs, glyph widths, etc.).
     */
    public @NotNull LayoutLine getLineReadonly() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_layout_iter_get_line_readonly.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new LayoutLine(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle pango_layout_iter_get_line_yrange = Interop.downcallHandle(
        "pango_layout_iter_get_line_yrange",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Divides the vertical space in the {@code PangoLayout} being iterated over
     * between the lines in the layout, and returns the space belonging to
     * the current line.
     * <p>
     * A line's range includes the line's logical extents. plus half of the
     * spacing above and below the line, if {@link Layout#setSpacing}
     * has been called to set layout spacing. The Y positions are in layout
     * coordinates (origin at top left of the entire layout).
     * <p>
     * Note: Since 1.44, Pango uses line heights for placing lines, and there
     * may be gaps between the ranges returned by this function.
     */
    public @NotNull void getLineYrange(@NotNull Out<Integer> y0, @NotNull Out<Integer> y1) {
        MemorySegment y0POINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment y1POINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            pango_layout_iter_get_line_yrange.invokeExact(handle(), (Addressable) y0POINTER.address(), (Addressable) y1POINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        y0.set(y0POINTER.get(ValueLayout.JAVA_INT, 0));
        y1.set(y1POINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    private static final MethodHandle pango_layout_iter_get_run = Interop.downcallHandle(
        "pango_layout_iter_get_run",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current run.
     * <p>
     * When iterating by run, at the end of each line, there's a position
     * with a {@code null} run, so this function can return {@code null}. The {@code null} run
     * at the end of each line ensures that all lines have at least one run,
     * even lines consisting of only a newline.
     * <p>
     * Use the faster {@link LayoutIter#getRunReadonly} if you do not
     * plan to modify the contents of the run (glyphs, glyph widths, etc.).
     */
    public @Nullable LayoutRun getRun() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_layout_iter_get_run.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new LayoutRun(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle pango_layout_iter_get_run_baseline = Interop.downcallHandle(
        "pango_layout_iter_get_run_baseline",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the Y position of the current run's baseline, in layout
     * coordinates.
     * <p>
     * Layout coordinates have the origin at the top left of the entire layout.
     * <p>
     * The run baseline can be different from the line baseline, for
     * example due to superscript or subscript positioning.
     */
    public int getRunBaseline() {
        int RESULT;
        try {
            RESULT = (int) pango_layout_iter_get_run_baseline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle pango_layout_iter_get_run_extents = Interop.downcallHandle(
        "pango_layout_iter_get_run_extents",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the extents of the current run in layout coordinates.
     * <p>
     * Layout coordinates have the origin at the top left of the entire layout.
     */
    public @NotNull void getRunExtents(@NotNull Out<Rectangle> inkRect, @NotNull Out<Rectangle> logicalRect) {
        MemorySegment inkRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment logicalRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            pango_layout_iter_get_run_extents.invokeExact(handle(), (Addressable) inkRectPOINTER.address(), (Addressable) logicalRectPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        inkRect.set(new Rectangle(Refcounted.get(inkRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        logicalRect.set(new Rectangle(Refcounted.get(logicalRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle pango_layout_iter_get_run_readonly = Interop.downcallHandle(
        "pango_layout_iter_get_run_readonly",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current run for read-only access.
     * <p>
     * When iterating by run, at the end of each line, there's a position
     * with a {@code null} run, so this function can return {@code null}. The {@code null} run
     * at the end of each line ensures that all lines have at least one run,
     * even lines consisting of only a newline.
     * <p>
     * This is a faster alternative to {@link LayoutIter#getRun},
     * but the user is not expected to modify the contents of the run (glyphs,
     * glyph widths, etc.).
     */
    public @Nullable LayoutRun getRunReadonly() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_layout_iter_get_run_readonly.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new LayoutRun(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle pango_layout_iter_next_char = Interop.downcallHandle(
        "pango_layout_iter_next_char",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves {@code iter} forward to the next character in visual order.
     * <p>
     * If {@code iter} was already at the end of the layout, returns {@code false}.
     */
    public boolean nextChar() {
        int RESULT;
        try {
            RESULT = (int) pango_layout_iter_next_char.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle pango_layout_iter_next_cluster = Interop.downcallHandle(
        "pango_layout_iter_next_cluster",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves {@code iter} forward to the next cluster in visual order.
     * <p>
     * If {@code iter} was already at the end of the layout, returns {@code false}.
     */
    public boolean nextCluster() {
        int RESULT;
        try {
            RESULT = (int) pango_layout_iter_next_cluster.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle pango_layout_iter_next_line = Interop.downcallHandle(
        "pango_layout_iter_next_line",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves {@code iter} forward to the start of the next line.
     * <p>
     * If {@code iter} is already on the last line, returns {@code false}.
     */
    public boolean nextLine() {
        int RESULT;
        try {
            RESULT = (int) pango_layout_iter_next_line.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle pango_layout_iter_next_run = Interop.downcallHandle(
        "pango_layout_iter_next_run",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves {@code iter} forward to the next run in visual order.
     * <p>
     * If {@code iter} was already at the end of the layout, returns {@code false}.
     */
    public boolean nextRun() {
        int RESULT;
        try {
            RESULT = (int) pango_layout_iter_next_run.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
}
