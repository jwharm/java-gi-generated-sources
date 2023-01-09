package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Renders a pixbuf in a cell
 * <p>
 * A {@code GtkCellRendererPixbuf} can be used to render an image in a cell. It allows
 * to render either a given {@code GdkPixbuf} (set via the
 * {@code GtkCellRendererPixbuf:pixbuf} property) or a named icon (set via the
 * {@code GtkCellRendererPixbuf:icon-name} property).
 * <p>
 * To support the tree view, {@code GtkCellRendererPixbuf} also supports rendering two
 * alternative pixbufs, when the {@code GtkCellRenderer:is-expander} property is {@code true}.
 * If the {@code GtkCellRenderer:is-expanded property} is {@code true} and the
 * {@code GtkCellRendererPixbuf:pixbuf-expander-open} property is set to a pixbuf, it
 * renders that pixbuf, if the {@code GtkCellRenderer:is-expanded} property is {@code false}
 * and the {@code GtkCellRendererPixbuf:pixbuf-expander-closed} property is set to a
 * pixbuf, it renders that one.
 */
public class CellRendererPixbuf extends org.gtk.gtk.CellRenderer {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRendererPixbuf";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CellRendererPixbuf proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CellRendererPixbuf(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellRendererPixbuf> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CellRendererPixbuf(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_renderer_pixbuf_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellRendererPixbuf}. Adjust rendering
     * parameters using object properties. Object properties can be set
     * globally (with g_object_set()). Also, with {@code GtkTreeViewColumn}, you
     * can bind a property to a value in a {@code GtkTreeModel}. For example, you
     * can bind the “pixbuf” property on the cell renderer to a pixbuf value
     * in the model, thus rendering a different image in each row of the
     * {@code GtkTreeView}.
     */
    public CellRendererPixbuf() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_cell_renderer_pixbuf_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link CellRendererPixbuf.Builder} object constructs a {@link CellRendererPixbuf} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CellRendererPixbuf.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.CellRenderer.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CellRendererPixbuf} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CellRendererPixbuf}.
         * @return A new instance of {@code CellRendererPixbuf} with the properties 
         *         that were set in the Builder object.
         */
        public CellRendererPixbuf build() {
            return (CellRendererPixbuf) org.gtk.gobject.GObject.newWithProperties(
                CellRendererPixbuf.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The GIcon representing the icon to display.
         * If the icon theme is changed, the image will be updated
         * automatically.
         * @param gicon The value for the {@code gicon} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGicon(org.gtk.gio.Icon gicon) {
            names.add("gicon");
            values.add(org.gtk.gobject.Value.create(gicon));
            return this;
        }
        
        /**
         * The name of the themed icon to display.
         * This property only has an effect if not overridden by the "pixbuf" property.
         * @param iconName The value for the {@code icon-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIconName(java.lang.String iconName) {
            names.add("icon-name");
            values.add(org.gtk.gobject.Value.create(iconName));
            return this;
        }
        
        /**
         * The {@code GtkIconSize} value that specifies the size of the rendered icon.
         * @param iconSize The value for the {@code icon-size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIconSize(org.gtk.gtk.IconSize iconSize) {
            names.add("icon-size");
            values.add(org.gtk.gobject.Value.create(iconSize));
            return this;
        }
        
        public Builder setPixbuf(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
            names.add("pixbuf");
            values.add(org.gtk.gobject.Value.create(pixbuf));
            return this;
        }
        
        public Builder setPixbufExpanderClosed(org.gtk.gdkpixbuf.Pixbuf pixbufExpanderClosed) {
            names.add("pixbuf-expander-closed");
            values.add(org.gtk.gobject.Value.create(pixbufExpanderClosed));
            return this;
        }
        
        public Builder setPixbufExpanderOpen(org.gtk.gdkpixbuf.Pixbuf pixbufExpanderOpen) {
            names.add("pixbuf-expander-open");
            values.add(org.gtk.gobject.Value.create(pixbufExpanderOpen));
            return this;
        }
        
        public Builder setTexture(org.gtk.gdk.Texture texture) {
            names.add("texture");
            values.add(org.gtk.gobject.Value.create(texture));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_renderer_pixbuf_new = Interop.downcallHandle(
                "gtk_cell_renderer_pixbuf_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_cell_renderer_pixbuf_get_type = Interop.downcallHandle(
                "gtk_cell_renderer_pixbuf_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_cell_renderer_pixbuf_get_type != null;
    }
}
