package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Stores geometrical information for a series of rows in a GtkCellArea
 * <p>
 * The {@code GtkCellAreaContext} object is created by a given {@code GtkCellArea}
 * implementation via its {@code GtkCellAreaClass.create_context()} virtual
 * method and is used to store cell sizes and alignments for a series of
 * {@code GtkTreeModel} rows that are requested and rendered in the same context.
 * <p>
 * {@code GtkCellLayout} widgets can create any number of contexts in which to
 * request and render groups of data rows. However, it’s important that the
 * same context which was used to request sizes for a given {@code GtkTreeModel}
 * row also be used for the same row when calling other {@code GtkCellArea} APIs
 * such as gtk_cell_area_render() and gtk_cell_area_event().
 */
public class CellAreaContext extends org.gtk.gobject.Object {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellAreaContext";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    @ApiStatus.Internal
    public CellAreaContext(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to CellAreaContext if its GType is a (or inherits from) "GtkCellAreaContext".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "CellAreaContext" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCellAreaContext", a ClassCastException will be thrown.
     */
    public static CellAreaContext castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkCellAreaContext"))) {
            return new CellAreaContext(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCellAreaContext");
        }
    }
    
    /**
     * Allocates a width and/or a height for all rows which are to be
     * rendered with {@code context}.
     * <p>
     * Usually allocation is performed only horizontally or sometimes
     * vertically since a group of rows are usually rendered side by
     * side vertically or horizontally and share either the same width
     * or the same height. Sometimes they are allocated in both horizontal
     * and vertical orientations producing a homogeneous effect of the
     * rows. This is generally the case for {@code GtkTreeView} when
     * {@code GtkTreeView:fixed-height-mode} is enabled.
     * @param width the allocated width for all {@code GtkTreeModel} rows rendered
     *   with {@code context}, or -1
     * @param height the allocated height for all {@code GtkTreeModel} rows rendered
     *   with {@code context}, or -1
     */
    public void allocate(int width, int height) {
        try {
            DowncallHandles.gtk_cell_area_context_allocate.invokeExact(
                    handle(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches the current allocation size for {@code context}.
     * <p>
     * If the context was not allocated in width or height, or if the
     * context was recently reset with gtk_cell_area_context_reset(),
     * the returned value will be -1.
     * @param width location to store the allocated width
     * @param height location to store the allocated height
     */
    public void getAllocation(Out<Integer> width, Out<Integer> height) {
        java.util.Objects.requireNonNull(width, "Parameter 'width' must not be null");
        java.util.Objects.requireNonNull(height, "Parameter 'height' must not be null");
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gtk_cell_area_context_get_allocation.invokeExact(
                    handle(),
                    (Addressable) widthPOINTER.address(),
                    (Addressable) heightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        width.set(widthPOINTER.get(ValueLayout.JAVA_INT, 0));
        height.set(heightPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    /**
     * Fetches the {@code GtkCellArea} this {@code context} was created by.
     * <p>
     * This is generally unneeded by layouting widgets; however,
     * it is important for the context implementation itself to
     * fetch information about the area it is being used for.
     * <p>
     * For instance at {@code GtkCellAreaContextClass.allocate()} time
     * it’s important to know details about any cell spacing
     * that the {@code GtkCellArea} is configured with in order to
     * compute a proper allocation.
     * @return the {@code GtkCellArea} this context was created by.
     */
    public @NotNull org.gtk.gtk.CellArea getArea() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_area_context_get_area.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.CellArea(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the accumulative preferred height for all rows which have been
     * requested with this context.
     * <p>
     * After gtk_cell_area_context_reset() is called and/or before ever
     * requesting the size of a {@code GtkCellArea}, the returned values are 0.
     * @param minimumHeight location to store the minimum height
     * @param naturalHeight location to store the natural height
     */
    public void getPreferredHeight(Out<Integer> minimumHeight, Out<Integer> naturalHeight) {
        java.util.Objects.requireNonNull(minimumHeight, "Parameter 'minimumHeight' must not be null");
        java.util.Objects.requireNonNull(naturalHeight, "Parameter 'naturalHeight' must not be null");
        MemorySegment minimumHeightPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment naturalHeightPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gtk_cell_area_context_get_preferred_height.invokeExact(
                    handle(),
                    (Addressable) minimumHeightPOINTER.address(),
                    (Addressable) naturalHeightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        minimumHeight.set(minimumHeightPOINTER.get(ValueLayout.JAVA_INT, 0));
        naturalHeight.set(naturalHeightPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    /**
     * Gets the accumulative preferred height for {@code width} for all rows
     * which have been requested for the same said {@code width} with this context.
     * <p>
     * After gtk_cell_area_context_reset() is called and/or before ever
     * requesting the size of a {@code GtkCellArea}, the returned values are -1.
     * @param width a proposed width for allocation
     * @param minimumHeight location to store the minimum height
     * @param naturalHeight location to store the natural height
     */
    public void getPreferredHeightForWidth(int width, Out<Integer> minimumHeight, Out<Integer> naturalHeight) {
        java.util.Objects.requireNonNull(minimumHeight, "Parameter 'minimumHeight' must not be null");
        java.util.Objects.requireNonNull(naturalHeight, "Parameter 'naturalHeight' must not be null");
        MemorySegment minimumHeightPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment naturalHeightPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gtk_cell_area_context_get_preferred_height_for_width.invokeExact(
                    handle(),
                    width,
                    (Addressable) minimumHeightPOINTER.address(),
                    (Addressable) naturalHeightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        minimumHeight.set(minimumHeightPOINTER.get(ValueLayout.JAVA_INT, 0));
        naturalHeight.set(naturalHeightPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    /**
     * Gets the accumulative preferred width for all rows which have been
     * requested with this context.
     * <p>
     * After gtk_cell_area_context_reset() is called and/or before ever
     * requesting the size of a {@code GtkCellArea}, the returned values are 0.
     * @param minimumWidth location to store the minimum width
     * @param naturalWidth location to store the natural width
     */
    public void getPreferredWidth(Out<Integer> minimumWidth, Out<Integer> naturalWidth) {
        java.util.Objects.requireNonNull(minimumWidth, "Parameter 'minimumWidth' must not be null");
        java.util.Objects.requireNonNull(naturalWidth, "Parameter 'naturalWidth' must not be null");
        MemorySegment minimumWidthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment naturalWidthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gtk_cell_area_context_get_preferred_width.invokeExact(
                    handle(),
                    (Addressable) minimumWidthPOINTER.address(),
                    (Addressable) naturalWidthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        minimumWidth.set(minimumWidthPOINTER.get(ValueLayout.JAVA_INT, 0));
        naturalWidth.set(naturalWidthPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    /**
     * Gets the accumulative preferred width for {@code height} for all rows which
     * have been requested for the same said {@code height} with this context.
     * <p>
     * After gtk_cell_area_context_reset() is called and/or before ever
     * requesting the size of a {@code GtkCellArea}, the returned values are -1.
     * @param height a proposed height for allocation
     * @param minimumWidth location to store the minimum width
     * @param naturalWidth location to store the natural width
     */
    public void getPreferredWidthForHeight(int height, Out<Integer> minimumWidth, Out<Integer> naturalWidth) {
        java.util.Objects.requireNonNull(minimumWidth, "Parameter 'minimumWidth' must not be null");
        java.util.Objects.requireNonNull(naturalWidth, "Parameter 'naturalWidth' must not be null");
        MemorySegment minimumWidthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment naturalWidthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gtk_cell_area_context_get_preferred_width_for_height.invokeExact(
                    handle(),
                    height,
                    (Addressable) minimumWidthPOINTER.address(),
                    (Addressable) naturalWidthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        minimumWidth.set(minimumWidthPOINTER.get(ValueLayout.JAVA_INT, 0));
        naturalWidth.set(naturalWidthPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    /**
     * Causes the minimum and/or natural height to grow if the new
     * proposed sizes exceed the current minimum and natural height.
     * <p>
     * This is used by {@code GtkCellAreaContext} implementations during
     * the request process over a series of {@code GtkTreeModel} rows to
     * progressively push the requested height over a series of
     * gtk_cell_area_get_preferred_height() requests.
     * @param minimumHeight the proposed new minimum height for {@code context}
     * @param naturalHeight the proposed new natural height for {@code context}
     */
    public void pushPreferredHeight(int minimumHeight, int naturalHeight) {
        try {
            DowncallHandles.gtk_cell_area_context_push_preferred_height.invokeExact(
                    handle(),
                    minimumHeight,
                    naturalHeight);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Causes the minimum and/or natural width to grow if the new
     * proposed sizes exceed the current minimum and natural width.
     * <p>
     * This is used by {@code GtkCellAreaContext} implementations during
     * the request process over a series of {@code GtkTreeModel} rows to
     * progressively push the requested width over a series of
     * gtk_cell_area_get_preferred_width() requests.
     * @param minimumWidth the proposed new minimum width for {@code context}
     * @param naturalWidth the proposed new natural width for {@code context}
     */
    public void pushPreferredWidth(int minimumWidth, int naturalWidth) {
        try {
            DowncallHandles.gtk_cell_area_context_push_preferred_width.invokeExact(
                    handle(),
                    minimumWidth,
                    naturalWidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Resets any previously cached request and allocation
     * data.
     * <p>
     * When underlying {@code GtkTreeModel} data changes its
     * important to reset the context if the content
     * size is allowed to shrink. If the content size
     * is only allowed to grow (this is usually an option
     * for views rendering large data stores as a measure
     * of optimization), then only the row that changed
     * or was inserted needs to be (re)requested with
     * gtk_cell_area_get_preferred_width().
     * <p>
     * When the new overall size of the context requires
     * that the allocated size changes (or whenever this
     * allocation changes at all), the variable row
     * sizes need to be re-requested for every row.
     * <p>
     * For instance, if the rows are displayed all with
     * the same width from top to bottom then a change
     * in the allocated width necessitates a recalculation
     * of all the displayed row heights using
     * gtk_cell_area_get_preferred_height_for_width().
     */
    public void reset() {
        try {
            DowncallHandles.gtk_cell_area_context_reset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_area_context_allocate = Interop.downcallHandle(
            "gtk_cell_area_context_allocate",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_cell_area_context_get_allocation = Interop.downcallHandle(
            "gtk_cell_area_context_get_allocation",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_cell_area_context_get_area = Interop.downcallHandle(
            "gtk_cell_area_context_get_area",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_cell_area_context_get_preferred_height = Interop.downcallHandle(
            "gtk_cell_area_context_get_preferred_height",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_cell_area_context_get_preferred_height_for_width = Interop.downcallHandle(
            "gtk_cell_area_context_get_preferred_height_for_width",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_cell_area_context_get_preferred_width = Interop.downcallHandle(
            "gtk_cell_area_context_get_preferred_width",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_cell_area_context_get_preferred_width_for_height = Interop.downcallHandle(
            "gtk_cell_area_context_get_preferred_width_for_height",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_cell_area_context_push_preferred_height = Interop.downcallHandle(
            "gtk_cell_area_context_push_preferred_height",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_cell_area_context_push_preferred_width = Interop.downcallHandle(
            "gtk_cell_area_context_push_preferred_width",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_cell_area_context_reset = Interop.downcallHandle(
            "gtk_cell_area_context_reset",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
