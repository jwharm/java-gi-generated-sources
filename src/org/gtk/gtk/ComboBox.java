package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkComboBox` is a widget that allows the user to choose from a list of
 * valid choices.
 * 
 * ![An example GtkComboBox](combo-box.png)
 * 
 * The `GtkComboBox` displays the selected choice; when activated, the
 * `GtkComboBox` displays a popup which allows the user to make a new choice.
 * 
 * The `GtkComboBox` uses the model-view pattern; the list of valid choices
 * is specified in the form of a tree model, and the display of the choices
 * can be adapted to the data in the model by using cell renderers, as you
 * would in a tree view. This is possible since `GtkComboBox` implements the
 * [iface@Gtk.CellLayout] interface. The tree model holding the valid
 * choices is not restricted to a flat list, it can be a real tree, and the
 * popup will reflect the tree structure.
 * 
 * To allow the user to enter values not in the model, the
 * [property@Gtk.ComboBox:has-entry] property allows the `GtkComboBox` to
 * contain a [class@Gtk.Entry]. This entry can be accessed by calling
 * [method@Gtk.ComboBox.get_child] on the combo box.
 * 
 * For a simple list of textual choices, the model-view API of `GtkComboBox`
 * can be a bit overwhelming. In this case, [class@Gtk.ComboBoxText] offers
 * a simple alternative. Both `GtkComboBox` and `GtkComboBoxText` can contain
 * an entry.
 * 
 * ## CSS nodes
 * 
 * ```
 * combobox
 * ├── box.linked
 * │   ╰── button.combo
 * │       ╰── box
 * │           ├── cellview
 * │           ╰── arrow
 * ╰── window.popup
 * ```
 * 
 * A normal combobox contains a box with the .linked class, a button
 * with the .combo class and inside those buttons, there are a cellview and
 * an arrow.
 * 
 * ```
 * combobox
 * ├── box.linked
 * │   ├── entry.combo
 * │   ╰── button.combo
 * │       ╰── box
 * │           ╰── arrow
 * ╰── window.popup
 * ```
 * 
 * A `GtkComboBox` with an entry has a single CSS node with name combobox.
 * It contains a box with the .linked class. That box contains an entry and
 * a button, both with the .combo class added. The button also contains another
 * node with name arrow.
 * 
 * # Accessibility
 * 
 * `GtkComboBox` uses the %GTK_ACCESSIBLE_ROLE_COMBO_BOX role.
 */
public class ComboBox extends Widget implements Accessible, Buildable, CellEditable, CellLayout, ConstraintTarget {

    public ComboBox(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ComboBox */
    public static ComboBox castFrom(org.gtk.gobject.Object gobject) {
        return new ComboBox(gobject.getReference());
    }
    
    /**
     * Creates a new empty `GtkComboBox`.
     */
    public ComboBox() {
        super(References.get(gtk_h.gtk_combo_box_new(), false));
    }
    
    /**
     * Creates a new empty `GtkComboBox` with an entry.
     * 
     * In order to use a combo box with entry, you need to tell it
     * which column of the model contains the text for the entry
     * by calling [method@Gtk.ComboBox.set_entry_text_column].
     */
    public static ComboBox newWithEntry() {
        return new ComboBox(References.get(gtk_h.gtk_combo_box_new_with_entry(), false));
    }
    
    /**
     * Creates a new `GtkComboBox` with a model.
     */
    public static ComboBox newWithModel(TreeModel model) {
        return new ComboBox(References.get(gtk_h.gtk_combo_box_new_with_model(model.handle()), false));
    }
    
    /**
     * Creates a new empty `GtkComboBox` with an entry and a model.
     * 
     * See also [ctor@Gtk.ComboBox.new_with_entry].
     */
    public static ComboBox newWithModelAndEntry(TreeModel model) {
        return new ComboBox(References.get(gtk_h.gtk_combo_box_new_with_model_and_entry(model.handle()), false));
    }
    
    /**
     * Returns the index of the currently active item.
     * 
     * If the model is a non-flat treemodel, and the active item is not
     * an immediate child of the root of the tree, this function returns
     * `gtk_tree_path_get_indices (path)[0]`, where `path` is the
     * [struct@Gtk.TreePath] of the active item.
     */
    public int getActive() {
        var RESULT = gtk_h.gtk_combo_box_get_active(handle());
        return RESULT;
    }
    
    /**
     * Returns the ID of the active row of @combo_box.
     * 
     * This value is taken from the active row and the column specified
     * by the [property@Gtk.ComboBox:id-column] property of @combo_box
     * (see [method@Gtk.ComboBox.set_id_column]).
     * 
     * The returned value is an interned string which means that you can
     * compare the pointer by value to other interned strings and that you
     * must not free it.
     * 
     * If the [property@Gtk.ComboBox:id-column] property of @combo_box is
     * not set, or if no row is active, or if the active row has a %NULL
     * ID value, then %NULL is returned.
     */
    public java.lang.String getActiveId() {
        var RESULT = gtk_h.gtk_combo_box_get_active_id(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets @iter to point to the currently active item.
     * 
     * If no item is active, @iter is left unchanged.
     */
    public boolean getActiveIter(TreeIter iter) {
        var RESULT = gtk_h.gtk_combo_box_get_active_iter(handle(), iter.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the combo box sets the dropdown button
     * sensitive or not when there are no items in the model.
     */
    public SensitivityType getButtonSensitivity() {
        var RESULT = gtk_h.gtk_combo_box_get_button_sensitivity(handle());
        return SensitivityType.fromValue(RESULT);
    }
    
    /**
     * Gets the child widget of @combo_box.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_combo_box_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the column which @combo_box is using to get the strings
     * from to display in the internal entry.
     */
    public int getEntryTextColumn() {
        var RESULT = gtk_h.gtk_combo_box_get_entry_text_column(handle());
        return RESULT;
    }
    
    /**
     * Returns whether the combo box has an entry.
     */
    public boolean getHasEntry() {
        var RESULT = gtk_h.gtk_combo_box_get_has_entry(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the column which @combo_box is using to get string IDs
     * for values from.
     */
    public int getIdColumn() {
        var RESULT = gtk_h.gtk_combo_box_get_id_column(handle());
        return RESULT;
    }
    
    /**
     * Returns the `GtkTreeModel` of @combo_box.
     */
    public TreeModel getModel() {
        var RESULT = gtk_h.gtk_combo_box_get_model(handle());
        return new TreeModel.TreeModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets whether the popup uses a fixed width.
     */
    public boolean getPopupFixedWidth() {
        var RESULT = gtk_h.gtk_combo_box_get_popup_fixed_width(handle());
        return (RESULT != 0);
    }
    
    /**
     * Hides the menu or dropdown list of @combo_box.
     * 
     * This function is mostly intended for use by accessibility technologies;
     * applications should have little use for it.
     */
    public void popdown() {
        gtk_h.gtk_combo_box_popdown(handle());
    }
    
    /**
     * Pops up the menu or dropdown list of @combo_box.
     * 
     * This function is mostly intended for use by accessibility technologies;
     * applications should have little use for it.
     * 
     * Before calling this, @combo_box must be mapped, or nothing will happen.
     */
    public void popup() {
        gtk_h.gtk_combo_box_popup(handle());
    }
    
    /**
     * Pops up the menu of @combo_box.
     * 
     * Note that currently this does not do anything with the device, as it was
     * previously only used for list-mode combo boxes, and those were removed
     * in GTK 4. However, it is retained in case similar functionality is added
     * back later.
     */
    public void popupForDevice(org.gtk.gdk.Device device) {
        gtk_h.gtk_combo_box_popup_for_device(handle(), device.handle());
    }
    
    /**
     * Sets the active item of @combo_box to be the item at @index.
     */
    public void setActive(int index) {
        gtk_h.gtk_combo_box_set_active(handle(), index);
    }
    
    /**
     * Changes the active row of @combo_box to the one that has an ID equal to
     * @active_id.
     * 
     * If @active_id is %NULL, the active row is unset. Rows having
     * a %NULL ID string cannot be made active by this function.
     * 
     * If the [property@Gtk.ComboBox:id-column] property of @combo_box is
     * unset or if no row has the given ID then the function does nothing
     * and returns %FALSE.
     */
    public boolean setActiveId(java.lang.String activeId) {
        var RESULT = gtk_h.gtk_combo_box_set_active_id(handle(), Interop.allocateNativeString(activeId).handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the current active item to be the one referenced by @iter.
     * 
     * If @iter is %NULL, the active item is unset.
     */
    public void setActiveIter(TreeIter iter) {
        gtk_h.gtk_combo_box_set_active_iter(handle(), iter.handle());
    }
    
    /**
     * Sets whether the dropdown button of the combo box should update
     * its sensitivity depending on the model contents.
     */
    public void setButtonSensitivity(SensitivityType sensitivity) {
        gtk_h.gtk_combo_box_set_button_sensitivity(handle(), sensitivity.getValue());
    }
    
    /**
     * Sets the child widget of @combo_box.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_combo_box_set_child(handle(), child.handle());
    }
    
    /**
     * Sets the model column which @combo_box should use to get strings
     * from to be @text_column.
     * 
     * For this column no separate
     * [class@Gtk.CellRenderer] is needed.
     * 
     * The column @text_column in the model of @combo_box must be of
     * type %G_TYPE_STRING.
     * 
     * This is only relevant if @combo_box has been created with
     * [property@Gtk.ComboBox:has-entry] as %TRUE.
     */
    public void setEntryTextColumn(int textColumn) {
        gtk_h.gtk_combo_box_set_entry_text_column(handle(), textColumn);
    }
    
    /**
     * Sets the model column which @combo_box should use to get string IDs
     * for values from.
     * 
     * The column @id_column in the model of @combo_box must be of type
     * %G_TYPE_STRING.
     */
    public void setIdColumn(int idColumn) {
        gtk_h.gtk_combo_box_set_id_column(handle(), idColumn);
    }
    
    /**
     * Sets the model used by @combo_box to be @model.
     * 
     * Will unset a previously set model (if applicable). If model is %NULL,
     * then it will unset the model.
     * 
     * Note that this function does not clear the cell renderers, you have to
     * call [method@Gtk.CellLayout.clear] yourself if you need to set up different
     * cell renderers for the new model.
     */
    public void setModel(TreeModel model) {
        gtk_h.gtk_combo_box_set_model(handle(), model.handle());
    }
    
    /**
     * Specifies whether the popup’s width should be a fixed width.
     * 
     * If @fixed is %TRUE, the popup's width is set to match the
     * allocated width of the combo box.
     */
    public void setPopupFixedWidth(boolean fixed) {
        gtk_h.gtk_combo_box_set_popup_fixed_width(handle(), fixed ? 1 : 0);
    }
    
    /**
     * Sets the row separator function, which is used to determine
     * whether a row should be drawn as a separator.
     * 
     * If the row separator function is %NULL, no separators are drawn.
     * This is the default value.
     */
    public void setRowSeparatorFunc(ComboBox comboBox, TreeViewRowSeparatorFunc func) {
        try {
            int hash = func.hashCode();
            Interop.signalRegistry.put(hash, func);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTreeViewRowSeparatorFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.gtk_combo_box_set_row_separator_func(handle(), nativeSymbol, intSegment, Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(ComboBox source);
    }
    
    /**
     * Emitted to when the combo box is activated.
     * 
     * The `::activate` signal on `GtkComboBox` is an action signal and
     * emitting it causes the combo box to pop up its dropdown.
     */
    public void onActivate(ActivateHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalComboBoxActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(ComboBox source);
    }
    
    /**
     * Emitted when the active item is changed.
     * 
     * The can be due to the user selecting a different item from the list,
     * or due to a call to [method@Gtk.ComboBox.set_active_iter]. It will
     * also be emitted while typing into the entry of a combo box with an entry.
     */
    public void onChanged(ChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalComboBoxChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface FormatEntryTextHandler {
        void signalReceived(ComboBox source, java.lang.String path);
    }
    
    /**
     * Emitted to allow changing how the text in a combo box's entry is displayed.
     * 
     * See [property@Gtk.ComboBox:has-entry].
     * 
     * Connect a signal handler which returns an allocated string representing
     * @path. That string will then be used to set the text in the combo box's
     * entry. The default signal handler uses the text from the
     * [property@Gtk.ComboBox:entry-text-column] model column.
     * 
     * Here's an example signal handler which fetches data from the model and
     * displays it in the entry.
     * ```c
     * static char *
     * format_entry_text_callback (GtkComboBox *combo,
     *                             const char *path,
     *                             gpointer     user_data)
     * {
     *   GtkTreeIter iter;
     *   GtkTreeModel model;
     *   double       value;
     * 
     *   model = gtk_combo_box_get_model (combo);
     * 
     *   gtk_tree_model_get_iter_from_string (model, &iter, path);
     *   gtk_tree_model_get (model, &iter,
     *                       THE_DOUBLE_VALUE_COLUMN, &value,
     *                       -1);
     * 
     *   return g_strdup_printf ("%g", value);
     * }
     * ```
     */
    public void onFormatEntryText(FormatEntryTextHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalComboBoxFormatEntryText", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("format-entry-text").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MoveActiveHandler {
        void signalReceived(ComboBox source, ScrollType scrollType);
    }
    
    /**
     * Emitted to move the active selection.
     * 
     * This is an [keybinding signal](class.SignalAction.html).
     */
    public void onMoveActive(MoveActiveHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalComboBoxMoveActive", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("move-active").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PopdownHandler {
        boolean signalReceived(ComboBox source);
    }
    
    /**
     * Emitted to popdown the combo box list.
     * 
     * This is an [keybinding signal](class.SignalAction.html).
     * 
     * The default bindings for this signal are Alt+Up and Escape.
     */
    public void onPopdown(PopdownHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalComboBoxPopdown", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("popdown").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PopupHandler {
        void signalReceived(ComboBox source);
    }
    
    /**
     * Emitted to popup the combo box list.
     * 
     * This is an [keybinding signal](class.SignalAction.html).
     * 
     * The default binding for this signal is Alt+Down.
     */
    public void onPopup(PopupHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalComboBoxPopup", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("popup").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
