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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CellRendererCombo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CellRendererCombo if its GType is a (or inherits from) "GtkCellRendererCombo".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CellRendererCombo} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCellRendererCombo", a ClassCastException will be thrown.
     */
    public static CellRendererCombo castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), CellRendererCombo.getType())) {
            return new CellRendererCombo(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCellRendererCombo");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_cell_renderer_combo_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Changed {
        void signalReceived(CellRendererCombo source, @NotNull java.lang.String pathString, @NotNull org.gtk.gtk.TreeIter newIter);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellRendererCombo.Callbacks.class, "signalCellRendererComboChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<CellRendererCombo.Changed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.CellRendererText.Build {
        
         /**
         * A {@link CellRendererCombo.Build} object constructs a {@link CellRendererCombo} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link CellRendererCombo} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CellRendererCombo} using {@link CellRendererCombo#castFrom}.
         * @return A new instance of {@code CellRendererCombo} with the properties 
         *         that were set in the Build object.
         */
        public CellRendererCombo construct() {
            return CellRendererCombo.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    CellRendererCombo.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * If {@code true}, the cell renderer will include an entry and allow to enter
         * values other than the ones in the popup list.
         * @param hasEntry The value for the {@code has-entry} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHasEntry(boolean hasEntry) {
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
        public Build setModel(org.gtk.gtk.TreeModel model) {
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
        public Build setTextColumn(int textColumn) {
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
    
    private static class Callbacks {
        
        public static void signalCellRendererComboChanged(MemoryAddress source, MemoryAddress pathString, MemoryAddress newIter, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (CellRendererCombo.Changed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new CellRendererCombo(source, Ownership.NONE), Interop.getStringFrom(pathString), new org.gtk.gtk.TreeIter(newIter, Ownership.NONE));
        }
    }
}
