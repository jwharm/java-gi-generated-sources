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
 * <p>
 * <strong>CSS nodes</strong><br/>
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
 * <strong>Accessibility</strong><br/>
 * {@code GtkComboBox} uses the {@link AccessibleRole#COMBO_BOX} role.
 */
public class ComboBox extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.CellEditable, org.gtk.gtk.CellLayout, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkComboBox";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ComboBox proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ComboBox(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ComboBox> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ComboBox(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_combo_box_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new empty {@code GtkComboBox}.
     */
    public ComboBox() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithEntry() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_combo_box_new_with_entry.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new empty {@code GtkComboBox} with an entry.
     * <p>
     * In order to use a combo box with entry, you need to tell it
     * which column of the model contains the text for the entry
     * by calling {@link ComboBox#setEntryTextColumn}.
     * @return A new {@code GtkComboBox}
     */
    public static ComboBox newWithEntry() {
        var RESULT = constructNewWithEntry();
        var OBJECT = (org.gtk.gtk.ComboBox) Interop.register(RESULT, org.gtk.gtk.ComboBox.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWithModel(org.gtk.gtk.TreeModel model) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_combo_box_new_with_model.invokeExact(model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@code GtkComboBox} with a model.
     * @param model a {@code GtkTreeModel}
     * @return A new {@code GtkComboBox}
     */
    public static ComboBox newWithModel(org.gtk.gtk.TreeModel model) {
        var RESULT = constructNewWithModel(model);
        var OBJECT = (org.gtk.gtk.ComboBox) Interop.register(RESULT, org.gtk.gtk.ComboBox.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWithModelAndEntry(org.gtk.gtk.TreeModel model) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_combo_box_new_with_model_and_entry.invokeExact(model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new empty {@code GtkComboBox} with an entry and a model.
     * <p>
     * See also {@link ComboBox#newWithEntry}.
     * @param model A {@code GtkTreeModel}
     * @return A new {@code GtkComboBox}
     */
    public static ComboBox newWithModelAndEntry(org.gtk.gtk.TreeModel model) {
        var RESULT = constructNewWithModelAndEntry(model);
        var OBJECT = (org.gtk.gtk.ComboBox) Interop.register(RESULT, org.gtk.gtk.ComboBox.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Returns the index of the currently active item.
     * <p>
     * If the model is a non-flat treemodel, and the active item is not
     * an immediate child of the root of the tree, this function returns
     * {@code gtk_tree_path_get_indices (path)[0]}, where {@code path} is the
     * {@code Gtk.TreePath} of the active item.
     * @return An integer which is the index of the currently active item,
     *   or -1 if there’s no active item
     */
    public int getActive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_combo_box_get_active.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the ID of the active row of {@code combo_box}.
     * <p>
     * This value is taken from the active row and the column specified
     * by the {@code Gtk.ComboBox:id-column} property of {@code combo_box}
     * (see {@link ComboBox#setIdColumn}).
     * <p>
     * The returned value is an interned string which means that you can
     * compare the pointer by value to other interned strings and that you
     * must not free it.
     * <p>
     * If the {@code Gtk.ComboBox:id-column} property of {@code combo_box} is
     * not set, or if no row is active, or if the active row has a {@code null}
     * ID value, then {@code null} is returned.
     * @return the ID of the active row
     */
    public @Nullable java.lang.String getActiveId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_combo_box_get_active_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Sets {@code iter} to point to the currently active item.
     * <p>
     * If no item is active, {@code iter} is left unchanged.
     * @param iter A {@code GtkTreeIter}
     * @return {@code true} if {@code iter} was set, {@code false} otherwise
     */
    public boolean getActiveIter(org.gtk.gtk.TreeIter iter) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_combo_box_get_active_iter.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether the combo box sets the dropdown button
     * sensitive or not when there are no items in the model.
     * @return {@link SensitivityType#ON} if the dropdown button
     *   is sensitive when the model is empty, {@link SensitivityType#OFF}
     *   if the button is always insensitive or {@link SensitivityType#AUTO}
     *   if it is only sensitive as long as the model has one item to
     *   be selected.
     */
    public org.gtk.gtk.SensitivityType getButtonSensitivity() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_combo_box_get_button_sensitivity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.SensitivityType.of(RESULT);
    }
    
    /**
     * Gets the child widget of {@code combo_box}.
     * @return the child widget of {@code combo_box}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_combo_box_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the column which {@code combo_box} is using to get the strings
     * from to display in the internal entry.
     * @return A column in the data source model of {@code combo_box}.
     */
    public int getEntryTextColumn() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_combo_box_get_entry_text_column.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether the combo box has an entry.
     * @return whether there is an entry in {@code combo_box}.
     */
    public boolean getHasEntry() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_combo_box_get_has_entry.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the column which {@code combo_box} is using to get string IDs
     * for values from.
     * @return A column in the data source model of {@code combo_box}.
     */
    public int getIdColumn() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_combo_box_get_id_column.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the {@code GtkTreeModel} of {@code combo_box}.
     * @return A {@code GtkTreeModel} which was passed
     *   during construction.
     */
    public @Nullable org.gtk.gtk.TreeModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_combo_box_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.TreeModel) Interop.register(RESULT, org.gtk.gtk.TreeModel.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets whether the popup uses a fixed width.
     * @return {@code true} if the popup uses a fixed width
     */
    public boolean getPopupFixedWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_combo_box_get_popup_fixed_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the current row separator function.
     * @return the current row separator function.
     */
    public @Nullable org.gtk.gtk.TreeViewRowSeparatorFunc getRowSeparatorFunc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_combo_box_get_row_separator_func.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Hides the menu or dropdown list of {@code combo_box}.
     * <p>
     * This function is mostly intended for use by accessibility technologies;
     * applications should have little use for it.
     */
    public void popdown() {
        try {
            DowncallHandles.gtk_combo_box_popdown.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.gtk_combo_box_popup.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Pops up the menu of {@code combo_box}.
     * <p>
     * Note that currently this does not do anything with the device, as it was
     * previously only used for list-mode combo boxes, and those were removed
     * in GTK 4. However, it is retained in case similar functionality is added
     * back later.
     * @param device a {@code GdkDevice}
     */
    public void popupForDevice(org.gtk.gdk.Device device) {
        try {
            DowncallHandles.gtk_combo_box_popup_for_device.invokeExact(
                    handle(),
                    device.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the active item of {@code combo_box} to be the item at {@code index}.
     * @param index An index in the model passed during construction,
     *   or -1 to have no active item
     */
    public void setActive(int index) {
        try {
            DowncallHandles.gtk_combo_box_set_active.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param activeId the ID of the row to select
     * @return {@code true} if a row with a matching ID was found. If a {@code null}
     *   {@code active_id} was given to unset the active row, the function
     *   always returns {@code true}.
     */
    public boolean setActiveId(@Nullable java.lang.String activeId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_combo_box_set_active_id.invokeExact(
                        handle(),
                        (Addressable) (activeId == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(activeId, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Sets the current active item to be the one referenced by {@code iter}.
     * <p>
     * If {@code iter} is {@code null}, the active item is unset.
     * @param iter The {@code GtkTreeIter}
     */
    public void setActiveIter(@Nullable org.gtk.gtk.TreeIter iter) {
        try {
            DowncallHandles.gtk_combo_box_set_active_iter.invokeExact(
                    handle(),
                    (Addressable) (iter == null ? MemoryAddress.NULL : iter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the dropdown button of the combo box should update
     * its sensitivity depending on the model contents.
     * @param sensitivity specify the sensitivity of the dropdown button
     */
    public void setButtonSensitivity(org.gtk.gtk.SensitivityType sensitivity) {
        try {
            DowncallHandles.gtk_combo_box_set_button_sensitivity.invokeExact(
                    handle(),
                    sensitivity.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the child widget of {@code combo_box}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_combo_box_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param textColumn A column in {@code model} to get the strings from for
     *   the internal entry
     */
    public void setEntryTextColumn(int textColumn) {
        try {
            DowncallHandles.gtk_combo_box_set_entry_text_column.invokeExact(
                    handle(),
                    textColumn);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the model column which {@code combo_box} should use to get string IDs
     * for values from.
     * <p>
     * The column {@code id_column} in the model of {@code combo_box} must be of type
     * {@code G_TYPE_STRING}.
     * @param idColumn A column in {@code model} to get string IDs for values from
     */
    public void setIdColumn(int idColumn) {
        try {
            DowncallHandles.gtk_combo_box_set_id_column.invokeExact(
                    handle(),
                    idColumn);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param model A {@code GtkTreeModel}
     */
    public void setModel(@Nullable org.gtk.gtk.TreeModel model) {
        try {
            DowncallHandles.gtk_combo_box_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Specifies whether the popup’s width should be a fixed width.
     * <p>
     * If {@code fixed} is {@code true}, the popup's width is set to match the
     * allocated width of the combo box.
     * @param fixed whether to use a fixed popup width
     */
    public void setPopupFixedWidth(boolean fixed) {
        try {
            DowncallHandles.gtk_combo_box_set_popup_fixed_width.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(fixed, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the row separator function, which is used to determine
     * whether a row should be drawn as a separator.
     * <p>
     * If the row separator function is {@code null}, no separators are drawn.
     * This is the default value.
     * @param func a {@code GtkTreeViewRowSeparatorFunc}
     * @param destroy destroy notifier for {@code data}
     */
    public void setRowSeparatorFunc(@Nullable org.gtk.gtk.TreeViewRowSeparatorFunc func, @Nullable org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.gtk_combo_box_set_row_separator_func.invokeExact(
                    handle(),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
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
            RESULT = (long) DowncallHandles.gtk_combo_box_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Activate} callback.
     */
    @FunctionalInterface
    public interface Activate {
    
        /**
         * Emitted to when the combo box is activated.
         * <p>
         * The {@code ::activate} signal on {@code GtkComboBox} is an action signal and
         * emitting it causes the combo box to pop up its dropdown.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceComboBox) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Activate.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to when the combo box is activated.
     * <p>
     * The {@code ::activate} signal on {@code GtkComboBox} is an action signal and
     * emitting it causes the combo box to pop up its dropdown.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ComboBox.Activate> onActivate(ComboBox.Activate handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Changed} callback.
     */
    @FunctionalInterface
    public interface Changed {
    
        /**
         * Emitted when the active item is changed.
         * <p>
         * The can be due to the user selecting a different item from the list,
         * or due to a call to {@link ComboBox#setActiveIter}. It will
         * also be emitted while typing into the entry of a combo box with an entry.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceComboBox) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
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
     * Emitted when the active item is changed.
     * <p>
     * The can be due to the user selecting a different item from the list,
     * or due to a call to {@link ComboBox#setActiveIter}. It will
     * also be emitted while typing into the entry of a combo box with an entry.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ComboBox.Changed> onChanged(ComboBox.Changed handler) {
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
     * Functional interface declaration of the {@code FormatEntryText} callback.
     */
    @FunctionalInterface
    public interface FormatEntryText {
    
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
        java.lang.String run(java.lang.String path);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress sourceComboBox, MemoryAddress path) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run(Marshal.addressToString.marshal(path, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FormatEntryText.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ComboBox.FormatEntryText> onFormatEntryText(ComboBox.FormatEntryText handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("format-entry-text", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code MoveActive} callback.
     */
    @FunctionalInterface
    public interface MoveActive {
    
        /**
         * Emitted to move the active selection.
         * <p>
         * This is an <a href="class.SignalAction.html">keybinding signal</a>.
         */
        void run(org.gtk.gtk.ScrollType scrollType);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceComboBox, int scrollType) {
            run(org.gtk.gtk.ScrollType.of(scrollType));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MoveActive.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to move the active selection.
     * <p>
     * This is an <a href="class.SignalAction.html">keybinding signal</a>.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ComboBox.MoveActive> onMoveActive(ComboBox.MoveActive handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("move-active", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Popdown} callback.
     */
    @FunctionalInterface
    public interface Popdown {
    
        /**
         * Emitted to popdown the combo box list.
         * <p>
         * This is an <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default bindings for this signal are Alt+Up and Escape.
         */
        boolean run();
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceComboBox) {
            var RESULT = run();
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Popdown.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to popdown the combo box list.
     * <p>
     * This is an <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are Alt+Up and Escape.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ComboBox.Popdown> onPopdown(ComboBox.Popdown handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("popdown", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Popup} callback.
     */
    @FunctionalInterface
    public interface Popup {
    
        /**
         * Emitted to popup the combo box list.
         * <p>
         * This is an <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default binding for this signal is Alt+Down.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceComboBox) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Popup.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to popup the combo box list.
     * <p>
     * This is an <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is Alt+Down.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ComboBox.Popup> onPopup(ComboBox.Popup handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("popup", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link ComboBox.Builder} object constructs a {@link ComboBox} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ComboBox.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ComboBox} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ComboBox}.
         * @return A new instance of {@code ComboBox} with the properties 
         *         that were set in the Builder object.
         */
        public ComboBox build() {
            return (ComboBox) org.gtk.gobject.GObject.newWithProperties(
                ComboBox.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The item which is currently active.
         * <p>
         * If the model is a non-flat treemodel, and the active item is not an
         * immediate child of the root of the tree, this property has the value
         * {@code gtk_tree_path_get_indices (path)[0]}, where {@code path} is the
         * {@code Gtk.TreePath} of the active item.
         * @param active The value for the {@code active} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActive(int active) {
            names.add("active");
            values.add(org.gtk.gobject.Value.create(active));
            return this;
        }
        
        /**
         * The value of the ID column of the active row.
         * @param activeId The value for the {@code active-id} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActiveId(java.lang.String activeId) {
            names.add("active-id");
            values.add(org.gtk.gobject.Value.create(activeId));
            return this;
        }
        
        /**
         * Whether the dropdown button is sensitive when
         * the model is empty.
         * @param buttonSensitivity The value for the {@code button-sensitivity} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setButtonSensitivity(org.gtk.gtk.SensitivityType buttonSensitivity) {
            names.add("button-sensitivity");
            values.add(org.gtk.gobject.Value.create(buttonSensitivity));
            return this;
        }
        
        /**
         * The child widget.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * The model column to associate with strings from the entry.
         * <p>
         * This is property only relevant if the combo was created with
         * {@code Gtk.ComboBox:has-entry} is {@code true}.
         * @param entryTextColumn The value for the {@code entry-text-column} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEntryTextColumn(int entryTextColumn) {
            names.add("entry-text-column");
            values.add(org.gtk.gobject.Value.create(entryTextColumn));
            return this;
        }
        
        /**
         * Whether the combo box has an entry.
         * @param hasEntry The value for the {@code has-entry} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHasEntry(boolean hasEntry) {
            names.add("has-entry");
            values.add(org.gtk.gobject.Value.create(hasEntry));
            return this;
        }
        
        /**
         * The {@code has-frame} property controls whether a frame is drawn around the entry.
         * @param hasFrame The value for the {@code has-frame} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHasFrame(boolean hasFrame) {
            names.add("has-frame");
            values.add(org.gtk.gobject.Value.create(hasFrame));
            return this;
        }
        
        /**
         * The model column that provides string IDs for the values
         * in the model, if != -1.
         * @param idColumn The value for the {@code id-column} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIdColumn(int idColumn) {
            names.add("id-column");
            values.add(org.gtk.gobject.Value.create(idColumn));
            return this;
        }
        
        /**
         * The model from which the combo box takes its values.
         * @param model The value for the {@code model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModel(org.gtk.gtk.TreeModel model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
        
        /**
         * Whether the popup's width should be a fixed width matching the
         * allocated width of the combo box.
         * @param popupFixedWidth The value for the {@code popup-fixed-width} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPopupFixedWidth(boolean popupFixedWidth) {
            names.add("popup-fixed-width");
            values.add(org.gtk.gobject.Value.create(popupFixedWidth));
            return this;
        }
        
        /**
         * Whether the combo boxes dropdown is popped up.
         * <p>
         * Note that this property is mainly useful, because
         * it allows you to connect to notify::popup-shown.
         * @param popupShown The value for the {@code popup-shown} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPopupShown(boolean popupShown) {
            names.add("popup-shown");
            values.add(org.gtk.gobject.Value.create(popupShown));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_combo_box_new = Interop.downcallHandle(
                "gtk_combo_box_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_new_with_entry = Interop.downcallHandle(
                "gtk_combo_box_new_with_entry",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_new_with_model = Interop.downcallHandle(
                "gtk_combo_box_new_with_model",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_new_with_model_and_entry = Interop.downcallHandle(
                "gtk_combo_box_new_with_model_and_entry",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_get_active = Interop.downcallHandle(
                "gtk_combo_box_get_active",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_get_active_id = Interop.downcallHandle(
                "gtk_combo_box_get_active_id",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_get_active_iter = Interop.downcallHandle(
                "gtk_combo_box_get_active_iter",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_get_button_sensitivity = Interop.downcallHandle(
                "gtk_combo_box_get_button_sensitivity",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_get_child = Interop.downcallHandle(
                "gtk_combo_box_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_get_entry_text_column = Interop.downcallHandle(
                "gtk_combo_box_get_entry_text_column",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_get_has_entry = Interop.downcallHandle(
                "gtk_combo_box_get_has_entry",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_get_id_column = Interop.downcallHandle(
                "gtk_combo_box_get_id_column",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_get_model = Interop.downcallHandle(
                "gtk_combo_box_get_model",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_get_popup_fixed_width = Interop.downcallHandle(
                "gtk_combo_box_get_popup_fixed_width",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_get_row_separator_func = Interop.downcallHandle(
                "gtk_combo_box_get_row_separator_func",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_popdown = Interop.downcallHandle(
                "gtk_combo_box_popdown",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_popup = Interop.downcallHandle(
                "gtk_combo_box_popup",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_popup_for_device = Interop.downcallHandle(
                "gtk_combo_box_popup_for_device",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_set_active = Interop.downcallHandle(
                "gtk_combo_box_set_active",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_combo_box_set_active_id = Interop.downcallHandle(
                "gtk_combo_box_set_active_id",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_set_active_iter = Interop.downcallHandle(
                "gtk_combo_box_set_active_iter",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_set_button_sensitivity = Interop.downcallHandle(
                "gtk_combo_box_set_button_sensitivity",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_combo_box_set_child = Interop.downcallHandle(
                "gtk_combo_box_set_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_set_entry_text_column = Interop.downcallHandle(
                "gtk_combo_box_set_entry_text_column",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_combo_box_set_id_column = Interop.downcallHandle(
                "gtk_combo_box_set_id_column",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_combo_box_set_model = Interop.downcallHandle(
                "gtk_combo_box_set_model",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_set_popup_fixed_width = Interop.downcallHandle(
                "gtk_combo_box_set_popup_fixed_width",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_combo_box_set_row_separator_func = Interop.downcallHandle(
                "gtk_combo_box_set_row_separator_func",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_get_type = Interop.downcallHandle(
                "gtk_combo_box_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_combo_box_get_type != null;
    }
}
