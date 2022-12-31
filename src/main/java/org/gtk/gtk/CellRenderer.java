package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An object for rendering a single cell
 * <p>
 * The {@code GtkCellRenderer} is a base class of a set of objects used for
 * rendering a cell to a {@code cairo_t}.  These objects are used primarily by
 * the {@code GtkTreeView} widget, though they aren’t tied to them in any
 * specific way.  It is worth noting that {@code GtkCellRenderer} is not a
 * {@code GtkWidget} and cannot be treated as such.
 * <p>
 * The primary use of a {@code GtkCellRenderer} is for drawing a certain graphical
 * elements on a {@code cairo_t}. Typically, one cell renderer is used to
 * draw many cells on the screen.  To this extent, it isn’t expected that a
 * CellRenderer keep any permanent state around.  Instead, any state is set
 * just prior to use using {@code GObject}s property system.  Then, the
 * cell is measured using gtk_cell_renderer_get_preferred_size(). Finally, the cell
 * is rendered in the correct location using gtk_cell_renderer_snapshot().
 * <p>
 * There are a number of rules that must be followed when writing a new
 * {@code GtkCellRenderer}.  First and foremost, it’s important that a certain set
 * of properties will always yield a cell renderer of the same size,
 * barring a style change. The {@code GtkCellRenderer} also has a number of
 * generic properties that are expected to be honored by all children.
 * <p>
 * Beyond merely rendering a cell, cell renderers can optionally
 * provide active user interface elements. A cell renderer can be
 * “activatable” like {@code GtkCellRenderer}Toggle,
 * which toggles when it gets activated by a mouse click, or it can be
 * “editable” like {@code GtkCellRenderer}Text, which
 * allows the user to edit the text using a widget implementing the
 * {@code GtkCellEditable} interface, e.g. {@code GtkEntry}.
 * To make a cell renderer activatable or editable, you have to
 * implement the {@code GtkCellRenderer}Class.activate or
 * {@code GtkCellRenderer}Class.start_editing virtual functions, respectively.
 * <p>
 * Many properties of {@code GtkCellRenderer} and its subclasses have a
 * corresponding “set” property, e.g. “cell-background-set” corresponds
 * to “cell-background”. These “set” properties reflect whether a property
 * has been set or not. You should not set them independently.
 */
public class CellRenderer extends org.gtk.gobject.InitiallyUnowned {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRenderer";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.InitiallyUnowned.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a CellRenderer proxy instance for the provided memory address.
     * <p>
     * Because CellRenderer is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CellRenderer(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellRenderer> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CellRenderer(input, ownership);
    
    /**
     * Passes an activate event to the cell renderer for possible processing.
     * Some cell renderers may use events; for example, {@code GtkCellRendererToggle}
     * toggles when it gets a mouse click.
     * @param event a {@code GdkEvent}
     * @param widget widget that received the event
     * @param path widget-dependent string representation of the event location;
     *    e.g. for {@code GtkTreeView}, a string representation of {@code GtkTreePath}
     * @param backgroundArea background area as passed to gtk_cell_renderer_render()
     * @param cellArea cell area as passed to gtk_cell_renderer_render()
     * @param flags render flags
     * @return {@code true} if the event was consumed/handled
     */
    public boolean activate(org.gtk.gdk.Event event, org.gtk.gtk.Widget widget, java.lang.String path, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, org.gtk.gtk.CellRendererState flags) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_renderer_activate.invokeExact(
                    handle(),
                    event.handle(),
                    widget.handle(),
                    Marshal.stringToAddress.marshal(path, null),
                    backgroundArea.handle(),
                    cellArea.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the aligned area used by {@code cell} inside {@code cell_area}. Used for finding
     * the appropriate edit and focus rectangle.
     * @param widget the {@code GtkWidget} this cell will be rendering to
     * @param flags render flags
     * @param cellArea cell area which would be passed to gtk_cell_renderer_render()
     * @param alignedArea the return location for the space inside {@code cell_area}
     *                that would actually be used to render.
     */
    public void getAlignedArea(org.gtk.gtk.Widget widget, org.gtk.gtk.CellRendererState flags, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle alignedArea) {
        try {
            DowncallHandles.gtk_cell_renderer_get_aligned_area.invokeExact(
                    handle(),
                    widget.handle(),
                    flags.getValue(),
                    cellArea.handle(),
                    alignedArea.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fills in {@code xalign} and {@code yalign} with the appropriate values of {@code cell}.
     * @param xalign location to fill in with the x alignment of the cell
     * @param yalign location to fill in with the y alignment of the cell
     */
    public void getAlignment(Out<Float> xalign, Out<Float> yalign) {
        MemorySegment xalignPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        MemorySegment yalignPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        try {
            DowncallHandles.gtk_cell_renderer_get_alignment.invokeExact(
                    handle(),
                    (Addressable) (xalign == null ? MemoryAddress.NULL : (Addressable) xalignPOINTER.address()),
                    (Addressable) (yalign == null ? MemoryAddress.NULL : (Addressable) yalignPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (xalign != null) xalign.set(xalignPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        if (yalign != null) yalign.set(yalignPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
    }
    
    /**
     * Fills in {@code width} and {@code height} with the appropriate size of {@code cell}.
     * @param width location to fill in with the fixed width of the cell
     * @param height location to fill in with the fixed height of the cell
     */
    public void getFixedSize(Out<Integer> width, Out<Integer> height) {
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_cell_renderer_get_fixed_size.invokeExact(
                    handle(),
                    (Addressable) (width == null ? MemoryAddress.NULL : (Addressable) widthPOINTER.address()),
                    (Addressable) (height == null ? MemoryAddress.NULL : (Addressable) heightPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (width != null) width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (height != null) height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Checks whether the given {@code GtkCellRenderer} is expanded.
     * @return {@code true} if the cell renderer is expanded
     */
    public boolean getIsExpanded() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_renderer_get_is_expanded.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks whether the given {@code GtkCellRenderer} is an expander.
     * @return {@code true} if {@code cell} is an expander, and {@code false} otherwise
     */
    public boolean getIsExpander() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_renderer_get_is_expander.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Fills in {@code xpad} and {@code ypad} with the appropriate values of {@code cell}.
     * @param xpad location to fill in with the x padding of the cell
     * @param ypad location to fill in with the y padding of the cell
     */
    public void getPadding(Out<Integer> xpad, Out<Integer> ypad) {
        MemorySegment xpadPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment ypadPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_cell_renderer_get_padding.invokeExact(
                    handle(),
                    (Addressable) (xpad == null ? MemoryAddress.NULL : (Addressable) xpadPOINTER.address()),
                    (Addressable) (ypad == null ? MemoryAddress.NULL : (Addressable) ypadPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (xpad != null) xpad.set(xpadPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (ypad != null) ypad.set(ypadPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Retrieves a renderer’s natural size when rendered to {@code widget}.
     * @param widget the {@code GtkWidget} this cell will be rendering to
     * @param minimumSize location to store the minimum size
     * @param naturalSize location to store the natural size
     */
    public void getPreferredHeight(org.gtk.gtk.Widget widget, Out<Integer> minimumSize, Out<Integer> naturalSize) {
        MemorySegment minimumSizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment naturalSizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_cell_renderer_get_preferred_height.invokeExact(
                    handle(),
                    widget.handle(),
                    (Addressable) (minimumSize == null ? MemoryAddress.NULL : (Addressable) minimumSizePOINTER.address()),
                    (Addressable) (naturalSize == null ? MemoryAddress.NULL : (Addressable) naturalSizePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (minimumSize != null) minimumSize.set(minimumSizePOINTER.get(Interop.valueLayout.C_INT, 0));
        if (naturalSize != null) naturalSize.set(naturalSizePOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Retrieves a cell renderers’s minimum and natural height if it were rendered to
     * {@code widget} with the specified {@code width}.
     * @param widget the {@code GtkWidget} this cell will be rendering to
     * @param width the size which is available for allocation
     * @param minimumHeight location for storing the minimum size
     * @param naturalHeight location for storing the preferred size
     */
    public void getPreferredHeightForWidth(org.gtk.gtk.Widget widget, int width, Out<Integer> minimumHeight, Out<Integer> naturalHeight) {
        MemorySegment minimumHeightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment naturalHeightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_cell_renderer_get_preferred_height_for_width.invokeExact(
                    handle(),
                    widget.handle(),
                    width,
                    (Addressable) (minimumHeight == null ? MemoryAddress.NULL : (Addressable) minimumHeightPOINTER.address()),
                    (Addressable) (naturalHeight == null ? MemoryAddress.NULL : (Addressable) naturalHeightPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (minimumHeight != null) minimumHeight.set(minimumHeightPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (naturalHeight != null) naturalHeight.set(naturalHeightPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Retrieves the minimum and natural size of a cell taking
     * into account the widget’s preference for height-for-width management.
     * @param widget the {@code GtkWidget} this cell will be rendering to
     * @param minimumSize location for storing the minimum size
     * @param naturalSize location for storing the natural size
     */
    public void getPreferredSize(org.gtk.gtk.Widget widget, @Nullable org.gtk.gtk.Requisition minimumSize, @Nullable org.gtk.gtk.Requisition naturalSize) {
        try {
            DowncallHandles.gtk_cell_renderer_get_preferred_size.invokeExact(
                    handle(),
                    widget.handle(),
                    (Addressable) (minimumSize == null ? MemoryAddress.NULL : minimumSize.handle()),
                    (Addressable) (naturalSize == null ? MemoryAddress.NULL : naturalSize.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves a renderer’s natural size when rendered to {@code widget}.
     * @param widget the {@code GtkWidget} this cell will be rendering to
     * @param minimumSize location to store the minimum size
     * @param naturalSize location to store the natural size
     */
    public void getPreferredWidth(org.gtk.gtk.Widget widget, Out<Integer> minimumSize, Out<Integer> naturalSize) {
        MemorySegment minimumSizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment naturalSizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_cell_renderer_get_preferred_width.invokeExact(
                    handle(),
                    widget.handle(),
                    (Addressable) (minimumSize == null ? MemoryAddress.NULL : (Addressable) minimumSizePOINTER.address()),
                    (Addressable) (naturalSize == null ? MemoryAddress.NULL : (Addressable) naturalSizePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (minimumSize != null) minimumSize.set(minimumSizePOINTER.get(Interop.valueLayout.C_INT, 0));
        if (naturalSize != null) naturalSize.set(naturalSizePOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Retrieves a cell renderers’s minimum and natural width if it were rendered to
     * {@code widget} with the specified {@code height}.
     * @param widget the {@code GtkWidget} this cell will be rendering to
     * @param height the size which is available for allocation
     * @param minimumWidth location for storing the minimum size
     * @param naturalWidth location for storing the preferred size
     */
    public void getPreferredWidthForHeight(org.gtk.gtk.Widget widget, int height, Out<Integer> minimumWidth, Out<Integer> naturalWidth) {
        MemorySegment minimumWidthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment naturalWidthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_cell_renderer_get_preferred_width_for_height.invokeExact(
                    handle(),
                    widget.handle(),
                    height,
                    (Addressable) (minimumWidth == null ? MemoryAddress.NULL : (Addressable) minimumWidthPOINTER.address()),
                    (Addressable) (naturalWidth == null ? MemoryAddress.NULL : (Addressable) naturalWidthPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (minimumWidth != null) minimumWidth.set(minimumWidthPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (naturalWidth != null) naturalWidth.set(naturalWidthPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Gets whether the cell renderer prefers a height-for-width layout
     * or a width-for-height layout.
     * @return The {@code GtkSizeRequestMode} preferred by this renderer.
     */
    public org.gtk.gtk.SizeRequestMode getRequestMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_renderer_get_request_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.SizeRequestMode.of(RESULT);
    }
    
    /**
     * Returns the cell renderer’s sensitivity.
     * @return {@code true} if the cell renderer is sensitive
     */
    public boolean getSensitive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_renderer_get_sensitive.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Translates the cell renderer state to {@code GtkStateFlags},
     * based on the cell renderer and widget sensitivity, and
     * the given {@code GtkCellRenderer}State.
     * @param widget a {@code GtkWidget}
     * @param cellState cell renderer state
     * @return the widget state flags applying to {@code cell}
     */
    public org.gtk.gtk.StateFlags getState(@Nullable org.gtk.gtk.Widget widget, org.gtk.gtk.CellRendererState cellState) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_renderer_get_state.invokeExact(
                    handle(),
                    (Addressable) (widget == null ? MemoryAddress.NULL : widget.handle()),
                    cellState.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.StateFlags(RESULT);
    }
    
    /**
     * Returns the cell renderer’s visibility.
     * @return {@code true} if the cell renderer is visible
     */
    public boolean getVisible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_renderer_get_visible.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks whether the cell renderer can do something when activated.
     * @return {@code true} if the cell renderer can do anything when activated
     */
    public boolean isActivatable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_renderer_is_activatable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the renderer’s alignment within its available space.
     * @param xalign the x alignment of the cell renderer
     * @param yalign the y alignment of the cell renderer
     */
    public void setAlignment(float xalign, float yalign) {
        try {
            DowncallHandles.gtk_cell_renderer_set_alignment.invokeExact(
                    handle(),
                    xalign,
                    yalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the renderer size to be explicit, independent of the properties set.
     * @param width the width of the cell renderer, or -1
     * @param height the height of the cell renderer, or -1
     */
    public void setFixedSize(int width, int height) {
        try {
            DowncallHandles.gtk_cell_renderer_set_fixed_size.invokeExact(
                    handle(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the given {@code GtkCellRenderer} is expanded.
     * @param isExpanded whether {@code cell} should be expanded
     */
    public void setIsExpanded(boolean isExpanded) {
        try {
            DowncallHandles.gtk_cell_renderer_set_is_expanded.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(isExpanded, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the given {@code GtkCellRenderer} is an expander.
     * @param isExpander whether {@code cell} is an expander
     */
    public void setIsExpander(boolean isExpander) {
        try {
            DowncallHandles.gtk_cell_renderer_set_is_expander.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(isExpander, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the renderer’s padding.
     * @param xpad the x padding of the cell renderer
     * @param ypad the y padding of the cell renderer
     */
    public void setPadding(int xpad, int ypad) {
        try {
            DowncallHandles.gtk_cell_renderer_set_padding.invokeExact(
                    handle(),
                    xpad,
                    ypad);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the cell renderer’s sensitivity.
     * @param sensitive the sensitivity of the cell
     */
    public void setSensitive(boolean sensitive) {
        try {
            DowncallHandles.gtk_cell_renderer_set_sensitive.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(sensitive, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the cell renderer’s visibility.
     * @param visible the visibility of the cell
     */
    public void setVisible(boolean visible) {
        try {
            DowncallHandles.gtk_cell_renderer_set_visible.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(visible, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Invokes the virtual render function of the {@code GtkCellRenderer}. The three
     * passed-in rectangles are areas in {@code cr}. Most renderers will draw within
     * {@code cell_area}; the xalign, yalign, xpad, and ypad fields of the {@code GtkCellRenderer}
     * should be honored with respect to {@code cell_area}. {@code background_area} includes the
     * blank space around the cell, and also the area containing the tree expander;
     * so the {@code background_area} rectangles for all cells tile to cover the entire
     * {@code window}.
     * @param snapshot a {@code GtkSnapshot} to draw to
     * @param widget the widget owning {@code window}
     * @param backgroundArea entire cell area (including tree expanders and maybe
     *    padding on the sides)
     * @param cellArea area normally rendered by a cell renderer
     * @param flags flags that affect rendering
     */
    public void snapshot(org.gtk.gtk.Snapshot snapshot, org.gtk.gtk.Widget widget, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, org.gtk.gtk.CellRendererState flags) {
        try {
            DowncallHandles.gtk_cell_renderer_snapshot.invokeExact(
                    handle(),
                    snapshot.handle(),
                    widget.handle(),
                    backgroundArea.handle(),
                    cellArea.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Starts editing the contents of this {@code cell}, through a new {@code GtkCellEditable}
     * widget created by the {@code GtkCellRenderer}Class.start_editing virtual function.
     * @param event a {@code GdkEvent}
     * @param widget widget that received the event
     * @param path widget-dependent string representation of the event location;
     *    e.g. for {@code GtkTreeView}, a string representation of {@code GtkTreePath}
     * @param backgroundArea background area as passed to gtk_cell_renderer_render()
     * @param cellArea cell area as passed to gtk_cell_renderer_render()
     * @param flags render flags
     * @return A new {@code GtkCellEditable} for editing this
     *   {@code cell}, or {@code null} if editing is not possible
     */
    public @Nullable org.gtk.gtk.CellEditable startEditing(@Nullable org.gtk.gdk.Event event, org.gtk.gtk.Widget widget, java.lang.String path, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, org.gtk.gtk.CellRendererState flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_renderer_start_editing.invokeExact(
                    handle(),
                    (Addressable) (event == null ? MemoryAddress.NULL : event.handle()),
                    widget.handle(),
                    Marshal.stringToAddress.marshal(path, null),
                    backgroundArea.handle(),
                    cellArea.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.CellEditable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.CellEditable.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Informs the cell renderer that the editing is stopped.
     * If {@code canceled} is {@code true}, the cell renderer will emit the
     * {@code GtkCellRenderer}::editing-canceled signal.
     * <p>
     * This function should be called by cell renderer implementations
     * in response to the {@code GtkCellEditable::editing-done} signal of
     * {@code GtkCellEditable}.
     * @param canceled {@code true} if the editing has been canceled
     */
    public void stopEditing(boolean canceled) {
        try {
            DowncallHandles.gtk_cell_renderer_stop_editing.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(canceled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_cell_renderer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface EditingCanceled {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceCellRenderer) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EditingCanceled.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * This signal gets emitted when the user cancels the process of editing a
     * cell.  For example, an editable cell renderer could be written to cancel
     * editing when the user presses Escape.
     * <p>
     * See also: gtk_cell_renderer_stop_editing().
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<CellRenderer.EditingCanceled> onEditingCanceled(CellRenderer.EditingCanceled handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("editing-canceled"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface EditingStarted {
        void run(org.gtk.gtk.CellEditable editable, java.lang.String path);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceCellRenderer, MemoryAddress editable, MemoryAddress path) {
            run((org.gtk.gtk.CellEditable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(editable)), org.gtk.gtk.CellEditable.fromAddress).marshal(editable, Ownership.NONE), Marshal.addressToString.marshal(path, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EditingStarted.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * This signal gets emitted when a cell starts to be edited.
     * The intended use of this signal is to do special setup
     * on {@code editable}, e.g. adding a {@code GtkEntryCompletion} or setting
     * up additional columns in a {@code GtkComboBox}.
     * <p>
     * See gtk_cell_editable_start_editing() for information on the lifecycle of
     * the {@code editable} and a way to do setup that doesn’t depend on the {@code renderer}.
     * <p>
     * Note that GTK doesn't guarantee that cell renderers will
     * continue to use the same kind of widget for editing in future
     * releases, therefore you should check the type of {@code editable}
     * before doing any specific setup, as in the following example:
     * <pre>{@code <!-- language="C" -->
     * static void
     * text_editing_started (GtkCellRenderer *cell,
     *                       GtkCellEditable *editable,
     *                       const char      *path,
     *                       gpointer         data)
     * {
     *   if (GTK_IS_ENTRY (editable))
     *     {
     *       GtkEntry *entry = GTK_ENTRY (editable);
     *       
     *       // ... create a GtkEntryCompletion
     *       
     *       gtk_entry_set_completion (entry, completion);
     *     }
     * }
     * }</pre>
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<CellRenderer.EditingStarted> onEditingStarted(CellRenderer.EditingStarted handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("editing-started"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link CellRenderer.Builder} object constructs a {@link CellRenderer} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CellRenderer.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.InitiallyUnowned.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CellRenderer} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CellRenderer}.
         * @return A new instance of {@code CellRenderer} with the properties 
         *         that were set in the Builder object.
         */
        public CellRenderer build() {
            return (CellRenderer) org.gtk.gobject.GObject.newWithProperties(
                CellRenderer.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setCellBackground(java.lang.String cellBackground) {
            names.add("cell-background");
            values.add(org.gtk.gobject.Value.create(cellBackground));
            return this;
        }
        
        /**
         * Cell background as a {@code GdkRGBA}
         * @param cellBackgroundRgba The value for the {@code cell-background-rgba} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCellBackgroundRgba(org.gtk.gdk.RGBA cellBackgroundRgba) {
            names.add("cell-background-rgba");
            values.add(org.gtk.gobject.Value.create(cellBackgroundRgba));
            return this;
        }
        
        public Builder setCellBackgroundSet(boolean cellBackgroundSet) {
            names.add("cell-background-set");
            values.add(org.gtk.gobject.Value.create(cellBackgroundSet));
            return this;
        }
        
        public Builder setEditing(boolean editing) {
            names.add("editing");
            values.add(org.gtk.gobject.Value.create(editing));
            return this;
        }
        
        public Builder setHeight(int height) {
            names.add("height");
            values.add(org.gtk.gobject.Value.create(height));
            return this;
        }
        
        public Builder setIsExpanded(boolean isExpanded) {
            names.add("is-expanded");
            values.add(org.gtk.gobject.Value.create(isExpanded));
            return this;
        }
        
        public Builder setIsExpander(boolean isExpander) {
            names.add("is-expander");
            values.add(org.gtk.gobject.Value.create(isExpander));
            return this;
        }
        
        public Builder setMode(org.gtk.gtk.CellRendererMode mode) {
            names.add("mode");
            values.add(org.gtk.gobject.Value.create(mode));
            return this;
        }
        
        public Builder setSensitive(boolean sensitive) {
            names.add("sensitive");
            values.add(org.gtk.gobject.Value.create(sensitive));
            return this;
        }
        
        public Builder setVisible(boolean visible) {
            names.add("visible");
            values.add(org.gtk.gobject.Value.create(visible));
            return this;
        }
        
        public Builder setWidth(int width) {
            names.add("width");
            values.add(org.gtk.gobject.Value.create(width));
            return this;
        }
        
        public Builder setXalign(float xalign) {
            names.add("xalign");
            values.add(org.gtk.gobject.Value.create(xalign));
            return this;
        }
        
        public Builder setXpad(int xpad) {
            names.add("xpad");
            values.add(org.gtk.gobject.Value.create(xpad));
            return this;
        }
        
        public Builder setYalign(float yalign) {
            names.add("yalign");
            values.add(org.gtk.gobject.Value.create(yalign));
            return this;
        }
        
        public Builder setYpad(int ypad) {
            names.add("ypad");
            values.add(org.gtk.gobject.Value.create(ypad));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_renderer_activate = Interop.downcallHandle(
            "gtk_cell_renderer_activate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_get_aligned_area = Interop.downcallHandle(
            "gtk_cell_renderer_get_aligned_area",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_get_alignment = Interop.downcallHandle(
            "gtk_cell_renderer_get_alignment",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_get_fixed_size = Interop.downcallHandle(
            "gtk_cell_renderer_get_fixed_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_get_is_expanded = Interop.downcallHandle(
            "gtk_cell_renderer_get_is_expanded",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_get_is_expander = Interop.downcallHandle(
            "gtk_cell_renderer_get_is_expander",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_get_padding = Interop.downcallHandle(
            "gtk_cell_renderer_get_padding",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_get_preferred_height = Interop.downcallHandle(
            "gtk_cell_renderer_get_preferred_height",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_get_preferred_height_for_width = Interop.downcallHandle(
            "gtk_cell_renderer_get_preferred_height_for_width",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_get_preferred_size = Interop.downcallHandle(
            "gtk_cell_renderer_get_preferred_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_get_preferred_width = Interop.downcallHandle(
            "gtk_cell_renderer_get_preferred_width",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_get_preferred_width_for_height = Interop.downcallHandle(
            "gtk_cell_renderer_get_preferred_width_for_height",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_get_request_mode = Interop.downcallHandle(
            "gtk_cell_renderer_get_request_mode",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_get_sensitive = Interop.downcallHandle(
            "gtk_cell_renderer_get_sensitive",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_get_state = Interop.downcallHandle(
            "gtk_cell_renderer_get_state",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_get_visible = Interop.downcallHandle(
            "gtk_cell_renderer_get_visible",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_is_activatable = Interop.downcallHandle(
            "gtk_cell_renderer_is_activatable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_set_alignment = Interop.downcallHandle(
            "gtk_cell_renderer_set_alignment",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_set_fixed_size = Interop.downcallHandle(
            "gtk_cell_renderer_set_fixed_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_set_is_expanded = Interop.downcallHandle(
            "gtk_cell_renderer_set_is_expanded",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_set_is_expander = Interop.downcallHandle(
            "gtk_cell_renderer_set_is_expander",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_set_padding = Interop.downcallHandle(
            "gtk_cell_renderer_set_padding",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_set_sensitive = Interop.downcallHandle(
            "gtk_cell_renderer_set_sensitive",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_set_visible = Interop.downcallHandle(
            "gtk_cell_renderer_set_visible",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_snapshot = Interop.downcallHandle(
            "gtk_cell_renderer_snapshot",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_start_editing = Interop.downcallHandle(
            "gtk_cell_renderer_start_editing",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_stop_editing = Interop.downcallHandle(
            "gtk_cell_renderer_stop_editing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_get_type = Interop.downcallHandle(
            "gtk_cell_renderer_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
