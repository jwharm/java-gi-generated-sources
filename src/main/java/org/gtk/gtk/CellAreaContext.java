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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a CellAreaContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CellAreaContext(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CellAreaContext if its GType is a (or inherits from) "GtkCellAreaContext".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CellAreaContext} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCellAreaContext", a ClassCastException will be thrown.
     */
    public static CellAreaContext castFrom(org.gtk.gobject.Object gobject) {
            return new CellAreaContext(gobject.handle(), gobject.yieldOwnership());
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
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(height, "Parameter 'height' must not be null");
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_cell_area_context_get_allocation.invokeExact(
                    handle(),
                    (Addressable) widthPOINTER.address(),
                    (Addressable) heightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
        height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
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
        return new org.gtk.gtk.CellArea(RESULT, Ownership.NONE);
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
        MemorySegment minimumHeightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(naturalHeight, "Parameter 'naturalHeight' must not be null");
        MemorySegment naturalHeightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_cell_area_context_get_preferred_height.invokeExact(
                    handle(),
                    (Addressable) minimumHeightPOINTER.address(),
                    (Addressable) naturalHeightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        minimumHeight.set(minimumHeightPOINTER.get(Interop.valueLayout.C_INT, 0));
        naturalHeight.set(naturalHeightPOINTER.get(Interop.valueLayout.C_INT, 0));
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
        MemorySegment minimumHeightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(naturalHeight, "Parameter 'naturalHeight' must not be null");
        MemorySegment naturalHeightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_cell_area_context_get_preferred_height_for_width.invokeExact(
                    handle(),
                    width,
                    (Addressable) minimumHeightPOINTER.address(),
                    (Addressable) naturalHeightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        minimumHeight.set(minimumHeightPOINTER.get(Interop.valueLayout.C_INT, 0));
        naturalHeight.set(naturalHeightPOINTER.get(Interop.valueLayout.C_INT, 0));
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
        MemorySegment minimumWidthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(naturalWidth, "Parameter 'naturalWidth' must not be null");
        MemorySegment naturalWidthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_cell_area_context_get_preferred_width.invokeExact(
                    handle(),
                    (Addressable) minimumWidthPOINTER.address(),
                    (Addressable) naturalWidthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        minimumWidth.set(minimumWidthPOINTER.get(Interop.valueLayout.C_INT, 0));
        naturalWidth.set(naturalWidthPOINTER.get(Interop.valueLayout.C_INT, 0));
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
        MemorySegment minimumWidthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(naturalWidth, "Parameter 'naturalWidth' must not be null");
        MemorySegment naturalWidthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_cell_area_context_get_preferred_width_for_height.invokeExact(
                    handle(),
                    height,
                    (Addressable) minimumWidthPOINTER.address(),
                    (Addressable) naturalWidthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        minimumWidth.set(minimumWidthPOINTER.get(Interop.valueLayout.C_INT, 0));
        naturalWidth.set(naturalWidthPOINTER.get(Interop.valueLayout.C_INT, 0));
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_cell_area_context_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link CellAreaContext.Build} object constructs a {@link CellAreaContext} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link CellAreaContext} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CellAreaContext} using {@link CellAreaContext#castFrom}.
         * @return A new instance of {@code CellAreaContext} with the properties 
         *         that were set in the Build object.
         */
        public CellAreaContext construct() {
            return CellAreaContext.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    CellAreaContext.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The {@code GtkCellArea} this context was created by
         * @param area The value for the {@code area} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setArea(org.gtk.gtk.CellArea area) {
            names.add("area");
            values.add(org.gtk.gobject.Value.create(area));
            return this;
        }
        
        /**
         * The minimum height for the {@code GtkCellArea} in this context
         * for all {@code GtkTreeModel} rows that this context was requested
         * for using gtk_cell_area_get_preferred_height().
         * @param minimumHeight The value for the {@code minimum-height} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMinimumHeight(int minimumHeight) {
            names.add("minimum-height");
            values.add(org.gtk.gobject.Value.create(minimumHeight));
            return this;
        }
        
        /**
         * The minimum width for the {@code GtkCellArea} in this context
         * for all {@code GtkTreeModel} rows that this context was requested
         * for using gtk_cell_area_get_preferred_width().
         * @param minimumWidth The value for the {@code minimum-width} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMinimumWidth(int minimumWidth) {
            names.add("minimum-width");
            values.add(org.gtk.gobject.Value.create(minimumWidth));
            return this;
        }
        
        /**
         * The natural height for the {@code GtkCellArea} in this context
         * for all {@code GtkTreeModel} rows that this context was requested
         * for using gtk_cell_area_get_preferred_height().
         * @param naturalHeight The value for the {@code natural-height} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNaturalHeight(int naturalHeight) {
            names.add("natural-height");
            values.add(org.gtk.gobject.Value.create(naturalHeight));
            return this;
        }
        
        /**
         * The natural width for the {@code GtkCellArea} in this context
         * for all {@code GtkTreeModel} rows that this context was requested
         * for using gtk_cell_area_get_preferred_width().
         * @param naturalWidth The value for the {@code natural-width} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNaturalWidth(int naturalWidth) {
            names.add("natural-width");
            values.add(org.gtk.gobject.Value.create(naturalWidth));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_area_context_allocate = Interop.downcallHandle(
            "gtk_cell_area_context_allocate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_area_context_get_allocation = Interop.downcallHandle(
            "gtk_cell_area_context_get_allocation",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_context_get_area = Interop.downcallHandle(
            "gtk_cell_area_context_get_area",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_context_get_preferred_height = Interop.downcallHandle(
            "gtk_cell_area_context_get_preferred_height",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_context_get_preferred_height_for_width = Interop.downcallHandle(
            "gtk_cell_area_context_get_preferred_height_for_width",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_context_get_preferred_width = Interop.downcallHandle(
            "gtk_cell_area_context_get_preferred_width",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_context_get_preferred_width_for_height = Interop.downcallHandle(
            "gtk_cell_area_context_get_preferred_width_for_height",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_context_push_preferred_height = Interop.downcallHandle(
            "gtk_cell_area_context_push_preferred_height",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_area_context_push_preferred_width = Interop.downcallHandle(
            "gtk_cell_area_context_push_preferred_width",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_area_context_reset = Interop.downcallHandle(
            "gtk_cell_area_context_reset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_context_get_type = Interop.downcallHandle(
            "gtk_cell_area_context_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
