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
 * 
 * <h1>CSS nodes</h1>
 * GtkCellView has a single CSS node with name cellview.
 */
public class CellView extends Widget implements Accessible, Buildable, CellLayout, ConstraintTarget, Orientable {

    public CellView(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CellView */
    public static CellView castFrom(org.gtk.gobject.Object gobject) {
        return new CellView(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_cell_view_new = Interop.downcallHandle(
        "gtk_cell_view_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_cell_view_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkCellView} widget.
     */
    public CellView() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_cell_view_new_with_context = Interop.downcallHandle(
        "gtk_cell_view_new_with_context",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithContext(@NotNull CellArea area, @NotNull CellAreaContext context) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_cell_view_new_with_context.invokeExact(area.handle(), context.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkCellView} widget with a specific {@code GtkCellArea}
     * to layout cells and a specific {@code GtkCellAreaContext}.
     * <p>
     * Specifying the same context for a handful of cells lets
     * the underlying area synchronize the geometry for those cells,
     * in this way alignments with cellviews for other rows are
     * possible.
     */
    public static CellView newWithContext(@NotNull CellArea area, @NotNull CellAreaContext context) {
        return new CellView(constructNewWithContext(area, context));
    }
    
    private static final MethodHandle gtk_cell_view_new_with_markup = Interop.downcallHandle(
        "gtk_cell_view_new_with_markup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithMarkup(@NotNull java.lang.String markup) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_cell_view_new_with_markup.invokeExact(Interop.allocateNativeString(markup)), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkCellView} widget, adds a {@code GtkCellRendererText}
     * to it, and makes it show {@code markup}. The text can be marked up with
     * the <a href="https://docs.gtk.org/Pango/pango_markup.html">Pango text markup language</a>.
     */
    public static CellView newWithMarkup(@NotNull java.lang.String markup) {
        return new CellView(constructNewWithMarkup(markup));
    }
    
    private static final MethodHandle gtk_cell_view_new_with_text = Interop.downcallHandle(
        "gtk_cell_view_new_with_text",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithText(@NotNull java.lang.String text) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_cell_view_new_with_text.invokeExact(Interop.allocateNativeString(text)), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkCellView} widget, adds a {@code GtkCellRendererText}
     * to it, and makes it show {@code text}.
     */
    public static CellView newWithText(@NotNull java.lang.String text) {
        return new CellView(constructNewWithText(text));
    }
    
    private static final MethodHandle gtk_cell_view_new_with_texture = Interop.downcallHandle(
        "gtk_cell_view_new_with_texture",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithTexture(@NotNull org.gtk.gdk.Texture texture) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_cell_view_new_with_texture.invokeExact(texture.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkCellView} widget, adds a {@code GtkCellRendererPixbuf}
     * to it, and makes it show {@code texture}.
     */
    public static CellView newWithTexture(@NotNull org.gtk.gdk.Texture texture) {
        return new CellView(constructNewWithTexture(texture));
    }
    
    private static final MethodHandle gtk_cell_view_get_displayed_row = Interop.downcallHandle(
        "gtk_cell_view_get_displayed_row",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a {@code GtkTreePath} referring to the currently
     * displayed row. If no row is currently displayed,
     * {@code null} is returned.
     */
    public @Nullable TreePath getDisplayedRow() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_cell_view_get_displayed_row.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TreePath(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_cell_view_get_draw_sensitive = Interop.downcallHandle(
        "gtk_cell_view_get_draw_sensitive",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code cell_view} is configured to draw all of its
     * cells in a sensitive state.
     */
    public boolean getDrawSensitive() {
        int RESULT;
        try {
            RESULT = (int) gtk_cell_view_get_draw_sensitive.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_cell_view_get_fit_model = Interop.downcallHandle(
        "gtk_cell_view_get_fit_model",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code cell_view} is configured to request space
     * to fit the entire {@code GtkTreeModel}.
     */
    public boolean getFitModel() {
        int RESULT;
        try {
            RESULT = (int) gtk_cell_view_get_fit_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_cell_view_get_model = Interop.downcallHandle(
        "gtk_cell_view_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the model for {@code cell_view}. If no model is used {@code null} is
     * returned.
     */
    public @Nullable TreeModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_cell_view_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TreeModel.TreeModelImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_cell_view_set_displayed_row = Interop.downcallHandle(
        "gtk_cell_view_set_displayed_row",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the row of the model that is currently displayed
     * by the {@code GtkCellView}. If the path is unset, then the
     * contents of the cellview “stick” at their last value;
     * this is not normally a desired result, but may be
     * a needed intermediate state if say, the model for
     * the {@code GtkCellView} becomes temporarily empty.
     */
    public @NotNull void setDisplayedRow(@Nullable TreePath path) {
        try {
            gtk_cell_view_set_displayed_row.invokeExact(handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_cell_view_set_draw_sensitive = Interop.downcallHandle(
        "gtk_cell_view_set_draw_sensitive",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code cell_view} should draw all of its
     * cells in a sensitive state, this is used by {@code GtkComboBox} menus
     * to ensure that rows with insensitive cells that contain
     * children appear sensitive in the parent menu item.
     */
    public @NotNull void setDrawSensitive(@NotNull boolean drawSensitive) {
        try {
            gtk_cell_view_set_draw_sensitive.invokeExact(handle(), drawSensitive ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_cell_view_set_fit_model = Interop.downcallHandle(
        "gtk_cell_view_set_fit_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code cell_view} should request space to fit the entire {@code GtkTreeModel}.
     * <p>
     * This is used by {@code GtkComboBox} to ensure that the cell view displayed on
     * the combo box’s button always gets enough space and does not resize
     * when selection changes.
     */
    public @NotNull void setFitModel(@NotNull boolean fitModel) {
        try {
            gtk_cell_view_set_fit_model.invokeExact(handle(), fitModel ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_cell_view_set_model = Interop.downcallHandle(
        "gtk_cell_view_set_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the model for {@code cell_view}.  If {@code cell_view} already has a model
     * set, it will remove it before setting the new model.  If {@code model} is
     * {@code null}, then it will unset the old model.
     */
    public @NotNull void setModel(@Nullable TreeModel model) {
        try {
            gtk_cell_view_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
