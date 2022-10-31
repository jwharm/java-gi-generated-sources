package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkLinkButton} is a button with a hyperlink.
 * <p>
 * <img src="./doc-files/link-button.png" alt="An example GtkLinkButton">
 * <p>
 * It is useful to show quick links to resources.
 * <p>
 * A link button is created by calling either {@link LinkButton#LinkButton} or
 * {@link LinkButton#newWithLabel}. If using the former, the URI you
 * pass to the constructor is used as a label for the widget.
 * <p>
 * The URI bound to a {@code GtkLinkButton} can be set specifically using
 * {@link LinkButton#setUri}.
 * <p>
 * By default, {@code GtkLinkButton} calls {@link Gtk#showUri} when the button
 * is clicked. This behaviour can be overridden by connecting to the
 * {@code Gtk.LinkButton::activate-link} signal and returning {@code true} from
 * the signal handler.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkLinkButton} has a single CSS node with name button. To differentiate
 * it from a plain {@code GtkButton}, it gets the .link style class.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkLinkButton} uses the {@link AccessibleRole#LINK} role.
 */
public class LinkButton extends org.gtk.gtk.Button implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkLinkButton";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public LinkButton(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to LinkButton if its GType is a (or inherits from) "GtkLinkButton".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "LinkButton" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkLinkButton", a ClassCastException will be thrown.
     */
    public static LinkButton castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkLinkButton"))) {
            return new LinkButton(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkLinkButton");
        }
    }
    
    private static Refcounted constructNew(@NotNull java.lang.String uri) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_link_button_new.invokeExact(
                    Interop.allocateNativeString(uri)), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkLinkButton} with the URI as its text.
     * @param uri a valid URI
     */
    public LinkButton(@NotNull java.lang.String uri) {
        super(constructNew(uri));
    }
    
    private static Refcounted constructNewWithLabel(@NotNull java.lang.String uri, @Nullable java.lang.String label) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_link_button_new_with_label.invokeExact(
                    Interop.allocateNativeString(uri),
                    (Addressable) (label == null ? MemoryAddress.NULL : Interop.allocateNativeString(label))), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkLinkButton} containing a label.
     * @param uri a valid URI
     * @param label the text of the button
     * @return a new link button widget.
     */
    public static LinkButton newWithLabel(@NotNull java.lang.String uri, @Nullable java.lang.String label) {
        return new LinkButton(constructNewWithLabel(uri, label));
    }
    
    /**
     * Retrieves the URI of the {@code GtkLinkButton}.
     * @return a valid URI. The returned string is owned by the link button
     *   and should not be modified or freed.
     */
    public @NotNull java.lang.String getUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_link_button_get_uri.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves the “visited” state of the {@code GtkLinkButton}.
     * <p>
     * The button becomes visited when it is clicked. If the URI
     * is changed on the button, the “visited” state is unset again.
     * <p>
     * The state may also be changed using {@link LinkButton#setVisited}.
     * @return {@code true} if the link has been visited, {@code false} otherwise
     */
    public boolean getVisited() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_link_button_get_visited.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets {@code uri} as the URI where the {@code GtkLinkButton} points.
     * <p>
     * As a side-effect this unsets the “visited” state of the button.
     * @param uri a valid URI
     */
    public void setUri(@NotNull java.lang.String uri) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        try {
            DowncallHandles.gtk_link_button_set_uri.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the “visited” state of the {@code GtkLinkButton}.
     * <p>
     * See {@link LinkButton#getVisited} for more details.
     * @param visited the new “visited” state
     */
    public void setVisited(boolean visited) {
        try {
            DowncallHandles.gtk_link_button_set_visited.invokeExact(
                    handle(),
                    visited ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateLink {
        boolean signalReceived(LinkButton source);
    }
    
    /**
     * Emitted each time the {@code GtkLinkButton} is clicked.
     * <p>
     * The default handler will call {@link Gtk#showUri} with the URI
     * stored inside the {@code Gtk.LinkButton:uri} property.
     * <p>
     * To override the default behavior, you can connect to the
     * ::activate-link signal and stop the propagation of the signal
     * by returning {@code true} from your handler.
     */
    public Signal<LinkButton.ActivateLink> onActivateLink(LinkButton.ActivateLink handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-link"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(LinkButton.Callbacks.class, "signalLinkButtonActivateLink",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<LinkButton.ActivateLink>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_link_button_new = Interop.downcallHandle(
            "gtk_link_button_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_link_button_new_with_label = Interop.downcallHandle(
            "gtk_link_button_new_with_label",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_link_button_get_uri = Interop.downcallHandle(
            "gtk_link_button_get_uri",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_link_button_get_visited = Interop.downcallHandle(
            "gtk_link_button_get_visited",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_link_button_set_uri = Interop.downcallHandle(
            "gtk_link_button_set_uri",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_link_button_set_visited = Interop.downcallHandle(
            "gtk_link_button_set_visited",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalLinkButtonActivateLink(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (LinkButton.ActivateLink) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new LinkButton(Refcounted.get(source)));
        }
    }
}
