package org.gtk.gdkpixbuf;

/**
 * Defines the type of the function that gets called every time a region
 * of {@code pixbuf} is updated.
 * <p>
 * {@link PixbufLoader} uses a function of this type to emit the
 * "&lt;link linkend="GdkPixbufLoader-area-updated">area_updated</link&gt;"
 * signal.
 */
@FunctionalInterface
public interface PixbufModuleUpdatedFunc {
        void onPixbufModuleUpdatedFunc(Pixbuf pixbuf, int x, int y, int width, int height);
}
