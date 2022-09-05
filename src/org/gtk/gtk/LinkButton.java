package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkLinkButton` is a button with a hyperlink.
 * 
 * ![An example GtkLinkButton](link-button.png)
 * 
 * It is useful to show quick links to resources.
 * 
 * A link button is created by calling either [ctor@Gtk.LinkButton.new] or
 * [ctor@Gtk.LinkButton.new_with_label]. If using the former, the URI you
 * pass to the constructor is used as a label for the widget.
 * 
 * The URI bound to a `GtkLinkButton` can be set specifically using
 * [method@Gtk.LinkButton.set_uri].
 * 
 * By default, `GtkLinkButton` calls [func@Gtk.show_uri] when the button
 * is clicked. This behaviour can be overridden by connecting to the
 * [signal@Gtk.LinkButton::activate-link] signal and returning %TRUE from
 * the signal handler.
 * 
 * # CSS nodes
 * 
 * `GtkLinkButton` has a single CSS node with name button. To differentiate
 * it from a plain `GtkButton`, it gets the .link style class.
 * 
 * # Accessibility
 * 
 * `GtkLinkButton` uses the %GTK_ACCESSIBLE_ROLE_LINK role.
 */
public class LinkButton extends Button implements Accessible, Actionable, Buildable, ConstraintTarget {

    public LinkButton(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to LinkButton */
    public static LinkButton castFrom(org.gtk.gobject.Object gobject) {
        return new LinkButton(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkLinkButton` with the URI as its text.
     */
    public LinkButton(java.lang.String uri) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_link_button_new(Interop.getAllocator().allocateUtf8String(uri)), false));
    }
    
    /**
     * Creates a new `GtkLinkButton` containing a label.
     */
    public LinkButton(java.lang.String uri, java.lang.String label) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_link_button_new_with_label(Interop.getAllocator().allocateUtf8String(uri), Interop.getAllocator().allocateUtf8String(label)), false));
    }
    
    /**
     * Retrieves the URI of the `GtkLinkButton`.
     */
    public java.lang.String getUri() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_link_button_get_uri(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the “visited” state of the `GtkLinkButton`.
     * 
     * The button becomes visited when it is clicked. If the URI
     * is changed on the button, the “visited” state is unset again.
     * 
     * The state may also be changed using [method@Gtk.LinkButton.set_visited].
     */
    public boolean getVisited() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_link_button_get_visited(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets @uri as the URI where the `GtkLinkButton` points.
     * 
     * As a side-effect this unsets the “visited” state of the button.
     */
    public void setUri(java.lang.String uri) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_link_button_set_uri(HANDLE(), Interop.getAllocator().allocateUtf8String(uri));
    }
    
    /**
     * Sets the “visited” state of the `GtkLinkButton`.
     * 
     * See [method@Gtk.LinkButton.get_visited] for more details.
     */
    public void setVisited(boolean visited) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_link_button_set_visited(HANDLE(), visited ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateLinkHandler {
        boolean signalReceived(LinkButton source);
    }
    
    /**
     * Emitted each time the `GtkLinkButton` is clicked.
     * 
     * The default handler will call [func@Gtk.show_uri] with the URI
     * stored inside the [property@Gtk.LinkButton:uri] property.
     * 
     * To override the default behavior, you can connect to the
     * ::activate-link signal and stop the propagation of the signal
     * by returning %TRUE from your handler.
     */
    public void onActivateLink(ActivateLinkHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalLinkButtonActivateLink", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("activate-link"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
