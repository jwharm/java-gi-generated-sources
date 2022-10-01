package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;

/**
 * Defines the type of the function that gets called once the initial
 * setup of {@code pixbuf} is done.
 * <p>
 * {@link PixbufLoader} uses a function of this type to emit the
 * "&lt;link linkend="GdkPixbufLoader-area-prepared">area_prepared</link&gt;"
 * signal.
 */
@FunctionalInterface
public interface PixbufModulePreparedFunc {
        void onPixbufModulePreparedFunc(Pixbuf pixbuf, PixbufAnimation anim);
}
