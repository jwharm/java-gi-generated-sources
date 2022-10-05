package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public CellRenderer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CellRenderer */
    public static CellRenderer castFrom(org.gtk.gobject.Object gobject) {
        return new CellRenderer(gobject.refcounted());
    }
    
    static final MethodHandle gtk_cell_renderer_activate = Interop.downcallHandle(
        "gtk_cell_renderer_activate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Passes an activate event to the cell renderer for possible processing.
     * Some cell renderers may use events; for example, {@code GtkCellRendererToggle}
     * toggles when it gets a mouse click.
     */
    public boolean activate(org.gtk.gdk.Event event, Widget widget, java.lang.String path, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, CellRendererState flags) {
        try {
            var RESULT = (int) gtk_cell_renderer_activate.invokeExact(handle(), event.handle(), widget.handle(), Interop.allocateNativeString(path).handle(), backgroundArea.handle(), cellArea.handle(), flags.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_get_aligned_area = Interop.downcallHandle(
        "gtk_cell_renderer_get_aligned_area",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the aligned area used by {@code cell} inside {@code cell_area}. Used for finding
     * the appropriate edit and focus rectangle.
     */
    public void getAlignedArea(Widget widget, CellRendererState flags, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle alignedArea) {
        try {
            gtk_cell_renderer_get_aligned_area.invokeExact(handle(), widget.handle(), flags.getValue(), cellArea.handle(), alignedArea.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_get_alignment = Interop.downcallHandle(
        "gtk_cell_renderer_get_alignment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fills in {@code xalign} and {@code yalign} with the appropriate values of {@code cell}.
     */
    public void getAlignment(PointerFloat xalign, PointerFloat yalign) {
        try {
            gtk_cell_renderer_get_alignment.invokeExact(handle(), xalign.handle(), yalign.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_get_fixed_size = Interop.downcallHandle(
        "gtk_cell_renderer_get_fixed_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fills in {@code width} and {@code height} with the appropriate size of {@code cell}.
     */
    public void getFixedSize(PointerInteger width, PointerInteger height) {
        try {
            gtk_cell_renderer_get_fixed_size.invokeExact(handle(), width.handle(), height.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_get_is_expanded = Interop.downcallHandle(
        "gtk_cell_renderer_get_is_expanded",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given {@code GtkCellRenderer} is expanded.
     */
    public boolean getIsExpanded() {
        try {
            var RESULT = (int) gtk_cell_renderer_get_is_expanded.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_get_is_expander = Interop.downcallHandle(
        "gtk_cell_renderer_get_is_expander",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given {@code GtkCellRenderer} is an expander.
     */
    public boolean getIsExpander() {
        try {
            var RESULT = (int) gtk_cell_renderer_get_is_expander.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_get_padding = Interop.downcallHandle(
        "gtk_cell_renderer_get_padding",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fills in {@code xpad} and {@code ypad} with the appropriate values of {@code cell}.
     */
    public void getPadding(PointerInteger xpad, PointerInteger ypad) {
        try {
            gtk_cell_renderer_get_padding.invokeExact(handle(), xpad.handle(), ypad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_get_preferred_height = Interop.downcallHandle(
        "gtk_cell_renderer_get_preferred_height",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a renderer’s natural size when rendered to {@code widget}.
     */
    public void getPreferredHeight(Widget widget, PointerInteger minimumSize, PointerInteger naturalSize) {
        try {
            gtk_cell_renderer_get_preferred_height.invokeExact(handle(), widget.handle(), minimumSize.handle(), naturalSize.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_get_preferred_height_for_width = Interop.downcallHandle(
        "gtk_cell_renderer_get_preferred_height_for_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a cell renderers’s minimum and natural height if it were rendered to
     * {@code widget} with the specified {@code width}.
     */
    public void getPreferredHeightForWidth(Widget widget, int width, PointerInteger minimumHeight, PointerInteger naturalHeight) {
        try {
            gtk_cell_renderer_get_preferred_height_for_width.invokeExact(handle(), widget.handle(), width, minimumHeight.handle(), naturalHeight.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_get_preferred_size = Interop.downcallHandle(
        "gtk_cell_renderer_get_preferred_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the minimum and natural size of a cell taking
     * into account the widget’s preference for height-for-width management.
     */
    public void getPreferredSize(Widget widget, Requisition minimumSize, Requisition naturalSize) {
        try {
            gtk_cell_renderer_get_preferred_size.invokeExact(handle(), widget.handle(), minimumSize.handle(), naturalSize.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_get_preferred_width = Interop.downcallHandle(
        "gtk_cell_renderer_get_preferred_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a renderer’s natural size when rendered to {@code widget}.
     */
    public void getPreferredWidth(Widget widget, PointerInteger minimumSize, PointerInteger naturalSize) {
        try {
            gtk_cell_renderer_get_preferred_width.invokeExact(handle(), widget.handle(), minimumSize.handle(), naturalSize.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_get_preferred_width_for_height = Interop.downcallHandle(
        "gtk_cell_renderer_get_preferred_width_for_height",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a cell renderers’s minimum and natural width if it were rendered to
     * {@code widget} with the specified {@code height}.
     */
    public void getPreferredWidthForHeight(Widget widget, int height, PointerInteger minimumWidth, PointerInteger naturalWidth) {
        try {
            gtk_cell_renderer_get_preferred_width_for_height.invokeExact(handle(), widget.handle(), height, minimumWidth.handle(), naturalWidth.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_get_request_mode = Interop.downcallHandle(
        "gtk_cell_renderer_get_request_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the cell renderer prefers a height-for-width layout
     * or a width-for-height layout.
     */
    public SizeRequestMode getRequestMode() {
        try {
            var RESULT = (int) gtk_cell_renderer_get_request_mode.invokeExact(handle());
            return new SizeRequestMode(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_get_sensitive = Interop.downcallHandle(
        "gtk_cell_renderer_get_sensitive",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the cell renderer’s sensitivity.
     */
    public boolean getSensitive() {
        try {
            var RESULT = (int) gtk_cell_renderer_get_sensitive.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_get_state = Interop.downcallHandle(
        "gtk_cell_renderer_get_state",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Translates the cell renderer state to {@code GtkStateFlags},
     * based on the cell renderer and widget sensitivity, and
     * the given {@code GtkCellRenderer}State.
     */
    public StateFlags getState(Widget widget, CellRendererState cellState) {
        try {
            var RESULT = (int) gtk_cell_renderer_get_state.invokeExact(handle(), widget.handle(), cellState.getValue());
            return new StateFlags(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_get_visible = Interop.downcallHandle(
        "gtk_cell_renderer_get_visible",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the cell renderer’s visibility.
     */
    public boolean getVisible() {
        try {
            var RESULT = (int) gtk_cell_renderer_get_visible.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_is_activatable = Interop.downcallHandle(
        "gtk_cell_renderer_is_activatable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the cell renderer can do something when activated.
     */
    public boolean isActivatable() {
        try {
            var RESULT = (int) gtk_cell_renderer_is_activatable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_set_alignment = Interop.downcallHandle(
        "gtk_cell_renderer_set_alignment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Sets the renderer’s alignment within its available space.
     */
    public void setAlignment(float xalign, float yalign) {
        try {
            gtk_cell_renderer_set_alignment.invokeExact(handle(), xalign, yalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_set_fixed_size = Interop.downcallHandle(
        "gtk_cell_renderer_set_fixed_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the renderer size to be explicit, independent of the properties set.
     */
    public void setFixedSize(int width, int height) {
        try {
            gtk_cell_renderer_set_fixed_size.invokeExact(handle(), width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_set_is_expanded = Interop.downcallHandle(
        "gtk_cell_renderer_set_is_expanded",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the given {@code GtkCellRenderer} is expanded.
     */
    public void setIsExpanded(boolean isExpanded) {
        try {
            gtk_cell_renderer_set_is_expanded.invokeExact(handle(), isExpanded ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_set_is_expander = Interop.downcallHandle(
        "gtk_cell_renderer_set_is_expander",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the given {@code GtkCellRenderer} is an expander.
     */
    public void setIsExpander(boolean isExpander) {
        try {
            gtk_cell_renderer_set_is_expander.invokeExact(handle(), isExpander ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_set_padding = Interop.downcallHandle(
        "gtk_cell_renderer_set_padding",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the renderer’s padding.
     */
    public void setPadding(int xpad, int ypad) {
        try {
            gtk_cell_renderer_set_padding.invokeExact(handle(), xpad, ypad);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_set_sensitive = Interop.downcallHandle(
        "gtk_cell_renderer_set_sensitive",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the cell renderer’s sensitivity.
     */
    public void setSensitive(boolean sensitive) {
        try {
            gtk_cell_renderer_set_sensitive.invokeExact(handle(), sensitive ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_set_visible = Interop.downcallHandle(
        "gtk_cell_renderer_set_visible",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the cell renderer’s visibility.
     */
    public void setVisible(boolean visible) {
        try {
            gtk_cell_renderer_set_visible.invokeExact(handle(), visible ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_snapshot = Interop.downcallHandle(
        "gtk_cell_renderer_snapshot",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Invokes the virtual render function of the {@code GtkCellRenderer}. The three
     * passed-in rectangles are areas in {@code cr}. Most renderers will draw within
     * {@code cell_area}; the xalign, yalign, xpad, and ypad fields of the {@code GtkCellRenderer}
     * should be honored with respect to {@code cell_area}. {@code background_area} includes the
     * blank space around the cell, and also the area containing the tree expander;
     * so the {@code background_area} rectangles for all cells tile to cover the entire
     * {@code window}.
     */
    public void snapshot(Snapshot snapshot, Widget widget, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, CellRendererState flags) {
        try {
            gtk_cell_renderer_snapshot.invokeExact(handle(), snapshot.handle(), widget.handle(), backgroundArea.handle(), cellArea.handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_start_editing = Interop.downcallHandle(
        "gtk_cell_renderer_start_editing",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Starts editing the contents of this {@code cell}, through a new {@code GtkCellEditable}
     * widget created by the {@code GtkCellRenderer}Class.start_editing virtual function.
     */
    public CellEditable startEditing(org.gtk.gdk.Event event, Widget widget, java.lang.String path, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, CellRendererState flags) {
        try {
            var RESULT = (MemoryAddress) gtk_cell_renderer_start_editing.invokeExact(handle(), event.handle(), widget.handle(), Interop.allocateNativeString(path).handle(), backgroundArea.handle(), cellArea.handle(), flags.getValue());
            return new CellEditable.CellEditableImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_renderer_stop_editing = Interop.downcallHandle(
        "gtk_cell_renderer_stop_editing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Informs the cell renderer that the editing is stopped.
     * If {@code canceled} is {@code true}, the cell renderer will emit the
     * {@code GtkCellRenderer}::editing-canceled signal.
     * <p>
     * This function should be called by cell renderer implementations
     * in response to the {@code GtkCellEditable::editing-done} signal of
     * {@code GtkCellEditable}.
     */
    public void stopEditing(boolean canceled) {
        try {
            gtk_cell_renderer_stop_editing.invokeExact(handle(), canceled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface EditingCanceledHandler {
        void signalReceived(CellRenderer source);
    }
    
    /**
     * This signal gets emitted when the user cancels the process of editing a
     * cell.  For example, an editable cell renderer could be written to cancel
     * editing when the user presses Escape.
     * <p>
     * See also: gtk_cell_renderer_stop_editing().
     */
    public SignalHandle onEditingCanceled(EditingCanceledHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("editing-canceled").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellRenderer.Callbacks.class, "signalCellRendererEditingCanceled",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface EditingStartedHandler {
        void signalReceived(CellRenderer source, CellEditable editable, java.lang.String path);
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
     */
    public SignalHandle onEditingStarted(EditingStartedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("editing-started").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellRenderer.Callbacks.class, "signalCellRendererEditingStarted",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalCellRendererEditingCanceled(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (CellRenderer.EditingCanceledHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new CellRenderer(Refcounted.get(source)));
        }
        
        public static void signalCellRendererEditingStarted(MemoryAddress source, MemoryAddress editable, MemoryAddress path, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (CellRenderer.EditingStartedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new CellRenderer(Refcounted.get(source)), new CellEditable.CellEditableImpl(Refcounted.get(editable, false)), path.getUtf8String(0));
        }
        
    }
}
