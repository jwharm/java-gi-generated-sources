package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * 
 * <h2>CSS nodes</h2>
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
 * 
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
 * 
 * <h1>Accessibility</h1>
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
    
    private static final MethodHandle gtk_combo_box_new = Interop.downcallHandle(
        "gtk_combo_box_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_combo_box_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new empty {@code GtkComboBox}.
     */
    public ComboBox() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_combo_box_new_with_entry = Interop.downcallHandle(
        "gtk_combo_box_new_with_entry",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithEntry() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_combo_box_new_with_entry.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    
    private static final MethodHandle gtk_combo_box_new_with_model = Interop.downcallHandle(
        "gtk_combo_box_new_with_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithModel(@NotNull TreeModel model) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_combo_box_new_with_model.invokeExact(model.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkComboBox} with a model.
     */
    public static ComboBox newWithModel(@NotNull TreeModel model) {
        return new ComboBox(constructNewWithModel(model));
    }
    
    private static final MethodHandle gtk_combo_box_new_with_model_and_entry = Interop.downcallHandle(
        "gtk_combo_box_new_with_model_and_entry",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithModelAndEntry(@NotNull TreeModel model) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_combo_box_new_with_model_and_entry.invokeExact(model.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new empty {@code GtkComboBox} with an entry and a model.
     * <p>
     * See also {@link ComboBox#newWithEntry}.
     */
    public static ComboBox newWithModelAndEntry(@NotNull TreeModel model) {
        return new ComboBox(constructNewWithModelAndEntry(model));
    }
    
    private static final MethodHandle gtk_combo_box_get_active = Interop.downcallHandle(
        "gtk_combo_box_get_active",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the index of the currently active item.
     * <p>
     * If the model is a non-flat treemodel, and the active item is not
     * an immediate child of the root of the tree, this function returns
     * {@code gtk_tree_path_get_indices (path)[0]}, where {@code path} is the
     * {@code Gtk.TreePath} of the active item.
     */
    public int getActive() {
        int RESULT;
        try {
            RESULT = (int) gtk_combo_box_get_active.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_combo_box_get_active_id = Interop.downcallHandle(
        "gtk_combo_box_get_active_id",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @Nullable java.lang.String getActiveId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_combo_box_get_active_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_combo_box_get_active_iter = Interop.downcallHandle(
        "gtk_combo_box_get_active_iter",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code iter} to point to the currently active item.
     * <p>
     * If no item is active, {@code iter} is left unchanged.
     */
    public boolean getActiveIter(@NotNull Out<TreeIter> iter) {
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gtk_combo_box_get_active_iter.invokeExact(handle(), (Addressable) iterPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new TreeIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_combo_box_get_button_sensitivity = Interop.downcallHandle(
        "gtk_combo_box_get_button_sensitivity",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the combo box sets the dropdown button
     * sensitive or not when there are no items in the model.
     */
    public @NotNull SensitivityType getButtonSensitivity() {
        int RESULT;
        try {
            RESULT = (int) gtk_combo_box_get_button_sensitivity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SensitivityType(RESULT);
    }
    
    private static final MethodHandle gtk_combo_box_get_child = Interop.downcallHandle(
        "gtk_combo_box_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code combo_box}.
     */
    public @Nullable Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_combo_box_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_combo_box_get_entry_text_column = Interop.downcallHandle(
        "gtk_combo_box_get_entry_text_column",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the column which {@code combo_box} is using to get the strings
     * from to display in the internal entry.
     */
    public int getEntryTextColumn() {
        int RESULT;
        try {
            RESULT = (int) gtk_combo_box_get_entry_text_column.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_combo_box_get_has_entry = Interop.downcallHandle(
        "gtk_combo_box_get_has_entry",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the combo box has an entry.
     */
    public boolean getHasEntry() {
        int RESULT;
        try {
            RESULT = (int) gtk_combo_box_get_has_entry.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_combo_box_get_id_column = Interop.downcallHandle(
        "gtk_combo_box_get_id_column",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the column which {@code combo_box} is using to get string IDs
     * for values from.
     */
    public int getIdColumn() {
        int RESULT;
        try {
            RESULT = (int) gtk_combo_box_get_id_column.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_combo_box_get_model = Interop.downcallHandle(
        "gtk_combo_box_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GtkTreeModel} of {@code combo_box}.
     */
    public @Nullable TreeModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_combo_box_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TreeModel.TreeModelImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_combo_box_get_popup_fixed_width = Interop.downcallHandle(
        "gtk_combo_box_get_popup_fixed_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the popup uses a fixed width.
     */
    public boolean getPopupFixedWidth() {
        int RESULT;
        try {
            RESULT = (int) gtk_combo_box_get_popup_fixed_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_combo_box_popdown = Interop.downcallHandle(
        "gtk_combo_box_popdown",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Hides the menu or dropdown list of {@code combo_box}.
     * <p>
     * This function is mostly intended for use by accessibility technologies;
     * applications should have little use for it.
     */
    public @NotNull void popdown() {
        try {
            gtk_combo_box_popdown.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_combo_box_popup = Interop.downcallHandle(
        "gtk_combo_box_popup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Pops up the menu or dropdown list of {@code combo_box}.
     * <p>
     * This function is mostly intended for use by accessibility technologies;
     * applications should have little use for it.
     * <p>
     * Before calling this, {@code combo_box} must be mapped, or nothing will happen.
     */
    public @NotNull void popup() {
        try {
            gtk_combo_box_popup.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_combo_box_popup_for_device = Interop.downcallHandle(
        "gtk_combo_box_popup_for_device",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Pops up the menu of {@code combo_box}.
     * <p>
     * Note that currently this does not do anything with the device, as it was
     * previously only used for list-mode combo boxes, and those were removed
     * in GTK 4. However, it is retained in case similar functionality is added
     * back later.
     */
    public @NotNull void popupForDevice(@NotNull org.gtk.gdk.Device device) {
        try {
            gtk_combo_box_popup_for_device.invokeExact(handle(), device.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_combo_box_set_active = Interop.downcallHandle(
        "gtk_combo_box_set_active",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the active item of {@code combo_box} to be the item at {@code index}.
     */
    public @NotNull void setActive(@NotNull int index) {
        try {
            gtk_combo_box_set_active.invokeExact(handle(), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_combo_box_set_active_id = Interop.downcallHandle(
        "gtk_combo_box_set_active_id",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public boolean setActiveId(@Nullable java.lang.String activeId) {
        int RESULT;
        try {
            RESULT = (int) gtk_combo_box_set_active_id.invokeExact(handle(), Interop.allocateNativeString(activeId));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_combo_box_set_active_iter = Interop.downcallHandle(
        "gtk_combo_box_set_active_iter",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the current active item to be the one referenced by {@code iter}.
     * <p>
     * If {@code iter} is {@code null}, the active item is unset.
     */
    public @NotNull void setActiveIter(@Nullable TreeIter iter) {
        try {
            gtk_combo_box_set_active_iter.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_combo_box_set_button_sensitivity = Interop.downcallHandle(
        "gtk_combo_box_set_button_sensitivity",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the dropdown button of the combo box should update
     * its sensitivity depending on the model contents.
     */
    public @NotNull void setButtonSensitivity(@NotNull SensitivityType sensitivity) {
        try {
            gtk_combo_box_set_button_sensitivity.invokeExact(handle(), sensitivity.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_combo_box_set_child = Interop.downcallHandle(
        "gtk_combo_box_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code combo_box}.
     */
    public @NotNull void setChild(@Nullable Widget child) {
        try {
            gtk_combo_box_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_combo_box_set_entry_text_column = Interop.downcallHandle(
        "gtk_combo_box_set_entry_text_column",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
    public @NotNull void setEntryTextColumn(@NotNull int textColumn) {
        try {
            gtk_combo_box_set_entry_text_column.invokeExact(handle(), textColumn);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_combo_box_set_id_column = Interop.downcallHandle(
        "gtk_combo_box_set_id_column",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the model column which {@code combo_box} should use to get string IDs
     * for values from.
     * <p>
     * The column {@code id_column} in the model of {@code combo_box} must be of type
     * {@code G_TYPE_STRING}.
     */
    public @NotNull void setIdColumn(@NotNull int idColumn) {
        try {
            gtk_combo_box_set_id_column.invokeExact(handle(), idColumn);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_combo_box_set_model = Interop.downcallHandle(
        "gtk_combo_box_set_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void setModel(@Nullable TreeModel model) {
        try {
            gtk_combo_box_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_combo_box_set_popup_fixed_width = Interop.downcallHandle(
        "gtk_combo_box_set_popup_fixed_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Specifies whether the popup’s width should be a fixed width.
     * <p>
     * If {@code fixed} is {@code true}, the popup's width is set to match the
     * allocated width of the combo box.
     */
    public @NotNull void setPopupFixedWidth(@NotNull boolean fixed) {
        try {
            gtk_combo_box_set_popup_fixed_width.invokeExact(handle(), fixed ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_combo_box_set_row_separator_func = Interop.downcallHandle(
        "gtk_combo_box_set_row_separator_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the row separator function, which is used to determine
     * whether a row should be drawn as a separator.
     * <p>
     * If the row separator function is {@code null}, no separators are drawn.
     * This is the default value.
     */
    public @NotNull void setRowSeparatorFunc(@Nullable TreeViewRowSeparatorFunc func) {
        try {
            gtk_combo_box_set_row_separator_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeViewRowSeparatorFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ComboBox.Callbacks.class, "signalComboBoxActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ComboBox.Callbacks.class, "signalComboBoxChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface FormatEntryTextHandler {
        void signalReceived(ComboBox source, @NotNull java.lang.String path);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("format-entry-text"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ComboBox.Callbacks.class, "signalComboBoxFormatEntryText",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveActiveHandler {
        void signalReceived(ComboBox source, @NotNull ScrollType scrollType);
    }
    
    /**
     * Emitted to move the active selection.
     * <p>
     * This is an <a href="class.SignalAction.html">keybinding signal</a>.
     */
    public SignalHandle onMoveActive(MoveActiveHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-active"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ComboBox.Callbacks.class, "signalComboBoxMoveActive",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("popdown"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ComboBox.Callbacks.class, "signalComboBoxPopdown",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("popup"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ComboBox.Callbacks.class, "signalComboBoxPopup",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
