package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkLinkButton} has a single CSS node with name button. To differentiate
 * it from a plain {@code GtkButton}, it gets the .link style class.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkLinkButton} uses the {@link AccessibleRole#LINK} role.
 */
public class LinkButton extends Button implements Accessible, Actionable, Buildable, ConstraintTarget {

    public LinkButton(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to LinkButton */
    public static LinkButton castFrom(org.gtk.gobject.Object gobject) {
        return new LinkButton(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String uri) {
        Reference RESULT = References.get(gtk_h.gtk_link_button_new(Interop.allocateNativeString(uri).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkLinkButton} with the URI as its text.
     */
    public LinkButton(java.lang.String uri) {
        super(constructNew(uri));
    }
    
    private static Reference constructNewWithLabel(java.lang.String uri, java.lang.String label) {
        Reference RESULT = References.get(gtk_h.gtk_link_button_new_with_label(Interop.allocateNativeString(uri).handle(), Interop.allocateNativeString(label).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkLinkButton} containing a label.
     */
    public static LinkButton newWithLabel(java.lang.String uri, java.lang.String label) {
        return new LinkButton(constructNewWithLabel(uri, label));
    }
    
    /**
     * Retrieves the URI of the {@code GtkLinkButton}.
     */
    public java.lang.String getUri() {
        var RESULT = gtk_h.gtk_link_button_get_uri(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the “visited” state of the {@code GtkLinkButton}.
     * <p>
     * The button becomes visited when it is clicked. If the URI
     * is changed on the button, the “visited” state is unset again.
     * <p>
     * The state may also be changed using {@link LinkButton#setVisited}.
     */
    public boolean getVisited() {
        var RESULT = gtk_h.gtk_link_button_get_visited(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets {@code uri} as the URI where the {@code GtkLinkButton} points.
     * <p>
     * As a side-effect this unsets the “visited” state of the button.
     */
    public void setUri(java.lang.String uri) {
        gtk_h.gtk_link_button_set_uri(handle(), Interop.allocateNativeString(uri).handle());
    }
    
    /**
     * Sets the “visited” state of the {@code GtkLinkButton}.
     * <p>
     * See {@link LinkButton#getVisited} for more details.
     */
    public void setVisited(boolean visited) {
        gtk_h.gtk_link_button_set_visited(handle(), visited ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateLinkHandler {
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
    public SignalHandle onActivateLink(ActivateLinkHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("activate-link").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(LinkButton.class, "__signalLinkButtonActivateLink",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean __signalLinkButtonActivateLink(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (LinkButton.ActivateLinkHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new LinkButton(References.get(source)));
    }
    
}
