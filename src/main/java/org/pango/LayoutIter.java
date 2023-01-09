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
public class LayoutIter extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoLayoutIter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link LayoutIter}
     * @return A new, uninitialized @{link LayoutIter}
     */
    public static LayoutIter allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        LayoutIter newInstance = new LayoutIter(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a LayoutIter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected LayoutIter(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, LayoutIter> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new LayoutIter(input);
    
    /**
     * Determines whether {@code iter} is on the last line of the layout.
     * @return {@code true} if {@code iter} is on the last line
     */
    public boolean atLastLine() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_iter_at_last_line.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Copies a {@code PangoLayoutIter}.
     * @return the newly allocated {@code PangoLayoutIter}
     */
    public @Nullable org.pango.LayoutIter copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_iter_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.pango.LayoutIter.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Frees an iterator that's no longer in use.
     */
    public void free() {
        try {
            DowncallHandles.pango_layout_iter_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the Y position of the current line's baseline, in layout
     * coordinates.
     * <p>
     * Layout coordinates have the origin at the top left of the entire layout.
     * @return baseline of current line
     */
    public int getBaseline() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_iter_get_baseline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the extents of the current character, in layout coordinates.
     * <p>
     * Layout coordinates have the origin at the top left of the entire layout.
     * <p>
     * Only logical extents can sensibly be obtained for characters;
     * ink extents make sense only down to the level of clusters.
     * @param logicalRect rectangle to fill with
     *   logical extents
     */
    public void getCharExtents(org.pango.Rectangle logicalRect) {
        try {
            DowncallHandles.pango_layout_iter_get_char_extents.invokeExact(
                    handle(),
                    logicalRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the extents of the current cluster, in layout coordinates.
     * <p>
     * Layout coordinates have the origin at the top left of the entire layout.
     * @param inkRect rectangle to fill with ink extents
     * @param logicalRect rectangle to fill with logical extents
     */
    public void getClusterExtents(@Nullable org.pango.Rectangle inkRect, @Nullable org.pango.Rectangle logicalRect) {
        try {
            DowncallHandles.pango_layout_iter_get_cluster_extents.invokeExact(
                    handle(),
                    (Addressable) (inkRect == null ? MemoryAddress.NULL : inkRect.handle()),
                    (Addressable) (logicalRect == null ? MemoryAddress.NULL : logicalRect.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the current byte index.
     * <p>
     * Note that iterating forward by char moves in visual order,
     * not logical order, so indexes may not be sequential. Also,
     * the index may be equal to the length of the text in the
     * layout, if on the {@code null} run (see {@link LayoutIter#getRun}).
     * @return current byte index
     */
    public int getIndex() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_iter_get_index.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the layout associated with a {@code PangoLayoutIter}.
     * @return the layout associated with {@code iter}
     */
    public @Nullable org.pango.Layout getLayout() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_iter_get_layout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.Layout) Interop.register(RESULT, org.pango.Layout.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Obtains the extents of the {@code PangoLayout} being iterated over.
     * @param inkRect rectangle to fill with ink extents
     * @param logicalRect rectangle to fill with logical extents
     */
    public void getLayoutExtents(@Nullable org.pango.Rectangle inkRect, @Nullable org.pango.Rectangle logicalRect) {
        try {
            DowncallHandles.pango_layout_iter_get_layout_extents.invokeExact(
                    handle(),
                    (Addressable) (inkRect == null ? MemoryAddress.NULL : inkRect.handle()),
                    (Addressable) (logicalRect == null ? MemoryAddress.NULL : logicalRect.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the current line.
     * <p>
     * Use the faster {@link LayoutIter#getLineReadonly} if
     * you do not plan to modify the contents of the line (glyphs,
     * glyph widths, etc.).
     * @return the current line
     */
    public @Nullable org.pango.LayoutLine getLine() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_iter_get_line.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.LayoutLine.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Obtains the extents of the current line.
     * <p>
     * Extents are in layout coordinates (origin is the top-left corner
     * of the entire {@code PangoLayout}). Thus the extents returned by this
     * function will be the same width/height but not at the same x/y
     * as the extents returned from {@link LayoutLine#getExtents}.
     * @param inkRect rectangle to fill with ink extents
     * @param logicalRect rectangle to fill with logical extents
     */
    public void getLineExtents(@Nullable org.pango.Rectangle inkRect, @Nullable org.pango.Rectangle logicalRect) {
        try {
            DowncallHandles.pango_layout_iter_get_line_extents.invokeExact(
                    handle(),
                    (Addressable) (inkRect == null ? MemoryAddress.NULL : inkRect.handle()),
                    (Addressable) (logicalRect == null ? MemoryAddress.NULL : logicalRect.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the current line for read-only access.
     * <p>
     * This is a faster alternative to {@link LayoutIter#getLine},
     * but the user is not expected to modify the contents of the line
     * (glyphs, glyph widths, etc.).
     * @return the current line, that should not be
     *   modified
     */
    public @Nullable org.pango.LayoutLine getLineReadonly() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_iter_get_line_readonly.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.LayoutLine.fromAddress.marshal(RESULT, null);
    }
    
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
     * @param y0 start of line
     * @param y1 end of line
     */
    public void getLineYrange(Out<Integer> y0, Out<Integer> y1) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment y0POINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment y1POINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.pango_layout_iter_get_line_yrange.invokeExact(
                        handle(),
                        (Addressable) (y0 == null ? MemoryAddress.NULL : (Addressable) y0POINTER.address()),
                        (Addressable) (y1 == null ? MemoryAddress.NULL : (Addressable) y1POINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (y0 != null) y0.set(y0POINTER.get(Interop.valueLayout.C_INT, 0));
                    if (y1 != null) y1.set(y1POINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
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
     * @return the current run
     */
    public @Nullable org.pango.LayoutRun getRun() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_iter_get_run.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.LayoutRun) Interop.register(RESULT, org.pango.LayoutRun.fromAddress).marshal(RESULT, null);
    }
    
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
            RESULT = (int) DowncallHandles.pango_layout_iter_get_run_baseline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the extents of the current run in layout coordinates.
     * <p>
     * Layout coordinates have the origin at the top left of the entire layout.
     * @param inkRect rectangle to fill with ink extents
     * @param logicalRect rectangle to fill with logical extents
     */
    public void getRunExtents(@Nullable org.pango.Rectangle inkRect, @Nullable org.pango.Rectangle logicalRect) {
        try {
            DowncallHandles.pango_layout_iter_get_run_extents.invokeExact(
                    handle(),
                    (Addressable) (inkRect == null ? MemoryAddress.NULL : inkRect.handle()),
                    (Addressable) (logicalRect == null ? MemoryAddress.NULL : logicalRect.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @return the current run, that
     *   should not be modified
     */
    public @Nullable org.pango.LayoutRun getRunReadonly() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_iter_get_run_readonly.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.LayoutRun) Interop.register(RESULT, org.pango.LayoutRun.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Moves {@code iter} forward to the next character in visual order.
     * <p>
     * If {@code iter} was already at the end of the layout, returns {@code false}.
     * @return whether motion was possible
     */
    public boolean nextChar() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_iter_next_char.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Moves {@code iter} forward to the next cluster in visual order.
     * <p>
     * If {@code iter} was already at the end of the layout, returns {@code false}.
     * @return whether motion was possible
     */
    public boolean nextCluster() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_iter_next_cluster.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Moves {@code iter} forward to the start of the next line.
     * <p>
     * If {@code iter} is already on the last line, returns {@code false}.
     * @return whether motion was possible
     */
    public boolean nextLine() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_iter_next_line.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Moves {@code iter} forward to the next run in visual order.
     * <p>
     * If {@code iter} was already at the end of the layout, returns {@code false}.
     * @return whether motion was possible
     */
    public boolean nextRun() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_iter_next_run.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_layout_iter_at_last_line = Interop.downcallHandle(
                "pango_layout_iter_at_last_line",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_copy = Interop.downcallHandle(
                "pango_layout_iter_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_free = Interop.downcallHandle(
                "pango_layout_iter_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_get_baseline = Interop.downcallHandle(
                "pango_layout_iter_get_baseline",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_get_char_extents = Interop.downcallHandle(
                "pango_layout_iter_get_char_extents",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_get_cluster_extents = Interop.downcallHandle(
                "pango_layout_iter_get_cluster_extents",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_get_index = Interop.downcallHandle(
                "pango_layout_iter_get_index",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_get_layout = Interop.downcallHandle(
                "pango_layout_iter_get_layout",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_get_layout_extents = Interop.downcallHandle(
                "pango_layout_iter_get_layout_extents",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_get_line = Interop.downcallHandle(
                "pango_layout_iter_get_line",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_get_line_extents = Interop.downcallHandle(
                "pango_layout_iter_get_line_extents",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_get_line_readonly = Interop.downcallHandle(
                "pango_layout_iter_get_line_readonly",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_get_line_yrange = Interop.downcallHandle(
                "pango_layout_iter_get_line_yrange",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_get_run = Interop.downcallHandle(
                "pango_layout_iter_get_run",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_get_run_baseline = Interop.downcallHandle(
                "pango_layout_iter_get_run_baseline",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_get_run_extents = Interop.downcallHandle(
                "pango_layout_iter_get_run_extents",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_get_run_readonly = Interop.downcallHandle(
                "pango_layout_iter_get_run_readonly",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_next_char = Interop.downcallHandle(
                "pango_layout_iter_next_char",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_next_cluster = Interop.downcallHandle(
                "pango_layout_iter_next_cluster",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_next_line = Interop.downcallHandle(
                "pango_layout_iter_next_line",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_iter_next_run = Interop.downcallHandle(
                "pango_layout_iter_next_run",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
    }
}
