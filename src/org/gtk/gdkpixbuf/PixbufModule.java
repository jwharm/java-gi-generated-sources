package org.gtk.gdkpixbuf;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GdkPixbufModule</code> contains the necessary functions to load and save
 * images in a certain file format.
 * <p>
 * If <code>GdkPixbuf</code> has been compiled with <code>GModule</code> support, it can be extended
 * by modules which can load (and perhaps also save) new image and animation
 * formats.
 * <p>
 * <h2>Implementing modules</h2>
 * <p>
 * The <code>GdkPixbuf</code> interfaces needed for implementing modules are contained in<code>gdk-pixbuf-io.h</code> (and <code>gdk-pixbuf-animation.h</code> if the module supports
 * animations). They are not covered by the same stability guarantees as the
 * regular GdkPixbuf API. To underline this fact, they are protected by the<code>GDK_PIXBUF_ENABLE_BACKEND</code> pre-processor symbol.
 * <p>
 * Each loadable module must contain a <code>GdkPixbufModuleFillVtableFunc</code> function
 * named <code>fill_vtable</code>, which will get called when the module
 * is loaded and must set the function pointers of the <code>GdkPixbufModule</code>.
 * <p>
 * In order to make format-checking work before actually loading the modules
 * (which may require calling <code>dlopen</code> to load image libraries), modules export
 * their signatures (and other information) via the <code>fill_info</code> function. An
 * external utility, <code>gdk-pixbuf-query-loaders</code>, uses this to create a text
 * file containing a list of all available loaders and  their signatures.
 * This file is then read at runtime by <code>GdkPixbuf</code> to obtain the list of
 * available loaders and their signatures.
 * <p>
 * Modules may only implement a subset of the functionality available via<code>GdkPixbufModule</code>. If a particular functionality is not implemented, the<code>fill_vtable</code> function will simply not set the corresponding
 * function pointers of the <code>GdkPixbufModule</code> structure. If a module supports
 * incremental loading (i.e. provides <code>begin_load</code>, <code>stop_load</code> and<code>load_increment</code>), it doesn&#39;t have to implement <code>load</code>, since <code>GdkPixbuf</code>
 * can supply a generic <code>load</code> implementation wrapping the incremental loading.
 * <p>
 * <h2>Installing modules</h2>
 * <p>
 * Installing a module is a two-step process:
 * <p>
 *  - copy the module file(s) to the loader directory (normally
 *    <code>$libdir/gdk-pixbuf-2.0/$version/loaders</code>, unless overridden by the
 *    environment variable <code>GDK_PIXBUF_MODULEDIR</code>)
 *  - call <code>gdk-pixbuf-query-loaders</code> to update the module file (normally
 *    <code>$libdir/gdk-pixbuf-2.0/$version/loaders.cache</code>, unless overridden
 *    by the environment variable <code>GDK_PIXBUF_MODULE_FILE</code>)
 */
public class PixbufModule extends io.github.jwharm.javagi.ResourceBase {

    public PixbufModule(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
