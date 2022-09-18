package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkLinkButton</code> is a button with a hyperlink.
 * <p>
 * !{@link [An example GtkLinkButton]}(link-button.png)
 * <p>
 * It is useful to show quick links to resources.
 * <p>
 * A link button is created by calling either {@link [ctor@Gtk.LinkButton.new] (ref=ctor)} or
 * {@link [ctor@Gtk.LinkButton.new_with_label] (ref=ctor)}. If using the former, the URI you
 * pass to the constructor is used as a label for the widget.
 * <p>
 * The URI bound to a <code>GtkLinkButton</code> can be set specifically using
 * {@link org.gtk.gtk.LinkButton<code>#setUri</code> .
 * <p>
 * By default, <code>GtkLinkButton</code> calls {@link Gtk<code>#showUri</code>  when the button
 * is clicked. This behaviour can be overridden by connecting to the
 * {@link [signal@Gtk.LinkButton::activate-link] (ref=signal)} signal and returning <code>true</code> from
 * the signal handler.
 * <p>
 * <h1>CSS nodes</h1>
 * <p><code>GtkLinkButton</code> has a single CSS node with name button. To differentiate
 * it from a plain <code>GtkButton</code>, it gets the .link style class.
 * <p>
 * <h1>Accessibility</h1>
 * <p><code>GtkLinkButton</code> uses the {@link org.gtk.gtk.AccessibleRole<code>#LINK</code>  role.
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
     * Creates a new <code>GtkLinkButton</code> with the URI as its text.
     */
    public LinkButton(java.lang.String uri) {
        super(constructNew(uri));
    }
    
    private static Reference constructNewWithLabel(java.lang.String uri, java.lang.String label) {
        Reference RESULT = References.get(gtk_h.gtk_link_button_new_with_label(Interop.allocateNativeString(uri).handle(), Interop.allocateNativeString(label).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkLinkButton</code> containing a label.
     */
    public static LinkButton newWithLabel(java.lang.String uri, java.lang.String label) {
        return new LinkButton(constructNewWithLabel(uri, label));
    }
    
    /**
     * Retrieves the URI of the <code>GtkLinkButton</code>.
     */
    public java.lang.String getUri() {
        var RESULT = gtk_h.gtk_link_button_get_uri(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the &<code>#8220</code> visited&<code>#8221</code>  state of the <code>GtkLinkButton</code>.
     * 
     * The button becomes visited when it is clicked. If the URI
     * is changed on the button, the &<code>#8220</code> visited&<code>#8221</code>  state is unset again.
     * 
     * The state may also be changed using {@link org.gtk.gtk.LinkButton<code>#setVisited</code> .
     */
    public boolean getVisited() {
        var RESULT = gtk_h.gtk_link_button_get_visited(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets @uri as the URI where the <code>GtkLinkButton</code> points.
     * 
     * As a side-effect this unsets the &<code>#8220</code> visited&<code>#8221</code>  state of the button.
     */
    public void setUri(java.lang.String uri) {
        gtk_h.gtk_link_button_set_uri(handle(), Interop.allocateNativeString(uri).handle());
    }
    
    /**
     * Sets the &<code>#8220</code> visited&<code>#8221</code>  state of the <code>GtkLinkButton</code>.
     * 
     * See {@link org.gtk.gtk.LinkButton<code>#getVisited</code>  for more details.
     */
    public void setVisited(boolean visited) {
        gtk_h.gtk_link_button_set_visited(handle(), visited ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateLinkHandler {
        boolean signalReceived(LinkButton source);
    }
    
    /**
     * Emitted each time the <code>GtkLinkButton</code> is clicked.
     * 
     * The default handler will call {@link Gtk<code>#showUri</code>  with the URI
     * stored inside the {@link [property@Gtk.LinkButton:uri] (ref=property)} property.
     * 
     * To override the default behavior, you can connect to the
     * ::activate-link signal and stop the propagation of the signal
     * by returning <code>true</code> from your handler.
     */
    public SignalHandle onActivateLink(ActivateLinkHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalLinkButtonActivateLink", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate-link").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
