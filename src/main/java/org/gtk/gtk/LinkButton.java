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
 * 
 * <h1>CSS nodes</h1>
 * {@code GtkLinkButton} has a single CSS node with name button. To differentiate
 * it from a plain {@code GtkButton}, it gets the .link style class.
 * 
 * <h1>Accessibility</h1>
 * {@code GtkLinkButton} uses the {@link AccessibleRole#LINK} role.
 */
public class LinkButton extends Button implements Accessible, Actionable, Buildable, ConstraintTarget {

    public LinkButton(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to LinkButton */
    public static LinkButton castFrom(org.gtk.gobject.Object gobject) {
        return new LinkButton(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_link_button_new = Interop.downcallHandle(
        "gtk_link_button_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull java.lang.String uri) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_link_button_new.invokeExact(Interop.allocateNativeString(uri)), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkLinkButton} with the URI as its text.
     */
    public LinkButton(@NotNull java.lang.String uri) {
        super(constructNew(uri));
    }
    
    private static final MethodHandle gtk_link_button_new_with_label = Interop.downcallHandle(
        "gtk_link_button_new_with_label",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithLabel(@NotNull java.lang.String uri, @Nullable java.lang.String label) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_link_button_new_with_label.invokeExact(Interop.allocateNativeString(uri), Interop.allocateNativeString(label)), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkLinkButton} containing a label.
     */
    public static LinkButton newWithLabel(@NotNull java.lang.String uri, @Nullable java.lang.String label) {
        return new LinkButton(constructNewWithLabel(uri, label));
    }
    
    private static final MethodHandle gtk_link_button_get_uri = Interop.downcallHandle(
        "gtk_link_button_get_uri",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the URI of the {@code GtkLinkButton}.
     */
    public @NotNull java.lang.String getUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_link_button_get_uri.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_link_button_get_visited = Interop.downcallHandle(
        "gtk_link_button_get_visited",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the “visited” state of the {@code GtkLinkButton}.
     * <p>
     * The button becomes visited when it is clicked. If the URI
     * is changed on the button, the “visited” state is unset again.
     * <p>
     * The state may also be changed using {@link LinkButton#setVisited}.
     */
    public boolean getVisited() {
        int RESULT;
        try {
            RESULT = (int) gtk_link_button_get_visited.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_link_button_set_uri = Interop.downcallHandle(
        "gtk_link_button_set_uri",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code uri} as the URI where the {@code GtkLinkButton} points.
     * <p>
     * As a side-effect this unsets the “visited” state of the button.
     */
    public @NotNull void setUri(@NotNull java.lang.String uri) {
        try {
            gtk_link_button_set_uri.invokeExact(handle(), Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_link_button_set_visited = Interop.downcallHandle(
        "gtk_link_button_set_visited",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the “visited” state of the {@code GtkLinkButton}.
     * <p>
     * See {@link LinkButton#getVisited} for more details.
     */
    public @NotNull void setVisited(@NotNull boolean visited) {
        try {
            gtk_link_button_set_visited.invokeExact(handle(), visited ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-link"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(LinkButton.Callbacks.class, "signalLinkButtonActivateLink",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static boolean signalLinkButtonActivateLink(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (LinkButton.ActivateLinkHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new LinkButton(Refcounted.get(source)));
        }
        
    }
}
