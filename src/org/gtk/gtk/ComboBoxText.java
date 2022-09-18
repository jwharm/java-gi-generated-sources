package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkComboBoxText</code> is a simple variant of <code>GtkComboBox</code> for text-only
 * use cases.
 * <p>
 * !{@link [An example GtkComboBoxText]}(combo-box-text.png)
 * <p><code>GtkComboBoxText</code> hides the model-view complexity of <code>GtkComboBox</code>.
 * <p>
 * To create a <code>GtkComboBoxText</code>, use {@link [ctor@Gtk.ComboBoxText.new] (ref=ctor)} or
 * {@link [ctor@Gtk.ComboBoxText.new_with_entry] (ref=ctor)}.
 * <p>
 * You can add items to a <code>GtkComboBoxText</code> with
 * {@link org.gtk.gtk.ComboBoxText<code>#appendText</code> ,
 * {@link org.gtk.gtk.ComboBoxText<code>#insertText</code>  or
 * {@link org.gtk.gtk.ComboBoxText<code>#prependText</code>  and remove options with
 * {@link org.gtk.gtk.ComboBoxText<code>#remove</code> .
 * <p>
 * If the <code>GtkComboBoxText</code> contains an entry (via the
 * {@link [property@Gtk.ComboBox:has-entry] (ref=property)} property), its contents can be retrieved
 * using {@link org.gtk.gtk.ComboBoxText<code>#getActiveText</code> .
 * <p>
 * You should not call {@link org.gtk.gtk.ComboBox<code>#setModel</code>  or attempt to pack more
 * cells into this combo box via its {@link [iface@Gtk.CellLayout] (ref=iface)} interface.
 * <p>
 * <h1>GtkComboBoxText as GtkBuildable</h1>
 * <p>
 * The <code>GtkComboBoxText</code> implementation of the <code>GtkBuildable</code> interface supports
 * adding items directly using the &<code>#60</code> items&<code>#62</code>  element and specifying &<code>#60</code> item&<code>#62</code> 
 * elements for each item. Each &<code>#60</code> item&<code>#62</code>  element can specify the &<code>#8220</code> id&<code>#8221</code> 
 * corresponding to the appended text and also supports the regular
 * translation attributes &<code>#8220</code> translatable&<code>#8221</code> , &<code>#8220</code> context&<code>#8221</code>  and &<code>#8220</code> comments&<code>#8221</code> .
 * <p>
 * Here is a UI definition fragment specifying <code>GtkComboBoxText</code> items:<pre>xml
 * &<code>#60</code> object class=&<code>#34</code> GtkComboBoxText&<code>#34</code> &<code>#62</code> 
 *   &<code>#60</code> items&<code>#62</code> 
 *     &<code>#60</code> item translatable=&<code>#34</code> yes&<code>#34</code>  id=&<code>#34</code> factory&<code>#34</code> &<code>#62</code> Factory&<code>#60</code> /item&<code>#62</code> 
 *     &<code>#60</code> item translatable=&<code>#34</code> yes&<code>#34</code>  id=&<code>#34</code> home&<code>#34</code> &<code>#62</code> Home&<code>#60</code> /item&<code>#62</code> 
 *     &<code>#60</code> item translatable=&<code>#34</code> yes&<code>#34</code>  id=&<code>#34</code> subway&<code>#34</code> &<code>#62</code> Subway&<code>#60</code> /item&<code>#62</code> 
 *   &<code>#60</code> /items&<code>#62</code> 
 * &<code>#60</code> /object&<code>#62</code> 
 * </pre>
 * <p>
 * <h1>CSS nodes</h1>
 * <p><pre>
 * combobox
 * &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  box.linked
 *     &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  entry.combo
 *     &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  button.combo
 *     &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  window.popup
 * </pre>
 * <p><code>GtkComboBoxText</code> has a single CSS node with name combobox. It adds
 * the style class .combo to the main CSS nodes of its entry and button
 * children, and the .linked class to the node of its internal box.
 */
public class ComboBoxText extends ComboBox implements Accessible, Buildable, CellEditable, CellLayout, ConstraintTarget {

    public ComboBoxText(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ComboBoxText */
    public static ComboBoxText castFrom(org.gtk.gobject.Object gobject) {
        return new ComboBoxText(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_combo_box_text_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkComboBoxText</code>.
     */
    public ComboBoxText() {
        super(constructNew());
    }
    
    private static Reference constructNewWithEntry() {
        Reference RESULT = References.get(gtk_h.gtk_combo_box_text_new_with_entry(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkComboBoxText</code> with an entry.
     */
    public static ComboBoxText newWithEntry() {
        return new ComboBoxText(constructNewWithEntry());
    }
    
    /**
     * Appends @text to the list of strings stored in @combo_box.
     * 
     * If @id is non-<code>null</code> then it is used as the ID of the row.
     * 
     * This is the same as calling {@link org.gtk.gtk.ComboBoxText<code>#insert</code> 
     * with a position of -1.
     */
    public void append(java.lang.String id, java.lang.String text) {
        gtk_h.gtk_combo_box_text_append(handle(), Interop.allocateNativeString(id).handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Appends @text to the list of strings stored in @combo_box.
     * 
     * This is the same as calling {@link org.gtk.gtk.ComboBoxText<code>#insertText</code> 
     * with a position of -1.
     */
    public void appendText(java.lang.String text) {
        gtk_h.gtk_combo_box_text_append_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Returns the currently active string in @combo_box.
     * 
     * If no row is currently selected, <code>null</code> is returned.
     * If @combo_box contains an entry, this function will
     * return its contents (which will not necessarily
     * be an item from the list).
     */
    public java.lang.String getActiveText() {
        var RESULT = gtk_h.gtk_combo_box_text_get_active_text(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Inserts @text at @position in the list of strings stored in @combo_box.
     * 
     * If @id is non-<code>null</code> then it is used as the ID of the row.
     * See {@link [property@Gtk.ComboBox:id-column] (ref=property)}.
     * 
     * If @position is negative then @text is appended.
     */
    public void insert(int position, java.lang.String id, java.lang.String text) {
        gtk_h.gtk_combo_box_text_insert(handle(), position, Interop.allocateNativeString(id).handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Inserts @text at @position in the list of strings stored in @combo_box.
     * 
     * If @position is negative then @text is appended.
     * 
     * This is the same as calling {@link org.gtk.gtk.ComboBoxText<code>#insert</code> 
     * with a <code>null</code> ID string.
     */
    public void insertText(int position, java.lang.String text) {
        gtk_h.gtk_combo_box_text_insert_text(handle(), position, Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Prepends @text to the list of strings stored in @combo_box.
     * 
     * If @id is non-<code>null</code> then it is used as the ID of the row.
     * 
     * This is the same as calling {@link org.gtk.gtk.ComboBoxText<code>#insert</code> 
     * with a position of 0.
     */
    public void prepend(java.lang.String id, java.lang.String text) {
        gtk_h.gtk_combo_box_text_prepend(handle(), Interop.allocateNativeString(id).handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Prepends @text to the list of strings stored in @combo_box.
     * 
     * This is the same as calling {@link org.gtk.gtk.ComboBoxText<code>#insertText</code> 
     * with a position of 0.
     */
    public void prependText(java.lang.String text) {
        gtk_h.gtk_combo_box_text_prepend_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Removes the string at @position from @combo_box.
     */
    public void remove(int position) {
        gtk_h.gtk_combo_box_text_remove(handle(), position);
    }
    
    /**
     * Removes all the text entries from the combo box.
     */
    public void removeAll() {
        gtk_h.gtk_combo_box_text_remove_all(handle());
    }
    
}
