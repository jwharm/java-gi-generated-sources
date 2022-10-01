package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkComboBox} is a widget that allows the user to choose from a list of
 * valid choices.
 * <p>
 * <img src="./doc-files/combo-box.png" alt="An example GtkComboBox">
 * <p>
 * The {@code GtkComboBox} displays the selected choice; when activated, the
 * {@code GtkComboBox} displays a popup which allows the user to make a new choice.
 * <p>
 * The {@code GtkComboBox} uses the model-view pattern; the list of valid choices
 * is specified in the form of a tree model, and the display of the choices
 * can be adapted to the data in the model by using cell renderers, as you
 * would in a tree view. This is possible since {@code GtkComboBox} implements the
 * {@code Gtk.CellLayout} interface. The tree model holding the valid
 * choices is not restricted to a flat list, it can be a real tree, and the
 * popup will reflect the tree structure.
 * <p>
 * To allow the user to enter values not in the model, the
 * {@code Gtk.ComboBox:has-entry} property allows the {@code GtkComboBox} to
 * contain a {@link Entry}. This entry can be accessed by calling
 * {@link ComboBox#getChild} on the combo box.
 * <p>
 * For a simple list of textual choices, the model-view API of {@code GtkComboBox}
 * can be a bit overwhelming. In this case, {@link ComboBoxText} offers
 * a simple alternative. Both {@code GtkComboBox} and {@code GtkComboBoxText} can contain
 * an entry.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * <pre>{@code 
 * combobox
 * ├── box.linked
 * │   ╰── button.combo
 * │       ╰── box
 * │           ├── cellview
 * │           ╰── arrow
 * ╰── window.popup
 * }</pre>
 * <p>
 * A normal combobox contains a box with the .linked class, a button
 * with the .combo class and inside those buttons, there are a cellview and
 * an arrow.
 * <p>
 * <pre>{@code 
 * combobox
 * ├── box.linked
 * │   ├── entry.combo
 * │   ╰── button.combo
 * │       ╰── box
 * │           ╰── arrow
 * ╰── window.popup
 * }</pre>
 * <p>
 * A {@code GtkComboBox} with an entry has a single CSS node with name combobox.
 * It contains a box with the .linked class. That box contains an entry and
 * a button, both with the .combo class added. The button also contains another
 * node with name arrow.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkComboBox} uses the {@link AccessibleRole#COMBO_BOX} role.
 */
public class ComboBox extends Widget implements Accessible, Buildable, CellEditable, CellLayout, ConstraintTarget {

    public ComboBox(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ComboBox */
    public static ComboBox castFrom(org.gtk.gobject.Object gobject) {
        return new ComboBox(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_combo_box_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new empty {@code GtkComboBox}.
     */
    public ComboBox() {
        super(constructNew());
    }
    
    private static Refcounted constructNewWithEntry() {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_combo_box_new_with_entry(), false);
        return RESULT;
    }
    
    /**
     * Creates a new empty {@code GtkComboBox} with an entry.
     * <p>
     * In order to use a combo box with entry, you need to tell it
     * which column of the model contains the text for the entry
     * by calling {@link ComboBox#setEntryTextColumn}.
     */
    public static ComboBox newWithEntry() {
        return new ComboBox(constructNewWithEntry());
    }
    
    private static Refcounted constructNewWithModel(TreeModel model) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_combo_box_new_with_model(model.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkComboBox} with a model.
     */
    public static ComboBox newWithModel(TreeModel model) {
        return new ComboBox(constructNewWithModel(model));
    }
    
    private static Refcounted constructNewWithModelAndEntry(TreeModel model) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_combo_box_new_with_model_and_entry(model.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new empty {@code GtkComboBox} with an entry and a model.
     * <p>
     * See also {@link ComboBox#newWithEntry}.
     */
    public static ComboBox newWithModelAndEntry(TreeModel model) {
        return new ComboBox(constructNewWithModelAndEntry(model));
    }
    
    /**
     * Returns the index of the currently active item.
     * <p>
     * If the model is a non-flat treemodel, and the active item is not
     * an immediate child of the root of the tree, this function returns
     * {@code gtk_tree_path_get_indices (path)[0]}, where {@code path} is the
     * {@code Gtk.TreePath} of the active item.
     */
    public int getActive() {
        var RESULT = gtk_h.gtk_combo_box_get_active(handle());
        return RESULT;
    }
    
    /**
     * Returns the ID of the active row of {@code combo_box}.
     * <p>
     * This value is taken from the active row and the column specified
     * by the {@code combo_box
     * (see [method@Gtk.ComboBox.set_id_column}).
     * <p>
     * The returned value is an interned string which means that you can
     * compare the pointer by value to other interned strings and that you
     * must not free it.
     * <p>
     * If the {@code Gtk.ComboBox:id-column} property of {@code combo_box} is
     * not set, or if no row is active, or if the active row has a {@code null}
     * ID value, then {@code null} is returned.
     */
    public java.lang.String getActiveId() {
        var RESULT = gtk_h.gtk_combo_box_get_active_id(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets {@code iter} to point to the currently active item.
     * <p>
     * If no item is active, {@code iter} is left unchanged.
     */
    public boolean getActiveIter(TreeIter iter) {
        var RESULT = gtk_h.gtk_combo_box_get_active_iter(handle(), iter.handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether the combo box sets the dropdown button
     * sensitive or not when there are no items in the model.
     */
    public SensitivityType getButtonSensitivity() {
        var RESULT = gtk_h.gtk_combo_box_get_button_sensitivity(handle());
        return new SensitivityType(RESULT);
    }
    
    /**
     * Gets the child widget of {@code combo_box}.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_combo_box_get_child(handle());
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the column which {@code combo_box} is using to get the strings
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
        return RESULT != 0;
    }
    
    /**
     * Returns the column which {@code combo_box} is using to get string IDs
     * for values from.
     */
    public int getIdColumn() {
        var RESULT = gtk_h.gtk_combo_box_get_id_column(handle());
        return RESULT;
    }
    
    /**
     * Returns the {@code GtkTreeModel} of {@code combo_box}.
     */
    public TreeModel getModel() {
        var RESULT = gtk_h.gtk_combo_box_get_model(handle());
        return new TreeModel.TreeModelImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether the popup uses a fixed width.
     */
    public boolean getPopupFixedWidth() {
        var RESULT = gtk_h.gtk_combo_box_get_popup_fixed_width(handle());
        return RESULT != 0;
    }
    
    /**
     * Hides the menu or dropdown list of {@code combo_box}.
     * <p>
     * This function is mostly intended for use by accessibility technologies;
     * applications should have little use for it.
     */
    public void popdown() {
        gtk_h.gtk_combo_box_popdown(handle());
    }
    
    /**
     * Pops up the menu or dropdown list of {@code combo_box}.
     * <p>
     * This function is mostly intended for use by accessibility technologies;
     * applications should have little use for it.
     * <p>
     * Before calling this, {@code combo_box} must be mapped, or nothing will happen.
     */
    public void popup() {
        gtk_h.gtk_combo_box_popup(handle());
    }
    
    /**
     * Pops up the menu of {@code combo_box}.
     * <p>
     * Note that currently this does not do anything with the device, as it was
     * previously only used for list-mode combo boxes, and those were removed
     * in GTK 4. However, it is retained in case similar functionality is added
     * back later.
     */
    public void popupForDevice(org.gtk.gdk.Device device) {
        gtk_h.gtk_combo_box_popup_for_device(handle(), device.handle());
    }
    
    /**
     * Sets the active item of {@code combo_box} to be the item at {@code index}.
     */
    public void setActive(int index) {
        gtk_h.gtk_combo_box_set_active(handle(), index);
    }
    
    /**
     * Changes the active row of {@code combo_box} to the one that has an ID equal to
     * {@code active_id}.
     * <p>
     * If {@code active_id} is {@code null}, the active row is unset. Rows having
     * a {@code null} ID string cannot be made active by this function.
     * <p>
     * If the {@code Gtk.ComboBox:id-column} property of {@code combo_box} is
     * unset or if no row has the given ID then the function does nothing
     * and returns {@code false}.
     */
    public boolean setActiveId(java.lang.String activeId) {
        var RESULT = gtk_h.gtk_combo_box_set_active_id(handle(), Interop.allocateNativeString(activeId).handle());
        return RESULT != 0;
    }
    
    /**
     * Sets the current active item to be the one referenced by {@code iter}.
     * <p>
     * If {@code iter} is {@code null}, the active item is unset.
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
     * Sets the child widget of {@code combo_box}.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_combo_box_set_child(handle(), child.handle());
    }
    
    /**
     * Sets the model column which {@code combo_box} should use to get strings
     * from to be {@code text_column}.
     * <p>
     * For this column no separate
     * {@link CellRenderer} is needed.
     * <p>
     * The column {@code text_column} in the model of {@code combo_box} must be of
     * type {@code G_TYPE_STRING}.
     * <p>
     * This is only relevant if {@code combo_box} has been created with
     * {@code Gtk.ComboBox:has-entry} as {@code true}.
     */
    public void setEntryTextColumn(int textColumn) {
        gtk_h.gtk_combo_box_set_entry_text_column(handle(), textColumn);
    }
    
    /**
     * Sets the model column which {@code combo_box} should use to get string IDs
     * for values from.
     * <p>
     * The column {@code id_column} in the model of {@code combo_box} must be of type
     * {@code G_TYPE_STRING}.
     */
    public void setIdColumn(int idColumn) {
        gtk_h.gtk_combo_box_set_id_column(handle(), idColumn);
    }
    
    /**
     * Sets the model used by {@code combo_box} to be {@code model}.
     * <p>
     * Will unset a previously set model (if applicable). If model is {@code null},
     * then it will unset the model.
     * <p>
     * Note that this function does not clear the cell renderers, you have to
     * call {@link CellLayout#clear} yourself if you need to set up different
     * cell renderers for the new model.
     */
    public void setModel(TreeModel model) {
        gtk_h.gtk_combo_box_set_model(handle(), model.handle());
    }
    
    /**
     * Specifies whether the popup’s width should be a fixed width.
     * <p>
     * If {@code fixed} is {@code true}, the popup's width is set to match the
     * allocated width of the combo box.
     */
    public void setPopupFixedWidth(boolean fixed) {
        gtk_h.gtk_combo_box_set_popup_fixed_width(handle(), fixed ? 1 : 0);
    }
    
    /**
     * Sets the row separator function, which is used to determine
     * whether a row should be drawn as a separator.
     * <p>
     * If the row separator function is {@code null}, no separators are drawn.
     * This is the default value.
     */
    public void setRowSeparatorFunc(TreeViewRowSeparatorFunc func) {
        try {
            gtk_h.gtk_combo_box_set_row_separator_func(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeViewRowSeparatorFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(ComboBox source);
    }
    
    /**
     * Emitted to when the combo box is activated.
     * <p>
     * The {@code ::activate} signal on {@code GtkComboBox} is an action signal and
     * emitting it causes the combo box to pop up its dropdown.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ComboBox.Callbacks.class, "signalComboBoxActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(ComboBox source);
    }
    
    /**
     * Emitted when the active item is changed.
     * <p>
     * The can be due to the user selecting a different item from the list,
     * or due to a call to {@link ComboBox#setActiveIter}. It will
     * also be emitted while typing into the entry of a combo box with an entry.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ComboBox.Callbacks.class, "signalComboBoxChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface FormatEntryTextHandler {
        void signalReceived(ComboBox source, java.lang.String path);
    }
    
    /**
     * Emitted to allow changing how the text in a combo box's entry is displayed.
     * <p>
     * See {@code Gtk.ComboBox:has-entry}.
     * <p>
     * Connect a signal handler which returns an allocated string representing
     * {@code path}. That string will then be used to set the text in the combo box's
     * entry. The default signal handler uses the text from the
     * {@code Gtk.ComboBox:entry-text-column} model column.
     * <p>
     * Here's an example signal handler which fetches data from the model and
     * displays it in the entry.
     * <pre>{@code c
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
     * }</pre>
     */
    public SignalHandle onFormatEntryText(FormatEntryTextHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("format-entry-text").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ComboBox.Callbacks.class, "signalComboBoxFormatEntryText",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MoveActiveHandler {
        void signalReceived(ComboBox source, ScrollType scrollType);
    }
    
    /**
     * Emitted to move the active selection.
     * <p>
     * This is an <a href="class.SignalAction.html">keybinding signal</a>.
     */
    public SignalHandle onMoveActive(MoveActiveHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("move-active").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ComboBox.Callbacks.class, "signalComboBoxMoveActive",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PopdownHandler {
        boolean signalReceived(ComboBox source);
    }
    
    /**
     * Emitted to popdown the combo box list.
     * <p>
     * This is an <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are Alt+Up and Escape.
     */
    public SignalHandle onPopdown(PopdownHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("popdown").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ComboBox.Callbacks.class, "signalComboBoxPopdown",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PopupHandler {
        void signalReceived(ComboBox source);
    }
    
    /**
     * Emitted to popup the combo box list.
     * <p>
     * This is an <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is Alt+Down.
     */
    public SignalHandle onPopup(PopupHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("popup").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ComboBox.Callbacks.class, "signalComboBoxPopup",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalComboBoxActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ComboBox.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ComboBox(Refcounted.get(source)));
        }
        
        public static void signalComboBoxChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ComboBox.ChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ComboBox(Refcounted.get(source)));
        }
        
        public static void signalComboBoxFormatEntryText(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ComboBox.FormatEntryTextHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ComboBox(Refcounted.get(source)), path.getUtf8String(0));
        }
        
        public static void signalComboBoxMoveActive(MemoryAddress source, int scrollType, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ComboBox.MoveActiveHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ComboBox(Refcounted.get(source)), new ScrollType(scrollType));
        }
        
        public static boolean signalComboBoxPopdown(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ComboBox.PopdownHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new ComboBox(Refcounted.get(source)));
        }
        
        public static void signalComboBoxPopup(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ComboBox.PopupHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ComboBox(Refcounted.get(source)));
        }
        
    }
}
