package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A dialog presenting a message or a question.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="message-dialog-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="message-dialog.png" alt="message-dialog"&gt;
 * &lt;/picture&gt;
 * <p>
 * Message dialogs have a heading, a body, an optional child widget, and one or
 * multiple responses, each presented as a button.
 * <p>
 * Each response has a unique string ID, and a button label. Additionally, each
 * response can be enabled or disabled, and can have a suggested or destructive
 * appearance.
 * <p>
 * When one of the responses is activated, or the dialog is closed, the
 * {@code MessageDialog::response} signal will be emitted. This signal is
 * detailed, and the detail, as well as the {@code response} parameter will be set to
 * the ID of the activated response, or to the value of the
 * {@code MessageDialog:close-response} property if the dialog had been
 * closed without activating any of the responses.
 * <p>
 * Response buttons can be presented horizontally or vertically depending on
 * available space.
 * <p>
 * When a response is activated, {@code AdwMessageDialog} is closed automatically.
 * <p>
 * An example of using a message dialog:
 * <pre>{@code c
 * GtkWidget *dialog;
 * 
 * dialog = adw_message_dialog_new (parent, _("Replace File?"), NULL);
 * 
 * adw_message_dialog_format_body (ADW_MESSAGE_DIALOG (dialog),
 *                                 _("A file named “%s” already exists. Do you want to replace it?"),
 *                                 filename);
 * 
 * adw_message_dialog_add_responses (ADW_MESSAGE_DIALOG (dialog),
 *                                   "cancel",  _("_Cancel"),
 *                                   "replace", _("_Replace"),
 *                                   NULL);
 * 
 * adw_message_dialog_set_response_appearance (ADW_MESSAGE_DIALOG (dialog), "replace", ADW_RESPONSE_DESTRUCTIVE);
 * 
 * adw_message_dialog_set_default_response (ADW_MESSAGE_DIALOG (dialog), "cancel");
 * adw_message_dialog_set_close_response (ADW_MESSAGE_DIALOG (dialog), "cancel");
 * 
 * g_signal_connect (dialog, "response", G_CALLBACK (response_cb), self);
 * 
 * gtk_window_present (GTK_WINDOW (dialog));
 * }</pre>
 * <p>
 * <strong>AdwMessageDialog as GtkBuildable</strong><br/>
 * {@code AdwMessageDialog} supports adding responses in UI definitions by via the
 * {@code <responses>} element that may contain multiple {@code <response>} elements, each
 * respresenting a response.
 * <p>
 * Each of the {@code <response>} elements must have the {@code id} attribute specifying the
 * response ID. The contents of the element are used as the response label.
 * <p>
 * Response labels can be translated with the usual {@code translatable}, {@code context}
 * and {@code comments} attributes.
 * <p>
 * The {@code <response>} elements can also have {@code enabled} and/or {@code appearance}
 * attributes. See {@code MessageDialog#setResponseEnabled} and
 * {@code MessageDialog#setResponseAppearance} for details.
 * <p>
 * Example of an {@code AdwMessageDialog} UI definition:
 * <pre>{@code xml
 * <object class="AdwMessageDialog" id="dialog">
 *   <property name="heading" translatable="yes">Save Changes?</property>
 *   <property name="body" translatable="yes">Open documents contain unsaved changes. Changes which are not saved will be permanently lost.</property>
 *   <property name="default-response">save</property>
 *   <property name="close-response">cancel</property>
 *   <signal name="response" handler="response_cb"/>
 *   <responses>
 *     <response id="cancel" translatable="yes">_Cancel</response>
 *     <response id="discard" translatable="yes" appearance="destructive">_Discard</response>
 *     <response id="save" translatable="yes" appearance="suggested" enabled="false">_Save</response>
 *   </responses>
 * </object>
 * }</pre>
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code AdwMessageDialog} uses the {@code GTK_ACCESSIBLE_ROLE_DIALOG} role.
 * @version 1.2
 */
public class MessageDialog extends org.gtk.gtk.Window implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwMessageDialog";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Window.getMemoryLayout().withName("parent_instance")
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
     * Create a MessageDialog proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MessageDialog(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to MessageDialog if its GType is a (or inherits from) "AdwMessageDialog".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code MessageDialog} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwMessageDialog", a ClassCastException will be thrown.
     */
    public static MessageDialog castFrom(org.gtk.gobject.Object gobject) {
            return new MessageDialog(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gtk.Window parent, @Nullable java.lang.String heading, @Nullable java.lang.String body) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_message_dialog_new.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    (Addressable) (heading == null ? MemoryAddress.NULL : Interop.allocateNativeString(heading)),
                    (Addressable) (body == null ? MemoryAddress.NULL : Interop.allocateNativeString(body)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwMessageDialog}.
     * <p>
     * {@code heading} and {@code body} can be set to {@code NULL}. This can be useful if they need to
     * be formatted or use markup. In that case, set them to {@code NULL} and call
     * {@code MessageDialog#formatBody} or similar methods afterwards:
     * <pre>{@code c
     * GtkWidget *dialog;
     * 
     * dialog = adw_message_dialog_new (parent, _("Replace File?"), NULL);
     * adw_message_dialog_format_body (ADW_MESSAGE_DIALOG (dialog),
     *                                 _("A file named “%s” already exists.  Do you want to replace it?"),
     *                                 filename);
     * }</pre>
     * @param parent transient parent
     * @param heading the heading
     * @param body the body text
     */
    public MessageDialog(@Nullable org.gtk.gtk.Window parent, @Nullable java.lang.String heading, @Nullable java.lang.String body) {
        super(constructNew(parent, heading, body), Ownership.NONE);
    }
    
    /**
     * Adds a response with {@code id} and {@code label} to {@code self}.
     * <p>
     * Responses are represented as buttons in the dialog.
     * <p>
     * Response ID must be unique. It will be used in
     * {@code MessageDialog::response} to tell which response had been activated,
     * as well as to inspect and modify the response later.
     * <p>
     * An embedded underline in {@code label} indicates a mnemonic.
     * <p>
     * {@code MessageDialog#setResponseLabel} can be used to change the response
     * label after it had been added.
     * <p>
     * {@code MessageDialog#setResponseEnabled} and
     * {@code MessageDialog#setResponseAppearance} can be used to customize the
     * responses further.
     * @param id the response ID
     * @param label the response label
     */
    public void addResponse(@NotNull java.lang.String id, @NotNull java.lang.String label) {
        java.util.Objects.requireNonNull(id, "Parameter 'id' must not be null");
        java.util.Objects.requireNonNull(label, "Parameter 'label' must not be null");
        try {
            DowncallHandles.adw_message_dialog_add_response.invokeExact(
                    handle(),
                    Interop.allocateNativeString(id),
                    Interop.allocateNativeString(label));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds multiple responses to {@code self}.
     * <p>
     * This is the same as calling {@code MessageDialog#addResponse} repeatedly.
     * The variable argument list should be {@code NULL}-terminated list of response IDs
     * and labels.
     * <p>
     * Example:
     * <pre>{@code c
     * adw_message_dialog_add_responses (dialog,
     *                                   "cancel",  _("_Cancel"),
     *                                   "discard", _("_Discard"),
     *                                   "save",    _("_Save"),
     *                                   NULL);
     * }</pre>
     * @param firstId response id
     * @param varargs label for first response, then more id-label pairs
     */
    public void addResponses(@NotNull java.lang.String firstId, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(firstId, "Parameter 'firstId' must not be null");
        try {
            DowncallHandles.adw_message_dialog_add_responses.invokeExact(
                    handle(),
                    Interop.allocateNativeString(firstId),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the formatted body text of {@code self}.
     * <p>
     * See {@code MessageDialog:body}.
     * @param format the formatted string for the body text
     * @param varargs the parameters to insert into {@code format}
     */
    public void formatBody(@NotNull java.lang.String format, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        try {
            DowncallHandles.adw_message_dialog_format_body.invokeExact(
                    handle(),
                    Interop.allocateNativeString(format),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the formatted body text of {@code self} with Pango markup.
     * <p>
     * The {@code format} is assumed to contain Pango markup.
     * <p>
     * Special XML characters in the {@code printf()} arguments passed to this function
     * will  automatically be escaped as necessary, see
     * {@link org.gtk.glib.GLib#markupPrintfEscaped}.
     * <p>
     * See {@code MessageDialog:body}.
     * @param format the formatted string for the body text with Pango markup
     * @param varargs the parameters to insert into {@code format}
     */
    public void formatBodyMarkup(@NotNull java.lang.String format, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        try {
            DowncallHandles.adw_message_dialog_format_body_markup.invokeExact(
                    handle(),
                    Interop.allocateNativeString(format),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the formatted heading of {@code self}.
     * <p>
     * See {@code MessageDialog:heading}.
     * @param format the formatted string for the heading
     * @param varargs the parameters to insert into {@code format}
     */
    public void formatHeading(@NotNull java.lang.String format, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        try {
            DowncallHandles.adw_message_dialog_format_heading.invokeExact(
                    handle(),
                    Interop.allocateNativeString(format),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the formatted heading of {@code self} with Pango markup.
     * <p>
     * The {@code format} is assumed to contain Pango markup.
     * <p>
     * Special XML characters in the {@code printf()} arguments passed to this function
     * will automatically be escaped as necessary, see
     * {@link org.gtk.glib.GLib#markupPrintfEscaped}.
     * <p>
     * See {@code MessageDialog:heading}.
     * @param format the formatted string for the heading with Pango markup
     * @param varargs the parameters to insert into {@code format}
     */
    public void formatHeadingMarkup(@NotNull java.lang.String format, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        try {
            DowncallHandles.adw_message_dialog_format_heading_markup.invokeExact(
                    handle(),
                    Interop.allocateNativeString(format),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the body text of {@code self}.
     * @return the body of {@code self}.
     */
    public @NotNull java.lang.String getBody() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_message_dialog_get_body.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether the body text of {@code self} includes Pango markup.
     * @return whether {@code self} uses markup for body text
     */
    public boolean getBodyUseMarkup() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_message_dialog_get_body_use_markup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the ID of the close response of {@code self}.
     * @return the close response ID
     */
    public @NotNull java.lang.String getCloseResponse() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_message_dialog_get_close_response.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the ID of the default response of {@code self}.
     * @return the default response ID
     */
    public @Nullable java.lang.String getDefaultResponse() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_message_dialog_get_default_response.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the child widget of {@code self}.
     * @return the child widget of {@code self}.
     */
    public @Nullable org.gtk.gtk.Widget getExtraChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_message_dialog_get_extra_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the heading of {@code self}.
     * @return the heading of {@code self}.
     */
    public @Nullable java.lang.String getHeading() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_message_dialog_get_heading.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether the heading of {@code self} includes Pango markup.
     * @return whether {@code self} uses markup for heading
     */
    public boolean getHeadingUseMarkup() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_message_dialog_get_heading_use_markup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the appearance of {@code response}.
     * <p>
     * See {@code MessageDialog#setResponseAppearance}.
     * @param response a response ID
     * @return the appearance of {@code response}
     */
    public @NotNull org.gnome.adw.ResponseAppearance getResponseAppearance(@NotNull java.lang.String response) {
        java.util.Objects.requireNonNull(response, "Parameter 'response' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_message_dialog_get_response_appearance.invokeExact(
                    handle(),
                    Interop.allocateNativeString(response));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.ResponseAppearance(RESULT);
    }
    
    /**
     * Gets whether {@code response} is enabled.
     * <p>
     * See {@code MessageDialog#setResponseEnabled}.
     * @param response a response ID
     * @return whether {@code response} is enabled
     */
    public boolean getResponseEnabled(@NotNull java.lang.String response) {
        java.util.Objects.requireNonNull(response, "Parameter 'response' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_message_dialog_get_response_enabled.invokeExact(
                    handle(),
                    Interop.allocateNativeString(response));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the label of {@code response}.
     * <p>
     * See {@code MessageDialog#setResponseLabel}.
     * @param response a response ID
     * @return the label of {@code response}
     */
    public @NotNull java.lang.String getResponseLabel(@NotNull java.lang.String response) {
        java.util.Objects.requireNonNull(response, "Parameter 'response' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_message_dialog_get_response_label.invokeExact(
                    handle(),
                    Interop.allocateNativeString(response));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether {@code self} has a response with the ID {@code response}.
     * @param response response ID
     * @return whether {@code self} has a response with the ID {@code response}.
     */
    public boolean hasResponse(@NotNull java.lang.String response) {
        java.util.Objects.requireNonNull(response, "Parameter 'response' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_message_dialog_has_response.invokeExact(
                    handle(),
                    Interop.allocateNativeString(response));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Emits the {@code MessageDialog::response} signal with the given response ID.
     * <p>
     * Used to indicate that the user has responded to the dialog in some way.
     * @param response response ID
     */
    public void response(@NotNull java.lang.String response) {
        java.util.Objects.requireNonNull(response, "Parameter 'response' must not be null");
        try {
            DowncallHandles.adw_message_dialog_response.invokeExact(
                    handle(),
                    Interop.allocateNativeString(response));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the body text of {@code self}.
     * @param body the body of {@code self}
     */
    public void setBody(@NotNull java.lang.String body) {
        java.util.Objects.requireNonNull(body, "Parameter 'body' must not be null");
        try {
            DowncallHandles.adw_message_dialog_set_body.invokeExact(
                    handle(),
                    Interop.allocateNativeString(body));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the body text of {@code self} includes Pango markup.
     * <p>
     * See {@link org.pango.Pango#parseMarkup}.
     * @param useMarkup whether to use markup for body text
     */
    public void setBodyUseMarkup(boolean useMarkup) {
        try {
            DowncallHandles.adw_message_dialog_set_body_use_markup.invokeExact(
                    handle(),
                    useMarkup ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the ID of the close response of {@code self}.
     * <p>
     * It will be passed to {@code MessageDialog::response} if the window is
     * closed by pressing &lt;kbd&gt;Escape&lt;/kbd&gt; or with a system action.
     * <p>
     * It doesn't have to correspond to any of the responses in the dialog.
     * <p>
     * The default close response is {@code close}.
     * @param response the close response ID
     */
    public void setCloseResponse(@NotNull java.lang.String response) {
        java.util.Objects.requireNonNull(response, "Parameter 'response' must not be null");
        try {
            DowncallHandles.adw_message_dialog_set_close_response.invokeExact(
                    handle(),
                    Interop.allocateNativeString(response));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the ID of the default response of {@code self}.
     * <p>
     * If set, pressing &lt;kbd&gt;Enter&lt;/kbd&gt; will activate the corresponding button.
     * <p>
     * If set to {@code NULL} or to a non-existent response ID, pressing &lt;kbd&gt;Enter&lt;/kbd&gt;
     * will do nothing.
     * @param response the default response ID
     */
    public void setDefaultResponse(@Nullable java.lang.String response) {
        try {
            DowncallHandles.adw_message_dialog_set_default_response.invokeExact(
                    handle(),
                    (Addressable) (response == null ? MemoryAddress.NULL : Interop.allocateNativeString(response)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the child widget of {@code self}.
     * <p>
     * The child widget is displayed below the heading and body.
     * @param child the child widget
     */
    public void setExtraChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.adw_message_dialog_set_extra_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the heading of {@code self}.
     * @param heading the heading of {@code self}
     */
    public void setHeading(@Nullable java.lang.String heading) {
        try {
            DowncallHandles.adw_message_dialog_set_heading.invokeExact(
                    handle(),
                    (Addressable) (heading == null ? MemoryAddress.NULL : Interop.allocateNativeString(heading)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the heading of {@code self} includes Pango markup.
     * <p>
     * See {@link org.pango.Pango#parseMarkup}.
     * @param useMarkup whether to use markup for heading
     */
    public void setHeadingUseMarkup(boolean useMarkup) {
        try {
            DowncallHandles.adw_message_dialog_set_heading_use_markup.invokeExact(
                    handle(),
                    useMarkup ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the appearance for {@code response}.
     * <p>
     * &lt;picture&gt;
     *   &lt;source srcset="message-dialog-appearance-dark.png" media="(prefers-color-scheme: dark)"&gt;
     *   &lt;img src="message-dialog-appearance.png" alt="message-dialog-appearance"&gt;
     * &lt;/picture&gt;
     * <p>
     * Use {@code ADW_RESPONSE_SUGGESTED} to mark important responses such as the
     * affirmative action, like the Save button in the example.
     * <p>
     * Use {@code ADW_RESPONSE_DESTRUCTIVE} to draw attention to the potentially damaging
     * consequences of using {@code response}. This appearance acts as a warning to the
     * user. The Discard button in the example is using this appearance.
     * <p>
     * The default appearance is {@code ADW_RESPONSE_DEFAULT}.
     * <p>
     * Negative responses like Cancel or Close should use the default appearance.
     * @param response a response ID
     * @param appearance appearance for {@code response}
     */
    public void setResponseAppearance(@NotNull java.lang.String response, @NotNull org.gnome.adw.ResponseAppearance appearance) {
        java.util.Objects.requireNonNull(response, "Parameter 'response' must not be null");
        java.util.Objects.requireNonNull(appearance, "Parameter 'appearance' must not be null");
        try {
            DowncallHandles.adw_message_dialog_set_response_appearance.invokeExact(
                    handle(),
                    Interop.allocateNativeString(response),
                    appearance.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code response} is enabled.
     * <p>
     * If {@code response} is not enabled, the corresponding button will have
     * {@code Gtk.Widget:sensitive} set to {@code FALSE} and it can't be activated as
     * a default response.
     * <p>
     * {@code response} can still be used as {@code MessageDialog:close-response} while
     * it's not enabled.
     * <p>
     * Responses are enabled by default.
     * @param response a response ID
     * @param enabled whether to enable {@code response}
     */
    public void setResponseEnabled(@NotNull java.lang.String response, boolean enabled) {
        java.util.Objects.requireNonNull(response, "Parameter 'response' must not be null");
        try {
            DowncallHandles.adw_message_dialog_set_response_enabled.invokeExact(
                    handle(),
                    Interop.allocateNativeString(response),
                    enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the label of {@code response} to {@code label}.
     * <p>
     * Labels are displayed on the dialog buttons. An embedded underline in {@code label}
     * indicates a mnemonic.
     * @param response a response ID
     * @param label the label of {@code response}
     */
    public void setResponseLabel(@NotNull java.lang.String response, @NotNull java.lang.String label) {
        java.util.Objects.requireNonNull(response, "Parameter 'response' must not be null");
        java.util.Objects.requireNonNull(label, "Parameter 'label' must not be null");
        try {
            DowncallHandles.adw_message_dialog_set_response_label.invokeExact(
                    handle(),
                    Interop.allocateNativeString(response),
                    Interop.allocateNativeString(label));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_message_dialog_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Response {
        void signalReceived(MessageDialog source, @NotNull java.lang.String response);
    }
    
    /**
     * This signal is emitted when the dialog is closed.
     * <p>
     * {@code response} will be set to the response ID of the button that had been
     * activated.
     * <p>
     * if the dialog was closed by pressing &lt;kbd&gt;Escape&lt;/kbd&gt; or with a system
     * action, {@code response} will be set to the value of
     * {@code MessageDialog:close-response}.
     * @param detail The signal detail
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<MessageDialog.Response> onResponse(@Nullable String detail, MessageDialog.Response handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("response" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail))),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(MessageDialog.Callbacks.class, "signalMessageDialogResponse",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<MessageDialog.Response>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Window.Build {
        
         /**
         * A {@link MessageDialog.Build} object constructs a {@link MessageDialog} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link MessageDialog} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MessageDialog} using {@link MessageDialog#castFrom}.
         * @return A new instance of {@code MessageDialog} with the properties 
         *         that were set in the Build object.
         */
        public MessageDialog construct() {
            return MessageDialog.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    MessageDialog.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The body text of the dialog.
         * @param body The value for the {@code body} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBody(java.lang.String body) {
            names.add("body");
            values.add(org.gtk.gobject.Value.create(body));
            return this;
        }
        
        /**
         * Whether the body text includes Pango markup.
         * <p>
         * See {@link org.pango.Pango#parseMarkup}.
         * @param bodyUseMarkup The value for the {@code body-use-markup} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBodyUseMarkup(boolean bodyUseMarkup) {
            names.add("body-use-markup");
            values.add(org.gtk.gobject.Value.create(bodyUseMarkup));
            return this;
        }
        
        /**
         * The ID of the close response.
         * <p>
         * It will be passed to {@code MessageDialog::response} if the window is
         * closed by pressing &lt;kbd&gt;Escape&lt;/kbd&gt; or with a system action.
         * <p>
         * It doesn't have to correspond to any of the responses in the dialog.
         * <p>
         * The default close response is {@code close}.
         * @param closeResponse The value for the {@code close-response} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCloseResponse(java.lang.String closeResponse) {
            names.add("close-response");
            values.add(org.gtk.gobject.Value.create(closeResponse));
            return this;
        }
        
        /**
         * The response ID of the default response.
         * <p>
         * If set, pressing &lt;kbd&gt;Enter&lt;/kbd&gt; will activate the corresponding button.
         * <p>
         * If set to {@code NULL} or a non-existent response ID, pressing &lt;kbd&gt;Enter&lt;/kbd&gt;
         * will do nothing.
         * @param defaultResponse The value for the {@code default-response} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDefaultResponse(java.lang.String defaultResponse) {
            names.add("default-response");
            values.add(org.gtk.gobject.Value.create(defaultResponse));
            return this;
        }
        
        /**
         * The child widget.
         * <p>
         * Displayed below the heading and body.
         * @param extraChild The value for the {@code extra-child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setExtraChild(org.gtk.gtk.Widget extraChild) {
            names.add("extra-child");
            values.add(org.gtk.gobject.Value.create(extraChild));
            return this;
        }
        
        /**
         * The heading of the dialog.
         * @param heading The value for the {@code heading} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHeading(java.lang.String heading) {
            names.add("heading");
            values.add(org.gtk.gobject.Value.create(heading));
            return this;
        }
        
        /**
         * Whether the heading includes Pango markup.
         * <p>
         * See {@link org.pango.Pango#parseMarkup}.
         * @param headingUseMarkup The value for the {@code heading-use-markup} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHeadingUseMarkup(boolean headingUseMarkup) {
            names.add("heading-use-markup");
            values.add(org.gtk.gobject.Value.create(headingUseMarkup));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_message_dialog_new = Interop.downcallHandle(
            "adw_message_dialog_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_add_response = Interop.downcallHandle(
            "adw_message_dialog_add_response",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_add_responses = Interop.downcallHandle(
            "adw_message_dialog_add_responses",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle adw_message_dialog_format_body = Interop.downcallHandle(
            "adw_message_dialog_format_body",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle adw_message_dialog_format_body_markup = Interop.downcallHandle(
            "adw_message_dialog_format_body_markup",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle adw_message_dialog_format_heading = Interop.downcallHandle(
            "adw_message_dialog_format_heading",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle adw_message_dialog_format_heading_markup = Interop.downcallHandle(
            "adw_message_dialog_format_heading_markup",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle adw_message_dialog_get_body = Interop.downcallHandle(
            "adw_message_dialog_get_body",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_get_body_use_markup = Interop.downcallHandle(
            "adw_message_dialog_get_body_use_markup",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_get_close_response = Interop.downcallHandle(
            "adw_message_dialog_get_close_response",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_get_default_response = Interop.downcallHandle(
            "adw_message_dialog_get_default_response",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_get_extra_child = Interop.downcallHandle(
            "adw_message_dialog_get_extra_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_get_heading = Interop.downcallHandle(
            "adw_message_dialog_get_heading",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_get_heading_use_markup = Interop.downcallHandle(
            "adw_message_dialog_get_heading_use_markup",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_get_response_appearance = Interop.downcallHandle(
            "adw_message_dialog_get_response_appearance",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_get_response_enabled = Interop.downcallHandle(
            "adw_message_dialog_get_response_enabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_get_response_label = Interop.downcallHandle(
            "adw_message_dialog_get_response_label",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_has_response = Interop.downcallHandle(
            "adw_message_dialog_has_response",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_response = Interop.downcallHandle(
            "adw_message_dialog_response",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_set_body = Interop.downcallHandle(
            "adw_message_dialog_set_body",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_set_body_use_markup = Interop.downcallHandle(
            "adw_message_dialog_set_body_use_markup",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_message_dialog_set_close_response = Interop.downcallHandle(
            "adw_message_dialog_set_close_response",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_set_default_response = Interop.downcallHandle(
            "adw_message_dialog_set_default_response",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_set_extra_child = Interop.downcallHandle(
            "adw_message_dialog_set_extra_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_set_heading = Interop.downcallHandle(
            "adw_message_dialog_set_heading",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_set_heading_use_markup = Interop.downcallHandle(
            "adw_message_dialog_set_heading_use_markup",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_message_dialog_set_response_appearance = Interop.downcallHandle(
            "adw_message_dialog_set_response_appearance",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_message_dialog_set_response_enabled = Interop.downcallHandle(
            "adw_message_dialog_set_response_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_message_dialog_set_response_label = Interop.downcallHandle(
            "adw_message_dialog_set_response_label",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_message_dialog_get_type = Interop.downcallHandle(
            "adw_message_dialog_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalMessageDialogResponse(MemoryAddress source, MemoryAddress response, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (MessageDialog.Response) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new MessageDialog(source, Ownership.NONE), Interop.getStringFrom(response));
        }
    }
}
