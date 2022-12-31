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
     * <p>
     * Because CellView is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CellView(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, CellView> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CellView(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
    
    private static MemoryAddress constructNewWithContext(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context) {
        MemoryAddress RESULT;
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
    public static CellView newWithContext(org.gtk.gtk.CellArea area, org.gtk.gtk.CellAreaContext context) {
        var RESULT = constructNewWithContext(area, context);
        return (org.gtk.gtk.CellView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.CellView.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewWithMarkup(java.lang.String markup) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_view_new_with_markup.invokeExact(
                    Marshal.stringToAddress.marshal(markup, null));
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
    public static CellView newWithMarkup(java.lang.String markup) {
        var RESULT = constructNewWithMarkup(markup);
        return (org.gtk.gtk.CellView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.CellView.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewWithText(java.lang.String text) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_view_new_with_text.invokeExact(
                    Marshal.stringToAddress.marshal(text, null));
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
    public static CellView newWithText(java.lang.String text) {
        var RESULT = constructNewWithText(text);
        return (org.gtk.gtk.CellView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.CellView.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewWithTexture(org.gtk.gdk.Texture texture) {
        MemoryAddress RESULT;
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
    public static CellView newWithTexture(org.gtk.gdk.Texture texture) {
        var RESULT = constructNewWithTexture(texture);
        return (org.gtk.gtk.CellView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.CellView.fromAddress).marshal(RESULT, Ownership.NONE);
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
        return org.gtk.gtk.TreePath.fromAddress.marshal(RESULT, Ownership.FULL);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return (org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.TreeModel.fromAddress).marshal(RESULT, Ownership.NONE);
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
                    Marshal.booleanToInteger.marshal(drawSensitive, null).intValue());
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
                    Marshal.booleanToInteger.marshal(fitModel, null).intValue());
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_cell_view_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link CellView.Builder} object constructs a {@link CellView} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CellView.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CellView} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CellView}.
         * @return A new instance of {@code CellView} with the properties 
         *         that were set in the Builder object.
         */
        public CellView build() {
            return (CellView) org.gtk.gobject.GObject.newWithProperties(
                CellView.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The {@code GtkCellArea} rendering cells
         * <p>
         * If no area is specified when creating the cell view with gtk_cell_view_new_with_context()
         * a horizontally oriented {@code GtkCellArea}Box will be used.
         * <p>
         * since 3.0
         * @param cellArea The value for the {@code cell-area} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCellArea(org.gtk.gtk.CellArea cellArea) {
            names.add("cell-area");
            values.add(org.gtk.gobject.Value.create(cellArea));
            return this;
        }
        
        /**
         * The {@code GtkCellAreaContext} used to compute the geometry of the cell view.
         * <p>
         * A group of cell views can be assigned the same context in order to
         * ensure the sizes and cell alignments match across all the views with
         * the same context.
         * <p>
         * {@code GtkComboBox} menus uses this to assign the same context to all cell views
         * in the menu items for a single menu (each submenu creates its own
         * context since the size of each submenu does not depend on parent
         * or sibling menus).
         * <p>
         * since 3.0
         * @param cellAreaContext The value for the {@code cell-area-context} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCellAreaContext(org.gtk.gtk.CellAreaContext cellAreaContext) {
            names.add("cell-area-context");
            values.add(org.gtk.gobject.Value.create(cellAreaContext));
            return this;
        }
        
        /**
         * Whether all cells should be draw as sensitive for this view regardless
         * of the actual cell properties (used to make menus with submenus appear
         * sensitive when the items in submenus might be insensitive).
         * <p>
         * since 3.0
         * @param drawSensitive The value for the {@code draw-sensitive} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDrawSensitive(boolean drawSensitive) {
            names.add("draw-sensitive");
            values.add(org.gtk.gobject.Value.create(drawSensitive));
            return this;
        }
        
        /**
         * Whether the view should request enough space to always fit
         * the size of every row in the model (used by the combo box to
         * ensure the combo box size doesn't change when different items
         * are selected).
         * <p>
         * since 3.0
         * @param fitModel The value for the {@code fit-model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFitModel(boolean fitModel) {
            names.add("fit-model");
            values.add(org.gtk.gobject.Value.create(fitModel));
            return this;
        }
        
        /**
         * The model for cell view
         * <p>
         * since 2.10
         * @param model The value for the {@code model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModel(org.gtk.gtk.TreeModel model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_view_new = Interop.downcallHandle(
            "gtk_cell_view_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_new_with_context = Interop.downcallHandle(
            "gtk_cell_view_new_with_context",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_new_with_markup = Interop.downcallHandle(
            "gtk_cell_view_new_with_markup",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_new_with_text = Interop.downcallHandle(
            "gtk_cell_view_new_with_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_new_with_texture = Interop.downcallHandle(
            "gtk_cell_view_new_with_texture",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_get_displayed_row = Interop.downcallHandle(
            "gtk_cell_view_get_displayed_row",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_get_draw_sensitive = Interop.downcallHandle(
            "gtk_cell_view_get_draw_sensitive",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_get_fit_model = Interop.downcallHandle(
            "gtk_cell_view_get_fit_model",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_get_model = Interop.downcallHandle(
            "gtk_cell_view_get_model",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_set_displayed_row = Interop.downcallHandle(
            "gtk_cell_view_set_displayed_row",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_set_draw_sensitive = Interop.downcallHandle(
            "gtk_cell_view_set_draw_sensitive",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_view_set_fit_model = Interop.downcallHandle(
            "gtk_cell_view_set_fit_model",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_view_set_model = Interop.downcallHandle(
            "gtk_cell_view_set_model",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_view_get_type = Interop.downcallHandle(
            "gtk_cell_view_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
