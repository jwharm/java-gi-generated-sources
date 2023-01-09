package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkComboBoxText} is a simple variant of {@code GtkComboBox} for text-only
 * use cases.
 * <p>
 * <img src="./doc-files/combo-box-text.png" alt="An example GtkComboBoxText">
 * <p>
 * {@code GtkComboBoxText} hides the model-view complexity of {@code GtkComboBox}.
 * <p>
 * To create a {@code GtkComboBoxText}, use {@link ComboBoxText#ComboBoxText} or
 * {@link ComboBoxText#newWithEntry}.
 * <p>
 * You can add items to a {@code GtkComboBoxText} with
 * {@link ComboBoxText#appendText},
 * {@link ComboBoxText#insertText} or
 * {@link ComboBoxText#prependText} and remove options with
 * {@link ComboBoxText#remove}.
 * <p>
 * If the {@code GtkComboBoxText} contains an entry (via the
 * {@code Gtk.ComboBox:has-entry} property), its contents can be retrieved
 * using {@link ComboBoxText#getActiveText}.
 * <p>
 * You should not call {@link ComboBox#setModel} or attempt to pack more
 * cells into this combo box via its {@code Gtk.CellLayout} interface.
 * <p>
 * <strong>GtkComboBoxText as GtkBuildable</strong><br/>
 * The {@code GtkComboBoxText} implementation of the {@code GtkBuildable} interface supports
 * adding items directly using the &lt;items&gt; element and specifying &lt;item&gt;
 * elements for each item. Each &lt;item&gt; element can specify the “id”
 * corresponding to the appended text and also supports the regular
 * translation attributes “translatable”, “context” and “comments”.
 * <p>
 * Here is a UI definition fragment specifying {@code GtkComboBoxText} items:
 * <pre>{@code xml
 * <object class="GtkComboBoxText">
 *   <items>
 *     <item translatable="yes" id="factory">Factory</item>
 *     <item translatable="yes" id="home">Home</item>
 *     <item translatable="yes" id="subway">Subway</item>
 *   </items>
 * </object>
 * }</pre>
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * combobox
 * ╰── box.linked
 *     ├── entry.combo
 *     ├── button.combo
 *     ╰── window.popup
 * }</pre>
 * <p>
 * {@code GtkComboBoxText} has a single CSS node with name combobox. It adds
 * the style class .combo to the main CSS nodes of its entry and button
 * children, and the .linked class to the node of its internal box.
 */
public class ComboBoxText extends org.gtk.gtk.ComboBox implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.CellEditable, org.gtk.gtk.CellLayout, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkComboBoxText";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ComboBoxText proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ComboBoxText(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ComboBoxText> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ComboBoxText(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_combo_box_text_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkComboBoxText}.
     */
    public ComboBoxText() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithEntry() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_combo_box_text_new_with_entry.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@code GtkComboBoxText} with an entry.
     * @return a new {@code GtkComboBoxText}
     */
    public static ComboBoxText newWithEntry() {
        var RESULT = constructNewWithEntry();
        var OBJECT = (org.gtk.gtk.ComboBoxText) Interop.register(RESULT, org.gtk.gtk.ComboBoxText.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Appends {@code text} to the list of strings stored in {@code combo_box}.
     * <p>
     * If {@code id} is non-{@code null} then it is used as the ID of the row.
     * <p>
     * This is the same as calling {@link ComboBoxText#insert}
     * with a position of -1.
     * @param id a string ID for this value
     * @param text A string
     */
    public void append(@Nullable java.lang.String id, java.lang.String text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_combo_box_text_append.invokeExact(
                        handle(),
                        (Addressable) (id == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(id, SCOPE)),
                        Marshal.stringToAddress.marshal(text, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Appends {@code text} to the list of strings stored in {@code combo_box}.
     * <p>
     * This is the same as calling {@link ComboBoxText#insertText}
     * with a position of -1.
     * @param text A string
     */
    public void appendText(java.lang.String text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_combo_box_text_append_text.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(text, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Returns the currently active string in {@code combo_box}.
     * <p>
     * If no row is currently selected, {@code null} is returned.
     * If {@code combo_box} contains an entry, this function will
     * return its contents (which will not necessarily
     * be an item from the list).
     * @return a newly allocated
     *   string containing the currently active text.
     *   Must be freed with g_free().
     */
    public @Nullable java.lang.String getActiveText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_combo_box_text_get_active_text.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Inserts {@code text} at {@code position} in the list of strings stored in {@code combo_box}.
     * <p>
     * If {@code id} is non-{@code null} then it is used as the ID of the row.
     * See {@code Gtk.ComboBox:id-column}.
     * <p>
     * If {@code position} is negative then {@code text} is appended.
     * @param position An index to insert {@code text}
     * @param id a string ID for this value
     * @param text A string to display
     */
    public void insert(int position, @Nullable java.lang.String id, java.lang.String text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_combo_box_text_insert.invokeExact(
                        handle(),
                        position,
                        (Addressable) (id == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(id, SCOPE)),
                        Marshal.stringToAddress.marshal(text, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Inserts {@code text} at {@code position} in the list of strings stored in {@code combo_box}.
     * <p>
     * If {@code position} is negative then {@code text} is appended.
     * <p>
     * This is the same as calling {@link ComboBoxText#insert}
     * with a {@code null} ID string.
     * @param position An index to insert {@code text}
     * @param text A string
     */
    public void insertText(int position, java.lang.String text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_combo_box_text_insert_text.invokeExact(
                        handle(),
                        position,
                        Marshal.stringToAddress.marshal(text, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Prepends {@code text} to the list of strings stored in {@code combo_box}.
     * <p>
     * If {@code id} is non-{@code null} then it is used as the ID of the row.
     * <p>
     * This is the same as calling {@link ComboBoxText#insert}
     * with a position of 0.
     * @param id a string ID for this value
     * @param text a string
     */
    public void prepend(@Nullable java.lang.String id, java.lang.String text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_combo_box_text_prepend.invokeExact(
                        handle(),
                        (Addressable) (id == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(id, SCOPE)),
                        Marshal.stringToAddress.marshal(text, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Prepends {@code text} to the list of strings stored in {@code combo_box}.
     * <p>
     * This is the same as calling {@link ComboBoxText#insertText}
     * with a position of 0.
     * @param text A string
     */
    public void prependText(java.lang.String text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_combo_box_text_prepend_text.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(text, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Removes the string at {@code position} from {@code combo_box}.
     * @param position Index of the item to remove
     */
    public void remove(int position) {
        try {
            DowncallHandles.gtk_combo_box_text_remove.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes all the text entries from the combo box.
     */
    public void removeAll() {
        try {
            DowncallHandles.gtk_combo_box_text_remove_all.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.gtk_combo_box_text_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ComboBoxText.Builder} object constructs a {@link ComboBoxText} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ComboBoxText.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.ComboBox.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ComboBoxText} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ComboBoxText}.
         * @return A new instance of {@code ComboBoxText} with the properties 
         *         that were set in the Builder object.
         */
        public ComboBoxText build() {
            return (ComboBoxText) org.gtk.gobject.GObject.newWithProperties(
                ComboBoxText.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_combo_box_text_new = Interop.downcallHandle(
                "gtk_combo_box_text_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_text_new_with_entry = Interop.downcallHandle(
                "gtk_combo_box_text_new_with_entry",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_text_append = Interop.downcallHandle(
                "gtk_combo_box_text_append",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_text_append_text = Interop.downcallHandle(
                "gtk_combo_box_text_append_text",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_text_get_active_text = Interop.downcallHandle(
                "gtk_combo_box_text_get_active_text",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_text_insert = Interop.downcallHandle(
                "gtk_combo_box_text_insert",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_text_insert_text = Interop.downcallHandle(
                "gtk_combo_box_text_insert_text",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_text_prepend = Interop.downcallHandle(
                "gtk_combo_box_text_prepend",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_text_prepend_text = Interop.downcallHandle(
                "gtk_combo_box_text_prepend_text",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_text_remove = Interop.downcallHandle(
                "gtk_combo_box_text_remove",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_combo_box_text_remove_all = Interop.downcallHandle(
                "gtk_combo_box_text_remove_all",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_combo_box_text_get_type = Interop.downcallHandle(
                "gtk_combo_box_text_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_combo_box_text_get_type != null;
    }
}
