package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Renders a combobox in a cell
 * <p>
 * {@code GtkCellRendererCombo} renders text in a cell like {@code GtkCellRendererText} from
 * which it is derived. But while {@code GtkCellRendererText} offers a simple entry to
 * edit the text, {@code GtkCellRendererCombo} offers a {@code GtkComboBox}
 * widget to edit the text. The values to display in the combo box are taken from
 * the tree model specified in the {@code GtkCellRendererCombo}:model property.
 * <p>
 * The combo cell renderer takes care of adding a text cell renderer to the combo
 * box and sets it to display the column specified by its
 * {@code GtkCellRendererCombo}:text-column property. Further properties of the combo box
 * can be set in a handler for the {@code GtkCellRenderer::editing-started} signal.
 */
public class CellRendererCombo extends org.gtk.gtk.CellRendererText {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRendererCombo";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CellRendererCombo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CellRendererCombo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellRendererCombo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CellRendererCombo(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_renderer_combo_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellRendererCombo}.
     * Adjust how text is drawn using object properties.
     * Object properties can be set globally (with g_object_set()).
     * Also, with {@code GtkTreeViewColumn}, you can bind a property to a value
     * in a {@code GtkTreeModel}. For example, you can bind the “text” property
     * on the cell renderer to a string value in the model, thus rendering
     * a different string in each row of the {@code GtkTreeView}.
     */
    public CellRendererCombo() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_cell_renderer_combo_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Changed} callback.
     */
    @FunctionalInterface
    public interface Changed {
    
        /**
         * This signal is emitted each time after the user selected an item in
         * the combo box, either by using the mouse or the arrow keys.  Contrary
         * to GtkComboBox, GtkCellRendererCombo::changed is not emitted for
         * changes made to a selected item in the entry.  The argument {@code new_iter}
         * corresponds to the newly selected item in the combo box and it is relative
         * to the GtkTreeModel set via the model property on GtkCellRendererCombo.
         * <p>
         * Note that as soon as you change the model displayed in the tree view,
         * the tree view will immediately cease the editing operating.  This
         * means that you most probably want to refrain from changing the model
         * until the combo cell renderer emits the edited or editing_canceled signal.
         */
        void run(java.lang.String pathString, org.gtk.gtk.TreeIter newIter);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceCellRendererCombo, MemoryAddress pathString, MemoryAddress newIter) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(pathString, null), org.gtk.gtk.TreeIter.fromAddress.marshal(newIter, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Changed.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * This signal is emitted each time after the user selected an item in
     * the combo box, either by using the mouse or the arrow keys.  Contrary
     * to GtkComboBox, GtkCellRendererCombo::changed is not emitted for
     * changes made to a selected item in the entry.  The argument {@code new_iter}
     * corresponds to the newly selected item in the combo box and it is relative
     * to the GtkTreeModel set via the model property on GtkCellRendererCombo.
     * <p>
     * Note that as soon as you change the model displayed in the tree view,
     * the tree view will immediately cease the editing operating.  This
     * means that you most probably want to refrain from changing the model
     * until the combo cell renderer emits the edited or editing_canceled signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<CellRendererCombo.Changed> onChanged(CellRendererCombo.Changed handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link CellRendererCombo.Builder} object constructs a {@link CellRendererCombo} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CellRendererCombo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.CellRendererText.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CellRendererCombo} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CellRendererCombo}.
         * @return A new instance of {@code CellRendererCombo} with the properties 
         *         that were set in the Builder object.
         */
        public CellRendererCombo build() {
            return (CellRendererCombo) org.gtk.gobject.GObject.newWithProperties(
                CellRendererCombo.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * If {@code true}, the cell renderer will include an entry and allow to enter
         * values other than the ones in the popup list.
         * @param hasEntry The value for the {@code has-entry} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHasEntry(boolean hasEntry) {
            names.add("has-entry");
            values.add(org.gtk.gobject.Value.create(hasEntry));
            return this;
        }
        
        /**
         * Holds a tree model containing the possible values for the combo box.
         * Use the text_column property to specify the column holding the values.
         * @param model The value for the {@code model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModel(org.gtk.gtk.TreeModel model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
        
        /**
         * Specifies the model column which holds the possible values for the
         * combo box.
         * <p>
         * Note that this refers to the model specified in the model property,
         * not the model backing the tree view to which
         * this cell renderer is attached.
         * <p>
         * {@code GtkCellRendererCombo} automatically adds a text cell renderer for
         * this column to its combo box.
         * @param textColumn The value for the {@code text-column} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTextColumn(int textColumn) {
            names.add("text-column");
            values.add(org.gtk.gobject.Value.create(textColumn));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_renderer_combo_new = Interop.downcallHandle(
                "gtk_cell_renderer_combo_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_cell_renderer_combo_get_type = Interop.downcallHandle(
                "gtk_cell_renderer_combo_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_cell_renderer_combo_get_type != null;
    }
}
