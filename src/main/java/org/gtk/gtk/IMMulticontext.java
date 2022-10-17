package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkIMMulticontext} is an input method context supporting multiple,
 * switchable input methods.
 * <p>
 * Text widgets such as {@code GtkText} or {@code GtkTextView} use a {@code GtkIMMultiContext}
 * to implement their {@code im-module} property for switching between different
 * input methods.
 */
public class IMMulticontext extends IMContext {

    public IMMulticontext(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to IMMulticontext */
    public static IMMulticontext castFrom(org.gtk.gobject.Object gobject) {
        return new IMMulticontext(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_im_multicontext_new = Interop.downcallHandle(
        "gtk_im_multicontext_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_im_multicontext_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkIMMulticontext}.
     */
    public IMMulticontext() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_im_multicontext_get_context_id = Interop.downcallHandle(
        "gtk_im_multicontext_get_context_id",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the id of the currently active delegate of the {@code context}.
     */
    public @NotNull java.lang.String getContextId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_im_multicontext_get_context_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_im_multicontext_set_context_id = Interop.downcallHandle(
        "gtk_im_multicontext_set_context_id",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the context id for {@code context}.
     * <p>
     * This causes the currently active delegate of {@code context} to be
     * replaced by the delegate corresponding to the new context id.
     * <p>
     * Setting this to a non-{@code null} value overrides the system-wide
     * IM module setting. See the {@code Gtk.Settings:gtk-im-module}
     * property.
     */
    public @NotNull void setContextId(@Nullable java.lang.String contextId) {
        try {
            gtk_im_multicontext_set_context_id.invokeExact(handle(), Interop.allocateNativeString(contextId));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
