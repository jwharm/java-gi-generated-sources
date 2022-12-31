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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a LinkButton proxy instance for the provided memory address.
     * <p>
     * Because LinkButton is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected LinkButton(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, LinkButton> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new LinkButton(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String uri) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_link_button_new.invokeExact(
                    Marshal.stringToAddress.marshal(uri, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkLinkButton} with the URI as its text.
     * @param uri a valid URI
     */
    public LinkButton(java.lang.String uri) {
        super(constructNew(uri), Ownership.NONE);
    }
    
    private static MemoryAddress constructNewWithLabel(java.lang.String uri, @Nullable java.lang.String label) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_link_button_new_with_label.invokeExact(
                    Marshal.stringToAddress.marshal(uri, null),
                    (Addressable) (label == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(label, null)));
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
    public static LinkButton newWithLabel(java.lang.String uri, @Nullable java.lang.String label) {
        var RESULT = constructNewWithLabel(uri, label);
        return (org.gtk.gtk.LinkButton) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.LinkButton.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the URI of the {@code GtkLinkButton}.
     * @return a valid URI. The returned string is owned by the link button
     *   and should not be modified or freed.
     */
    public java.lang.String getUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_link_button_get_uri.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets {@code uri} as the URI where the {@code GtkLinkButton} points.
     * <p>
     * As a side-effect this unsets the “visited” state of the button.
     * @param uri a valid URI
     */
    public void setUri(java.lang.String uri) {
        try {
            DowncallHandles.gtk_link_button_set_uri.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(uri, null));
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
                    Marshal.booleanToInteger.marshal(visited, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_link_button_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ActivateLink {
        boolean run();

        @ApiStatus.Internal default int upcall(MemoryAddress sourceLinkButton) {
            var RESULT = run();
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ActivateLink.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<LinkButton.ActivateLink> onActivateLink(LinkButton.ActivateLink handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate-link"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link LinkButton.Builder} object constructs a {@link LinkButton} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link LinkButton.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Button.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link LinkButton} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link LinkButton}.
         * @return A new instance of {@code LinkButton} with the properties 
         *         that were set in the Builder object.
         */
        public LinkButton build() {
            return (LinkButton) org.gtk.gobject.GObject.newWithProperties(
                LinkButton.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The URI bound to this button.
         * @param uri The value for the {@code uri} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUri(java.lang.String uri) {
            names.add("uri");
            values.add(org.gtk.gobject.Value.create(uri));
            return this;
        }
        
        /**
         * The 'visited' state of this button.
         * <p>
         * A visited link is drawn in a different color.
         * @param visited The value for the {@code visited} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVisited(boolean visited) {
            names.add("visited");
            values.add(org.gtk.gobject.Value.create(visited));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_link_button_new = Interop.downcallHandle(
            "gtk_link_button_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_link_button_new_with_label = Interop.downcallHandle(
            "gtk_link_button_new_with_label",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_link_button_get_uri = Interop.downcallHandle(
            "gtk_link_button_get_uri",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_link_button_get_visited = Interop.downcallHandle(
            "gtk_link_button_get_visited",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_link_button_set_uri = Interop.downcallHandle(
            "gtk_link_button_set_uri",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_link_button_set_visited = Interop.downcallHandle(
            "gtk_link_button_set_visited",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_link_button_get_type = Interop.downcallHandle(
            "gtk_link_button_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
