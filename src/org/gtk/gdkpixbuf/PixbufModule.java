package org.gtk.gdkpixbuf;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GdkPixbufModule` contains the necessary functions to load and save
 * images in a certain file format.
 * 
 * If `GdkPixbuf` has been compiled with `GModule` support, it can be extended
 * by modules which can load (and perhaps also save) new image and animation
 * formats.
 * 
 * ## Implementing modules
 * 
 * The `GdkPixbuf` interfaces needed for implementing modules are contained in
 * `gdk-pixbuf-io.h` (and `gdk-pixbuf-animation.h` if the module supports
 * animations). They are not covered by the same stability guarantees as the
 * regular GdkPixbuf API. To underline this fact, they are protected by the
 * `GDK_PIXBUF_ENABLE_BACKEND` pre-processor symbol.
 * 
 * Each loadable module must contain a `GdkPixbufModuleFillVtableFunc` function
 * named `fill_vtable`, which will get called when the module
 * is loaded and must set the function pointers of the `GdkPixbufModule`.
 * 
 * In order to make format-checking work before actually loading the modules
 * (which may require calling `dlopen` to load image libraries), modules export
 * their signatures (and other information) via the `fill_info` function. An
 * external utility, `gdk-pixbuf-query-loaders`, uses this to create a text
 * file containing a list of all available loaders and  their signatures.
 * This file is then read at runtime by `GdkPixbuf` to obtain the list of
 * available loaders and their signatures.
 * 
 * Modules may only implement a subset of the functionality available via
 * `GdkPixbufModule`. If a particular functionality is not implemented, the
 * `fill_vtable` function will simply not set the corresponding
 * function pointers of the `GdkPixbufModule` structure. If a module supports
 * incremental loading (i.e. provides `begin_load`, `stop_load` and
 * `load_increment`), it doesn't have to implement `load`, since `GdkPixbuf`
 * can supply a generic `load` implementation wrapping the incremental loading.
 * 
 * ## Installing modules
 * 
 * Installing a module is a two-step process:
 * 
 *  - copy the module file(s) to the loader directory (normally
 *    `$libdir/gdk-pixbuf-2.0/$version/loaders`, unless overridden by the
 *    environment variable `GDK_PIXBUF_MODULEDIR`)
 *  - call `gdk-pixbuf-query-loaders` to update the module file (normally
 *    `$libdir/gdk-pixbuf-2.0/$version/loaders.cache`, unless overridden
 *    by the environment variable `GDK_PIXBUF_MODULE_FILE`)
 */
public class PixbufModule extends io.github.jwharm.javagi.interop.ResourceBase {

    public PixbufModule(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
}
