package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkComboBoxText` is a simple variant of `GtkComboBox` for text-only
 * use cases.
 * 
 * ![An example GtkComboBoxText](combo-box-text.png)
 * 
 * `GtkComboBoxText` hides the model-view complexity of `GtkComboBox`.
 * 
 * To create a `GtkComboBoxText`, use [ctor@Gtk.ComboBoxText.new] or
 * [ctor@Gtk.ComboBoxText.new_with_entry].
 * 
 * You can add items to a `GtkComboBoxText` with
 * [method@Gtk.ComboBoxText.append_text],
 * [method@Gtk.ComboBoxText.insert_text] or
 * [method@Gtk.ComboBoxText.prepend_text] and remove options with
 * [method@Gtk.ComboBoxText.remove].
 * 
 * If the `GtkComboBoxText` contains an entry (via the
 * [property@Gtk.ComboBox:has-entry] property), its contents can be retrieved
 * using [method@Gtk.ComboBoxText.get_active_text].
 * 
 * You should not call [method@Gtk.ComboBox.set_model] or attempt to pack more
 * cells into this combo box via its [iface@Gtk.CellLayout] interface.
 * 
 * # GtkComboBoxText as GtkBuildable
 * 
 * The `GtkComboBoxText` implementation of the `GtkBuildable` interface supports
 * adding items directly using the <items> element and specifying <item>
 * elements for each item. Each <item> element can specify the “id”
 * corresponding to the appended text and also supports the regular
 * translation attributes “translatable”, “context” and “comments”.
 * 
 * Here is a UI definition fragment specifying `GtkComboBoxText` items:
 * ```xml
 * <object class="GtkComboBoxText">
 *   <items>
 *     <item translatable="yes" id="factory">Factory</item>
 *     <item translatable="yes" id="home">Home</item>
 *     <item translatable="yes" id="subway">Subway</item>
 *   </items>
 * </object>
 * ```
 * 
 * # CSS nodes
 * 
 * ```
 * combobox
 * ╰── box.linked
 *     ├── entry.combo
 *     ├── button.combo
 *     ╰── window.popup
 * ```
 * 
 * `GtkComboBoxText` has a single CSS node with name combobox. It adds
 * the style class .combo to the main CSS nodes of its entry and button
 * children, and the .linked class to the node of its internal box.
 */
public class ComboBoxText extends ComboBox implements Accessible, Buildable, CellEditable, CellLayout, ConstraintTarget {

    public ComboBoxText(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ComboBoxText */
    public static ComboBoxText castFrom(org.gtk.gobject.Object gobject) {
        return new ComboBoxText(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkComboBoxText`.
     */
    public ComboBoxText() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_combo_box_text_new(), false));
    }
    
    /**
     * Creates a new `GtkComboBoxText` with an entry.
     */
    public static ComboBoxText newWithEntry() {
        return new ComboBoxText(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_combo_box_text_new_with_entry(), false));
    }
    
    /**
     * Appends @text to the list of strings stored in @combo_box.
     * 
     * If @id is non-%NULL then it is used as the ID of the row.
     * 
     * This is the same as calling [method@Gtk.ComboBoxText.insert]
     * with a position of -1.
     */
    public void append(java.lang.String id, java.lang.String text) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_combo_box_text_append(HANDLE(), Interop.allocateNativeString(id).HANDLE(), Interop.allocateNativeString(text).HANDLE());
    }
    
    /**
     * Appends @text to the list of strings stored in @combo_box.
     * 
     * This is the same as calling [method@Gtk.ComboBoxText.insert_text]
     * with a position of -1.
     */
    public void appendText(java.lang.String text) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_combo_box_text_append_text(HANDLE(), Interop.allocateNativeString(text).HANDLE());
    }
    
    /**
     * Returns the currently active string in @combo_box.
     * 
     * If no row is currently selected, %NULL is returned.
     * If @combo_box contains an entry, this function will
     * return its contents (which will not necessarily
     * be an item from the list).
     */
    public java.lang.String getActiveText() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_combo_box_text_get_active_text(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Inserts @text at @position in the list of strings stored in @combo_box.
     * 
     * If @id is non-%NULL then it is used as the ID of the row.
     * See [property@Gtk.ComboBox:id-column].
     * 
     * If @position is negative then @text is appended.
     */
    public void insert(int position, java.lang.String id, java.lang.String text) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_combo_box_text_insert(HANDLE(), position, Interop.allocateNativeString(id).HANDLE(), Interop.allocateNativeString(text).HANDLE());
    }
    
    /**
     * Inserts @text at @position in the list of strings stored in @combo_box.
     * 
     * If @position is negative then @text is appended.
     * 
     * This is the same as calling [method@Gtk.ComboBoxText.insert]
     * with a %NULL ID string.
     */
    public void insertText(int position, java.lang.String text) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_combo_box_text_insert_text(HANDLE(), position, Interop.allocateNativeString(text).HANDLE());
    }
    
    /**
     * Prepends @text to the list of strings stored in @combo_box.
     * 
     * If @id is non-%NULL then it is used as the ID of the row.
     * 
     * This is the same as calling [method@Gtk.ComboBoxText.insert]
     * with a position of 0.
     */
    public void prepend(java.lang.String id, java.lang.String text) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_combo_box_text_prepend(HANDLE(), Interop.allocateNativeString(id).HANDLE(), Interop.allocateNativeString(text).HANDLE());
    }
    
    /**
     * Prepends @text to the list of strings stored in @combo_box.
     * 
     * This is the same as calling [method@Gtk.ComboBoxText.insert_text]
     * with a position of 0.
     */
    public void prependText(java.lang.String text) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_combo_box_text_prepend_text(HANDLE(), Interop.allocateNativeString(text).HANDLE());
    }
    
    /**
     * Removes the string at @position from @combo_box.
     */
    public void remove(int position) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_combo_box_text_remove(HANDLE(), position);
    }
    
    /**
     * Removes all the text entries from the combo box.
     */
    public void removeAll() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_combo_box_text_remove_all(HANDLE());
    }
    
}
