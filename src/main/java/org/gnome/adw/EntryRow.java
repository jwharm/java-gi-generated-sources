package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link org.gtk.gtk.ListBoxRow} with an embedded text entry.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="entry-row-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="entry-row.png" alt="entry-row"&gt;
 * &lt;/picture&gt;
 * <p>
 * {@code AdwEntryRow} has a title that doubles as placeholder text. It shows an icon
 * indicating that it's editable and can receive additional widgets before or
 * after the editable part.
 * <p>
 * If {@code EntryRow:show-apply-button} is set to {@code TRUE}, {@code AdwEntryRow} can
 * show an apply button when editing its contents. This can be useful if
 * changing its contents can result in an expensive operation, such as network
 * activity.
 * <p>
 * {@code AdwEntryRow} provides only minimal API and should be used with the
 * {@code Gtk.Editable} API.
 * <p>
 * See also {@link PasswordEntryRow}.
 * <p>
 * <strong>AdwEntryRow as GtkBuildable</strong><br/>
 * The {@code AdwEntryRow} implementation of the {@code Gtk.Buildable} interface
 * supports adding a child at its end by specifying “suffix” or omitting the
 * “type” attribute of a &lt;child&gt; element.
 * <p>
 * It also supports adding a child as a prefix widget by specifying “prefix” as
 * the “type” attribute of a &lt;child&gt; element.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwEntryRow} has a single CSS node with name {@code row} and the {@code .entry} style
 * class.
 * @version 1.2
 */
public class EntryRow extends org.gnome.adw.PreferencesRow implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Editable {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwEntryRow";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gnome.adw.PreferencesRow.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gnome.adw.PreferencesRow parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gnome.adw.PreferencesRow(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a EntryRow proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EntryRow(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to EntryRow if its GType is a (or inherits from) "AdwEntryRow".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "EntryRow" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwEntryRow", a ClassCastException will be thrown.
     */
    public static EntryRow castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwEntryRow"))) {
            return new EntryRow(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwEntryRow");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_entry_row_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwEntryRow}.
     */
    public EntryRow() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Adds a prefix widget to {@code self}.
     * @param widget a widget
     */
    public void addPrefix(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.adw_entry_row_add_prefix.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a suffix widget to {@code self}.
     * @param widget a widget
     */
    public void addSuffix(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.adw_entry_row_add_suffix.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets whether activating the embedded entry can activate the default widget.
     * @return whether to activate the default widget
     */
    public boolean getActivatesDefault() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_entry_row_get_activates_default.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets Pango attributes applied to the text of the embedded entry.
     * @return the list of attributes
     */
    public @Nullable org.pango.AttrList getAttributes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_entry_row_get_attributes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrList(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets whether to suggest emoji replacements on {@code self}.
     * @return whether or not emoji completion is enabled
     */
    public boolean getEnableEmojiCompletion() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_entry_row_get_enable_emoji_completion.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the additional input hints of {@code self}.
     * @return The input hints
     */
    public @NotNull org.gtk.gtk.InputHints getInputHints() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_entry_row_get_input_hints.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.InputHints(RESULT);
    }
    
    /**
     * Gets the input purpose of {@code self}.
     * @return the input purpose
     */
    public @NotNull org.gtk.gtk.InputPurpose getInputPurpose() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_entry_row_get_input_purpose.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.InputPurpose(RESULT);
    }
    
    /**
     * Gets whether {@code self} can show the apply button.
     * @return whether to show the apply button
     */
    public boolean getShowApplyButton() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_entry_row_get_show_apply_button.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Removes a child from {@code self}.
     * @param widget the child to be removed
     */
    public void remove(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        try {
            DowncallHandles.adw_entry_row_remove.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether activating the embedded entry can activate the default widget.
     * @param activates whether to activate the default widget
     */
    public void setActivatesDefault(boolean activates) {
        try {
            DowncallHandles.adw_entry_row_set_activates_default.invokeExact(
                    handle(),
                    activates ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets Pango attributes to apply to the text of the embedded entry.
     * <p>
     * The {@code Pango.Attribute}'s {@code start_index} and {@code end_index} must refer to
     * the {@link org.gtk.gtk.EntryBuffer} text, i.e. without the preedit string.
     * @param attributes a list of attributes
     */
    public void setAttributes(@Nullable org.pango.AttrList attributes) {
        try {
            DowncallHandles.adw_entry_row_set_attributes.invokeExact(
                    handle(),
                    (Addressable) (attributes == null ? MemoryAddress.NULL : attributes.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to suggest emoji replacements on {@code self}.
     * <p>
     * Emoji replacement is done with :-delimited names, like {@code :heart:}.
     * @param enableEmojiCompletion Whether emoji completion should be enabled or not
     */
    public void setEnableEmojiCompletion(boolean enableEmojiCompletion) {
        try {
            DowncallHandles.adw_entry_row_set_enable_emoji_completion.invokeExact(
                    handle(),
                    enableEmojiCompletion ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set additional input hints for {@code self}.
     * <p>
     * Input hints allow input methods to fine-tune their behavior.
     * <p>
     * See also: {@code AdwEntryRow:input-purpose}
     * @param hints the hints
     */
    public void setInputHints(@NotNull org.gtk.gtk.InputHints hints) {
        java.util.Objects.requireNonNull(hints, "Parameter 'hints' must not be null");
        try {
            DowncallHandles.adw_entry_row_set_input_hints.invokeExact(
                    handle(),
                    hints.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the input purpose of {@code self}.
     * <p>
     * The input purpose can be used by input methods to adjust their behavior.
     * @param purpose the purpose
     */
    public void setInputPurpose(@NotNull org.gtk.gtk.InputPurpose purpose) {
        java.util.Objects.requireNonNull(purpose, "Parameter 'purpose' must not be null");
        try {
            DowncallHandles.adw_entry_row_set_input_purpose.invokeExact(
                    handle(),
                    purpose.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} can show the apply button.
     * <p>
     * When set to {@code TRUE}, typing text in the entry will reveal an apply button.
     * Clicking it or pressing the &lt;kbd&gt;Enter&lt;/kbd&gt; key will hide the button and
     * emit the {@code EntryRow::apply} signal.
     * <p>
     * This is useful if changing the entry contents can trigger an expensive
     * operation, e.g. network activity, to avoid triggering it after typing every
     * character.
     * @param showApplyButton whether to show the apply button
     */
    public void setShowApplyButton(boolean showApplyButton) {
        try {
            DowncallHandles.adw_entry_row_set_show_apply_button.invokeExact(
                    handle(),
                    showApplyButton ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Apply {
        void signalReceived(EntryRow source);
    }
    
    /**
     * Emitted when the apply button is pressed.
     * <p>
     * See {@code EntryRow:show-apply-button}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EntryRow.Apply> onApply(EntryRow.Apply handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("apply"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EntryRow.Callbacks.class, "signalEntryRowApply",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EntryRow.Apply>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface EntryActivated {
        void signalReceived(EntryRow source);
    }
    
    /**
     * Emitted when the embedded entry is activated.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EntryRow.EntryActivated> onEntryActivated(EntryRow.EntryActivated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("entry-activated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EntryRow.Callbacks.class, "signalEntryRowEntryActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EntryRow.EntryActivated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_entry_row_new = Interop.downcallHandle(
            "adw_entry_row_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_entry_row_add_prefix = Interop.downcallHandle(
            "adw_entry_row_add_prefix",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_entry_row_add_suffix = Interop.downcallHandle(
            "adw_entry_row_add_suffix",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_entry_row_get_activates_default = Interop.downcallHandle(
            "adw_entry_row_get_activates_default",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_entry_row_get_attributes = Interop.downcallHandle(
            "adw_entry_row_get_attributes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_entry_row_get_enable_emoji_completion = Interop.downcallHandle(
            "adw_entry_row_get_enable_emoji_completion",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_entry_row_get_input_hints = Interop.downcallHandle(
            "adw_entry_row_get_input_hints",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_entry_row_get_input_purpose = Interop.downcallHandle(
            "adw_entry_row_get_input_purpose",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_entry_row_get_show_apply_button = Interop.downcallHandle(
            "adw_entry_row_get_show_apply_button",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_entry_row_remove = Interop.downcallHandle(
            "adw_entry_row_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_entry_row_set_activates_default = Interop.downcallHandle(
            "adw_entry_row_set_activates_default",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_entry_row_set_attributes = Interop.downcallHandle(
            "adw_entry_row_set_attributes",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_entry_row_set_enable_emoji_completion = Interop.downcallHandle(
            "adw_entry_row_set_enable_emoji_completion",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_entry_row_set_input_hints = Interop.downcallHandle(
            "adw_entry_row_set_input_hints",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_entry_row_set_input_purpose = Interop.downcallHandle(
            "adw_entry_row_set_input_purpose",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_entry_row_set_show_apply_button = Interop.downcallHandle(
            "adw_entry_row_set_show_apply_button",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalEntryRowApply(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (EntryRow.Apply) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new EntryRow(source, Ownership.UNKNOWN));
        }
        
        public static void signalEntryRowEntryActivated(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (EntryRow.EntryActivated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new EntryRow(source, Ownership.UNKNOWN));
        }
    }
}
