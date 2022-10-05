package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A page used for empty/error states and similar use-cases.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="status-page-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="status-page.png" alt="status-page"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwStatusPage} widget can have an icon, a title, a description and a
 * custom widget which is displayed below them.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwStatusPage} has a main CSS node with name {@code statuspage}.
 * <p>
 * {@code AdwStatusPage} can use the
 * <a href="style-classes.html#compact-status-page">`.compact`</a> style class for when it
 * needs to fit into a small space such a sidebar or a popover.
 */
public class StatusPage extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public StatusPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to StatusPage */
    public static StatusPage castFrom(org.gtk.gobject.Object gobject) {
        return new StatusPage(gobject.refcounted());
    }
    
    static final MethodHandle adw_status_page_new = Interop.downcallHandle(
        "adw_status_page_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_status_page_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwStatusPage}.
     */
    public StatusPage() {
        super(constructNew());
    }
    
    static final MethodHandle adw_status_page_get_child = Interop.downcallHandle(
        "adw_status_page_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code self}.
     */
    public org.gtk.gtk.Widget getChild() {
        try {
            var RESULT = (MemoryAddress) adw_status_page_get_child.invokeExact(handle());
            return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_status_page_get_description = Interop.downcallHandle(
        "adw_status_page_get_description",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the description for {@code self}.
     */
    public java.lang.String getDescription() {
        try {
            var RESULT = (MemoryAddress) adw_status_page_get_description.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_status_page_get_icon_name = Interop.downcallHandle(
        "adw_status_page_get_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the icon name for {@code self}.
     */
    public java.lang.String getIconName() {
        try {
            var RESULT = (MemoryAddress) adw_status_page_get_icon_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_status_page_get_paintable = Interop.downcallHandle(
        "adw_status_page_get_paintable",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the paintable for {@code self}.
     */
    public org.gtk.gdk.Paintable getPaintable() {
        try {
            var RESULT = (MemoryAddress) adw_status_page_get_paintable.invokeExact(handle());
            return new org.gtk.gdk.Paintable.PaintableImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_status_page_get_title = Interop.downcallHandle(
        "adw_status_page_get_title",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the title for {@code self}.
     */
    public java.lang.String getTitle() {
        try {
            var RESULT = (MemoryAddress) adw_status_page_get_title.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_status_page_set_child = Interop.downcallHandle(
        "adw_status_page_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code self}.
     */
    public void setChild(org.gtk.gtk.Widget child) {
        try {
            adw_status_page_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_status_page_set_description = Interop.downcallHandle(
        "adw_status_page_set_description",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the description for {@code self}.
     */
    public void setDescription(java.lang.String description) {
        try {
            adw_status_page_set_description.invokeExact(handle(), Interop.allocateNativeString(description).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_status_page_set_icon_name = Interop.downcallHandle(
        "adw_status_page_set_icon_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the icon name for {@code self}.
     */
    public void setIconName(java.lang.String iconName) {
        try {
            adw_status_page_set_icon_name.invokeExact(handle(), Interop.allocateNativeString(iconName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_status_page_set_paintable = Interop.downcallHandle(
        "adw_status_page_set_paintable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the paintable for {@code self}.
     */
    public void setPaintable(org.gtk.gdk.Paintable paintable) {
        try {
            adw_status_page_set_paintable.invokeExact(handle(), paintable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_status_page_set_title = Interop.downcallHandle(
        "adw_status_page_set_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the title for {@code self}.
     */
    public void setTitle(java.lang.String title) {
        try {
            adw_status_page_set_title.invokeExact(handle(), Interop.allocateNativeString(title).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
