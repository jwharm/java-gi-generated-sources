package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A widget displaying a single row of a GtkTreeModel
 * <p>
 * A {@code GtkCellView} displays a single row of a {@code GtkTreeModel} using a {@code GtkCellArea}
 * and {@code GtkCellAreaContext}. A {@code GtkCellAreaContext} can be provided to the
 * {@code GtkCellView} at construction time in order to keep the cellview in context
 * of a group of cell views, this ensures that the renderers displayed will
 * be properly aligned with each other (like the aligned cells in the menus
 * of {@code GtkComboBox}).
 * <p>
 * {@code GtkCellView} is {@code GtkOrientable} in order to decide in which orientation
 * the underlying {@code GtkCellAreaContext} should be allocated. Taking the {@code GtkComboBox}
 * menu as an example, cellviews should be oriented horizontally if the menus are
 * listed top-to-bottom and thus all share the same width but may have separate
 * individual heights (left-to-right menus should be allocated vertically since
 * they all share the same height but may have variable widths).
 * <p>
 * <strong>CSS nodes</strong><br/>
 * GtkCellView has a single CSS node with name cellview.
 */
public class CellView extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.CellLayout, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellView";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CellView proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CellView(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CellView if its GType is a (or inherits from) "GtkCellView".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "CellView" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCellView", a ClassCastException will be thrown.
     */
    public static CellView castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkCellView"))) {
            return new CellView(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCellView");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_view_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellView} widget.
     */
    public CellView() {
        super(constructNew(), Ownership.NONE);
    }
    
    private static Addressable constructNewWithContext(@NotNull org.gtk.gtk.CellArea area, @NotNull org.gtk.gtk.CellAreaContext context) {
        java.util.Objects.requireNonNull(area, "Parameter 'area' must not be null");
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_view_new_with_context.invokeExact(
                    area.handle(),
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellView} widget with a specific {@code GtkCellArea}
     * to layout cells and a specific {@code GtkCellAreaContext}.
     * <p>
     * Specifying the same context for a handful of cells lets
     * the underlying area synchronize the geometry for those cells,
     * in this way alignments with cellviews for other rows are
     * possible.
     * @param area the {@code GtkCellArea} to layout cells
     * @param context the {@code GtkCellAreaContext} in which to calculate cell geometry
     * @return A newly created {@code GtkCellView} widget.
     */
    public static CellView newWithContext(@NotNull org.gtk.gtk.CellArea area, @NotNull org.gtk.gtk.CellAreaContext context) {
        return new CellView(constructNewWithContext(area, context), Ownership.NONE);
    }
    
    private static Addressable constructNewWithMarkup(@NotNull java.lang.String markup) {
        java.util.Objects.requireNonNull(markup, "Parameter 'markup' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_view_new_with_markup.invokeExact(
                    Interop.allocateNativeString(markup));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellView} widget, adds a {@code GtkCellRendererText}
     * to it, and makes it show {@code markup}. The text can be marked up with
     * the <a href="https://docs.gtk.org/Pango/pango_markup.html">Pango text markup language</a>.
     * @param markup the text to display in the cell view
     * @return A newly created {@code GtkCellView} widget.
     */
    public static CellView newWithMarkup(@NotNull java.lang.String markup) {
        return new CellView(constructNewWithMarkup(markup), Ownership.NONE);
    }
    
    private static Addressable constructNewWithText(@NotNull java.lang.String text) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_view_new_with_text.invokeExact(
                    Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellView} widget, adds a {@code GtkCellRendererText}
     * to it, and makes it show {@code text}.
     * @param text the text to display in the cell view
     * @return A newly created {@code GtkCellView} widget.
     */
    public static CellView newWithText(@NotNull java.lang.String text) {
        return new CellView(constructNewWithText(text), Ownership.NONE);
    }
    
    private static Addressable constructNewWithTexture(@NotNull org.gtk.gdk.Texture texture) {
        java.util.Objects.requireNonNull(texture, "Parameter 'texture' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_view_new_with_texture.invokeExact(
                    texture.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellView} widget, adds a {@code GtkCellRendererPixbuf}
     * to it, and makes it show {@code texture}.
     * @param texture the image to display in the cell view
     * @return A newly created {@code GtkCellView} widget.
     */
    public static CellView newWithTexture(@NotNull org.gtk.gdk.Texture texture) {
        return new CellView(constructNewWithTexture(texture), Ownership.NONE);
    }
    
    /**
     * Returns a {@code GtkTreePath} referring to the currently
     * displayed row. If no row is currently displayed,
     * {@code null} is returned.
     * @return the currently displayed row
     */
    public @Nullable org.gtk.gtk.TreePath getDisplayedRow() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_view_get_displayed_row.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TreePath(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets whether {@code cell_view} is configured to draw all of its
     * cells in a sensitive state.
     * @return whether {@code cell_view} draws all of its
     * cells in a sensitive state
     */
    public boolean getDrawSensitive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_view_get_draw_sensitive.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code cell_view} is configured to request space
     * to fit the entire {@code GtkTreeModel}.
     * @return whether {@code cell_view} requests space to fit
     * the entire {@code GtkTreeModel}.
     */
    public boolean getFitModel() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_view_get_fit_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the model for {@code cell_view}. If no model is used {@code null} is
     * returned.
     * @return a {@code GtkTreeModel} used
     */
    public @Nullable org.gtk.gtk.TreeModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_view_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TreeModel.TreeModelImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the row of the model that is currently displayed
     * by the {@code GtkCellView}. If the path is unset, then the
     * contents of the cellview “stick” at their last value;
     * this is not normally a desired result, but may be
     * a needed intermediate state if say, the model for
     * the {@code GtkCellView} becomes temporarily empty.
     * @param path a {@code GtkTreePath} or {@code null} to unset.
     */
    public void setDisplayedRow(@Nullable org.gtk.gtk.TreePath path) {
        try {
            DowncallHandles.gtk_cell_view_set_displayed_row.invokeExact(
                    handle(),
                    (Addressable) (path == null ? MemoryAddress.NULL : path.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code cell_view} should draw all of its
     * cells in a sensitive state, this is used by {@code GtkComboBox} menus
     * to ensure that rows with insensitive cells that contain
     * children appear sensitive in the parent menu item.
     * @param drawSensitive whether to draw all cells in a sensitive state.
     */
    public void setDrawSensitive(boolean drawSensitive) {
        try {
            DowncallHandles.gtk_cell_view_set_draw_sensitive.invokeExact(
                    handle(),
                    drawSensitive ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code cell_view} should request space to fit the entire {@code GtkTreeModel}.
     * <p>
     * This is used by {@code GtkComboBox} to ensure that the cell view displayed on
     * the combo box’s button always gets enough space and does not resize
     * when selection changes.
     * @param fitModel whether {@code cell_view} should request space for the whole model.
     */
    public void setFitModel(boolean fitModel) {
        try {
            DowncallHandles.gtk_cell_view_set_fit_model.invokeExact(
                    handle(),
                    fitModel ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the model for {@code cell_view}.  If {@code cell_view} already has a model
     * set, it will remove it before setting the new model.  If {@code model} is
     * {@code null}, then it will unset the old model.
     * @param model a {@code GtkTreeModel}
     */
    public void setModel(@Nullable org.gtk.gtk.TreeModel model) {
        try {
            DowncallHandles.gtk_cell_view_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_view_new = Interop.downcallHandle(
            "gtk_cell_view_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_new_with_context = Interop.downcallHandle(
            "gtk_cell_view_new_with_context",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_new_with_markup = Interop.downcallHandle(
            "gtk_cell_view_new_with_markup",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_new_with_text = Interop.downcallHandle(
            "gtk_cell_view_new_with_text",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_new_with_texture = Interop.downcallHandle(
            "gtk_cell_view_new_with_texture",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_get_displayed_row = Interop.downcallHandle(
            "gtk_cell_view_get_displayed_row",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_get_draw_sensitive = Interop.downcallHandle(
            "gtk_cell_view_get_draw_sensitive",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_get_fit_model = Interop.downcallHandle(
            "gtk_cell_view_get_fit_model",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_get_model = Interop.downcallHandle(
            "gtk_cell_view_get_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_set_displayed_row = Interop.downcallHandle(
            "gtk_cell_view_set_displayed_row",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_set_draw_sensitive = Interop.downcallHandle(
            "gtk_cell_view_set_draw_sensitive",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_view_set_fit_model = Interop.downcallHandle(
            "gtk_cell_view_set_fit_model",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_view_set_model = Interop.downcallHandle(
            "gtk_cell_view_set_model",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
