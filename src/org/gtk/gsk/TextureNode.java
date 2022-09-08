package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a `GdkTexture`.
 */
public class TextureNode extends RenderNode {

    public TextureNode(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TextureNode */
    public static TextureNode castFrom(org.gtk.gobject.Object gobject) {
        return new TextureNode(gobject.getReference());
    }
    
    /**
     * Creates a `GskRenderNode` that will render the given
     * @texture into the area given by @bounds.
     */
    public TextureNode(org.gtk.gdk.Texture texture, org.gtk.graphene.Rect bounds) {
        super(References.get(gtk_h.gsk_texture_node_new(texture.handle(), bounds.handle()), true));
    }
    
    /**
     * Retrieves the `GdkTexture` used when creating this `GskRenderNode`.
     */
    public org.gtk.gdk.Texture getTexture() {
        var RESULT = gtk_h.gsk_texture_node_get_texture(handle());
        return new org.gtk.gdk.Texture(References.get(RESULT, false));
    }
    
}
