package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of the function that gets called once the initial
 * setup of {@code pixbuf} is done.
 * <p>
 * {@link PixbufLoader} uses a function of this type to emit the
 * "&lt;link linkend="GdkPixbufLoader-area-prepared"&gt;area_prepared&lt;/link&gt;"
 * signal.
 * @version 2.2
 */
@FunctionalInterface
public interface PixbufModulePreparedFunc {
        void onPixbufModulePreparedFunc(@NotNull org.gtk.gdkpixbuf.Pixbuf pixbuf, @NotNull org.gtk.gdkpixbuf.PixbufAnimation anim);
}
